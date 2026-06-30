package qv4;

/* loaded from: classes12.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.j f366969d;

    public f(qv4.j jVar) {
        this.f366969d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/global/FTSGlobalTeachController$onInitRecyclerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qv4.j jVar = this.f366969d;
        jVar.f().g().a();
        jVar.f().i();
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/global/FTSGlobalTeachController$onInitRecyclerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
