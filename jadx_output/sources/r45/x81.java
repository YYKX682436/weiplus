package r45;

/* loaded from: classes.dex */
public class x81 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public x81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(3, "up_lastbuffer"), com.tencent.mm.protobuf.i.a(4, "down_lastbuffer"), com.tencent.mm.protobuf.i.c(5, "down_continue_flag"), com.tencent.mm.protobuf.i.c(6, "up_continue_flag"), com.tencent.mm.protobuf.i.n(7, "target_object_id"), com.tencent.mm.protobuf.i.r(8, "next_play_info", r45.ht4.class), com.tencent.mm.protobuf.i.u(11, "stream_buffer"), com.tencent.mm.protobuf.i.n(12, "sndsi"));
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
