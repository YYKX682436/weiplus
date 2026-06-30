package gc0;

/* loaded from: classes3.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f270188g;

    public i2(yz5.l lVar, java.lang.String str, gc0.p2 p2Var, db5.d5 d5Var) {
        this.f270185d = lVar;
        this.f270186e = str;
        this.f270187f = p2Var;
        this.f270188g = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$popupImage$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f270185d;
        java.lang.String str = this.f270186e;
        if (((java.lang.Boolean) lVar.invoke(str)).booleanValue()) {
            gc0.p2 p2Var = this.f270187f;
            gc0.e1 e1Var = p2Var.f270248m;
            e1Var.getClass();
            kotlin.jvm.internal.o.g(str, "<set-?>");
            e1Var.f270149h = str;
            this.f270188g.dismiss();
            p2Var.f270243e = gc0.g2.f270174d;
            p2Var.f270242d = gc0.h2.f270180d;
        }
        yj0.a.h(this, "com/tencent/mm/feature/profile/remark/RecommendRemarkUIC$popupImage$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
