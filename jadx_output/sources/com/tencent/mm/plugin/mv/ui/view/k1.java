package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes5.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter f151884d;

    public k1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter) {
        this.f151884d = musicMvCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter = this.f151884d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = musicMvCommentFooter.f151647d;
        if (mMEditText != null) {
            mMEditText.requestFocus();
        }
        android.content.Context context = musicMvCommentFooter.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context).showVKB();
    }
}
