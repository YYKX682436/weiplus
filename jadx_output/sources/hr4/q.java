package hr4;

/* loaded from: classes4.dex */
public interface q {
    static /* synthetic */ void c(hr4.q qVar, boolean z17, kr4.e eVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDone");
        }
        if ((i17 & 2) != 0) {
            eVar = null;
        }
        qVar.a(z17, eVar);
    }

    void a(boolean z17, kr4.e eVar);

    void b();
}
