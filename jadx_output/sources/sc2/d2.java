package sc2;

/* loaded from: classes2.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f405827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.view.View view, android.view.View view2, sc2.f2 f2Var, android.view.View view3) {
        super(0);
        this.f405825d = view;
        this.f405826e = view2;
        this.f405827f = f2Var;
        this.f405828g = view3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f405825d;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view.findViewById(com.tencent.mm.R.id.eej);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.edk);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f484482pw4);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.eet);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view.findViewById(com.tencent.mm.R.id.eei);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.edj);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.edl);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ees);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f484500q54);
        this.f405826e.getGlobalVisibleRect(new android.graphics.Rect());
        sc2.f2 f2Var = this.f405827f;
        android.view.View view2 = this.f405828g;
        android.view.View view3 = this.f405826e;
        ad2.h.F(f2Var, view2, view3, 0L, null, new sc2.c2(view3, view2, viewGroup, findViewById3), 12, null);
        sc2.f2 f2Var2 = this.f405827f;
        kotlin.jvm.internal.o.d(roundedCornerFrameLayout2);
        kotlin.jvm.internal.o.d(roundedCornerFrameLayout);
        ad2.h.F(f2Var2, roundedCornerFrameLayout2, roundedCornerFrameLayout, 0L, null, null, 28, null);
        sc2.f2 f2Var3 = this.f405827f;
        kotlin.jvm.internal.o.d(textView2);
        kotlin.jvm.internal.o.d(textView);
        ad2.h.F(f2Var3, textView2, textView, 0L, null, null, 28, null);
        sc2.f2 f2Var4 = this.f405827f;
        kotlin.jvm.internal.o.d(findViewById2);
        kotlin.jvm.internal.o.d(findViewById);
        ad2.h.F(f2Var4, findViewById2, findViewById, 0L, null, null, 28, null);
        sc2.f2 f2Var5 = this.f405827f;
        kotlin.jvm.internal.o.d(viewGroup2);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        ad2.h.F(f2Var5, viewGroup2, viewGroup2, 0L, valueOf, null, 20, null);
        viewGroup.setAlpha(0.0f);
        if (findViewById3.getVisibility() == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(valueOf);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/component/FeedBaseCardJumperObserver$originalExpandAnimate$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f302826a;
    }
}
