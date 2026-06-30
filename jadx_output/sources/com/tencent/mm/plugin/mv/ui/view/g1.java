package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes5.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter f151830d;

    public g1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter) {
        this.f151830d = musicMvCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f151830d.f151649f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setVisibility(4);
        } else {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
    }
}
