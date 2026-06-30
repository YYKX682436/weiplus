package r45;

/* loaded from: classes2.dex */
public class c31 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public c31() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(2, dm.i4.COL_ID), com.tencent.mm.protobuf.i.i(3, "feedback_type"), com.tencent.mm.protobuf.i.i(4, "feedback_sub_type"), com.tencent.mm.protobuf.i.u(5, "objectNonceId"), com.tencent.mm.protobuf.i.r(6, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(7, "sessionBuffer"), com.tencent.mm.protobuf.i.i(8, "live_scene"), com.tencent.mm.protobuf.i.i(9, "source_type"), com.tencent.mm.protobuf.i.s(10, "sub_type_list", r45.qw4.class), com.tencent.mm.protobuf.i.u(11, "export_id"), com.tencent.mm.protobuf.i.i(12, "satisfaction_quest_sub_type"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3912;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderfeedback";
        lVar.f70664a = this;
        lVar.f70665b = new r45.d31();
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
