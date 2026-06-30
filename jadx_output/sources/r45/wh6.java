package r45;

/* loaded from: classes9.dex */
public class wh6 extends r45.js5 {
    public r45.uh6 A;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f389169d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.zh6 f389170e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389171f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389172g;

    /* renamed from: h, reason: collision with root package name */
    public int f389173h;

    /* renamed from: i, reason: collision with root package name */
    public int f389174i;

    /* renamed from: m, reason: collision with root package name */
    public int f389175m;

    /* renamed from: n, reason: collision with root package name */
    public int f389176n;

    /* renamed from: o, reason: collision with root package name */
    public int f389177o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389178p;

    /* renamed from: q, reason: collision with root package name */
    public int f389179q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f389180r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f389181s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f389182t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f389183u;

    /* renamed from: v, reason: collision with root package name */
    public int f389184v;

    /* renamed from: w, reason: collision with root package name */
    public r45.xh6 f389185w;

    /* renamed from: x, reason: collision with root package name */
    public int f389186x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f389187y;

    /* renamed from: z, reason: collision with root package name */
    public int f389188z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wh6)) {
            return false;
        }
        r45.wh6 wh6Var = (r45.wh6) fVar;
        return n51.f.a(this.BaseResponse, wh6Var.BaseResponse) && n51.f.a(this.f389169d, wh6Var.f389169d) && n51.f.a(this.f389170e, wh6Var.f389170e) && n51.f.a(this.f389171f, wh6Var.f389171f) && n51.f.a(this.f389172g, wh6Var.f389172g) && n51.f.a(java.lang.Integer.valueOf(this.f389173h), java.lang.Integer.valueOf(wh6Var.f389173h)) && n51.f.a(java.lang.Integer.valueOf(this.f389174i), java.lang.Integer.valueOf(wh6Var.f389174i)) && n51.f.a(java.lang.Integer.valueOf(this.f389175m), java.lang.Integer.valueOf(wh6Var.f389175m)) && n51.f.a(java.lang.Integer.valueOf(this.f389176n), java.lang.Integer.valueOf(wh6Var.f389176n)) && n51.f.a(java.lang.Integer.valueOf(this.f389177o), java.lang.Integer.valueOf(wh6Var.f389177o)) && n51.f.a(this.f389178p, wh6Var.f389178p) && n51.f.a(java.lang.Integer.valueOf(this.f389179q), java.lang.Integer.valueOf(wh6Var.f389179q)) && n51.f.a(this.f389180r, wh6Var.f389180r) && n51.f.a(java.lang.Boolean.valueOf(this.f389181s), java.lang.Boolean.valueOf(wh6Var.f389181s)) && n51.f.a(this.f389182t, wh6Var.f389182t) && n51.f.a(this.f389183u, wh6Var.f389183u) && n51.f.a(java.lang.Integer.valueOf(this.f389184v), java.lang.Integer.valueOf(wh6Var.f389184v)) && n51.f.a(this.f389185w, wh6Var.f389185w) && n51.f.a(java.lang.Integer.valueOf(this.f389186x), java.lang.Integer.valueOf(wh6Var.f389186x)) && n51.f.a(this.f389187y, wh6Var.f389187y) && n51.f.a(java.lang.Integer.valueOf(this.f389188z), java.lang.Integer.valueOf(wh6Var.f389188z)) && n51.f.a(this.A, wh6Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389169d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.zh6 zh6Var = this.f389170e;
            if (zh6Var != null) {
                fVar.i(3, zh6Var.computeSize());
                this.f389170e.writeFields(fVar);
            }
            java.lang.String str = this.f389171f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f389172g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f389173h);
            fVar.e(9, this.f389174i);
            fVar.e(10, this.f389175m);
            fVar.e(11, this.f389176n);
            fVar.e(15, this.f389177o);
            com.tencent.mm.protobuf.g gVar = this.f389178p;
            if (gVar != null) {
                fVar.b(16, gVar);
            }
            fVar.e(17, this.f389179q);
            java.lang.String str3 = this.f389180r;
            if (str3 != null) {
                fVar.j(18, str3);
            }
            fVar.a(19, this.f389181s);
            java.lang.String str4 = this.f389182t;
            if (str4 != null) {
                fVar.j(20, str4);
            }
            java.lang.String str5 = this.f389183u;
            if (str5 != null) {
                fVar.j(21, str5);
            }
            fVar.e(22, this.f389184v);
            r45.xh6 xh6Var = this.f389185w;
            if (xh6Var != null) {
                fVar.i(23, xh6Var.computeSize());
                this.f389185w.writeFields(fVar);
            }
            fVar.e(24, this.f389186x);
            java.lang.String str6 = this.f389187y;
            if (str6 != null) {
                fVar.j(25, str6);
            }
            fVar.e(27, this.f389188z);
            r45.uh6 uh6Var = this.A;
            if (uh6Var != null) {
                fVar.i(29, uh6Var.computeSize());
                this.A.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.g(2, 8, linkedList);
            r45.zh6 zh6Var2 = this.f389170e;
            if (zh6Var2 != null) {
                i18 += b36.f.i(3, zh6Var2.computeSize());
            }
            java.lang.String str7 = this.f389171f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f389172g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f389173h) + b36.f.e(9, this.f389174i) + b36.f.e(10, this.f389175m) + b36.f.e(11, this.f389176n) + b36.f.e(15, this.f389177o);
            com.tencent.mm.protobuf.g gVar2 = this.f389178p;
            if (gVar2 != null) {
                e17 += b36.f.b(16, gVar2);
            }
            int e18 = e17 + b36.f.e(17, this.f389179q);
            java.lang.String str9 = this.f389180r;
            if (str9 != null) {
                e18 += b36.f.j(18, str9);
            }
            int a17 = e18 + b36.f.a(19, this.f389181s);
            java.lang.String str10 = this.f389182t;
            if (str10 != null) {
                a17 += b36.f.j(20, str10);
            }
            java.lang.String str11 = this.f389183u;
            if (str11 != null) {
                a17 += b36.f.j(21, str11);
            }
            int e19 = a17 + b36.f.e(22, this.f389184v);
            r45.xh6 xh6Var2 = this.f389185w;
            if (xh6Var2 != null) {
                e19 += b36.f.i(23, xh6Var2.computeSize());
            }
            int e27 = e19 + b36.f.e(24, this.f389186x);
            java.lang.String str12 = this.f389187y;
            if (str12 != null) {
                e27 += b36.f.j(25, str12);
            }
            int e28 = e27 + b36.f.e(27, this.f389188z);
            r45.uh6 uh6Var2 = this.A;
            return uh6Var2 != null ? e28 + b36.f.i(29, uh6Var2.computeSize()) : e28;
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
        r45.wh6 wh6Var = (r45.wh6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    wh6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.th6 th6Var = new r45.th6();
                    if (bArr3 != null && bArr3.length > 0) {
                        th6Var.parseFrom(bArr3);
                    }
                    wh6Var.f389169d.add(th6Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.zh6 zh6Var3 = new r45.zh6();
                    if (bArr4 != null && bArr4.length > 0) {
                        zh6Var3.parseFrom(bArr4);
                    }
                    wh6Var.f389170e = zh6Var3;
                }
                return 0;
            case 4:
                wh6Var.f389171f = aVar2.k(intValue);
                return 0;
            case 5:
                wh6Var.f389172g = aVar2.k(intValue);
                return 0;
            case 6:
                wh6Var.f389173h = aVar2.g(intValue);
                return 0;
            case 7:
            case 8:
            case 12:
            case 13:
            case 14:
            case 26:
            case 28:
            default:
                return -1;
            case 9:
                wh6Var.f389174i = aVar2.g(intValue);
                return 0;
            case 10:
                wh6Var.f389175m = aVar2.g(intValue);
                return 0;
            case 11:
                wh6Var.f389176n = aVar2.g(intValue);
                return 0;
            case 15:
                wh6Var.f389177o = aVar2.g(intValue);
                return 0;
            case 16:
                wh6Var.f389178p = aVar2.d(intValue);
                return 0;
            case 17:
                wh6Var.f389179q = aVar2.g(intValue);
                return 0;
            case 18:
                wh6Var.f389180r = aVar2.k(intValue);
                return 0;
            case 19:
                wh6Var.f389181s = aVar2.c(intValue);
                return 0;
            case 20:
                wh6Var.f389182t = aVar2.k(intValue);
                return 0;
            case 21:
                wh6Var.f389183u = aVar2.k(intValue);
                return 0;
            case 22:
                wh6Var.f389184v = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.xh6 xh6Var3 = new r45.xh6();
                    if (bArr5 != null && bArr5.length > 0) {
                        xh6Var3.parseFrom(bArr5);
                    }
                    wh6Var.f389185w = xh6Var3;
                }
                return 0;
            case 24:
                wh6Var.f389186x = aVar2.g(intValue);
                return 0;
            case 25:
                wh6Var.f389187y = aVar2.k(intValue);
                return 0;
            case 27:
                wh6Var.f389188z = aVar2.g(intValue);
                return 0;
            case 29:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.uh6 uh6Var3 = new r45.uh6();
                    if (bArr6 != null && bArr6.length > 0) {
                        uh6Var3.parseFrom(bArr6);
                    }
                    wh6Var.A = uh6Var3;
                }
                return 0;
        }
    }
}
