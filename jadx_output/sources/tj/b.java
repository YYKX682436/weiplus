package tj;

/* loaded from: classes7.dex */
public final class b implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public static final tj.b f419673d = new tj.b();

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onRunningStateChanged appId:" + str + " state:" + bVar);
        int i17 = bVar == null ? -1 : tj.a.f419672a[bVar.ordinal()];
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MagicPlayableMgr", "pausePlayableService");
            uj.p pVar = uj.f.f428153b;
            if (pVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "pause");
                if (pVar.f428173h) {
                    return;
                }
                jc3.j0 j0Var = pVar.f428169d;
                if (j0Var != null) {
                    ((rc3.w0) j0Var).pause();
                    return;
                } else {
                    kotlin.jvm.internal.o.o("magicBrush");
                    throw null;
                }
            }
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            uj.f.f428152a.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicPlayableMgr", "resume");
        uj.p pVar2 = uj.f.f428153b;
        if (pVar2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "resume");
            jc3.j0 j0Var2 = pVar2.f428169d;
            if (j0Var2 != null) {
                ((rc3.w0) j0Var2).A();
            } else {
                kotlin.jvm.internal.o.o("magicBrush");
                throw null;
            }
        }
    }
}
