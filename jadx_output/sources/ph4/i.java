package ph4;

/* loaded from: classes8.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph4.j f354484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph4.b f354485e;

    public i(ph4.j jVar, ph4.b bVar) {
        this.f354484d = jVar;
        this.f354485e = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ph4.e) this.f354484d.f354486a).e(this.f354485e.getAdapterPosition());
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
