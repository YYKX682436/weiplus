package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nz implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.oz f113686d;

    public nz(com.tencent.mm.plugin.finder.live.plugin.oz ozVar) {
        this.f113686d = ozVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MultiStreamIndicatorPlugin", "onVideoPlayStateChange: " + ((mm2.f) obj));
        com.tencent.mm.plugin.finder.live.plugin.oz ozVar = this.f113686d;
        boolean O6 = ((mm2.w) ozVar.P0(mm2.w.class)).O6();
        com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator commonCircleIndicator = ozVar.f113804p;
        if (O6) {
            commonCircleIndicator.setAlpha(0.0f);
        } else {
            commonCircleIndicator.setAlpha(1.0f);
        }
    }
}
