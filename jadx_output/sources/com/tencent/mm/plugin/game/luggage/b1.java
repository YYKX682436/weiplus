package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class b1 implements com.tencent.mm.plugin.game.luggage.page.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI f139542a;

    public b1(com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI mMLuggageGameWebViewUI) {
        this.f139542a = mMLuggageGameWebViewUI;
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.e
    public boolean a() {
        com.tencent.mm.plugin.game.luggage.page.k kVar;
        com.tencent.mm.plugin.game.luggage.page.l lVar = this.f139542a.f139507g;
        if (lVar == null || (kVar = lVar.f139912l2) == null) {
            return true;
        }
        return kVar.a();
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.e
    public void b() {
        com.tencent.mm.plugin.game.luggage.page.k kVar;
        com.tencent.mm.plugin.game.luggage.page.l lVar = this.f139542a.f139507g;
        if (lVar == null || (kVar = lVar.f139912l2) == null) {
            return;
        }
        kVar.d(false);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.e
    public void c() {
        com.tencent.mm.plugin.game.luggage.page.k kVar;
        com.tencent.mm.plugin.game.luggage.page.l lVar = this.f139542a.f139507g;
        if (lVar == null || (kVar = lVar.f139912l2) == null) {
            return;
        }
        kVar.d(true);
    }
}
