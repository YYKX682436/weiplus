package r45;

/* loaded from: classes8.dex */
public class ep4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373654d;

    /* renamed from: e, reason: collision with root package name */
    public int f373655e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373656f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373657g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373658h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373659i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ep4)) {
            return false;
        }
        r45.ep4 ep4Var = (r45.ep4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373654d), java.lang.Integer.valueOf(ep4Var.f373654d)) && n51.f.a(java.lang.Integer.valueOf(this.f373655e), java.lang.Integer.valueOf(ep4Var.f373655e)) && n51.f.a(this.f373656f, ep4Var.f373656f) && n51.f.a(this.f373657g, ep4Var.f373657g) && n51.f.a(this.f373658h, ep4Var.f373658h) && n51.f.a(this.f373659i, ep4Var.f373659i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373654d);
            fVar.e(2, this.f373655e);
            com.tencent.mm.protobuf.g gVar = this.f373656f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f373657g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f373658h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f373659i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373654d) + 0 + b36.f.e(2, this.f373655e);
            com.tencent.mm.protobuf.g gVar2 = this.f373656f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f373657g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f373658h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f373659i;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.ep4 ep4Var = (r45.ep4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ep4Var.f373654d = aVar2.g(intValue);
                return 0;
            case 2:
                ep4Var.f373655e = aVar2.g(intValue);
                return 0;
            case 3:
                ep4Var.f373656f = aVar2.d(intValue);
                return 0;
            case 4:
                ep4Var.f373657g = aVar2.k(intValue);
                return 0;
            case 5:
                ep4Var.f373658h = aVar2.k(intValue);
                return 0;
            case 6:
                ep4Var.f373659i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
