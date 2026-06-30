package r45;

/* loaded from: classes8.dex */
public class x70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389836d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389837e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389838f;

    /* renamed from: g, reason: collision with root package name */
    public int f389839g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x70)) {
            return false;
        }
        r45.x70 x70Var = (r45.x70) fVar;
        return n51.f.a(this.f389836d, x70Var.f389836d) && n51.f.a(this.f389837e, x70Var.f389837e) && n51.f.a(this.f389838f, x70Var.f389838f) && n51.f.a(java.lang.Integer.valueOf(this.f389839g), java.lang.Integer.valueOf(x70Var.f389839g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389836d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389837e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f389838f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f389839g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f389836d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f389837e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f389838f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            return j17 + b36.f.e(4, this.f389839g);
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
        r45.x70 x70Var = (r45.x70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x70Var.f389836d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x70Var.f389837e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            x70Var.f389838f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        x70Var.f389839g = aVar2.g(intValue);
        return 0;
    }
}
