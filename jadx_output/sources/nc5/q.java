package nc5;

/* loaded from: classes.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.r f336226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336227e;

    public q(nc5.r rVar, int i17) {
        this.f336226d = rVar;
        this.f336227e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQuerySugAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f336226d.f336229e.invoke(java.lang.Integer.valueOf(this.f336227e));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQuerySugAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
