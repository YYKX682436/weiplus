package rv0;

/* loaded from: classes.dex */
public final class b5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f399940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(android.content.Context context) {
        super(0);
        this.f399940d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f399940d.getResources().getDisplayMetrics().widthPixels);
    }
}
