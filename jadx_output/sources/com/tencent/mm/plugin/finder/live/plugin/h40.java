package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h40 implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112767d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f112768e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f112769f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f112770g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f112771h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f112772i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f112773m;

    static {
        new com.tencent.mm.plugin.finder.live.plugin.d40(null);
    }

    public h40(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112767d = context;
        this.f112768e = buContext;
        this.f112769f = statusMonitor;
        this.f112770g = lVar;
        this.f112771h = tVar;
        this.f112772i = "FinderLivePayVideoListBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488956dg1, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f112773m = (android.view.ViewGroup) inflate;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f112771h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", "FinderLivePayVideoListBubble_POST_PAY_VIDEOS_PORTRAIT")) {
            android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            if (bundle2 != null) {
                r45.do2 do2Var = new r45.do2();
                do2Var.parseFrom(bundle2.getByteArray("FinderLivePayVideoListBubble_PAY_VIDEOS_PORTRAIT_DATA"));
                android.content.Context context = this.f112767d;
                kotlin.jvm.internal.o.g(context, "context");
                ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).dk(context, null, null, do2Var, true);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    public final void a(cm2.c0 c0Var) {
        java.lang.String string;
        java.lang.String string2;
        android.view.ViewGroup viewGroup = this.f112773m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.pxl);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.q0_);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.hiz);
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.eqy);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        kotlin.jvm.internal.o.d(textView3);
        com.tencent.mm.ui.fk.a(textView3);
        int integer = c0Var.f43334v.getInteger(2);
        java.lang.String str = "";
        android.content.Context context = this.f112767d;
        r45.do2 do2Var = c0Var.f43334v;
        if (integer == 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null && (string = uz0Var.getString(1)) != null) {
                str = string;
            }
            objArr[0] = str;
            textView.setText(context.getString(com.tencent.mm.R.string.f491745fy4, objArr));
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            r45.uz0 uz0Var2 = (r45.uz0) do2Var.getCustom(0);
            objArr2[0] = java.lang.Integer.valueOf(uz0Var2 != null ? uz0Var2.getInteger(4) : 0);
            r45.uz0 uz0Var3 = (r45.uz0) do2Var.getCustom(0);
            objArr2[1] = java.lang.Integer.valueOf(uz0Var3 != null ? uz0Var3.getInteger(5) : 0);
            textView2.setText(context.getString(com.tencent.mm.R.string.fbb, objArr2));
        } else if (integer == 2) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            r45.n11 n11Var = (r45.n11) do2Var.getCustom(1);
            if (n11Var != null && (string2 = n11Var.getString(1)) != null) {
                str = string2;
            }
            objArr3[0] = str;
            textView.setText(context.getString(com.tencent.mm.R.string.gvd, objArr3));
            java.lang.Object[] objArr4 = new java.lang.Object[2];
            r45.n11 n11Var2 = (r45.n11) do2Var.getCustom(1);
            objArr4[0] = java.lang.Integer.valueOf(n11Var2 != null ? n11Var2.getInteger(4) : 0);
            r45.n11 n11Var3 = (r45.n11) do2Var.getCustom(1);
            objArr4[1] = java.lang.Integer.valueOf(n11Var3 != null ? n11Var3.getInteger(5) : 0);
            textView2.setText(context.getString(com.tencent.mm.R.string.gjp, objArr4));
        }
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.e40(this, c0Var));
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.f40(this, c0Var));
        if (zl2.r4.f473950a.y1(this.f112768e)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePayVideoListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePayVideoListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePayVideoListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePayVideoListBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromotePayVideoListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.g40(this, c0Var));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.c0) {
            a((cm2.c0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f112773m;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.c0) {
            cm2.c0 c0Var = (cm2.c0) data;
            a(c0Var);
            bf2.c.c(bf2.c.f19598a, this.f112768e, 1, 15, pm0.v.u(zl2.r4.f473950a.c0(c0Var.f43334v)), 0, null, 0, 1, null, 0, nd1.y0.CTRL_INDEX, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.hhj;
    }
}
