package r45;

/* loaded from: classes8.dex */
public class yg4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f391046d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391047e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391048f;

    /* renamed from: g, reason: collision with root package name */
    public int f391049g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391050h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391051i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391052m;

    /* renamed from: n, reason: collision with root package name */
    public int f391053n;

    /* renamed from: o, reason: collision with root package name */
    public int f391054o;

    /* renamed from: p, reason: collision with root package name */
    public int f391055p;

    /* renamed from: q, reason: collision with root package name */
    public int f391056q;

    /* renamed from: r, reason: collision with root package name */
    public long f391057r;

    /* renamed from: s, reason: collision with root package name */
    public int f391058s;

    /* renamed from: t, reason: collision with root package name */
    public int f391059t;

    /* renamed from: u, reason: collision with root package name */
    public int f391060u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yg4)) {
            return false;
        }
        r45.yg4 yg4Var = (r45.yg4) fVar;
        return n51.f.a(this.BaseRequest, yg4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f391046d), java.lang.Integer.valueOf(yg4Var.f391046d)) && n51.f.a(this.f391047e, yg4Var.f391047e) && n51.f.a(this.f391048f, yg4Var.f391048f) && n51.f.a(java.lang.Integer.valueOf(this.f391049g), java.lang.Integer.valueOf(yg4Var.f391049g)) && n51.f.a(this.f391050h, yg4Var.f391050h) && n51.f.a(this.f391051i, yg4Var.f391051i) && n51.f.a(this.f391052m, yg4Var.f391052m) && n51.f.a(java.lang.Integer.valueOf(this.f391053n), java.lang.Integer.valueOf(yg4Var.f391053n)) && n51.f.a(java.lang.Integer.valueOf(this.f391054o), java.lang.Integer.valueOf(yg4Var.f391054o)) && n51.f.a(java.lang.Integer.valueOf(this.f391055p), java.lang.Integer.valueOf(yg4Var.f391055p)) && n51.f.a(java.lang.Integer.valueOf(this.f391056q), java.lang.Integer.valueOf(yg4Var.f391056q)) && n51.f.a(java.lang.Long.valueOf(this.f391057r), java.lang.Long.valueOf(yg4Var.f391057r)) && n51.f.a(java.lang.Integer.valueOf(this.f391058s), java.lang.Integer.valueOf(yg4Var.f391058s)) && n51.f.a(java.lang.Integer.valueOf(this.f391059t), java.lang.Integer.valueOf(yg4Var.f391059t)) && n51.f.a(java.lang.Integer.valueOf(this.f391060u), java.lang.Integer.valueOf(yg4Var.f391060u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f391046d);
            java.lang.String str = this.f391047e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f391048f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f391049g);
            java.lang.String str3 = this.f391050h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f391051i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f391052m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f391053n);
            fVar.e(10, this.f391054o);
            fVar.e(11, this.f391055p);
            fVar.e(12, this.f391056q);
            fVar.h(13, this.f391057r);
            fVar.e(14, this.f391058s);
            fVar.e(15, this.f391059t);
            fVar.e(16, this.f391060u);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f391046d);
            java.lang.String str6 = this.f391047e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f391048f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f391049g);
            java.lang.String str8 = this.f391050h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f391051i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f391052m;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            return e17 + b36.f.e(9, this.f391053n) + b36.f.e(10, this.f391054o) + b36.f.e(11, this.f391055p) + b36.f.e(12, this.f391056q) + b36.f.h(13, this.f391057r) + b36.f.e(14, this.f391058s) + b36.f.e(15, this.f391059t) + b36.f.e(16, this.f391060u);
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
        r45.yg4 yg4Var = (r45.yg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    yg4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yg4Var.f391046d = aVar2.g(intValue);
                return 0;
            case 3:
                yg4Var.f391047e = aVar2.k(intValue);
                return 0;
            case 4:
                yg4Var.f391048f = aVar2.k(intValue);
                return 0;
            case 5:
                yg4Var.f391049g = aVar2.g(intValue);
                return 0;
            case 6:
                yg4Var.f391050h = aVar2.k(intValue);
                return 0;
            case 7:
                yg4Var.f391051i = aVar2.k(intValue);
                return 0;
            case 8:
                yg4Var.f391052m = aVar2.k(intValue);
                return 0;
            case 9:
                yg4Var.f391053n = aVar2.g(intValue);
                return 0;
            case 10:
                yg4Var.f391054o = aVar2.g(intValue);
                return 0;
            case 11:
                yg4Var.f391055p = aVar2.g(intValue);
                return 0;
            case 12:
                yg4Var.f391056q = aVar2.g(intValue);
                return 0;
            case 13:
                yg4Var.f391057r = aVar2.i(intValue);
                return 0;
            case 14:
                yg4Var.f391058s = aVar2.g(intValue);
                return 0;
            case 15:
                yg4Var.f391059t = aVar2.g(intValue);
                return 0;
            case 16:
                yg4Var.f391060u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
