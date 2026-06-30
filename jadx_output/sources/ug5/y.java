package ug5;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.fluent.ViewFluentTransparentActivity f427666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.ui.fluent.ViewFluentTransparentActivity viewFluentTransparentActivity) {
        super(1);
        this.f427666d = viewFluentTransparentActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.app.Activity activity = (android.app.Activity) obj;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.ui.fluent.ViewFluentTransparentActivity viewFluentTransparentActivity = this.f427666d;
        if (viewFluentTransparentActivity.K6(activity)) {
            z17 = true;
            viewFluentTransparentActivity.f208609d = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
