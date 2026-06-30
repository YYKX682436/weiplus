package rl5;

/* loaded from: classes15.dex */
public class i implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f397320d;

    public i(rl5.r rVar) {
        this.f397320d = rVar;
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
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        rl5.r rVar = this.f397320d;
        db5.t4 t4Var = rVar.f397354x;
        if (t4Var != null) {
            if (!rVar.K || i17 < 1) {
                t4Var.onMMMenuItemSelected(rVar.f397356z.getItem(i17), i17);
            } else {
                t4Var.onMMMenuItemSelected(rVar.f397356z.getItem(i17 - 1), i17);
            }
        }
        com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = rVar.f397340h;
        if (mMListPopupWindow != null && mMListPopupWindow.f197477g.isShowing()) {
            rVar.f397340h.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
