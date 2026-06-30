package r45;

/* loaded from: classes9.dex */
public class vo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388402d;

    /* renamed from: e, reason: collision with root package name */
    public int f388403e;

    /* renamed from: f, reason: collision with root package name */
    public int f388404f;

    /* renamed from: g, reason: collision with root package name */
    public int f388405g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vo)) {
            return false;
        }
        r45.vo voVar = (r45.vo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388402d), java.lang.Integer.valueOf(voVar.f388402d)) && n51.f.a(java.lang.Integer.valueOf(this.f388403e), java.lang.Integer.valueOf(voVar.f388403e)) && n51.f.a(java.lang.Integer.valueOf(this.f388404f), java.lang.Integer.valueOf(voVar.f388404f)) && n51.f.a(java.lang.Integer.valueOf(this.f388405g), java.lang.Integer.valueOf(voVar.f388405g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388402d);
            fVar.e(2, this.f388403e);
            fVar.e(3, this.f388404f);
            fVar.e(4, this.f388405g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f388402d) + 0 + b36.f.e(2, this.f388403e) + b36.f.e(3, this.f388404f) + b36.f.e(4, this.f388405g);
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
        r45.vo voVar = (r45.vo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            voVar.f388402d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            voVar.f388403e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            voVar.f388404f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        voVar.f388405g = aVar2.g(intValue);
        return 0;
    }
}
