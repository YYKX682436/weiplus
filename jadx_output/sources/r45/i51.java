package r45;

/* loaded from: classes.dex */
public class i51 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public i51() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, "identity_scene"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.u(5, "object_nonce_id"), com.tencent.mm.protobuf.i.i(6, com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION), com.tencent.mm.protobuf.i.n(7, "root_comment_id"), com.tencent.mm.protobuf.i.n(8, "ref_comment_id"), com.tencent.mm.protobuf.i.a(9, "last_buffer"), com.tencent.mm.protobuf.i.i(10, "request_scene"), com.tencent.mm.protobuf.i.i(15, "sort_type"), com.tencent.mm.protobuf.i.i(16, "selection_type"), com.tencent.mm.protobuf.i.i(17, ya.b.CONTENT_TYPE));
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
