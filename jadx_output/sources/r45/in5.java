package r45;

/* loaded from: classes7.dex */
public class in5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377172d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377173e;

    /* renamed from: f, reason: collision with root package name */
    public int f377174f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377175g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377176h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377177i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377178m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f377179n;

    /* renamed from: o, reason: collision with root package name */
    public int f377180o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.in5)) {
            return false;
        }
        r45.in5 in5Var = (r45.in5) fVar;
        return n51.f.a(this.BaseRequest, in5Var.BaseRequest) && n51.f.a(this.f377172d, in5Var.f377172d) && n51.f.a(this.f377173e, in5Var.f377173e) && n51.f.a(java.lang.Integer.valueOf(this.f377174f), java.lang.Integer.valueOf(in5Var.f377174f)) && n51.f.a(this.f377175g, in5Var.f377175g) && n51.f.a(this.f377176h, in5Var.f377176h) && n51.f.a(this.f377177i, in5Var.f377177i) && n51.f.a(this.f377178m, in5Var.f377178m) && n51.f.a(this.f377179n, in5Var.f377179n) && n51.f.a(java.lang.Integer.valueOf(this.f377180o), java.lang.Integer.valueOf(in5Var.f377180o));
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
            java.lang.String str = this.f377172d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377173e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f377174f);
            java.lang.String str3 = this.f377175g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f377176h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f377177i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f377178m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f377179n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.e(10, this.f377180o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f377172d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f377173e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int e17 = i18 + b36.f.e(4, this.f377174f);
            java.lang.String str10 = this.f377175g;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f377176h;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f377177i;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f377178m;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f377179n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            return e17 + b36.f.e(10, this.f377180o);
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
        r45.in5 in5Var = (r45.in5) objArr[1];
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
                    in5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                in5Var.f377172d = aVar2.k(intValue);
                return 0;
            case 3:
                in5Var.f377173e = aVar2.k(intValue);
                return 0;
            case 4:
                in5Var.f377174f = aVar2.g(intValue);
                return 0;
            case 5:
                in5Var.f377175g = aVar2.k(intValue);
                return 0;
            case 6:
                in5Var.f377176h = aVar2.k(intValue);
                return 0;
            case 7:
                in5Var.f377177i = aVar2.k(intValue);
                return 0;
            case 8:
                in5Var.f377178m = aVar2.k(intValue);
                return 0;
            case 9:
                in5Var.f377179n = aVar2.k(intValue);
                return 0;
            case 10:
                in5Var.f377180o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
