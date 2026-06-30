package r45;

/* loaded from: classes7.dex */
public class nv5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381693d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381694e;

    /* renamed from: f, reason: collision with root package name */
    public int f381695f;

    /* renamed from: g, reason: collision with root package name */
    public int f381696g;

    /* renamed from: h, reason: collision with root package name */
    public int f381697h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nv5)) {
            return false;
        }
        r45.nv5 nv5Var = (r45.nv5) fVar;
        return n51.f.a(this.f381693d, nv5Var.f381693d) && n51.f.a(this.f381694e, nv5Var.f381694e) && n51.f.a(java.lang.Integer.valueOf(this.f381695f), java.lang.Integer.valueOf(nv5Var.f381695f)) && n51.f.a(java.lang.Integer.valueOf(this.f381696g), java.lang.Integer.valueOf(nv5Var.f381696g)) && n51.f.a(java.lang.Integer.valueOf(this.f381697h), java.lang.Integer.valueOf(nv5Var.f381697h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381693d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381694e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f381695f);
            fVar.e(4, this.f381696g);
            fVar.e(5, this.f381697h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f381693d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f381694e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f381695f) + b36.f.e(4, this.f381696g) + b36.f.e(5, this.f381697h);
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
        r45.nv5 nv5Var = (r45.nv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nv5Var.f381693d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nv5Var.f381694e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nv5Var.f381695f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            nv5Var.f381696g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        nv5Var.f381697h = aVar2.g(intValue);
        return 0;
    }
}
