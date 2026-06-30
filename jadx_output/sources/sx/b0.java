package sx;

/* loaded from: classes9.dex */
public interface b0 extends i95.m {
    static java.lang.Object Be(sx.b0 b0Var, dn.m mVar, long j17, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSyncCdnDownload");
        }
        if ((i17 & 2) != 0) {
            j17 = 3600000;
        }
        if ((i17 & 4) != 0) {
            weakReference = null;
        }
        ((rx.f) b0Var).getClass();
        return kotlinx.coroutines.a4.c(j17, new com.tencent.mm.modelcdntran.j0(mVar, weakReference, null), continuation);
    }

    static java.lang.Object Hi(sx.b0 b0Var, dn.m mVar, long j17, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSyncCdnUpload");
        }
        if ((i17 & 2) != 0) {
            j17 = 3600000;
        }
        if ((i17 & 4) != 0) {
            weakReference = null;
        }
        ((rx.f) b0Var).getClass();
        return kotlinx.coroutines.a4.c(j17, new com.tencent.mm.modelcdntran.n0(mVar, weakReference, null), continuation);
    }
}
