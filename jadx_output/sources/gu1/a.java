package gu1;

/* loaded from: classes15.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu1.d f275867d;

    public a(gu1.d dVar) {
        this.f275867d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.kga) {
            gu1.d dVar = this.f275867d;
            if (dVar.f275878j.isChecked()) {
                gu1.c cVar = dVar.f275882n;
                if (cVar != null) {
                    xt1.t0.Ri().b(((gu1.f) cVar).f275887a.f94683d.g(), 1, 1, 1);
                }
            } else {
                gu1.c cVar2 = dVar.f275882n;
                if (cVar2 != null) {
                    xt1.t0.Ri().b(((gu1.f) cVar2).f275887a.f94683d.g(), 0, 1, 1);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
