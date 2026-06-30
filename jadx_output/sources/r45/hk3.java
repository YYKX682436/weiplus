package r45;

/* loaded from: classes4.dex */
public class hk3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376241d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376242e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f376243f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f376244g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hk3)) {
            return false;
        }
        r45.hk3 hk3Var = (r45.hk3) fVar;
        return n51.f.a(this.f376241d, hk3Var.f376241d) && n51.f.a(this.f376242e, hk3Var.f376242e) && n51.f.a(this.f376243f, hk3Var.f376243f) && n51.f.a(java.lang.Integer.valueOf(this.f376244g), java.lang.Integer.valueOf(hk3Var.f376244g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376241d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376242e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, this.f376243f);
            fVar.e(4, this.f376244g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f376241d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f376242e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 1, this.f376243f) + b36.f.e(4, this.f376244g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f376243f.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.hk3 hk3Var = (r45.hk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hk3Var.f376241d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hk3Var.f376242e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hk3Var.f376243f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hk3Var.f376244g = aVar2.g(intValue);
        return 0;
    }
}
