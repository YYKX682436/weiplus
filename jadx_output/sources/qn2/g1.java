package qn2;

/* loaded from: classes3.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f365067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f365068e;

    public g1(qn2.l1 l1Var, r45.ce0 ce0Var) {
        this.f365067d = l1Var;
        this.f365068e = ce0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setProductInfoIfNeeded$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        r45.ce0 ce0Var = this.f365068e;
        java.lang.String str2 = "";
        if (ce0Var == null || (str = ce0Var.getString(0)) == null) {
            str = "";
        }
        b1Var.f317014b = str;
        if (ce0Var != null && (string = ce0Var.getString(1)) != null) {
            str2 = string;
        }
        b1Var.f317022f = str2;
        b1Var.f317032k = 1205;
        float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
            f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        }
        b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, (int) ((ae2.in.f3688a.h0() / 100.0f) * f17), null, false, null, false, null, k91.t2.f305768f, true, false, null, null, true, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, true, 0, false, true, false, false, null, null, null, false, null, null, false, -1073746308, 2045, null);
        dk2.ah ahVar = new dk2.ah();
        ahVar.f233218n = false;
        ahVar.f233223s = true;
        b1Var.f317028i = ahVar;
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context = this.f365067d.f365092b.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        q4Var.n(context, this.f365067d.f365091a.S0(), b1Var, this.f365067d.f365091a.Y0());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setProductInfoIfNeeded$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
