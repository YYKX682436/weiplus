package qx1;

/* loaded from: classes12.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f367305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f367306e;

    public p(qx1.q qVar, mx1.a aVar) {
        this.f367306e = qVar;
        this.f367305d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        px1.b bVar = px1.v.f358860a;
        qx1.q qVar = this.f367306e;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!qVar.f367320n);
        nx1.z zVar = qVar.f367307a;
        if (zVar != null) {
            zVar.d(bVar, valueOf);
        }
        boolean z17 = !qVar.f367320n;
        qVar.f367320n = z17;
        qx1.q.a(qVar, view, z17);
        qx1.q.b(qVar, this.f367305d);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
