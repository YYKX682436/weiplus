package r45;

/* loaded from: classes15.dex */
public class b44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370513d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370514e;

    /* renamed from: f, reason: collision with root package name */
    public int f370515f;

    /* renamed from: g, reason: collision with root package name */
    public int f370516g;

    /* renamed from: h, reason: collision with root package name */
    public int f370517h;

    /* renamed from: i, reason: collision with root package name */
    public int f370518i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b44)) {
            return false;
        }
        r45.b44 b44Var = (r45.b44) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370513d), java.lang.Integer.valueOf(b44Var.f370513d)) && n51.f.a(this.f370514e, b44Var.f370514e) && n51.f.a(java.lang.Integer.valueOf(this.f370515f), java.lang.Integer.valueOf(b44Var.f370515f)) && n51.f.a(java.lang.Integer.valueOf(this.f370516g), java.lang.Integer.valueOf(b44Var.f370516g)) && n51.f.a(java.lang.Integer.valueOf(this.f370517h), java.lang.Integer.valueOf(b44Var.f370517h)) && n51.f.a(java.lang.Integer.valueOf(this.f370518i), java.lang.Integer.valueOf(b44Var.f370518i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370513d);
            com.tencent.mm.protobuf.g gVar = this.f370514e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f370515f);
            fVar.e(4, this.f370516g);
            fVar.e(5, this.f370517h);
            fVar.e(6, this.f370518i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370513d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f370514e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.e(3, this.f370515f) + b36.f.e(4, this.f370516g) + b36.f.e(5, this.f370517h) + b36.f.e(6, this.f370518i);
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
        r45.b44 b44Var = (r45.b44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b44Var.f370513d = aVar2.g(intValue);
                return 0;
            case 2:
                b44Var.f370514e = aVar2.d(intValue);
                return 0;
            case 3:
                b44Var.f370515f = aVar2.g(intValue);
                return 0;
            case 4:
                b44Var.f370516g = aVar2.g(intValue);
                return 0;
            case 5:
                b44Var.f370517h = aVar2.g(intValue);
                return 0;
            case 6:
                b44Var.f370518i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
