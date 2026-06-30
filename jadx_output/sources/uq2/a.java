package uq2;

/* loaded from: classes2.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.FinderLiveSquareSpecialTempUI f430218d;

    public a(com.tencent.mm.plugin.finder.nearby.ui.FinderLiveSquareSpecialTempUI finderLiveSquareSpecialTempUI) {
        this.f430218d = finderLiveSquareSpecialTempUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/FinderLiveSquareSpecialTempUI$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f430218d.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/FinderLiveSquareSpecialTempUI$initUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
