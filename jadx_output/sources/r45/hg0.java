package r45;

/* loaded from: classes11.dex */
public class hg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376128d;

    /* renamed from: e, reason: collision with root package name */
    public int f376129e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376130f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376131g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f376132h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hg0)) {
            return false;
        }
        r45.hg0 hg0Var = (r45.hg0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376128d), java.lang.Integer.valueOf(hg0Var.f376128d)) && n51.f.a(java.lang.Integer.valueOf(this.f376129e), java.lang.Integer.valueOf(hg0Var.f376129e)) && n51.f.a(this.f376130f, hg0Var.f376130f) && n51.f.a(this.f376131g, hg0Var.f376131g) && n51.f.a(this.f376132h, hg0Var.f376132h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376128d);
            fVar.e(2, this.f376129e);
            com.tencent.mm.protobuf.g gVar = this.f376130f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f376131g;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f376132h;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376128d) + 0 + b36.f.e(2, this.f376129e);
            com.tencent.mm.protobuf.g gVar4 = this.f376130f;
            if (gVar4 != null) {
                e17 += b36.f.b(3, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f376131g;
            if (gVar5 != null) {
                e17 += b36.f.b(4, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f376132h;
            return gVar6 != null ? e17 + b36.f.b(5, gVar6) : e17;
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
        r45.hg0 hg0Var = (r45.hg0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hg0Var.f376128d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hg0Var.f376129e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            hg0Var.f376130f = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            hg0Var.f376131g = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        hg0Var.f376132h = aVar2.d(intValue);
        return 0;
    }
}
