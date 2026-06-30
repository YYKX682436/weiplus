package zu3;

/* loaded from: classes10.dex */
public final class y extends zu3.a implements zu3.p {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f475865g;

    /* renamed from: h, reason: collision with root package name */
    public long f475866h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f475867i;

    /* renamed from: j, reason: collision with root package name */
    public int f475868j;

    /* renamed from: k, reason: collision with root package name */
    public int f475869k;

    /* renamed from: l, reason: collision with root package name */
    public float f475870l;

    /* renamed from: m, reason: collision with root package name */
    public float f475871m;

    /* renamed from: n, reason: collision with root package name */
    public float f475872n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f475873o;

    /* renamed from: p, reason: collision with root package name */
    public final bv3.b f475874p;

    /* renamed from: q, reason: collision with root package name */
    public zu3.r f475875q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String pagPath, android.graphics.Matrix matrix, int i17, kotlin.jvm.internal.i iVar) {
        super(zu3.e.f475803o);
        matrix = (i17 & 2) != 0 ? new android.graphics.Matrix() : matrix;
        kotlin.jvm.internal.o.g(pagPath, "pagPath");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f475867i = "";
        this.f475868j = 160;
        this.f475869k = 160;
        this.f475872n = 1.0f;
        this.f475873o = new android.graphics.RectF();
        this.f475874p = new bv3.b(null, 0L, 3, null);
        this.f475865g = pagPath;
        this.f475763f.set(matrix);
    }

    @Override // zu3.p
    public bv3.b b() {
        return this.f475874p;
    }

    @Override // zu3.p
    public void c(java.lang.String path, long j17) {
        kotlin.jvm.internal.o.g(path, "path");
        bv3.b bVar = this.f475874p;
        bVar.getClass();
        bVar.f24724a = path;
        bVar.f24725b = j17;
    }

    public final android.graphics.RectF i() {
        return this.f475873o;
    }

    public final void j(zu3.r rVar) {
        this.f475875q = rVar;
    }

    public final void k(long j17) {
        this.f475866h = j17;
    }

    public final void l(int i17) {
        this.f475869k = i17;
    }

    public final void m(float f17) {
        this.f475872n = f17;
    }

    public final void n(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f475867i = str;
    }

    public final void o(int i17) {
        this.f475868j = i17;
    }

    public final void p(android.graphics.Matrix matrix) {
        kotlin.jvm.internal.o.g(matrix, "matrix");
        float[] fArr = {0.0f, 0.0f};
        matrix.mapPoints(fArr, new float[]{this.f475868j / 2.0f, this.f475869k / 2.0f});
        this.f475870l = fArr[0];
        this.f475871m = fArr[1] - this.f475873o.top;
        float[] fArr2 = new float[9];
        matrix.getValues(fArr2);
        double d17 = fArr2[0];
        double d18 = fArr2[3];
        double d19 = fArr2[4];
        this.f475872n = (float) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
        float atan2 = (float) java.lang.Math.atan2(d18, d19);
        zu3.r rVar = this.f475875q;
        if (rVar != null) {
            rVar.c(this.f475870l, this.f475871m, this.f475872n, atan2);
        }
    }

    @Override // zu3.o
    public com.tencent.mm.protobuf.f toProtoBuf() {
        r45.u35 u35Var = new r45.u35();
        u35Var.f386987d = this.f475865g;
        u35Var.f386988e = this.f475867i;
        u35Var.f386989f = f(this.f475763f);
        u35Var.f386990g = e();
        return u35Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:5:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(r45.de r9) {
        /*
            r8 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.o.g(r9, r0)
            zu3.e r0 = zu3.e.f475803o
            r8.<init>(r0)
            java.lang.String r0 = ""
            r8.f475867i = r0
            r1 = 160(0xa0, float:2.24E-43)
            r8.f475868j = r1
            r8.f475869k = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r8.f475872n = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r8.f475873o = r1
            bv3.b r1 = new bv3.b
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r6, r7)
            r8.f475874p = r1
            r45.u35 r1 = new r45.u35
            r1.<init>()
            r45.cu5 r9 = r9.f372339e
            com.tencent.mm.protobuf.g r9 = r9.f371841f
            byte[] r9 = r9.f192156a
            if (r9 != 0) goto L3a
            goto L48
        L3a:
            r1.parseFrom(r9)     // Catch: java.lang.Exception -> L3e
            goto L49
        L3e:
            r9 = move-exception
            java.lang.String r1 = "safeParser"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.tencent.mm.sdk.platformtools.Log.a(r1, r0, r9)
        L48:
            r1 = 0
        L49:
            if (r1 == 0) goto L7e
            java.lang.String r0 = r1.f386987d
            java.lang.String r9 = "pagPath"
            kotlin.jvm.internal.o.f(r0, r9)
            java.lang.String r9 = r1.f386988e
            java.lang.String r2 = "text"
            kotlin.jvm.internal.o.f(r9, r2)
            r8.f475867i = r9
            android.graphics.Matrix r9 = r8.f475763f
            r45.zz6 r2 = r1.f386989f
            java.lang.String r3 = "matrix"
            kotlin.jvm.internal.o.f(r2, r3)
            float[] r2 = r8.g(r2)
            r9.setValues(r2)
            android.graphics.Matrix r9 = r8.f475763f
            r8.p(r9)
            r45.bi0 r9 = r1.f386990g
            if (r9 == 0) goto L7e
            long r1 = r9.f370772d
            long r3 = r9.f370773e
            bv3.d r9 = r8.f475760c
            r9.d(r1, r3)
        L7e:
            r8.f475865g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.y.<init>(r45.de):void");
    }
}
