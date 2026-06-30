package rr3;

/* loaded from: classes3.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr3.r f399203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399204e;

    public n(rr3.r rVar, int i17) {
        this.f399203d = rVar;
        this.f399204e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$AuthScopeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rr3.r.x(this.f399203d, this.f399204e);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$AuthScopeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
