package w21;

/* loaded from: classes12.dex */
public class a implements w21.j {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f442294a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442295b;

    public a(java.lang.String str) {
        this.f442295b = "";
        this.f442295b = str;
    }

    @Override // w21.j
    public int a(java.lang.String str) {
        long C;
        java.lang.String str2 = this.f442295b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AmrFileOperator", "write: fromPath %s, toPath %s", str, str2);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "write: file not exists");
            return -1;
        }
        byte[] N = com.tencent.mm.vfs.w6.N(str, 0, (int) r6Var.C());
        byte[] bytes = "#!AMR\n".getBytes();
        if (e(N)) {
            if (com.tencent.mm.vfs.w6.x(str, str2, true)) {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(str2);
                if (r6Var2.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AmrFileOperator", "write: copy success, file size: %d", java.lang.Long.valueOf(r6Var2.C()));
                    C = r6Var2.C();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "write: copy file error");
                }
            }
            return -1;
        }
        java.io.OutputStream outputStream = null;
        try {
            try {
                com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str2));
                outputStream = com.tencent.mm.vfs.w6.K(str2, false);
                outputStream.write(bytes);
                outputStream.write(N);
                outputStream.flush();
                try {
                    outputStream.close();
                } catch (java.io.IOException unused) {
                }
                com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(str2);
                if (!r6Var3.m()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "write: write file error, new file not exists");
                    return -1;
                }
                if (r6Var3.C() != r6Var.C() + bytes.length) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "write: write file error, length %d, oldLength %d", java.lang.Long.valueOf(r6Var3.C()), java.lang.Long.valueOf(r6Var.C()));
                    return -1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AmrFileOperator", "write: new file length %d", java.lang.Long.valueOf(r6Var3.C()));
                com.tencent.mm.vfs.w6.h(str);
                C = r6Var3.C();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "moveWithOp: write exception", e17);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                return -1;
            }
        } catch (java.lang.Throwable th6) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.io.IOException unused3) {
                }
            }
            throw th6;
        }
        return (int) C;
    }

    @Override // w21.j
    public void b() {
        java.io.RandomAccessFile randomAccessFile = this.f442294a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f442294a = null;
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // w21.j
    public int c(byte[] bArr, int i17, int i18) {
        boolean z17;
        iz5.a.g(null, bArr.length > 0 && i17 > 0);
        if (this.f442294a == null && !f(true)) {
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AmrFileOperator", "writeOffset:%d, bufLen:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        java.lang.String str = this.f442295b;
        if (i18 == 0) {
            z17 = e(bArr);
            if (!z17) {
                try {
                    this.f442294a.write("#!AMR\n".getBytes(), 0, 6);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "ERR: WriteHeadToFile[" + str + "] failed:[" + e17.getMessage() + "]");
                    b();
                    return -2;
                }
            }
        } else {
            z17 = false;
        }
        if (!z17) {
            i18 += 6;
        }
        try {
            this.f442294a.seek(i18);
            this.f442294a.write(bArr, 0, i17);
            int i19 = i18 + i17;
            iz5.a.g(null, ((int) this.f442294a.getFilePointer()) == i19);
            int i27 = i19 - 6;
            iz5.a.g(null, i27 >= 0);
            return i27;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "ERR: WriteFile[" + str + "] Offset:" + i18 + " failed:[" + e18.getMessage() + "]");
            b();
            return -3;
        }
    }

    @Override // w21.j
    public w21.t d(int i17, int i18) {
        w21.t tVar = new w21.t();
        if (i17 < 0 || i18 <= 0) {
            tVar.f442467d = -3;
            return tVar;
        }
        if (this.f442294a == null && !f(false)) {
            tVar.f442467d = -2;
            return tVar;
        }
        int i19 = i17 + 6;
        tVar.f442464a = new byte[i18];
        try {
            this.f442294a.length();
            this.f442294a.seek(i19);
            int read = this.f442294a.read(tVar.f442464a, 0, i18);
            this.f442294a.getFilePointer();
            if (read < 0) {
                read = 0;
            }
            tVar.f442465b = read;
            tVar.f442466c = (read + i19) - 6;
            tVar.f442467d = 0;
            return tVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "ERR: ReadFile[" + this.f442295b + "] Offset:" + i19 + "  failed:[" + e17.getMessage() + "] ");
            b();
            tVar.f442467d = -1;
            return tVar;
        }
    }

    public final boolean e(byte[] bArr) {
        try {
            java.lang.String str = bArr.length > "#!AMR\n".getBytes().length ? new java.lang.String(bArr, 0, "#!AMR\n".getBytes().length) : null;
            if (str != null && str.startsWith("#!AMR\n")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AmrFileOperator", "content inBuf already has amr header, ignore write header");
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AmrFileOperator", e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    public final boolean f(boolean z17) {
        java.lang.String str = this.f442295b;
        iz5.a.g(null, str.length() >= 0);
        iz5.a.g(null, this.f442294a == null);
        java.util.Objects.toString(this.f442294a);
        if (z17) {
            com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str));
        }
        try {
            this.f442294a = com.tencent.mm.vfs.w6.B(str, z17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AmrFileOperator", "ERR: OpenFile[" + str + "] failed:[" + e17.getMessage() + "]");
            this.f442294a = null;
            return false;
        }
    }

    @Override // w21.j
    public int getFormat() {
        return 0;
    }
}
