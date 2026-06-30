package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class m0 extends com.tencent.mm.protobuf.f {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.m0 f215901r = new com.tencent.wechat.aff.affroam.m0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f215902d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f215903e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f215904f = "";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.n0 f215905g = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_INITED;

    /* renamed from: h, reason: collision with root package name */
    public long f215906h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f215907i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f215908m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f215909n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f215910o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.o0 f215911p = com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_UNKNOWN;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f215912q = com.tencent.mm.protobuf.g.f192155b;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.m0)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.m0 m0Var = (com.tencent.wechat.aff.affroam.m0) fVar;
        return n51.f.a(this.f215902d, m0Var.f215902d) && n51.f.a(java.lang.Long.valueOf(this.f215903e), java.lang.Long.valueOf(m0Var.f215903e)) && n51.f.a(this.f215904f, m0Var.f215904f) && n51.f.a(this.f215905g, m0Var.f215905g) && n51.f.a(java.lang.Long.valueOf(this.f215906h), java.lang.Long.valueOf(m0Var.f215906h)) && n51.f.a(java.lang.Long.valueOf(this.f215907i), java.lang.Long.valueOf(m0Var.f215907i)) && n51.f.a(java.lang.Long.valueOf(this.f215908m), java.lang.Long.valueOf(m0Var.f215908m)) && n51.f.a(java.lang.Long.valueOf(this.f215909n), java.lang.Long.valueOf(m0Var.f215909n)) && n51.f.a(java.lang.Long.valueOf(this.f215910o), java.lang.Long.valueOf(m0Var.f215910o)) && n51.f.a(this.f215911p, m0Var.f215911p) && n51.f.a(this.f215912q, m0Var.f215912q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.m0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f215902d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f215903e);
            java.lang.String str2 = this.f215904f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.wechat.aff.affroam.n0 n0Var = this.f215905g;
            if (n0Var != null) {
                fVar.e(4, n0Var.f215928d);
            }
            fVar.h(5, this.f215906h);
            fVar.h(6, this.f215907i);
            fVar.h(7, this.f215908m);
            fVar.h(8, this.f215909n);
            fVar.h(9, this.f215910o);
            com.tencent.wechat.aff.affroam.o0 o0Var = this.f215911p;
            if (o0Var != null) {
                fVar.e(10, o0Var.f215937d);
            }
            com.tencent.mm.protobuf.g gVar = this.f215912q;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f215902d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f215903e);
            java.lang.String str4 = this.f215904f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            com.tencent.wechat.aff.affroam.n0 n0Var2 = this.f215905g;
            if (n0Var2 != null) {
                j17 += b36.f.e(4, n0Var2.f215928d);
            }
            int h17 = j17 + b36.f.h(5, this.f215906h) + b36.f.h(6, this.f215907i) + b36.f.h(7, this.f215908m) + b36.f.h(8, this.f215909n) + b36.f.h(9, this.f215910o);
            com.tencent.wechat.aff.affroam.o0 o0Var2 = this.f215911p;
            if (o0Var2 != null) {
                h17 += b36.f.e(10, o0Var2.f215937d);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f215912q;
            return gVar2 != null ? h17 + b36.f.b(11, gVar2) : h17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f215902d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f215903e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f215904f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f215905g = com.tencent.wechat.aff.affroam.n0.a(aVar2.g(intValue));
                return 0;
            case 5:
                this.f215906h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f215907i = aVar2.i(intValue);
                return 0;
            case 7:
                this.f215908m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f215909n = aVar2.i(intValue);
                return 0;
            case 9:
                this.f215910o = aVar2.i(intValue);
                return 0;
            case 10:
                this.f215911p = com.tencent.wechat.aff.affroam.o0.a(aVar2.g(intValue));
                return 0;
            case 11:
                this.f215912q = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.m0) super.parseFrom(bArr);
    }
}
