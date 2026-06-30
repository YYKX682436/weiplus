package r45;

/* loaded from: classes2.dex */
public class ye4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391012d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391013e;

    /* renamed from: f, reason: collision with root package name */
    public int f391014f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ye4)) {
            return false;
        }
        r45.ye4 ye4Var = (r45.ye4) fVar;
        return n51.f.a(this.f391012d, ye4Var.f391012d) && n51.f.a(this.f391013e, ye4Var.f391013e) && n51.f.a(java.lang.Integer.valueOf(this.f391014f), java.lang.Integer.valueOf(ye4Var.f391014f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391012d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391013e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f391014f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f391012d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f391013e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f391014f);
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
        r45.ye4 ye4Var = (r45.ye4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ye4Var.f391012d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ye4Var.f391013e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        ye4Var.f391014f = aVar2.g(intValue);
        return 0;
    }
}
