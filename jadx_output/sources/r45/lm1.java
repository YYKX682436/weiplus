package r45;

/* loaded from: classes.dex */
public class lm1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public lm1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "live_cookies"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.u(6, "object_nonce_id"), com.tencent.mm.protobuf.i.u(7, "battle_id"), com.tencent.mm.protobuf.i.u(8, "finder_username"), com.tencent.mm.protobuf.i.i(9, "battle_mode"), com.tencent.mm.protobuf.i.i(10, "op_code"), com.tencent.mm.protobuf.i.i(11, "battle_scope"), com.tencent.mm.protobuf.i.s(12, "battle_teams", r45.r22.class), com.tencent.mm.protobuf.i.u(13, "request_id"), com.tencent.mm.protobuf.i.i(14, "indicator_type"), com.tencent.mm.protobuf.i.a(15, "indicator_parameter"), com.tencent.mm.protobuf.i.i(16, "battle_duration"), com.tencent.mm.protobuf.i.u(17, "last_battle_id"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 21352;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivebattlewithaudience";
        lVar.f70664a = this;
        lVar.f70665b = new r45.mm1();
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
