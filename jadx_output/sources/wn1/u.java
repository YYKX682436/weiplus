package wn1;

/* loaded from: classes12.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f447483d;

    /* renamed from: e, reason: collision with root package name */
    public int f447484e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f447485f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f447486g;

    /* renamed from: h, reason: collision with root package name */
    public int f447487h;

    /* renamed from: i, reason: collision with root package name */
    public int f447488i;

    /* renamed from: m, reason: collision with root package name */
    public int f447489m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f447490n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.u)) {
            return false;
        }
        wn1.u uVar = (wn1.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f447483d), java.lang.Integer.valueOf(uVar.f447483d)) && n51.f.a(java.lang.Integer.valueOf(this.f447484e), java.lang.Integer.valueOf(uVar.f447484e)) && n51.f.a(this.f447485f, uVar.f447485f) && n51.f.a(this.f447486g, uVar.f447486g) && n51.f.a(java.lang.Integer.valueOf(this.f447487h), java.lang.Integer.valueOf(uVar.f447487h)) && n51.f.a(java.lang.Integer.valueOf(this.f447488i), java.lang.Integer.valueOf(uVar.f447488i)) && n51.f.a(java.lang.Integer.valueOf(this.f447489m), java.lang.Integer.valueOf(uVar.f447489m)) && n51.f.a(this.f447490n, uVar.f447490n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f447483d);
            fVar.e(2, this.f447484e);
            java.lang.String str = this.f447485f;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f447486g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f447487h);
            fVar.e(6, this.f447488i);
            fVar.e(7, this.f447489m);
            com.tencent.mm.protobuf.g gVar2 = this.f447490n;
            if (gVar2 != null) {
                fVar.b(8, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f447483d) + 0 + b36.f.e(2, this.f447484e);
            java.lang.String str2 = this.f447485f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f447486g;
            if (gVar3 != null) {
                e17 += b36.f.b(4, gVar3);
            }
            int e18 = e17 + b36.f.e(5, this.f447487h) + b36.f.e(6, this.f447488i) + b36.f.e(7, this.f447489m);
            com.tencent.mm.protobuf.g gVar4 = this.f447490n;
            return gVar4 != null ? e18 + b36.f.b(8, gVar4) : e18;
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
        wn1.u uVar = (wn1.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uVar.f447483d = aVar2.g(intValue);
                return 0;
            case 2:
                uVar.f447484e = aVar2.g(intValue);
                return 0;
            case 3:
                uVar.f447485f = aVar2.k(intValue);
                return 0;
            case 4:
                uVar.f447486g = aVar2.d(intValue);
                return 0;
            case 5:
                uVar.f447487h = aVar2.g(intValue);
                return 0;
            case 6:
                uVar.f447488i = aVar2.g(intValue);
                return 0;
            case 7:
                uVar.f447489m = aVar2.g(intValue);
                return 0;
            case 8:
                uVar.f447490n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
