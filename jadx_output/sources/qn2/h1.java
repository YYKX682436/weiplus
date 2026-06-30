package qn2;

/* loaded from: classes3.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f365073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f365074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yd4 f365075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(android.graphics.Bitmap bitmap, qn2.l1 l1Var, r45.yd4 yd4Var) {
        super(0);
        this.f365073d = bitmap;
        this.f365074e = l1Var;
        this.f365075f = yd4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qn2.l1 l1Var = this.f365074e;
        android.graphics.Bitmap bitmap = this.f365073d;
        if (bitmap != null) {
            android.widget.ImageView imageView = l1Var.f365110t;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
            }
            android.view.View findViewById = l1Var.f365092b.findViewById(com.tencent.mm.R.id.l76);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setProductInfoIfNeeded$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setProductInfoIfNeeded$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            com.tencent.mars.xlog.Log.i(l1Var.f365095e, this.f365075f.getString(1) + " resource is null");
        }
        return jz5.f0.f302826a;
    }
}
