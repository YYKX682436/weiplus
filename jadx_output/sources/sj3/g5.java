package sj3;

/* loaded from: classes14.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView f408544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView) {
        super(0);
        this.f408544d = screenCastBigView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView maskView;
        com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView = this.f408544d;
        android.view.View view = screenCastBigView.f150360h;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486023jw5) : null;
        if ((imageView != null ? imageView.getBackground() : null) instanceof android.graphics.drawable.AnimationDrawable) {
            android.graphics.drawable.Drawable background = imageView.getBackground();
            kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            ((android.graphics.drawable.AnimationDrawable) background).stop();
        }
        screenCastBigView.removeView(screenCastBigView.f150360h);
        maskView = screenCastBigView.getMaskView();
        maskView.setVisibility(8);
        screenCastBigView.f150360h = null;
        screenCastBigView.f150357e = 0;
        return jz5.f0.f302826a;
    }
}
