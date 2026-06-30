package r45;

/* loaded from: classes4.dex */
public class ls5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379803d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379804e;

    /* renamed from: f, reason: collision with root package name */
    public int f379805f;

    /* renamed from: g, reason: collision with root package name */
    public int f379806g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379807h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ls5)) {
            return false;
        }
        r45.ls5 ls5Var = (r45.ls5) fVar;
        return n51.f.a(this.f379803d, ls5Var.f379803d) && n51.f.a(this.f379804e, ls5Var.f379804e) && n51.f.a(java.lang.Integer.valueOf(this.f379805f), java.lang.Integer.valueOf(ls5Var.f379805f)) && n51.f.a(java.lang.Integer.valueOf(this.f379806g), java.lang.Integer.valueOf(ls5Var.f379806g)) && n51.f.a(this.f379807h, ls5Var.f379807h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379803d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379804e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f379805f);
            fVar.e(4, this.f379806g);
            com.tencent.mm.protobuf.g gVar = this.f379807h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f379803d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f379804e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int e17 = j17 + b36.f.e(3, this.f379805f) + b36.f.e(4, this.f379806g);
            com.tencent.mm.protobuf.g gVar2 = this.f379807h;
            return gVar2 != null ? e17 + b36.f.b(5, gVar2) : e17;
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
        r45.ls5 ls5Var = (r45.ls5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ls5Var.f379803d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ls5Var.f379804e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ls5Var.f379805f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ls5Var.f379806g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ls5Var.f379807h = aVar2.d(intValue);
        return 0;
    }
}
