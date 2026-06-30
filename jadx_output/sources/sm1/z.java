package sm1;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f409345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(1);
        this.f409344d = bizCommentFooter;
        this.f409345e = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409344d;
        if (intValue != bizCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String()) {
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter.c(bizCommentFooter);
        }
        this.f409345e.q();
        return jz5.f0.f302826a;
    }
}
