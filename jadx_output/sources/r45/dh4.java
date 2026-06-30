package r45;

/* loaded from: classes8.dex */
public class dh4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372473d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372474e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dh4)) {
            return false;
        }
        r45.dh4 dh4Var = (r45.dh4) fVar;
        return n51.f.a(this.f372473d, dh4Var.f372473d) && n51.f.a(this.f372474e, dh4Var.f372474e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372473d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f372474e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f372473d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f372474e;
            return gVar2 != null ? j17 + b36.f.b(2, gVar2) : j17;
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
        r45.dh4 dh4Var = (r45.dh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dh4Var.f372473d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        dh4Var.f372474e = aVar2.d(intValue);
        return 0;
    }
}
