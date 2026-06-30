package r45;

/* loaded from: classes9.dex */
public class op6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382429d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382430e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382431f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382432g;

    /* renamed from: h, reason: collision with root package name */
    public long f382433h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382434i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382435m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382436n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op6)) {
            return false;
        }
        r45.op6 op6Var = (r45.op6) fVar;
        return n51.f.a(this.BaseRequest, op6Var.BaseRequest) && n51.f.a(this.f382429d, op6Var.f382429d) && n51.f.a(this.f382430e, op6Var.f382430e) && n51.f.a(this.f382431f, op6Var.f382431f) && n51.f.a(this.f382432g, op6Var.f382432g) && n51.f.a(java.lang.Long.valueOf(this.f382433h), java.lang.Long.valueOf(op6Var.f382433h)) && n51.f.a(this.f382434i, op6Var.f382434i) && n51.f.a(this.f382435m, op6Var.f382435m) && n51.f.a(this.f382436n, op6Var.f382436n);
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
            java.lang.String str = this.f382429d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382430e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382431f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f382432g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.h(6, this.f382433h);
            java.lang.String str5 = this.f382434i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f382435m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f382436n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f382429d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f382430e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f382431f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f382432g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            int h17 = i18 + b36.f.h(6, this.f382433h);
            java.lang.String str12 = this.f382434i;
            if (str12 != null) {
                h17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f382435m;
            if (str13 != null) {
                h17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f382436n;
            return str14 != null ? h17 + b36.f.j(9, str14) : h17;
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
        r45.op6 op6Var = (r45.op6) objArr[1];
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
                    op6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                op6Var.f382429d = aVar2.k(intValue);
                return 0;
            case 3:
                op6Var.f382430e = aVar2.k(intValue);
                return 0;
            case 4:
                op6Var.f382431f = aVar2.k(intValue);
                return 0;
            case 5:
                op6Var.f382432g = aVar2.k(intValue);
                return 0;
            case 6:
                op6Var.f382433h = aVar2.i(intValue);
                return 0;
            case 7:
                op6Var.f382434i = aVar2.k(intValue);
                return 0;
            case 8:
                op6Var.f382435m = aVar2.k(intValue);
                return 0;
            case 9:
                op6Var.f382436n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
