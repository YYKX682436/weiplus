package yk4;

/* loaded from: classes3.dex */
public final class p implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462849d;

    public p(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        this.f462849d = tingCommentFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462849d;
        tingCommentFooter.getEditText().postDelayed(new yk4.o(tingCommentFooter), 160L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462849d;
        if (tingCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 2 && i19 == 1) {
            if ((charSequence != null ? charSequence.charAt(i17) : ' ') == '@' && tingCommentFooter.j()) {
                tingCommentFooter.getMentionBtn().performClick();
            }
        }
    }
}
