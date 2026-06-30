package nf;

/* loaded from: classes7.dex */
public abstract class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f336614d = {false};

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.widget.q qVar;
        boolean[] zArr = this.f336614d;
        try {
            if (!zArr[0]) {
                com.tencent.mm.plugin.appbrand.a3 a3Var = (com.tencent.mm.plugin.appbrand.a3) this;
                android.view.View view = a3Var.f74888e;
                view.sendAccessibilityEvent(32768);
                int i17 = 0;
                while (true) {
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = a3Var.f74890g;
                    int childCount = appBrandRuntime.f74810s.getChildCount();
                    qVar = appBrandRuntime.f74810s;
                    if (i17 >= childCount) {
                        break;
                    }
                    android.view.View childAt = qVar.getChildAt(i17);
                    if (a3Var.f74889f.getView() != childAt) {
                        childAt.setImportantForAccessibility(4);
                    }
                    i17++;
                }
                qVar.f91852g = true;
                qVar.f91853h = view;
            }
        } finally {
            zArr[0] = true;
        }
    }
}
