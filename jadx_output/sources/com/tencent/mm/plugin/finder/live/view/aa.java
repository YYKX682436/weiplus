package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class aa implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.v2 f116187e;

    public aa(com.tencent.mm.plugin.finder.live.view.ka kaVar, el2.v2 v2Var) {
        this.f116186d = kaVar;
        this.f116187e = v2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        yg2.b bVar;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.view.ka kaVar = this.f116186d;
        if (itemId == kaVar.P) {
            kaVar.getClass();
            gk2.e eVar = dk2.ef.I;
            if (eVar == null || (bVar = eVar.f272475i) == null) {
                return;
            }
            kotlinx.coroutines.l.d(bVar, null, null, new com.tencent.mm.plugin.finder.live.view.w9(kaVar, this.f116187e, null), 3, null);
        }
    }
}
