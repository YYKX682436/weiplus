package r45;

/* loaded from: classes2.dex */
public class hh5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376161d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376162e;

    /* renamed from: f, reason: collision with root package name */
    public int f376163f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376164g;

    /* renamed from: h, reason: collision with root package name */
    public int f376165h;

    /* renamed from: i, reason: collision with root package name */
    public int f376166i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376167m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376168n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f376169o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376170p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f376171q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f376172r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f376173s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hh5)) {
            return false;
        }
        r45.hh5 hh5Var = (r45.hh5) fVar;
        return n51.f.a(this.BaseResponse, hh5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f376161d), java.lang.Integer.valueOf(hh5Var.f376161d)) && n51.f.a(this.f376162e, hh5Var.f376162e) && n51.f.a(java.lang.Integer.valueOf(this.f376163f), java.lang.Integer.valueOf(hh5Var.f376163f)) && n51.f.a(this.f376164g, hh5Var.f376164g) && n51.f.a(java.lang.Integer.valueOf(this.f376165h), java.lang.Integer.valueOf(hh5Var.f376165h)) && n51.f.a(java.lang.Integer.valueOf(this.f376166i), java.lang.Integer.valueOf(hh5Var.f376166i)) && n51.f.a(this.f376167m, hh5Var.f376167m) && n51.f.a(this.f376168n, hh5Var.f376168n) && n51.f.a(this.f376169o, hh5Var.f376169o) && n51.f.a(this.f376170p, hh5Var.f376170p) && n51.f.a(this.f376171q, hh5Var.f376171q) && n51.f.a(this.f376172r, hh5Var.f376172r) && n51.f.a(this.f376173s, hh5Var.f376173s);
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
            fVar.e(2, this.f376161d);
            java.lang.String str = this.f376162e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f376163f);
            java.lang.String str2 = this.f376164g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f376165h);
            fVar.e(7, this.f376166i);
            java.lang.String str3 = this.f376167m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f376168n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f376169o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f376170p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f376171q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f376172r;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f376173s;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f376161d);
            java.lang.String str10 = this.f376162e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int e17 = i18 + b36.f.e(4, this.f376163f);
            java.lang.String str11 = this.f376164g;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            int e18 = e17 + b36.f.e(6, this.f376165h) + b36.f.e(7, this.f376166i);
            java.lang.String str12 = this.f376167m;
            if (str12 != null) {
                e18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f376168n;
            if (str13 != null) {
                e18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f376169o;
            if (str14 != null) {
                e18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f376170p;
            if (str15 != null) {
                e18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f376171q;
            if (str16 != null) {
                e18 += b36.f.j(12, str16);
            }
            java.lang.String str17 = this.f376172r;
            if (str17 != null) {
                e18 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f376173s;
            return str18 != null ? e18 + b36.f.j(15, str18) : e18;
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
        r45.hh5 hh5Var = (r45.hh5) objArr[1];
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
                    hh5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                hh5Var.f376161d = aVar2.g(intValue);
                return 0;
            case 3:
                hh5Var.f376162e = aVar2.k(intValue);
                return 0;
            case 4:
                hh5Var.f376163f = aVar2.g(intValue);
                return 0;
            case 5:
                hh5Var.f376164g = aVar2.k(intValue);
                return 0;
            case 6:
                hh5Var.f376165h = aVar2.g(intValue);
                return 0;
            case 7:
                hh5Var.f376166i = aVar2.g(intValue);
                return 0;
            case 8:
                hh5Var.f376167m = aVar2.k(intValue);
                return 0;
            case 9:
                hh5Var.f376168n = aVar2.k(intValue);
                return 0;
            case 10:
                hh5Var.f376169o = aVar2.k(intValue);
                return 0;
            case 11:
                hh5Var.f376170p = aVar2.k(intValue);
                return 0;
            case 12:
                hh5Var.f376171q = aVar2.k(intValue);
                return 0;
            case 13:
            default:
                return -1;
            case 14:
                hh5Var.f376172r = aVar2.k(intValue);
                return 0;
            case 15:
                hh5Var.f376173s = aVar2.k(intValue);
                return 0;
        }
    }
}
