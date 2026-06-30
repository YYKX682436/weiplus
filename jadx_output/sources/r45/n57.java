package r45;

/* loaded from: classes2.dex */
public class n57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381095d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381096e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381097f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381098g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381099h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n57)) {
            return false;
        }
        r45.n57 n57Var = (r45.n57) fVar;
        return n51.f.a(this.f381095d, n57Var.f381095d) && n51.f.a(this.f381096e, n57Var.f381096e) && n51.f.a(this.f381097f, n57Var.f381097f) && n51.f.a(this.f381098g, n57Var.f381098g) && n51.f.a(this.f381099h, n57Var.f381099h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381095d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381096e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381097f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f381098g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f381099h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f381095d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f381096e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f381097f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f381098g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f381099h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        r45.n57 n57Var = (r45.n57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n57Var.f381095d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            n57Var.f381096e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            n57Var.f381097f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            n57Var.f381098g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        n57Var.f381099h = aVar2.k(intValue);
        return 0;
    }
}
