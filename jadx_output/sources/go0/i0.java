package go0;

/* loaded from: classes3.dex */
public interface i0 {
    static /* synthetic */ void b(go0.i0 i0Var, java.lang.Object obj, boolean z17, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOutputSurface");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        i0Var.a(obj, z17);
    }

    void a(java.lang.Object obj, boolean z17);
}
