package r45;

/* loaded from: classes8.dex */
public class xh6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390111d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390112e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390113f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xh6)) {
            return false;
        }
        r45.xh6 xh6Var = (r45.xh6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390111d), java.lang.Integer.valueOf(xh6Var.f390111d)) && n51.f.a(this.f390112e, xh6Var.f390112e) && n51.f.a(this.f390113f, xh6Var.f390113f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390111d);
            java.lang.String str = this.f390112e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f390113f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390111d) + 0;
            java.lang.String str3 = this.f390112e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f390113f;
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
        r45.xh6 xh6Var = (r45.xh6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xh6Var.f390111d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xh6Var.f390112e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xh6Var.f390113f = aVar2.k(intValue);
        return 0;
    }
}
