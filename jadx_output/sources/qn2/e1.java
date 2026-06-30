package qn2;

/* loaded from: classes3.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f365057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f365058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.gz1 f365059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(android.graphics.Bitmap bitmap, qn2.l1 l1Var, r45.gz1 gz1Var) {
        super(0);
        this.f365057d = bitmap;
        this.f365058e = l1Var;
        this.f365059f = gz1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qn2.l1 l1Var = this.f365058e;
        android.graphics.Bitmap bitmap = this.f365057d;
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
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setGameInfoIfNeeded$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setGameInfoIfNeeded$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            java.lang.String str = l1Var.f365095e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.c53 c53Var = (r45.c53) this.f365059f.getCustom(3);
            sb6.append(c53Var != null ? c53Var.getString(0) : null);
            sb6.append(" resource is null");
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
