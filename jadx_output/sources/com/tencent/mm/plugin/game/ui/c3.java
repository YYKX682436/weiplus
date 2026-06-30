package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class c3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDownloadView f141074d;

    public c3(com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView) {
        this.f141074d = gameDownloadView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.game.ui.GameDownloadView.f140761i;
        com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView = this.f141074d;
        gameDownloadView.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.e3(gameDownloadView));
    }
}
