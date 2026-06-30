package ls2;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f321024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls2.a f321025e;

    public e(in5.s0 s0Var, ls2.a aVar) {
        this.f321024d = s0Var;
        this.f321025e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/servicemenu/ProfileMenuConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc2.y2 y2Var = xc2.y2.f453343a;
        in5.s0 s0Var = this.f321024d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ls2.a aVar = this.f321025e;
        xc2.y2.i(y2Var, context, aVar.f321020d, 0, null, 12, null);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ls2.b bVar = ls2.g.f321028e;
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        org.json.JSONObject a17 = bVar.a(context3, aVar.f321020d.f453234a);
        ya2.b2 b2Var = aVar.f321020d.f453249k;
        a17.put("finderusername", b2Var != null ? b2Var.D0() : "");
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, V6, "menu", 1, a17, false, null, 48, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/servicemenu/ProfileMenuConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
