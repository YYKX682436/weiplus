package com.tencent.mm.plugin.game.protobuf;

/* loaded from: classes8.dex */
public class GetGameCenterGlobalSettingResponse extends r45.js5 {
    public m53.a A8Key;
    public java.lang.String AppStoreGoodsId;
    public m53.j AppStorePreload;
    public m53.n AutoRunTaskSetting;
    public m53.v CommJsLib;
    public m53.c0 DownloadIntercept;
    public m53.w0 DownloadStrategy;
    public m53.p0 GameBanner;
    public m53.q0 GameCenterTabSetting;
    public m53.r0 GameCommunityInfo;
    public m53.v0 GameDetailSetting;
    public m53.x0 GameDyeReportSetting;
    public m53.e1 GameIndexSetting;
    public m53.l1 GameLifeSetting;
    public m53.o1 GameReport;
    public m53.q1 GameSight;
    public m53.r1 GameSimpleDns;
    public m53.t1 GeneralJumpInfo;
    public m53.a3 GlobalLiteAppStore;
    public m53.v3 LiteApp;
    public m53.z3 MessageDBStrategy;
    public m53.a4 MessageExposureStrategy;
    public m53.b4 MessagePullStrategy;
    public m53.c4 MessageVerifyStrategy;
    public m53.c5 ResourcePreload;
    public boolean ShowEntrance;
    public m53.i5 StatusBarStyle;
    public m53.d6 WebViewControl;
    public m53.e6 WepkgControl;
    public m53.d0 downloaderApp;

