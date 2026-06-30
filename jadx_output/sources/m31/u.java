package m31;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f323216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.view.View view, android.content.Context context) {
        super(0);
        this.f323215d = view;
        this.f323216e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f323215d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.content.Context context = this.f323216e;
        kotlin.jvm.internal.o.f(context, "$context");
        int measuredWidth = view.getMeasuredWidth();
        int b17 = a06.d.b(context.getResources().getDisplayMetrics().density * 375);
        int max = java.lang.Math.max(b17, context.getResources().getDisplayMetrics().widthPixels / 2);
        if (measuredWidth < b17) {
            measuredWidth = b17;
        } else if (measuredWidth > max) {
            measuredWidth = max;
        }
        layoutParams.width = java.lang.Math.min(measuredWidth, context.getResources().getDisplayMetrics().widthPixels);
        com.tencent.mm.sdk.platformtools.u3.h(new m31.y(view));
        return jz5.f0.f302826a;
    }
}
