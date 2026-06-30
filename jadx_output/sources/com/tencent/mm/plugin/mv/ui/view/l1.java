package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes5.dex */
public final class l1 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter f151889d;

    public l1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter) {
        this.f151889d = musicMvCommentFooter;
    }

    @Override // ck5.e
    public void R5(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
    }

    @Override // ck5.e
    public void c1(java.lang.String text) {
        com.tencent.mm.plugin.mv.ui.view.f1 f1Var;
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "InputTextBoundaryCheck ok, ready to send, text:".concat(text));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(text);
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter = this.f151889d;
        if (!K0 && (f1Var = musicMvCommentFooter.f151654n) != null) {
            ((com.tencent.mm.plugin.mv.ui.uic.g0) f1Var).a(text, "");
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = musicMvCommentFooter.f151647d;
        kotlin.jvm.internal.o.d(mMEditText);
        mMEditText.setText("");
    }

    @Override // ck5.e
    public void w0(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        db5.e1.i(this.f151889d.getContext(), com.tencent.mm.R.string.f493259jh1, com.tencent.mm.R.string.f493261jh3);
    }
}
