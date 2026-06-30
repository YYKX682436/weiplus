package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pk implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113902d;

    public pk(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        this.f113902d = hmVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f113902d;
        com.tencent.mars.xlog.Log.i(hmVar.f112831r, "onPkgComboFlushDone, proceed showGiftPage");
        hmVar.U1();
    }
}
