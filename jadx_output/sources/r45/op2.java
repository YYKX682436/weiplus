package r45;

/* loaded from: classes2.dex */
public class op2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public op2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.r(4, "object_desc", com.tencent.mm.protocal.protobuf.FinderObjectDesc.class), com.tencent.mm.protobuf.i.i(5, "object_type"), com.tencent.mm.protobuf.i.u(6, "client_draft_id"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.n(8, "object_id"), com.tencent.mm.protobuf.i.r(9, "attachment_list", r45.lu0.class), com.tencent.mm.protobuf.i.i(10, "handle_flag"), com.tencent.mm.protobuf.i.n(11, "postFlag"), com.tencent.mm.protobuf.i.a(12, "sdk_media_feature"), com.tencent.mm.protobuf.i.a(14, "finder_secret_data"), com.tencent.mm.protobuf.i.r(15, "attach_ext_info", r45.ip2.class));
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
