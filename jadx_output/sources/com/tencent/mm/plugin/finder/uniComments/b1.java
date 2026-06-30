package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes3.dex */
public final class b1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130204d;

    public b1(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        this.f130204d = textStatusCommentFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130204d;
        textStatusCommentFooter.getEditText().postDelayed(new com.tencent.mm.plugin.finder.uniComments.a1(textStatusCommentFooter), 160L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTextChanged: s?.length：");
        sb6.append(charSequence != null ? java.lang.Integer.valueOf(charSequence.length()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentFooter", sb6.toString());
        if (charSequence != null) {
            int length = charSequence.length();
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130204d;
            if (length < textStatusCommentFooter.getCommentTextLimit() - textStatusCommentFooter.getCommentTextTipsLimit()) {
                android.widget.TextView tvTextCountLimit = textStatusCommentFooter.getTvTextCountLimit();
                if (tvTextCountLimit == null) {
                    return;
                }
                tvTextCountLimit.setVisibility(8);
                return;
            }
            android.widget.TextView tvTextCountLimit2 = textStatusCommentFooter.getTvTextCountLimit();
            if (tvTextCountLimit2 != null) {
                tvTextCountLimit2.setVisibility(0);
            }
            if (charSequence.length() > textStatusCommentFooter.getCommentTextLimit()) {
                android.widget.TextView tvTextCountLimit3 = textStatusCommentFooter.getTvTextCountLimit();
                if (tvTextCountLimit3 != null) {
                    tvTextCountLimit3.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.Red_100));
                }
                android.widget.TextView tvTextCountLimit4 = textStatusCommentFooter.getTvTextCountLimit();
                if (tvTextCountLimit4 == null) {
                    return;
                }
                tvTextCountLimit4.setText(java.lang.String.valueOf(textStatusCommentFooter.getCommentTextLimit() - charSequence.length()));
                return;
            }
            android.widget.TextView tvTextCountLimit5 = textStatusCommentFooter.getTvTextCountLimit();
            if (tvTextCountLimit5 != null) {
                tvTextCountLimit5.setText(java.lang.String.valueOf(textStatusCommentFooter.getCommentTextLimit() - charSequence.length()));
            }
            android.widget.TextView tvTextCountLimit6 = textStatusCommentFooter.getTvTextCountLimit();
            if (tvTextCountLimit6 != null) {
                tvTextCountLimit6.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
        }
    }
}
