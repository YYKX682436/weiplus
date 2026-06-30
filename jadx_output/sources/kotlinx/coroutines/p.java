package kotlinx.coroutines;

/* loaded from: classes5.dex */
public abstract class p {
    public static /* synthetic */ boolean a(kotlinx.coroutines.q qVar, java.lang.Throwable th6, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i17 & 1) != 0) {
            th6 = null;
        }
        return ((kotlinx.coroutines.r) qVar).d(th6);
    }
}
