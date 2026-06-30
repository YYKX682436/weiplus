package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class f3 implements com.tencent.mm.plugin.game.model.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDownloadView f141385a;

    public f3(com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView) {
        this.f141385a = gameDownloadView;
    }

    @Override // com.tencent.mm.plugin.game.model.z
    public void a(int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.game.ui.GameDownloadView gameDownloadView;
        com.tencent.mm.plugin.game.model.c0 c0Var;
        com.tencent.mm.plugin.game.model.b bVar;
        com.tencent.mm.plugin.game.model.c0 c0Var2;
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(str) || (c0Var = (gameDownloadView = this.f141385a).f140765g) == null || (bVar = c0Var.f140241a) == null || !bVar.field_appId.equals(str) || (c0Var2 = gameDownloadView.f140765g) == null) {
            return;
        }
        c0Var2.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        gameDownloadView.f140765g.b();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.ui.e3(gameDownloadView));
    }
}
