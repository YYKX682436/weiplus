package sj5;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context) {
        super(0);
        this.f408922d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Float.valueOf(android.view.ViewConfiguration.get(this.f408922d).getScaledTouchSlop());
    }
}
