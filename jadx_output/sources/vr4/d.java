package vr4;

/* loaded from: classes8.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f439707d;

    /* renamed from: e, reason: collision with root package name */
    public int f439708e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.d)) {
            return false;
        }
        vr4.d dVar = (vr4.d) fVar;
        return n51.f.a(this.f439707d, dVar.f439707d) && n51.f.a(java.lang.Integer.valueOf(this.f439708e), java.lang.Integer.valueOf(dVar.f439708e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f439707d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f439708e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f439707d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f439708e);
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
        vr4.d dVar = (vr4.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dVar.f439707d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        dVar.f439708e = aVar2.g(intValue);
        return 0;
    }
}
