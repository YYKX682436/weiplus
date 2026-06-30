package r45;

/* loaded from: classes.dex */
public class ml6 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ml6() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT), com.tencent.mm.protobuf.i.c(3, "is_plain_text"), com.tencent.mm.protobuf.i.c(4, "do_allow_extended_languages"), com.tencent.mm.protobuf.i.c(5, "do_pick_summary_language"), com.tencent.mm.protobuf.i.c(6, "do_remove_weak_matches"), com.tencent.mm.protobuf.i.i(7, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
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
