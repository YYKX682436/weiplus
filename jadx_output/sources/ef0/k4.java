package ef0;

/* loaded from: classes11.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(java.lang.String str) {
        super(0);
        this.f252260d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.ting.TingLaterListenChannel tingLaterListenChannel = rk4.l3.f396814t;
        if (tingLaterListenChannel != null) {
            tingLaterListenChannel.refreshListRepo(this.f252260d, ef0.j4.f252243d);
        }
        return jz5.f0.f302826a;
    }
}
