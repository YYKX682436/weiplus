package r45;

/* loaded from: classes8.dex */
public class yo0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391251d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391252e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391253f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391254g;

    /* renamed from: h, reason: collision with root package name */
    public int f391255h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yo0)) {
            return false;
        }
        r45.yo0 yo0Var = (r45.yo0) fVar;
        return n51.f.a(this.f391251d, yo0Var.f391251d) && n51.f.a(this.f391252e, yo0Var.f391252e) && n51.f.a(this.f391253f, yo0Var.f391253f) && n51.f.a(this.f391254g, yo0Var.f391254g) && n51.f.a(java.lang.Integer.valueOf(this.f391255h), java.lang.Integer.valueOf(yo0Var.f391255h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391251d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391252e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391253f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f391254g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f391255h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f391251d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f391252e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f391253f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f391254g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f391255h);
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
        r45.yo0 yo0Var = (r45.yo0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yo0Var.f391251d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yo0Var.f391252e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yo0Var.f391253f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            yo0Var.f391254g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yo0Var.f391255h = aVar2.g(intValue);
        return 0;
    }
}
