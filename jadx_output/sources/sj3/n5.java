package sj3;

/* loaded from: classes14.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView f408657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f408658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView, android.widget.TextView textView) {
        super(0);
        this.f408657d = screenCastBigView;
        this.f408658e = textView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView maskView;
        com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView = this.f408657d;
        maskView = screenCastBigView.getMaskView();
        maskView.setVisibility(0);
        android.widget.TextView textView = this.f408658e;
        screenCastBigView.f150360h = textView;
        screenCastBigView.f150357e = 3;
        screenCastBigView.addView(textView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        return jz5.f0.f302826a;
    }
}
