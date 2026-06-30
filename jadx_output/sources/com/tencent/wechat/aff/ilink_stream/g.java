package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ilink_stream.g f217272u = new com.tencent.wechat.aff.ilink_stream.g();

    /* renamed from: d, reason: collision with root package name */
    public long f217273d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217274e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217275f;

    /* renamed from: g, reason: collision with root package name */
    public int f217276g;

    /* renamed from: h, reason: collision with root package name */
    public int f217277h;

    /* renamed from: i, reason: collision with root package name */
    public long f217278i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.y f217279m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.w f217280n;

    /* renamed from: o, reason: collision with root package name */
    public int f217281o;

    /* renamed from: p, reason: collision with root package name */
    public long f217282p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f217283q;

    /* renamed from: r, reason: collision with root package name */
    public int f217284r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f217285s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f217286t = new boolean[14];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.g)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.g gVar = (com.tencent.wechat.aff.ilink_stream.g) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217273d), java.lang.Long.valueOf(gVar.f217273d)) && n51.f.a(this.f217274e, gVar.f217274e) && n51.f.a(this.f217275f, gVar.f217275f) && n51.f.a(java.lang.Integer.valueOf(this.f217276g), java.lang.Integer.valueOf(gVar.f217276g)) && n51.f.a(java.lang.Integer.valueOf(this.f217277h), java.lang.Integer.valueOf(gVar.f217277h)) && n51.f.a(java.lang.Long.valueOf(this.f217278i), java.lang.Long.valueOf(gVar.f217278i)) && n51.f.a(this.f217279m, gVar.f217279m) && n51.f.a(this.f217280n, gVar.f217280n) && n51.f.a(java.lang.Integer.valueOf(this.f217281o), java.lang.Integer.valueOf(gVar.f217281o)) && n51.f.a(java.lang.Long.valueOf(this.f217282p), java.lang.Long.valueOf(gVar.f217282p)) && n51.f.a(this.f217283q, gVar.f217283q) && n51.f.a(java.lang.Integer.valueOf(this.f217284r), java.lang.Integer.valueOf(gVar.f217284r)) && n51.f.a(this.f217285s, gVar.f217285s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217286t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217273d);
            }
            java.lang.String str = this.f217274e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f217275f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f217276g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f217277h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f217278i);
            }
            com.tencent.wechat.aff.ilink_stream.y yVar = this.f217279m;
            if (yVar != null && zArr[7]) {
                fVar.e(7, yVar.f217347d);
            }
            com.tencent.wechat.aff.ilink_stream.w wVar = this.f217280n;
            if (wVar != null && zArr[8]) {
                fVar.e(8, wVar.f217330d);
            }
            if (zArr[9]) {
                fVar.e(9, this.f217281o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f217282p);
            }
            java.lang.String str3 = this.f217283q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f217284r);
            }
            java.lang.String str4 = this.f217285s;
            if (str4 != null && zArr[13]) {
                fVar.j(13, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f217273d) : 0;
            java.lang.String str5 = this.f217274e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f217275f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f217276g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f217277h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f217278i);
            }
            com.tencent.wechat.aff.ilink_stream.y yVar2 = this.f217279m;
            if (yVar2 != null && zArr[7]) {
                h17 += b36.f.e(7, yVar2.f217347d);
            }
            com.tencent.wechat.aff.ilink_stream.w wVar2 = this.f217280n;
            if (wVar2 != null && zArr[8]) {
                h17 += b36.f.e(8, wVar2.f217330d);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f217281o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f217282p);
            }
            java.lang.String str7 = this.f217283q;
            if (str7 != null && zArr[11]) {
                h17 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f217284r);
            }
            java.lang.String str8 = this.f217285s;
            return (str8 == null || !zArr[13]) ? h17 : h17 + b36.f.j(13, str8);
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
                this.f217273d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217274e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217275f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217276g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217277h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217278i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                int g17 = aVar2.g(intValue);
                this.f217279m = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.aff.ilink_stream.y.kTransferModeQuic : com.tencent.wechat.aff.ilink_stream.y.kTransferModeWSS : com.tencent.wechat.aff.ilink_stream.y.kTransferModeUnknown;
                zArr[7] = true;
                return 0;
            case 8:
                this.f217280n = com.tencent.wechat.aff.ilink_stream.w.a(aVar2.g(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                this.f217281o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f217282p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f217283q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f217284r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f217285s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.g) super.parseFrom(bArr);
    }
}
