package r45;

/* loaded from: classes12.dex */
public class rq3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385098d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385099e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hh7 f385100f;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385103i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385105n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f385106o;

    /* renamed from: r, reason: collision with root package name */
    public boolean f385109r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f385111t;

    /* renamed from: u, reason: collision with root package name */
    public int f385112u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f385113v;

    /* renamed from: x, reason: collision with root package name */
    public int f385115x;

    /* renamed from: y, reason: collision with root package name */
    public r45.eh7 f385116y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f385117z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f385101g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f385102h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f385104m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f385107p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f385108q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f385110s = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f385114w = new java.util.LinkedList();
    public final java.util.LinkedList A = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rq3)) {
            return false;
        }
        r45.rq3 rq3Var = (r45.rq3) fVar;
        return n51.f.a(this.BaseResponse, rq3Var.BaseResponse) && n51.f.a(this.f385098d, rq3Var.f385098d) && n51.f.a(this.f385099e, rq3Var.f385099e) && n51.f.a(this.f385100f, rq3Var.f385100f) && n51.f.a(this.f385101g, rq3Var.f385101g) && n51.f.a(this.f385102h, rq3Var.f385102h) && n51.f.a(this.f385103i, rq3Var.f385103i) && n51.f.a(this.f385104m, rq3Var.f385104m) && n51.f.a(this.f385105n, rq3Var.f385105n) && n51.f.a(this.f385106o, rq3Var.f385106o) && n51.f.a(this.f385107p, rq3Var.f385107p) && n51.f.a(this.f385108q, rq3Var.f385108q) && n51.f.a(java.lang.Boolean.valueOf(this.f385109r), java.lang.Boolean.valueOf(rq3Var.f385109r)) && n51.f.a(this.f385110s, rq3Var.f385110s) && n51.f.a(java.lang.Boolean.valueOf(this.f385111t), java.lang.Boolean.valueOf(rq3Var.f385111t)) && n51.f.a(java.lang.Integer.valueOf(this.f385112u), java.lang.Integer.valueOf(rq3Var.f385112u)) && n51.f.a(this.f385113v, rq3Var.f385113v) && n51.f.a(this.f385114w, rq3Var.f385114w) && n51.f.a(java.lang.Integer.valueOf(this.f385115x), java.lang.Integer.valueOf(rq3Var.f385115x)) && n51.f.a(this.f385116y, rq3Var.f385116y) && n51.f.a(java.lang.Boolean.valueOf(this.f385117z), java.lang.Boolean.valueOf(rq3Var.f385117z)) && n51.f.a(this.A, rq3Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.A;
        java.util.LinkedList linkedList2 = this.f385114w;
        java.util.LinkedList linkedList3 = this.f385110s;
        java.util.LinkedList linkedList4 = this.f385108q;
        java.util.LinkedList linkedList5 = this.f385107p;
        java.util.LinkedList linkedList6 = this.f385104m;
        java.util.LinkedList linkedList7 = this.f385102h;
        java.util.LinkedList linkedList8 = this.f385101g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f385098d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f385099e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.hh7 hh7Var = this.f385100f;
            if (hh7Var != null) {
                fVar.i(4, hh7Var.computeSize());
                this.f385100f.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList8);
            fVar.g(6, 8, linkedList7);
            java.lang.String str3 = this.f385103i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.g(8, 1, linkedList6);
            java.lang.String str4 = this.f385105n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f385106o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.g(14, 8, linkedList5);
            fVar.g(15, 8, linkedList4);
            fVar.a(16, this.f385109r);
            fVar.g(17, 8, linkedList3);
            fVar.a(18, this.f385111t);
            fVar.e(19, this.f385112u);
            java.lang.String str6 = this.f385113v;
            if (str6 != null) {
                fVar.j(20, str6);
            }
            fVar.g(21, 8, linkedList2);
            fVar.e(22, this.f385115x);
            r45.eh7 eh7Var = this.f385116y;
            if (eh7Var != null) {
                fVar.i(23, eh7Var.computeSize());
                this.f385116y.writeFields(fVar);
            }
            fVar.a(24, this.f385117z);
            fVar.g(25, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            java.lang.String str7 = this.f385098d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f385099e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            r45.hh7 hh7Var2 = this.f385100f;
            if (hh7Var2 != null) {
                i18 += b36.f.i(4, hh7Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList8) + b36.f.g(6, 8, linkedList7);
            java.lang.String str9 = this.f385103i;
            if (str9 != null) {
                g17 += b36.f.j(7, str9);
            }
            int g18 = g17 + b36.f.g(8, 1, linkedList6);
            java.lang.String str10 = this.f385105n;
            if (str10 != null) {
                g18 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f385106o;
            if (str11 != null) {
                g18 += b36.f.j(10, str11);
            }
            int g19 = g18 + b36.f.g(14, 8, linkedList5) + b36.f.g(15, 8, linkedList4) + b36.f.a(16, this.f385109r) + b36.f.g(17, 8, linkedList3) + b36.f.a(18, this.f385111t) + b36.f.e(19, this.f385112u);
            java.lang.String str12 = this.f385113v;
            if (str12 != null) {
                g19 += b36.f.j(20, str12);
            }
            int g27 = g19 + b36.f.g(21, 8, linkedList2) + b36.f.e(22, this.f385115x);
            r45.eh7 eh7Var2 = this.f385116y;
            if (eh7Var2 != null) {
                g27 += b36.f.i(23, eh7Var2.computeSize());
            }
            return g27 + b36.f.a(24, this.f385117z) + b36.f.g(25, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList8.clear();
            linkedList7.clear();
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        r45.rq3 rq3Var = (r45.rq3) objArr[1];
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
                    rq3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                rq3Var.f385098d = aVar2.k(intValue);
                return 0;
            case 3:
                rq3Var.f385099e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.hh7 hh7Var3 = new r45.hh7();
                    if (bArr3 != null && bArr3.length > 0) {
                        hh7Var3.parseFrom(bArr3);
                    }
                    rq3Var.f385100f = hh7Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.jh7 jh7Var = new r45.jh7();
                    if (bArr4 != null && bArr4.length > 0) {
                        jh7Var.parseFrom(bArr4);
                    }
                    rq3Var.f385101g.add(jh7Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ih7 ih7Var = new r45.ih7();
                    if (bArr5 != null && bArr5.length > 0) {
                        ih7Var.parseFrom(bArr5);
                    }
                    rq3Var.f385102h.add(ih7Var);
                }
                return 0;
            case 7:
                rq3Var.f385103i = aVar2.k(intValue);
                return 0;
            case 8:
                rq3Var.f385104m.add(aVar2.k(intValue));
                return 0;
            case 9:
                rq3Var.f385105n = aVar2.k(intValue);
                return 0;
            case 10:
                rq3Var.f385106o = aVar2.k(intValue);
                return 0;
            case 11:
            case 12:
            case 13:
            default:
                return -1;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.de6 de6Var = new r45.de6();
                    if (bArr6 != null && bArr6.length > 0) {
                        de6Var.parseFrom(bArr6);
                    }
                    rq3Var.f385107p.add(de6Var);
                }
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.e43 e43Var = new r45.e43();
                    if (bArr7 != null && bArr7.length > 0) {
                        e43Var.parseFrom(bArr7);
                    }
                    rq3Var.f385108q.add(e43Var);
                }
                return 0;
            case 16:
                rq3Var.f385109r = aVar2.c(intValue);
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.cq cqVar = new r45.cq();
                    if (bArr8 != null && bArr8.length > 0) {
                        cqVar.parseFrom(bArr8);
                    }
                    rq3Var.f385110s.add(cqVar);
                }
                return 0;
            case 18:
                rq3Var.f385111t = aVar2.c(intValue);
                return 0;
            case 19:
                rq3Var.f385112u = aVar2.g(intValue);
                return 0;
            case 20:
                rq3Var.f385113v = aVar2.k(intValue);
                return 0;
            case 21:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.ed6 ed6Var = new r45.ed6();
                    if (bArr9 != null && bArr9.length > 0) {
                        ed6Var.parseFrom(bArr9);
                    }
                    rq3Var.f385114w.add(ed6Var);
                }
                return 0;
            case 22:
                rq3Var.f385115x = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.eh7 eh7Var3 = new r45.eh7();
                    if (bArr10 != null && bArr10.length > 0) {
                        eh7Var3.parseFrom(bArr10);
                    }
                    rq3Var.f385116y = eh7Var3;
                }
                return 0;
            case 24:
                rq3Var.f385117z = aVar2.c(intValue);
                return 0;
            case 25:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.dd6 dd6Var = new r45.dd6();
                    if (bArr11 != null && bArr11.length > 0) {
                        dd6Var.parseFrom(bArr11);
                    }
                    rq3Var.A.add(dd6Var);
                }
                return 0;
        }
    }
}
