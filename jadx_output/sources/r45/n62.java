package r45;

/* loaded from: classes.dex */
public class n62 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public n62() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.n(5, "live_id"), com.tencent.mm.protobuf.i.a(6, "live_cookies"), com.tencent.mm.protobuf.i.u(7, "notice_id"), com.tencent.mm.protobuf.i.i(8, "op_scene"), com.tencent.mm.protobuf.i.u(9, "finder_username"), com.tencent.mm.protobuf.i.c(10, "need_page_item"));
        this.__printBytes = true;
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
