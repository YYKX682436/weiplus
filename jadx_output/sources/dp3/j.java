package dp3;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f242212d;

    /* renamed from: e, reason: collision with root package name */
    public int f242213e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f242214f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dp3.j)) {
            return false;
        }
        dp3.j jVar = (dp3.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f242212d), java.lang.Integer.valueOf(jVar.f242212d)) && n51.f.a(java.lang.Integer.valueOf(this.f242213e), java.lang.Integer.valueOf(jVar.f242213e)) && n51.f.a(this.f242214f, jVar.f242214f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f242212d);
            fVar.e(2, this.f242213e);
            java.lang.String str = this.f242214f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f242212d) + 0 + b36.f.e(2, this.f242213e);
            java.lang.String str2 = this.f242214f;
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
        dp3.j jVar = (dp3.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jVar.f242212d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            jVar.f242213e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        jVar.f242214f = aVar2.k(intValue);
        return 0;
    }
}
