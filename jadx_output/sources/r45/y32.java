package r45;

/* loaded from: classes.dex */
public class y32 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public y32() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, "op_type"), com.tencent.mm.protobuf.i.u(4, "phone_number"), com.tencent.mm.protobuf.i.u(5, "sms_code"), com.tencent.mm.protobuf.i.u(6, "session_id"), com.tencent.mm.protobuf.i.u(7, "finder_username"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 7625;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivephoneverification";
        lVar.f70664a = this;
        lVar.f70665b = new r45.z32();
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
