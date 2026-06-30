package r45;

/* loaded from: classes5.dex */
public class is2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public is2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.i(2, "op_type"), com.tencent.mm.protobuf.i.u(3, "auth_token"), com.tencent.mm.protobuf.i.u(4, "finder_username"), com.tencent.mm.protobuf.i.u(5, "code"), com.tencent.mm.protobuf.i.u(6, "phone_code"), com.tencent.mm.protobuf.i.r(7, "network_identity_auth_info", r45.tt4.class));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 9950;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderrealnameverify";
        lVar.f70664a = this;
        lVar.f70665b = new r45.js2();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
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
