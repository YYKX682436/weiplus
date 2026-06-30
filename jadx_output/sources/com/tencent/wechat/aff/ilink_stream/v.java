package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes7.dex */
public class v extends com.tencent.mm.protobuf.f {

    /* renamed from: w, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ilink_stream.v f217308w = new com.tencent.wechat.aff.ilink_stream.v();

    /* renamed from: d, reason: collision with root package name */
    public long f217309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217310e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217311f;

    /* renamed from: g, reason: collision with root package name */
    public long f217312g;

    /* renamed from: h, reason: collision with root package name */
    public long f217313h;

    /* renamed from: i, reason: collision with root package name */
    public int f217314i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f217315m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f217316n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f217317o;

    /* renamed from: p, reason: collision with root package name */
    public long f217318p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f217319q;

    /* renamed from: r, reason: collision with root package name */
    public int f217320r;

    /* renamed from: s, reason: collision with root package name */
    public long f217321s;

    /* renamed from: t, reason: collision with root package name */
    public long f217322t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f217323u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f217324v = new boolean[16];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.v)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.v vVar = (com.tencent.wechat.aff.ilink_stream.v) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217309d), java.lang.Long.valueOf(vVar.f217309d)) && n51.f.a(this.f217310e, vVar.f217310e) && n51.f.a(this.f217311f, vVar.f217311f) && n51.f.a(java.lang.Long.valueOf(this.f217312g), java.lang.Long.valueOf(vVar.f217312g)) && n51.f.a(java.lang.Long.valueOf(this.f217313h), java.lang.Long.valueOf(vVar.f217313h)) && n51.f.a(java.lang.Integer.valueOf(this.f217314i), java.lang.Integer.valueOf(vVar.f217314i)) && n51.f.a(java.lang.Boolean.valueOf(this.f217315m), java.lang.Boolean.valueOf(vVar.f217315m)) && n51.f.a(java.lang.Boolean.valueOf(this.f217316n), java.lang.Boolean.valueOf(vVar.f217316n)) && n51.f.a(java.lang.Boolean.valueOf(this.f217317o), java.lang.Boolean.valueOf(vVar.f217317o)) && n51.f.a(java.lang.Long.valueOf(this.f217318p), java.lang.Long.valueOf(vVar.f217318p)) && n51.f.a(this.f217319q, vVar.f217319q) && n51.f.a(java.lang.Integer.valueOf(this.f217320r), java.lang.Integer.valueOf(vVar.f217320r)) && n51.f.a(java.lang.Long.valueOf(this.f217321s), java.lang.Long.valueOf(vVar.f217321s)) && n51.f.a(java.lang.Long.valueOf(this.f217322t), java.lang.Long.valueOf(vVar.f217322t)) && n51.f.a(this.f217323u, vVar.f217323u);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.v();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217324v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217309d);
            }
            java.lang.String str = this.f217310e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f217311f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f217312g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f217313h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f217314i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f217315m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f217316n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f217317o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f217318p);
            }
            java.lang.String str3 = this.f217319q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f217320r);
            }
            if (zArr[13]) {
                fVar.h(13, this.f217321s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f217322t);
            }
            java.lang.String str4 = this.f217323u;
            if (str4 != null && zArr[15]) {
                fVar.j(15, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f217309d) + 0 : 0;
            java.lang.String str5 = this.f217310e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f217311f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f217312g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f217313h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f217314i);
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f217315m);
            }
            if (zArr[8]) {
                h17 += b36.f.a(8, this.f217316n);
            }
            if (zArr[9]) {
                h17 += b36.f.a(9, this.f217317o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f217318p);
            }
            java.lang.String str7 = this.f217319q;
            if (str7 != null && zArr[11]) {
                h17 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f217320r);
            }
            if (zArr[13]) {
                h17 += b36.f.h(13, this.f217321s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f217322t);
            }
            java.lang.String str8 = this.f217323u;
            return (str8 == null || !zArr[15]) ? h17 : h17 + b36.f.j(15, str8);
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
                this.f217309d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217310e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217311f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217312g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217313h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217314i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217315m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217316n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f217317o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f217318p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f217319q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f217320r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f217321s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f217322t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f217323u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.v) super.parseFrom(bArr);
    }
}
