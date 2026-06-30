package wn1;

/* loaded from: classes12.dex */
public class v extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f447491d;

    /* renamed from: e, reason: collision with root package name */
    public int f447492e;

    /* renamed from: f, reason: collision with root package name */
    public int f447493f;

    /* renamed from: g, reason: collision with root package name */
    public int f447494g;

    /* renamed from: h, reason: collision with root package name */
    public int f447495h;

    /* renamed from: i, reason: collision with root package name */
    public int f447496i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f447497m;

    /* renamed from: n, reason: collision with root package name */
    public int f447498n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.v)) {
            return false;
        }
        wn1.v vVar = (wn1.v) fVar;
        return n51.f.a(this.f447491d, vVar.f447491d) && n51.f.a(java.lang.Integer.valueOf(this.f447492e), java.lang.Integer.valueOf(vVar.f447492e)) && n51.f.a(java.lang.Integer.valueOf(this.f447493f), java.lang.Integer.valueOf(vVar.f447493f)) && n51.f.a(java.lang.Integer.valueOf(this.f447494g), java.lang.Integer.valueOf(vVar.f447494g)) && n51.f.a(java.lang.Integer.valueOf(this.f447495h), java.lang.Integer.valueOf(vVar.f447495h)) && n51.f.a(java.lang.Integer.valueOf(this.f447496i), java.lang.Integer.valueOf(vVar.f447496i)) && n51.f.a(this.f447497m, vVar.f447497m) && n51.f.a(java.lang.Integer.valueOf(this.f447498n), java.lang.Integer.valueOf(vVar.f447498n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f447491d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f447492e);
            fVar.e(3, this.f447493f);
            fVar.e(4, this.f447494g);
            fVar.e(5, this.f447495h);
            fVar.e(6, this.f447496i);
            com.tencent.mm.protobuf.g gVar = this.f447497m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f447498n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f447491d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f447492e) + b36.f.e(3, this.f447493f) + b36.f.e(4, this.f447494g) + b36.f.e(5, this.f447495h) + b36.f.e(6, this.f447496i);
            com.tencent.mm.protobuf.g gVar2 = this.f447497m;
            if (gVar2 != null) {
                j17 += b36.f.b(7, gVar2);
            }
            return j17 + b36.f.e(8, this.f447498n);
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
        wn1.v vVar = (wn1.v) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vVar.f447491d = aVar2.k(intValue);
                return 0;
            case 2:
                vVar.f447492e = aVar2.g(intValue);
                return 0;
            case 3:
                vVar.f447493f = aVar2.g(intValue);
                return 0;
            case 4:
                vVar.f447494g = aVar2.g(intValue);
                return 0;
            case 5:
                vVar.f447495h = aVar2.g(intValue);
                return 0;
            case 6:
                vVar.f447496i = aVar2.g(intValue);
                return 0;
            case 7:
                vVar.f447497m = aVar2.d(intValue);
                return 0;
            case 8:
                vVar.f447498n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
