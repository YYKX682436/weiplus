package yv0;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f465991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Context context) {
        super(0);
        this.f465991d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f465991d.getResources().getDisplayMetrics().widthPixels);
    }
}
