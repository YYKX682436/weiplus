package wn1;

/* loaded from: classes11.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f447476d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f447477e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f447478f;

    /* renamed from: g, reason: collision with root package name */
    public int f447479g;

    /* renamed from: h, reason: collision with root package name */
    public int f447480h;

    /* renamed from: i, reason: collision with root package name */
    public int f447481i;

    /* renamed from: m, reason: collision with root package name */
    public int f447482m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.t)) {
            return false;
        }
        wn1.t tVar = (wn1.t) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f447476d), java.lang.Integer.valueOf(tVar.f447476d)) && n51.f.a(this.f447477e, tVar.f447477e) && n51.f.a(this.f447478f, tVar.f447478f) && n51.f.a(java.lang.Integer.valueOf(this.f447479g), java.lang.Integer.valueOf(tVar.f447479g)) && n51.f.a(java.lang.Integer.valueOf(this.f447480h), java.lang.Integer.valueOf(tVar.f447480h)) && n51.f.a(java.lang.Integer.valueOf(this.f447481i), java.lang.Integer.valueOf(tVar.f447481i)) && n51.f.a(java.lang.Integer.valueOf(this.f447482m), java.lang.Integer.valueOf(tVar.f447482m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f447476d);
            java.lang.String str = this.f447477e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f447478f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f447479g);
            fVar.e(5, this.f447480h);
            fVar.e(6, this.f447481i);
            fVar.e(7, this.f447482m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f447476d) + 0;
            java.lang.String str2 = this.f447477e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f447478f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            return e17 + b36.f.e(4, this.f447479g) + b36.f.e(5, this.f447480h) + b36.f.e(6, this.f447481i) + b36.f.e(7, this.f447482m);
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
        wn1.t tVar = (wn1.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tVar.f447476d = aVar2.g(intValue);
                return 0;
            case 2:
                tVar.f447477e = aVar2.k(intValue);
                return 0;
            case 3:
                tVar.f447478f = aVar2.d(intValue);
                return 0;
            case 4:
                tVar.f447479g = aVar2.g(intValue);
                return 0;
            case 5:
                tVar.f447480h = aVar2.g(intValue);
                return 0;
            case 6:
                tVar.f447481i = aVar2.g(intValue);
                return 0;
            case 7:
                tVar.f447482m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
