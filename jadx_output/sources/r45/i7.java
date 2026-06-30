package r45;

/* loaded from: classes7.dex */
public class i7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f376773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376774e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i7)) {
            return false;
        }
        r45.i7 i7Var = (r45.i7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f376773d), java.lang.Boolean.valueOf(i7Var.f376773d)) && n51.f.a(this.f376774e, i7Var.f376774e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f376773d);
            java.lang.String str = this.f376774e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f376773d) + 0;
            java.lang.String str2 = this.f376774e;
            return str2 != null ? a17 + b36.f.j(2, str2) : a17;
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
        r45.i7 i7Var = (r45.i7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i7Var.f376773d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        i7Var.f376774e = aVar2.k(intValue);
        return 0;
    }
}
