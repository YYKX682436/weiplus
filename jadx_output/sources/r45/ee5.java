package r45;

/* loaded from: classes11.dex */
public class ee5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373361d;

    /* renamed from: e, reason: collision with root package name */
    public int f373362e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373363f;

    /* renamed from: g, reason: collision with root package name */
    public int f373364g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373365h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373366i;

    /* renamed from: m, reason: collision with root package name */
    public int f373367m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ee5)) {
            return false;
        }
        r45.ee5 ee5Var = (r45.ee5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373361d), java.lang.Integer.valueOf(ee5Var.f373361d)) && n51.f.a(java.lang.Integer.valueOf(this.f373362e), java.lang.Integer.valueOf(ee5Var.f373362e)) && n51.f.a(this.f373363f, ee5Var.f373363f) && n51.f.a(java.lang.Integer.valueOf(this.f373364g), java.lang.Integer.valueOf(ee5Var.f373364g)) && n51.f.a(this.f373365h, ee5Var.f373365h) && n51.f.a(this.f373366i, ee5Var.f373366i) && n51.f.a(java.lang.Integer.valueOf(this.f373367m), java.lang.Integer.valueOf(ee5Var.f373367m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373361d);
            fVar.e(2, this.f373362e);
            com.tencent.mm.protobuf.g gVar = this.f373363f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f373364g);
            com.tencent.mm.protobuf.g gVar2 = this.f373365h;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f373366i;
            if (gVar3 != null) {
                fVar.b(6, gVar3);
            }
            fVar.e(7, this.f373367m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373361d) + 0 + b36.f.e(2, this.f373362e);
            com.tencent.mm.protobuf.g gVar4 = this.f373363f;
            if (gVar4 != null) {
                e17 += b36.f.b(3, gVar4);
            }
            int e18 = e17 + b36.f.e(4, this.f373364g);
            com.tencent.mm.protobuf.g gVar5 = this.f373365h;
            if (gVar5 != null) {
                e18 += b36.f.b(5, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f373366i;
            if (gVar6 != null) {
                e18 += b36.f.b(6, gVar6);
            }
            return e18 + b36.f.e(7, this.f373367m);
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
        r45.ee5 ee5Var = (r45.ee5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ee5Var.f373361d = aVar2.g(intValue);
                return 0;
            case 2:
                ee5Var.f373362e = aVar2.g(intValue);
                return 0;
            case 3:
                ee5Var.f373363f = aVar2.d(intValue);
                return 0;
            case 4:
                ee5Var.f373364g = aVar2.g(intValue);
                return 0;
            case 5:
                ee5Var.f373365h = aVar2.d(intValue);
                return 0;
            case 6:
                ee5Var.f373366i = aVar2.d(intValue);
                return 0;
            case 7:
                ee5Var.f373367m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
