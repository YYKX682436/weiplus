package r45;

/* loaded from: classes2.dex */
public class hq2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public hq2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.r(3, "content", com.tencent.mm.protocal.protobuf.FinderObjectDesc.class), com.tencent.mm.protobuf.i.u(4, com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID), com.tencent.mm.protobuf.i.n(5, "refObjectid"), com.tencent.mm.protobuf.i.u(6, "refObjectNonceId"), com.tencent.mm.protobuf.i.r(7, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.g(8, "longitude"), com.tencent.mm.protobuf.i.g(9, "latitude"), com.tencent.mm.protobuf.i.g(10, "feedLongitude"), com.tencent.mm.protobuf.i.g(11, "feedLatitude"), com.tencent.mm.protobuf.i.i(12, "isCreatedInFinder"), com.tencent.mm.protobuf.i.w(13, "topics"), com.tencent.mm.protobuf.i.i(14, "originalFlag"), com.tencent.mm.protobuf.i.n(15, "likeid"), com.tencent.mm.protobuf.i.w(16, "musicDocId"), com.tencent.mm.protobuf.i.a(17, "eupdOob"), com.tencent.mm.protobuf.i.u(18, "groupId"), com.tencent.mm.protobuf.i.r(20, "attachmentList", r45.lu0.class), com.tencent.mm.protobuf.i.u(21, "groupBgmUrl"), com.tencent.mm.protobuf.i.i(22, "groupPostType"), com.tencent.mm.protobuf.i.i(23, "object_type"), com.tencent.mm.protobuf.i.n(24, "eventTopicId"), com.tencent.mm.protobuf.i.i(25, "waitType"), com.tencent.mm.protobuf.i.i(26, "handle_flag"), com.tencent.mm.protobuf.i.n(28, "postFlag"), com.tencent.mm.protobuf.i.i(29, "post_scene"), com.tencent.mm.protobuf.i.a(30, "sdk_media_feature"), com.tencent.mm.protobuf.i.u(34, "highlight_topic"), com.tencent.mm.protobuf.i.i(36, "tag_type"), com.tencent.mm.protobuf.i.u(37, "tag_sec_key"), com.tencent.mm.protobuf.i.r(38, "newlife_info", r45.zp2.class), com.tencent.mm.protobuf.i.a(39, "finder_secret_data"), com.tencent.mm.protobuf.i.i(40, "no_need_response_info"), com.tencent.mm.protobuf.i.i(41, "post_enter_scene"), com.tencent.mm.protobuf.i.i(42, "comment_scene"), com.tencent.mm.protobuf.i.a(43, "clipbundle_timeline"), com.tencent.mm.protobuf.i.a(44, "clipbundle_json"), com.tencent.mm.protobuf.i.a(45, "effect_create_context"));
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
