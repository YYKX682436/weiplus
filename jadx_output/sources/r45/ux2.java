package r45;

/* loaded from: classes.dex */
public class ux2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ux2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), com.tencent.mm.protobuf.i.u(4, "tpl_desc_url"), com.tencent.mm.protobuf.i.u(5, "tpl_desc_md5"), com.tencent.mm.protobuf.i.r(6, "tpl_version_info", r45.xy6.class), com.tencent.mm.protobuf.i.u(7, "aigc_task_id"), com.tencent.mm.protobuf.i.u(8, "parent_template_id"), com.tencent.mm.protobuf.i.u(9, "root_template_id"), com.tencent.mm.protobuf.i.u(10, "finder_username"));
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
