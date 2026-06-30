package hp1;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView f282916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f282917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView floatBallVideoPanelView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f282916d = floatBallVideoPanelView;
        this.f282917e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ball.appbrand.FloatBallVideoPanelView floatBallVideoPanelView = this.f282916d;
        android.widget.ImageView imageView = floatBallVideoPanelView.f92978d;
        if (imageView != null) {
            imageView.setImageBitmap(this.f282917e);
        }
        android.widget.ImageView imageView2 = floatBallVideoPanelView.f92979e;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
