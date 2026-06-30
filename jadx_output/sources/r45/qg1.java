package r45;

/* loaded from: classes.dex */
public class qg1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public qg1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "anchor_finder_username"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.n(5, "live_id"), com.tencent.mm.protobuf.i.i(6, "op_type"), com.tencent.mm.protobuf.i.a(7, "op_cmd_req_buf"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 10028;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveanchormodpromotejumpinfolist";
        lVar.f70664a = this;
        lVar.f70665b = new r45.rg1();
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
