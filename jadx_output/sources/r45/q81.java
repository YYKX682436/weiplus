package r45;

/* loaded from: classes5.dex */
public class q81 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public q81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.i(2, "my_account_type"), com.tencent.mm.protobuf.i.u(3, "to_username"), com.tencent.mm.protobuf.i.r(4, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(5, "to_fans_id"), com.tencent.mm.protobuf.i.n(6, "to_object_id"), com.tencent.mm.protobuf.i.n(7, "to_comment_id"), com.tencent.mm.protobuf.i.u(8, "to_lottery_id"), com.tencent.mm.protobuf.i.i(9, "source_type"), com.tencent.mm.protobuf.i.c(10, "support_alias"), com.tencent.mm.protobuf.i.n(11, "to_like_id"), com.tencent.mm.protobuf.i.a(12, "live_contact_ext_info"), com.tencent.mm.protobuf.i.u(13, "my_account_username"), com.tencent.mm.protobuf.i.u(14, "toFavId"), com.tencent.mm.protobuf.i.a(16, "mmlisten_bypass_buffer"), com.tencent.mm.protobuf.i.i(18, "userpage_enter_type"), com.tencent.mm.protobuf.i.i(19, "userpage_last_comment_scene"), com.tencent.mm.protobuf.i.n(20, "userpage_from_object_id"));
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
