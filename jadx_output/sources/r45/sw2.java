package r45;

/* loaded from: classes.dex */
public class sw2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public sw2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.s(2, "stats", r45.vd6.class), com.tencent.mm.protobuf.i.u(3, "finderUsername"), com.tencent.mm.protobuf.i.r(4, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.r(5, "status", r45.dx0.class), com.tencent.mm.protobuf.i.n(7, "clientTimeMs"), com.tencent.mm.protobuf.i.r(8, "megaVideoStatus", r45.qj4.class));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(0);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