    public static final com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse create() {
        return new com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = (com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse) fVar;
        return n51.f.a(this.BaseResponse, getGameCenterGlobalSettingResponse.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.ShowEntrance), java.lang.Boolean.valueOf(getGameCenterGlobalSettingResponse.ShowEntrance)) && n51.f.a(this.GameIndexSetting, getGameCenterGlobalSettingResponse.GameIndexSetting) && n51.f.a(this.AppStoreGoodsId, getGameCenterGlobalSettingResponse.AppStoreGoodsId) && n51.f.a(this.GameDetailSetting, getGameCenterGlobalSettingResponse.GameDetailSetting) && n51.f.a(this.AppStorePreload, getGameCenterGlobalSettingResponse.AppStorePreload) && n51.f.a(this.StatusBarStyle, getGameCenterGlobalSettingResponse.StatusBarStyle) && n51.f.a(this.CommJsLib, getGameCenterGlobalSettingResponse.CommJsLib) && n51.f.a(this.WepkgControl, getGameCenterGlobalSettingResponse.WepkgControl) && n51.f.a(this.downloaderApp, getGameCenterGlobalSettingResponse.downloaderApp) && n51.f.a(this.WebViewControl, getGameCenterGlobalSettingResponse.WebViewControl) && n51.f.a(this.DownloadIntercept, getGameCenterGlobalSettingResponse.DownloadIntercept) && n51.f.a(this.A8Key, getGameCenterGlobalSettingResponse.A8Key) && n51.f.a(this.AutoRunTaskSetting, getGameCenterGlobalSettingResponse.AutoRunTaskSetting) && n51.f.a(this.GameCenterTabSetting, getGameCenterGlobalSettingResponse.GameCenterTabSetting) && n51.f.a(this.GameLifeSetting, getGameCenterGlobalSettingResponse.GameLifeSetting) && n51.f.a(this.GeneralJumpInfo, getGameCenterGlobalSettingResponse.GeneralJumpInfo) && n51.f.a(this.GameCommunityInfo, getGameCenterGlobalSettingResponse.GameCommunityInfo) && n51.f.a(this.GameBanner, getGameCenterGlobalSettingResponse.GameBanner) && n51.f.a(this.GameSight, getGameCenterGlobalSettingResponse.GameSight) && n51.f.a(this.GameReport, getGameCenterGlobalSettingResponse.GameReport) && n51.f.a(this.ResourcePreload, getGameCenterGlobalSettingResponse.ResourcePreload) && n51.f.a(this.MessageExposureStrategy, getGameCenterGlobalSettingResponse.MessageExposureStrategy) && n51.f.a(this.GameSimpleDns, getGameCenterGlobalSettingResponse.GameSimpleDns) && n51.f.a(this.LiteApp, getGameCenterGlobalSettingResponse.LiteApp) && n51.f.a(this.DownloadStrategy, getGameCenterGlobalSettingResponse.DownloadStrategy) && n51.f.a(this.GameDyeReportSetting, getGameCenterGlobalSettingResponse.GameDyeReportSetting) && n51.f.a(this.MessagePullStrategy, getGameCenterGlobalSettingResponse.MessagePullStrategy) && n51.f.a(this.MessageDBStrategy, getGameCenterGlobalSettingResponse.MessageDBStrategy) && n51.f.a(this.GlobalLiteAppStore, getGameCenterGlobalSettingResponse.GlobalLiteAppStore) && n51.f.a(this.MessageVerifyStrategy, getGameCenterGlobalSettingResponse.MessageVerifyStrategy);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.a(2, this.ShowEntrance);
            m53.e1 e1Var = this.GameIndexSetting;
            if (e1Var != null) {
                fVar.i(3, e1Var.computeSize());
                this.GameIndexSetting.writeFields(fVar);
            }
            java.lang.String str = this.AppStoreGoodsId;
            if (str != null) {
                fVar.j(4, str);
            }
            m53.v0 v0Var = this.GameDetailSetting;
            if (v0Var != null) {
                fVar.i(6, v0Var.computeSize());
                this.GameDetailSetting.writeFields(fVar);
            }
            m53.j jVar = this.AppStorePreload;
            if (jVar != null) {
                fVar.i(7, jVar.computeSize());
                this.AppStorePreload.writeFields(fVar);
            }
            m53.i5 i5Var = this.StatusBarStyle;
            if (i5Var != null) {
                fVar.i(8, i5Var.computeSize());
                this.StatusBarStyle.writeFields(fVar);
            }
            m53.v vVar = this.CommJsLib;
            if (vVar != null) {
                fVar.i(11, vVar.computeSize());
                this.CommJsLib.writeFields(fVar);
            }
            m53.e6 e6Var = this.WepkgControl;
            if (e6Var != null) {
                fVar.i(12, e6Var.computeSize());
                this.WepkgControl.writeFields(fVar);
            }
            m53.d0 d0Var = this.downloaderApp;
            if (d0Var != null) {
                fVar.i(13, d0Var.computeSize());
                this.downloaderApp.writeFields(fVar);
            }
            m53.d6 d6Var = this.WebViewControl;
            if (d6Var != null) {
                fVar.i(14, d6Var.computeSize());
                this.WebViewControl.writeFields(fVar);
            }
            m53.c0 c0Var = this.DownloadIntercept;
            if (c0Var != null) {
                fVar.i(15, c0Var.computeSize());
                this.DownloadIntercept.writeFields(fVar);
            }
            m53.a aVar = this.A8Key;
            if (aVar != null) {
                fVar.i(16, aVar.computeSize());
                this.A8Key.writeFields(fVar);
            }
            m53.n nVar = this.AutoRunTaskSetting;
            if (nVar != null) {
                fVar.i(17, nVar.computeSize());
                this.AutoRunTaskSetting.writeFields(fVar);
            }
            m53.q0 q0Var = this.GameCenterTabSetting;
            if (q0Var != null) {
                fVar.i(18, q0Var.computeSize());
                this.GameCenterTabSetting.writeFields(fVar);
            }
            m53.l1 l1Var = this.GameLifeSetting;
            if (l1Var != null) {
                fVar.i(19, l1Var.computeSize());
                this.GameLifeSetting.writeFields(fVar);
            }
            m53.t1 t1Var = this.GeneralJumpInfo;
            if (t1Var != null) {
                fVar.i(20, t1Var.computeSize());
                this.GeneralJumpInfo.writeFields(fVar);
            }
            m53.r0 r0Var = this.GameCommunityInfo;
            if (r0Var != null) {
                fVar.i(21, r0Var.computeSize());
                this.GameCommunityInfo.writeFields(fVar);
            }
            m53.p0 p0Var = this.GameBanner;
            if (p0Var != null) {
                fVar.i(22, p0Var.computeSize());
                this.GameBanner.writeFields(fVar);
            }
            m53.q1 q1Var = this.GameSight;
            if (q1Var != null) {
                fVar.i(23, q1Var.computeSize());
                this.GameSight.writeFields(fVar);
            }
            m53.o1 o1Var = this.GameReport;
            if (o1Var != null) {
                fVar.i(24, o1Var.computeSize());
                this.GameReport.writeFields(fVar);
            }
            m53.c5 c5Var = this.ResourcePreload;
            if (c5Var != null) {
                fVar.i(25, c5Var.computeSize());
                this.ResourcePreload.writeFields(fVar);
            }
            m53.a4 a4Var = this.MessageExposureStrategy;
            if (a4Var != null) {
                fVar.i(26, a4Var.computeSize());
                this.MessageExposureStrategy.writeFields(fVar);
            }
            m53.r1 r1Var = this.GameSimpleDns;
            if (r1Var != null) {
                fVar.i(27, r1Var.computeSize());
                this.GameSimpleDns.writeFields(fVar);
            }
            m53.v3 v3Var = this.LiteApp;
            if (v3Var != null) {
                fVar.i(28, v3Var.computeSize());
                this.LiteApp.writeFields(fVar);
            }
            m53.w0 w0Var = this.DownloadStrategy;
            if (w0Var != null) {
                fVar.i(29, w0Var.computeSize());
                this.DownloadStrategy.writeFields(fVar);
            }
            m53.x0 x0Var = this.GameDyeReportSetting;
            if (x0Var != null) {
                fVar.i(30, x0Var.computeSize());
                this.GameDyeReportSetting.writeFields(fVar);
            }
            m53.b4 b4Var = this.MessagePullStrategy;
            if (b4Var != null) {
                fVar.i(31, b4Var.computeSize());
                this.MessagePullStrategy.writeFields(fVar);
            }
            m53.z3 z3Var = this.MessageDBStrategy;
            if (z3Var != null) {
                fVar.i(32, z3Var.computeSize());
                this.MessageDBStrategy.writeFields(fVar);
            }
            m53.a3 a3Var = this.GlobalLiteAppStore;
            if (a3Var != null) {
                fVar.i(33, a3Var.computeSize());
                this.GlobalLiteAppStore.writeFields(fVar);
            }
            m53.c4 c4Var = this.MessageVerifyStrategy;
            if (c4Var != null) {
                fVar.i(34, c4Var.computeSize());
                this.MessageVerifyStrategy.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.a(2, this.ShowEntrance);
            m53.e1 e1Var2 = this.GameIndexSetting;
            if (e1Var2 != null) {
                i18 += b36.f.i(3, e1Var2.computeSize());
            }
            java.lang.String str2 = this.AppStoreGoodsId;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            m53.v0 v0Var2 = this.GameDetailSetting;
            if (v0Var2 != null) {
                i18 += b36.f.i(6, v0Var2.computeSize());
            }
            m53.j jVar2 = this.AppStorePreload;
            if (jVar2 != null) {
                i18 += b36.f.i(7, jVar2.computeSize());
            }
            m53.i5 i5Var2 = this.StatusBarStyle;
            if (i5Var2 != null) {
                i18 += b36.f.i(8, i5Var2.computeSize());
            }
            m53.v vVar2 = this.CommJsLib;
            if (vVar2 != null) {
                i18 += b36.f.i(11, vVar2.computeSize());
            }
            m53.e6 e6Var2 = this.WepkgControl;
            if (e6Var2 != null) {
                i18 += b36.f.i(12, e6Var2.computeSize());
            }
            m53.d0 d0Var2 = this.downloaderApp;
            if (d0Var2 != null) {
                i18 += b36.f.i(13, d0Var2.computeSize());
            }
            m53.d6 d6Var2 = this.WebViewControl;
            if (d6Var2 != null) {
                i18 += b36.f.i(14, d6Var2.computeSize());
            }
            m53.c0 c0Var2 = this.DownloadIntercept;
            if (c0Var2 != null) {
                i18 += b36.f.i(15, c0Var2.computeSize());
            }
            m53.a aVar2 = this.A8Key;
            if (aVar2 != null) {
                i18 += b36.f.i(16, aVar2.computeSize());
            }
            m53.n nVar2 = this.AutoRunTaskSetting;
            if (nVar2 != null) {
                i18 += b36.f.i(17, nVar2.computeSize());
            }
            m53.q0 q0Var2 = this.GameCenterTabSetting;
            if (q0Var2 != null) {
                i18 += b36.f.i(18, q0Var2.computeSize());
            }
            m53.l1 l1Var2 = this.GameLifeSetting;
            if (l1Var2 != null) {
                i18 += b36.f.i(19, l1Var2.computeSize());
            }
            m53.t1 t1Var2 = this.GeneralJumpInfo;
            if (t1Var2 != null) {
                i18 += b36.f.i(20, t1Var2.computeSize());
            }
            m53.r0 r0Var2 = this.GameCommunityInfo;
            if (r0Var2 != null) {
                i18 += b36.f.i(21, r0Var2.computeSize());
            }
            m53.p0 p0Var2 = this.GameBanner;
            if (p0Var2 != null) {
                i18 += b36.f.i(22, p0Var2.computeSize());
            }
            m53.q1 q1Var2 = this.GameSight;
            if (q1Var2 != null) {
                i18 += b36.f.i(23, q1Var2.computeSize());
            }
            m53.o1 o1Var2 = this.GameReport;
            if (o1Var2 != null) {
                i18 += b36.f.i(24, o1Var2.computeSize());
            }
            m53.c5 c5Var2 = this.ResourcePreload;
            if (c5Var2 != null) {
                i18 += b36.f.i(25, c5Var2.computeSize());
            }
            m53.a4 a4Var2 = this.MessageExposureStrategy;
            if (a4Var2 != null) {
                i18 += b36.f.i(26, a4Var2.computeSize());
            }
            m53.r1 r1Var2 = this.GameSimpleDns;
            if (r1Var2 != null) {
                i18 += b36.f.i(27, r1Var2.computeSize());
            }
            m53.v3 v3Var2 = this.LiteApp;
            if (v3Var2 != null) {
                i18 += b36.f.i(28, v3Var2.computeSize());
            }
            m53.w0 w0Var2 = this.DownloadStrategy;
            if (w0Var2 != null) {
                i18 += b36.f.i(29, w0Var2.computeSize());
            }
            m53.x0 x0Var2 = this.GameDyeReportSetting;
            if (x0Var2 != null) {
                i18 += b36.f.i(30, x0Var2.computeSize());
            }
            m53.b4 b4Var2 = this.MessagePullStrategy;
            if (b4Var2 != null) {
                i18 += b36.f.i(31, b4Var2.computeSize());
            }
            m53.z3 z3Var2 = this.MessageDBStrategy;
            if (z3Var2 != null) {
                i18 += b36.f.i(32, z3Var2.computeSize());
            }
            m53.a3 a3Var2 = this.GlobalLiteAppStore;
            if (a3Var2 != null) {
                i18 += b36.f.i(33, a3Var2.computeSize());
            }
            m53.c4 c4Var2 = this.MessageVerifyStrategy;
            return c4Var2 != null ? i18 + b36.f.i(34, c4Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = (com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    getGameCenterGlobalSettingResponse.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                getGameCenterGlobalSettingResponse.ShowEntrance = aVar4.c(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    m53.e1 e1Var3 = new m53.e1();
                    if (bArr2 != null && bArr2.length > 0) {
                        e1Var3.parseFrom(bArr2);
                    }
                    getGameCenterGlobalSettingResponse.GameIndexSetting = e1Var3;
                }
                return 0;
            case 4:
                getGameCenterGlobalSettingResponse.AppStoreGoodsId = aVar4.k(intValue);
                return 0;
            case 5:
            case 9:
            case 10:
            default:
                return -1;
            case 6:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    m53.v0 v0Var3 = new m53.v0();
                    if (bArr3 != null && bArr3.length > 0) {
                        v0Var3.parseFrom(bArr3);
                    }
                    getGameCenterGlobalSettingResponse.GameDetailSetting = v0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    m53.j jVar3 = new m53.j();
                    if (bArr4 != null && bArr4.length > 0) {
                        jVar3.parseFrom(bArr4);
                    }
                    getGameCenterGlobalSettingResponse.AppStorePreload = jVar3;
                }
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    m53.i5 i5Var3 = new m53.i5();
                    if (bArr5 != null && bArr5.length > 0) {
                        i5Var3.parseFrom(bArr5);
                    }
                    getGameCenterGlobalSettingResponse.StatusBarStyle = i5Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar4.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    m53.v vVar3 = new m53.v();
                    if (bArr6 != null && bArr6.length > 0) {
                        vVar3.parseFrom(bArr6);
                    }
                    getGameCenterGlobalSettingResponse.CommJsLib = vVar3;
                }
                return 0;
            case 12:
                java.util.LinkedList j37 = aVar4.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    m53.e6 e6Var3 = new m53.e6();
                    if (bArr7 != null && bArr7.length > 0) {
                        e6Var3.parseFrom(bArr7);
                    }
                    getGameCenterGlobalSettingResponse.WepkgControl = e6Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j38 = aVar4.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    m53.d0 d0Var3 = new m53.d0();
                    if (bArr8 != null && bArr8.length > 0) {
                        d0Var3.parseFrom(bArr8);
                    }
                    getGameCenterGlobalSettingResponse.downloaderApp = d0Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j39 = aVar4.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    m53.d6 d6Var3 = new m53.d6();
                    if (bArr9 != null && bArr9.length > 0) {
                        d6Var3.parseFrom(bArr9);
                    }
                    getGameCenterGlobalSettingResponse.WebViewControl = d6Var3;
                }
                return 0;
            case 15:
                java.util.LinkedList j47 = aVar4.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    m53.c0 c0Var3 = new m53.c0();
                    if (bArr10 != null && bArr10.length > 0) {
                        c0Var3.parseFrom(bArr10);
                    }
                    getGameCenterGlobalSettingResponse.DownloadIntercept = c0Var3;
                }
                return 0;
            case 16:
                java.util.LinkedList j48 = aVar4.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    m53.a aVar5 = new m53.a();
                    if (bArr11 != null && bArr11.length > 0) {
                        aVar5.parseFrom(bArr11);
                    }
                    getGameCenterGlobalSettingResponse.A8Key = aVar5;
                }
                return 0;
            case 17:
                java.util.LinkedList j49 = aVar4.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    m53.n nVar3 = new m53.n();
                    if (bArr12 != null && bArr12.length > 0) {
                        nVar3.parseFrom(bArr12);
                    }
                    getGameCenterGlobalSettingResponse.AutoRunTaskSetting = nVar3;
                }
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar4.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    m53.q0 q0Var3 = new m53.q0();
                    if (bArr13 != null && bArr13.length > 0) {
                        q0Var3.parseFrom(bArr13);
                    }
                    getGameCenterGlobalSettingResponse.GameCenterTabSetting = q0Var3;
                }
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar4.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    m53.l1 l1Var3 = new m53.l1();
                    if (bArr14 != null && bArr14.length > 0) {
                        l1Var3.parseFrom(bArr14);
                    }
                    getGameCenterGlobalSettingResponse.GameLifeSetting = l1Var3;
                }
                return 0;
            case 20:
                java.util.LinkedList j59 = aVar4.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    m53.t1 t1Var3 = new m53.t1();
                    if (bArr15 != null && bArr15.length > 0) {
                        t1Var3.parseFrom(bArr15);
                    }
                    getGameCenterGlobalSettingResponse.GeneralJumpInfo = t1Var3;
                }
                return 0;
            case 21:
                java.util.LinkedList j66 = aVar4.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    m53.r0 r0Var3 = new m53.r0();
                    if (bArr16 != null && bArr16.length > 0) {
                        r0Var3.parseFrom(bArr16);
                    }
                    getGameCenterGlobalSettingResponse.GameCommunityInfo = r0Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j67 = aVar4.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    m53.p0 p0Var3 = new m53.p0();
                    if (bArr17 != null && bArr17.length > 0) {
                        p0Var3.parseFrom(bArr17);
                    }
                    getGameCenterGlobalSettingResponse.GameBanner = p0Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j68 = aVar4.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr18 = (byte[]) j68.get(i76);
                    m53.q1 q1Var3 = new m53.q1();
                    if (bArr18 != null && bArr18.length > 0) {
                        q1Var3.parseFrom(bArr18);
                    }
                    getGameCenterGlobalSettingResponse.GameSight = q1Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j69 = aVar4.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr19 = (byte[]) j69.get(i77);
                    m53.o1 o1Var3 = new m53.o1();
                    if (bArr19 != null && bArr19.length > 0) {
                        o1Var3.parseFrom(bArr19);
                    }
                    getGameCenterGlobalSettingResponse.GameReport = o1Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j76 = aVar4.j(intValue);
                int size20 = j76.size();
                for (int i78 = 0; i78 < size20; i78++) {
                    byte[] bArr20 = (byte[]) j76.get(i78);
                    m53.c5 c5Var3 = new m53.c5();
                    if (bArr20 != null && bArr20.length > 0) {
                        c5Var3.parseFrom(bArr20);
                    }
                    getGameCenterGlobalSettingResponse.ResourcePreload = c5Var3;
                }
                return 0;
            case 26:
                java.util.LinkedList j77 = aVar4.j(intValue);
                int size21 = j77.size();
                for (int i79 = 0; i79 < size21; i79++) {
                    byte[] bArr21 = (byte[]) j77.get(i79);
                    m53.a4 a4Var3 = new m53.a4();
                    if (bArr21 != null && bArr21.length > 0) {
                        a4Var3.parseFrom(bArr21);
                    }
                    getGameCenterGlobalSettingResponse.MessageExposureStrategy = a4Var3;
                }
                return 0;
            case 27:
                java.util.LinkedList j78 = aVar4.j(intValue);
                int size22 = j78.size();
                for (int i86 = 0; i86 < size22; i86++) {
                    byte[] bArr22 = (byte[]) j78.get(i86);
                    m53.r1 r1Var3 = new m53.r1();
                    if (bArr22 != null && bArr22.length > 0) {
                        r1Var3.parseFrom(bArr22);
                    }
                    getGameCenterGlobalSettingResponse.GameSimpleDns = r1Var3;
                }
                return 0;
            case 28:
                java.util.LinkedList j79 = aVar4.j(intValue);
                int size23 = j79.size();
                for (int i87 = 0; i87 < size23; i87++) {
                    byte[] bArr23 = (byte[]) j79.get(i87);
                    m53.v3 v3Var3 = new m53.v3();
                    if (bArr23 != null && bArr23.length > 0) {
                        v3Var3.parseFrom(bArr23);
                    }
                    getGameCenterGlobalSettingResponse.LiteApp = v3Var3;
                }
                return 0;
            case 29:
                java.util.LinkedList j86 = aVar4.j(intValue);
                int size24 = j86.size();
                for (int i88 = 0; i88 < size24; i88++) {
                    byte[] bArr24 = (byte[]) j86.get(i88);
                    m53.w0 w0Var3 = new m53.w0();
                    if (bArr24 != null && bArr24.length > 0) {
                        w0Var3.parseFrom(bArr24);
                    }
                    getGameCenterGlobalSettingResponse.DownloadStrategy = w0Var3;
                }
                return 0;
            case 30:
                java.util.LinkedList j87 = aVar4.j(intValue);
                int size25 = j87.size();
                for (int i89 = 0; i89 < size25; i89++) {
                    byte[] bArr25 = (byte[]) j87.get(i89);
                    m53.x0 x0Var3 = new m53.x0();
                    if (bArr25 != null && bArr25.length > 0) {
                        x0Var3.parseFrom(bArr25);
                    }
                    getGameCenterGlobalSettingResponse.GameDyeReportSetting = x0Var3;
                }
                return 0;
            case 31:
                java.util.LinkedList j88 = aVar4.j(intValue);
                int size26 = j88.size();
                for (int i96 = 0; i96 < size26; i96++) {
                    byte[] bArr26 = (byte[]) j88.get(i96);
                    m53.b4 b4Var3 = new m53.b4();
                    if (bArr26 != null && bArr26.length > 0) {
                        b4Var3.parseFrom(bArr26);
                    }
                    getGameCenterGlobalSettingResponse.MessagePullStrategy = b4Var3;
                }
                return 0;
            case 32:
                java.util.LinkedList j89 = aVar4.j(intValue);
                int size27 = j89.size();
                for (int i97 = 0; i97 < size27; i97++) {
                    byte[] bArr27 = (byte[]) j89.get(i97);
                    m53.z3 z3Var3 = new m53.z3();
                    if (bArr27 != null && bArr27.length > 0) {
                        z3Var3.parseFrom(bArr27);
                    }
                    getGameCenterGlobalSettingResponse.MessageDBStrategy = z3Var3;
                }
                return 0;
            case 33:
                java.util.LinkedList j96 = aVar4.j(intValue);
                int size28 = j96.size();
                for (int i98 = 0; i98 < size28; i98++) {
                    byte[] bArr28 = (byte[]) j96.get(i98);
                    m53.a3 a3Var3 = new m53.a3();
                    if (bArr28 != null && bArr28.length > 0) {
                        a3Var3.parseFrom(bArr28);
                    }
                    getGameCenterGlobalSettingResponse.GlobalLiteAppStore = a3Var3;
                }
                return 0;
            case 34:
                java.util.LinkedList j97 = aVar4.j(intValue);
                int size29 = j97.size();
                for (int i99 = 0; i99 < size29; i99++) {
                    byte[] bArr29 = (byte[]) j97.get(i99);
                    m53.c4 c4Var3 = new m53.c4();
                    if (bArr29 != null && bArr29.length > 0) {
                        c4Var3.parseFrom(bArr29);
                    }
                    getGameCenterGlobalSettingResponse.MessageVerifyStrategy = c4Var3;
                }
                return 0;
        }
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setA8Key(m53.a aVar) {
        this.A8Key = aVar;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setAppStoreGoodsId(java.lang.String str) {
        this.AppStoreGoodsId = str;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setAppStorePreload(m53.j jVar) {
        this.AppStorePreload = jVar;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setAutoRunTaskSetting(m53.n nVar) {
        this.AutoRunTaskSetting = nVar;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setCommJsLib(m53.v vVar) {
        this.CommJsLib = vVar;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setDownloadIntercept(m53.c0 c0Var) {
        this.DownloadIntercept = c0Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setDownloadStrategy(m53.w0 w0Var) {
        this.DownloadStrategy = w0Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setDownloaderApp(m53.d0 d0Var) {
        this.downloaderApp = d0Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameBanner(m53.p0 p0Var) {
        this.GameBanner = p0Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameCenterTabSetting(m53.q0 q0Var) {
        this.GameCenterTabSetting = q0Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameCommunityInfo(m53.r0 r0Var) {
        this.GameCommunityInfo = r0Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameDetailSetting(m53.v0 v0Var) {
        this.GameDetailSetting = v0Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameDyeReportSetting(m53.x0 x0Var) {
        this.GameDyeReportSetting = x0Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameIndexSetting(m53.e1 e1Var) {
        this.GameIndexSetting = e1Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameLifeSetting(m53.l1 l1Var) {
        this.GameLifeSetting = l1Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameReport(m53.o1 o1Var) {
        this.GameReport = o1Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameSight(m53.q1 q1Var) {
        this.GameSight = q1Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGameSimpleDns(m53.r1 r1Var) {
        this.GameSimpleDns = r1Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGeneralJumpInfo(m53.t1 t1Var) {
        this.GeneralJumpInfo = t1Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setGlobalLiteAppStore(m53.a3 a3Var) {
        this.GlobalLiteAppStore = a3Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setLiteApp(m53.v3 v3Var) {
        this.LiteApp = v3Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setMessageDBStrategy(m53.z3 z3Var) {
        this.MessageDBStrategy = z3Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setMessageExposureStrategy(m53.a4 a4Var) {
        this.MessageExposureStrategy = a4Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setMessagePullStrategy(m53.b4 b4Var) {
        this.MessagePullStrategy = b4Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setMessageVerifyStrategy(m53.c4 c4Var) {
        this.MessageVerifyStrategy = c4Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setResourcePreload(m53.c5 c5Var) {
        this.ResourcePreload = c5Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setShowEntrance(boolean z17) {
        this.ShowEntrance = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setStatusBarStyle(m53.i5 i5Var) {
        this.StatusBarStyle = i5Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setWebViewControl(m53.d6 d6Var) {
        this.WebViewControl = d6Var;
        return this;
    }

    public com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse setWepkgControl(m53.e6 e6Var) {
        this.WepkgControl = e6Var;
        return this;
    }
}
