package eg4;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.i0 f252693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.ib f252695f;

    public e0(eg4.i0 i0Var, android.content.Context context, com.tencent.mm.storage.ib ibVar) {
        this.f252693d = i0Var;
        this.f252694e = context;
        this.f252695f = ibVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f252694e;
        kotlin.jvm.internal.o.f(context, "$context");
        eg4.i0.n(this.f252693d, context, this.f252695f);
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
