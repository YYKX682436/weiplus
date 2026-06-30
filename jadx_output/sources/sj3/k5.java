package sj3;

/* loaded from: classes14.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView f408612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f408614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f408615g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView, android.view.View view, boolean z17, android.widget.ImageView imageView) {
        super(0);
        this.f408612d = screenCastBigView;
        this.f408613e = view;
        this.f408614f = z17;
        this.f408615g = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView maskView;
        com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView = this.f408612d;
        maskView = screenCastBigView.getMaskView();
        maskView.setVisibility(0);
        android.view.View view = this.f408613e;
        screenCastBigView.f150360h = view;
        screenCastBigView.f150357e = this.f408614f ? 2 : 1;
        screenCastBigView.addView(view, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        android.widget.ImageView imageView = this.f408615g;
        if (imageView.getBackground() instanceof android.graphics.drawable.AnimationDrawable) {
            android.graphics.drawable.Drawable background = imageView.getBackground();
            kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((android.graphics.drawable.AnimationDrawable) background).start();
        }
        return jz5.f0.f302826a;
    }
}
