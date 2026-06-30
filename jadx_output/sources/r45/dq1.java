package r45;

/* loaded from: classes.dex */
public class dq1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public dq1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "cur_intimacy"), com.tencent.mm.protobuf.i.s(3, "badge_infos", r45.yl1.class), com.tencent.mm.protobuf.i.i(4, "next_level_need_intimacy"), com.tencent.mm.protobuf.i.r(5, "new_rights_info", r45.y22.class), com.tencent.mm.protobuf.i.r(6, "task_progress_info", r45.tk6.class), com.tencent.mm.protobuf.i.u(7, "introduction_url"), com.tencent.mm.protobuf.i.c(8, "notice_reserved"), com.tencent.mm.protobuf.i.c(9, "can_reserve_notice"), com.tencent.mm.protobuf.i.r(10, "all_rights_info", r45.rf1.class), com.tencent.mm.protobuf.i.r(11, "float_msg_info", r45.zp1.class), com.tencent.mm.protobuf.i.r(12, "super_fan_rights_info", r45.bb2.class), com.tencent.mm.protobuf.i.r(13, "cancel_subscription_entrance", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
