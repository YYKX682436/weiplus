package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217297d;

    /* renamed from: e, reason: collision with root package name */
    public long f217298e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217299f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217300g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f217301h;

    /* renamed from: i, reason: collision with root package name */
    public int f217302i;

    /* renamed from: m, reason: collision with root package name */
    public int f217303m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f217304n = new boolean[8];

    static {
        new com.tencent.wechat.aff.ilink_stream.t();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.ilink_stream.t parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.t) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.t)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.t tVar = (com.tencent.wechat.aff.ilink_stream.t) fVar;
        return n51.f.a(this.f217297d, tVar.f217297d) && n51.f.a(java.lang.Long.valueOf(this.f217298e), java.lang.Long.valueOf(tVar.f217298e)) && n51.f.a(this.f217299f, tVar.f217299f) && n51.f.a(this.f217300g, tVar.f217300g) && n51.f.a(this.f217301h, tVar.f217301h) && n51.f.a(java.lang.Integer.valueOf(this.f217302i), java.lang.Integer.valueOf(tVar.f217302i)) && n51.f.a(java.lang.Integer.valueOf(this.f217303m), java.lang.Integer.valueOf(tVar.f217303m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.t();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217304n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217297d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f217298e);
            }
            java.lang.String str2 = this.f217299f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f217300g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f217301h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f217302i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f217303m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f217297d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f217298e);
            }
            java.lang.String str5 = this.f217299f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f217300g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f217301h;
            if (gVar2 != null && zArr[5]) {
                i18 += b36.f.b(5, gVar2);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f217302i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f217303m) : i18;
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
                this.f217297d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217298e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217299f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217300g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217301h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217302i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217303m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
