package wn1;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f447441d;

    /* renamed from: e, reason: collision with root package name */
    public int f447442e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f447443f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.n)) {
            return false;
        }
        wn1.n nVar = (wn1.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f447441d), java.lang.Integer.valueOf(nVar.f447441d)) && n51.f.a(java.lang.Integer.valueOf(this.f447442e), java.lang.Integer.valueOf(nVar.f447442e)) && n51.f.a(this.f447443f, nVar.f447443f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f447441d);
            fVar.e(2, this.f447442e);
            java.lang.String str = this.f447443f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f447441d) + 0 + b36.f.e(2, this.f447442e);
            java.lang.String str2 = this.f447443f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        wn1.n nVar = (wn1.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nVar.f447441d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            nVar.f447442e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        nVar.f447443f = aVar2.k(intValue);
        return 0;
    }
}
