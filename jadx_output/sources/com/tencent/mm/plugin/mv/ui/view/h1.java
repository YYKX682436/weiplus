package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes5.dex */
public final class h1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter f151839d;

    public h1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter) {
        this.f151839d = musicMvCommentFooter;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return false;
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter = this.f151839d;
        ck5.f b17 = ck5.f.b(musicMvCommentFooter.f151647d);
        b17.f42561f = 0;
        b17.f42560e = 80;
        b17.f42556a = true;
        b17.d(new com.tencent.mm.plugin.mv.ui.view.l1(musicMvCommentFooter));
        return true;
    }
}
