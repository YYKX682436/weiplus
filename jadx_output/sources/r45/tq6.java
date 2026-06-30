package r45;

/* loaded from: classes11.dex */
public class tq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386705d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386706e;

    /* renamed from: f, reason: collision with root package name */
    public int f386707f;

    /* renamed from: g, reason: collision with root package name */
    public int f386708g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386709h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386710i;

    /* renamed from: m, reason: collision with root package name */
    public int f386711m;

    /* renamed from: n, reason: collision with root package name */
    public r45.oq6 f386712n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xq6 f386713o;

    /* renamed from: p, reason: collision with root package name */
    public int f386714p;

    /* renamed from: q, reason: collision with root package name */
    public int f386715q;

    /* renamed from: r, reason: collision with root package name */
    public int f386716r;

    /* renamed from: s, reason: collision with root package name */
    public int f386717s;

    /* renamed from: t, reason: collision with root package name */
    public r45.qk0 f386718t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tq6)) {
            return false;
        }
        r45.tq6 tq6Var = (r45.tq6) fVar;
        return n51.f.a(this.f386705d, tq6Var.f386705d) && n51.f.a(this.f386706e, tq6Var.f386706e) && n51.f.a(java.lang.Integer.valueOf(this.f386707f), java.lang.Integer.valueOf(tq6Var.f386707f)) && n51.f.a(java.lang.Integer.valueOf(this.f386708g), java.lang.Integer.valueOf(tq6Var.f386708g)) && n51.f.a(this.f386709h, tq6Var.f386709h) && n51.f.a(this.f386710i, tq6Var.f386710i) && n51.f.a(java.lang.Integer.valueOf(this.f386711m), java.lang.Integer.valueOf(tq6Var.f386711m)) && n51.f.a(this.f386712n, tq6Var.f386712n) && n51.f.a(this.f386713o, tq6Var.f386713o) && n51.f.a(java.lang.Integer.valueOf(this.f386714p), java.lang.Integer.valueOf(tq6Var.f386714p)) && n51.f.a(java.lang.Integer.valueOf(this.f386715q), java.lang.Integer.valueOf(tq6Var.f386715q)) && n51.f.a(java.lang.Integer.valueOf(this.f386716r), java.lang.Integer.valueOf(tq6Var.f386716r)) && n51.f.a(java.lang.Integer.valueOf(this.f386717s), java.lang.Integer.valueOf(tq6Var.f386717s)) && n51.f.a(this.f386718t, tq6Var.f386718t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386705d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386706e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f386707f);
            fVar.e(4, this.f386708g);
            java.lang.String str3 = this.f386709h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f386710i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f386711m);
            r45.oq6 oq6Var = this.f386712n;
            if (oq6Var != null) {
                fVar.i(8, oq6Var.computeSize());
                this.f386712n.writeFields(fVar);
            }
            r45.xq6 xq6Var = this.f386713o;
            if (xq6Var != null) {
                fVar.i(9, xq6Var.computeSize());
                this.f386713o.writeFields(fVar);
            }
            fVar.e(10, this.f386714p);
            fVar.e(11, this.f386715q);
            fVar.e(12, this.f386716r);
            fVar.e(13, this.f386717s);
            r45.qk0 qk0Var = this.f386718t;
            if (qk0Var != null) {
                fVar.i(14, qk0Var.computeSize());
                this.f386718t.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f386705d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            java.lang.String str6 = this.f386706e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f386707f) + b36.f.e(4, this.f386708g);
            java.lang.String str7 = this.f386709h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f386710i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int e18 = e17 + b36.f.e(7, this.f386711m);
            r45.oq6 oq6Var2 = this.f386712n;
            if (oq6Var2 != null) {
                e18 += b36.f.i(8, oq6Var2.computeSize());
            }
            r45.xq6 xq6Var2 = this.f386713o;
            if (xq6Var2 != null) {
                e18 += b36.f.i(9, xq6Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(10, this.f386714p) + b36.f.e(11, this.f386715q) + b36.f.e(12, this.f386716r) + b36.f.e(13, this.f386717s);
            r45.qk0 qk0Var2 = this.f386718t;
            return qk0Var2 != null ? e19 + b36.f.i(14, qk0Var2.computeSize()) : e19;
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
        r45.tq6 tq6Var = (r45.tq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tq6Var.f386705d = aVar2.k(intValue);
                return 0;
            case 2:
                tq6Var.f386706e = aVar2.k(intValue);
                return 0;
            case 3:
                tq6Var.f386707f = aVar2.g(intValue);
                return 0;
            case 4:
                tq6Var.f386708g = aVar2.g(intValue);
                return 0;
            case 5:
                tq6Var.f386709h = aVar2.k(intValue);
                return 0;
            case 6:
                tq6Var.f386710i = aVar2.k(intValue);
                return 0;
            case 7:
                tq6Var.f386711m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.oq6 oq6Var3 = new r45.oq6();
                    if (bArr != null && bArr.length > 0) {
                        oq6Var3.parseFrom(bArr);
                    }
                    tq6Var.f386712n = oq6Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.xq6 xq6Var3 = new r45.xq6();
                    if (bArr2 != null && bArr2.length > 0) {
                        xq6Var3.parseFrom(bArr2);
                    }
                    tq6Var.f386713o = xq6Var3;
                }
                return 0;
            case 10:
                tq6Var.f386714p = aVar2.g(intValue);
                return 0;
            case 11:
                tq6Var.f386715q = aVar2.g(intValue);
                return 0;
            case 12:
                tq6Var.f386716r = aVar2.g(intValue);
                return 0;
            case 13:
                tq6Var.f386717s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.qk0 qk0Var3 = new r45.qk0();
                    if (bArr3 != null && bArr3.length > 0) {
                        qk0Var3.parseFrom(bArr3);
                    }
                    tq6Var.f386718t = qk0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
