package kp;

/* loaded from: classes13.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kp.i1 i1Var) {
        super(1);
        this.f310854d = i1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("WiFiDirectService", "cancel connectToGroup");
        this.f310854d.f310770n = null;
        return jz5.f0.f302826a;
    }
}
