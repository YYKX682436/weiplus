package lp;

/* loaded from: classes7.dex */
public final class l implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320233a = 0;

    static {
        q25.b.b(new lp.l(), "//testnospace");
    }

    public static boolean b(android.content.Context context) {
        java.io.File file = new java.io.File(context.getCacheDir(), ".testnospace");
        if (!file.exists()) {
            return false;
        }
        file.delete();
        return true;
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        boolean z17 = false;
        try {
            if (new java.io.File(context.getCacheDir(), ".testnospace").createNewFile()) {
                z17 = true;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NoSpaceTest", "Fail to touch nospace marker file.");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NoSpaceTest", th6, "[-] Fail to touch nospace marker file.", new java.lang.Object[0]);
        }
        if (z17) {
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, "Success.");
        } else {
            db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, "Failure.");
        }
        return true;
    }
}
