package lo2;

/* loaded from: classes2.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo2.g f320118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f320119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f320120f;

    public f(lo2.g gVar, android.view.View view, int i17) {
        this.f320118d = gVar;
        this.f320119e = view;
        this.f320120f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI$MemberFansListAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f320118d.f320124f;
        if (pVar != null) {
            android.view.View clickArea = this.f320119e;
            kotlin.jvm.internal.o.f(clickArea, "$clickArea");
            pVar.invoke(clickArea, java.lang.Integer.valueOf(this.f320120f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/ui/FinderMemberFanListUI$MemberFansListAdapter$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
