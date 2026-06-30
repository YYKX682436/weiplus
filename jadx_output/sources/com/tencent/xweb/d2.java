package com.tencent.xweb;

/* loaded from: classes13.dex */
public class d2 extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.xweb.c2 f220241f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.xweb.b2 f220242g;

    /* renamed from: h, reason: collision with root package name */
    public final java.io.File f220243h;

    /* renamed from: i, reason: collision with root package name */
    public long f220244i;

    public d2(boolean z17, com.tencent.xweb.b2 b2Var, java.lang.String str, java.lang.String str2) {
        this.f220242g = b2Var;
        com.tencent.xweb.c2 c2Var = new com.tencent.xweb.c2();
        this.f220241f = c2Var;
        c2Var.f220223a = 0;
        c2Var.f220224b = 0;
        c2Var.f220225c = 1;
        c2Var.f220226d = str;
        c2Var.f220227e = str2;
        c2Var.f220232j = z17;
        this.f220243h = new java.io.File(c2Var.f220227e);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01b7 A[Catch: IOException -> 0x01ba, TRY_LEAVE, TryCatch #2 {IOException -> 0x01ba, blocks: (B:85:0x01b2, B:79:0x01b7), top: B:84:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cd A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    @Override // by5.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.Object[] r22) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.d2.d(java.lang.Object[]):java.lang.Object");
    }

    @Override // by5.u0
    public void f(java.lang.Object obj) {
        if (this.f220241f.f220232j) {
            com.tencent.xweb.f2.f220281a = null;
            by5.c4.f("HttpDownloadTask", "runtime onCancelled");
        } else {
            by5.c4.f("HttpDownloadTask", "plugin onCancelled");
        }
        com.tencent.xweb.b2 b2Var = this.f220242g;
        if (b2Var != null) {
            b2Var.e();
        }
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = num.intValue();
        com.tencent.xweb.c2 c2Var = this.f220241f;
        if (intValue == 0) {
            c2Var.f220224b = 0;
        } else {
            c2Var.f220224b = -1;
        }
        com.tencent.xweb.f2.c(c2Var, this.f220242g, "HttpDownloadTask", num);
    }

    @Override // by5.u0
    public void h() {
        com.tencent.xweb.f2.a("HttpDownloadTask", this.f220241f, this);
    }

    @Override // by5.u0
    public void i(java.lang.Object[] objArr) {
        com.tencent.xweb.f2.b(this.f220242g, (java.lang.Integer[]) objArr);
    }
}
