package eg4;

/* loaded from: classes11.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.i0 f252710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.ib f252712f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.e9 f252713g;

    public g0(eg4.i0 i0Var, android.content.Context context, com.tencent.mm.storage.ib ibVar, com.tencent.mm.storage.e9 e9Var) {
        this.f252710d = i0Var;
        this.f252711e = context;
        this.f252712f = ibVar;
        this.f252713g = e9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f252711e;
        kotlin.jvm.internal.o.f(context, "$context");
        java.lang.String str = this.f252713g.f193859a;
        kotlin.jvm.internal.o.f(str, "getFromUsername(...)");
        eg4.i0 i0Var = this.f252710d;
        i0Var.getClass();
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(context, new eg4.b0(context, str, i0Var, this.f252712f));
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
