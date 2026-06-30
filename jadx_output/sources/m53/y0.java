package m53;

/* loaded from: classes8.dex */
public class y0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f324183d;

    /* renamed from: e, reason: collision with root package name */
    public int f324184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324185f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324186g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f324187h;

    /* renamed from: i, reason: collision with root package name */
    public m53.m3 f324188i;

    /* renamed from: m, reason: collision with root package name */
    public m53.z5 f324189m;

    /* renamed from: n, reason: collision with root package name */
    public m53.w3 f324190n;

    /* renamed from: o, reason: collision with root package name */
    public m53.x3 f324191o;

    /* renamed from: p, reason: collision with root package name */
    public m53.s1 f324192p;

    /* renamed from: q, reason: collision with root package name */
    public m53.k4 f324193q;

    /* renamed from: r, reason: collision with root package name */
    public m53.m1 f324194r;

    /* renamed from: s, reason: collision with root package name */
    public m53.x f324195s;

    /* renamed from: t, reason: collision with root package name */
    public m53.e4 f324196t;

    /* renamed from: u, reason: collision with root package name */
    public m53.v4 f324197u;

    /* renamed from: v, reason: collision with root package name */
    public m53.w f324198v;

    /* renamed from: w, reason: collision with root package name */
    public m53.w f324199w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.y0)) {
            return false;
        }
        m53.y0 y0Var = (m53.y0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f324183d), java.lang.Integer.valueOf(y0Var.f324183d)) && n51.f.a(java.lang.Integer.valueOf(this.f324184e), java.lang.Integer.valueOf(y0Var.f324184e)) && n51.f.a(this.f324185f, y0Var.f324185f) && n51.f.a(this.f324186g, y0Var.f324186g) && n51.f.a(this.f324187h, y0Var.f324187h) && n51.f.a(this.f324188i, y0Var.f324188i) && n51.f.a(this.f324189m, y0Var.f324189m) && n51.f.a(this.f324190n, y0Var.f324190n) && n51.f.a(this.f324191o, y0Var.f324191o) && n51.f.a(this.f324192p, y0Var.f324192p) && n51.f.a(this.f324193q, y0Var.f324193q) && n51.f.a(this.f324194r, y0Var.f324194r) && n51.f.a(this.f324195s, y0Var.f324195s) && n51.f.a(this.f324196t, y0Var.f324196t) && n51.f.a(this.f324197u, y0Var.f324197u) && n51.f.a(this.f324198v, y0Var.f324198v) && n51.f.a(this.f324199w, y0Var.f324199w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f324183d);
            fVar.e(2, this.f324184e);
            java.lang.String str = this.f324185f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f324186g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f324187h;
            if (str3 != null) {
                fVar.j(17, str3);
            }
            m53.m3 m3Var = this.f324188i;
            if (m3Var != null) {
                fVar.i(5, m3Var.computeSize());
                this.f324188i.writeFields(fVar);
            }
            m53.z5 z5Var = this.f324189m;
            if (z5Var != null) {
                fVar.i(6, z5Var.computeSize());
                this.f324189m.writeFields(fVar);
            }
            m53.w3 w3Var = this.f324190n;
            if (w3Var != null) {
                fVar.i(7, w3Var.computeSize());
                this.f324190n.writeFields(fVar);
            }
            m53.x3 x3Var = this.f324191o;
            if (x3Var != null) {
                fVar.i(8, x3Var.computeSize());
                this.f324191o.writeFields(fVar);
            }
            m53.s1 s1Var = this.f324192p;
            if (s1Var != null) {
                fVar.i(9, s1Var.computeSize());
                this.f324192p.writeFields(fVar);
            }
            m53.k4 k4Var = this.f324193q;
            if (k4Var != null) {
                fVar.i(10, k4Var.computeSize());
                this.f324193q.writeFields(fVar);
            }
            m53.m1 m1Var = this.f324194r;
            if (m1Var != null) {
                fVar.i(11, m1Var.computeSize());
                this.f324194r.writeFields(fVar);
            }
            m53.x xVar = this.f324195s;
            if (xVar != null) {
                fVar.i(12, xVar.computeSize());
                this.f324195s.writeFields(fVar);
            }
            m53.e4 e4Var = this.f324196t;
            if (e4Var != null) {
                fVar.i(13, e4Var.computeSize());
                this.f324196t.writeFields(fVar);
            }
            m53.v4 v4Var = this.f324197u;
            if (v4Var != null) {
                fVar.i(14, v4Var.computeSize());
                this.f324197u.writeFields(fVar);
            }
            m53.w wVar = this.f324198v;
            if (wVar != null) {
                fVar.i(15, wVar.computeSize());
                this.f324198v.writeFields(fVar);
            }
            m53.w wVar2 = this.f324199w;
            if (wVar2 != null) {
                fVar.i(16, wVar2.computeSize());
                this.f324199w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f324183d) + 0 + b36.f.e(2, this.f324184e);
            java.lang.String str4 = this.f324185f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f324186g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f324187h;
            if (str6 != null) {
                e17 += b36.f.j(17, str6);
            }
            m53.m3 m3Var2 = this.f324188i;
            if (m3Var2 != null) {
                e17 += b36.f.i(5, m3Var2.computeSize());
            }
            m53.z5 z5Var2 = this.f324189m;
            if (z5Var2 != null) {
                e17 += b36.f.i(6, z5Var2.computeSize());
            }
            m53.w3 w3Var2 = this.f324190n;
            if (w3Var2 != null) {
                e17 += b36.f.i(7, w3Var2.computeSize());
            }
            m53.x3 x3Var2 = this.f324191o;
            if (x3Var2 != null) {
                e17 += b36.f.i(8, x3Var2.computeSize());
            }
            m53.s1 s1Var2 = this.f324192p;
            if (s1Var2 != null) {
                e17 += b36.f.i(9, s1Var2.computeSize());
            }
            m53.k4 k4Var2 = this.f324193q;
            if (k4Var2 != null) {
                e17 += b36.f.i(10, k4Var2.computeSize());
            }
            m53.m1 m1Var2 = this.f324194r;
            if (m1Var2 != null) {
                e17 += b36.f.i(11, m1Var2.computeSize());
            }
            m53.x xVar2 = this.f324195s;
            if (xVar2 != null) {
                e17 += b36.f.i(12, xVar2.computeSize());
            }
            m53.e4 e4Var2 = this.f324196t;
            if (e4Var2 != null) {
                e17 += b36.f.i(13, e4Var2.computeSize());
            }
            m53.v4 v4Var2 = this.f324197u;
            if (v4Var2 != null) {
                e17 += b36.f.i(14, v4Var2.computeSize());
            }
            m53.w wVar3 = this.f324198v;
            if (wVar3 != null) {
                e17 += b36.f.i(15, wVar3.computeSize());
            }
            m53.w wVar4 = this.f324199w;
            return wVar4 != null ? e17 + b36.f.i(16, wVar4.computeSize()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        m53.y0 y0Var = (m53.y0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y0Var.f324183d = aVar2.g(intValue);
                return 0;
            case 2:
                y0Var.f324184e = aVar2.g(intValue);
                return 0;
            case 3:
                y0Var.f324185f = aVar2.k(intValue);
                return 0;
            case 4:
                y0Var.f324186g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    m53.m3 m3Var3 = new m53.m3();
                    if (bArr != null && bArr.length > 0) {
                        m3Var3.parseFrom(bArr);
                    }
                    y0Var.f324188i = m3Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    m53.z5 z5Var3 = new m53.z5();
                    if (bArr2 != null && bArr2.length > 0) {
                        z5Var3.parseFrom(bArr2);
                    }
                    y0Var.f324189m = z5Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    m53.w3 w3Var3 = new m53.w3();
                    if (bArr3 != null && bArr3.length > 0) {
                        w3Var3.parseFrom(bArr3);
                    }
                    y0Var.f324190n = w3Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    m53.x3 x3Var3 = new m53.x3();
                    if (bArr4 != null && bArr4.length > 0) {
                        x3Var3.parseFrom(bArr4);
                    }
                    y0Var.f324191o = x3Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    m53.s1 s1Var3 = new m53.s1();
                    if (bArr5 != null && bArr5.length > 0) {
                        s1Var3.parseFrom(bArr5);
                    }
                    y0Var.f324192p = s1Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    m53.k4 k4Var3 = new m53.k4();
                    if (bArr6 != null && bArr6.length > 0) {
                        k4Var3.parseFrom(bArr6);
                    }
                    y0Var.f324193q = k4Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    m53.m1 m1Var3 = new m53.m1();
                    if (bArr7 != null && bArr7.length > 0) {
                        m1Var3.parseFrom(bArr7);
                    }
                    y0Var.f324194r = m1Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    m53.x xVar3 = new m53.x();
                    if (bArr8 != null && bArr8.length > 0) {
                        xVar3.parseFrom(bArr8);
                    }
                    y0Var.f324195s = xVar3;
                }
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    m53.e4 e4Var3 = new m53.e4();
                    if (bArr9 != null && bArr9.length > 0) {
                        e4Var3.parseFrom(bArr9);
                    }
                    y0Var.f324196t = e4Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    m53.v4 v4Var3 = new m53.v4();
                    if (bArr10 != null && bArr10.length > 0) {
                        v4Var3.parseFrom(bArr10);
                    }
                    y0Var.f324197u = v4Var3;
                }
                return 0;
            case 15:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    m53.w wVar5 = new m53.w();
                    if (bArr11 != null && bArr11.length > 0) {
                        wVar5.parseFrom(bArr11);
                    }
                    y0Var.f324198v = wVar5;
                }
                return 0;
            case 16:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    m53.w wVar6 = new m53.w();
                    if (bArr12 != null && bArr12.length > 0) {
                        wVar6.parseFrom(bArr12);
                    }
                    y0Var.f324199w = wVar6;
                }
                return 0;
            case 17:
                y0Var.f324187h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
