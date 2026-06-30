package px0;

/* loaded from: classes5.dex */
public final class b0 extends oz5.a implements kotlinx.coroutines.r0 {
    public b0(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        if (th6 instanceof java.util.concurrent.CancellationException) {
            com.tencent.mars.xlog.Log.e("MaterialImportPreviewFragment", "scope cancelled");
        } else {
            com.tencent.mars.xlog.Log.e("MaterialImportPreviewFragment", "scope throwable", th6);
        }
    }
}
