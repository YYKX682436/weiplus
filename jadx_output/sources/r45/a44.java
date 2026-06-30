package r45;

/* loaded from: classes9.dex */
public class a44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f369715d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369716e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369717f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a44)) {
            return false;
        }
        r45.a44 a44Var = (r45.a44) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f369715d), java.lang.Integer.valueOf(a44Var.f369715d)) && n51.f.a(this.f369716e, a44Var.f369716e) && n51.f.a(this.f369717f, a44Var.f369717f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f369715d);
            java.lang.String str = this.f369716e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f369717f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f369715d) + 0;
            java.lang.String str3 = this.f369716e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f369717f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        r45.a44 a44Var = (r45.a44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a44Var.f369715d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            a44Var.f369716e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        a44Var.f369717f = aVar2.k(intValue);
        return 0;
    }
}
