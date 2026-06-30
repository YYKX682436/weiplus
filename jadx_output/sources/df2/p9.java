package df2;

/* loaded from: classes10.dex */
public final class p9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231055d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.p9(this.f231055d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.p9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wh2.f fVar = wh2.f.f445949a;
        java.lang.String path = this.f231055d;
        java.lang.String v17 = r26.i0.v(path, ".zip", "", false, 4, null);
        kotlin.jvm.internal.o.g(path, "path");
        try {
            com.tencent.mars.xlog.Log.i("Finder.FinderInteractiveGiftLoader", "unzipFile path:" + path + ", targetPath:" + v17);
            if (com.tencent.mm.vfs.w6.j(v17)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderInteractiveGiftLoader", "fileExist");
            } else {
                int Q = com.tencent.mm.vfs.w6.Q(path, v17);
                if (Q < 0) {
                    com.tencent.mars.xlog.Log.w("Finder.FinderInteractiveGiftLoader", "unzip failed. unzipRet=" + Q);
                    return new wh2.a(10002);
                }
            }
            java.util.List k17 = com.tencent.mm.vfs.e8.k(com.tencent.mm.vfs.w6.s(v17, false));
            com.tencent.mm.vfs.x1 x1Var = null;
            if (k17 != null) {
                java.util.Iterator it = k17.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String name = ((com.tencent.mm.vfs.x1) next).f213232b;
                    kotlin.jvm.internal.o.f(name, "name");
                    if (!r26.i0.y(name, "_", false)) {
                        x1Var = next;
                        break;
                    }
                }
                x1Var = x1Var;
            }
            if (x1Var == null) {
                return new wh2.a(10002);
            }
            return new wh2.b(v17 + '/' + x1Var.f213232b);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderInteractiveGiftLoader", "unzipFile failed.", e17);
            return new wh2.a(10002);
        }
    }
}
