package r45;

/* loaded from: classes4.dex */
public class z9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391792d;

    /* renamed from: e, reason: collision with root package name */
    public int f391793e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391794f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z9)) {
            return false;
        }
        r45.z9 z9Var = (r45.z9) fVar;
        return n51.f.a(this.f391792d, z9Var.f391792d) && n51.f.a(java.lang.Integer.valueOf(this.f391793e), java.lang.Integer.valueOf(z9Var.f391793e)) && n51.f.a(this.f391794f, z9Var.f391794f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391792d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f391793e);
            java.lang.String str2 = this.f391794f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f391792d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f391793e);
            java.lang.String str4 = this.f391794f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        r45.z9 z9Var = (r45.z9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z9Var.f391792d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            z9Var.f391793e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        z9Var.f391794f = aVar2.k(intValue);
        return 0;
    }
}
