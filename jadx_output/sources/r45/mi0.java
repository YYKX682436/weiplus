package r45;

/* loaded from: classes7.dex */
public class mi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380534d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380535e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380536f;

    /* renamed from: g, reason: collision with root package name */
    public int f380537g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380538h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mi0)) {
            return false;
        }
        r45.mi0 mi0Var = (r45.mi0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380534d), java.lang.Integer.valueOf(mi0Var.f380534d)) && n51.f.a(this.f380535e, mi0Var.f380535e) && n51.f.a(this.f380536f, mi0Var.f380536f) && n51.f.a(java.lang.Integer.valueOf(this.f380537g), java.lang.Integer.valueOf(mi0Var.f380537g)) && n51.f.a(this.f380538h, mi0Var.f380538h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380534d);
            java.lang.String str = this.f380535e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380536f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f380537g);
            java.lang.String str3 = this.f380538h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380534d) + 0;
            java.lang.String str4 = this.f380535e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f380536f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f380537g);
            java.lang.String str6 = this.f380538h;
            return str6 != null ? e18 + b36.f.j(5, str6) : e18;
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
        r45.mi0 mi0Var = (r45.mi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mi0Var.f380534d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mi0Var.f380535e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            mi0Var.f380536f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            mi0Var.f380537g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        mi0Var.f380538h = aVar2.k(intValue);
        return 0;
    }
}
