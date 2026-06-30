package r45;

/* loaded from: classes4.dex */
public class r67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384581d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384582e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r67)) {
            return false;
        }
        r45.r67 r67Var = (r45.r67) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384581d), java.lang.Integer.valueOf(r67Var.f384581d)) && n51.f.a(this.f384582e, r67Var.f384582e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384581d);
            java.lang.String str = this.f384582e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384581d) + 0;
            java.lang.String str2 = this.f384582e;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
        r45.r67 r67Var = (r45.r67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r67Var.f384581d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        r67Var.f384582e = aVar2.k(intValue);
        return 0;
    }
}
