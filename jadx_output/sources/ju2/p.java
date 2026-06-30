package ju2;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(0);
        this.f301829d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f301829d;
        android.content.res.Resources resources = context.getResources();
        android.widget.TextView textView = new android.widget.TextView(context);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) resources.getDimension(com.tencent.mm.R.dimen.f479644bj));
        layoutParams.setMarginEnd((int) resources.getDimension(com.tencent.mm.R.dimen.f479738dv));
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(resources.getColor(com.tencent.mm.R.color.FG_2));
        textView.setTextSize(0, resources.getDimension(com.tencent.mm.R.dimen.f479673ca));
        return textView;
    }
}
