package rr3;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr3.r f399205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399206e;

    public o(rr3.r rVar, int i17) {
        this.f399205d = rVar;
        this.f399206e = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$AuthScopeAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rr3.r.x(this.f399205d, this.f399206e);
        yj0.a.i(true, this, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$AuthScopeAdapter$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
