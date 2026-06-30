package f21;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f258925d;

    /* renamed from: e, reason: collision with root package name */
    public int f258926e;

    /* renamed from: f, reason: collision with root package name */
    public int f258927f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof f21.j)) {
            return false;
        }
        f21.j jVar = (f21.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f258925d), java.lang.Integer.valueOf(jVar.f258925d)) && n51.f.a(java.lang.Integer.valueOf(this.f258926e), java.lang.Integer.valueOf(jVar.f258926e)) && n51.f.a(java.lang.Integer.valueOf(this.f258927f), java.lang.Integer.valueOf(jVar.f258927f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f258925d);
            fVar.e(2, this.f258926e);
            fVar.e(3, this.f258927f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f258925d) + 0 + b36.f.e(2, this.f258926e) + b36.f.e(3, this.f258927f);
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
        f21.j jVar = (f21.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jVar.f258925d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            jVar.f258926e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        jVar.f258927f = aVar2.g(intValue);
        return 0;
    }
}
