package ls1;

/* loaded from: classes8.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f320992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17) {
        super(0);
        this.f320992d = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Looper.myQueue().addIdleHandler(new ls1.h0(this.f320992d));
        return jz5.f0.f302826a;
    }
}
