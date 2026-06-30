package yr3;

/* loaded from: classes8.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f464760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yr3.e f464761e;

    public d(r45.s5 s5Var, yr3.e eVar) {
        this.f464760d = s5Var;
        this.f464761e = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/ExpandViewHolder$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f464760d.f385514i.f382753d.f379143i = true;
        this.f464761e.f464781d.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ExpandViewHolder$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
