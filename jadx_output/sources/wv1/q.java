package wv1;

/* loaded from: classes12.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv1.r f449971d;

    public q(wv1.r rVar) {
        this.f449971d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wv1.a aVar = (wv1.a) view.getTag();
        if (aVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        wv1.r rVar = this.f449971d;
        boolean z17 = !rVar.f449977h.isChecked();
        if (aVar.i()) {
            rVar.f449977h.setChecked(z17);
            com.tencent.mm.plugin.choosemsgfile.logic.ui.v vVar = ((com.tencent.mm.plugin.choosemsgfile.logic.ui.a) aVar.f449929a).f95526g;
            if (vVar != null) {
                vVar.a(z17, aVar, rVar);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
