package qx1;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.z f367300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx1.a f367301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx1.q f367302f;

    public n(qx1.q qVar, nx1.z zVar, mx1.a aVar) {
        this.f367302f = qVar;
        this.f367300d = zVar;
        this.f367301e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ix1.k kVar = new ix1.k();
        nx1.z zVar = this.f367300d;
        if (zVar != null) {
            nx1.d.q().r(kVar, zVar.c(), true, true, false, false, true);
        } else {
            nx1.d.q().r(kVar, null, true, true, false, false, true);
        }
        qx1.q.b(this.f367302f, this.f367301e);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
