package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class h8 {
    public static java.io.File a(android.content.Context context) {
        java.io.File dir = context.getDir("threadstack_shinker", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static void b(android.content.Context context, bi.a aVar) {
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(a(context), "ignored_patterns")));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return;
                    } else {
                        java.lang.String trim = readLine.trim();
                        aVar.a(trim);
                        com.tencent.mm.app.p5.e("MicroMsg.ThreadStackShinkerWrapper", "Pattern %s was loaded into config.", trim);
                    }
                } finally {
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.app.p5.d("MicroMsg.ThreadStackShinkerWrapper", th6, "Fail to load ignored creator so patterns.", new java.lang.Object[0]);
        }
    }
}
