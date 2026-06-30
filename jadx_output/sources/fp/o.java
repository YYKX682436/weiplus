package fp;

/* loaded from: classes4.dex */
public class o implements fp.p {
    @Override // fp.p
    public boolean a(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return true;
    }

    @Override // fp.p
    public boolean b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.ExpansionsProxy", " System.loadLibrary(), name = " + str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/compatible/util/ExpansionsProxy$1", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/compatible/util/ExpansionsProxy$1", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        return true;
    }

    @Override // fp.p
    public boolean c() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    @Override // fp.p
    public boolean d(java.lang.String str) {
        return false;
    }

    @Override // fp.p
    public void e(android.content.Context context) {
    }

    @Override // fp.p
    public android.content.res.AssetManager getAssets() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
    }
}
