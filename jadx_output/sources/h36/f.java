package h36;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: h, reason: collision with root package name */
    public static int f278587h;

    /* renamed from: a, reason: collision with root package name */
    public int f278588a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public int f278589b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f278590c = 0;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f278591d = new byte[4096];

    /* renamed from: e, reason: collision with root package name */
    public int f278592e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f278593f = 0;

    /* renamed from: g, reason: collision with root package name */
    public h36.h f278594g;

    public byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length + this.f278594g.f278596b.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f278594g.f278596b;
        java.lang.System.arraycopy(bArr3, 0, bArr2, bArr.length, bArr3.length);
        return bArr2;
    }

    public byte[] b(byte[] bArr, int i17, int i18) {
        int length = bArr.length + 4;
        byte[] bArr2 = new byte[length];
        oicq.wlogin_sdk.tools.util.q(bArr2, 0, i17);
        oicq.wlogin_sdk.tools.util.q(bArr2, 2, i18);
        java.lang.System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        byte[] b17 = k36.e.b(bArr2, 0, length, this.f278594g.f278597c);
        int length2 = b17.length;
        byte[] bArr3 = this.f278594g.f278597c;
        byte[] bArr4 = new byte[length2 + bArr3.length];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        java.lang.System.arraycopy(b17, 0, bArr4, this.f278594g.f278597c.length, b17.length);
        return bArr4;
    }

    public void c(byte[] bArr, int i17, int i18) {
        j36.e0 e0Var = new j36.e0();
        if (e0Var.e(bArr, i17, i18) < 0) {
            oicq.wlogin_sdk.tools.ErrMsg errMsg = this.f278594g.f278617w;
            errMsg.f345659d = 0;
            errMsg.f345660e = "";
            errMsg.f345661f = "";
            errMsg.f345662g = "";
            return;
        }
        oicq.wlogin_sdk.tools.ErrMsg errMsg2 = this.f278594g.f278617w;
        int i19 = e0Var.f297533f;
        byte[] bArr2 = new byte[i19];
        java.lang.System.arraycopy(e0Var.f297539d, 10, bArr2, 0, i19);
        errMsg2.f345660e = new java.lang.String(bArr2);
        oicq.wlogin_sdk.tools.ErrMsg errMsg3 = this.f278594g.f278617w;
        int i27 = e0Var.f297534g;
        byte[] bArr3 = new byte[i27];
        java.lang.System.arraycopy(e0Var.f297539d, e0Var.f297533f + 12, bArr3, 0, i27);
        errMsg3.f345661f = new java.lang.String(bArr3);
        oicq.wlogin_sdk.tools.ErrMsg errMsg4 = this.f278594g.f278617w;
        int i28 = e0Var.f297535h;
        byte[] bArr4 = new byte[i28];
        java.lang.System.arraycopy(e0Var.f297539d, e0Var.f297533f + 16 + e0Var.f297534g, bArr4, 0, i28);
        errMsg4.f345662g = new java.lang.String(bArr4);
    }

    public void d(int i17, int i18, int i19, long j17, int i27, int i28, int i29, int i37, byte[] bArr) {
        int length = bArr.length;
        int i38 = f278587h + 1;
        f278587h = i38;
        byte[] bArr2 = this.f278591d;
        bArr2[0] = (byte) 2;
        int i39 = 0 + 1;
        this.f278589b = i39;
        oicq.wlogin_sdk.tools.util.q(bArr2, i39, length + 29);
        int i47 = this.f278589b + 2;
        this.f278589b = i47;
        oicq.wlogin_sdk.tools.util.q(this.f278591d, i47, i17);
        int i48 = this.f278589b + 2;
        this.f278589b = i48;
        oicq.wlogin_sdk.tools.util.q(this.f278591d, i48, i18);
        int i49 = this.f278589b + 2;
        this.f278589b = i49;
        oicq.wlogin_sdk.tools.util.q(this.f278591d, i49, i38);
        int i57 = this.f278589b + 2;
        this.f278589b = i57;
        oicq.wlogin_sdk.tools.util.r(this.f278591d, i57, (int) j17);
        int i58 = this.f278589b + 4;
        byte[] bArr3 = this.f278591d;
        byte b17 = (byte) 3;
        bArr3[i58 + 0] = b17;
        int i59 = i58 + 1;
        bArr3[i59 + 0] = (byte) 0;
        int i66 = i59 + 1;
        bArr3[i66 + 0] = (byte) (i27 >> 0);
        int i67 = i66 + 1;
        this.f278589b = i67;
        oicq.wlogin_sdk.tools.util.r(bArr3, i67, i28);
        int i68 = this.f278589b + 4;
        this.f278589b = i68;
        oicq.wlogin_sdk.tools.util.r(this.f278591d, i68, i29);
        int i69 = this.f278589b + 4;
        this.f278589b = i69;
        oicq.wlogin_sdk.tools.util.r(this.f278591d, i69, i37);
        int i76 = this.f278589b + 4;
        this.f278589b = i76;
        int i77 = length + i76 + 1;
        if (i77 > this.f278588a) {
            int i78 = i77 + 128;
            this.f278588a = i78;
            byte[] bArr4 = new byte[i78];
            java.lang.System.arraycopy(this.f278591d, 0, bArr4, 0, i76);
            this.f278591d = bArr4;
        }
        java.lang.System.arraycopy(bArr, 0, this.f278591d, this.f278589b, length);
        int i79 = this.f278589b + length;
        this.f278591d[i79 + 0] = b17;
        this.f278589b = i79 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(byte[] r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h36.f.e(byte[], int, int):int");
    }

    public void f(oicq.wlogin_sdk.tools.ErrMsg errMsg) {
        h36.h hVar = this.f278594g;
        oicq.wlogin_sdk.tools.ErrMsg errMsg2 = hVar.f278617w;
        errMsg2.f345659d = 0;
        errMsg2.f345660e = "";
        errMsg2.f345661f = "";
        errMsg2.f345662g = "";
        if (errMsg != null) {
            try {
                hVar.f278617w = (oicq.wlogin_sdk.tools.ErrMsg) errMsg.clone();
            } catch (java.lang.CloneNotSupportedException e17) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, true);
                e17.printStackTrace(printWriter);
                printWriter.flush();
                stringWriter.flush();
                oicq.wlogin_sdk.tools.util.d("exception", stringWriter.toString());
                oicq.wlogin_sdk.tools.ErrMsg errMsg3 = this.f278594g.f278617w;
                errMsg3.f345659d = 0;
                errMsg3.f345660e = "";
                errMsg3.f345661f = "";
                errMsg3.f345662g = "";
            }
        }
    }
}
