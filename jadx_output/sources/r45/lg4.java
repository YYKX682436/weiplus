package r45;

/* loaded from: classes2.dex */
public class lg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379445d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379446e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379447f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379448g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379449h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379450i;

    /* renamed from: m, reason: collision with root package name */
    public int f379451m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379452n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379453o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379454p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f379455q;

    /* renamed from: r, reason: collision with root package name */
    public r45.tg4 f379456r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lg4)) {
            return false;
        }
        r45.lg4 lg4Var = (r45.lg4) fVar;
        return n51.f.a(this.f379445d, lg4Var.f379445d) && n51.f.a(this.f379446e, lg4Var.f379446e) && n51.f.a(this.f379447f, lg4Var.f379447f) && n51.f.a(this.f379448g, lg4Var.f379448g) && n51.f.a(this.f379449h, lg4Var.f379449h) && n51.f.a(this.f379450i, lg4Var.f379450i) && n51.f.a(java.lang.Integer.valueOf(this.f379451m), java.lang.Integer.valueOf(lg4Var.f379451m)) && n51.f.a(this.f379452n, lg4Var.f379452n) && n51.f.a(this.f379453o, lg4Var.f379453o) && n51.f.a(this.f379454p, lg4Var.f379454p) && n51.f.a(this.f379455q, lg4Var.f379455q) && n51.f.a(this.f379456r, lg4Var.f379456r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379445d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379446e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379447f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f379448g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f379449h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f379450i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(10, this.f379451m);
            java.lang.String str7 = this.f379452n;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f379453o;
            if (str8 != null) {
                fVar.j(7, str8);
            }
            java.lang.String str9 = this.f379454p;
            if (str9 != null) {
                fVar.j(8, str9);
            }
            java.lang.String str10 = this.f379455q;
            if (str10 != null) {
                fVar.j(9, str10);
            }
            r45.tg4 tg4Var = this.f379456r;
            if (tg4Var != null) {
                fVar.i(12, tg4Var.computeSize());
                this.f379456r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f379445d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f379446e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f379447f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f379448g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f379449h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f379450i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            int e17 = j17 + b36.f.e(10, this.f379451m);
            java.lang.String str17 = this.f379452n;
            if (str17 != null) {
                e17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f379453o;
            if (str18 != null) {
                e17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f379454p;
            if (str19 != null) {
                e17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f379455q;
            if (str20 != null) {
                e17 += b36.f.j(9, str20);
            }
            r45.tg4 tg4Var2 = this.f379456r;
            return tg4Var2 != null ? e17 + b36.f.i(12, tg4Var2.computeSize()) : e17;
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
        r45.lg4 lg4Var = (r45.lg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lg4Var.f379445d = aVar2.k(intValue);
                return 0;
            case 2:
                lg4Var.f379446e = aVar2.k(intValue);
                return 0;
            case 3:
                lg4Var.f379447f = aVar2.k(intValue);
                return 0;
            case 4:
                lg4Var.f379448g = aVar2.k(intValue);
                return 0;
            case 5:
                lg4Var.f379449h = aVar2.k(intValue);
                return 0;
            case 6:
                lg4Var.f379450i = aVar2.k(intValue);
                return 0;
            case 7:
                lg4Var.f379453o = aVar2.k(intValue);
                return 0;
            case 8:
                lg4Var.f379454p = aVar2.k(intValue);
                return 0;
            case 9:
                lg4Var.f379455q = aVar2.k(intValue);
                return 0;
            case 10:
                lg4Var.f379451m = aVar2.g(intValue);
                return 0;
            case 11:
                lg4Var.f379452n = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tg4 tg4Var3 = new r45.tg4();
                    if (bArr != null && bArr.length > 0) {
                        tg4Var3.parseFrom(bArr);
                    }
                    lg4Var.f379456r = tg4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
