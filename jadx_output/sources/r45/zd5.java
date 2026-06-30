package r45;

/* loaded from: classes9.dex */
public class zd5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391937d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391938e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391939f;

    /* renamed from: g, reason: collision with root package name */
    public int f391940g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zd5)) {
            return false;
        }
        r45.zd5 zd5Var = (r45.zd5) fVar;
        return n51.f.a(this.f391937d, zd5Var.f391937d) && n51.f.a(this.f391938e, zd5Var.f391938e) && n51.f.a(this.f391939f, zd5Var.f391939f) && n51.f.a(java.lang.Integer.valueOf(this.f391940g), java.lang.Integer.valueOf(zd5Var.f391940g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391937d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391938e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391939f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f391940g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f391937d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f391938e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f391939f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f391940g);
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
        r45.zd5 zd5Var = (r45.zd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zd5Var.f391937d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zd5Var.f391938e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zd5Var.f391939f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        zd5Var.f391940g = aVar2.g(intValue);
        return 0;
    }
}
