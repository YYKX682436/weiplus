package fl1;

/* loaded from: classes4.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263882g;

    public v0(fl1.c1 c1Var, android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f263882g = c1Var;
        this.f263879d = context;
        this.f263880e = str;
        this.f263881f = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.c1 c1Var = this.f263882g;
        c1Var.c(4, 1);
        android.widget.RatingBar ratingBar = c1Var.f263739k;
        int rating = ratingBar != null ? (int) ratingBar.getRating() : 0;
        c1Var.getClass();
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class) != null) {
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = "wxbfac0b7aca45dd68";
            b1Var.f317012a = "gh_af145dc05189@app";
            b1Var.f317016c = 0;
            b1Var.f317032k = 1147;
            b1Var.f317022f = java.lang.String.format("/pages/edit/edit.html?appid=%s&appName=%s&score=%s", this.f263880e, this.f263881f, java.lang.Integer.valueOf(rating));
            b1Var.f317037o = new fl1.j0(c1Var);
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(this.f263879d, b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
