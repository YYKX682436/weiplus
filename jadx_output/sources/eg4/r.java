package eg4;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.t f252784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.i2 f252785e;

    public r(eg4.t tVar, eg4.i2 i2Var) {
        this.f252784d = tVar;
        this.f252785e = i2Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert$onBindViewHolder$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p pVar = this.f252784d.f252808e;
        if (pVar != null) {
            kotlin.jvm.internal.o.d(view);
            z17 = ((java.lang.Boolean) pVar.invoke(view, this.f252785e)).booleanValue();
        } else {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert$onBindViewHolder$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
