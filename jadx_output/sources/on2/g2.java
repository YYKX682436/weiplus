package on2;

/* loaded from: classes3.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.c3 f346917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.j2 f346918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f346919f;

    public g2(so2.c3 c3Var, on2.j2 j2Var, in5.s0 s0Var) {
        this.f346917d = c3Var;
        this.f346918e = j2Var;
        this.f346919f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert$setClaimInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327607w, "");
        so2.c3 c3Var = this.f346917d;
        int i17 = c3Var.f410300h;
        in5.s0 s0Var = this.f346919f;
        if (i17 == 1) {
            on2.j2.n(this.f346918e, s0Var, c3Var.f410299g);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", c3Var.f410298f);
            j45.l.j(s0Var.f293121e, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert$setClaimInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
