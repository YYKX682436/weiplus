package yx0;

/* loaded from: classes5.dex */
public final class p7 extends oz5.a implements kotlinx.coroutines.r0 {
    public p7(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        java.lang.System.out.println((java.lang.Object) ("CoroutineExceptionHandler got " + th6));
    }
}
