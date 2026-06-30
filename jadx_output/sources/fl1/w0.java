package fl1;

/* loaded from: classes4.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263886e;

    public w0(fl1.c1 c1Var, android.content.Context context) {
        this.f263886e = c1Var;
        this.f263885d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.c1 c1Var = this.f263886e;
        android.widget.RatingBar ratingBar = c1Var.f263739k;
        if (ratingBar != null) {
            int rating = (int) ratingBar.getRating();
            c1Var.getClass();
            r45.et6 et6Var = new r45.et6();
            et6Var.f373724d = c1Var.f263729a;
            et6Var.f373725e = 3;
            r45.ll0 ll0Var = new r45.ll0();
            et6Var.f373726f = ll0Var;
            ll0Var.f379570d = rating;
            c1Var.f263731c = rating;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "saveEvaluateScore, userName:%s, score:%d", c1Var.f263729a, java.lang.Integer.valueOf(rating));
            c1Var.j(et6Var);
            android.content.Context context = this.f263885d;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490120lh), 0).show();
            c1Var.f263730b = true;
            c1Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
