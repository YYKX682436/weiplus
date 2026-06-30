package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vqm.t f177478r = new com.tencent.mm.plugin.vqm.t();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.v f177479d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.x f177480e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.x f177481f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.x f177482g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.x f177483h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.x f177484i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.u f177485m;

    /* renamed from: n, reason: collision with root package name */
    public int f177486n;

    /* renamed from: o, reason: collision with root package name */
    public int f177487o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.w f177488p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f177489q = new boolean[11];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.vqm.t)) {
            return false;
        }
        com.tencent.mm.plugin.vqm.t tVar = (com.tencent.mm.plugin.vqm.t) fVar;
        return n51.f.a(this.f177479d, tVar.f177479d) && n51.f.a(this.f177480e, tVar.f177480e) && n51.f.a(this.f177481f, tVar.f177481f) && n51.f.a(this.f177482g, tVar.f177482g) && n51.f.a(this.f177483h, tVar.f177483h) && n51.f.a(this.f177484i, tVar.f177484i) && n51.f.a(this.f177485m, tVar.f177485m) && n51.f.a(java.lang.Integer.valueOf(this.f177486n), java.lang.Integer.valueOf(tVar.f177486n)) && n51.f.a(java.lang.Integer.valueOf(this.f177487o), java.lang.Integer.valueOf(tVar.f177487o)) && n51.f.a(this.f177488p, tVar.f177488p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.vqm.t();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f177489q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.vqm.v vVar = this.f177479d;
            if (vVar != null && zArr[1]) {
                fVar.e(1, vVar.f177503d);
            }
            com.tencent.mm.plugin.vqm.x xVar = this.f177480e;
            if (xVar != null && zArr[2]) {
                fVar.e(2, xVar.f177515d);
            }
            com.tencent.mm.plugin.vqm.x xVar2 = this.f177481f;
            if (xVar2 != null && zArr[3]) {
                fVar.e(3, xVar2.f177515d);
            }
            com.tencent.mm.plugin.vqm.x xVar3 = this.f177482g;
            if (xVar3 != null && zArr[4]) {
                fVar.e(4, xVar3.f177515d);
            }
            com.tencent.mm.plugin.vqm.x xVar4 = this.f177483h;
            if (xVar4 != null && zArr[5]) {
                fVar.e(5, xVar4.f177515d);
            }
            com.tencent.mm.plugin.vqm.x xVar5 = this.f177484i;
            if (xVar5 != null && zArr[6]) {
                fVar.e(6, xVar5.f177515d);
            }
            com.tencent.mm.plugin.vqm.u uVar = this.f177485m;
            if (uVar != null && zArr[7]) {
                fVar.e(7, uVar.f177495d);
            }
            if (zArr[8]) {
                fVar.e(8, this.f177486n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f177487o);
            }
            com.tencent.mm.plugin.vqm.w wVar = this.f177488p;
            if (wVar != null && zArr[10]) {
                fVar.e(10, wVar.f177509d);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.vqm.v vVar2 = this.f177479d;
            if (vVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, vVar2.f177503d);
            }
            com.tencent.mm.plugin.vqm.x xVar6 = this.f177480e;
            if (xVar6 != null && zArr[2]) {
                i18 += b36.f.e(2, xVar6.f177515d);
            }
            com.tencent.mm.plugin.vqm.x xVar7 = this.f177481f;
            if (xVar7 != null && zArr[3]) {
                i18 += b36.f.e(3, xVar7.f177515d);
            }
            com.tencent.mm.plugin.vqm.x xVar8 = this.f177482g;
            if (xVar8 != null && zArr[4]) {
                i18 += b36.f.e(4, xVar8.f177515d);
            }
            com.tencent.mm.plugin.vqm.x xVar9 = this.f177483h;
            if (xVar9 != null && zArr[5]) {
                i18 += b36.f.e(5, xVar9.f177515d);
            }
            com.tencent.mm.plugin.vqm.x xVar10 = this.f177484i;
            if (xVar10 != null && zArr[6]) {
                i18 += b36.f.e(6, xVar10.f177515d);
            }
            com.tencent.mm.plugin.vqm.u uVar2 = this.f177485m;
            if (uVar2 != null && zArr[7]) {
                i18 += b36.f.e(7, uVar2.f177495d);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f177486n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f177487o);
            }
            com.tencent.mm.plugin.vqm.w wVar2 = this.f177488p;
            return (wVar2 == null || !zArr[10]) ? i18 : i18 + b36.f.e(10, wVar2.f177509d);
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
        com.tencent.mm.plugin.vqm.v vVar3 = null;
        com.tencent.mm.plugin.vqm.w wVar3 = null;
        com.tencent.mm.plugin.vqm.u uVar3 = null;
        switch (intValue) {
            case 1:
                int g17 = aVar2.g(intValue);
                if (g17 != 0) {
                    switch (g17) {
                        case 10000:
                            vVar3 = com.tencent.mm.plugin.vqm.v.VQMProfileInfoNotificationAuthorizationStatusNotDetermined;
                            break;
                        case 10001:
                            vVar3 = com.tencent.mm.plugin.vqm.v.VQMProfileInfoNotificationAuthorizationStatusDenied;
                            break;
                        case 10002:
                            vVar3 = com.tencent.mm.plugin.vqm.v.VQMProfileInfoNotificationAuthorizationStatusAuthorized;
                            break;
                        case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                            vVar3 = com.tencent.mm.plugin.vqm.v.VQMProfileInfoNotificationAuthorizationStatusProvisional;
                            break;
                        case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID /* 10004 */:
                            vVar3 = com.tencent.mm.plugin.vqm.v.VQMProfileInfoNotificationAuthorizationStatusEphemeral;
                            break;
                    }
                } else {
                    vVar3 = com.tencent.mm.plugin.vqm.v.VQMProfileInfoNotificationAuthorizationStatusNull;
                }
                this.f177479d = vVar3;
                zArr[1] = true;
                return 0;
            case 2:
                this.f177480e = com.tencent.mm.plugin.vqm.x.a(aVar2.g(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f177481f = com.tencent.mm.plugin.vqm.x.a(aVar2.g(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f177482g = com.tencent.mm.plugin.vqm.x.a(aVar2.g(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f177483h = com.tencent.mm.plugin.vqm.x.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f177484i = com.tencent.mm.plugin.vqm.x.a(aVar2.g(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                int g18 = aVar2.g(intValue);
                if (g18 != 0) {
                    switch (g18) {
                        case 10000:
                            uVar3 = com.tencent.mm.plugin.vqm.u.VQMProfileInfoNotificationAlertStyleNone;
                            break;
                        case 10001:
                            uVar3 = com.tencent.mm.plugin.vqm.u.VQMProfileInfoNotificationAlertStyleBanner;
                            break;
                        case 10002:
                            uVar3 = com.tencent.mm.plugin.vqm.u.VQMProfileInfoNotificationAlertStyleAlert;
                            break;
                    }
                } else {
                    uVar3 = com.tencent.mm.plugin.vqm.u.VQMProfileInfoNotificationAlertStyleNull;
                }
                this.f177485m = uVar3;
                zArr[7] = true;
                return 0;
            case 8:
                this.f177486n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f177487o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                int g19 = aVar2.g(intValue);
                if (g19 != 0) {
                    switch (g19) {
                        case 10000:
                            wVar3 = com.tencent.mm.plugin.vqm.w.VQMProfileInfoNotificationPushTypeNone;
                            break;
                        case 10001:
                            wVar3 = com.tencent.mm.plugin.vqm.w.VQMProfileInfoNotificationPushTypePushKit;
                            break;
                        case 10002:
                            wVar3 = com.tencent.mm.plugin.vqm.w.VQMProfileInfoNotificationPushTypeAPNS;
                            break;
                    }
                } else {
                    wVar3 = com.tencent.mm.plugin.vqm.w.VQMProfileInfoNotificationPushTypeNull;
                }
                this.f177488p = wVar3;
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.vqm.t) super.parseFrom(bArr);
    }
}
