package r45;

/* loaded from: classes2.dex */
public class tr0 extends r45.js5 {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public int f386723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386724e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386725f;

    /* renamed from: g, reason: collision with root package name */
    public int f386726g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g07 f386727h;

    /* renamed from: i, reason: collision with root package name */
    public r45.h07 f386728i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cc f386729m;

    /* renamed from: n, reason: collision with root package name */
    public int f386730n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f386731o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f386732p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f386733q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f386734r;

    /* renamed from: s, reason: collision with root package name */
    public r45.gk4 f386735s;

    /* renamed from: t, reason: collision with root package name */
    public int f386736t;

    /* renamed from: u, reason: collision with root package name */
    public long f386737u;

    /* renamed from: v, reason: collision with root package name */
    public int f386738v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f386739w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public int f386740x;

    /* renamed from: y, reason: collision with root package name */
    public int f386741y;

    /* renamed from: z, reason: collision with root package name */
    public long f386742z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tr0)) {
            return false;
        }
        r45.tr0 tr0Var = (r45.tr0) fVar;
        return n51.f.a(this.BaseResponse, tr0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f386723d), java.lang.Integer.valueOf(tr0Var.f386723d)) && n51.f.a(this.f386724e, tr0Var.f386724e) && n51.f.a(this.f386725f, tr0Var.f386725f) && n51.f.a(java.lang.Integer.valueOf(this.f386726g), java.lang.Integer.valueOf(tr0Var.f386726g)) && n51.f.a(this.f386727h, tr0Var.f386727h) && n51.f.a(this.f386728i, tr0Var.f386728i) && n51.f.a(this.f386729m, tr0Var.f386729m) && n51.f.a(java.lang.Integer.valueOf(this.f386730n), java.lang.Integer.valueOf(tr0Var.f386730n)) && n51.f.a(this.f386731o, tr0Var.f386731o) && n51.f.a(this.f386732p, tr0Var.f386732p) && n51.f.a(this.f386733q, tr0Var.f386733q) && n51.f.a(this.f386734r, tr0Var.f386734r) && n51.f.a(this.f386735s, tr0Var.f386735s) && n51.f.a(java.lang.Integer.valueOf(this.f386736t), java.lang.Integer.valueOf(tr0Var.f386736t)) && n51.f.a(java.lang.Long.valueOf(this.f386737u), java.lang.Long.valueOf(tr0Var.f386737u)) && n51.f.a(java.lang.Integer.valueOf(this.f386738v), java.lang.Integer.valueOf(tr0Var.f386738v)) && n51.f.a(this.f386739w, tr0Var.f386739w) && n51.f.a(java.lang.Integer.valueOf(this.f386740x), java.lang.Integer.valueOf(tr0Var.f386740x)) && n51.f.a(java.lang.Integer.valueOf(this.f386741y), java.lang.Integer.valueOf(tr0Var.f386741y)) && n51.f.a(java.lang.Long.valueOf(this.f386742z), java.lang.Long.valueOf(tr0Var.f386742z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(tr0Var.A));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386739w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f386723d);
            java.lang.String str = this.f386724e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f386725f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f386726g);
            r45.g07 g07Var = this.f386727h;
            if (g07Var != null) {
                fVar.i(6, g07Var.computeSize());
                this.f386727h.writeFields(fVar);
            }
            r45.h07 h07Var = this.f386728i;
            if (h07Var != null) {
                fVar.i(7, h07Var.computeSize());
                this.f386728i.writeFields(fVar);
            }
            r45.cc ccVar = this.f386729m;
            if (ccVar != null) {
                fVar.i(8, ccVar.computeSize());
                this.f386729m.writeFields(fVar);
            }
            fVar.e(9, this.f386730n);
            java.lang.String str3 = this.f386731o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f386732p;
            if (finderContact != null) {
                fVar.i(11, finderContact.computeSize());
                this.f386732p.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f386733q;
            if (finderObject != null) {
                fVar.i(12, finderObject.computeSize());
                this.f386733q.writeFields(fVar);
            }
            java.lang.String str4 = this.f386734r;
            if (str4 != null) {
                fVar.j(13, str4);
            }
            r45.gk4 gk4Var = this.f386735s;
            if (gk4Var != null) {
                fVar.i(15, gk4Var.computeSize());
                this.f386735s.writeFields(fVar);
            }
            fVar.e(16, this.f386736t);
            fVar.h(17, this.f386737u);
            fVar.e(18, this.f386738v);
            fVar.g(19, 8, linkedList);
            fVar.e(20, this.f386740x);
            fVar.e(21, this.f386741y);
            fVar.h(22, this.f386742z);
            fVar.e(23, this.A);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f386723d);
            java.lang.String str5 = this.f386724e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f386725f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            int e17 = i18 + b36.f.e(5, this.f386726g);
            r45.g07 g07Var2 = this.f386727h;
            if (g07Var2 != null) {
                e17 += b36.f.i(6, g07Var2.computeSize());
            }
            r45.h07 h07Var2 = this.f386728i;
            if (h07Var2 != null) {
                e17 += b36.f.i(7, h07Var2.computeSize());
            }
            r45.cc ccVar2 = this.f386729m;
            if (ccVar2 != null) {
                e17 += b36.f.i(8, ccVar2.computeSize());
            }
            int e18 = e17 + b36.f.e(9, this.f386730n);
            java.lang.String str7 = this.f386731o;
            if (str7 != null) {
                e18 += b36.f.j(10, str7);
            }
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = this.f386732p;
            if (finderContact2 != null) {
                e18 += b36.f.i(11, finderContact2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f386733q;
            if (finderObject2 != null) {
                e18 += b36.f.i(12, finderObject2.computeSize());
            }
            java.lang.String str8 = this.f386734r;
            if (str8 != null) {
                e18 += b36.f.j(13, str8);
            }
            r45.gk4 gk4Var2 = this.f386735s;
            if (gk4Var2 != null) {
                e18 += b36.f.i(15, gk4Var2.computeSize());
            }
            return e18 + b36.f.e(16, this.f386736t) + b36.f.h(17, this.f386737u) + b36.f.e(18, this.f386738v) + b36.f.g(19, 8, linkedList) + b36.f.e(20, this.f386740x) + b36.f.e(21, this.f386741y) + b36.f.h(22, this.f386742z) + b36.f.e(23, this.A);
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
        r45.tr0 tr0Var = (r45.tr0) objArr[1];
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
                    tr0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                tr0Var.f386723d = aVar2.g(intValue);
                return 0;
            case 3:
                tr0Var.f386724e = aVar2.k(intValue);
                return 0;
            case 4:
                tr0Var.f386725f = aVar2.k(intValue);
                return 0;
            case 5:
                tr0Var.f386726g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.g07 g07Var3 = new r45.g07();
                    if (bArr3 != null && bArr3.length > 0) {
                        g07Var3.parseFrom(bArr3);
                    }
                    tr0Var.f386727h = g07Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.h07 h07Var3 = new r45.h07();
                    if (bArr4 != null && bArr4.length > 0) {
                        h07Var3.parseFrom(bArr4);
                    }
                    tr0Var.f386728i = h07Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.cc ccVar3 = new r45.cc();
                    if (bArr5 != null && bArr5.length > 0) {
                        ccVar3.parseFrom(bArr5);
                    }
                    tr0Var.f386729m = ccVar3;
                }
                return 0;
            case 9:
                tr0Var.f386730n = aVar2.g(intValue);
                return 0;
            case 10:
                tr0Var.f386731o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
                    if (bArr6 != null && bArr6.length > 0) {
                        finderContact3.parseFrom(bArr6);
                    }
                    tr0Var.f386732p = finderContact3;
                }
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = new com.tencent.mm.protocal.protobuf.FinderObject();
                    if (bArr7 != null && bArr7.length > 0) {
                        finderObject3.parseFrom(bArr7);
                    }
                    tr0Var.f386733q = finderObject3;
                }
                return 0;
            case 13:
                tr0Var.f386734r = aVar2.k(intValue);
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.gk4 gk4Var3 = new r45.gk4();
                    if (bArr8 != null && bArr8.length > 0) {
                        gk4Var3.parseFrom(bArr8);
                    }
                    tr0Var.f386735s = gk4Var3;
                }
                return 0;
            case 16:
                tr0Var.f386736t = aVar2.g(intValue);
                return 0;
            case 17:
                tr0Var.f386737u = aVar2.i(intValue);
                return 0;
            case 18:
                tr0Var.f386738v = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.mk4 mk4Var = new r45.mk4();
                    if (bArr9 != null && bArr9.length > 0) {
                        mk4Var.parseFrom(bArr9);
                    }
                    tr0Var.f386739w.add(mk4Var);
                }
                return 0;
            case 20:
                tr0Var.f386740x = aVar2.g(intValue);
                return 0;
            case 21:
                tr0Var.f386741y = aVar2.g(intValue);
                return 0;
            case 22:
                tr0Var.f386742z = aVar2.i(intValue);
                return 0;
            case 23:
                tr0Var.A = aVar2.g(intValue);
                return 0;
        }
    }
}
