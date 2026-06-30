package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class c9 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.InputStream f191548a;

    public c9(com.tencent.mm.pluginsdk.ui.tools.d9 d9Var, java.io.InputStream inputStream) {
        this.f191548a = inputStream;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream outputStream) {
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = this.f191548a.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read);
                    }
                }
                outputStream.flush();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUtil", "close os failed : %s", e17.getMessage());
            }
            try {
                outputStream.close();
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th6) {
            try {
                outputStream.close();
            } catch (java.lang.Exception unused2) {
            }
            throw th6;
        }
    }
}
