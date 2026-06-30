package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qw implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.sw f114053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114054e;

    public qw(com.tencent.mm.plugin.finder.live.plugin.sw swVar, android.view.ViewGroup viewGroup) {
        this.f114053d = swVar;
        this.f114054e = viewGroup;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.f fVar = (mm2.f) obj;
        com.tencent.mars.xlog.Log.i("FinderLiveLogoForViewPlugin", "onVideoPlayStateChange: " + fVar);
        int i17 = fVar == null ? -1 : com.tencent.mm.plugin.finder.live.plugin.pw.f113934a[fVar.ordinal()];
        com.tencent.mm.plugin.finder.live.plugin.sw swVar = this.f114053d;
        if (i17 == 1) {
            swVar.K0(swVar.f114317t);
        } else {
            if (i17 != 2) {
                return;
            }
            swVar.f114317t = this.f114054e.getVisibility();
            swVar.K0(8);
        }
    }
}
