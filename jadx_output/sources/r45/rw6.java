package r45;

/* loaded from: classes2.dex */
public class rw6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385247d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385248e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385249f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385250g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385251h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385252i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385253m;

    /* renamed from: n, reason: collision with root package name */
    public long f385254n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rw6)) {
            return false;
        }
        r45.rw6 rw6Var = (r45.rw6) fVar;
        return n51.f.a(this.f385247d, rw6Var.f385247d) && n51.f.a(this.f385248e, rw6Var.f385248e) && n51.f.a(this.f385249f, rw6Var.f385249f) && n51.f.a(this.f385250g, rw6Var.f385250g) && n51.f.a(this.f385251h, rw6Var.f385251h) && n51.f.a(this.f385252i, rw6Var.f385252i) && n51.f.a(this.f385253m, rw6Var.f385253m) && n51.f.a(java.lang.Long.valueOf(this.f385254n), java.lang.Long.valueOf(rw6Var.f385254n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385247d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385248e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385249f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f385250g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f385251h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f385252i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f385253m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.h(8, this.f385254n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f385247d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f385248e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f385249f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f385250g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f385251h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f385252i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f385253m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.h(8, this.f385254n);
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
        r45.rw6 rw6Var = (r45.rw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rw6Var.f385247d = aVar2.k(intValue);
                return 0;
            case 2:
                rw6Var.f385248e = aVar2.k(intValue);
                return 0;
            case 3:
                rw6Var.f385249f = aVar2.k(intValue);
                return 0;
            case 4:
                rw6Var.f385250g = aVar2.k(intValue);
                return 0;
            case 5:
                rw6Var.f385251h = aVar2.k(intValue);
                return 0;
            case 6:
                rw6Var.f385252i = aVar2.k(intValue);
                return 0;
            case 7:
                rw6Var.f385253m = aVar2.k(intValue);
                return 0;
            case 8:
                rw6Var.f385254n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
