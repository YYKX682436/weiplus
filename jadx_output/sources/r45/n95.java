package r45;

/* loaded from: classes2.dex */
public class n95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f381183d;

    /* renamed from: e, reason: collision with root package name */
    public float f381184e;

    /* renamed from: f, reason: collision with root package name */
    public int f381185f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n95)) {
            return false;
        }
        r45.n95 n95Var = (r45.n95) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f381183d), java.lang.Float.valueOf(n95Var.f381183d)) && n51.f.a(java.lang.Float.valueOf(this.f381184e), java.lang.Float.valueOf(n95Var.f381184e)) && n51.f.a(java.lang.Integer.valueOf(this.f381185f), java.lang.Integer.valueOf(n95Var.f381185f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f381183d);
            fVar.d(2, this.f381184e);
            fVar.e(3, this.f381185f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f381183d) + 0 + b36.f.d(2, this.f381184e) + b36.f.e(3, this.f381185f);
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
        r45.n95 n95Var = (r45.n95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n95Var.f381183d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            n95Var.f381184e = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        n95Var.f381185f = aVar2.g(intValue);
        return 0;
    }
}
