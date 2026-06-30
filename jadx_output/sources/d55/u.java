package d55;

/* loaded from: classes12.dex */
public abstract class u {
    public static void a(android.content.Context context) {
        b("MicroMsg.recovery.logger", "flush recovery log to file", new java.lang.Object[0]);
        d55.z zVar = new d55.z(context);
        zVar.a();
        com.tencent.mm.booter.s.b(context).e("RECOVERY");
        java.lang.String b17 = zVar.b();
        if (android.text.TextUtils.isEmpty(b17)) {
            b17 = "nothing";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.recovery.logger", ">>>>> dump recovery internal log (:recovery) <<<<<");
        com.tencent.mars.xlog.Log.i("MicroMsg.recovery.logger", "\n" + b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.recovery.logger", ">>>>>>>>>>>>>>>>>>>>>> end <<<<<<<<<<<<<<<<<<<<<<<");
        com.tencent.mars.xlog.Log.appenderFlush();
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        com.tencent.mars.xlog.Log.i(str, str2);
        d55.o0.a(4, str, str2);
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th6, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, new java.lang.Object[0]);
        d55.q0.a(str, str2, th6);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        com.tencent.mars.xlog.Log.w(str, str2);
        d55.o0.a(5, str, str2);
    }
}
