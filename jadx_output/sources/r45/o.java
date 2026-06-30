package r45;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381784d;

    /* renamed from: e, reason: collision with root package name */
    public long f381785e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o)) {
            return false;
        }
        r45.o oVar = (r45.o) fVar;
        return n51.f.a(this.f381784d, oVar.f381784d) && n51.f.a(java.lang.Long.valueOf(this.f381785e), java.lang.Long.valueOf(oVar.f381785e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381784d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f381785e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f381784d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f381785e);
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
        r45.o oVar = (r45.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            oVar.f381784d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        oVar.f381785e = aVar2.i(intValue);
        return 0;
    }
}
