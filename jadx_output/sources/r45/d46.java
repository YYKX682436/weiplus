package r45;

/* loaded from: classes9.dex */
public class d46 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372109d;

    /* renamed from: e, reason: collision with root package name */
    public int f372110e;

    /* renamed from: f, reason: collision with root package name */
    public int f372111f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372112g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372113h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d46)) {
            return false;
        }
        r45.d46 d46Var = (r45.d46) fVar;
        return n51.f.a(this.f372109d, d46Var.f372109d) && n51.f.a(java.lang.Integer.valueOf(this.f372110e), java.lang.Integer.valueOf(d46Var.f372110e)) && n51.f.a(java.lang.Integer.valueOf(this.f372111f), java.lang.Integer.valueOf(d46Var.f372111f)) && n51.f.a(this.f372112g, d46Var.f372112g) && n51.f.a(this.f372113h, d46Var.f372113h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372109d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f372110e);
            fVar.e(3, this.f372111f);
            java.lang.String str2 = this.f372112g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f372113h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f372109d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f372110e) + b36.f.e(3, this.f372111f);
            java.lang.String str5 = this.f372112g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f372113h;
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
        r45.d46 d46Var = (r45.d46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            d46Var.f372109d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            d46Var.f372110e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            d46Var.f372111f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            d46Var.f372112g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        d46Var.f372113h = aVar2.k(intValue);
        return 0;
    }
}
