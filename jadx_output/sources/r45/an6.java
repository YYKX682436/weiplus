package r45;

/* loaded from: classes9.dex */
public class an6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370156d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370157e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370158f;

    /* renamed from: g, reason: collision with root package name */
    public int f370159g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370160h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.an6)) {
            return false;
        }
        r45.an6 an6Var = (r45.an6) fVar;
        return n51.f.a(this.f370156d, an6Var.f370156d) && n51.f.a(this.f370157e, an6Var.f370157e) && n51.f.a(this.f370158f, an6Var.f370158f) && n51.f.a(java.lang.Integer.valueOf(this.f370159g), java.lang.Integer.valueOf(an6Var.f370159g)) && n51.f.a(this.f370160h, an6Var.f370160h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370156d;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f370157e;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f370158f;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f370159g);
            java.lang.String str4 = this.f370160h;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f370156d;
            int j17 = str5 != null ? 0 + b36.f.j(4, str5) : 0;
            java.lang.String str6 = this.f370157e;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f370158f;
            if (str7 != null) {
                j17 += b36.f.j(6, str7);
            }
            int e17 = j17 + b36.f.e(7, this.f370159g);
            java.lang.String str8 = this.f370160h;
            return str8 != null ? e17 + b36.f.j(8, str8) : e17;
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
        r45.an6 an6Var = (r45.an6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 4:
                an6Var.f370156d = aVar2.k(intValue);
                return 0;
            case 5:
                an6Var.f370157e = aVar2.k(intValue);
                return 0;
            case 6:
                an6Var.f370158f = aVar2.k(intValue);
                return 0;
            case 7:
                an6Var.f370159g = aVar2.g(intValue);
                return 0;
            case 8:
                an6Var.f370160h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
