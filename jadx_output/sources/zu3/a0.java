package zu3;

/* loaded from: classes10.dex */
public final class a0 extends zu3.a implements zu3.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f475764g;

    /* renamed from: h, reason: collision with root package name */
    public int f475765h;

    /* renamed from: i, reason: collision with root package name */
    public int f475766i;

    /* renamed from: j, reason: collision with root package name */
    public int f475767j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f475768k;

    /* renamed from: l, reason: collision with root package name */
    public final bv3.b f475769l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.CharSequence charSequence, int i17, int i18, int i19, android.graphics.Matrix matrix) {
        super(zu3.e.f475796e);
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f475768k = "";
        this.f475769l = new bv3.b(null, 0L, 3, null);
        this.f475764g = charSequence;
        this.f475765h = i17;
        this.f475766i = i18;
        this.f475767j = i19;
        this.f475763f.set(matrix);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextItem", toString());
    }

    @Override // zu3.p
    public bv3.b b() {
        return this.f475769l;
    }

    @Override // zu3.p
    public void c(java.lang.String path, long j17) {
        kotlin.jvm.internal.o.g(path, "path");
        bv3.b bVar = this.f475769l;
        bVar.getClass();
        bVar.f24724a = path;
        bVar.f24725b = j17;
    }

    @Override // zu3.o
    public com.tencent.mm.protobuf.f toProtoBuf() {
        r45.ll6 ll6Var = new r45.ll6();
        ll6Var.f379579d = java.lang.String.valueOf(this.f475764g);
        ll6Var.f379582g = f(this.f475763f);
        ll6Var.f379581f = this.f475766i;
        ll6Var.f379580e = this.f475765h;
        ll6Var.f379585m = this.f475768k;
        ll6Var.f379584i = e();
        return ll6Var;
    }

    public java.lang.String toString() {
        return "[" + hashCode() + "]text:" + ((java.lang.Object) this.f475764g) + " color:" + this.f475765h + " bgColor:" + this.f475766i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String font, int i19, android.graphics.Matrix matrix, int i27, kotlin.jvm.internal.i iVar) {
        super(zu3.e.f475796e);
        i19 = (i27 & 16) != 0 ? 0 : i19;
        matrix = (i27 & 32) != 0 ? new android.graphics.Matrix() : matrix;
        kotlin.jvm.internal.o.g(font, "font");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f475768k = "";
        this.f475769l = new bv3.b(null, 0L, 3, null);
        this.f475764g = charSequence;
        this.f475765h = i17;
        this.f475766i = i18;
        this.f475768k = font;
        this.f475767j = i19;
        this.f475763f.set(matrix);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextItem", toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c A[Catch: IOException -> 0x007a, TryCatch #1 {IOException -> 0x007a, blocks: (B:3:0x001d, B:7:0x003c, B:9:0x0069, B:10:0x0072, B:19:0x0030, B:16:0x002b), top: B:2:0x001d, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(r45.de r10) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.TextItem"
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.o.g(r10, r1)
            zu3.e r1 = zu3.e.f475796e
            r9.<init>(r1)
            java.lang.String r1 = ""
            r9.f475768k = r1
            bv3.b r8 = new bv3.b
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r6, r7)
            r9.f475769l = r8
            r45.ll6 r2 = new r45.ll6     // Catch: java.io.IOException -> L7a
            r2.<init>()     // Catch: java.io.IOException -> L7a
            r45.cu5 r10 = r10.f372339e     // Catch: java.io.IOException -> L7a
            com.tencent.mm.protobuf.g r10 = r10.f371841f     // Catch: java.io.IOException -> L7a
            byte[] r10 = r10.f192156a     // Catch: java.io.IOException -> L7a
            if (r10 != 0) goto L2b
            goto L39
        L2b:
            r2.parseFrom(r10)     // Catch: java.lang.Exception -> L2f
            goto L3a
        L2f:
            r10 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.io.IOException -> L7a
            com.tencent.mm.sdk.platformtools.Log.a(r2, r1, r10)     // Catch: java.io.IOException -> L7a
        L39:
            r2 = 0
        L3a:
            if (r2 == 0) goto L83
            java.lang.String r10 = r2.f379579d     // Catch: java.io.IOException -> L7a
            r9.f475764g = r10     // Catch: java.io.IOException -> L7a
            int r10 = r2.f379580e     // Catch: java.io.IOException -> L7a
            r9.f475765h = r10     // Catch: java.io.IOException -> L7a
            int r10 = r2.f379581f     // Catch: java.io.IOException -> L7a
            r9.f475766i = r10     // Catch: java.io.IOException -> L7a
            int r10 = r2.f379583h     // Catch: java.io.IOException -> L7a
            r9.f475767j = r10     // Catch: java.io.IOException -> L7a
            android.graphics.Matrix r10 = r9.f475763f     // Catch: java.io.IOException -> L7a
            r45.zz6 r1 = r2.f379582g     // Catch: java.io.IOException -> L7a
            java.lang.String r3 = "matrix"
            kotlin.jvm.internal.o.f(r1, r3)     // Catch: java.io.IOException -> L7a
            float[] r1 = r9.g(r1)     // Catch: java.io.IOException -> L7a
            r10.setValues(r1)     // Catch: java.io.IOException -> L7a
            java.lang.String r10 = r2.f379585m     // Catch: java.io.IOException -> L7a
            java.lang.String r1 = "font"
            kotlin.jvm.internal.o.f(r10, r1)     // Catch: java.io.IOException -> L7a
            r9.f475768k = r10     // Catch: java.io.IOException -> L7a
            r45.bi0 r10 = r2.f379584i     // Catch: java.io.IOException -> L7a
            if (r10 == 0) goto L72
            long r1 = r10.f370772d     // Catch: java.io.IOException -> L7a
            long r3 = r10.f370773e     // Catch: java.io.IOException -> L7a
            bv3.d r10 = r9.f475760c     // Catch: java.io.IOException -> L7a
            r10.d(r1, r3)     // Catch: java.io.IOException -> L7a
        L72:
            java.lang.String r10 = r9.toString()     // Catch: java.io.IOException -> L7a
            com.tencent.mars.xlog.Log.i(r0, r10)     // Catch: java.io.IOException -> L7a
            goto L83
        L7a:
            r10 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "LocationItem parse error"
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r10, r2, r1)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.a0.<init>(r45.de):void");
    }
}
