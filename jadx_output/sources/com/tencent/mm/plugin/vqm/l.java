package com.tencent.mm.plugin.vqm;

/* loaded from: classes15.dex */
public class l extends com.tencent.mm.protobuf.f {
    public static final com.tencent.mm.plugin.vqm.l E = new com.tencent.mm.plugin.vqm.l();
    public long A;
    public long B;
    public int C;
    public final boolean[] D = new boolean[24];

    /* renamed from: d, reason: collision with root package name */
    public long f177375d;

    /* renamed from: e, reason: collision with root package name */
    public long f177376e;

    /* renamed from: f, reason: collision with root package name */
    public int f177377f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.o f177378g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.n f177379h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.m f177380i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.m f177381m;

    /* renamed from: n, reason: collision with root package name */
    public long f177382n;

    /* renamed from: o, reason: collision with root package name */
    public long f177383o;

    /* renamed from: p, reason: collision with root package name */
    public long f177384p;

    /* renamed from: q, reason: collision with root package name */
    public long f177385q;

    /* renamed from: r, reason: collision with root package name */
    public long f177386r;

    /* renamed from: s, reason: collision with root package name */
    public long f177387s;

    /* renamed from: t, reason: collision with root package name */
    public long f177388t;

    /* renamed from: u, reason: collision with root package name */
    public long f177389u;

    /* renamed from: v, reason: collision with root package name */
    public long f177390v;

    /* renamed from: w, reason: collision with root package name */
    public int f177391w;

    /* renamed from: x, reason: collision with root package name */
    public int f177392x;

    /* renamed from: y, reason: collision with root package name */
    public int f177393y;

