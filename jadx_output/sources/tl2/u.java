package tl2;

/* loaded from: classes8.dex */
public final class u implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a, com.tencent.mm.plugin.webview.ui.tools.widget.o6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f420274d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420275e;

    /* renamed from: f, reason: collision with root package name */
    public final int f420276f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f420277g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f420278h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f420279i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f420280m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f420281n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f420282o;

    /* renamed from: p, reason: collision with root package name */
    public l81.b1 f420283p;

    /* renamed from: q, reason: collision with root package name */
    public final tl2.g f420284q;

    public u(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f420274d = activity;
        this.f420275e = com.tencent.mm.ui.bk.p(activity);
        this.f420276f = com.tencent.mm.ui.bl.c(activity);
        this.f420277g = new android.graphics.Rect();
        this.f420278h = new android.graphics.Rect();
        this.f420280m = jz5.h.b(tl2.h.f420247d);
        this.f420281n = jz5.h.b(tl2.s.f420272d);
        this.f420282o = jz5.h.b(new tl2.t(this));
        this.f420284q = new tl2.g(this);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        q(k(), this.f420277g, this.f420278h, 1.0f - f17);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        com.tencent.mars.xlog.Log.i("LiveRestrictVideoTransition", "[onDrawerDetach]");
        p();
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        l81.b1 b1Var;
        com.tencent.mars.xlog.Log.i("LiveRestrictVideoTransition", "[onDrawerOpen] isOpen=" + z17 + " isBegin=" + z18);
        if (!z18 || !z17) {
            if (!z18 && !z17) {
                p();
                return;
            } else {
                if (!z18 || z17) {
                    return;
                }
                g(false);
                return;
            }
        }
        g(true);
        p();
        android.graphics.Rect rect = this.f420278h;
        if (!rect.isEmpty() || (b1Var = this.f420283p) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = b1Var.G;
        kotlin.jvm.internal.o.f(halfScreenConfig, "halfScreenConfig");
        android.app.Activity activity = this.f420274d;
        int i18 = com.tencent.mm.ui.bl.b(activity).y;
        int h17 = h();
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = (com.tencent.rtmp.ui.TXCloudVideoView) ((jz5.n) this.f420280m).getValue();
        android.graphics.Rect rect2 = this.f420277g;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.getGlobalVisibleRect(rect2);
        }
        boolean n17 = n();
        int i19 = this.f420275e;
        if (n17) {
            rect.set(i19, 0, ((i18 - halfScreenConfig.f77374x) - i19) + i19, h17);
        } else {
            rect.set(0, i19, h17, ((i18 - i19) - halfScreenConfig.f77357d) + i19);
        }
        com.tencent.mars.xlog.Log.i("LiveRestrictVideoTransition", "[calculateViewRect] wh=" + h() + ':' + com.tencent.mm.ui.bl.b(activity).y + " targetRect=" + rect + " sourceRect=" + rect2);
    }

    public final void g(boolean z17) {
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        com.tencent.mars.xlog.Log.i("LiveRestrictVideoTransition", "[clearScreen] isClean=" + z17 + ' ');
        java.util.List<qo0.a> list = (java.util.List) ((jz5.n) this.f420281n).getValue();
        if (list != null) {
            for (qo0.a aVar : list) {
                int w07 = aVar.w0();
                android.view.ViewGroup viewGroup = aVar.f365323d;
                if (w07 == 0) {
                    android.view.ViewPropertyAnimator animate = viewGroup.animate();
                    if (animate != null) {
                        android.view.ViewPropertyAnimator alpha = animate.alpha(z17 ? 0.0f : 1.0f);
                        if (alpha != null && (duration = alpha.setDuration(200L)) != null && (withEndAction = duration.withEndAction(new tl2.f(z17, aVar))) != null) {
                            withEndAction.start();
                        }
                    }
                } else if (z17) {
                    viewGroup.setTranslationX(Float.MAX_VALUE);
                } else {
                    viewGroup.setTranslationX(0.0f);
                }
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", z17);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            k0Var.statusChange(qo0.b.Z2, bundle);
        }
    }

    public final int h() {
        return this.f420274d.getResources().getDisplayMetrics().widthPixels;
    }

    public final android.view.View k() {
        java.lang.Object value = ((jz5.n) this.f420282o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void l(yz5.a aVar) {
        android.app.Activity context = this.f420274d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pl2.x xVar = (pl2.x) a17;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((pl2.x) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
            aVar.invoke();
            return;
        }
        pl2.s sVar = xVar.f356684g;
        if (sVar != null) {
            sVar.d(0L, new tl2.r(this, aVar));
        }
    }

    public final boolean n() {
        return this.f420274d.getResources().getConfiguration().orientation == 2;
    }

    public final android.os.Bundle o(java.lang.String str) {
        java.util.List list;
        java.util.List list2;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!(str == null || str.length() == 0)) {
            java.util.List g17 = new r26.t("&").g(str, 0);
            boolean isEmpty = g17.isEmpty();
            kz5.p0 p0Var = kz5.p0.f313996d;
            if (!isEmpty) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        list = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = p0Var;
            for (java.lang.String str2 : (java.lang.String[]) list.toArray(new java.lang.String[0])) {
                java.util.List g18 = new r26.t("=").g(str2, 0);
                if (!g18.isEmpty()) {
                    java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
                    while (listIterator2.hasPrevious()) {
                        if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                            list2 = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list2 = p0Var;
                java.lang.String[] strArr = (java.lang.String[]) list2.toArray(new java.lang.String[0]);
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    if (strArr.length == 2) {
                        bundle.putString(java.net.URLDecoder.decode(strArr[0], com.tencent.mapsdk.internal.rv.f51270c), java.net.URLDecoder.decode(strArr[1], com.tencent.mapsdk.internal.rv.f51270c));
                    } else if (strArr.length == 1) {
                        bundle.putString(java.net.URLDecoder.decode(strArr[0], com.tencent.mapsdk.internal.rv.f51270c), "");
                    }
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
            }
        }
        return bundle;
    }

    public final void p() {
        k().setTranslationX(0.0f);
        k().setTranslationY(0.0f);
        k().setScaleX(1.0f);
        k().setScaleY(1.0f);
    }

    public final void q(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2, float f17) {
        if (view == null) {
            return;
        }
        if (rect.bottom > rect2.bottom || n()) {
            float centerX = (rect2.centerX() - rect.centerX()) * f17;
            float centerY = ((rect2.centerY() - rect.centerY()) + ((n() || rect2.height() <= rect.height()) ? 0 : (rect2.height() - rect.height()) / 2)) * f17;
            float min = java.lang.Math.min((rect.width() + ((rect2.width() - rect.width()) * f17)) / rect.width(), (rect.height() + ((rect2.height() - rect.height()) * f17)) / rect.height());
            if (!java.lang.Float.isNaN(min)) {
                view.setScaleX(min);
                view.setScaleY(min);
            }
            view.setTranslationX(centerX);
            view.setTranslationY(centerY);
        }
    }
}
