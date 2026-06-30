package w21;

/* loaded from: classes12.dex */
public class l0 implements w21.j {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f442425a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f442426b;

    public l0(java.lang.String str) {
        this.f442426b = "";
        this.f442426b = str;
    }

    @Override // w21.j
    public int a(java.lang.String str) {
        java.lang.String str2 = this.f442426b;
        com.tencent.mars.xlog.Log.i("MicroMsg.SpxFileOperator", "write: fromPath %s, toPath %s", str, str2);
        if (str.equals(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SpxFileOperator", "write: no need to move file");
            return 0;
        }
        if (com.tencent.mm.vfs.w6.x(str, str2, true)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2);
            if (r6Var.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SpxFileOperator", "write: copy success, file size: %d", java.lang.Long.valueOf(r6Var.C()));
                return (int) r6Var.C();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SpxFileOperator", "write: copy file error");
        }
        return -1;
    }

    @Override // w21.j
    public void b() {
        java.io.RandomAccessFile randomAccessFile = this.f442425a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f442425a = null;
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // w21.j
    public int c(byte[] bArr, int i17, int i18) {
        iz5.a.g(null, bArr.length > 0 && i17 > 0);
        if (this.f442425a == null && !e(true)) {
            return -1;
        }
        try {
            this.f442425a.seek(i18);
            this.f442425a.write(bArr, 0, i17);
            int i19 = i18 + i17;
            iz5.a.g(null, ((int) this.f442425a.getFilePointer()) == i19);
            iz5.a.g(null, i19 >= 0);
            return i19;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpxFileOperator", "ERR: WriteFile[" + this.f442426b + "] Offset:" + i18 + " failed:[" + e17.getMessage() + "]");
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
        if (this.f442425a == null && !e(false)) {
            tVar.f442467d = -2;
            return tVar;
        }
        tVar.f442464a = new byte[i18];
        try {
            this.f442425a.length();
            this.f442425a.seek(i17);
            int read = this.f442425a.read(tVar.f442464a, 0, i18);
            this.f442425a.getFilePointer();
            if (read < 0) {
                read = 0;
            }
            tVar.f442465b = read;
            tVar.f442466c = read + i17;
            tVar.f442467d = 0;
            return tVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + this.f442426b + "] Offset:" + i17 + "  failed:[" + e17.getMessage() + "] ");
            b();
            tVar.f442467d = -1;
            return tVar;
        }
    }

    public final boolean e(boolean z17) {
        java.lang.String str = this.f442426b;
        iz5.a.g(null, str.length() >= 0);
        iz5.a.g(null, this.f442425a == null);
        java.util.Objects.toString(this.f442425a);
        if (z17) {
            com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str));
        }
        try {
            this.f442425a = com.tencent.mm.vfs.w6.B(str, z17);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + str + "] failed:[" + e17.getMessage() + "]");
            this.f442425a = null;
            return false;
        }
    }

    @Override // w21.j
    public int getFormat() {
        return 1;
    }
}
