package r45;

/* loaded from: classes9.dex */
public class h54 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375854d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375855e;

    /* renamed from: f, reason: collision with root package name */
    public int f375856f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h54)) {
            return false;
        }
        r45.h54 h54Var = (r45.h54) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375854d), java.lang.Integer.valueOf(h54Var.f375854d)) && n51.f.a(this.f375855e, h54Var.f375855e) && n51.f.a(java.lang.Integer.valueOf(this.f375856f), java.lang.Integer.valueOf(h54Var.f375856f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375854d);
            java.lang.String str = this.f375855e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f375856f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375854d) + 0;
            java.lang.String str2 = this.f375855e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f375856f);
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
        r45.h54 h54Var = (r45.h54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h54Var.f375854d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h54Var.f375855e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        h54Var.f375856f = aVar2.g(intValue);
        return 0;
    }
}
