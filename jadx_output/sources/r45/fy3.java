package r45;

/* loaded from: classes8.dex */
public class fy3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374726d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374727e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374728f;

    /* renamed from: g, reason: collision with root package name */
    public int f374729g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fy3)) {
            return false;
        }
        r45.fy3 fy3Var = (r45.fy3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374726d), java.lang.Integer.valueOf(fy3Var.f374726d)) && n51.f.a(this.f374727e, fy3Var.f374727e) && n51.f.a(this.f374728f, fy3Var.f374728f) && n51.f.a(java.lang.Integer.valueOf(this.f374729g), java.lang.Integer.valueOf(fy3Var.f374729g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374726d);
            java.lang.String str = this.f374727e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f374728f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f374729g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374726d) + 0;
            java.lang.String str2 = this.f374727e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f374728f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            return e17 + b36.f.e(4, this.f374729g);
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
        r45.fy3 fy3Var = (r45.fy3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fy3Var.f374726d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fy3Var.f374727e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fy3Var.f374728f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        fy3Var.f374729g = aVar2.g(intValue);
        return 0;
    }
}
