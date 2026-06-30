package r45;

/* loaded from: classes7.dex */
public class ud7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387273d;

    /* renamed from: e, reason: collision with root package name */
    public int f387274e;

    /* renamed from: f, reason: collision with root package name */
    public int f387275f;

    /* renamed from: g, reason: collision with root package name */
    public int f387276g;

    /* renamed from: h, reason: collision with root package name */
    public int f387277h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud7)) {
            return false;
        }
        r45.ud7 ud7Var = (r45.ud7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387273d), java.lang.Integer.valueOf(ud7Var.f387273d)) && n51.f.a(java.lang.Integer.valueOf(this.f387274e), java.lang.Integer.valueOf(ud7Var.f387274e)) && n51.f.a(java.lang.Integer.valueOf(this.f387275f), java.lang.Integer.valueOf(ud7Var.f387275f)) && n51.f.a(java.lang.Integer.valueOf(this.f387276g), java.lang.Integer.valueOf(ud7Var.f387276g)) && n51.f.a(java.lang.Integer.valueOf(this.f387277h), java.lang.Integer.valueOf(ud7Var.f387277h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387273d);
            fVar.e(2, this.f387274e);
            fVar.e(3, this.f387275f);
            fVar.e(4, this.f387276g);
            fVar.e(5, this.f387277h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f387273d) + 0 + b36.f.e(2, this.f387274e) + b36.f.e(3, this.f387275f) + b36.f.e(4, this.f387276g) + b36.f.e(5, this.f387277h);
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
        r45.ud7 ud7Var = (r45.ud7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ud7Var.f387273d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ud7Var.f387274e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ud7Var.f387275f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ud7Var.f387276g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ud7Var.f387277h = aVar2.g(intValue);
        return 0;
    }
}
