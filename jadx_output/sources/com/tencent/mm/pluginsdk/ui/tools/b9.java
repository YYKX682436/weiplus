package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class b9 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f191533a;

    public b9(com.tencent.mm.pluginsdk.ui.tools.d9 d9Var, byte[] bArr) {
        this.f191533a = bArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream outputStream) {
        try {
            byte[] bArr = this.f191533a;
            if (bArr != null) {
                outputStream.write(bArr);
                outputStream.flush();
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            try {
                outputStream.close();
            } catch (java.lang.Exception unused2) {
            }
            throw th6;
        }
        try {
            outputStream.close();
        } catch (java.lang.Exception unused3) {
        }
    }
}
