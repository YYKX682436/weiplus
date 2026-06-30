package r45;

/* loaded from: classes4.dex */
public class hy6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376557d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376558e;

    /* renamed from: f, reason: collision with root package name */
    public int f376559f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376560g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376561h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hy6)) {
            return false;
        }
        r45.hy6 hy6Var = (r45.hy6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376557d), java.lang.Integer.valueOf(hy6Var.f376557d)) && n51.f.a(this.f376558e, hy6Var.f376558e) && n51.f.a(java.lang.Integer.valueOf(this.f376559f), java.lang.Integer.valueOf(hy6Var.f376559f)) && n51.f.a(this.f376560g, hy6Var.f376560g) && n51.f.a(this.f376561h, hy6Var.f376561h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376557d);
            java.lang.String str = this.f376558e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f376559f);
            java.lang.String str2 = this.f376560g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f376561h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376557d) + 0;
            java.lang.String str4 = this.f376558e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f376559f);
            java.lang.String str5 = this.f376560g;
            if (str5 != null) {
                e18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f376561h;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
        r45.hy6 hy6Var = (r45.hy6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hy6Var.f376557d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hy6Var.f376558e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hy6Var.f376559f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            hy6Var.f376560g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        hy6Var.f376561h = aVar2.k(intValue);
        return 0;
    }
}
