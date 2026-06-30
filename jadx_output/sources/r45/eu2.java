package r45;

/* loaded from: classes.dex */
public class eu2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public eu2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "lastBuff"), com.tencent.mm.protobuf.i.u(4, "query"), com.tencent.mm.protobuf.i.u(5, "finderUsername"));
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
