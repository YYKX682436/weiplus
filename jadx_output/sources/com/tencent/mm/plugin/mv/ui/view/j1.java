package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes5.dex */
public final class j1 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter f151876a;

    public j1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter) {
        this.f151876a = musicMvCommentFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter;
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (mMEditText = (musicMvCommentFooter = this.f151876a).f151647d) == null) {
            return;
        }
        mMEditText.append(pg5.d.a(musicMvCommentFooter.getContext(), str));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection inputConnection;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f151876a.f151647d;
        if (mMEditText == null || (inputConnection = mMEditText.getInputConnection()) == null) {
            return;
        }
        inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 67));
        inputConnection.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter = this.f151876a;
        com.tencent.mm.ui.widget.MMEditText mMEditText = musicMvCommentFooter.f151647d;
        android.text.Editable text = mMEditText != null ? mMEditText.getText() : null;
        if (text == null || text.length() == 0) {
            return;
        }
        ck5.f b17 = ck5.f.b(musicMvCommentFooter.f151647d);
        b17.f42561f = 0;
        b17.f42560e = 80;
        b17.f42556a = true;
        b17.d(new com.tencent.mm.plugin.mv.ui.view.l1(musicMvCommentFooter));
    }
}
