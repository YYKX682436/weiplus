package r45;

/* loaded from: classes4.dex */
public class u73 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387119d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387120e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387121f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387122g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387123h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387124i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387125m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387126n;

    /* renamed from: o, reason: collision with root package name */
    public int f387127o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387128p;

    /* renamed from: q, reason: collision with root package name */
    public int f387129q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u73)) {
            return false;
        }
        r45.u73 u73Var = (r45.u73) fVar;
        return n51.f.a(this.BaseRequest, u73Var.BaseRequest) && n51.f.a(this.f387119d, u73Var.f387119d) && n51.f.a(this.f387120e, u73Var.f387120e) && n51.f.a(this.f387121f, u73Var.f387121f) && n51.f.a(this.f387122g, u73Var.f387122g) && n51.f.a(this.f387123h, u73Var.f387123h) && n51.f.a(this.f387124i, u73Var.f387124i) && n51.f.a(this.f387125m, u73Var.f387125m) && n51.f.a(this.f387126n, u73Var.f387126n) && n51.f.a(java.lang.Integer.valueOf(this.f387127o), java.lang.Integer.valueOf(u73Var.f387127o)) && n51.f.a(this.f387128p, u73Var.f387128p) && n51.f.a(java.lang.Integer.valueOf(this.f387129q), java.lang.Integer.valueOf(u73Var.f387129q));
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
            java.lang.String str = this.f387119d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387120e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387121f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f387122g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f387123h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f387124i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f387125m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f387126n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f387127o);
            java.lang.String str9 = this.f387128p;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            fVar.e(12, this.f387129q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str10 = this.f387119d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f387120e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f387121f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f387122g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f387123h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f387124i;
            if (str15 != null) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f387125m;
            if (str16 != null) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f387126n;
            if (str17 != null) {
                i18 += b36.f.j(9, str17);
            }
            int e17 = i18 + b36.f.e(10, this.f387127o);
            java.lang.String str18 = this.f387128p;
            if (str18 != null) {
                e17 += b36.f.j(11, str18);
            }
            return e17 + b36.f.e(12, this.f387129q);
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
        r45.u73 u73Var = (r45.u73) objArr[1];
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
                    u73Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                u73Var.f387119d = aVar2.k(intValue);
                return 0;
            case 3:
                u73Var.f387120e = aVar2.k(intValue);
                return 0;
            case 4:
                u73Var.f387121f = aVar2.k(intValue);
                return 0;
            case 5:
                u73Var.f387122g = aVar2.k(intValue);
                return 0;
            case 6:
                u73Var.f387123h = aVar2.k(intValue);
                return 0;
            case 7:
                u73Var.f387124i = aVar2.k(intValue);
                return 0;
            case 8:
                u73Var.f387125m = aVar2.k(intValue);
                return 0;
            case 9:
                u73Var.f387126n = aVar2.k(intValue);
                return 0;
            case 10:
                u73Var.f387127o = aVar2.g(intValue);
                return 0;
            case 11:
                u73Var.f387128p = aVar2.k(intValue);
                return 0;
            case 12:
                u73Var.f387129q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
