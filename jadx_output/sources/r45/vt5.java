package r45;

/* loaded from: classes14.dex */
public class vt5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388523d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388524e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388525f;

    /* renamed from: g, reason: collision with root package name */
    public int f388526g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388527h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388528i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388529m;

    /* renamed from: n, reason: collision with root package name */
    public long f388530n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388531o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f388532p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388533q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt5)) {
            return false;
        }
        r45.vt5 vt5Var = (r45.vt5) fVar;
        return n51.f.a(this.f388523d, vt5Var.f388523d) && n51.f.a(this.f388524e, vt5Var.f388524e) && n51.f.a(this.f388525f, vt5Var.f388525f) && n51.f.a(java.lang.Integer.valueOf(this.f388526g), java.lang.Integer.valueOf(vt5Var.f388526g)) && n51.f.a(this.f388527h, vt5Var.f388527h) && n51.f.a(this.f388528i, vt5Var.f388528i) && n51.f.a(this.f388529m, vt5Var.f388529m) && n51.f.a(java.lang.Long.valueOf(this.f388530n), java.lang.Long.valueOf(vt5Var.f388530n)) && n51.f.a(this.f388531o, vt5Var.f388531o) && n51.f.a(this.f388532p, vt5Var.f388532p) && n51.f.a(this.f388533q, vt5Var.f388533q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388523d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388524e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388525f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f388526g);
            com.tencent.mm.protobuf.g gVar = this.f388527h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str4 = this.f388528i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f388529m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f388530n);
            java.lang.String str6 = this.f388531o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f388532p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f388533q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f388523d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f388524e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f388525f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int e17 = j17 + b36.f.e(4, this.f388526g);
            com.tencent.mm.protobuf.g gVar2 = this.f388527h;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            java.lang.String str12 = this.f388528i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f388529m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            int h17 = e17 + b36.f.h(8, this.f388530n);
            java.lang.String str14 = this.f388531o;
            if (str14 != null) {
                h17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f388532p;
            if (str15 != null) {
                h17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f388533q;
            return str16 != null ? h17 + b36.f.j(11, str16) : h17;
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
        r45.vt5 vt5Var = (r45.vt5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vt5Var.f388523d = aVar2.k(intValue);
                return 0;
            case 2:
                vt5Var.f388524e = aVar2.k(intValue);
                return 0;
            case 3:
                vt5Var.f388525f = aVar2.k(intValue);
                return 0;
            case 4:
                vt5Var.f388526g = aVar2.g(intValue);
                return 0;
            case 5:
                vt5Var.f388527h = aVar2.d(intValue);
                return 0;
            case 6:
                vt5Var.f388528i = aVar2.k(intValue);
                return 0;
            case 7:
                vt5Var.f388529m = aVar2.k(intValue);
                return 0;
            case 8:
                vt5Var.f388530n = aVar2.i(intValue);
                return 0;
            case 9:
                vt5Var.f388531o = aVar2.k(intValue);
                return 0;
            case 10:
                vt5Var.f388532p = aVar2.k(intValue);
                return 0;
            case 11:
                vt5Var.f388533q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
