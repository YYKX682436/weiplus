package dg2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f232299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg2.m f232300e;

    public i(kotlin.jvm.internal.c0 c0Var, dg2.m mVar) {
        this.f232299d = c0Var;
        this.f232300e = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/view/LiveQuestBottomSheet$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f232299d.f310112d = true;
        dg2.m mVar = this.f232300e;
        yz5.l lVar = mVar.f232311f;
        if (lVar != null) {
            lVar.invoke(mVar.a().f232289e);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = mVar.f232313h;
        if (k0Var != null) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/view/LiveQuestBottomSheet$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
