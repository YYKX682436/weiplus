package uj3;

/* loaded from: classes14.dex */
public interface b {
    static /* synthetic */ void a(uj3.b bVar, uj3.a aVar, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        if ((i17 & 2) != 0) {
            bundle = null;
        }
        bVar.f(aVar, bundle);
    }

    int b();

    boolean c();

    boolean d();

    int e();

    void f(uj3.a aVar, android.os.Bundle bundle);

    boolean getCurrentStatus();
}
