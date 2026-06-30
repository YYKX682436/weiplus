package e23;

/* loaded from: classes8.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.b1 f246968d;

    public u0(e23.b1 b1Var) {
        this.f246968d = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem$inflateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.b3 b3Var = com.tencent.mm.plugin.fts.ui.c3.f138030a;
        kotlin.jvm.internal.o.d(view);
        java.lang.String i17 = this.f246968d.i();
        kotlin.jvm.internal.o.f(i17, "getQuery(...)");
        b3Var.a(view, i17);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem$inflateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
