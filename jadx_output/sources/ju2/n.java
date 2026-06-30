package ju2;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context) {
        super(0);
        this.f301826d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f301826d;
        android.content.res.Resources resources = context.getResources();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) resources.getDimension(com.tencent.mm.R.dimen.f479648bn));
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }
}
