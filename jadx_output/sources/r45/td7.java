package r45;

/* loaded from: classes7.dex */
public class td7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386332d;

    /* renamed from: e, reason: collision with root package name */
    public int f386333e;

    /* renamed from: f, reason: collision with root package name */
    public int f386334f;

    /* renamed from: g, reason: collision with root package name */
    public int f386335g;

    /* renamed from: h, reason: collision with root package name */
    public int f386336h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386337i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.td7)) {
            return false;
        }
        r45.td7 td7Var = (r45.td7) fVar;
        return n51.f.a(this.f386332d, td7Var.f386332d) && n51.f.a(java.lang.Integer.valueOf(this.f386333e), java.lang.Integer.valueOf(td7Var.f386333e)) && n51.f.a(java.lang.Integer.valueOf(this.f386334f), java.lang.Integer.valueOf(td7Var.f386334f)) && n51.f.a(java.lang.Integer.valueOf(this.f386335g), java.lang.Integer.valueOf(td7Var.f386335g)) && n51.f.a(java.lang.Integer.valueOf(this.f386336h), java.lang.Integer.valueOf(td7Var.f386336h)) && n51.f.a(this.f386337i, td7Var.f386337i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386332d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f386333e);
            fVar.e(3, this.f386334f);
            fVar.e(4, this.f386335g);
            fVar.e(5, this.f386336h);
            java.lang.String str2 = this.f386337i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f386332d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f386333e) + b36.f.e(3, this.f386334f) + b36.f.e(4, this.f386335g) + b36.f.e(5, this.f386336h);
            java.lang.String str4 = this.f386337i;
            return str4 != null ? j17 + b36.f.j(6, str4) : j17;
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
        r45.td7 td7Var = (r45.td7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                td7Var.f386332d = aVar2.k(intValue);
                return 0;
            case 2:
                td7Var.f386333e = aVar2.g(intValue);
                return 0;
            case 3:
                td7Var.f386334f = aVar2.g(intValue);
                return 0;
            case 4:
                td7Var.f386335g = aVar2.g(intValue);
                return 0;
            case 5:
                td7Var.f386336h = aVar2.g(intValue);
                return 0;
            case 6:
                td7Var.f386337i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
