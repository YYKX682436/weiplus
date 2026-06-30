package ut2;

/* loaded from: classes3.dex */
public final class x3 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.a4 f431152d;

    public x3(ut2.a4 a4Var) {
        this.f431152d = a4Var;
        setColor(i65.a.d(a4Var.f430819a.getContext(), com.tencent.mm.R.color.f478524a5), i65.a.d(a4Var.f430819a.getContext(), com.tencent.mm.R.color.ahd));
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        bw5.q30 q30Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$setPresentDesc$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        st2.h1 h1Var = this.f431152d.f430820b;
        r45.dv1 dv1Var = ((mm2.f6) h1Var.f412335f.a(mm2.f6.class)).P;
        if (dv1Var != null && (q30Var = (bw5.q30) dv1Var.getCustom(41)) != null) {
            bw5.x7 x7Var = q30Var.f31920g[3] ? q30Var.f31919f : new bw5.x7();
            if (x7Var != null) {
                i95.m c17 = i95.n0.c(pq.q.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                android.content.Context context = h1Var.h().getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pq.q.Lb((pq.q) c17, new pq.a(context), x7Var, null, 4, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder$setPresentDesc$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
