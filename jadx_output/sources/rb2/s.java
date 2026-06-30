package rb2;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rb2.v f393745f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393746g;

    public s(android.view.View view, android.view.View view2, rb2.v vVar, so2.y0 y0Var) {
        this.f393743d = view;
        this.f393744e = view2;
        this.f393745f = vVar;
        this.f393746g = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshLoadMore$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f393743d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshLoadMore$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshLoadMore$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f393744e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshLoadMore$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshLoadMore$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f393745f.f393686e.o(this.f393746g, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderAdCommentConvert$refreshLoadMore$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
