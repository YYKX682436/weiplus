package r45;

/* loaded from: classes9.dex */
public class rp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385070d;

    /* renamed from: e, reason: collision with root package name */
    public int f385071e;

    /* renamed from: f, reason: collision with root package name */
    public int f385072f;

    /* renamed from: g, reason: collision with root package name */
    public int f385073g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rp0)) {
            return false;
        }
        r45.rp0 rp0Var = (r45.rp0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385070d), java.lang.Integer.valueOf(rp0Var.f385070d)) && n51.f.a(java.lang.Integer.valueOf(this.f385071e), java.lang.Integer.valueOf(rp0Var.f385071e)) && n51.f.a(java.lang.Integer.valueOf(this.f385072f), java.lang.Integer.valueOf(rp0Var.f385072f)) && n51.f.a(java.lang.Integer.valueOf(this.f385073g), java.lang.Integer.valueOf(rp0Var.f385073g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385070d);
            fVar.e(2, this.f385071e);
            fVar.e(3, this.f385072f);
            fVar.e(4, this.f385073g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f385070d) + 0 + b36.f.e(2, this.f385071e) + b36.f.e(3, this.f385072f) + b36.f.e(4, this.f385073g);
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
        r45.rp0 rp0Var = (r45.rp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rp0Var.f385070d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            rp0Var.f385071e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            rp0Var.f385072f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        rp0Var.f385073g = aVar2.g(intValue);
        return 0;
    }
}
