package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.a0 f182715d;

    public z(com.tencent.mm.plugin.webview.luggage.a0 a0Var) {
        this.f182715d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.luggage.a0 a0Var = this.f182715d;
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.tencent.mm.vfs.w6.E(a0Var.f182140d.f182125h);
                java.io.PipedOutputStream pipedOutputStream = a0Var.f182141e;
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        pipedOutputStream.write(bArr, 0, read);
                    }
                }
                inputStream.close();
            } catch (java.lang.Exception unused) {
                return;
            }
        } catch (java.lang.Exception unused2) {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused3) {
                    throw th6;
                }
            }
            a0Var.f182141e.close();
            throw th6;
        }
        a0Var.f182141e.close();
    }
}
