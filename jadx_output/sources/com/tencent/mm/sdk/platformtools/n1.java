package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b5 f192869a = new com.tencent.mm.sdk.platformtools.b5("gc_sst_w", java.util.concurrent.TimeUnit.HOURS.toMillis(24), true, true);

    public static java.io.File a(android.content.Context context) {
        java.io.File dir = context.getDir("gc_ss_trim", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        java.lang.String a17 = bm5.f1.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            a17 = com.tencent.mm.sdk.platformtools.t8.W(context, android.os.Process.myPid());
        }
        if (android.text.TextUtils.isEmpty(a17)) {
            return null;
        }
        return a17.replace('.', '_').replace(":", "__") + "_" + str;
    }

    public static boolean c(android.content.Context context) {
        return !com.tencent.mm.sdk.platformtools.z.f193115k && android.os.Build.VERSION.SDK_INT < 26;
    }
}
