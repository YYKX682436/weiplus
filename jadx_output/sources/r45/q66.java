package r45;

/* loaded from: classes4.dex */
public class q66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383711d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383712e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383713f;

    /* renamed from: g, reason: collision with root package name */
    public int f383714g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q66)) {
            return false;
        }
        r45.q66 q66Var = (r45.q66) fVar;
        return n51.f.a(this.f383711d, q66Var.f383711d) && n51.f.a(this.f383712e, q66Var.f383712e) && n51.f.a(this.f383713f, q66Var.f383713f) && n51.f.a(java.lang.Integer.valueOf(this.f383714g), java.lang.Integer.valueOf(q66Var.f383714g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383711d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383712e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383713f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f383714g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f383711d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f383712e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f383713f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f383714g);
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
        r45.q66 q66Var = (r45.q66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q66Var.f383711d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            q66Var.f383712e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            q66Var.f383713f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        q66Var.f383714g = aVar2.g(intValue);
        return 0;
    }
}
