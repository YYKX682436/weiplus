package r45;

/* loaded from: classes2.dex */
public class ce5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371505d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371506e;

    /* renamed from: f, reason: collision with root package name */
    public int f371507f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371508g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371509h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ce5)) {
            return false;
        }
        r45.ce5 ce5Var = (r45.ce5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371505d), java.lang.Integer.valueOf(ce5Var.f371505d)) && n51.f.a(this.f371506e, ce5Var.f371506e) && n51.f.a(java.lang.Integer.valueOf(this.f371507f), java.lang.Integer.valueOf(ce5Var.f371507f)) && n51.f.a(this.f371508g, ce5Var.f371508g) && n51.f.a(this.f371509h, ce5Var.f371509h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371505d);
            java.lang.String str = this.f371506e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f371507f);
            java.lang.String str2 = this.f371508g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371509h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371505d) + 0;
            java.lang.String str4 = this.f371506e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f371507f);
            java.lang.String str5 = this.f371508g;
            if (str5 != null) {
                e18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f371509h;
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
        r45.ce5 ce5Var = (r45.ce5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ce5Var.f371505d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ce5Var.f371506e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ce5Var.f371507f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ce5Var.f371508g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ce5Var.f371509h = aVar2.k(intValue);
        return 0;
    }
}
