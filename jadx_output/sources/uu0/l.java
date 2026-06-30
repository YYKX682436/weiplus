package uu0;

/* loaded from: classes5.dex */
public abstract class l {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(b());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audio");
        java.lang.String str3 = "";
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a("" + str2));
        if (!android.text.TextUtils.isEmpty(str)) {
            if ("aac".equalsIgnoreCase(str)) {
                str3 = ".m4a";
            } else if ("mp3".equalsIgnoreCase(str)) {
                str3 = ".mp3";
            } else if ("wav".equalsIgnoreCase(str)) {
                str3 = ".wav";
            } else if ("silk".equalsIgnoreCase(str)) {
                str3 = ".silk";
            }
        }
        sb6.append(str3);
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, sb6.toString());
        r6Var2.n();
        return r6Var2.o();
    }

    public static java.lang.String b() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("MaasCache") + "/MovieComposing/"), "AudioRecord");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o();
    }

    public static boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return "aac".equalsIgnoreCase(str) || "mp3".equalsIgnoreCase(str) || "wav".equalsIgnoreCase(str) || "pcm".equalsIgnoreCase(str);
    }

    public static boolean d(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordUtil", "new audio file");
                return r6Var.k();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordUtil", e17, "prepareCacheFile", new java.lang.Object[0]);
                return false;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordUtil", e18, "prepareCacheFile", new java.lang.Object[0]);
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordUtil", "delete audio file");
        r6Var.l();
        try {
            return r6Var.k();
        } catch (java.io.IOException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordUtil", e19, "prepareCacheFile", new java.lang.Object[0]);
            return false;
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordUtil", e27, "prepareCacheFile", new java.lang.Object[0]);
            return false;
        }
    }
}
