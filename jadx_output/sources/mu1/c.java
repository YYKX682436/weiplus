package mu1;

/* loaded from: classes15.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.w50 f331342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mu1.e f331343e;

    public c(mu1.e eVar, r45.w50 w50Var) {
        this.f331343e = eVar;
        this.f331342d = w50Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/widget/CardWidgetCommon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.w50 w50Var = this.f331342d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388894w);
        mu1.e eVar = this.f331343e;
        if (!K0 && !com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388895x)) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vj(eVar.f331335b, w50Var.f388894w, w50Var.f388895x, false, 16, lu1.a0.g(3));
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388887p)) {
            lu1.d.d(eVar.f331334a.g(), w50Var.f388887p, w50Var.f388888q, 1028, 0);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388881g)) {
            lu1.d.j((com.tencent.mm.ui.MMActivity) eVar.f331335b, w50Var.f388881g, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/widget/CardWidgetCommon$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
