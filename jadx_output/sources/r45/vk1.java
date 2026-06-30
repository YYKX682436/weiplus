package r45;

/* loaded from: classes.dex */
public class vk1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public vk1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "live_id"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.u(5, "object_nonce_id"), com.tencent.mm.protobuf.i.u(6, com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID), com.tencent.mm.protobuf.i.a(7, "live_cookies"));
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
