package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class q0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f215956d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f215957e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f215958f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f215959g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f215960h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f215961i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f215962m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f215963n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f215964o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f215965p = 0;

    static {
        new com.tencent.wechat.aff.affroam.q0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.q0)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.q0 q0Var = (com.tencent.wechat.aff.affroam.q0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f215956d), java.lang.Integer.valueOf(q0Var.f215956d)) && n51.f.a(this.f215957e, q0Var.f215957e) && n51.f.a(this.f215958f, q0Var.f215958f) && n51.f.a(this.f215959g, q0Var.f215959g) && n51.f.a(this.f215960h, q0Var.f215960h) && n51.f.a(this.f215961i, q0Var.f215961i) && n51.f.a(this.f215962m, q0Var.f215962m) && n51.f.a(java.lang.Boolean.valueOf(this.f215963n), java.lang.Boolean.valueOf(q0Var.f215963n)) && n51.f.a(java.lang.Boolean.valueOf(this.f215964o), java.lang.Boolean.valueOf(q0Var.f215964o)) && n51.f.a(java.lang.Integer.valueOf(this.f215965p), java.lang.Integer.valueOf(q0Var.f215965p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.q0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f215956d);
            java.lang.String str = this.f215957e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f215958f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f215959g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f215960h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f215961i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f215962m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.a(8, this.f215963n);
            fVar.a(9, this.f215964o);
            fVar.e(10, this.f215965p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f215956d) + 0;
            java.lang.String str7 = this.f215957e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f215958f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f215959g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f215960h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f215961i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f215962m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            return e17 + b36.f.a(8, this.f215963n) + b36.f.a(9, this.f215964o) + b36.f.e(10, this.f215965p);
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
                this.f215956d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f215957e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f215958f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f215959g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f215960h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f215961i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f215962m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f215963n = aVar2.c(intValue);
                return 0;
            case 9:
                this.f215964o = aVar2.c(intValue);
                return 0;
            case 10:
                this.f215965p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.q0) super.parseFrom(bArr);
    }
}
