package xf2;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView f454269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f454270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f454271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f454272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f454273h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView, android.graphics.Bitmap bitmap, boolean z17, float f17, float f18) {
        super(0);
        this.f454269d = screenShotView;
        this.f454270e = bitmap;
        this.f454271f = z17;
        this.f454272g = f17;
        this.f454273h = f18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView = this.f454269d;
        screenShotView.f111606m.setVisibility(0);
        android.widget.ImageView imageView = screenShotView.f111606m;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            android.content.Context context = screenShotView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            float a17 = com.tencent.mm.plugin.appbrand.ui.u5.a(context, this.f454271f ? 40 : 32);
            float f17 = this.f454272g;
            layoutParams.height = (int) (a17 * f17);
            layoutParams.width = (int) (imageView.getHeight() * this.f454273h);
            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                kotlin.jvm.internal.o.f(screenShotView.getContext(), "getContext(...)");
                kotlin.jvm.internal.o.f(screenShotView.getContext(), "getContext(...)");
                ((android.widget.RelativeLayout.LayoutParams) layoutParams).setMargins((int) (com.tencent.mm.plugin.appbrand.ui.u5.a(r7, 16) * f17), 0, 0, (int) (com.tencent.mm.plugin.appbrand.ui.u5.a(r0, 16) * f17));
            }
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setImageBitmap(this.f454270e);
        return jz5.f0.f302826a;
    }
}
