package f53;

/* loaded from: classes5.dex */
public final class b0 extends com.tencent.mm.ui.tools.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI, int i17, com.tencent.mm.ui.tools.t4 t4Var) {
        super(i17, t4Var);
        this.f259634h = postCommentDialogUI;
    }

    @Override // com.tencent.mm.ui.tools.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.String valueOf = java.lang.String.valueOf(spanned);
        com.tencent.mm.ui.tools.t4 t4Var = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
        int e17 = com.tencent.mm.ui.tools.v4.e(valueOf, t4Var) + com.tencent.mm.ui.tools.v4.e(source.toString(), t4Var);
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259634h;
        if (e17 > postCommentDialogUI.F) {
            db5.t7.g(postCommentDialogUI.getContext(), postCommentDialogUI.getString(com.tencent.mm.R.string.fq8));
        }
        return source;
    }
}
