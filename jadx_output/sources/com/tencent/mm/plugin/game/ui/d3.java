package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDownloadView f141364d;

    public d3(com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView) {
        this.f141364d = gameDownloadView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView = this.f141364d;
        gameDownloadView.f140765g.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        gameDownloadView.f140765g.b();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.e3(gameDownloadView));
    }
}
