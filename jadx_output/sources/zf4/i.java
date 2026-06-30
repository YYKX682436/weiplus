package zf4;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f472669a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f472670b;

    public i(java.lang.String str) {
        this.f472670b = "";
        this.f472670b = str;
    }

    public static int a(java.lang.String str) {
        int C;
        iz5.a.g(null, str.length() >= 0);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m() && (C = (int) r6Var.C()) > 0) {
            return C;
        }
        return 0;
    }

    public zf4.h b(int i17, int i18) {
        zf4.h hVar = new zf4.h();
        if (i17 < 0 || i18 <= 0) {
            hVar.f472668d = -3;
            return hVar;
        }
        java.io.RandomAccessFile randomAccessFile = this.f472669a;
        java.lang.String str = this.f472670b;
        if (randomAccessFile == null) {
            boolean z17 = true;
            iz5.a.g(null, str.length() >= 0);
            iz5.a.g(null, this.f472669a == null);
            java.util.Objects.toString(this.f472669a);
            try {
                this.f472669a = com.tencent.mm.vfs.w6.A(com.tencent.mm.vfs.z7.a(str), false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + str + "] failed:[" + e17.getMessage() + "]");
                this.f472669a = null;
                z17 = false;
            }
            if (!z17) {
                hVar.f472668d = -2;
                return hVar;
            }
        }
        hVar.f472665a = new byte[i18];
        try {
            this.f472669a.length();
            this.f472669a.seek(i17);
            int read = this.f472669a.read(hVar.f472665a, 0, i18);
            this.f472669a.getFilePointer();
            if (read < 0) {
                read = 0;
            }
            hVar.f472666b = read;
            hVar.f472667c = read + i17;
            hVar.f472668d = 0;
            return hVar;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + str + "] Offset:" + i17 + "  failed:[" + e18.getMessage() + "] ");
            java.io.RandomAccessFile randomAccessFile2 = this.f472669a;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                    this.f472669a = null;
                } catch (java.io.IOException unused) {
                }
            }
            hVar.f472668d = -1;
            return hVar;
        }
    }
}
