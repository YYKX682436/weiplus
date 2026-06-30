package r45;

/* loaded from: classes9.dex */
public class jw extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378142d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378143e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f378144f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378145g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378146h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378147i;

    /* renamed from: m, reason: collision with root package name */
    public int f378148m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378149n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378150o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f378151p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378152q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f378153r;

    /* renamed from: s, reason: collision with root package name */
    public int f378154s;

    /* renamed from: t, reason: collision with root package name */
    public int f378155t;

    /* renamed from: u, reason: collision with root package name */
    public r45.lj5 f378156u;

    /* renamed from: v, reason: collision with root package name */
    public r45.tw4 f378157v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f378158w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jw)) {
            return false;
        }
        r45.jw jwVar = (r45.jw) fVar;
        return n51.f.a(this.BaseResponse, jwVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f378142d), java.lang.Integer.valueOf(jwVar.f378142d)) && n51.f.a(this.f378143e, jwVar.f378143e) && n51.f.a(java.lang.Boolean.valueOf(this.f378144f), java.lang.Boolean.valueOf(jwVar.f378144f)) && n51.f.a(this.f378145g, jwVar.f378145g) && n51.f.a(this.f378146h, jwVar.f378146h) && n51.f.a(this.f378147i, jwVar.f378147i) && n51.f.a(java.lang.Integer.valueOf(this.f378148m), java.lang.Integer.valueOf(jwVar.f378148m)) && n51.f.a(this.f378149n, jwVar.f378149n) && n51.f.a(this.f378150o, jwVar.f378150o) && n51.f.a(this.f378151p, jwVar.f378151p) && n51.f.a(this.f378152q, jwVar.f378152q) && n51.f.a(this.f378153r, jwVar.f378153r) && n51.f.a(java.lang.Integer.valueOf(this.f378154s), java.lang.Integer.valueOf(jwVar.f378154s)) && n51.f.a(java.lang.Integer.valueOf(this.f378155t), java.lang.Integer.valueOf(jwVar.f378155t)) && n51.f.a(this.f378156u, jwVar.f378156u) && n51.f.a(this.f378157v, jwVar.f378157v) && n51.f.a(this.f378158w, jwVar.f378158w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378151p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f378142d);
            java.lang.String str = this.f378143e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f378144f);
            java.lang.String str2 = this.f378145g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f378146h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f378147i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f378148m);
            java.lang.String str5 = this.f378149n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f378150o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.g(11, 2, linkedList);
            java.lang.String str7 = this.f378152q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f378153r;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.e(14, this.f378154s);
            fVar.e(15, this.f378155t);
            r45.lj5 lj5Var = this.f378156u;
            if (lj5Var != null) {
                fVar.i(16, lj5Var.computeSize());
                this.f378156u.writeFields(fVar);
            }
            r45.tw4 tw4Var = this.f378157v;
            if (tw4Var != null) {
                fVar.i(17, tw4Var.computeSize());
                this.f378157v.writeFields(fVar);
            }
            java.lang.String str9 = this.f378158w;
            if (str9 != null) {
                fVar.j(18, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f378142d);
            java.lang.String str10 = this.f378143e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int a17 = i18 + b36.f.a(4, this.f378144f);
            java.lang.String str11 = this.f378145g;
            if (str11 != null) {
                a17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f378146h;
            if (str12 != null) {
                a17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f378147i;
            if (str13 != null) {
                a17 += b36.f.j(7, str13);
            }
            int e17 = a17 + b36.f.e(8, this.f378148m);
            java.lang.String str14 = this.f378149n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f378150o;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            int g17 = e17 + b36.f.g(11, 2, linkedList);
            java.lang.String str16 = this.f378152q;
            if (str16 != null) {
                g17 += b36.f.j(12, str16);
            }
            java.lang.String str17 = this.f378153r;
            if (str17 != null) {
                g17 += b36.f.j(13, str17);
            }
            int e18 = g17 + b36.f.e(14, this.f378154s) + b36.f.e(15, this.f378155t);
            r45.lj5 lj5Var2 = this.f378156u;
            if (lj5Var2 != null) {
                e18 += b36.f.i(16, lj5Var2.computeSize());
            }
            r45.tw4 tw4Var2 = this.f378157v;
            if (tw4Var2 != null) {
                e18 += b36.f.i(17, tw4Var2.computeSize());
            }
            java.lang.String str18 = this.f378158w;
            return str18 != null ? e18 + b36.f.j(18, str18) : e18;
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
        r45.jw jwVar = (r45.jw) objArr[1];
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
                    jwVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                jwVar.f378142d = aVar2.g(intValue);
                return 0;
            case 3:
                jwVar.f378143e = aVar2.k(intValue);
                return 0;
            case 4:
                jwVar.f378144f = aVar2.c(intValue);
                return 0;
            case 5:
                jwVar.f378145g = aVar2.k(intValue);
                return 0;
            case 6:
                jwVar.f378146h = aVar2.k(intValue);
                return 0;
            case 7:
                jwVar.f378147i = aVar2.k(intValue);
                return 0;
            case 8:
                jwVar.f378148m = aVar2.g(intValue);
                return 0;
            case 9:
                jwVar.f378149n = aVar2.k(intValue);
                return 0;
            case 10:
                jwVar.f378150o = aVar2.k(intValue);
                return 0;
            case 11:
                jwVar.f378151p.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 12:
                jwVar.f378152q = aVar2.k(intValue);
                return 0;
            case 13:
                jwVar.f378153r = aVar2.k(intValue);
                return 0;
            case 14:
                jwVar.f378154s = aVar2.g(intValue);
                return 0;
            case 15:
                jwVar.f378155t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr3 != null && bArr3.length > 0) {
                        lj5Var3.parseFrom(bArr3);
                    }
                    jwVar.f378156u = lj5Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr4 != null && bArr4.length > 0) {
                        tw4Var3.parseFrom(bArr4);
                    }
                    jwVar.f378157v = tw4Var3;
                }
                return 0;
            case 18:
                jwVar.f378158w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
