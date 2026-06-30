package r45;

/* loaded from: classes2.dex */
public class os5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382497d;

    /* renamed from: e, reason: collision with root package name */
    public int f382498e;

    /* renamed from: f, reason: collision with root package name */
    public int f382499f;

    /* renamed from: g, reason: collision with root package name */
    public int f382500g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.os5)) {
            return false;
        }
        r45.os5 os5Var = (r45.os5) fVar;
        return n51.f.a(this.f382497d, os5Var.f382497d) && n51.f.a(java.lang.Integer.valueOf(this.f382498e), java.lang.Integer.valueOf(os5Var.f382498e)) && n51.f.a(java.lang.Integer.valueOf(this.f382499f), java.lang.Integer.valueOf(os5Var.f382499f)) && n51.f.a(java.lang.Integer.valueOf(this.f382500g), java.lang.Integer.valueOf(os5Var.f382500g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382497d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382498e);
            fVar.e(3, this.f382499f);
            fVar.e(4, this.f382500g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f382497d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f382498e) + b36.f.e(3, this.f382499f) + b36.f.e(4, this.f382500g);
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
        r45.os5 os5Var = (r45.os5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            os5Var.f382497d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            os5Var.f382498e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            os5Var.f382499f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        os5Var.f382500g = aVar2.g(intValue);
        return 0;
    }
}
