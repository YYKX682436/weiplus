package r45;

/* loaded from: classes9.dex */
public class g0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374759d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374760e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374761f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374762g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374763h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g0)) {
            return false;
        }
        r45.g0 g0Var = (r45.g0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374759d), java.lang.Integer.valueOf(g0Var.f374759d)) && n51.f.a(this.f374760e, g0Var.f374760e) && n51.f.a(this.f374761f, g0Var.f374761f) && n51.f.a(this.f374762g, g0Var.f374762g) && n51.f.a(this.f374763h, g0Var.f374763h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374759d);
            java.lang.String str = this.f374760e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374761f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374762g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f374763h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374759d) + 0;
            java.lang.String str5 = this.f374760e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f374761f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f374762g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f374763h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.g0 g0Var = (r45.g0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g0Var.f374759d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            g0Var.f374760e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            g0Var.f374761f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            g0Var.f374762g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        g0Var.f374763h = aVar2.k(intValue);
        return 0;
    }
}
