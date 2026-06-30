package k13;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(k13.l1 l1Var) {
        super(0);
        this.f303231d = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return ((android.os.PowerManager) ((jz5.n) this.f303231d.f303214h).getValue()).newWakeLock(26, "wx:MsgWindowLock");
    }
}
