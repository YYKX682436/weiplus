package hs;

@j95.b
/* loaded from: classes11.dex */
public final class g0 extends jm0.o implements j30.o, c01.y8 {
    @Override // jm0.o
    public void Ni(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        gm0.j1.b().a(this);
    }

    @Override // jm0.o
    public void Vi() {
        gm0.j1.b().z(this);
    }

    @Override // c01.y8
    public void a0() {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new hs.f0(null), 1, null);
        }
    }
}
