package hs4;

/* loaded from: classes9.dex */
public class a implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.d f284605d;

    public a(hs4.d dVar) {
        this.f284605d = dVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        hs4.d dVar = this.f284605d;
        if (i17 >= dVar.f284621f.size() + dVar.f284622g.size()) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (i17 < dVar.f284621f.size()) {
            db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) dVar.f284621f.f228344d).get(i17);
            if (h4Var != null && h4Var.f228375s) {
                yj0.a.h(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            db5.t4 t4Var = dVar.f284619d;
            if (t4Var != null) {
                t4Var.onMMMenuItemSelected(h4Var, i17);
            } else {
                h4Var.c();
            }
            dVar.f284628m = i17;
        } else if (dVar.f284622g.size() > 0 && i17 < dVar.f284621f.size() + dVar.f284622g.size()) {
            db5.h4 h4Var2 = (db5.h4) ((java.util.ArrayList) dVar.f284622g.f228344d).get(i17 - dVar.f284621f.size());
            if (h4Var2 != null && h4Var2.f228375s) {
                yj0.a.h(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else {
                db5.t4 t4Var2 = dVar.f284620e;
                if (t4Var2 != null) {
                    t4Var2.onMMMenuItemSelected(h4Var2, i17);
                }
            }
        }
        dVar.f284623h.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/ui/BankCardListBottomSheetUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
