package gv2;

/* loaded from: classes10.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.i f275994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f275995e;

    public c0(jv2.i iVar, in5.s0 s0Var) {
        this.f275994d = iVar;
        this.f275995e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        jv2.i iVar = this.f275994d;
        java.lang.String L0 = iVar.f302223d.L0();
        in5.s0 s0Var = this.f275995e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.Bk(L0, context);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (context2 instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zi(1, iVar.f302223d.field_feedId, nyVar.V6(), 2, iVar.f302223d.L0());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
