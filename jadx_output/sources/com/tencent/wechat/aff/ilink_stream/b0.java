package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.protobuf.f {

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ilink_stream.b0 f217230y = new com.tencent.wechat.aff.ilink_stream.b0();

    /* renamed from: d, reason: collision with root package name */
    public long f217231d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217232e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217233f;

    /* renamed from: g, reason: collision with root package name */
    public long f217234g;

    /* renamed from: h, reason: collision with root package name */
    public long f217235h;

    /* renamed from: i, reason: collision with root package name */
    public long f217236i;

    /* renamed from: m, reason: collision with root package name */
    public long f217237m;

    /* renamed from: n, reason: collision with root package name */
    public long f217238n;

    /* renamed from: o, reason: collision with root package name */
    public long f217239o;

    /* renamed from: p, reason: collision with root package name */
    public int f217240p;

    /* renamed from: q, reason: collision with root package name */
    public int f217241q;

    /* renamed from: r, reason: collision with root package name */
    public int f217242r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.y f217243s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.w f217244t;

    /* renamed from: u, reason: collision with root package name */
    public long f217245u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f217246v;

    /* renamed from: w, reason: collision with root package name */
    public int f217247w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f217248x = new boolean[18];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.b0)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.b0 b0Var = (com.tencent.wechat.aff.ilink_stream.b0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217231d), java.lang.Long.valueOf(b0Var.f217231d)) && n51.f.a(this.f217232e, b0Var.f217232e) && n51.f.a(this.f217233f, b0Var.f217233f) && n51.f.a(java.lang.Long.valueOf(this.f217234g), java.lang.Long.valueOf(b0Var.f217234g)) && n51.f.a(java.lang.Long.valueOf(this.f217235h), java.lang.Long.valueOf(b0Var.f217235h)) && n51.f.a(java.lang.Long.valueOf(this.f217236i), java.lang.Long.valueOf(b0Var.f217236i)) && n51.f.a(java.lang.Long.valueOf(this.f217237m), java.lang.Long.valueOf(b0Var.f217237m)) && n51.f.a(java.lang.Long.valueOf(this.f217238n), java.lang.Long.valueOf(b0Var.f217238n)) && n51.f.a(java.lang.Long.valueOf(this.f217239o), java.lang.Long.valueOf(b0Var.f217239o)) && n51.f.a(java.lang.Integer.valueOf(this.f217240p), java.lang.Integer.valueOf(b0Var.f217240p)) && n51.f.a(java.lang.Integer.valueOf(this.f217241q), java.lang.Integer.valueOf(b0Var.f217241q)) && n51.f.a(java.lang.Integer.valueOf(this.f217242r), java.lang.Integer.valueOf(b0Var.f217242r)) && n51.f.a(this.f217243s, b0Var.f217243s) && n51.f.a(this.f217244t, b0Var.f217244t) && n51.f.a(java.lang.Long.valueOf(this.f217245u), java.lang.Long.valueOf(b0Var.f217245u)) && n51.f.a(this.f217246v, b0Var.f217246v) && n51.f.a(java.lang.Integer.valueOf(this.f217247w), java.lang.Integer.valueOf(b0Var.f217247w));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.b0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217248x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217231d);
            }
            java.lang.String str = this.f217232e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f217233f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f217234g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f217235h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f217236i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f217237m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f217238n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f217239o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f217240p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f217241q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f217242r);
            }
            com.tencent.wechat.aff.ilink_stream.y yVar = this.f217243s;
            if (yVar != null && zArr[13]) {
                fVar.e(13, yVar.f217347d);
            }
            com.tencent.wechat.aff.ilink_stream.w wVar = this.f217244t;
            if (wVar != null && zArr[14]) {
                fVar.e(14, wVar.f217330d);
            }
            if (zArr[15]) {
                fVar.h(15, this.f217245u);
            }
            java.lang.String str3 = this.f217246v;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            if (zArr[17]) {
                fVar.e(17, this.f217247w);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f217231d) + 0 : 0;
            java.lang.String str4 = this.f217232e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f217233f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f217234g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f217235h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f217236i);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f217237m);
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f217238n);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f217239o);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f217240p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f217241q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f217242r);
            }
            com.tencent.wechat.aff.ilink_stream.y yVar2 = this.f217243s;
            if (yVar2 != null && zArr[13]) {
                h17 += b36.f.e(13, yVar2.f217347d);
            }
            com.tencent.wechat.aff.ilink_stream.w wVar2 = this.f217244t;
            if (wVar2 != null && zArr[14]) {
                h17 += b36.f.e(14, wVar2.f217330d);
            }
            if (zArr[15]) {
                h17 += b36.f.h(15, this.f217245u);
            }
            java.lang.String str6 = this.f217246v;
            if (str6 != null && zArr[16]) {
                h17 += b36.f.j(16, str6);
            }
            return zArr[17] ? h17 + b36.f.e(17, this.f217247w) : h17;
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
                this.f217231d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217232e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217233f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217234g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217235h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217236i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217237m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217238n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f217239o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f217240p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f217241q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f217242r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                int g17 = aVar2.g(intValue);
                this.f217243s = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.aff.ilink_stream.y.kTransferModeQuic : com.tencent.wechat.aff.ilink_stream.y.kTransferModeWSS : com.tencent.wechat.aff.ilink_stream.y.kTransferModeUnknown;
                zArr[13] = true;
                return 0;
            case 14:
                this.f217244t = com.tencent.wechat.aff.ilink_stream.w.a(aVar2.g(intValue));
                zArr[14] = true;
                return 0;
            case 15:
                this.f217245u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f217246v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f217247w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.b0) super.parseFrom(bArr);
    }
}
