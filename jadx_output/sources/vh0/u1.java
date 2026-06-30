package vh0;

/* loaded from: classes3.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.a1 f436969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f436970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xj.m f436971f;

    public u1(vh0.a1 a1Var, kotlin.jvm.internal.h0 h0Var, xj.m mVar) {
        this.f436969d = a1Var;
        this.f436970e = h0Var;
        this.f436971f = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vh0.a1 a1Var = this.f436969d;
        if (a1Var != null) {
            a1Var.b();
        }
        db5.d5 d5Var = (db5.d5) this.f436970e.f310123d;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        xj.m mVar = this.f436971f;
        if (mVar != null && (str = mVar.f454753a) != null) {
            ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).aj(str);
        }
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
