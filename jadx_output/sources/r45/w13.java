package r45;

/* loaded from: classes2.dex */
public class w13 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public w13() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "contact", com.tencent.mm.protocal.protobuf.FinderContact.class), com.tencent.mm.protobuf.i.i(3, "forbiddenFlag"), com.tencent.mm.protobuf.i.s(4, "objects", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.i(5, "nextDuration"), com.tencent.mm.protobuf.i.i(6, "show_recent_liked_list_entrance"), com.tencent.mm.protobuf.i.r(7, "recent_liked_list_resp", r45.d71.class), com.tencent.mm.protobuf.i.r(8, "interaction_data", r45.u13.class), com.tencent.mm.protobuf.i.s(9, "item", r45.ow6.class), com.tencent.mm.protobuf.i.r(10, "member_qa_data", r45.jk4.class), com.tencent.mm.protobuf.i.r(11, "poi_interaction_info", r45.so2.class), com.tencent.mm.protobuf.i.u(12, "web_url"), com.tencent.mm.protobuf.i.i(13, "friend_follow_count"), com.tencent.mm.protobuf.i.i(14, "original_count"), com.tencent.mm.protobuf.i.r(15, "notice_info", r45.h32.class), com.tencent.mm.protobuf.i.r(16, "next_live_notification_info", r45.c32.class));
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
