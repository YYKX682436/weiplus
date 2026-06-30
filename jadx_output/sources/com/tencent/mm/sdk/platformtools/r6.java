package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class r6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b5 f192959a = new com.tencent.mm.sdk.platformtools.b5("rt_vrfy_mt", java.util.concurrent.TimeUnit.HOURS.toMillis(24), true, true);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f192960b = new java.util.HashSet(java.util.Arrays.asList("matrix-artmisc", "matrix-hookcommon"));

    public static java.io.File a(android.content.Context context) {
        java.io.File dir = context.getDir("rt_vrfy_mt", 0);
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
}
