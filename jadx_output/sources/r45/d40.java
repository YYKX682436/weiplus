package r45;

/* loaded from: classes9.dex */
public class d40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372065d;

    /* renamed from: e, reason: collision with root package name */
    public int f372066e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372067f;

    /* renamed from: g, reason: collision with root package name */
    public long f372068g;

    /* renamed from: h, reason: collision with root package name */
    public int f372069h;

    /* renamed from: i, reason: collision with root package name */
    public int f372070i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d40)) {
            return false;
        }
        r45.d40 d40Var = (r45.d40) fVar;
        return n51.f.a(this.f372065d, d40Var.f372065d) && n51.f.a(java.lang.Integer.valueOf(this.f372066e), java.lang.Integer.valueOf(d40Var.f372066e)) && n51.f.a(this.f372067f, d40Var.f372067f) && n51.f.a(java.lang.Long.valueOf(this.f372068g), java.lang.Long.valueOf(d40Var.f372068g)) && n51.f.a(java.lang.Integer.valueOf(this.f372069h), java.lang.Integer.valueOf(d40Var.f372069h)) && n51.f.a(java.lang.Integer.valueOf(this.f372070i), java.lang.Integer.valueOf(d40Var.f372070i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f372065d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f372066e);
            com.tencent.mm.protobuf.g gVar2 = this.f372067f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.h(4, this.f372068g);
            fVar.e(5, this.f372069h);
            fVar.e(6, this.f372070i);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f372065d;
            int b17 = (gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0) + b36.f.e(2, this.f372066e);
            com.tencent.mm.protobuf.g gVar4 = this.f372067f;
            if (gVar4 != null) {
                b17 += b36.f.b(3, gVar4);
            }
            return b17 + b36.f.h(4, this.f372068g) + b36.f.e(5, this.f372069h) + b36.f.e(6, this.f372070i);
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
        r45.d40 d40Var = (r45.d40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d40Var.f372065d = aVar2.d(intValue);
                return 0;
            case 2:
                d40Var.f372066e = aVar2.g(intValue);
                return 0;
            case 3:
                d40Var.f372067f = aVar2.d(intValue);
                return 0;
            case 4:
                d40Var.f372068g = aVar2.i(intValue);
                return 0;
            case 5:
                d40Var.f372069h = aVar2.g(intValue);
                return 0;
            case 6:
                d40Var.f372070i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
