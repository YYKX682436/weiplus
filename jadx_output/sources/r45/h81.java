package r45;

/* loaded from: classes.dex */
public class h81 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public h81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "tab_list", r45.dd2.class), com.tencent.mm.protobuf.i.r(3, "lbs_info", r45.ky1.class), com.tencent.mm.protobuf.i.i(4, "prefech_min_interval"), com.tencent.mm.protobuf.i.i(5, "prefech_tab_pull_type"), com.tencent.mm.protobuf.i.i(6, "prefech_pre_tab_pull_type"), com.tencent.mm.protobuf.i.i(7, "prefech_next_tab_pull_type"), com.tencent.mm.protobuf.i.u(8, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.i(9, "hide_tabs"), com.tencent.mm.protobuf.i.s(10, "nav_tab_list", r45.dd2.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
