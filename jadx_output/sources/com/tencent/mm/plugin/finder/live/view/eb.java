package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class eb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f116279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f116280e;

    public eb(com.tencent.mm.plugin.finder.live.view.gb gbVar, long j17) {
        this.f116279d = gbVar;
        this.f116280e = j17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        yz5.l lVar;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.view.gb gbVar = this.f116279d;
        if (itemId != gbVar.X || (lVar = gbVar.V) == null) {
            return;
        }
        lVar.invoke(java.lang.Long.valueOf(this.f116280e));
    }
}
