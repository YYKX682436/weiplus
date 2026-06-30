package zu3;

/* loaded from: classes10.dex */
public final class s extends zu3.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f475826g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f475827h;

    /* renamed from: i, reason: collision with root package name */
    public final float f475828i;

    /* renamed from: j, reason: collision with root package name */
    public final float f475829j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String cityName, java.lang.String poiName, float f17, float f18, android.graphics.Matrix matrix) {
        super(zu3.e.f475798g);
        kotlin.jvm.internal.o.g(cityName, "cityName");
        kotlin.jvm.internal.o.g(poiName, "poiName");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f475826g = "";
        this.f475827h = "";
        this.f475826g = cityName;
        this.f475827h = poiName;
        this.f475829j = f18;
        this.f475828i = f17;
        this.f475763f = matrix;
        java.lang.String sVar = toString();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LocationItem", sVar, null);
    }

    @Override // zu3.o
    public com.tencent.mm.protobuf.f toProtoBuf() {
        r45.gd4 gd4Var = new r45.gd4();
        gd4Var.f375133d = this.f475826g;
        gd4Var.f375134e = this.f475827h;
        gd4Var.f375135f = f(this.f475763f);
        gd4Var.f375136g = this.f475828i;
        gd4Var.f375137h = this.f475829j;
        return gd4Var;
    }

    public java.lang.String toString() {
        return "[" + hashCode() + "]poiName:" + this.f475827h + " cityName:" + this.f475826g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[Catch: IOException -> 0x0067, TryCatch #0 {IOException -> 0x0067, blocks: (B:3:0x0012, B:8:0x0033, B:9:0x005d, B:17:0x0027, B:14:0x0022), top: B:2:0x0012, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(r45.de r5) {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.LocationItem"
            java.lang.String r1 = "proto"
            kotlin.jvm.internal.o.g(r5, r1)
            zu3.e r1 = zu3.e.f475796e
            r4.<init>(r1)
            java.lang.String r1 = ""
            r4.f475826g = r1
            r4.f475827h = r1
            r45.gd4 r2 = new r45.gd4     // Catch: java.io.IOException -> L67
            r2.<init>()     // Catch: java.io.IOException -> L67
            r45.cu5 r5 = r5.f372339e     // Catch: java.io.IOException -> L67
            com.tencent.mm.protobuf.g r5 = r5.f371841f     // Catch: java.io.IOException -> L67
            byte[] r5 = r5.f192156a     // Catch: java.io.IOException -> L67
            r3 = 0
            if (r5 != 0) goto L22
        L20:
            r2 = r3
            goto L31
        L22:
            r2.parseFrom(r5)     // Catch: java.lang.Exception -> L26
            goto L31
        L26:
            r5 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.io.IOException -> L67
            com.tencent.mm.sdk.platformtools.Log.a(r2, r1, r5)     // Catch: java.io.IOException -> L67
            goto L20
        L31:
            if (r2 == 0) goto L5d
            java.lang.String r5 = r2.f375133d     // Catch: java.io.IOException -> L67
            java.lang.String r1 = "cityName"
            kotlin.jvm.internal.o.f(r5, r1)     // Catch: java.io.IOException -> L67
            r4.f475826g = r5     // Catch: java.io.IOException -> L67
            java.lang.String r5 = r2.f375134e     // Catch: java.io.IOException -> L67
            java.lang.String r1 = "poiName"
            kotlin.jvm.internal.o.f(r5, r1)     // Catch: java.io.IOException -> L67
            r4.f475827h = r5     // Catch: java.io.IOException -> L67
            float r5 = r2.f375136g     // Catch: java.io.IOException -> L67
            r4.f475828i = r5     // Catch: java.io.IOException -> L67
            float r5 = r2.f375137h     // Catch: java.io.IOException -> L67
            r4.f475829j = r5     // Catch: java.io.IOException -> L67
            android.graphics.Matrix r5 = r4.f475763f     // Catch: java.io.IOException -> L67
            r45.zz6 r1 = r2.f375135f     // Catch: java.io.IOException -> L67
            java.lang.String r2 = "matrix"
            kotlin.jvm.internal.o.f(r1, r2)     // Catch: java.io.IOException -> L67
            float[] r1 = r4.g(r1)     // Catch: java.io.IOException -> L67
            r5.setValues(r1)     // Catch: java.io.IOException -> L67
        L5d:
            java.lang.String r5 = r4.toString()     // Catch: java.io.IOException -> L67
            int r1 = rl.b.f397143a     // Catch: java.io.IOException -> L67
            com.tencent.mars.xlog.Log.i(r0, r5, r3)     // Catch: java.io.IOException -> L67
            goto L72
        L67:
            r5 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = rl.b.f397143a
            java.lang.String r2 = "LocationItem parse error"
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r5, r2, r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.s.<init>(r45.de):void");
    }
}
