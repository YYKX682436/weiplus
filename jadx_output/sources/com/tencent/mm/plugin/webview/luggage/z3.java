package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public final class z3 extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e0 f182722q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Intent f182723r;

    /* renamed from: s, reason: collision with root package name */
    public android.app.Activity f182724s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z3(com.tencent.mm.plugin.webview.luggage.e0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "page"
            kotlin.jvm.internal.o.g(r4, r0)
            android.content.Context r0 = r4.f406610d
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            kotlin.jvm.internal.o.e(r0, r1)
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            r3.<init>(r2)
            r3.f182722q = r4
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r3.f182723r = r2
            android.os.Bundle r4 = r4.f406657n
            r2.putExtras(r4)
            kotlin.jvm.internal.o.e(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            r3.f182724s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.luggage.z3.<init>(com.tencent.mm.plugin.webview.luggage.e0):void");
    }

    @Override // ak3.i, ak3.c
    public android.view.ViewGroup a() {
        android.view.Window window;
        if (!u()) {
            android.view.ViewParent parent = this.f182722q.f406654h.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            return (android.view.ViewGroup) parent;
        }
        android.app.Activity activity = this.f182724s;
        android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (android.view.ViewGroup) decorView;
    }

    @Override // ak3.i, ak3.c
    public int b() {
        return u() ? -1 : 0;
    }

    @Override // ak3.i, ak3.c
    public void f(ak3.b bVar) {
        if (u()) {
            super.f(bVar);
        } else if (bVar != null) {
            bVar.onComplete(true);
        }
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        return getContentView() != null;
    }

    @Override // ak3.i, ak3.c
    public android.app.Activity getActivity() {
        return this.f182724s;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getContentView() {
        if (u()) {
            android.app.Activity activity = this.f182724s;
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            return ((com.tencent.mm.ui.MMActivity) activity).getSwipeBackLayout();
        }
        android.view.View view = this.f182722q.f406654h;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
        return (me.imid.swipebacklayout.lib.SwipeBackLayout) view;
    }

    @Override // ak3.i, ak3.c
    public android.content.Intent getIntent() {
        return this.f182723r;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getMaskView() {
        if (u()) {
            android.app.Activity activity = this.f182724s;
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            return ((com.tencent.mm.ui.MMActivity) activity).getSwipeBackLayout().getTargetContentView();
        }
        android.view.View view = this.f182722q.f406654h;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
        return ((me.imid.swipebacklayout.lib.SwipeBackLayout) view).getTargetView();
    }

    @Override // ak3.i, ak3.c
    public void h(ak3.a aVar) {
        this.f5586h = aVar;
        if (!u()) {
            android.view.View view = this.f182722q.f406654h;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type me.imid.swipebacklayout.lib.SwipeBackLayout");
            ((me.imid.swipebacklayout.lib.SwipeBackLayout) view).c(new com.tencent.mm.plugin.webview.luggage.y3(aVar));
            return;
        }
        android.app.Activity activity = this.f182724s;
        if (activity instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((com.tencent.mm.ui.MMActivity) activity).getSwipeBackLayout() != null) {
                android.app.Activity activity2 = this.f182724s;
                kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.tencent.mm.ui.MMActivity) activity2).getSwipeBackLayout().setSwipeBackListener(this.f5585g);
            }
        }
    }

    @Override // ak3.i, ak3.c
    public void i(boolean z17) {
    }

    @Override // ak3.i, ak3.c
    public void j(boolean z17, jk3.e helper) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        kotlin.jvm.internal.o.g(helper, "helper");
        if (((sd.u) this.f182722q.f406612f).f406653a.f(false)) {
            return;
        }
        if (z17) {
            android.app.Activity activity = this.f182724s;
            if (activity != null && (intent4 = activity.getIntent()) != null) {
                intent4.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477848d6);
            }
            android.app.Activity activity2 = this.f182724s;
            if (activity2 != null && (intent3 = activity2.getIntent()) != null) {
                intent3.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
            }
        } else {
            android.app.Activity activity3 = this.f182724s;
            if (activity3 != null && (intent2 = activity3.getIntent()) != null) {
                intent2.putExtra("MMActivity.OverrideExitAnimation", 0);
            }
            android.app.Activity activity4 = this.f182724s;
            if (activity4 != null && (intent = activity4.getIntent()) != null) {
                intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
            }
        }
        android.app.Activity activity5 = this.f182724s;
        if (activity5 != null) {
            activity5.finish();
        }
    }

    @Override // ak3.i
    public void r(android.app.Activity activity) {
        this.f182724s = activity;
    }

    public final boolean u() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("useActivityEnv: ");
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = this.f182722q;
        sb6.append(((sd.u) e0Var.f406612f).f406653a.f406663d.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewMultiTaskPageAdapter", sb6.toString());
        return ((sd.u) e0Var.f406612f).f406653a.f406663d.size() <= 1;
    }
}
