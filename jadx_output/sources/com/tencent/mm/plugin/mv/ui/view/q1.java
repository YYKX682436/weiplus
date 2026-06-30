package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class q1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f151925e;

    public q1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView, boolean z17) {
        this.f151924d = musicMvCommentView;
        this.f151925e = z17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView = this.f151924d;
            g4Var.g(1, musicMvCommentView.getContext().getString(com.tencent.mm.R.string.h3z), 0);
            if (this.f151925e) {
                return;
            }
            g4Var.g(2, musicMvCommentView.getContext().getString(com.tencent.mm.R.string.f492599h40), 0);
        }
    }
}
