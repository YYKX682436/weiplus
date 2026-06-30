package r45;

/* loaded from: classes.dex */
public class cy0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public cy0() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.i(4, "continue_flag"), com.tencent.mm.protobuf.i.r(5, "preload_info", r45.sq2.class), com.tencent.mm.protobuf.i.i(6, "prefetch_last_feed_count"), com.tencent.mm.protobuf.i.r(8, "wording", r45.dy0.class));
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
