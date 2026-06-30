package r45;

/* loaded from: classes10.dex */
public class w03 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f388745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388746e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388747f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388748g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388749h;

    /* renamed from: i, reason: collision with root package name */
    public long f388750i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388751m;

    /* renamed from: n, reason: collision with root package name */
    public long f388752n;

    /* renamed from: o, reason: collision with root package name */
    public long f388753o;

    /* renamed from: p, reason: collision with root package name */
    public int f388754p;

    /* renamed from: q, reason: collision with root package name */
    public int f388755q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f388756r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public int f388757s;

    /* renamed from: t, reason: collision with root package name */
    public r45.e60 f388758t;

    /* renamed from: u, reason: collision with root package name */
    public long f388759u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f388760v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f388761w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388762x;

    /* renamed from: y, reason: collision with root package name */
    public int f388763y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w03)) {
            return false;
        }
        r45.w03 w03Var = (r45.w03) fVar;
        return n51.f.a(this.BaseRequest, w03Var.BaseRequest) && n51.f.a(this.f388745d, w03Var.f388745d) && n51.f.a(this.f388746e, w03Var.f388746e) && n51.f.a(this.f388747f, w03Var.f388747f) && n51.f.a(this.f388748g, w03Var.f388748g) && n51.f.a(this.f388749h, w03Var.f388749h) && n51.f.a(java.lang.Long.valueOf(this.f388750i), java.lang.Long.valueOf(w03Var.f388750i)) && n51.f.a(this.f388751m, w03Var.f388751m) && n51.f.a(java.lang.Long.valueOf(this.f388752n), java.lang.Long.valueOf(w03Var.f388752n)) && n51.f.a(java.lang.Long.valueOf(this.f388753o), java.lang.Long.valueOf(w03Var.f388753o)) && n51.f.a(java.lang.Integer.valueOf(this.f388754p), java.lang.Integer.valueOf(w03Var.f388754p)) && n51.f.a(java.lang.Integer.valueOf(this.f388755q), java.lang.Integer.valueOf(w03Var.f388755q)) && n51.f.a(this.f388756r, w03Var.f388756r) && n51.f.a(java.lang.Integer.valueOf(this.f388757s), java.lang.Integer.valueOf(w03Var.f388757s)) && n51.f.a(this.f388758t, w03Var.f388758t) && n51.f.a(java.lang.Long.valueOf(this.f388759u), java.lang.Long.valueOf(w03Var.f388759u)) && n51.f.a(this.f388760v, w03Var.f388760v) && n51.f.a(this.f388761w, w03Var.f388761w) && n51.f.a(this.f388762x, w03Var.f388762x) && n51.f.a(java.lang.Integer.valueOf(this.f388763y), java.lang.Integer.valueOf(w03Var.f388763y));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388756r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.kv0 kv0Var = this.f388745d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f388745d.writeFields(fVar);
            }
            java.lang.String str = this.f388746e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f388747f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f388748g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f388749h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.h(7, this.f388750i);
            java.lang.String str5 = this.f388751m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.h(9, this.f388752n);
            fVar.h(10, this.f388753o);
            fVar.e(11, this.f388754p);
            fVar.e(12, this.f388755q);
            fVar.g(13, 8, linkedList);
            fVar.e(14, this.f388757s);
            r45.e60 e60Var = this.f388758t;
            if (e60Var != null) {
                fVar.i(15, e60Var.computeSize());
                this.f388758t.writeFields(fVar);
            }
            fVar.h(16, this.f388759u);
            java.lang.String str6 = this.f388760v;
            if (str6 != null) {
                fVar.j(17, str6);
            }
            java.lang.String str7 = this.f388761w;
            if (str7 != null) {
                fVar.j(18, str7);
            }
            com.tencent.mm.protobuf.g gVar = this.f388762x;
            if (gVar != null) {
                fVar.b(100, gVar);
            }
            fVar.e(101, this.f388763y);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f388745d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str8 = this.f388746e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f388747f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f388748g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f388749h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            int h17 = i18 + b36.f.h(7, this.f388750i);
            java.lang.String str12 = this.f388751m;
            if (str12 != null) {
                h17 += b36.f.j(8, str12);
            }
            int h18 = h17 + b36.f.h(9, this.f388752n) + b36.f.h(10, this.f388753o) + b36.f.e(11, this.f388754p) + b36.f.e(12, this.f388755q) + b36.f.g(13, 8, linkedList) + b36.f.e(14, this.f388757s);
            r45.e60 e60Var2 = this.f388758t;
            if (e60Var2 != null) {
                h18 += b36.f.i(15, e60Var2.computeSize());
            }
            int h19 = h18 + b36.f.h(16, this.f388759u);
            java.lang.String str13 = this.f388760v;
            if (str13 != null) {
                h19 += b36.f.j(17, str13);
            }
            java.lang.String str14 = this.f388761w;
            if (str14 != null) {
                h19 += b36.f.j(18, str14);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388762x;
            if (gVar2 != null) {
                h19 += b36.f.b(100, gVar2);
            }
            return h19 + b36.f.e(101, this.f388763y);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.w03 w03Var = (r45.w03) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            w03Var.f388762x = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 101) {
            w03Var.f388763y = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    w03Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.parseFrom(bArr3);
                    }
                    w03Var.f388745d = kv0Var3;
                }
                return 0;
            case 3:
                w03Var.f388746e = aVar2.k(intValue);
                return 0;
            case 4:
                w03Var.f388747f = aVar2.k(intValue);
                return 0;
            case 5:
                w03Var.f388748g = aVar2.k(intValue);
                return 0;
            case 6:
                w03Var.f388749h = aVar2.k(intValue);
                return 0;
            case 7:
                w03Var.f388750i = aVar2.i(intValue);
                return 0;
            case 8:
                w03Var.f388751m = aVar2.k(intValue);
                return 0;
            case 9:
                w03Var.f388752n = aVar2.i(intValue);
                return 0;
            case 10:
                w03Var.f388753o = aVar2.i(intValue);
                return 0;
            case 11:
                w03Var.f388754p = aVar2.g(intValue);
                return 0;
            case 12:
                w03Var.f388755q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.oy0 oy0Var = new r45.oy0();
                    if (bArr4 != null && bArr4.length > 0) {
                        oy0Var.parseFrom(bArr4);
                    }
                    w03Var.f388756r.add(oy0Var);
                }
                return 0;
            case 14:
                w03Var.f388757s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.e60 e60Var3 = new r45.e60();
                    if (bArr5 != null && bArr5.length > 0) {
                        e60Var3.parseFrom(bArr5);
                    }
                    w03Var.f388758t = e60Var3;
                }
                return 0;
            case 16:
                w03Var.f388759u = aVar2.i(intValue);
                return 0;
            case 17:
                w03Var.f388760v = aVar2.k(intValue);
                return 0;
            case 18:
                w03Var.f388761w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
