package r45;

/* loaded from: classes5.dex */
public class gb2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public gb2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "live_cookies"), com.tencent.mm.protobuf.i.n(4, "live_id"), com.tencent.mm.protobuf.i.n(5, "object_id"), com.tencent.mm.protobuf.i.u(6, "finder_username"), com.tencent.mm.protobuf.i.u(7, "product_id"), com.tencent.mm.protobuf.i.u(8, "skin_id"), com.tencent.mm.protobuf.i.u(9, "custom_text"), com.tencent.mm.protobuf.i.i(10, "text_op_type"), com.tencent.mm.protobuf.i.c(11, "need_switch_skin"), com.tencent.mm.protobuf.i.i(12, "gift_type"), com.tencent.mm.protobuf.i.w(13, "component_key_list"), com.tencent.mm.protobuf.i.r(14, "upload_img_url", r45.gs5.class));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8655;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveswitchgiftskin";
        lVar.f70664a = this;
        lVar.f70665b = new r45.hb2();
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
