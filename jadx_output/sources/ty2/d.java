package ty2;

/* loaded from: classes9.dex */
public final class d extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f423062d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f423063e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f423105e, config);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = new androidx.constraintlayout.widget.ConstraintLayout(context);
        this.f423062d = constraintLayout;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f423063e = imageView;
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setBackgroundColor(i65.a.d(context, com.tencent.mm.R.color.f478553an));
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, 0);
        layoutParams.f10893h = 0;
        layoutParams.f10899k = 0;
        layoutParams.B = "V,1:1";
        constraintLayout.addView(imageView, layoutParams);
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.util.LinkedList linkedList = item.f31943f;
        kotlin.jvm.internal.o.f(linkedList, "getImgUrls(...)");
        java.lang.String str = (java.lang.String) kz5.n0.a0(linkedList, 0);
        if (str == null) {
            str = "";
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.f().c(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), this.f423063e, g1Var.h(mn2.f1.f329953d));
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.i(a(), "coverUrl is empty");
        }
        return this.f423062d;
    }
}
