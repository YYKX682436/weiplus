package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class k implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.AssetsSchemeResolver.AssetsFileSystem f213021e;

    public k(com.tencent.mm.vfs.AssetsSchemeResolver.AssetsFileSystem assetsFileSystem, java.lang.String str) {
        this.f213021e = assetsFileSystem;
        this.f213020d = str;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        java.io.InputStream inputStream;
        com.tencent.mm.vfs.x1 x1Var;
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = this.f213020d + str;
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = this.f213021e.f212693e.open(str2);
            try {
                try {
                    x1Var = new com.tencent.mm.vfs.x1(this.f213021e, str2, str, inputStream.available(), 0L, 0L, false);
                } catch (java.io.IOException unused) {
                    x1Var = new com.tencent.mm.vfs.x1(this.f213021e, str2, str, 0L, 0L, 0L, true);
                    com.tencent.mm.vfs.e8.d(inputStream);
                    return x1Var;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream2 = inputStream;
                com.tencent.mm.vfs.e8.d(inputStream2);
                throw th;
            }
        } catch (java.io.IOException unused2) {
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mm.vfs.e8.d(inputStream2);
            throw th;
        }
        com.tencent.mm.vfs.e8.d(inputStream);
        return x1Var;
    }
}
