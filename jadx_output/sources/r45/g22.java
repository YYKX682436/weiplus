package r45;

/* loaded from: classes.dex */
public class g22 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public g22() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.r(3, "client_status", r45.rn1.class), com.tencent.mm.protobuf.i.s(4, "nav_status", r45.f22.class), com.tencent.mm.protobuf.i.s(5, "enter_status", r45.jp1.class));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11815;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivenavstreamstatus";
        lVar.f70664a = this;
        lVar.f70665b = new r45.h22();
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
