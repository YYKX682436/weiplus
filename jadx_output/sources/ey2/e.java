package ey2;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.f f257353d;

    public e(ey2.f fVar) {
        this.f257353d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ObjectOutputStream objectOutputStream;
        java.io.ObjectOutputStream objectOutputStream2;
        ey2.f fVar = this.f257353d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(((cq.k) i95.n0.c(cq.k.class)).Di(9));
            if (!r6Var.y()) {
                r6Var.l();
            }
            if (!r6Var.m()) {
                r6Var.J();
            }
            str = r6Var.o() + "/18054.ext";
            com.tencent.mm.vfs.w6.h(str);
            java.util.Collection values = fVar.f257364h.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.List F0 = kz5.n0.F0(values, new ey2.d());
            arrayList = new java.util.ArrayList(F0.subList(0, java.lang.Math.min(fVar.f257363g, F0.size())));
            byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
            objectOutputStream = null;
            try {
                try {
                    objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream);
                } catch (java.io.IOException e17) {
                    e = e17;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                objectOutputStream2 = objectOutputStream;
            }
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        try {
            objectOutputStream2.writeObject(arrayList);
            try {
                objectOutputStream2.close();
            } catch (java.io.IOException unused) {
            }
            com.tencent.mars.xlog.Log.i("Finder.18054CacheVM", "[storeCache] ret=" + com.tencent.mm.vfs.w6.R(str, byteArrayOutputStream.toByteArray()) + " store cache[" + arrayList.size() + "].");
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.18054CacheVM", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
            }
        } catch (java.io.IOException e18) {
            e = e18;
            objectOutputStream = objectOutputStream2;
            throw new u46.i(e);
        } catch (java.lang.Throwable th8) {
            th = th8;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }
}
