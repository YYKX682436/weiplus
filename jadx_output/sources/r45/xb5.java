package r45;

/* loaded from: classes2.dex */
public class xb5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389945d;

    /* renamed from: e, reason: collision with root package name */
    public int f389946e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389947f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xb5)) {
            return false;
        }
        r45.xb5 xb5Var = (r45.xb5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389945d), java.lang.Integer.valueOf(xb5Var.f389945d)) && n51.f.a(java.lang.Integer.valueOf(this.f389946e), java.lang.Integer.valueOf(xb5Var.f389946e)) && n51.f.a(this.f389947f, xb5Var.f389947f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389945d);
            fVar.e(2, this.f389946e);
            java.lang.String str = this.f389947f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389945d) + 0 + b36.f.e(2, this.f389946e);
            java.lang.String str2 = this.f389947f;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
        r45.xb5 xb5Var = (r45.xb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xb5Var.f389945d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xb5Var.f389946e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xb5Var.f389947f = aVar2.k(intValue);
        return 0;
    }
}
