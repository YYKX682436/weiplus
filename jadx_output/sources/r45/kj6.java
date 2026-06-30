package r45;

/* loaded from: classes4.dex */
public class kj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378767d;

    /* renamed from: e, reason: collision with root package name */
    public int f378768e;

    /* renamed from: f, reason: collision with root package name */
    public int f378769f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378770g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378771h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kj6)) {
            return false;
        }
        r45.kj6 kj6Var = (r45.kj6) fVar;
        return n51.f.a(this.f378767d, kj6Var.f378767d) && n51.f.a(java.lang.Integer.valueOf(this.f378768e), java.lang.Integer.valueOf(kj6Var.f378768e)) && n51.f.a(java.lang.Integer.valueOf(this.f378769f), java.lang.Integer.valueOf(kj6Var.f378769f)) && n51.f.a(this.f378770g, kj6Var.f378770g) && n51.f.a(this.f378771h, kj6Var.f378771h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378767d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f378768e);
            fVar.e(3, this.f378769f);
            java.lang.String str2 = this.f378770g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378771h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f378767d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f378768e) + b36.f.e(3, this.f378769f);
            java.lang.String str5 = this.f378770g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f378771h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.kj6 kj6Var = (r45.kj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kj6Var.f378767d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            kj6Var.f378768e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            kj6Var.f378769f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            kj6Var.f378770g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        kj6Var.f378771h = aVar2.k(intValue);
        return 0;
    }
}
