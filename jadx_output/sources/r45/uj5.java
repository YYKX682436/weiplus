package r45;

/* loaded from: classes12.dex */
public class uj5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387415d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387416e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387417f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387418g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387419h;

    /* renamed from: i, reason: collision with root package name */
    public int f387420i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387421m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uj5)) {
            return false;
        }
        r45.uj5 uj5Var = (r45.uj5) fVar;
        return n51.f.a(this.BaseRequest, uj5Var.BaseRequest) && n51.f.a(this.f387415d, uj5Var.f387415d) && n51.f.a(this.f387416e, uj5Var.f387416e) && n51.f.a(this.f387417f, uj5Var.f387417f) && n51.f.a(this.f387418g, uj5Var.f387418g) && n51.f.a(this.f387419h, uj5Var.f387419h) && n51.f.a(java.lang.Integer.valueOf(this.f387420i), java.lang.Integer.valueOf(uj5Var.f387420i)) && n51.f.a(this.f387421m, uj5Var.f387421m);
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
            java.lang.String str = this.f387415d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387416e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387417f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f387418g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f387419h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f387420i);
            java.lang.String str6 = this.f387421m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f387415d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f387416e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f387417f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f387418g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f387419h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            int e17 = i18 + b36.f.e(7, this.f387420i);
            java.lang.String str12 = this.f387421m;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.uj5 uj5Var = (r45.uj5) objArr[1];
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
                    uj5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                uj5Var.f387415d = aVar2.k(intValue);
                return 0;
            case 3:
                uj5Var.f387416e = aVar2.k(intValue);
                return 0;
            case 4:
                uj5Var.f387417f = aVar2.k(intValue);
                return 0;
            case 5:
                uj5Var.f387418g = aVar2.k(intValue);
                return 0;
            case 6:
                uj5Var.f387419h = aVar2.k(intValue);
                return 0;
            case 7:
                uj5Var.f387420i = aVar2.g(intValue);
                return 0;
            case 8:
                uj5Var.f387421m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
