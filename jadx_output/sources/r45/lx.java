package r45;

/* loaded from: classes9.dex */
public class lx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379903d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379904e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379905f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f379906g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379907h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379908i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379909m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379910n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379911o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379912p;

    /* renamed from: q, reason: collision with root package name */
    public int f379913q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379914r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379915s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f379916t;

    /* renamed from: u, reason: collision with root package name */
    public r45.tw4 f379917u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx)) {
            return false;
        }
        r45.lx lxVar = (r45.lx) fVar;
        return n51.f.a(this.BaseResponse, lxVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379903d), java.lang.Integer.valueOf(lxVar.f379903d)) && n51.f.a(this.f379904e, lxVar.f379904e) && n51.f.a(this.f379905f, lxVar.f379905f) && n51.f.a(this.f379906g, lxVar.f379906g) && n51.f.a(this.f379907h, lxVar.f379907h) && n51.f.a(this.f379908i, lxVar.f379908i) && n51.f.a(this.f379909m, lxVar.f379909m) && n51.f.a(this.f379910n, lxVar.f379910n) && n51.f.a(this.f379911o, lxVar.f379911o) && n51.f.a(this.f379912p, lxVar.f379912p) && n51.f.a(java.lang.Integer.valueOf(this.f379913q), java.lang.Integer.valueOf(lxVar.f379913q)) && n51.f.a(this.f379914r, lxVar.f379914r) && n51.f.a(this.f379915s, lxVar.f379915s) && n51.f.a(this.f379916t, lxVar.f379916t) && n51.f.a(this.f379917u, lxVar.f379917u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379906g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f379903d);
            java.lang.String str = this.f379904e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f379905f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 2, linkedList);
            java.lang.String str3 = this.f379907h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f379908i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f379909m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f379910n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f379911o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f379912p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(12, this.f379913q);
            java.lang.String str9 = this.f379914r;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f379915s;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f379916t;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            r45.tw4 tw4Var = this.f379917u;
            if (tw4Var != null) {
                fVar.i(16, tw4Var.computeSize());
                this.f379917u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f379903d);
            java.lang.String str12 = this.f379904e;
            if (str12 != null) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f379905f;
            if (str13 != null) {
                i18 += b36.f.j(4, str13);
            }
            int g17 = i18 + b36.f.g(5, 2, linkedList);
            java.lang.String str14 = this.f379907h;
            if (str14 != null) {
                g17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f379908i;
            if (str15 != null) {
                g17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f379909m;
            if (str16 != null) {
                g17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f379910n;
            if (str17 != null) {
                g17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f379911o;
            if (str18 != null) {
                g17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f379912p;
            if (str19 != null) {
                g17 += b36.f.j(11, str19);
            }
            int e17 = g17 + b36.f.e(12, this.f379913q);
            java.lang.String str20 = this.f379914r;
            if (str20 != null) {
                e17 += b36.f.j(13, str20);
            }
            java.lang.String str21 = this.f379915s;
            if (str21 != null) {
                e17 += b36.f.j(14, str21);
            }
            java.lang.String str22 = this.f379916t;
            if (str22 != null) {
                e17 += b36.f.j(15, str22);
            }
            r45.tw4 tw4Var2 = this.f379917u;
            return tw4Var2 != null ? e17 + b36.f.i(16, tw4Var2.computeSize()) : e17;
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
        r45.lx lxVar = (r45.lx) objArr[1];
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
                    lxVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                lxVar.f379903d = aVar2.g(intValue);
                return 0;
            case 3:
                lxVar.f379904e = aVar2.k(intValue);
                return 0;
            case 4:
                lxVar.f379905f = aVar2.k(intValue);
                return 0;
            case 5:
                lxVar.f379906g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 6:
                lxVar.f379907h = aVar2.k(intValue);
                return 0;
            case 7:
                lxVar.f379908i = aVar2.k(intValue);
                return 0;
            case 8:
                lxVar.f379909m = aVar2.k(intValue);
                return 0;
            case 9:
                lxVar.f379910n = aVar2.k(intValue);
                return 0;
            case 10:
                lxVar.f379911o = aVar2.k(intValue);
                return 0;
            case 11:
                lxVar.f379912p = aVar2.k(intValue);
                return 0;
            case 12:
                lxVar.f379913q = aVar2.g(intValue);
                return 0;
            case 13:
                lxVar.f379914r = aVar2.k(intValue);
                return 0;
            case 14:
                lxVar.f379915s = aVar2.k(intValue);
                return 0;
            case 15:
                lxVar.f379916t = aVar2.k(intValue);
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr3 != null && bArr3.length > 0) {
                        tw4Var3.parseFrom(bArr3);
                    }
                    lxVar.f379917u = tw4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
