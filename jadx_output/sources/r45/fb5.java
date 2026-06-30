package r45;

/* loaded from: classes9.dex */
public class fb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374170d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374171e;

    /* renamed from: f, reason: collision with root package name */
    public int f374172f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374173g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374174h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374175i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f374176m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374177n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374178o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f374179p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f374180q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fb5)) {
            return false;
        }
        r45.fb5 fb5Var = (r45.fb5) fVar;
        return n51.f.a(this.BaseResponse, fb5Var.BaseResponse) && n51.f.a(this.f374170d, fb5Var.f374170d) && n51.f.a(this.f374171e, fb5Var.f374171e) && n51.f.a(java.lang.Integer.valueOf(this.f374172f), java.lang.Integer.valueOf(fb5Var.f374172f)) && n51.f.a(this.f374173g, fb5Var.f374173g) && n51.f.a(this.f374174h, fb5Var.f374174h) && n51.f.a(this.f374175i, fb5Var.f374175i) && n51.f.a(java.lang.Boolean.valueOf(this.f374176m), java.lang.Boolean.valueOf(fb5Var.f374176m)) && n51.f.a(this.f374177n, fb5Var.f374177n) && n51.f.a(this.f374178o, fb5Var.f374178o) && n51.f.a(this.f374179p, fb5Var.f374179p) && n51.f.a(this.f374180q, fb5Var.f374180q);
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
            java.lang.String str = this.f374170d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374171e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f374172f);
            java.lang.String str3 = this.f374173g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f374174h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f374175i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.a(8, this.f374176m);
            java.lang.String str6 = this.f374177n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f374178o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f374179p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f374180q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str10 = this.f374170d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f374171e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            int e17 = i18 + b36.f.e(4, this.f374172f);
            java.lang.String str12 = this.f374173g;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f374174h;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f374175i;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            int a17 = e17 + b36.f.a(8, this.f374176m);
            java.lang.String str15 = this.f374177n;
            if (str15 != null) {
                a17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f374178o;
            if (str16 != null) {
                a17 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f374179p;
            if (str17 != null) {
                a17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f374180q;
            return str18 != null ? a17 + b36.f.j(12, str18) : a17;
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
        r45.fb5 fb5Var = (r45.fb5) objArr[1];
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
                    fb5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                fb5Var.f374170d = aVar2.k(intValue);
                return 0;
            case 3:
                fb5Var.f374171e = aVar2.k(intValue);
                return 0;
            case 4:
                fb5Var.f374172f = aVar2.g(intValue);
                return 0;
            case 5:
                fb5Var.f374173g = aVar2.k(intValue);
                return 0;
            case 6:
                fb5Var.f374174h = aVar2.k(intValue);
                return 0;
            case 7:
                fb5Var.f374175i = aVar2.k(intValue);
                return 0;
            case 8:
                fb5Var.f374176m = aVar2.c(intValue);
                return 0;
            case 9:
                fb5Var.f374177n = aVar2.k(intValue);
                return 0;
            case 10:
                fb5Var.f374178o = aVar2.k(intValue);
                return 0;
            case 11:
                fb5Var.f374179p = aVar2.k(intValue);
                return 0;
            case 12:
                fb5Var.f374180q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
