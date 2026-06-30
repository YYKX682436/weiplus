package r45;

/* loaded from: classes9.dex */
public class nf0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381336d;

    /* renamed from: e, reason: collision with root package name */
    public int f381337e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381338f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381339g;

    /* renamed from: h, reason: collision with root package name */
    public int f381340h;

    /* renamed from: i, reason: collision with root package name */
    public int f381341i;

    /* renamed from: m, reason: collision with root package name */
    public int f381342m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381343n;

    /* renamed from: o, reason: collision with root package name */
    public int f381344o;

    /* renamed from: p, reason: collision with root package name */
    public int f381345p;

    /* renamed from: q, reason: collision with root package name */
    public int f381346q;

    /* renamed from: r, reason: collision with root package name */
    public long f381347r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nf0)) {
            return false;
        }
        r45.nf0 nf0Var = (r45.nf0) fVar;
        return n51.f.a(this.BaseRequest, nf0Var.BaseRequest) && n51.f.a(this.f381336d, nf0Var.f381336d) && n51.f.a(java.lang.Integer.valueOf(this.f381337e), java.lang.Integer.valueOf(nf0Var.f381337e)) && n51.f.a(this.f381338f, nf0Var.f381338f) && n51.f.a(this.f381339g, nf0Var.f381339g) && n51.f.a(java.lang.Integer.valueOf(this.f381340h), java.lang.Integer.valueOf(nf0Var.f381340h)) && n51.f.a(java.lang.Integer.valueOf(this.f381341i), java.lang.Integer.valueOf(nf0Var.f381341i)) && n51.f.a(java.lang.Integer.valueOf(this.f381342m), java.lang.Integer.valueOf(nf0Var.f381342m)) && n51.f.a(this.f381343n, nf0Var.f381343n) && n51.f.a(java.lang.Integer.valueOf(this.f381344o), java.lang.Integer.valueOf(nf0Var.f381344o)) && n51.f.a(java.lang.Integer.valueOf(this.f381345p), java.lang.Integer.valueOf(nf0Var.f381345p)) && n51.f.a(java.lang.Integer.valueOf(this.f381346q), java.lang.Integer.valueOf(nf0Var.f381346q)) && n51.f.a(java.lang.Long.valueOf(this.f381347r), java.lang.Long.valueOf(nf0Var.f381347r));
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
            java.lang.String str = this.f381336d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f381337e);
            java.lang.String str2 = this.f381338f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381339g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f381340h);
            fVar.e(7, this.f381341i);
            fVar.e(8, this.f381342m);
            java.lang.String str4 = this.f381343n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f381344o);
            fVar.e(11, this.f381345p);
            fVar.e(12, this.f381346q);
            fVar.h(13, this.f381347r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f381336d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f381337e);
            java.lang.String str6 = this.f381338f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f381339g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f381340h) + b36.f.e(7, this.f381341i) + b36.f.e(8, this.f381342m);
            java.lang.String str8 = this.f381343n;
            if (str8 != null) {
                e18 += b36.f.j(9, str8);
            }
            return e18 + b36.f.e(10, this.f381344o) + b36.f.e(11, this.f381345p) + b36.f.e(12, this.f381346q) + b36.f.h(13, this.f381347r);
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
        r45.nf0 nf0Var = (r45.nf0) objArr[1];
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
                    nf0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                nf0Var.f381336d = aVar2.k(intValue);
                return 0;
            case 3:
                nf0Var.f381337e = aVar2.g(intValue);
                return 0;
            case 4:
                nf0Var.f381338f = aVar2.k(intValue);
                return 0;
            case 5:
                nf0Var.f381339g = aVar2.k(intValue);
                return 0;
            case 6:
                nf0Var.f381340h = aVar2.g(intValue);
                return 0;
            case 7:
                nf0Var.f381341i = aVar2.g(intValue);
                return 0;
            case 8:
                nf0Var.f381342m = aVar2.g(intValue);
                return 0;
            case 9:
                nf0Var.f381343n = aVar2.k(intValue);
                return 0;
            case 10:
                nf0Var.f381344o = aVar2.g(intValue);
                return 0;
            case 11:
                nf0Var.f381345p = aVar2.g(intValue);
                return 0;
            case 12:
                nf0Var.f381346q = aVar2.g(intValue);
                return 0;
            case 13:
                nf0Var.f381347r = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
