package qo0;

/* loaded from: classes3.dex */
public interface c {
    static /* synthetic */ void a(qo0.c cVar, qo0.b bVar, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        if ((i17 & 2) != 0) {
            bundle = null;
        }
        cVar.statusChange(bVar, bundle);
    }

    int getLiveRole();

    default boolean isLiving() {
        return true;
    }

    void registerPlugin(qo0.a aVar);

    void statusChange(qo0.b bVar, android.os.Bundle bundle);
}
