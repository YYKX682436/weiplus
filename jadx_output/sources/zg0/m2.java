package zg0;

/* loaded from: classes.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f472761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(android.content.Intent intent) {
        super(0);
        this.f472761d = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f472761d.getBooleanExtra("usePlugin", true));
    }
}
