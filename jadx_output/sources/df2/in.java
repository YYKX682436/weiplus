package df2;

/* loaded from: classes.dex */
public final class in extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f230414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ln f230415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f230416f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(android.graphics.Bitmap bitmap, df2.ln lnVar, android.widget.ImageView imageView) {
        super(0);
        this.f230414d = bitmap;
        this.f230415e = lnVar;
        this.f230416f = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        df2.ln lnVar = this.f230415e;
        android.graphics.Bitmap bitmap = this.f230414d;
        if (bitmap != null) {
            android.view.View view = lnVar.f230677n;
            findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.r29) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$showLotteryResult$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$showLotteryResult$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            this.f230416f.setImageBitmap(bitmap);
        } else {
            android.view.View view3 = lnVar.f230677n;
            findViewById = view3 != null ? view3.findViewById(com.tencent.mm.R.id.r29) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                android.view.View view4 = findViewById;
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$showLotteryResult$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/controller/LiveMileStoneLotteryResultController$showLotteryResult$3$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            com.tencent.mars.xlog.Log.e(lnVar.f230676m, "load foreground failed");
        }
        return jz5.f0.f302826a;
    }
}
