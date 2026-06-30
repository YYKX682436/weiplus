package h21;

/* loaded from: classes12.dex */
public abstract class j {
    public static void a(android.content.Context context) {
        d55.z zVar = new d55.z(context);
        zVar.a();
        java.lang.String b17 = zVar.b();
        if (android.text.TextUtils.isEmpty(b17)) {
            b17 = "nothing";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", ">>>>>>> dump recovery internal log (:main) <<<<<<<");
        com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", "\n" + b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.recovery.reporter", ">>>>>>>>>>>>>>>>>>>>>> end <<<<<<<<<<<<<<<<<<<<<<<");
        d55.m0.d(new java.io.File(zVar.f226630b));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r47) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h21.j.b(android.content.Context):void");
    }
}
