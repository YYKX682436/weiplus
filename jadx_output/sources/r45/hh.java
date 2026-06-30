package r45;

/* loaded from: classes9.dex */
public class hh extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376142d;

    /* renamed from: e, reason: collision with root package name */
    public int f376143e;

    /* renamed from: f, reason: collision with root package name */
    public int f376144f;

    /* renamed from: g, reason: collision with root package name */
    public int f376145g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hh)) {
            return false;
        }
        r45.hh hhVar = (r45.hh) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376142d), java.lang.Integer.valueOf(hhVar.f376142d)) && n51.f.a(java.lang.Integer.valueOf(this.f376143e), java.lang.Integer.valueOf(hhVar.f376143e)) && n51.f.a(java.lang.Integer.valueOf(this.f376144f), java.lang.Integer.valueOf(hhVar.f376144f)) && n51.f.a(java.lang.Integer.valueOf(this.f376145g), java.lang.Integer.valueOf(hhVar.f376145g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376142d);
            fVar.e(2, this.f376143e);
            fVar.e(3, this.f376144f);
            fVar.e(4, this.f376145g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f376142d) + 0 + b36.f.e(2, this.f376143e) + b36.f.e(3, this.f376144f) + b36.f.e(4, this.f376145g);
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
        r45.hh hhVar = (r45.hh) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hhVar.f376142d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hhVar.f376143e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            hhVar.f376144f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hhVar.f376145g = aVar2.g(intValue);
        return 0;
    }
}
