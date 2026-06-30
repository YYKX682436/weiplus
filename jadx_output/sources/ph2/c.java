package ph2;

/* loaded from: classes10.dex */
public final class c implements android.view.Choreographer.FrameCallback, ph2.e {

    /* renamed from: d, reason: collision with root package name */
    public ph2.d f354379d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f354380e;

    @Override // ph2.e
    public void a() {
        this.f354380e = false;
        android.view.Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // ph2.e
    public void b(ph2.d callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f354379d = callback;
    }

    @Override // ph2.e
    public void c() {
        this.f354380e = true;
        android.view.Choreographer.getInstance().postFrameCallback(this);
    }

    @Override // ph2.e
    public void d(ah2.f fVar) {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        ph2.d dVar = this.f354379d;
        if (dVar != null) {
            dVar.b();
        }
        if (this.f354380e) {
            android.view.Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
