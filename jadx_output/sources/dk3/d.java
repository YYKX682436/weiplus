package dk3;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk3.e f234448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dk3.e eVar) {
        super(0);
        this.f234448d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk3.e eVar = this.f234448d;
        com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = eVar.f234452d;
        if (floatMultiTaskIndicatorView != null) {
            floatMultiTaskIndicatorView.setVisibility(8);
            android.view.ViewGroup a17 = eVar.f234450b.a();
            try {
                com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = eVar.f234452d;
                if ((floatMultiTaskIndicatorView2 != null ? floatMultiTaskIndicatorView2.getParent() : null) != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FloatMultiTaskIndicatorController", "attachFloatIndicatorView, already attached");
                } else if (a17 != null) {
                    int childCount = a17.getChildCount();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= childCount) {
                            break;
                        }
                        if (a17.getChildAt(i18) instanceof com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView) {
                            a17.removeViewAt(i18);
                            break;
                        }
                        i18++;
                    }
                    int childCount2 = a17.getChildCount();
                    int childCount3 = a17.getChildCount();
                    while (true) {
                        if (i17 >= childCount3) {
                            break;
                        }
                        if (a17.getChildAt(i17) instanceof com.tencent.mm.ui.widget.SwipeBackLayout) {
                            childCount2 = i17 + 1;
                            break;
                        }
                        i17++;
                    }
                    a17.addView(eVar.f234452d, childCount2);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatMultiTaskIndicatorController", e17, "attachFloatIndicatorView exception:%s", e17);
            }
        }
        return jz5.f0.f302826a;
    }
}
