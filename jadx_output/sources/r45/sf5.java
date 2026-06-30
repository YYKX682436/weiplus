package r45;

/* loaded from: classes4.dex */
public class sf5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385684d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385685e;

    /* renamed from: f, reason: collision with root package name */
    public int f385686f;

    /* renamed from: g, reason: collision with root package name */
    public int f385687g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sf5)) {
            return false;
        }
        r45.sf5 sf5Var = (r45.sf5) fVar;
        return n51.f.a(this.f385684d, sf5Var.f385684d) && n51.f.a(this.f385685e, sf5Var.f385685e) && n51.f.a(java.lang.Integer.valueOf(this.f385686f), java.lang.Integer.valueOf(sf5Var.f385686f)) && n51.f.a(java.lang.Integer.valueOf(this.f385687g), java.lang.Integer.valueOf(sf5Var.f385687g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385684d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385685e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f385686f);
            fVar.e(4, this.f385687g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f385684d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f385685e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f385686f) + b36.f.e(4, this.f385687g);
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
        r45.sf5 sf5Var = (r45.sf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sf5Var.f385684d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            sf5Var.f385685e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            sf5Var.f385686f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        sf5Var.f385687g = aVar2.g(intValue);
        return 0;
    }
}
