package m53;

/* loaded from: classes8.dex */
public class a3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323557d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323558e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323559f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.a3)) {
            return false;
        }
        m53.a3 a3Var = (m53.a3) fVar;
        return n51.f.a(this.f323557d, a3Var.f323557d) && n51.f.a(this.f323558e, a3Var.f323558e) && n51.f.a(java.lang.Boolean.valueOf(this.f323559f), java.lang.Boolean.valueOf(a3Var.f323559f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323557d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323558e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f323559f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f323557d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f323558e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f323559f);
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
        m53.a3 a3Var = (m53.a3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a3Var.f323557d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            a3Var.f323558e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        a3Var.f323559f = aVar2.c(intValue);
        return 0;
    }
}
