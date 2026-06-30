package ec3;

/* loaded from: classes.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f251032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f251033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f251034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f251035g;

    public h1(boolean z17, kotlin.jvm.internal.h0 h0Var, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f251032d = z17;
        this.f251033e = h0Var;
        this.f251034f = imageView;
        this.f251035g = imageView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f251033e;
        boolean z17 = this.f251032d;
        if (z17) {
            android.widget.ImageView imageView = (android.widget.ImageView) h0Var.f310123d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyRecommendConvert", "[Load thumbView] Result : " + z17);
            android.widget.ImageView imageView2 = (android.widget.ImageView) h0Var.f310123d;
            if (imageView2 != null) {
                imageView2.setImageBitmap(null);
            }
            android.widget.ImageView imageView3 = this.f251034f;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
        }
        android.widget.ImageView imageView4 = this.f251035g;
        if (imageView4 != null && imageView4.getVisibility() == 4) {
            imageView4.setVisibility(0);
        }
    }
}
