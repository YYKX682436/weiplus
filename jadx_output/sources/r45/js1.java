package r45;

/* loaded from: classes.dex */
public class js1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public js1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.a(2, "last_buffer"), com.tencent.mm.protobuf.i.i(3, "continue_flag"), com.tencent.mm.protobuf.i.i(4, "member_count"), com.tencent.mm.protobuf.i.s(5, "members", r45.fq1.class), com.tencent.mm.protobuf.i.r(6, "audience_member", r45.fq1.class), com.tencent.mm.protobuf.i.i(7, "intimacy_distance_to_prev_member"), com.tencent.mm.protobuf.i.i(8, "super_fans_count"), com.tencent.mm.protobuf.i.i(9, "audience_current_rank"));
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
