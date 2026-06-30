package yx0;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f467268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f467268d = weakReference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yx0.b8 b8Var = (yx0.b8) this.f467268d.get();
        if (b8Var != null) {
            kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.r3(b8Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
