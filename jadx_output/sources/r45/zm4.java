package r45;

/* loaded from: classes.dex */
public class zm4 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public zm4() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "appid"), com.tencent.mm.protobuf.i.n(3, "product_id"), com.tencent.mm.protobuf.i.u(4, "promoter_key"), com.tencent.mm.protobuf.i.n(5, "cps_product_id"), com.tencent.mm.protobuf.i.u(6, "pass_buffer"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4432;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getproducttaglink";
        lVar.f70664a = this;
        lVar.f70665b = new r45.an4();
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
