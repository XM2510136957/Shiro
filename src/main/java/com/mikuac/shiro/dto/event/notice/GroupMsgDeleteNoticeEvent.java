package com.mikuac.shiro.dto.event.notice;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Created on 2021/7/8.
 *
 * @author Zero
 * @version $Id: $Id
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
public class GroupMsgDeleteNoticeEvent extends NoticeEvent {

    @JSONField(name = "group_id")
    private Long groupId;

    @JSONField(name = "user_id")
    private Long userId;

    @JSONField(name = "operator_id")
    private Long operatorId;

    @JSONField(name = "message_id")
    private Integer messageId;

}
