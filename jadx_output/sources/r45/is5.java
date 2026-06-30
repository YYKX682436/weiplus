package r45;

/* loaded from: classes9.dex */
public class is5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f377311d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377312e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377313f;

    /* renamed from: g, reason: collision with root package name */
    public int f377314g;

    /* renamed from: h, reason: collision with root package name */
    public int f377315h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.is5)) {
            return false;
        }
        r45.is5 is5Var = (r45.is5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f377311d), java.lang.Long.valueOf(is5Var.f377311d)) && n51.f.a(this.f377312e, is5Var.f377312e) && n51.f.a(this.f377313f, is5Var.f377313f) && n51.f.a(java.lang.Integer.valueOf(this.f377314g), java.lang.Integer.valueOf(is5Var.f377314g)) && n51.f.a(java.lang.Integer.valueOf(this.f377315h), java.lang.Integer.valueOf(is5Var.f377315h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f377311d);
            com.tencent.mm.protobuf.g gVar = this.f377312e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f377313f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f377314g);
            fVar.e(5, this.f377315h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f377311d) + 0;
            com.tencent.mm.protobuf.g gVar3 = this.f377312e;
            if (gVar3 != null) {
                h17 += b36.f.b(2, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f377313f;
            if (gVar4 != null) {
                h17 += b36.f.b(3, gVar4);
            }
            return h17 + b36.f.e(4, this.f377314g) + b36.f.e(5, this.f377315h);
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
        r45.is5 is5Var = (r45.is5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            is5Var.f377311d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            is5Var.f377312e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            is5Var.f377313f = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            is5Var.f377314g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        is5Var.f377315h = aVar2.g(intValue);
        return 0;
    }
}
