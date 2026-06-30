package r45;

/* loaded from: classes2.dex */
public class a71 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public a71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.r(4, "status", r45.dx0.class), com.tencent.mm.protobuf.i.i(5, "prefetch_type"), com.tencent.mm.protobuf.i.r(6, ya.b.LOCATION, r45.jd1.class), com.tencent.mm.protobuf.i.r(7, "realtime_location", r45.jd1.class), com.tencent.mm.protobuf.i.n(8, "tab_tips_object_id"), com.tencent.mm.protobuf.i.a(9, "tab_tips_by_pass_info"), com.tencent.mm.protobuf.i.i(10, "pull_type"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 16579;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlbsstream";
        lVar.f70664a = this;
        lVar.f70665b = new r45.b71();
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
