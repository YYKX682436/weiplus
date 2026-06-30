package im1;

/* loaded from: classes11.dex */
public final class j extends im1.c {

    /* renamed from: b, reason: collision with root package name */
    public static final im1.j f292197b = new im1.j();

    public final com.tencent.mm.vfs.r6 b(com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.vfs.r6 r6Var2) {
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var, r6Var2.getName());
        r6Var2.toString();
        r6Var3.toString();
        xf1.h hVar = xf1.h.f454236a;
        if (hVar.a(r6Var3)) {
            return r6Var3;
        }
        if (!r6Var2.m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, originFile not exist");
            return null;
        }
        if (0 > com.tencent.mm.vfs.w6.d(r6Var2.o(), r6Var3.o(), false)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, copy fail");
            return null;
        }
        if (hVar.b(r6Var3)) {
            return r6Var3;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic", "copyImageIfNeed, record newFile fail");
        return null;
    }

    public final java.lang.String c(yf.k kVar) {
        byte[] bytes = kVar.a().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return by5.x.d(bytes);
    }
}
