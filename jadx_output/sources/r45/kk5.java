package r45;

/* loaded from: classes4.dex */
public class kk5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378781d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378782e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378783f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378784g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378785h;

    /* renamed from: i, reason: collision with root package name */
    public int f378786i;

    /* renamed from: m, reason: collision with root package name */
    public int f378787m;

    /* renamed from: n, reason: collision with root package name */
    public int f378788n;

    /* renamed from: o, reason: collision with root package name */
    public int f378789o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f378790p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378791q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f378792r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kk5)) {
            return false;
        }
        r45.kk5 kk5Var = (r45.kk5) fVar;
        return n51.f.a(this.BaseResponse, kk5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f378781d), java.lang.Integer.valueOf(kk5Var.f378781d)) && n51.f.a(this.f378782e, kk5Var.f378782e) && n51.f.a(this.f378783f, kk5Var.f378783f) && n51.f.a(this.f378784g, kk5Var.f378784g) && n51.f.a(this.f378785h, kk5Var.f378785h) && n51.f.a(java.lang.Integer.valueOf(this.f378786i), java.lang.Integer.valueOf(kk5Var.f378786i)) && n51.f.a(java.lang.Integer.valueOf(this.f378787m), java.lang.Integer.valueOf(kk5Var.f378787m)) && n51.f.a(java.lang.Integer.valueOf(this.f378788n), java.lang.Integer.valueOf(kk5Var.f378788n)) && n51.f.a(java.lang.Integer.valueOf(this.f378789o), java.lang.Integer.valueOf(kk5Var.f378789o)) && n51.f.a(this.f378790p, kk5Var.f378790p) && n51.f.a(this.f378791q, kk5Var.f378791q) && n51.f.a(this.f378792r, kk5Var.f378792r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f378781d);
            java.lang.String str = this.f378782e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f378783f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378784g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f378785h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.e(7, this.f378786i);
            fVar.e(8, this.f378787m);
            fVar.e(9, this.f378788n);
            fVar.e(10, this.f378789o);
            java.lang.String str4 = this.f378790p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f378791q;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f378792r;
            if (str6 == null) {
                return 0;
            }
            fVar.j(13, str6);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f378781d);
            java.lang.String str7 = this.f378782e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f378783f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f378784g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f378785h;
            if (gVar2 != null) {
                i18 += b36.f.b(6, gVar2);
            }
            int e17 = i18 + b36.f.e(7, this.f378786i) + b36.f.e(8, this.f378787m) + b36.f.e(9, this.f378788n) + b36.f.e(10, this.f378789o);
            java.lang.String str10 = this.f378790p;
            if (str10 != null) {
                e17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f378791q;
            if (str11 != null) {
                e17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f378792r;
            return str12 != null ? e17 + b36.f.j(13, str12) : e17;
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
        r45.kk5 kk5Var = (r45.kk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    kk5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                kk5Var.f378781d = aVar2.g(intValue);
                return 0;
            case 3:
                kk5Var.f378782e = aVar2.k(intValue);
                return 0;
            case 4:
                kk5Var.f378783f = aVar2.k(intValue);
                return 0;
            case 5:
                kk5Var.f378784g = aVar2.k(intValue);
                return 0;
            case 6:
                kk5Var.f378785h = aVar2.d(intValue);
                return 0;
            case 7:
                kk5Var.f378786i = aVar2.g(intValue);
                return 0;
            case 8:
                kk5Var.f378787m = aVar2.g(intValue);
                return 0;
            case 9:
                kk5Var.f378788n = aVar2.g(intValue);
                return 0;
            case 10:
                kk5Var.f378789o = aVar2.g(intValue);
                return 0;
            case 11:
                kk5Var.f378790p = aVar2.k(intValue);
                return 0;
            case 12:
                kk5Var.f378791q = aVar2.k(intValue);
                return 0;
            case 13:
                kk5Var.f378792r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
