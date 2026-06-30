package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hw implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f112873d;

    public hw(com.tencent.mm.plugin.finder.live.plugin.ow owVar) {
        this.f112873d = owVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f112873d;
        com.tencent.mars.xlog.Log.i(owVar.f113787p, "[liveBubbleShowStatusLiveData] " + bool);
        kotlin.jvm.internal.o.d(bool);
        int i17 = bool.booleanValue() ? 8 : 0;
        owVar.A1().setVisibility(i17);
        owVar.B1().setVisibility(i17);
        com.tencent.mm.particles.ConfettiSurfaceRenderView confettiSurfaceRenderView = owVar.f113794u;
        if (confettiSurfaceRenderView == null) {
            return;
        }
        confettiSurfaceRenderView.setVisibility(i17);
    }
}
