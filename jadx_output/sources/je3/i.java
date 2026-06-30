package je3;

/* loaded from: classes7.dex */
public interface i extends i95.m {
    static /* synthetic */ void La(je3.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene iMagicBrushMonitor$PerformanceScene, long j17, java.util.List list, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performanceReport");
        }
        iVar.qa(str, str2, str3, iMagicBrushMonitor$PerformanceScene, j17, (i17 & 32) != 0 ? null : list, (i17 & 64) != 0 ? null : jSONObject);
    }

    static /* synthetic */ void M2(je3.i iVar, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene iMagicBrushMonitor$TimeCostScene, long j17, java.lang.String str3, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: timeCostReport");
        }
        iVar.t6(str, str2, iMagicBrushMonitor$TimeCostScene, j17, (i17 & 16) != 0 ? "" : str3, (i17 & 32) != 0 ? 1.0f : f17);
    }

    /* renamed from: if */
    static /* synthetic */ void m519if(je3.i iVar, java.lang.String str, int i17, long j17, java.lang.String str2, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType iMagicBrushClickEnumExt$RoleType, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType iMagicBrushClickEnumExt$EventType, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType iMagicBrushClickEnumExt$ActionType, int i18, int i19, java.lang.String str3, java.lang.String str4, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: magicClickReport");
        }
        iVar.vb(str, (i27 & 2) != 0 ? 0 : i17, j17, str2, iMagicBrushClickEnumExt$RoleType, iMagicBrushClickEnumExt$EventType, iMagicBrushClickEnumExt$ActionType, (i27 & 128) != 0 ? 0 : i18, (i27 & 256) != 0 ? 0 : i19, (i27 & 512) != 0 ? "" : str3, (i27 & 1024) != 0 ? "" : str4);
    }

    static /* synthetic */ void t8(je3.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runtimeReport");
        }
        if ((i17 & 8) != 0) {
            str4 = "";
        }
        java.lang.String str5 = str4;
        if ((i17 & 16) != 0) {
            f17 = 0.01f;
        }
        iVar.T5(str, str2, str3, str5, f17);
    }

    static /* synthetic */ void x2(je3.i iVar, java.lang.String str, int i17, java.lang.String str2, float f17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: kvReport");
        }
        if ((i18 & 4) != 0) {
            str2 = null;
        }
        if ((i18 & 8) != 0) {
            f17 = 0.01f;
        }
        iVar.Sc(str, i17, str2, f17);
    }

    boolean Ii(float f17);

    boolean Nb();

    void Rg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene iMagicBrushMonitor$MagicPkgScene, int i18, int i19);

    void Sc(java.lang.String str, int i17, java.lang.String str2, float f17);

    void T5(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, float f17);

    boolean W7();

    void qa(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene iMagicBrushMonitor$PerformanceScene, long j17, java.util.List list, org.json.JSONObject jSONObject);

    void t6(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene iMagicBrushMonitor$TimeCostScene, long j17, java.lang.String str3, float f17);

    void vb(java.lang.String str, int i17, long j17, java.lang.String str2, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType iMagicBrushClickEnumExt$RoleType, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType iMagicBrushClickEnumExt$EventType, com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType iMagicBrushClickEnumExt$ActionType, int i18, int i19, java.lang.String str3, java.lang.String str4);
}
