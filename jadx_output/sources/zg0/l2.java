package zg0;

/* loaded from: classes.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f472760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(android.content.Intent intent) {
        super(0);
        this.f472760d = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f472760d.getBooleanExtra("useJs", true));
    }
}
