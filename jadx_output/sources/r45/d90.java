package r45;

/* loaded from: classes2.dex */
public class d90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372244d;

    /* renamed from: e, reason: collision with root package name */
    public int f372245e;

    /* renamed from: f, reason: collision with root package name */
    public int f372246f;

    /* renamed from: g, reason: collision with root package name */
    public int f372247g;

    /* renamed from: h, reason: collision with root package name */
    public int f372248h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d90)) {
            return false;
        }
        r45.d90 d90Var = (r45.d90) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372244d), java.lang.Integer.valueOf(d90Var.f372244d)) && n51.f.a(java.lang.Integer.valueOf(this.f372245e), java.lang.Integer.valueOf(d90Var.f372245e)) && n51.f.a(java.lang.Integer.valueOf(this.f372246f), java.lang.Integer.valueOf(d90Var.f372246f)) && n51.f.a(java.lang.Integer.valueOf(this.f372247g), java.lang.Integer.valueOf(d90Var.f372247g)) && n51.f.a(java.lang.Integer.valueOf(this.f372248h), java.lang.Integer.valueOf(d90Var.f372248h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372244d);
            fVar.e(2, this.f372245e);
            fVar.e(3, this.f372246f);
            fVar.e(4, this.f372247g);
            fVar.e(5, this.f372248h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372244d) + 0 + b36.f.e(2, this.f372245e) + b36.f.e(3, this.f372246f) + b36.f.e(4, this.f372247g) + b36.f.e(5, this.f372248h);
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
        r45.d90 d90Var = (r45.d90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d90Var.f372244d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            d90Var.f372245e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d90Var.f372246f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            d90Var.f372247g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        d90Var.f372248h = aVar2.g(intValue);
        return 0;
    }
}
