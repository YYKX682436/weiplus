package gc0;

/* loaded from: classes5.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.kl5 f270282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f270283h;

    public t1(yz5.l lVar, java.lang.String str, gc0.p2 p2Var, r45.kl5 kl5Var, android.view.View view) {
        this.f270279d = lVar;
        this.f270280e = str;
        this.f270281f = p2Var;
        this.f270282g = kl5Var;
        this.f270283h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$initRecommendPhone$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.Boolean) this.f270279d.invoke(this.f270280e)).booleanValue()) {
            gc0.p2 p2Var = this.f270281f;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) p2Var.f270248m.f270148g;
            r45.kl5 kl5Var = this.f270282g;
            arrayList2.add(kl5Var);
            r45.ml5 S6 = p2Var.S6();
            java.lang.String string = kl5Var.getString(1);
            kotlin.jvm.internal.o.f(string, "getPhone(...)");
            kotlin.jvm.internal.o.g(S6, "<this>");
            java.util.LinkedList list = S6.getList(5);
            kotlin.jvm.internal.o.f(list, "getPhoneInfo(...)");
            gc0.f1.a(list, string).set(2, 1);
        }
        android.view.View view2 = this.f270283h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$initRecommendPhone$1$1$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$initRecommendPhone$1$1$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$initRecommendPhone$1$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
