package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f171184a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y f171185b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f171186c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f171187d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f171188e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.y0 f171189f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f171190g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f171191h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f171192i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f171193j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f171194k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f171195l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f171196m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f171197n;

    public l(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view) {
        this.f171184a = str;
        this.f171185b = yVar;
        this.f171186c = view;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsAd.");
        sb6.append(str == null ? "component" : str);
        sb6.append('.');
        sb6.append(hashCode());
        java.lang.String sb7 = sb6.toString();
        this.f171187d = sb7;
        this.f171188e = sb7 + ".dynamicad.living";
        this.f171191h = true;
        this.f171196m = new java.util.ArrayList();
        this.f171197n = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
    }

    public static final /* synthetic */ java.util.List b(com.tencent.mm.plugin.sns.ui.widget.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOnPreDrawListenerList$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        java.util.List list = lVar.f171196m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOnPreDrawListenerList$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return list;
    }

    public final void c(com.tencent.mm.plugin.sns.ui.widget.f listener) {
        kotlinx.coroutines.y0 y0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSafeOnPreDrawListener", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i(this.f171187d, "addSafeOnPreDrawListener " + l(this.f171190g));
        ((java.util.ArrayList) this.f171196m).add(listener);
        java.lang.Object obj = this.f171190g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        android.view.View view = this.f171186c;
        if (view != null && (y0Var = this.f171189f) != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new com.tencent.mm.plugin.sns.ui.widget.j(this, view, obj, obj, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (view != null) {
            view.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSafeOnPreDrawListener", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public abstract void d(java.lang.Object obj, boolean z17);

    public final void e(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        java.util.List<com.tencent.mm.plugin.sns.ui.widget.l> list = this.f171193j;
        if (list != null) {
            for (com.tencent.mm.plugin.sns.ui.widget.l lVar : list) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindSubComponents ");
                sb6.append(lVar != null ? lVar.f171184a : null);
                sb6.append(" model = ");
                sb6.append(l(obj));
                com.tencent.mars.xlog.Log.i(this.f171187d, sb6.toString());
                lVar.f(obj);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public final void f(java.lang.Object obj) {
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.o mo133getLifecycle2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (obj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        androidx.lifecycle.y yVar = this.f171185b;
        androidx.lifecycle.n b17 = (yVar == null || (mo133getLifecycle2 = yVar.mo133getLifecycle()) == null) ? null : mo133getLifecycle2.b();
        androidx.lifecycle.n nVar = androidx.lifecycle.n.DESTROYED;
        java.lang.String str = this.f171187d;
        if (b17 == nVar) {
            com.tencent.mars.xlog.Log.i(str, "bind view on DESTROYED!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        boolean n17 = n(obj);
        com.tencent.mars.xlog.Log.i(str, "componentExist " + n17 + " name = " + this.f171184a + " model = " + l(obj));
        java.lang.Object obj2 = this.f171190g;
        if (!n17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            java.util.List list = this.f171193j;
            if (list != null) {
                java.util.Iterator it = new kz5.j1(list).iterator();
                while (true) {
                    kz5.i1 i1Var = (kz5.i1) it;
                    if (!i1Var.hasNext()) {
                        break;
                    }
                    com.tencent.mm.plugin.sns.ui.widget.l lVar = (com.tencent.mm.plugin.sns.ui.widget.l) i1Var.next();
                    lVar.t(lVar.f171190g);
                }
            }
            java.util.List list2 = this.f171193j;
            if (list2 != null) {
                ((java.util.ArrayList) list2).clear();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            t(obj2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        boolean o17 = obj2 == null ? false : o(obj2, obj);
        boolean z17 = this.f171192i;
        android.view.View view = this.f171186c;
        boolean z18 = (z17 || view == null) ? false : true;
        if (!o17 || z18 || view == null || this.f171191h) {
            com.tencent.mars.xlog.Log.i(str, "try bind isSameContent=" + o17 + ", hasBindAfterDetach=" + this.f171192i + ", model=" + l(obj) + ", isReset=" + this.f171191h);
            kotlinx.coroutines.y0 y0Var = this.f171189f;
            if (y0Var != null) {
                kotlinx.coroutines.z0.c(y0Var, null);
            }
            this.f171189f = kotlinx.coroutines.z0.b();
            this.f171190g = obj;
            final com.tencent.mm.plugin.sns.ui.widget.g gVar = new com.tencent.mm.plugin.sns.ui.widget.g(this, obj);
            if (view != null) {
                if (view.isAttachedToWindow()) {
                    com.tencent.mars.xlog.Log.i(str, "onViewAttachedToWindow in bind!: model = " + l(obj) + " v = " + view);
                    ((kotlinx.coroutines.flow.h3) this.f171197n).k(java.lang.Boolean.TRUE);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                }
                if (!(!this.f171195l)) {
                    view = null;
                }
                if (view != null) {
                    this.f171195l = true;
                    view.addOnAttachStateChangeListener(gVar);
                }
            }
            if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
                androidx.lifecycle.o oVar = !this.f171194k && mo133getLifecycle.b() != nVar ? mo133getLifecycle : null;
                if (oVar != null) {
                    this.f171194k = true;
                    oVar.a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$6
                        @Override // androidx.lifecycle.v
                        public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                            java.lang.Object i17;
                            java.lang.Object i18;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$6");
                            kotlin.jvm.internal.o.g(source, "source");
                            kotlin.jvm.internal.o.g(event, "event");
                            androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_DESTROY;
                            com.tencent.mm.plugin.sns.ui.widget.l lVar2 = com.tencent.mm.plugin.sns.ui.widget.l.this;
                            if (event == mVar) {
                                com.tencent.mars.xlog.Log.i(lVar2.j(), "onStateChanged() ON_DESTROY");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setObserverHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                lVar2.f171194k = false;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setObserverHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                java.lang.Object i19 = lVar2.i();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                lVar2.t(i19);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                lVar2.f171185b.mo133getLifecycle().c(this);
                                android.view.View m17 = lVar2.m();
                                if (m17 != null) {
                                    m17.removeOnAttachStateChangeListener(gVar);
                                }
                                ((java.util.ArrayList) com.tencent.mm.plugin.sns.ui.widget.l.b(lVar2)).clear();
                                kotlinx.coroutines.y0 h17 = lVar2.h();
                                if (h17 != null) {
                                    kotlinx.coroutines.z0.c(h17, null);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                lVar2.f171189f = null;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                            }
                            if (event == androidx.lifecycle.m.ON_PAUSE && (i18 = lVar2.i()) != null) {
                                lVar2.r(i18);
                            }
                            if (event == androidx.lifecycle.m.ON_RESUME && (i17 = lVar2.i()) != null) {
                                lVar2.s(i17);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$6");
                        }
                    });
                }
            }
            t(obj2);
            com.tencent.mars.xlog.Log.i(str, "bindComponentModel model = " + l(obj));
            d(obj, o17);
            this.f171191h = false;
            this.f171192i = true;
        } else {
            com.tencent.mars.xlog.Log.i(str, "not bind!!  isSameContent = " + o17 + " ,hasBindAfterDetach = " + this.f171192i + " model = " + l(obj) + " isReset=" + this.f171191h);
        }
        q(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.plugin.sns.ui.widget.l g(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findSubComponentByName", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        java.util.List list = this.f171193j;
        com.tencent.mm.plugin.sns.ui.widget.l lVar = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.sns.ui.widget.l) next).f171184a, str)) {
                    lVar = next;
                    break;
                }
            }
            lVar = lVar;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSubComponentByName", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return lVar;
    }

    public final kotlinx.coroutines.y0 h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        kotlinx.coroutines.y0 y0Var = this.f171189f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return y0Var;
    }

    public final java.lang.Object i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getModel", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        java.lang.Object obj = this.f171190g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getModel", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return obj;
    }

    public final java.lang.String j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return this.f171187d;
    }

    public final java.lang.String k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG_LIVING", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG_LIVING", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return this.f171188e;
    }

    public final java.lang.String l(java.lang.Object obj) {
        java.lang.String sb6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getToId", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (obj instanceof com.tencent.mm.plugin.sns.storage.SnsInfo) {
            sb6 = ca4.z0.t0(((com.tencent.mm.plugin.sns.storage.SnsInfo) obj).field_snsId);
            kotlin.jvm.internal.o.d(sb6);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("other_");
            sb7.append(obj != null ? java.lang.Integer.valueOf(obj.hashCode()) : null);
            sb6 = sb7.toString();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getToId", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return sb6;
    }

    public final android.view.View m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewContainer", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewContainer", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return this.f171186c;
    }

    public abstract boolean n(java.lang.Object obj);

    public abstract boolean o(java.lang.Object obj, java.lang.Object obj2);

    public void p(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void q(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void r(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void s(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public final void t(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (!this.f171191h) {
            u();
            v(obj);
            this.f171191h = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public final void w(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        if (this.f171193j == null) {
            this.f171193j = new java.util.ArrayList();
        }
        java.util.List list2 = this.f171193j;
        if (list2 != null) {
            list2.clear();
        }
        java.util.List list3 = this.f171193j;
        if (list3 != null) {
            list3.addAll(list);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public final java.lang.Object x(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("waitForPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        c(new com.tencent.mm.plugin.sns.ui.widget.k(this, rVar));
        java.lang.Object j17 = rVar.j();
        if (j17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("waitForPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return j17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("waitForPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return f0Var;
    }
}
