package r45;

/* loaded from: classes2.dex */
public class bz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371180d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371181e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz4)) {
            return false;
        }
        r45.bz4 bz4Var = (r45.bz4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371180d), java.lang.Integer.valueOf(bz4Var.f371180d)) && n51.f.a(this.f371181e, bz4Var.f371181e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371180d);
            com.tencent.mm.protobuf.g gVar = this.f371181e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371180d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f371181e;
            return gVar2 != null ? e17 + b36.f.b(2, gVar2) : e17;
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
        r45.bz4 bz4Var = (r45.bz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bz4Var.f371180d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        bz4Var.f371181e = aVar2.d(intValue);
        return 0;
    }
}
