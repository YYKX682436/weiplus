package gh2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f271869a;

    public e(gh2.f fVar, java.lang.String uId) {
        kotlin.jvm.internal.o.g(uId, "uId");
        this.f271869a = new java.util.ArrayList();
    }

    public final void a() {
        synchronized (this.f271869a) {
            if (this.f271869a.size() > 10) {
                java.util.List R = kz5.n0.R(this.f271869a, this.f271869a.size() - 10);
                this.f271869a.clear();
                this.f271869a.addAll(R);
            }
        }
    }
}
