package r45;

/* loaded from: classes5.dex */
public class c01 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public c01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.r(3, "metadata", r45.wt4.class), com.tencent.mm.protobuf.i.u(4, "cmd"), com.tencent.mm.protobuf.i.u(5, "template_id"), com.tencent.mm.protobuf.i.u(6, "aigc_service_id"), com.tencent.mm.protobuf.i.r(7, "user_media_file_asset", r45.iw6.class), com.tencent.mm.protobuf.i.u(8, "client_id"), com.tencent.mm.protobuf.i.i(9, "post_enter_scene"), com.tencent.mm.protobuf.i.i(10, "comment_scene"), com.tencent.mm.protobuf.i.r(11, "user_dynamic_param", r45.du0.class), com.tencent.mm.protobuf.i.n(14, "object_id"));
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
