package ln1;

/* loaded from: classes12.dex */
public final class q implements ln1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f319785a;

    public q(java.lang.Object obj) {
        this.f319785a = obj;
    }

    @Override // ln1.z
    public void a(java.lang.Object obj) {
        if (obj instanceof java.lang.Runnable) {
            ((java.lang.Runnable) obj).run();
        }
    }

    @Override // ln1.z
    public java.lang.Object run() {
        return this.f319785a;
    }
}
