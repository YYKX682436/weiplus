package dt2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.d f243157d;

    public a(dt2.d dVar) {
        this.f243157d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dt2.d dVar = this.f243157d;
        dt2.d.a(dVar, false, dVar.f243165e, dVar.getObjId());
        com.tencent.mm.ui.widget.dialog.y1 bottomSheet = dVar.getBottomSheet();
        if (bottomSheet != null) {
            bottomSheet.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
