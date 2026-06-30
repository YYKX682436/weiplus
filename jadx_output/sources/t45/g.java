package t45;

/* loaded from: classes10.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.f f415560d;

    /* renamed from: e, reason: collision with root package name */
    public t45.h f415561e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f415562f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f415563g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f415564h;

    /* renamed from: i, reason: collision with root package name */
    public t45.m0 f415565i;

    /* renamed from: m, reason: collision with root package name */
    public int f415566m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f415567n;

    /* renamed from: o, reason: collision with root package name */
    public long f415568o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f415569p;

    /* renamed from: q, reason: collision with root package name */
    public int f415570q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f415571r;

    /* renamed from: s, reason: collision with root package name */
    public long f415572s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f415573t;

    /* renamed from: u, reason: collision with root package name */
    public int f415574u;

    /* renamed from: v, reason: collision with root package name */
    public t45.p0 f415575v;

    /* renamed from: w, reason: collision with root package name */
    public t45.h0 f415576w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f415577x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.g)) {
            return false;
        }
        t45.g gVar = (t45.g) fVar;
        return n51.f.a(this.f415560d, gVar.f415560d) && n51.f.a(this.f415561e, gVar.f415561e) && n51.f.a(this.f415562f, gVar.f415562f) && n51.f.a(this.f415563g, gVar.f415563g) && n51.f.a(this.f415564h, gVar.f415564h) && n51.f.a(this.f415565i, gVar.f415565i) && n51.f.a(java.lang.Integer.valueOf(this.f415566m), java.lang.Integer.valueOf(gVar.f415566m)) && n51.f.a(this.f415567n, gVar.f415567n) && n51.f.a(java.lang.Long.valueOf(this.f415568o), java.lang.Long.valueOf(gVar.f415568o)) && n51.f.a(this.f415569p, gVar.f415569p) && n51.f.a(java.lang.Integer.valueOf(this.f415570q), java.lang.Integer.valueOf(gVar.f415570q)) && n51.f.a(this.f415571r, gVar.f415571r) && n51.f.a(java.lang.Long.valueOf(this.f415572s), java.lang.Long.valueOf(gVar.f415572s)) && n51.f.a(this.f415573t, gVar.f415573t) && n51.f.a(java.lang.Integer.valueOf(this.f415574u), java.lang.Integer.valueOf(gVar.f415574u)) && n51.f.a(this.f415575v, gVar.f415575v) && n51.f.a(this.f415576w, gVar.f415576w) && n51.f.a(this.f415577x, gVar.f415577x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.f fVar2 = this.f415560d;
            if (fVar2 != null) {
                fVar.i(1, fVar2.computeSize());
                this.f415560d.writeFields(fVar);
            }
            t45.h hVar = this.f415561e;
            if (hVar != null) {
                fVar.i(2, hVar.computeSize());
                this.f415561e.writeFields(fVar);
            }
            java.lang.String str = this.f415562f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f415563g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f415564h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            t45.m0 m0Var = this.f415565i;
            if (m0Var != null) {
                fVar.i(6, m0Var.computeSize());
                this.f415565i.writeFields(fVar);
            }
            fVar.e(7, this.f415566m);
            java.lang.String str4 = this.f415567n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.h(9, this.f415568o);
            java.lang.String str5 = this.f415569p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f415570q);
            java.lang.String str6 = this.f415571r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            fVar.h(13, this.f415572s);
            java.lang.String str7 = this.f415573t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.e(15, this.f415574u);
            t45.p0 p0Var = this.f415575v;
            if (p0Var != null) {
                fVar.i(16, p0Var.computeSize());
                this.f415575v.writeFields(fVar);
            }
            t45.h0 h0Var = this.f415576w;
            if (h0Var != null) {
                fVar.i(17, h0Var.computeSize());
                this.f415576w.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f415577x;
            if (gVar != null) {
                fVar.b(18, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            t45.f fVar3 = this.f415560d;
            int i18 = fVar3 != null ? b36.f.i(1, fVar3.computeSize()) + 0 : 0;
            t45.h hVar2 = this.f415561e;
            if (hVar2 != null) {
                i18 += b36.f.i(2, hVar2.computeSize());
            }
            java.lang.String str8 = this.f415562f;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f415563g;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f415564h;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            t45.m0 m0Var2 = this.f415565i;
            if (m0Var2 != null) {
                i18 += b36.f.i(6, m0Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(7, this.f415566m);
            java.lang.String str11 = this.f415567n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            int h17 = e17 + b36.f.h(9, this.f415568o);
            java.lang.String str12 = this.f415569p;
            if (str12 != null) {
                h17 += b36.f.j(10, str12);
            }
            int e18 = h17 + b36.f.e(11, this.f415570q);
            java.lang.String str13 = this.f415571r;
            if (str13 != null) {
                e18 += b36.f.j(12, str13);
            }
            int h18 = e18 + b36.f.h(13, this.f415572s);
            java.lang.String str14 = this.f415573t;
            if (str14 != null) {
                h18 += b36.f.j(14, str14);
            }
            int e19 = h18 + b36.f.e(15, this.f415574u);
            t45.p0 p0Var2 = this.f415575v;
            if (p0Var2 != null) {
                e19 += b36.f.i(16, p0Var2.computeSize());
            }
            t45.h0 h0Var2 = this.f415576w;
            if (h0Var2 != null) {
                e19 += b36.f.i(17, h0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f415577x;
            return gVar2 != null ? e19 + b36.f.b(18, gVar2) : e19;
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
        t45.g gVar3 = (t45.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    t45.f fVar4 = new t45.f();
                    if (bArr != null && bArr.length > 0) {
                        fVar4.parseFrom(bArr);
                    }
                    gVar3.f415560d = fVar4;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    t45.h hVar3 = new t45.h();
                    if (bArr2 != null && bArr2.length > 0) {
                        hVar3.parseFrom(bArr2);
                    }
                    gVar3.f415561e = hVar3;
                }
                return 0;
            case 3:
                gVar3.f415562f = aVar2.k(intValue);
                return 0;
            case 4:
                gVar3.f415563g = aVar2.k(intValue);
                return 0;
            case 5:
                gVar3.f415564h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    t45.m0 m0Var3 = new t45.m0();
                    if (bArr3 != null && bArr3.length > 0) {
                        m0Var3.parseFrom(bArr3);
                    }
                    gVar3.f415565i = m0Var3;
                }
                return 0;
            case 7:
                gVar3.f415566m = aVar2.g(intValue);
                return 0;
            case 8:
                gVar3.f415567n = aVar2.k(intValue);
                return 0;
            case 9:
                gVar3.f415568o = aVar2.i(intValue);
                return 0;
            case 10:
                gVar3.f415569p = aVar2.k(intValue);
                return 0;
            case 11:
                gVar3.f415570q = aVar2.g(intValue);
                return 0;
            case 12:
                gVar3.f415571r = aVar2.k(intValue);
                return 0;
            case 13:
                gVar3.f415572s = aVar2.i(intValue);
                return 0;
            case 14:
                gVar3.f415573t = aVar2.k(intValue);
                return 0;
            case 15:
                gVar3.f415574u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    t45.p0 p0Var3 = new t45.p0();
                    if (bArr4 != null && bArr4.length > 0) {
                        p0Var3.parseFrom(bArr4);
                    }
                    gVar3.f415575v = p0Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    t45.h0 h0Var3 = new t45.h0();
                    if (bArr5 != null && bArr5.length > 0) {
                        h0Var3.parseFrom(bArr5);
                    }
                    gVar3.f415576w = h0Var3;
                }
                return 0;
            case 18:
                gVar3.f415577x = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
