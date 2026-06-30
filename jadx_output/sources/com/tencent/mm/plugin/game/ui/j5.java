package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class j5 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameMessageUI f141438a;

    public j5(com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI) {
        this.f141438a = gameMessageUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.plugin.game.ui.GameMessageUI gameMessageUI = this.f141438a;
        if (gameMessageUI.f140932i.getCount() == 0) {
            gameMessageUI.f140931h.setVisibility(8);
            gameMessageUI.Z6(0);
            gameMessageUI.enableOptionMenu(false);
        } else {
            gameMessageUI.f140931h.setVisibility(0);
            gameMessageUI.Z6(8);
            gameMessageUI.enableOptionMenu(true);
        }
    }
}
