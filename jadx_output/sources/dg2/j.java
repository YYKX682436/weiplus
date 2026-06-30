package dg2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg2.m f232301d;

    public j(dg2.m mVar) {
        this.f232301d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/view/LiveQuestBottomSheet$show$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f232301d.f232313h;
        if (k0Var != null) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/view/LiveQuestBottomSheet$show$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
