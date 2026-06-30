package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class lb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.nb f161289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161290e;

    public lb(com.tencent.mm.plugin.setting.ui.setting.nb nbVar, int i17) {
        this.f161289d = nbVar;
        this.f161290e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("inputContainer.height: ");
        com.tencent.mm.plugin.setting.ui.setting.nb nbVar = this.f161289d;
        sb6.append(nbVar.T6().c().getHeight());
        sb6.append(", screenHeight: ");
        int i17 = this.f161290e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailEditUIC", sb6.toString());
        if (nbVar.T6().c().getHeight() > i17) {
            nbVar.T6().e().scrollBy(0, nbVar.T6().c().getHeight() - i17);
        }
    }
}
