package r45;

/* loaded from: classes2.dex */
public class j74 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377623d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377624e;

    /* renamed from: f, reason: collision with root package name */
    public long f377625f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377626g;

    /* renamed from: h, reason: collision with root package name */
    public int f377627h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377628i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j74)) {
            return false;
        }
        r45.j74 j74Var = (r45.j74) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377623d), java.lang.Integer.valueOf(j74Var.f377623d)) && n51.f.a(this.f377624e, j74Var.f377624e) && n51.f.a(java.lang.Long.valueOf(this.f377625f), java.lang.Long.valueOf(j74Var.f377625f)) && n51.f.a(this.f377626g, j74Var.f377626g) && n51.f.a(java.lang.Integer.valueOf(this.f377627h), java.lang.Integer.valueOf(j74Var.f377627h)) && n51.f.a(this.f377628i, j74Var.f377628i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377623d);
            java.lang.String str = this.f377624e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f377625f);
            java.lang.String str2 = this.f377626g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f377627h);
            java.lang.String str3 = this.f377628i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377623d) + 0;
            java.lang.String str4 = this.f377624e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int h17 = e17 + b36.f.h(3, this.f377625f);
            java.lang.String str5 = this.f377626g;
            if (str5 != null) {
                h17 += b36.f.j(4, str5);
            }
            int e18 = h17 + b36.f.e(5, this.f377627h);
            java.lang.String str6 = this.f377628i;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
        r45.j74 j74Var = (r45.j74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j74Var.f377623d = aVar2.g(intValue);
                return 0;
            case 2:
                j74Var.f377624e = aVar2.k(intValue);
                return 0;
            case 3:
                j74Var.f377625f = aVar2.i(intValue);
                return 0;
            case 4:
                j74Var.f377626g = aVar2.k(intValue);
                return 0;
            case 5:
                j74Var.f377627h = aVar2.g(intValue);
                return 0;
            case 6:
                j74Var.f377628i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
