package tj4;

/* loaded from: classes11.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f419825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tj4.e f419826e;

    public d(int i17, tj4.e eVar) {
        this.f419825d = i17;
        this.f419826e = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/adapter/TopicSelfStatusAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tj4.e eVar = this.f419826e;
        int i17 = this.f419825d;
        if (i17 == 0) {
            yz5.p pVar = eVar.f419831h;
            if (pVar != null) {
                pVar.invoke("-1", java.lang.Integer.valueOf(i17));
            }
        } else {
            yz5.p pVar2 = eVar.f419831h;
            if (pVar2 != null) {
                pVar2.invoke(((tj4.a) eVar.f419827d.get(i17)).f419818f, java.lang.Integer.valueOf(i17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/adapter/TopicSelfStatusAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
