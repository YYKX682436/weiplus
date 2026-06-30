package gv2;

/* loaded from: classes10.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.i f276090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gv2.c1 f276091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f276092f;

    public w0(jv2.i iVar, gv2.c1 c1Var, in5.s0 s0Var) {
        this.f276090d = iVar;
        this.f276091e = c1Var;
        this.f276092f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jv2.i iVar = this.f276090d;
        r45.xk bizInfo = iVar.f302223d.getBizInfo();
        in5.s0 s0Var = this.f276092f;
        if (bizInfo != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String string = bizInfo.getString(0);
            if (string == null) {
                string = "";
            }
            so2.g0.a(iVar, context, string, ((com.tencent.mm.plugin.finder.uniComments.q3) this.f276091e.f275996e).f130372i);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String L0 = iVar.f302223d.L0();
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            so2.g0.c(iVar, L0, context2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert$onBindViewHolder$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
