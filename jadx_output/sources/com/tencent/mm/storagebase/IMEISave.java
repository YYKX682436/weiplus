package com.tencent.mm.storagebase;

/* loaded from: classes12.dex */
public class IMEISave {
    public static java.util.Collection a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(wo.w0.g(true));
        linkedHashSet.add(wo.w0.g(false));
        java.io.BufferedReader bufferedReader = null;
        try {
            try {
                javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec("_wEcHAT_".getBytes(), "RC4");
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RC4");
                cipher.init(2, secretKeySpec);
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new javax.crypto.CipherInputStream(context.openFileInput("KeyInfo.bin"), cipher)));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        linkedHashSet.add(readLine);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        bufferedReader = bufferedReader2;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IMEISave", e, "Failed to load key information.", new java.lang.Object[0]);
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                        linkedHashSet.add("1234567890ABCDEF");
                        return linkedHashSet;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                        throw th;
                    }
                }
                com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader2);
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
        linkedHashSet.add("1234567890ABCDEF");
        return linkedHashSet;
    }
}
