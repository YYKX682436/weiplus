package r45;

/* loaded from: classes9.dex */
public class al4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370093d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370094e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370095f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370096g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370097h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370098i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370099m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370100n;

    /* renamed from: o, reason: collision with root package name */
    public r45.g04 f370101o;

    /* renamed from: p, reason: collision with root package name */
    public int f370102p;

    /* renamed from: q, reason: collision with root package name */
    public long f370103q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f370104r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f370105s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f370106t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f370107u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f370108v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.al4)) {
            return false;
        }
        r45.al4 al4Var = (r45.al4) fVar;
        return n51.f.a(this.BaseResponse, al4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370093d), java.lang.Integer.valueOf(al4Var.f370093d)) && n51.f.a(this.f370094e, al4Var.f370094e) && n51.f.a(this.f370095f, al4Var.f370095f) && n51.f.a(this.f370096g, al4Var.f370096g) && n51.f.a(this.f370097h, al4Var.f370097h) && n51.f.a(this.f370098i, al4Var.f370098i) && n51.f.a(this.f370099m, al4Var.f370099m) && n51.f.a(this.f370100n, al4Var.f370100n) && n51.f.a(this.f370101o, al4Var.f370101o) && n51.f.a(java.lang.Integer.valueOf(this.f370102p), java.lang.Integer.valueOf(al4Var.f370102p)) && n51.f.a(java.lang.Long.valueOf(this.f370103q), java.lang.Long.valueOf(al4Var.f370103q)) && n51.f.a(this.f370104r, al4Var.f370104r) && n51.f.a(java.lang.Boolean.valueOf(this.f370105s), java.lang.Boolean.valueOf(al4Var.f370105s)) && n51.f.a(this.f370106t, al4Var.f370106t) && n51.f.a(java.lang.Boolean.valueOf(this.f370107u), java.lang.Boolean.valueOf(al4Var.f370107u)) && n51.f.a(this.f370108v, al4Var.f370108v);
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
            fVar.e(2, this.f370093d);
            java.lang.String str = this.f370094e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f370095f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f370096g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f370097h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f370098i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f370099m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f370100n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            r45.g04 g04Var = this.f370101o;
            if (g04Var != null) {
                fVar.i(10, g04Var.computeSize());
                this.f370101o.writeFields(fVar);
            }
            fVar.e(11, this.f370102p);
            fVar.h(12, this.f370103q);
            java.lang.String str8 = this.f370104r;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.a(14, this.f370105s);
            java.lang.String str9 = this.f370106t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            fVar.a(16, this.f370107u);
            java.lang.String str10 = this.f370108v;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f370093d);
            java.lang.String str11 = this.f370094e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f370095f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f370096g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f370097h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f370098i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f370099m;
            if (str16 != null) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f370100n;
            if (str17 != null) {
                i18 += b36.f.j(9, str17);
            }
            r45.g04 g04Var2 = this.f370101o;
            if (g04Var2 != null) {
                i18 += b36.f.i(10, g04Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(11, this.f370102p) + b36.f.h(12, this.f370103q);
            java.lang.String str18 = this.f370104r;
            if (str18 != null) {
                e17 += b36.f.j(13, str18);
            }
            int a17 = e17 + b36.f.a(14, this.f370105s);
            java.lang.String str19 = this.f370106t;
            if (str19 != null) {
                a17 += b36.f.j(15, str19);
            }
            int a18 = a17 + b36.f.a(16, this.f370107u);
            java.lang.String str20 = this.f370108v;
            return str20 != null ? a18 + b36.f.j(17, str20) : a18;
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
        r45.al4 al4Var = (r45.al4) objArr[1];
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
                    al4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                al4Var.f370093d = aVar2.g(intValue);
                return 0;
            case 3:
                al4Var.f370094e = aVar2.k(intValue);
                return 0;
            case 4:
                al4Var.f370095f = aVar2.k(intValue);
                return 0;
            case 5:
                al4Var.f370096g = aVar2.k(intValue);
                return 0;
            case 6:
                al4Var.f370097h = aVar2.k(intValue);
                return 0;
            case 7:
                al4Var.f370098i = aVar2.k(intValue);
                return 0;
            case 8:
                al4Var.f370099m = aVar2.k(intValue);
                return 0;
            case 9:
                al4Var.f370100n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g04 g04Var3 = new r45.g04();
                    if (bArr2 != null && bArr2.length > 0) {
                        g04Var3.parseFrom(bArr2);
                    }
                    al4Var.f370101o = g04Var3;
                }
                return 0;
            case 11:
                al4Var.f370102p = aVar2.g(intValue);
                return 0;
            case 12:
                al4Var.f370103q = aVar2.i(intValue);
                return 0;
            case 13:
                al4Var.f370104r = aVar2.k(intValue);
                return 0;
            case 14:
                al4Var.f370105s = aVar2.c(intValue);
                return 0;
            case 15:
                al4Var.f370106t = aVar2.k(intValue);
                return 0;
            case 16:
                al4Var.f370107u = aVar2.c(intValue);
                return 0;
            case 17:
                al4Var.f370108v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
