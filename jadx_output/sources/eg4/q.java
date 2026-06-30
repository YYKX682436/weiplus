package eg4;

/* loaded from: classes11.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.m7 f252780e;

    public q(android.content.Context context, com.tencent.mm.storage.m7 m7Var) {
        this.f252779d = context;
        this.f252780e = m7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.m7 m7Var = this.f252780e;
        eg4.g1.a(this.f252779d, m7Var, m7Var.field_talker, false);
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
