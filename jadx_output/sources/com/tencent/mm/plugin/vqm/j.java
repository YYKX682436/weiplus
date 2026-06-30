package com.tencent.mm.plugin.vqm;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.protobuf.f {
    public static final com.tencent.mm.plugin.vqm.j C = new com.tencent.mm.plugin.vqm.j();
    public long A;
    public final boolean[] B = new boolean[22];

    /* renamed from: d, reason: collision with root package name */
    public long f177348d;

    /* renamed from: e, reason: collision with root package name */
    public long f177349e;

    /* renamed from: f, reason: collision with root package name */
    public long f177350f;

    /* renamed from: g, reason: collision with root package name */
    public long f177351g;

    /* renamed from: h, reason: collision with root package name */
    public long f177352h;

    /* renamed from: i, reason: collision with root package name */
    public long f177353i;

    /* renamed from: m, reason: collision with root package name */
    public long f177354m;

    /* renamed from: n, reason: collision with root package name */
    public long f177355n;

    /* renamed from: o, reason: collision with root package name */
    public int f177356o;

    /* renamed from: p, reason: collision with root package name */
    public int f177357p;

    /* renamed from: q, reason: collision with root package name */
    public int f177358q;

    /* renamed from: r, reason: collision with root package name */
    public int f177359r;

    /* renamed from: s, reason: collision with root package name */
    public int f177360s;

    /* renamed from: t, reason: collision with root package name */
    public long f177361t;

    /* renamed from: u, reason: collision with root package name */
    public long f177362u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.k f177363v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f177364w;

    /* renamed from: x, reason: collision with root package name */
    public long f177365x;

    /* renamed from: y, reason: collision with root package name */
    public long f177366y;

    /* renamed from: z, reason: collision with root package name */
    public long f177367z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.vqm.j)) {
            return false;
        }
        com.tencent.mm.plugin.vqm.j jVar = (com.tencent.mm.plugin.vqm.j) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f177348d), java.lang.Long.valueOf(jVar.f177348d)) && n51.f.a(java.lang.Long.valueOf(this.f177349e), java.lang.Long.valueOf(jVar.f177349e)) && n51.f.a(java.lang.Long.valueOf(this.f177350f), java.lang.Long.valueOf(jVar.f177350f)) && n51.f.a(java.lang.Long.valueOf(this.f177351g), java.lang.Long.valueOf(jVar.f177351g)) && n51.f.a(java.lang.Long.valueOf(this.f177352h), java.lang.Long.valueOf(jVar.f177352h)) && n51.f.a(java.lang.Long.valueOf(this.f177353i), java.lang.Long.valueOf(jVar.f177353i)) && n51.f.a(java.lang.Long.valueOf(this.f177354m), java.lang.Long.valueOf(jVar.f177354m)) && n51.f.a(java.lang.Long.valueOf(this.f177355n), java.lang.Long.valueOf(jVar.f177355n)) && n51.f.a(java.lang.Integer.valueOf(this.f177356o), java.lang.Integer.valueOf(jVar.f177356o)) && n51.f.a(java.lang.Integer.valueOf(this.f177357p), java.lang.Integer.valueOf(jVar.f177357p)) && n51.f.a(java.lang.Integer.valueOf(this.f177358q), java.lang.Integer.valueOf(jVar.f177358q)) && n51.f.a(java.lang.Integer.valueOf(this.f177359r), java.lang.Integer.valueOf(jVar.f177359r)) && n51.f.a(java.lang.Integer.valueOf(this.f177360s), java.lang.Integer.valueOf(jVar.f177360s)) && n51.f.a(java.lang.Long.valueOf(this.f177361t), java.lang.Long.valueOf(jVar.f177361t)) && n51.f.a(java.lang.Long.valueOf(this.f177362u), java.lang.Long.valueOf(jVar.f177362u)) && n51.f.a(this.f177363v, jVar.f177363v) && n51.f.a(this.f177364w, jVar.f177364w) && n51.f.a(java.lang.Long.valueOf(this.f177365x), java.lang.Long.valueOf(jVar.f177365x)) && n51.f.a(java.lang.Long.valueOf(this.f177366y), java.lang.Long.valueOf(jVar.f177366y)) && n51.f.a(java.lang.Long.valueOf(this.f177367z), java.lang.Long.valueOf(jVar.f177367z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(jVar.A));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.vqm.j();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.vqm.k kVar;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f177348d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f177349e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f177350f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f177351g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f177352h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f177353i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f177354m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f177355n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f177356o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f177357p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f177358q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f177359r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f177360s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f177361t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f177362u);
            }
            com.tencent.mm.plugin.vqm.k kVar2 = this.f177363v;
            if (kVar2 != null && zArr[16]) {
                fVar.e(16, kVar2.f177374d);
            }
            java.lang.String str = this.f177364w;
            if (str != null && zArr[17]) {
                fVar.j(17, str);
            }
            if (zArr[18]) {
                fVar.h(18, this.f177365x);
            }
            if (zArr[19]) {
                fVar.h(19, this.f177366y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f177367z);
            }
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f177348d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f177349e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f177350f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f177351g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f177352h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f177353i);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f177354m);
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f177355n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f177356o);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f177357p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f177358q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f177359r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f177360s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f177361t);
            }
            if (zArr[15]) {
                h17 += b36.f.h(15, this.f177362u);
            }
            com.tencent.mm.plugin.vqm.k kVar3 = this.f177363v;
            if (kVar3 != null && zArr[16]) {
                h17 += b36.f.e(16, kVar3.f177374d);
            }
            java.lang.String str2 = this.f177364w;
            if (str2 != null && zArr[17]) {
                h17 += b36.f.j(17, str2);
            }
            if (zArr[18]) {
                h17 += b36.f.h(18, this.f177365x);
            }
            if (zArr[19]) {
                h17 += b36.f.h(19, this.f177366y);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f177367z);
            }
            return zArr[21] ? h17 + b36.f.h(21, this.A) : h17;
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
                this.f177348d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f177349e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f177350f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f177351g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f177352h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f177353i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f177354m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f177355n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f177356o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f177357p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f177358q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f177359r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f177360s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f177361t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f177362u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                int g17 = aVar2.g(intValue);
                if (g17 != 0) {
                    switch (g17) {
                        case 10001:
                            kVar = com.tencent.mm.plugin.vqm.k.VQMProfileInfoAudioDeviceTypeSpeaker;
                            break;
                        case 10002:
                            kVar = com.tencent.mm.plugin.vqm.k.VQMProfileInfoAudioDeviceTypeEarpiece;
                            break;
                        case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                            kVar = com.tencent.mm.plugin.vqm.k.VQMProfileInfoAudioDeviceTypeHeadset;
                            break;
                        case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID /* 10004 */:
                            kVar = com.tencent.mm.plugin.vqm.k.VQMProfileInfoAudioDeviceTypeBluetooth;
                            break;
                        default:
                            kVar = null;
                            break;
                    }
                } else {
                    kVar = com.tencent.mm.plugin.vqm.k.VQMProfileInfoAudioDeviceTypeNull;
                }
                this.f177363v = kVar;
                zArr[16] = true;
                return 0;
            case 17:
                this.f177364w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f177365x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f177366y = aVar2.i(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f177367z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.vqm.j) super.parseFrom(bArr);
    }
}
