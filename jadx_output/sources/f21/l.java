package f21;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f258931d;

    /* renamed from: e, reason: collision with root package name */
    public int f258932e;

    /* renamed from: f, reason: collision with root package name */
    public double f258933f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f258934g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof f21.l)) {
            return false;
        }
        f21.l lVar = (f21.l) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f258931d), java.lang.Integer.valueOf(lVar.f258931d)) && n51.f.a(java.lang.Integer.valueOf(this.f258932e), java.lang.Integer.valueOf(lVar.f258932e)) && n51.f.a(java.lang.Double.valueOf(this.f258933f), java.lang.Double.valueOf(lVar.f258933f)) && n51.f.a(this.f258934g, lVar.f258934g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f258931d);
            fVar.e(2, this.f258932e);
            fVar.c(3, this.f258933f);
            java.lang.String str = this.f258934g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f258931d) + 0 + b36.f.e(2, this.f258932e) + b36.f.c(3, this.f258933f);
            java.lang.String str2 = this.f258934g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        f21.l lVar = (f21.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lVar.f258931d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            lVar.f258932e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            lVar.f258933f = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        lVar.f258934g = aVar2.k(intValue);
        return 0;
    }
}
