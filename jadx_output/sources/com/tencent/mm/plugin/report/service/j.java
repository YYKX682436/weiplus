package com.tencent.mm.plugin.report.service;

/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f158282a = new java.util.HashSet(64);

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f158283b = false;

    public static void a() {
        synchronized (f158282a) {
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().openRawResource(com.tencent.mm.R.raw.invalid_idkey)), 4096);
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        ((java.util.HashSet) f158282a).add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(readLine)));
                    } catch (java.lang.Throwable th6) {
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
                bufferedReader.close();
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("IDKeyInvalidList", "invalid value in R file");
            }
            f158283b = true;
        }
    }

    public static boolean b(int i17) {
        if (!f158283b) {
            synchronized (f158282a) {
                if (!f158283b) {
                    a();
                }
            }
        }
        return ((java.util.HashSet) f158282a).contains(java.lang.Integer.valueOf(i17));
    }
}
