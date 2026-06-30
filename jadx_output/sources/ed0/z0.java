package ed0;

/* loaded from: classes10.dex */
public interface z0 {
    static /* synthetic */ void Z1(ed0.z0 z0Var, long j17, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doReportRingtoneSearchSuggestion");
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        ((com.tencent.mm.plugin.ringtone.uic.c3) z0Var).P6(j17, i17);
    }

    static /* synthetic */ void i1(ed0.z0 z0Var, long j17, int i17, ox3.f fVar, long j18, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doReportRingtoneRecommend");
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        int i19 = i17;
        if ((i18 & 4) != 0) {
            fVar = null;
        }
        ox3.f fVar2 = fVar;
        if ((i18 & 8) != 0) {
            j18 = 0;
        }
        ((com.tencent.mm.plugin.ringtone.uic.c3) z0Var).O6(j17, i19, fVar2, j18);
    }
}
