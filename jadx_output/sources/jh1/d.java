package jh1;

/* loaded from: classes7.dex */
public abstract class d {
    public static java.lang.String a(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.WxaAudioUtils", "getLocalFilePathFromWxaPkg src is empty");
            return str;
        }
        if (lVar.getFileSystem() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.WxaAudioUtils", "[getLocalFilePathFromWxaPkg]service.getFileSystem() is null");
            return str;
        }
        com.tencent.mm.vfs.r6 absoluteFile = lVar.getFileSystem().getAbsoluteFile(str);
        if (absoluteFile == null || !absoluteFile.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.WxaAudioUtils", "[getLocalFilePathFromWxaPkg]localFile is null");
            return str;
        }
        java.lang.String o17 = absoluteFile.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.WxaAudioUtils", "getLocalFilePathFromWxaPkg:path:%s", o17);
        return o17;
    }

    public static java.lang.String b(java.lang.String str) {
        byte[] bArr;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(rl.a.d(), "base64" + str.hashCode());
        if (r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.WxaAudioUtils", "base64 file exist!");
            return r6Var.o();
        }
        java.io.OutputStream outputStream = null;
        try {
            bArr = android.util.Base64.decode(str, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("", e17, "writeToFile", new java.lang.Object[0]);
            bArr = null;
        }
        if (bArr != null && bArr.length != 0) {
            try {
                outputStream = com.tencent.mm.vfs.w6.H(r6Var);
                outputStream.write(bArr);
                try {
                    outputStream.close();
                } catch (java.io.IOException unused) {
                }
                return r6Var.o();
            } catch (java.lang.Exception unused2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException unused4) {
                    }
                }
                throw th6;
            }
        }
        return "";
    }
}
