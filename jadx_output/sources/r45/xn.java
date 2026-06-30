package r45;

/* loaded from: classes2.dex */
public class xn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390247d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f390248e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xn)) {
            return false;
        }
        r45.xn xnVar = (r45.xn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390247d), java.lang.Integer.valueOf(xnVar.f390247d)) && n51.f.a(java.lang.Boolean.valueOf(this.f390248e), java.lang.Boolean.valueOf(xnVar.f390248e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390247d);
            fVar.a(2, this.f390248e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f390247d) + 0 + b36.f.a(2, this.f390248e);
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
        r45.xn xnVar = (r45.xn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xnVar.f390247d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        xnVar.f390248e = aVar2.c(intValue);
        return 0;
    }
}
