package sm1;

/* loaded from: classes3.dex */
public final class o implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409329d;

    public o(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409329d = bizCommentFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409329d;
        bizCommentFooter.getEditText().postDelayed(new sm1.n(bizCommentFooter), 160L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409329d;
        if (bizCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 2 && i19 == 1) {
            if ((charSequence != null ? charSequence.charAt(i17) : ' ') == '@' && bizCommentFooter.j()) {
                bizCommentFooter.getMentionBtn().performClick();
            }
        }
    }
}
