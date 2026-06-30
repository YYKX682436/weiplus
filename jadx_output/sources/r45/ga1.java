package r45;

/* loaded from: classes2.dex */
public class ga1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ga1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.a(2, "last_buffer"), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.r(4, "subtitle", r45.yx2.class), com.tencent.mm.protobuf.i.n(5, "prefetch_timestamp"));
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
