package yx0;

/* loaded from: classes5.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(yx0.b8 b8Var) {
        super(1);
        this.f467305d = b8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        if (th6 != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "switchBeauty >> Error: " + th6.getMessage());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchBeauty >> Success");
        }
        yx0.v vVar = yx0.v.f467695f;
        java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f467171c2;
        this.f467305d.q0(vVar);
        return jz5.f0.f302826a;
    }
}
