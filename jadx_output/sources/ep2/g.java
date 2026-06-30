package ep2;

/* loaded from: classes2.dex */
public final class g extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f255713a;

    public g(android.widget.ImageView imageView) {
        this.f255713a = imageView;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "#bindActivityIcon onViewExposedListener false, cancel it");
        android.widget.ImageView iconView = this.f255713a;
        kotlin.jvm.internal.o.f(iconView, "$iconView");
        java.lang.Object tag = iconView.getTag(com.tencent.mm.R.id.fuo);
        if (tag instanceof kotlinx.coroutines.r2) {
            kotlinx.coroutines.p2.a((kotlinx.coroutines.r2) tag, null, 1, null);
        }
    }
}
