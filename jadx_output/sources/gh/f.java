package gh;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gh.g f271817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gh.g gVar) {
        super(0);
        this.f271817d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gh.g gVar = this.f271817d;
        synchronized (gVar.f271803f) {
            gVar.f271821n = android.view.Choreographer.getInstance();
            if (gVar.f271804g) {
                android.view.Choreographer choreographer = gVar.f271821n;
                kotlin.jvm.internal.o.d(choreographer);
                choreographer.postFrameCallback(gVar.f271822o);
            }
        }
        return jz5.f0.f302826a;
    }
}
