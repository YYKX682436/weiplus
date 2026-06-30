package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218867d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f218868e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f218869f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218870g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f218871h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f218872i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f218873m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f218874n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218875o = "";

    /* renamed from: p, reason: collision with root package name */
    public long f218876p = 0;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.j f218877q = new com.tencent.wechat.mm.brand_service.j();

    static {
        new com.tencent.wechat.mm.brand_service.d();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.d parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.d) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.d)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.d dVar = (com.tencent.wechat.mm.brand_service.d) fVar;
        return n51.f.a(this.f218867d, dVar.f218867d) && n51.f.a(java.lang.Boolean.valueOf(this.f218868e), java.lang.Boolean.valueOf(dVar.f218868e)) && n51.f.a(java.lang.Boolean.valueOf(this.f218869f), java.lang.Boolean.valueOf(dVar.f218869f)) && n51.f.a(this.f218870g, dVar.f218870g) && n51.f.a(java.lang.Long.valueOf(this.f218871h), java.lang.Long.valueOf(dVar.f218871h)) && n51.f.a(java.lang.Integer.valueOf(this.f218872i), java.lang.Integer.valueOf(dVar.f218872i)) && n51.f.a(java.lang.Integer.valueOf(this.f218873m), java.lang.Integer.valueOf(dVar.f218873m)) && n51.f.a(java.lang.Boolean.valueOf(this.f218874n), java.lang.Boolean.valueOf(dVar.f218874n)) && n51.f.a(this.f218875o, dVar.f218875o) && n51.f.a(java.lang.Long.valueOf(this.f218876p), java.lang.Long.valueOf(dVar.f218876p)) && n51.f.a(this.f218877q, dVar.f218877q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.d();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218867d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f218868e);
            fVar.a(3, this.f218869f);
            java.lang.String str2 = this.f218870g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f218871h);
            fVar.e(6, this.f218872i);
            fVar.e(7, this.f218873m);
            fVar.a(8, this.f218874n);
            java.lang.String str3 = this.f218875o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.h(10, this.f218876p);
            com.tencent.wechat.mm.brand_service.j jVar = this.f218877q;
            if (jVar != null) {
                fVar.i(11, jVar.computeSize());
                this.f218877q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f218867d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.a(2, this.f218868e) + b36.f.a(3, this.f218869f);
            java.lang.String str5 = this.f218870g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            int h17 = j17 + b36.f.h(5, this.f218871h) + b36.f.e(6, this.f218872i) + b36.f.e(7, this.f218873m) + b36.f.a(8, this.f218874n);
            java.lang.String str6 = this.f218875o;
            if (str6 != null) {
                h17 += b36.f.j(9, str6);
            }
            int h18 = h17 + b36.f.h(10, this.f218876p);
            com.tencent.wechat.mm.brand_service.j jVar2 = this.f218877q;
            return jVar2 != null ? h18 + b36.f.i(11, jVar2.computeSize()) : h18;
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
                this.f218867d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f218868e = aVar2.c(intValue);
                return 0;
            case 3:
                this.f218869f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f218870g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f218871h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f218872i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f218873m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f218874n = aVar2.c(intValue);
                return 0;
            case 9:
                this.f218875o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f218876p = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.brand_service.j jVar3 = new com.tencent.wechat.mm.brand_service.j();
                    if (bArr != null && bArr.length > 0) {
                        jVar3.parseFrom(bArr);
                    }
                    this.f218877q = jVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
