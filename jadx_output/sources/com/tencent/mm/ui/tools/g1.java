package com.tencent.mm.ui.tools;

/* loaded from: classes7.dex */
public class g1 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f210435a;

    public g1(android.graphics.Bitmap bitmap) {
        this.f210435a = bitmap;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream outputStream) {
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new java.io.BufferedOutputStream(outputStream);
            } catch (java.lang.Throwable unused) {
                return;
            }
        } catch (java.lang.Exception unused2) {
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            this.f210435a.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.close();
        } catch (java.lang.Exception unused3) {
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (java.lang.Throwable unused4) {
                }
            }
            throw th;
        }
    }
}
