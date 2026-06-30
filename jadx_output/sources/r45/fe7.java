package r45;

/* loaded from: classes2.dex */
public class fe7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374265d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374266e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374267f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f374268g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fe7)) {
            return false;
        }
        r45.fe7 fe7Var = (r45.fe7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374265d), java.lang.Integer.valueOf(fe7Var.f374265d)) && n51.f.a(this.f374266e, fe7Var.f374266e) && n51.f.a(this.f374267f, fe7Var.f374267f) && n51.f.a(java.lang.Boolean.valueOf(this.f374268g), java.lang.Boolean.valueOf(fe7Var.f374268g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374265d);
            java.lang.String str = this.f374266e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374267f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f374268g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374265d) + 0;
            java.lang.String str3 = this.f374266e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f374267f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.a(4, this.f374268g);
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
        r45.fe7 fe7Var = (r45.fe7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fe7Var.f374265d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fe7Var.f374266e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fe7Var.f374267f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        fe7Var.f374268g = aVar2.c(intValue);
        return 0;
    }
}
