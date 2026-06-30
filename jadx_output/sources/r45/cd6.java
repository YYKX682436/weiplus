package r45;

/* loaded from: classes2.dex */
public class cd6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371487e;

    /* renamed from: f, reason: collision with root package name */
    public int f371488f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f371489g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f371490h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cd6)) {
            return false;
        }
        r45.cd6 cd6Var = (r45.cd6) fVar;
        return n51.f.a(this.f371486d, cd6Var.f371486d) && n51.f.a(this.f371487e, cd6Var.f371487e) && n51.f.a(java.lang.Integer.valueOf(this.f371488f), java.lang.Integer.valueOf(cd6Var.f371488f)) && n51.f.a(java.lang.Boolean.valueOf(this.f371489g), java.lang.Boolean.valueOf(cd6Var.f371489g)) && n51.f.a(java.lang.Boolean.valueOf(this.f371490h), java.lang.Boolean.valueOf(cd6Var.f371490h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371486d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371487e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f371488f);
            fVar.a(4, this.f371489g);
            fVar.a(5, this.f371490h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f371486d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f371487e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f371488f) + b36.f.a(4, this.f371489g) + b36.f.a(5, this.f371490h);
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
        r45.cd6 cd6Var = (r45.cd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cd6Var.f371486d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            cd6Var.f371487e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            cd6Var.f371488f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            cd6Var.f371489g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        cd6Var.f371490h = aVar2.c(intValue);
        return 0;
    }
}
