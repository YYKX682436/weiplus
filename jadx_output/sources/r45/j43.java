package r45;

/* loaded from: classes4.dex */
public class j43 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377575d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f377576e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j43)) {
            return false;
        }
        r45.j43 j43Var = (r45.j43) fVar;
        return n51.f.a(this.f377575d, j43Var.f377575d) && n51.f.a(java.lang.Boolean.valueOf(this.f377576e), java.lang.Boolean.valueOf(j43Var.f377576e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377575d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f377576e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f377575d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.f377576e);
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
        r45.j43 j43Var = (r45.j43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j43Var.f377575d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        j43Var.f377576e = aVar2.c(intValue);
        return 0;
    }
}
