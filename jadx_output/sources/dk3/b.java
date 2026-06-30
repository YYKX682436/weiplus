package dk3;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk3.e f234446d;

    public b(dk3.e eVar) {
        this.f234446d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewParent parent;
        dk3.e eVar = this.f234446d;
        com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = eVar.f234452d;
        if (floatMultiTaskIndicatorView != null) {
            if (floatMultiTaskIndicatorView != null) {
                try {
                    parent = floatMultiTaskIndicatorView.getParent();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatMultiTaskIndicatorController", e17, "detachFloatIndicatorView exception:%s", e17);
                    return;
                }
            } else {
                parent = null;
            }
            if (parent != null) {
                com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = eVar.f234452d;
                android.view.ViewParent parent2 = floatMultiTaskIndicatorView2 != null ? floatMultiTaskIndicatorView2.getParent() : null;
                kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent2).removeView(eVar.f234452d);
            }
        }
    }
}
