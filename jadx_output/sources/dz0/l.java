package dz0;

/* loaded from: classes5.dex */
public interface l extends pf5.c {
    static /* synthetic */ java.lang.Object n4(dz0.l lVar, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recreateWithMusicID");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar).g7(str, z17, continuation);
    }

    static /* synthetic */ java.lang.Object s4(dz0.l lVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recreateWithTemplateID");
        }
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        return ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar).h7(str, str2, continuation);
    }
}
