package r45;

/* loaded from: classes2.dex */
public class se0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385647d;

    /* renamed from: e, reason: collision with root package name */
    public int f385648e;

    /* renamed from: f, reason: collision with root package name */
    public int f385649f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.se0)) {
            return false;
        }
        r45.se0 se0Var = (r45.se0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385647d), java.lang.Integer.valueOf(se0Var.f385647d)) && n51.f.a(java.lang.Integer.valueOf(this.f385648e), java.lang.Integer.valueOf(se0Var.f385648e)) && n51.f.a(java.lang.Integer.valueOf(this.f385649f), java.lang.Integer.valueOf(se0Var.f385649f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385647d);
            fVar.e(2, this.f385648e);
            fVar.e(3, this.f385649f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f385647d) + 0 + b36.f.e(2, this.f385648e) + b36.f.e(3, this.f385649f);
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
        r45.se0 se0Var = (r45.se0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            se0Var.f385647d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            se0Var.f385648e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        se0Var.f385649f = aVar2.g(intValue);
        return 0;
    }
}
