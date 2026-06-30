package r45;

/* loaded from: classes5.dex */
public class g82 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public g82() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.n(5, "live_id"), com.tencent.mm.protobuf.i.u(6, "reward_product_id"), com.tencent.mm.protobuf.i.i(7, "reward_product_count"), com.tencent.mm.protobuf.i.i(8, "reward_amount_in_wecoin"), com.tencent.mm.protobuf.i.u(9, "request_id"), com.tencent.mm.protobuf.i.u(10, "combo_id"), com.tencent.mm.protobuf.i.a(11, "live_cookies"), com.tencent.mm.protobuf.i.c(12, "combo_finish"), com.tencent.mm.protobuf.i.u(13, "to_mic_username"), com.tencent.mm.protobuf.i.u(14, "session_buffer"), com.tencent.mm.protobuf.i.i(15, "reward_type"), com.tencent.mm.protobuf.i.a(16, "reward_ext_info"), com.tencent.mm.protobuf.i.b(19, "prepare_buf"), com.tencent.mm.protobuf.i.u(20, "reward_duration_id"), com.tencent.mm.protobuf.i.u(21, "batch_id"), com.tencent.mm.protobuf.i.u(22, "switch_skin_id"), com.tencent.mm.protobuf.i.s(23, "prepare_buf_infos", r45.c82.class), com.tencent.mm.protobuf.i.u(24, "to_co_author_username"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5891;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivereward";
        lVar.f70664a = this;
        lVar.f70665b = new r45.h82();
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
