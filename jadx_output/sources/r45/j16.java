package r45;

/* loaded from: classes9.dex */
public class j16 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377496d;

    /* renamed from: e, reason: collision with root package name */
    public int f377497e;

    /* renamed from: f, reason: collision with root package name */
    public int f377498f;

    /* renamed from: g, reason: collision with root package name */
    public int f377499g;

    /* renamed from: h, reason: collision with root package name */
    public int f377500h;

    /* renamed from: i, reason: collision with root package name */
    public int f377501i;

    /* renamed from: m, reason: collision with root package name */
    public int f377502m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j16)) {
            return false;
        }
        r45.j16 j16Var = (r45.j16) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377496d), java.lang.Integer.valueOf(j16Var.f377496d)) && n51.f.a(java.lang.Integer.valueOf(this.f377497e), java.lang.Integer.valueOf(j16Var.f377497e)) && n51.f.a(java.lang.Integer.valueOf(this.f377498f), java.lang.Integer.valueOf(j16Var.f377498f)) && n51.f.a(java.lang.Integer.valueOf(this.f377499g), java.lang.Integer.valueOf(j16Var.f377499g)) && n51.f.a(java.lang.Integer.valueOf(this.f377500h), java.lang.Integer.valueOf(j16Var.f377500h)) && n51.f.a(java.lang.Integer.valueOf(this.f377501i), java.lang.Integer.valueOf(j16Var.f377501i)) && n51.f.a(java.lang.Integer.valueOf(this.f377502m), java.lang.Integer.valueOf(j16Var.f377502m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377496d);
            fVar.e(2, this.f377497e);
            fVar.e(3, this.f377498f);
            fVar.e(4, this.f377499g);
            fVar.e(5, this.f377500h);
            fVar.e(6, this.f377501i);
            fVar.e(7, this.f377502m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f377496d) + 0 + b36.f.e(2, this.f377497e) + b36.f.e(3, this.f377498f) + b36.f.e(4, this.f377499g) + b36.f.e(5, this.f377500h) + b36.f.e(6, this.f377501i) + b36.f.e(7, this.f377502m);
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
        r45.j16 j16Var = (r45.j16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j16Var.f377496d = aVar2.g(intValue);
                return 0;
            case 2:
                j16Var.f377497e = aVar2.g(intValue);
                return 0;
            case 3:
                j16Var.f377498f = aVar2.g(intValue);
                return 0;
            case 4:
                j16Var.f377499g = aVar2.g(intValue);
                return 0;
            case 5:
                j16Var.f377500h = aVar2.g(intValue);
                return 0;
            case 6:
                j16Var.f377501i = aVar2.g(intValue);
                return 0;
            case 7:
                j16Var.f377502m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
