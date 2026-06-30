package r45;

/* loaded from: classes2.dex */
public class sy0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public sy0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.n(3, "objectId"), com.tencent.mm.protobuf.i.u(4, "content"), com.tencent.mm.protobuf.i.n(5, "commentId"), com.tencent.mm.protobuf.i.n(6, "replyCommentId"), com.tencent.mm.protobuf.i.u(7, "replyUsername"), com.tencent.mm.protobuf.i.i(8, "opType"), com.tencent.mm.protobuf.i.u(9, com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID), com.tencent.mm.protobuf.i.n(10, "rootCommentId"), com.tencent.mm.protobuf.i.i(11, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(12, "objectNonceId"), com.tencent.mm.protobuf.i.r(13, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(14, "sessionBuffer"), com.tencent.mm.protobuf.i.i(15, "commentScene"), com.tencent.mm.protobuf.i.s(16, "commentMentionedUser", r45.oy0.class), com.tencent.mm.protobuf.i.w(17, "pasted_content"), com.tencent.mm.protobuf.i.u(18, "client_udf_kv"), com.tencent.mm.protobuf.i.i(19, ya.b.CONTENT_TYPE), com.tencent.mm.protobuf.i.r(20, "content_info", r45.e60.class), com.tencent.mm.protobuf.i.s(21, "mentioned_user_list", r45.py0.class), com.tencent.mm.protobuf.i.a(100, "bypass_buffer"), com.tencent.mm.protobuf.i.i(101, "bypass_buffer_type"));
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
