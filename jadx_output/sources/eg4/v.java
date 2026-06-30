package eg4;

/* loaded from: classes4.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.d2 f252820e;

    public v(android.content.Context context, eg4.d2 d2Var) {
        this.f252819d = context;
        this.f252820e = d2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordHeaderItemConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Search_Scene", 2).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
        android.content.Context context = this.f252819d;
        ((s50.g0) vVar).getClass();
        o13.n.q(context, ".ui.FTSAddFriendUI", putExtra);
        ((ku5.t0) ku5.t0.f312615d).q(new eg4.u(this.f252820e));
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordHeaderItemConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
