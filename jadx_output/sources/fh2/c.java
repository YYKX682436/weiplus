package fh2;

/* loaded from: classes10.dex */
public final class c extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f262639h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f262640i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f262641m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f262642n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f262643o;

    /* renamed from: p, reason: collision with root package name */
    public int f262644p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, gk2.e buContext, yz5.a closeClick) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(closeClick, "closeClick");
        this.f262639h = buContext;
        this.f262640i = closeClick;
    }

    public static final void y(fh2.c cVar, int i17) {
        cVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", i17);
        jSONObject.put("type", 2);
        jSONObject.put("status", cVar.f262644p);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327265s2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dqb;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.s7e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f262641m = (com.tencent.mm.ui.widget.button.WeButton) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f483758bz2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f262642n = (com.tencent.mm.ui.widget.button.WeButton) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.chx);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f262643o = (android.widget.TextView) findViewById3;
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f262641m;
        if (weButton == null) {
            kotlin.jvm.internal.o.o("stopCloseBtn");
            throw null;
        }
        weButton.setOnClickListener(new fh2.a(this));
        com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f262642n;
        if (weButton2 == null) {
            kotlin.jvm.internal.o.o("closeBtn");
            throw null;
        }
        weButton2.setOnClickListener(new fh2.b(this));
        com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f262642n;
        if (weButton3 == null) {
            kotlin.jvm.internal.o.o("closeBtn");
            throw null;
        }
        android.content.Context context = this.f118381d;
        weButton3.setText(context.getResources().getString(com.tencent.mm.R.string.f491819mo4));
        com.tencent.mm.ui.widget.button.WeButton weButton4 = this.f262641m;
        if (weButton4 == null) {
            kotlin.jvm.internal.o.o("stopCloseBtn");
            throw null;
        }
        weButton4.setText(context.getResources().getString(com.tencent.mm.R.string.eqf));
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.f487736sa3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseLinkTipsPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/ktv/panel/FinderLiveKTVCloseLinkTipsPanel", "initContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f262643o;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        } else {
            kotlin.jvm.internal.o.o("contentText");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        z(1);
        z(2);
    }

    public final void z(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("status", this.f262644p);
        jSONObject.put("type", 1);
        jSONObject.put("element", i17);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327265s2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