    /* renamed from: z, reason: collision with root package name */
    public long f177394z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.vqm.l)) {
            return false;
        }
        com.tencent.mm.plugin.vqm.l lVar = (com.tencent.mm.plugin.vqm.l) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f177375d), java.lang.Long.valueOf(lVar.f177375d)) && n51.f.a(java.lang.Long.valueOf(this.f177376e), java.lang.Long.valueOf(lVar.f177376e)) && n51.f.a(java.lang.Integer.valueOf(this.f177377f), java.lang.Integer.valueOf(lVar.f177377f)) && n51.f.a(this.f177378g, lVar.f177378g) && n51.f.a(this.f177379h, lVar.f177379h) && n51.f.a(this.f177380i, lVar.f177380i) && n51.f.a(this.f177381m, lVar.f177381m) && n51.f.a(java.lang.Long.valueOf(this.f177382n), java.lang.Long.valueOf(lVar.f177382n)) && n51.f.a(java.lang.Long.valueOf(this.f177383o), java.lang.Long.valueOf(lVar.f177383o)) && n51.f.a(java.lang.Long.valueOf(this.f177384p), java.lang.Long.valueOf(lVar.f177384p)) && n51.f.a(java.lang.Long.valueOf(this.f177385q), java.lang.Long.valueOf(lVar.f177385q)) && n51.f.a(java.lang.Long.valueOf(this.f177386r), java.lang.Long.valueOf(lVar.f177386r)) && n51.f.a(java.lang.Long.valueOf(this.f177387s), java.lang.Long.valueOf(lVar.f177387s)) && n51.f.a(java.lang.Long.valueOf(this.f177388t), java.lang.Long.valueOf(lVar.f177388t)) && n51.f.a(java.lang.Long.valueOf(this.f177389u), java.lang.Long.valueOf(lVar.f177389u)) && n51.f.a(java.lang.Long.valueOf(this.f177390v), java.lang.Long.valueOf(lVar.f177390v)) && n51.f.a(java.lang.Integer.valueOf(this.f177391w), java.lang.Integer.valueOf(lVar.f177391w)) && n51.f.a(java.lang.Integer.valueOf(this.f177392x), java.lang.Integer.valueOf(lVar.f177392x)) && n51.f.a(java.lang.Integer.valueOf(this.f177393y), java.lang.Integer.valueOf(lVar.f177393y)) && n51.f.a(java.lang.Long.valueOf(this.f177394z), java.lang.Long.valueOf(lVar.f177394z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(lVar.A)) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(lVar.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(lVar.C));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.vqm.l();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f177375d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f177376e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f177377f);
            }
            com.tencent.mm.plugin.vqm.o oVar = this.f177378g;
            if (oVar != null && zArr[4]) {
                fVar.e(4, oVar.f177422d);
            }
            com.tencent.mm.plugin.vqm.n nVar = this.f177379h;
            if (nVar != null && zArr[5]) {
                fVar.e(5, nVar.f177416d);
            }
            com.tencent.mm.plugin.vqm.m mVar = this.f177380i;
            if (mVar != null && zArr[6]) {
                fVar.e(6, mVar.f177399d);
            }
            com.tencent.mm.plugin.vqm.m mVar2 = this.f177381m;
            if (mVar2 != null && zArr[7]) {
                fVar.e(7, mVar2.f177399d);
            }
            if (zArr[8]) {
                fVar.h(8, this.f177382n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f177383o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f177384p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f177385q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f177386r);
            }
            if (zArr[13]) {
                fVar.h(13, this.f177387s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f177388t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f177389u);
            }
            if (zArr[16]) {
                fVar.h(16, this.f177390v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f177391w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f177392x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f177393y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f177394z);
            }
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f177375d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f177376e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f177377f);
            }
            com.tencent.mm.plugin.vqm.o oVar2 = this.f177378g;
            if (oVar2 != null && zArr[4]) {
                h17 += b36.f.e(4, oVar2.f177422d);
            }
            com.tencent.mm.plugin.vqm.n nVar2 = this.f177379h;
            if (nVar2 != null && zArr[5]) {
                h17 += b36.f.e(5, nVar2.f177416d);
            }
            com.tencent.mm.plugin.vqm.m mVar3 = this.f177380i;
            if (mVar3 != null && zArr[6]) {
                h17 += b36.f.e(6, mVar3.f177399d);
            }
            com.tencent.mm.plugin.vqm.m mVar4 = this.f177381m;
            if (mVar4 != null && zArr[7]) {
                h17 += b36.f.e(7, mVar4.f177399d);
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f177382n);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f177383o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f177384p);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f177385q);
            }
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f177386r);
            }
            if (zArr[13]) {
                h17 += b36.f.h(13, this.f177387s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f177388t);
            }
            if (zArr[15]) {
                h17 += b36.f.h(15, this.f177389u);
            }
            if (zArr[16]) {
                h17 += b36.f.h(16, this.f177390v);
            }
            if (zArr[17]) {
                h17 += b36.f.e(17, this.f177391w);
            }
            if (zArr[18]) {
                h17 += b36.f.e(18, this.f177392x);
            }
            if (zArr[19]) {
                h17 += b36.f.e(19, this.f177393y);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f177394z);
            }
            if (zArr[21]) {
                h17 += b36.f.h(21, this.A);
            }
            if (zArr[22]) {
                h17 += b36.f.h(22, this.B);
            }
            return zArr[23] ? h17 + b36.f.e(23, this.C) : h17;
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
        com.tencent.mm.plugin.vqm.m mVar5 = com.tencent.mm.plugin.vqm.m.VQMProfileInfoCommonKernalIlink;
        com.tencent.mm.plugin.vqm.m mVar6 = com.tencent.mm.plugin.vqm.m.VQMProfileInfoCommonKernalNormal;
        com.tencent.mm.plugin.vqm.m mVar7 = com.tencent.mm.plugin.vqm.m.VQMProfileInfoCommonKernalNull;
        com.tencent.mm.plugin.vqm.o oVar3 = null;
        com.tencent.mm.plugin.vqm.n nVar3 = null;
        switch (intValue) {
            case 1:
                this.f177375d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f177376e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f177377f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    oVar3 = com.tencent.mm.plugin.vqm.o.VQMProfileInfoCommonRoomTypeNull;
                } else if (g17 == 19999) {
                    oVar3 = com.tencent.mm.plugin.vqm.o.VQMProfileInfoCommonRoomTypeUnknown;
                } else if (g17 == 10001) {
                    oVar3 = com.tencent.mm.plugin.vqm.o.VQMProfileInfoCommonRoomTypeVoice;
                } else if (g17 == 10002) {
                    oVar3 = com.tencent.mm.plugin.vqm.o.VQMProfileInfoCommonRoomTypeVideo;
                }
                this.f177378g = oVar3;
                zArr[4] = true;
                return 0;
            case 5:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromNull;
                } else if (g18 != 10007) {
                    switch (g18) {
                        case 10000:
                            nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromUnknown;
                            break;
                        case 10001:
                            nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromBubble;
                            break;
                        case 10002:
                            nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromContact;
                            break;
                        case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                            nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromInputTool;
                            break;
                        case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID /* 10004 */:
                            nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromSignal;
                            break;
                        case 10005:
                            nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromExceptionTip;
                            break;
                        default:
                            switch (g18) {
                                case 10100:
                                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromIosApns;
                                    break;
                                case 10101:
                                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromIosPushKit;
                                    break;
                                case 10102:
                                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromIosCallKit;
                                    break;
                                case 10103:
                                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromIosOpenIm;
                                    break;
                                case 10104:
                                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromIosRightMenu;
                                    break;
                                case 10105:
                                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromIosWidgetQuickCall;
                                    break;
                                case 10106:
                                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromIosCarPlay;
                                    break;
                            }
                    }
                } else {
                    nVar3 = com.tencent.mm.plugin.vqm.n.VQMProfileInfoCommonOpenFromInviteWhenCalling;
                }
                this.f177379h = nVar3;
                zArr[5] = true;
                return 0;
            case 6:
                int g19 = aVar2.g(intValue);
                this.f177380i = g19 != 0 ? g19 != 10000 ? g19 != 10001 ? null : mVar5 : mVar6 : mVar7;
                zArr[6] = true;
                return 0;
            case 7:
                int g27 = aVar2.g(intValue);
                this.f177381m = g27 != 0 ? g27 != 10000 ? g27 != 10001 ? null : mVar5 : mVar6 : mVar7;
                zArr[7] = true;
                return 0;
            case 8:
                this.f177382n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f177383o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f177384p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f177385q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f177386r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f177387s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f177388t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f177389u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f177390v = aVar2.i(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f177391w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f177392x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f177393y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f177394z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.vqm.l) super.parseFrom(bArr);
    }
}
