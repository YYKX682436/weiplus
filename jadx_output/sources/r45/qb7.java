package r45;

/* loaded from: classes8.dex */
public class qb7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383813e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383814f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383815g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383816h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383817i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qb7)) {
            return false;
        }
        r45.qb7 qb7Var = (r45.qb7) fVar;
        return n51.f.a(this.f383812d, qb7Var.f383812d) && n51.f.a(this.f383813e, qb7Var.f383813e) && n51.f.a(this.f383814f, qb7Var.f383814f) && n51.f.a(this.f383815g, qb7Var.f383815g) && n51.f.a(this.f383816h, qb7Var.f383816h) && n51.f.a(this.f383817i, qb7Var.f383817i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383812d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383813e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383814f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f383815g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f383816h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f383817i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f383812d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f383813e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f383814f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f383815g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f383816h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f383817i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.qb7 qb7Var = (r45.qb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qb7Var.f383812d = aVar2.k(intValue);
                return 0;
            case 2:
                qb7Var.f383813e = aVar2.k(intValue);
                return 0;
            case 3:
                qb7Var.f383814f = aVar2.k(intValue);
                return 0;
            case 4:
                qb7Var.f383815g = aVar2.k(intValue);
                return 0;
            case 5:
                qb7Var.f383816h = aVar2.k(intValue);
                return 0;
            case 6:
                qb7Var.f383817i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
