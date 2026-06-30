package su3;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su3.d f412773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f412774e;

    public c(su3.d dVar, int i17) {
        this.f412773d = dVar;
        this.f412774e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        su3.d dVar = this.f412773d;
        int i17 = dVar.f412776e;
        int i18 = this.f412774e;
        dVar.f412776e = i18;
        dVar.notifyItemChanged(i17);
        dVar.notifyItemChanged(dVar.f412776e);
        yz5.p pVar = dVar.f412777f;
        if (pVar != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            java.lang.Object obj = dVar.f412775d.get(i18);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            pVar.invoke(valueOf, obj);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
