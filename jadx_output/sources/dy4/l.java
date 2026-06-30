package dy4;

/* loaded from: classes8.dex */
public final class l implements dy4.a, dy4.c, dy4.b {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f244681d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f244682e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f244683f;

    /* renamed from: g, reason: collision with root package name */
    public cy4.e f244684g;

    public l(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f244681d = context;
        this.f244682e = "MicroMsg.WebViewUIProxyImpl";
        this.f244683f = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    }

    @Override // dy4.a
    public void C0(android.view.View view, int i17) {
        cy4.e b17 = b(this.f244681d);
        android.content.Context context = b17.f224866a;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewFullscreenImpl", "enterFullscreen activity(%s) destroyed", activity);
                return;
            }
            android.view.View view2 = b17.f224867b;
            b17.f224867b = view;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getWindow().getDecorView();
            if (view2 == null) {
                if (view.getParent() instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.getParent();
                    b17.f224870e = viewGroup2;
                    b17.f224868c = viewGroup2.indexOfChild(view);
                    b17.f224869d = view.getLayoutParams();
                    b17.f224870e.removeView(view);
                    b17.f224872g = b17.f224867b.getDrawingCacheBackgroundColor();
                    b17.f224867b.setBackgroundColor(-16777216);
                } else {
                    b17.f224868c = 0;
                    b17.f224870e = null;
                    b17.f224869d = null;
                }
                viewGroup.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
                viewGroup.bringChildToFront(view);
                view.setX(0.0f);
                view.setY(0.0f);
            }
            if (view2 == null) {
                b17.f224871f = viewGroup.getSystemUiVisibility();
                b17.f224873h = activity.getRequestedOrientation();
                android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
                b17.f224874i = layoutParams;
                layoutParams.copyFrom(activity.getWindow().getAttributes());
            }
            viewGroup.setSystemUiVisibility(5894);
            activity.getWindow().addFlags(1024);
            if (i17 == -90) {
                activity.setRequestedOrientation(8);
            } else if (i17 == 0) {
                activity.setRequestedOrientation(1);
            } else if (i17 != 90) {
                activity.setRequestedOrientation(9);
            } else {
                activity.setRequestedOrientation(0);
            }
            qp1.h0.a(true, true, true);
            java.util.Iterator it = b17.f224875j.iterator();
            while (it.hasNext()) {
                ((cy4.f) it.next()).a();
            }
        }
    }

    @Override // dy4.c
    public synchronized void Q3(sf.e callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!this.f244683f.contains(callback)) {
            this.f244683f.add(callback);
        }
    }

    @Override // dy4.a
    public boolean V() {
        return b(this.f244681d).a(false);
    }

    public final boolean a(boolean z17) {
        cy4.e eVar = this.f244684g;
        if (eVar != null) {
            if (eVar.f224867b != null) {
                try {
                    return b(this.f244681d).a(z17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(this.f244682e, "exitFullScreen ex=" + e17.getMessage());
                }
            }
        }
        return false;
    }

    public final cy4.e b(android.content.Context context) {
        if (this.f244684g == null) {
            this.f244684g = new cy4.e(context);
        }
        cy4.e eVar = this.f244684g;
        kotlin.jvm.internal.o.d(eVar);
        return eVar;
    }

    public final boolean c() {
        cy4.e eVar = this.f244684g;
        return (eVar == null || eVar.f224867b == null) ? false : true;
    }

    public final void d(android.content.Context ct6) {
        kotlin.jvm.internal.o.g(ct6, "ct");
        this.f244681d = ct6;
        cy4.e eVar = this.f244684g;
        if (eVar != null) {
            eVar.f224866a = ct6;
            eVar.f224870e = null;
            eVar.f224867b = null;
        }
    }

    @Override // dy4.b
    public void g0(cy4.f fVar) {
        b(this.f244681d).f224875j.remove(fVar);
    }

    @Override // dy4.c
    public synchronized void g6(sf.e callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f244683f.remove(callback);
    }

    @Override // dy4.b
    public void q3(cy4.f fVar) {
        java.util.Set set = b(this.f244681d).f224875j;
        if (set.contains(fVar)) {
            return;
        }
        set.add(fVar);
    }
}
