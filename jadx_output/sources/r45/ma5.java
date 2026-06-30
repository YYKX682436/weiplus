package r45;

/* loaded from: classes8.dex */
public class ma5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380306d;

    /* renamed from: e, reason: collision with root package name */
    public int f380307e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380308f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380309g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380310h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ma5)) {
            return false;
        }
        r45.ma5 ma5Var = (r45.ma5) fVar;
        return n51.f.a(this.f380306d, ma5Var.f380306d) && n51.f.a(java.lang.Integer.valueOf(this.f380307e), java.lang.Integer.valueOf(ma5Var.f380307e)) && n51.f.a(this.f380308f, ma5Var.f380308f) && n51.f.a(this.f380309g, ma5Var.f380309g) && n51.f.a(this.f380310h, ma5Var.f380310h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380306d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f380307e);
            java.lang.String str2 = this.f380308f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f380309g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f380310h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f380306d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f380307e);
            java.lang.String str6 = this.f380308f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f380309g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f380310h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.ma5 ma5Var = (r45.ma5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ma5Var.f380306d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ma5Var.f380307e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ma5Var.f380308f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ma5Var.f380309g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ma5Var.f380310h = aVar2.k(intValue);
        return 0;
    }
}
