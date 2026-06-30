package r45;

/* loaded from: classes11.dex */
public class z05 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391570d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391571e;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 806;
        lVar.f70666c = "/cgi-bin/micromsg-bin/openimoplog";
        lVar.f70664a = this;
        lVar.f70665b = new r45.a15();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z05)) {
            return false;
        }
        r45.z05 z05Var = (r45.z05) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391570d), java.lang.Integer.valueOf(z05Var.f391570d)) && n51.f.a(this.f391571e, z05Var.f391571e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391570d);
            com.tencent.mm.protobuf.g gVar = this.f391571e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391570d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f391571e;
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
        r45.z05 z05Var = (r45.z05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z05Var.f391570d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        z05Var.f391571e = aVar2.d(intValue);
        return 0;
    }
}
