package r45;

/* loaded from: classes9.dex */
public class nq4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f381597d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381598e;

    /* renamed from: f, reason: collision with root package name */
    public long f381599f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381600g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381601h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nq4)) {
            return false;
        }
        r45.nq4 nq4Var = (r45.nq4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f381597d), java.lang.Long.valueOf(nq4Var.f381597d)) && n51.f.a(this.f381598e, nq4Var.f381598e) && n51.f.a(java.lang.Long.valueOf(this.f381599f), java.lang.Long.valueOf(nq4Var.f381599f)) && n51.f.a(this.f381600g, nq4Var.f381600g) && n51.f.a(this.f381601h, nq4Var.f381601h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f381597d);
            java.lang.String str = this.f381598e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f381599f);
            java.lang.String str2 = this.f381600g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381601h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f381597d) + 0;
            java.lang.String str4 = this.f381598e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            int h18 = h17 + b36.f.h(3, this.f381599f);
            java.lang.String str5 = this.f381600g;
            if (str5 != null) {
                h18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f381601h;
            return str6 != null ? h18 + b36.f.j(5, str6) : h18;
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
        r45.nq4 nq4Var = (r45.nq4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nq4Var.f381597d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            nq4Var.f381598e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nq4Var.f381599f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            nq4Var.f381600g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        nq4Var.f381601h = aVar2.k(intValue);
        return 0;
    }
}
