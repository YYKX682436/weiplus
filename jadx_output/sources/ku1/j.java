package ku1;

/* loaded from: classes15.dex */
public class j implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt1.j f312104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku1.l f312105e;

    public j(ku1.l lVar, tt1.j jVar) {
        this.f312105e = lVar;
        this.f312104d = jVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getId() == com.tencent.mm.R.id.c0u) {
            ku1.l lVar = this.f312105e;
            com.tencent.mm.sdk.platformtools.b0.d(lVar.f312131b, null, this.f312104d.i0().f385189o, null);
            db5.e1.T(lVar.f312131b, kk.v.a(com.tencent.mm.R.string.f490361st));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
