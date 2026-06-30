package r45;

/* loaded from: classes4.dex */
public class ni0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381414d;

    /* renamed from: e, reason: collision with root package name */
    public int f381415e;

    /* renamed from: f, reason: collision with root package name */
    public float f381416f;

    /* renamed from: g, reason: collision with root package name */
    public float f381417g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ni0)) {
            return false;
        }
        r45.ni0 ni0Var = (r45.ni0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381414d), java.lang.Integer.valueOf(ni0Var.f381414d)) && n51.f.a(java.lang.Integer.valueOf(this.f381415e), java.lang.Integer.valueOf(ni0Var.f381415e)) && n51.f.a(java.lang.Float.valueOf(this.f381416f), java.lang.Float.valueOf(ni0Var.f381416f)) && n51.f.a(java.lang.Float.valueOf(this.f381417g), java.lang.Float.valueOf(ni0Var.f381417g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381414d);
            fVar.e(2, this.f381415e);
            fVar.d(3, this.f381416f);
            fVar.d(4, this.f381417g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f381414d) + 0 + b36.f.e(2, this.f381415e) + b36.f.d(3, this.f381416f) + b36.f.d(4, this.f381417g);
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
        r45.ni0 ni0Var = (r45.ni0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ni0Var.f381414d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ni0Var.f381415e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ni0Var.f381416f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ni0Var.f381417g = aVar2.f(intValue);
        return 0;
    }
}
