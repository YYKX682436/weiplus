package lj2;

/* loaded from: classes10.dex */
public final class c0 implements qi2.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f318830a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.v0 f318831b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.t f318832c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.t f318833d;

    /* renamed from: e, reason: collision with root package name */
    public final lj2.s f318834e;

    /* renamed from: f, reason: collision with root package name */
    public final lj2.s f318835f;

    /* renamed from: g, reason: collision with root package name */
    public final qo0.c f318836g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f318837h;

    public c0(android.view.View root, lj2.v0 pluginAbility) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f318830a = root;
        this.f318831b = pluginAbility;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.eob);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f318832c = new lj2.t(findViewById);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.eod);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f318833d = new lj2.t(findViewById2);
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f484562eo2);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        lj2.s sVar = new lj2.s(findViewById3);
        this.f318834e = sVar;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f484563eo3);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        lj2.s sVar2 = new lj2.s(findViewById4);
        this.f318835f = sVar2;
        this.f318836g = pluginAbility.q();
        this.f318837h = true;
        lj2.u uVar = new lj2.u(this);
        sVar.f318943g.setOnClickListener(new lj2.q(uVar, this));
        sVar2.f318943g.setOnClickListener(new lj2.r(uVar, this));
    }

    public final lj2.s b() {
        return this.f318837h ? this.f318834e : this.f318835f;
    }

    public final lj2.t c() {
        return this.f318837h ? this.f318832c : this.f318833d;
    }

    public void d(yz5.a aVar) {
        if (b().f318937a.getVisibility() == 8) {
            return;
        }
        pm0.v.X(new lj2.w(this, aVar));
    }

    public void e(yz5.a aVar) {
        if (c().f318947a.getVisibility() == 8) {
            return;
        }
        pm0.v.X(new lj2.y(this, aVar));
    }

    public final void f(boolean z17) {
        this.f318837h = z17;
        this.f318834e.f318937a.setTranslationX(0.0f);
        this.f318832c.f318947a.setTranslationX(0.0f);
        this.f318835f.f318937a.setTranslationX(0.0f);
        this.f318833d.f318947a.setTranslationX(0.0f);
        android.view.ViewTreeObserver viewTreeObserver = this.f318830a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(new lj2.z(this));
        }
    }

    public void g(int i17) {
        android.view.View view = this.f318830a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
