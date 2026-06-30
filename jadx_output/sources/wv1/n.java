package wv1;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv1.o f449957d;

    public n(wv1.o oVar) {
        this.f449957d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wv1.a aVar = (wv1.a) view.getTag();
        if (aVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        wv1.o oVar = this.f449957d;
        boolean z17 = !oVar.f449967o.isChecked();
        if (aVar.i()) {
            oVar.f449967o.setChecked(z17);
            com.tencent.mm.plugin.choosemsgfile.logic.ui.v vVar = ((com.tencent.mm.plugin.choosemsgfile.logic.ui.a) aVar.f449929a).f95526g;
            if (vVar != null) {
                vVar.a(z17, aVar, oVar);
            }
            android.widget.ImageView imageView = oVar.f449966n;
            if (z17) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
