package r45;

/* loaded from: classes11.dex */
public class gv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375549d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375550e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375551f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375552g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gv3)) {
            return false;
        }
        r45.gv3 gv3Var = (r45.gv3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375549d), java.lang.Integer.valueOf(gv3Var.f375549d)) && n51.f.a(this.f375550e, gv3Var.f375550e) && n51.f.a(this.f375551f, gv3Var.f375551f) && n51.f.a(this.f375552g, gv3Var.f375552g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375549d);
            com.tencent.mm.protobuf.g gVar = this.f375550e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f375551f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f375552g;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375549d) + 0;
            com.tencent.mm.protobuf.g gVar4 = this.f375550e;
            if (gVar4 != null) {
                e17 += b36.f.b(2, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f375551f;
            if (gVar5 != null) {
                e17 += b36.f.b(3, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f375552g;
            return gVar6 != null ? e17 + b36.f.b(4, gVar6) : e17;
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
        r45.gv3 gv3Var = (r45.gv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gv3Var.f375549d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gv3Var.f375550e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            gv3Var.f375551f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gv3Var.f375552g = aVar2.d(intValue);
        return 0;
    }
}
