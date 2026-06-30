package com.tencent.wechat.zlog;

/* loaded from: classes11.dex */
public class Zlog {

    /* renamed from: a, reason: collision with root package name */
    public static final hw5.a f220031a;

    static {
        new java.util.concurrent.atomic.AtomicBoolean(false);
        new java.util.concurrent.atomic.AtomicBoolean(false);
        f220031a = hw5.a.DEBUG;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("zlog_binding");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wechat/zlog/Zlog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wechat/zlog/Zlog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(hw5.a.DEBUG, str, str2, objArr);
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(hw5.a.FATAL, str, str2, objArr);
        throw new java.lang.IllegalStateException("FATAL log triggered");
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(hw5.a.INFO, str, str2, objArr);
    }

    public static void d(hw5.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar.ordinal() < f220031a.f285598d) {
            return;
        }
        if (objArr != null && objArr.length > 0) {
            str2 = java.lang.String.format(str2, objArr);
        }
        if (str2.length() > 8192) {
            str2 = str2.substring(0, 8192);
        }
        zlogw_print(aVar.ordinal(), str, "", "", 0, str2);
    }

    private static native void zlogw_flush();

    private static native void zlogw_init_file_config(com.tencent.wechat.zlog.ZlogFileConfig zlogFileConfig);

    private static native void zlogw_init_zlog(com.tencent.wechat.zlog.ZlogConfigJni zlogConfigJni);

    private static native void zlogw_print(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4);

    private static native void zlogw_set_pass_through_mode();
}
