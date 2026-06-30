package uj;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final uj.f f428152a = new uj.f();

    /* renamed from: b, reason: collision with root package name */
    public static uj.p f428153b;

    public final void a() {
        com.tencent.mars.xlog.Log.i("MagicPlayableMgr", "releasePlayableService");
        uj.p pVar = f428153b;
        if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "cleanup");
            pVar.f428172g = null;
            pm0.v.X(new uj.o(pVar));
            pVar.f428171f = null;
            pVar.f428170e = null;
            bf3.p pVar2 = pVar.f428174i;
            if (pVar2 != null) {
                pVar2.b();
            }
            jc3.j0 j0Var = pVar.f428169d;
            if (j0Var == null) {
                kotlin.jvm.internal.o.o("magicBrush");
                throw null;
            }
            ((rc3.w0) j0Var).destroy();
            uj.k.f428161a.a().d();
        }
        f428153b = null;
    }
}
