package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDownloadView f141373d;

    public e3(com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView) {
        this.f141373d = gameDownloadView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView = this.f141373d;
        com.tencent.mm.plugin.game.ui.s sVar = gameDownloadView.f140764f;
        com.tencent.mm.plugin.game.widget.TextProgressBar textProgressBar = gameDownloadView.f140763e;
        android.widget.Button button = gameDownloadView.f140762d;
        com.tencent.mm.plugin.game.model.c0 c0Var = gameDownloadView.f140765g;
        sVar.b(textProgressBar, button, c0Var.f140241a, c0Var);
    }
}
