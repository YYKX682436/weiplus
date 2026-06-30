package r45;

/* loaded from: classes8.dex */
public class l74 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379191d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379192e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379193f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379194g;

    /* renamed from: h, reason: collision with root package name */
    public int f379195h;

    /* renamed from: i, reason: collision with root package name */
    public int f379196i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l74)) {
            return false;
        }
        r45.l74 l74Var = (r45.l74) fVar;
        return n51.f.a(this.f379191d, l74Var.f379191d) && n51.f.a(this.f379192e, l74Var.f379192e) && n51.f.a(this.f379193f, l74Var.f379193f) && n51.f.a(this.f379194g, l74Var.f379194g) && n51.f.a(java.lang.Integer.valueOf(this.f379195h), java.lang.Integer.valueOf(l74Var.f379195h)) && n51.f.a(java.lang.Integer.valueOf(this.f379196i), java.lang.Integer.valueOf(l74Var.f379196i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379191d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379192e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379193f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f379194g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f379195h);
            fVar.e(6, this.f379196i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f379191d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f379192e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f379193f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f379194g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f379195h) + b36.f.e(6, this.f379196i);
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
        r45.l74 l74Var = (r45.l74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l74Var.f379191d = aVar2.k(intValue);
                return 0;
            case 2:
                l74Var.f379192e = aVar2.k(intValue);
                return 0;
            case 3:
                l74Var.f379193f = aVar2.k(intValue);
                return 0;
            case 4:
                l74Var.f379194g = aVar2.k(intValue);
                return 0;
            case 5:
                l74Var.f379195h = aVar2.g(intValue);
                return 0;
            case 6:
                l74Var.f379196i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
