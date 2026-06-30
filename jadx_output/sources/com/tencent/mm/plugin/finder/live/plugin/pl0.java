package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pl0 implements com.tencent.mm.plugin.finder.live.plugin.ep0, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f113907d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f113908e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f113909f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f113910g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f113911h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f113912i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f113913m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f113914n;

    public pl0(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113907d = context;
        this.f113908e = buContext;
        this.f113909f = statusMonitor;
        this.f113910g = lVar;
        this.f113911h = tVar;
        this.f113912i = "FinderLiveWecomBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b1z, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f113913m = (android.view.ViewGroup) inflate;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f113911h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void a(cm2.z zVar) {
        android.view.ViewGroup viewGroup = this.f113913m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.eqy);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.fr8);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.hhj);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.fr7);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        textView.setText(zVar.f43409v.getString(0));
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.w1()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveWeComItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveWeComItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ml0(this, zVar));
            textView2.setVisibility(4);
            return;
        }
        textView2.setVisibility(0);
        int i17 = r4Var.y1(this.f113908e) ? 4 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveWeComItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteLiveWeComItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.nl0(this, zVar));
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.ol0(this, zVar));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.z) {
            a((cm2.z) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f113913m;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.z) {
            cm2.z zVar = (cm2.z) data;
            a(zVar);
            bf2.c cVar = bf2.c.f19598a;
            gk2.e eVar = this.f113908e;
            java.lang.String string = zVar.f43409v.getString(3);
            if (string == null) {
                string = "";
            }
            bf2.c.c(cVar, eVar, 1, 3, string, 0, null, 0, 0, null, 0, 1008, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f113914n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            mm2.f6 f6Var = (mm2.f6) this.f113908e.a(mm2.f6.class);
            android.view.ViewGroup viewGroup = this.f113913m;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.feature.openim.api.INetSceneSearchOpenIMContact");
            f6Var.R6(context, (ab0.v) m1Var);
        }
        gm0.j1.d().q(vb1.e.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
