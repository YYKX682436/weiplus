package r45;

/* loaded from: classes9.dex */
public class zd4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391932d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391933e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391934f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391935g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391936h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zd4)) {
            return false;
        }
        r45.zd4 zd4Var = (r45.zd4) fVar;
        return n51.f.a(this.f391932d, zd4Var.f391932d) && n51.f.a(this.f391933e, zd4Var.f391933e) && n51.f.a(this.f391934f, zd4Var.f391934f) && n51.f.a(this.f391935g, zd4Var.f391935g) && n51.f.a(this.f391936h, zd4Var.f391936h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391932d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391933e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391934f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f391935g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str4 = this.f391936h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f391932d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f391933e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f391934f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f391935g;
            if (gVar2 != null) {
                j17 += b36.f.b(4, gVar2);
            }
            java.lang.String str8 = this.f391936h;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.zd4 zd4Var = (r45.zd4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zd4Var.f391932d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zd4Var.f391933e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zd4Var.f391934f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            zd4Var.f391935g = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        zd4Var.f391936h = aVar2.k(intValue);
        return 0;
    }
}
