package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class m1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219047d;

    /* renamed from: e, reason: collision with root package name */
    public long f219048e;

    /* renamed from: f, reason: collision with root package name */
    public int f219049f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219050g;

    /* renamed from: h, reason: collision with root package name */
    public int f219051h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219052i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219053m;

    /* renamed from: n, reason: collision with root package name */
    public int f219054n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.y0 f219055o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.d1 f219056p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.h0 f219057q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.z0 f219058r;

    static {
        new com.tencent.wechat.mm.brand_service.m1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.m1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.m1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.m1)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.m1 m1Var = (com.tencent.wechat.mm.brand_service.m1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219047d), java.lang.Integer.valueOf(m1Var.f219047d)) && n51.f.a(java.lang.Long.valueOf(this.f219048e), java.lang.Long.valueOf(m1Var.f219048e)) && n51.f.a(java.lang.Integer.valueOf(this.f219049f), java.lang.Integer.valueOf(m1Var.f219049f)) && n51.f.a(this.f219050g, m1Var.f219050g) && n51.f.a(java.lang.Integer.valueOf(this.f219051h), java.lang.Integer.valueOf(m1Var.f219051h)) && n51.f.a(this.f219052i, m1Var.f219052i) && n51.f.a(this.f219053m, m1Var.f219053m) && n51.f.a(java.lang.Integer.valueOf(this.f219054n), java.lang.Integer.valueOf(m1Var.f219054n)) && n51.f.a(this.f219055o, m1Var.f219055o) && n51.f.a(this.f219056p, m1Var.f219056p) && n51.f.a(this.f219057q, m1Var.f219057q) && n51.f.a(this.f219058r, m1Var.f219058r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.m1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f219047d);
            fVar.h(2, this.f219048e);
            fVar.e(3, this.f219049f);
            java.lang.String str = this.f219050g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f219051h);
            java.lang.String str2 = this.f219052i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f219053m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(31, this.f219054n);
            com.tencent.wechat.mm.brand_service.y0 y0Var = this.f219055o;
            if (y0Var != null) {
                fVar.i(32, y0Var.computeSize());
                this.f219055o.writeFields(fVar);
            }
            com.tencent.wechat.mm.brand_service.d1 d1Var = this.f219056p;
            if (d1Var != null) {
                fVar.i(61, d1Var.computeSize());
                this.f219056p.writeFields(fVar);
            }
            com.tencent.wechat.mm.brand_service.h0 h0Var = this.f219057q;
            if (h0Var != null) {
                fVar.i(62, h0Var.computeSize());
                this.f219057q.writeFields(fVar);
            }
            com.tencent.wechat.mm.brand_service.z0 z0Var = this.f219058r;
            if (z0Var == null) {
                return 0;
            }
            fVar.i(91, z0Var.computeSize());
            this.f219058r.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f219047d) + 0 + b36.f.h(2, this.f219048e) + b36.f.e(3, this.f219049f);
            java.lang.String str3 = this.f219050g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f219051h);
            java.lang.String str4 = this.f219052i;
            if (str4 != null) {
                e18 += b36.f.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f219053m;
            if (gVar2 != null) {
                e18 += b36.f.b(7, gVar2);
            }
            int e19 = e18 + b36.f.e(31, this.f219054n);
            com.tencent.wechat.mm.brand_service.y0 y0Var2 = this.f219055o;
            if (y0Var2 != null) {
                e19 += b36.f.i(32, y0Var2.computeSize());
            }
            com.tencent.wechat.mm.brand_service.d1 d1Var2 = this.f219056p;
            if (d1Var2 != null) {
                e19 += b36.f.i(61, d1Var2.computeSize());
            }
            com.tencent.wechat.mm.brand_service.h0 h0Var2 = this.f219057q;
            if (h0Var2 != null) {
                e19 += b36.f.i(62, h0Var2.computeSize());
            }
            com.tencent.wechat.mm.brand_service.z0 z0Var2 = this.f219058r;
            return z0Var2 != null ? e19 + b36.f.i(91, z0Var2.computeSize()) : e19;
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
        if (intValue == 31) {
            this.f219054n = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 32) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.brand_service.y0 y0Var3 = new com.tencent.wechat.mm.brand_service.y0();
                if (bArr != null && bArr.length > 0) {
                    y0Var3.parseFrom(bArr);
                }
                this.f219055o = y0Var3;
            }
            return 0;
        }
        if (intValue == 61) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.mm.brand_service.d1 d1Var3 = new com.tencent.wechat.mm.brand_service.d1();
                if (bArr2 != null && bArr2.length > 0) {
                    d1Var3.parseFrom(bArr2);
                }
                this.f219056p = d1Var3;
            }
            return 0;
        }
        if (intValue == 62) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                com.tencent.wechat.mm.brand_service.h0 h0Var3 = new com.tencent.wechat.mm.brand_service.h0();
                if (bArr3 != null && bArr3.length > 0) {
                    h0Var3.parseFrom(bArr3);
                }
                this.f219057q = h0Var3;
            }
            return 0;
        }
        if (intValue == 91) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                com.tencent.wechat.mm.brand_service.z0 z0Var3 = new com.tencent.wechat.mm.brand_service.z0();
                if (bArr4 != null && bArr4.length > 0) {
                    z0Var3.parseFrom(bArr4);
                }
                this.f219058r = z0Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f219047d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f219048e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f219049f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f219050g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f219051h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f219052i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f219053m = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
