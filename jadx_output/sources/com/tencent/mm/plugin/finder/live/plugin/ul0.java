package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ul0 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.km0 f114587d;

    public ul0(com.tencent.mm.plugin.finder.live.plugin.km0 km0Var) {
        this.f114587d = km0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        yg2.b viewScope;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 1) {
            qo0.c cVar = this.f114587d.f113325g;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if ((k0Var == null || (viewScope = k0Var.getViewScope()) == null || !kotlinx.coroutines.z0.h(viewScope)) ? false : true) {
                this.f114587d.f113281r = it.arg1;
                com.tencent.mm.plugin.finder.live.plugin.km0 km0Var = this.f114587d;
                synchronized (km0Var.f113285v) {
                    if (km0Var.f113281r < km0Var.f113285v.size()) {
                        java.lang.Object obj = km0Var.f113285v.get(km0Var.f113281r);
                        kotlin.jvm.internal.o.f(obj, "get(...)");
                        km0Var.w1((com.tencent.mm.plugin.finder.live.plugin.tl0) obj, false);
                    }
                }
                com.tencent.mm.plugin.finder.live.plugin.km0.t1(this.f114587d);
            } else {
                com.tencent.mars.xlog.Log.i("FinderLiveWishBannerPlugin", "SCROLL_TO_NEXT_IMG_WHAT but viewScope is not active");
            }
        }
        return true;
    }
}
