package r45;

/* loaded from: classes7.dex */
public class h77 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375925d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375926e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375927f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h77)) {
            return false;
        }
        r45.h77 h77Var = (r45.h77) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375925d), java.lang.Integer.valueOf(h77Var.f375925d)) && n51.f.a(this.f375926e, h77Var.f375926e) && n51.f.a(this.f375927f, h77Var.f375927f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375925d);
            java.lang.String str = this.f375926e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375927f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375925d) + 0;
            java.lang.String str3 = this.f375926e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f375927f;
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
        r45.h77 h77Var = (r45.h77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h77Var.f375925d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h77Var.f375926e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        h77Var.f375927f = aVar2.k(intValue);
        return 0;
    }
}
