package ku1;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku1.i f312089d;

    public h(ku1.i iVar) {
        this.f312089d = iVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getId() == com.tencent.mm.R.id.c0u) {
            ku1.i iVar = this.f312089d;
            com.tencent.mm.sdk.platformtools.b0.d(iVar.f312093b, null, iVar.f312095d.i0().f385189o, null);
            db5.e1.T(iVar.f312093b, ((com.tencent.mm.plugin.card.ui.b0) iVar.f312132a).h(com.tencent.mm.R.string.f490361st));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
