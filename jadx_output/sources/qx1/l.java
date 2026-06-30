package qx1;

/* loaded from: classes12.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f367296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f367297e;

    public l(qx1.q qVar, mx1.a aVar) {
        this.f367297e = qVar;
        this.f367296d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qx1.q qVar = this.f367297e;
        qVar.f367313g.setPressed(false);
        qVar.f367312f.setPressed(false);
        if (qVar.f367318l || qVar.f367319m) {
            qVar.f367317k = false;
        }
        px1.c cVar = px1.v.f358862c;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!qVar.f367317k);
        nx1.z zVar = qVar.f367307a;
        if (zVar != null) {
            zVar.d(cVar, valueOf);
        }
        boolean z17 = !qVar.f367317k;
        qVar.f367317k = z17;
        qx1.q.a(qVar, view, z17);
        qx1.q.b(qVar, this.f367296d);
        qVar.f367318l = false;
        qVar.f367319m = false;
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
