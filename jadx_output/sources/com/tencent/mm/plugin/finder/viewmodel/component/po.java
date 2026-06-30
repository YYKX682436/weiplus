package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class po extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: m, reason: collision with root package name */
    public static long f135571m;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.tl f135572d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.xj f135573e;

    /* renamed from: f, reason: collision with root package name */
    public int f135574f;

    /* renamed from: g, reason: collision with root package name */
    public int f135575g;

    /* renamed from: h, reason: collision with root package name */
    public int f135576h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f135577i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135572d = new com.tencent.mm.plugin.finder.feed.tl((com.tencent.mm.ui.MMActivity) activity);
        this.f135574f = com.tencent.mm.ui.bh.a(getContext()).f197135a;
        this.f135576h = 1;
        this.f135577i = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.lo.f135074d);
    }

    public final boolean O6() {
        return ((java.lang.Boolean) ((jz5.n) this.f135577i).getValue()).booleanValue();
    }

    public final void P6() {
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f135572d;
        tlVar.h("resetToPortrait");
        if (!O6() || tlVar.f109083u < 0) {
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = tlVar.g().f111075d;
        int i17 = tlVar.f109083u + 1;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tlVar.g().f111076e;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        int a07 = i17 + wxRecyclerAdapter.a0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(a07));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "scrollToSelectPos", "()V", "Undefined", "scrollToPosition", "(I)V");
        wxRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "scrollToSelectPos", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b2d;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(getContext());
        int i17 = this.f135574f;
        int i18 = a17.f197135a;
        if (i18 != i17) {
            this.f135574f = i18;
            this.f135572d.h("screenWidthChange");
        }
        int i19 = this.f135576h;
        int i27 = newConfig.orientation;
        if (i19 != i27) {
            this.f135576h = i27;
            if (i27 == 1) {
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.mo(this));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0526, code lost:
    
        if (r1 == false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0360  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r42) {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.po.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        final androidx.appcompat.app.AppCompatActivity activity = getActivity();
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent>(activity) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderLongVideoShareUIC$onCreateAfter$1
            {
                this.__eventId = 2063121603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent activityToggleAnimEndEvent) {
                com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent event = activityToggleAnimEndEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.viewmodel.component.po poVar = com.tencent.mm.plugin.finder.viewmodel.component.po.this;
                if (poVar.getActivity().hashCode() != event.f53967g.f6715a) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "ActivityToggleAnimEndEvent: notify adjust progress bar");
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.oo(poVar));
                return false;
            }
        }.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f135572d;
        tlVar.e().unregister(tlVar.g().f111082k);
        ((com.tencent.mm.plugin.finder.convert.yn) ((jz5.n) tlVar.f109076n).getValue()).R1().removeCallbacksAndMessages(null);
        so2.j5 j5Var = (so2.j5) tlVar.f().f293125i;
        if (j5Var != null) {
            com.tencent.mm.plugin.finder.report.l0.f125109a.a(tlVar.f109069d, j5Var, 55);
        }
        do2.k kVar = tlVar.B;
        if (kVar != null) {
            kVar.dismiss();
        }
        tlVar.B = null;
        tlVar.g().f111081j = true;
        ((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) tlVar.f109075m).getValue()).onDetach();
        ao2.a aVar = tlVar.f109070e;
        if (aVar == null || !aVar.f12544m) {
            return;
        }
        aVar.f12544m = false;
        aVar.a(2);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f135572d;
        tlVar.f109073h.getClass();
        com.tencent.mm.sdk.platformtools.u3.l(tlVar.D);
        ao2.a aVar = tlVar.f109070e;
        if (aVar != null) {
            synchronized (aVar) {
                if (aVar.f12543l == null) {
                    return;
                }
                if (!aVar.f12545n) {
                    aVar.f12545n = true;
                    aVar.a(3);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f135572d;
        tlVar.getClass();
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.feed.hl(tlVar));
        ao2.a aVar = tlVar.f109070e;
        if (aVar != null) {
            aVar.e();
        }
        com.tencent.mm.sdk.platformtools.u3.i(tlVar.D, 200L);
    }
}
