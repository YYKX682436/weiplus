package r45;

/* loaded from: classes.dex */
public class a92 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public a92() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, "op_type"), com.tencent.mm.protobuf.i.w(4, "sensitive_word"), com.tencent.mm.protobuf.i.u(5, "finder_username"));
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
