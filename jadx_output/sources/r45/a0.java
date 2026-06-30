package r45;

/* loaded from: classes9.dex */
public class a0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369572d;

    /* renamed from: e, reason: collision with root package name */
    public long f369573e;

    /* renamed from: f, reason: collision with root package name */
    public long f369574f;

    /* renamed from: g, reason: collision with root package name */
    public int f369575g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369576h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369577i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a0)) {
            return false;
        }
        r45.a0 a0Var = (r45.a0) fVar;
        return n51.f.a(this.f369572d, a0Var.f369572d) && n51.f.a(java.lang.Long.valueOf(this.f369573e), java.lang.Long.valueOf(a0Var.f369573e)) && n51.f.a(java.lang.Long.valueOf(this.f369574f), java.lang.Long.valueOf(a0Var.f369574f)) && n51.f.a(java.lang.Integer.valueOf(this.f369575g), java.lang.Integer.valueOf(a0Var.f369575g)) && n51.f.a(this.f369576h, a0Var.f369576h) && n51.f.a(this.f369577i, a0Var.f369577i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369572d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f369573e);
            fVar.h(3, this.f369574f);
            fVar.e(4, this.f369575g);
            java.lang.String str2 = this.f369576h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f369577i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f369572d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f369573e) + b36.f.h(3, this.f369574f) + b36.f.e(4, this.f369575g);
            java.lang.String str5 = this.f369576h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f369577i;
            return str6 != null ? j17 + b36.f.j(6, str6) : j17;
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
        r45.a0 a0Var = (r45.a0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a0Var.f369572d = aVar2.k(intValue);
                return 0;
            case 2:
                a0Var.f369573e = aVar2.i(intValue);
                return 0;
            case 3:
                a0Var.f369574f = aVar2.i(intValue);
                return 0;
            case 4:
                a0Var.f369575g = aVar2.g(intValue);
                return 0;
            case 5:
                a0Var.f369576h = aVar2.k(intValue);
                return 0;
            case 6:
                a0Var.f369577i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
