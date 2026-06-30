package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes15.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.j3 f184370d;

    public c3(com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var) {
        this.f184370d = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.j3 j3Var = this.f184370d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = j3Var.f184475y;
        kotlin.jvm.internal.o.d(weImageView);
        weImageView.setVisibility(8);
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = j3Var.f184464n;
        kotlin.jvm.internal.o.d(soundWaveView);
        soundWaveView.setVisibility(0);
    }
}
