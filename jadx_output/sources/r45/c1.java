package r45;

/* loaded from: classes9.dex */
public class c1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371197d;

    /* renamed from: e, reason: collision with root package name */
    public int f371198e;

    /* renamed from: f, reason: collision with root package name */
    public int f371199f;

    /* renamed from: g, reason: collision with root package name */
    public int f371200g;

    /* renamed from: h, reason: collision with root package name */
    public int f371201h;

    /* renamed from: i, reason: collision with root package name */
    public int f371202i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c1)) {
            return false;
        }
        r45.c1 c1Var = (r45.c1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371197d), java.lang.Integer.valueOf(c1Var.f371197d)) && n51.f.a(java.lang.Integer.valueOf(this.f371198e), java.lang.Integer.valueOf(c1Var.f371198e)) && n51.f.a(java.lang.Integer.valueOf(this.f371199f), java.lang.Integer.valueOf(c1Var.f371199f)) && n51.f.a(java.lang.Integer.valueOf(this.f371200g), java.lang.Integer.valueOf(c1Var.f371200g)) && n51.f.a(java.lang.Integer.valueOf(this.f371201h), java.lang.Integer.valueOf(c1Var.f371201h)) && n51.f.a(java.lang.Integer.valueOf(this.f371202i), java.lang.Integer.valueOf(c1Var.f371202i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371197d);
            fVar.e(2, this.f371198e);
            fVar.e(3, this.f371199f);
            fVar.e(4, this.f371200g);
            fVar.e(5, this.f371201h);
            fVar.e(6, this.f371202i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f371197d) + 0 + b36.f.e(2, this.f371198e) + b36.f.e(3, this.f371199f) + b36.f.e(4, this.f371200g) + b36.f.e(5, this.f371201h) + b36.f.e(6, this.f371202i);
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
        r45.c1 c1Var = (r45.c1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c1Var.f371197d = aVar2.g(intValue);
                return 0;
            case 2:
                c1Var.f371198e = aVar2.g(intValue);
                return 0;
            case 3:
                c1Var.f371199f = aVar2.g(intValue);
                return 0;
            case 4:
                c1Var.f371200g = aVar2.g(intValue);
                return 0;
            case 5:
                c1Var.f371201h = aVar2.g(intValue);
                return 0;
            case 6:
                c1Var.f371202i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
