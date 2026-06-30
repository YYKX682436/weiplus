package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class s0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219173d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219174e;

    /* renamed from: f, reason: collision with root package name */
    public int f219175f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219176g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219177h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219178i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f219179m;

    /* renamed from: n, reason: collision with root package name */
    public int f219180n;

    /* renamed from: o, reason: collision with root package name */
    public int f219181o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.q0 f219182p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.r0 f219183q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219184r;

    static {
        new com.tencent.wechat.mm.brand_service.s0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.s0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.s0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.s0)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.s0 s0Var = (com.tencent.wechat.mm.brand_service.s0) fVar;
        return n51.f.a(this.f219173d, s0Var.f219173d) && n51.f.a(this.f219174e, s0Var.f219174e) && n51.f.a(java.lang.Integer.valueOf(this.f219175f), java.lang.Integer.valueOf(s0Var.f219175f)) && n51.f.a(this.f219176g, s0Var.f219176g) && n51.f.a(this.f219177h, s0Var.f219177h) && n51.f.a(this.f219178i, s0Var.f219178i) && n51.f.a(this.f219179m, s0Var.f219179m) && n51.f.a(java.lang.Integer.valueOf(this.f219180n), java.lang.Integer.valueOf(s0Var.f219180n)) && n51.f.a(java.lang.Integer.valueOf(this.f219181o), java.lang.Integer.valueOf(s0Var.f219181o)) && n51.f.a(this.f219182p, s0Var.f219182p) && n51.f.a(this.f219183q, s0Var.f219183q) && n51.f.a(this.f219184r, s0Var.f219184r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.s0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219173d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219174e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f219175f);
            java.lang.String str3 = this.f219176g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f219177h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f219178i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f219179m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f219180n);
            fVar.e(9, this.f219181o);
            com.tencent.wechat.mm.brand_service.q0 q0Var = this.f219182p;
            if (q0Var != null) {
                fVar.i(10, q0Var.computeSize());
                this.f219182p.writeFields(fVar);
            }
            com.tencent.wechat.mm.brand_service.r0 r0Var = this.f219183q;
            if (r0Var != null) {
                fVar.i(11, r0Var.computeSize());
                this.f219183q.writeFields(fVar);
            }
            java.lang.String str7 = this.f219184r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f219173d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f219174e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f219175f);
            java.lang.String str10 = this.f219176g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f219177h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f219178i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f219179m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            int e18 = e17 + b36.f.e(8, this.f219180n) + b36.f.e(9, this.f219181o);
            com.tencent.wechat.mm.brand_service.q0 q0Var2 = this.f219182p;
            if (q0Var2 != null) {
                e18 += b36.f.i(10, q0Var2.computeSize());
            }
            com.tencent.wechat.mm.brand_service.r0 r0Var2 = this.f219183q;
            if (r0Var2 != null) {
                e18 += b36.f.i(11, r0Var2.computeSize());
            }
            java.lang.String str14 = this.f219184r;
            return str14 != null ? e18 + b36.f.j(12, str14) : e18;
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
                this.f219173d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f219174e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f219175f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f219176g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f219177h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f219178i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f219179m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f219180n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f219181o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.brand_service.q0 q0Var3 = new com.tencent.wechat.mm.brand_service.q0();
                    if (bArr != null && bArr.length > 0) {
                        q0Var3.parseFrom(bArr);
                    }
                    this.f219182p = q0Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.mm.brand_service.r0 r0Var3 = new com.tencent.wechat.mm.brand_service.r0();
                    if (bArr2 != null && bArr2.length > 0) {
                        r0Var3.parseFrom(bArr2);
                    }
                    this.f219183q = r0Var3;
                }
                return 0;
            case 12:
                this.f219184r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
