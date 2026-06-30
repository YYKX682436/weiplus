package r45;

/* loaded from: classes8.dex */
public class e54 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373021d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373022e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373023f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f373024g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e54)) {
            return false;
        }
        r45.e54 e54Var = (r45.e54) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373021d), java.lang.Integer.valueOf(e54Var.f373021d)) && n51.f.a(this.f373022e, e54Var.f373022e) && n51.f.a(this.f373023f, e54Var.f373023f) && n51.f.a(java.lang.Boolean.valueOf(this.f373024g), java.lang.Boolean.valueOf(e54Var.f373024g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373021d);
            java.lang.String str = this.f373022e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373023f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f373024g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373021d) + 0;
            java.lang.String str3 = this.f373022e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f373023f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.a(4, this.f373024g);
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
        r45.e54 e54Var = (r45.e54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e54Var.f373021d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            e54Var.f373022e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            e54Var.f373023f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e54Var.f373024g = aVar2.c(intValue);
        return 0;
    }
}
