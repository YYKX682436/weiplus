package r45;

/* loaded from: classes9.dex */
public class qp6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384192d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384193e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384194f;

    /* renamed from: g, reason: collision with root package name */
    public int f384195g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384196h;

    /* renamed from: i, reason: collision with root package name */
    public int f384197i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384198m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384199n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f384200o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qp6)) {
            return false;
        }
        r45.qp6 qp6Var = (r45.qp6) fVar;
        return n51.f.a(this.BaseRequest, qp6Var.BaseRequest) && n51.f.a(this.f384192d, qp6Var.f384192d) && n51.f.a(this.f384193e, qp6Var.f384193e) && n51.f.a(this.f384194f, qp6Var.f384194f) && n51.f.a(java.lang.Integer.valueOf(this.f384195g), java.lang.Integer.valueOf(qp6Var.f384195g)) && n51.f.a(this.f384196h, qp6Var.f384196h) && n51.f.a(java.lang.Integer.valueOf(this.f384197i), java.lang.Integer.valueOf(qp6Var.f384197i)) && n51.f.a(this.f384198m, qp6Var.f384198m) && n51.f.a(this.f384199n, qp6Var.f384199n) && n51.f.a(this.f384200o, qp6Var.f384200o);
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
            java.lang.String str = this.f384192d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384193e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f384194f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f384195g);
            java.lang.String str4 = this.f384196h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f384197i);
            java.lang.String str5 = this.f384198m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f384199n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f384200o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f384192d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f384193e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f384194f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            int e17 = i18 + b36.f.e(5, this.f384195g);
            java.lang.String str11 = this.f384196h;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            int e18 = e17 + b36.f.e(7, this.f384197i);
            java.lang.String str12 = this.f384198m;
            if (str12 != null) {
                e18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f384199n;
            if (str13 != null) {
                e18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f384200o;
            return str14 != null ? e18 + b36.f.j(10, str14) : e18;
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
        r45.qp6 qp6Var = (r45.qp6) objArr[1];
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
                    qp6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                qp6Var.f384192d = aVar2.k(intValue);
                return 0;
            case 3:
                qp6Var.f384193e = aVar2.k(intValue);
                return 0;
            case 4:
                qp6Var.f384194f = aVar2.k(intValue);
                return 0;
            case 5:
                qp6Var.f384195g = aVar2.g(intValue);
                return 0;
            case 6:
                qp6Var.f384196h = aVar2.k(intValue);
                return 0;
            case 7:
                qp6Var.f384197i = aVar2.g(intValue);
                return 0;
            case 8:
                qp6Var.f384198m = aVar2.k(intValue);
                return 0;
            case 9:
                qp6Var.f384199n = aVar2.k(intValue);
                return 0;
            case 10:
                qp6Var.f384200o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
