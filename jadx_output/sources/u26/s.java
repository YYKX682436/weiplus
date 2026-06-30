package u26;

/* loaded from: classes.dex */
public abstract class s {
    public static /* synthetic */ void a(u26.t tVar, java.util.concurrent.CancellationException cancellationException, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i17 & 1) != 0) {
            cancellationException = null;
        }
        tVar.b(cancellationException);
    }
}
