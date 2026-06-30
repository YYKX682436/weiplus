package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class x6 extends com.tencent.mm.sdk.platformtools.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f193089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.y6 f193090c;

    public x6(java.lang.String str, boolean[] zArr, com.tencent.mm.sdk.platformtools.y6 y6Var) {
        this.f193088a = str;
        this.f193089b = zArr;
        this.f193090c = y6Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void a(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        super.a(a7Var);
        this.f193089b[0] = false;
        com.tencent.mm.sdk.platformtools.y6 y6Var = this.f193090c;
        if (y6Var != null) {
            y6Var.a(a7Var);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void b(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        java.io.OutputStream b17;
        try {
            b17 = a7Var.b();
            try {
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScopedStorageUtil", e17, "copyFile fail", new java.lang.Object[0]);
            a(a7Var);
        }
        if (b17 == null) {
            throw new java.io.IOException("Open file fail");
        }
        com.tencent.mm.vfs.u6 u6Var = new com.tencent.mm.vfs.u6(this.f193088a);
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = u6Var.read(bArr);
                if (-1 == read) {
                    break;
                } else {
                    b17.write(bArr, 0, read);
                }
            }
            a7Var.c();
            this.f193089b[0] = true;
            u6Var.close();
            b17.close();
            com.tencent.mm.sdk.platformtools.y6 y6Var = this.f193090c;
            if (y6Var != null) {
                y6Var.b(a7Var);
            }
        } finally {
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public boolean c() {
        return true;
    }
}
