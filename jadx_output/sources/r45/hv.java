package r45;

/* loaded from: classes8.dex */
public class hv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376465d;

    /* renamed from: e, reason: collision with root package name */
    public long f376466e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hv)) {
            return false;
        }
        r45.hv hvVar = (r45.hv) fVar;
        return n51.f.a(this.f376465d, hvVar.f376465d) && n51.f.a(java.lang.Long.valueOf(this.f376466e), java.lang.Long.valueOf(hvVar.f376466e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376465d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f376466e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f376465d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f376466e);
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
        r45.hv hvVar = (r45.hv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hvVar.f376465d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        hvVar.f376466e = aVar2.i(intValue);
        return 0;
    }
}
