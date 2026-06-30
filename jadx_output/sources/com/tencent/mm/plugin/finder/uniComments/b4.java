package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes3.dex */
public final class b4 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130210d;

    public b4(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter) {
        this.f130210d = uniCommentFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130210d;
        uniCommentFooter.getEditText().postDelayed(new com.tencent.mm.plugin.finder.uniComments.a4(uniCommentFooter), 160L);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
