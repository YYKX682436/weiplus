package r45;

/* loaded from: classes9.dex */
public class bn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370877d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370878e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370879f;

    /* renamed from: g, reason: collision with root package name */
    public int f370880g;

    /* renamed from: h, reason: collision with root package name */
    public int f370881h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370882i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370883m;

    /* renamed from: n, reason: collision with root package name */
    public int f370884n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bn)) {
            return false;
        }
        r45.bn bnVar = (r45.bn) fVar;
        return n51.f.a(this.f370877d, bnVar.f370877d) && n51.f.a(this.f370878e, bnVar.f370878e) && n51.f.a(this.f370879f, bnVar.f370879f) && n51.f.a(java.lang.Integer.valueOf(this.f370880g), java.lang.Integer.valueOf(bnVar.f370880g)) && n51.f.a(java.lang.Integer.valueOf(this.f370881h), java.lang.Integer.valueOf(bnVar.f370881h)) && n51.f.a(this.f370882i, bnVar.f370882i) && n51.f.a(this.f370883m, bnVar.f370883m) && n51.f.a(java.lang.Integer.valueOf(this.f370884n), java.lang.Integer.valueOf(bnVar.f370884n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370877d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370878e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370879f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f370880g);
            fVar.e(5, this.f370881h);
            java.lang.String str4 = this.f370882i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f370883m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f370884n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f370877d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f370878e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f370879f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f370880g) + b36.f.e(5, this.f370881h);
            java.lang.String str8 = this.f370882i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f370883m;
            if (gVar2 != null) {
                e17 += b36.f.b(7, gVar2);
            }
            return e17 + b36.f.e(8, this.f370884n);
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
        r45.bn bnVar = (r45.bn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bnVar.f370877d = aVar2.k(intValue);
                return 0;
            case 2:
                bnVar.f370878e = aVar2.k(intValue);
                return 0;
            case 3:
                bnVar.f370879f = aVar2.k(intValue);
                return 0;
            case 4:
                bnVar.f370880g = aVar2.g(intValue);
                return 0;
            case 5:
                bnVar.f370881h = aVar2.g(intValue);
                return 0;
            case 6:
                bnVar.f370882i = aVar2.k(intValue);
                return 0;
            case 7:
                bnVar.f370883m = aVar2.d(intValue);
                return 0;
            case 8:
                bnVar.f370884n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
