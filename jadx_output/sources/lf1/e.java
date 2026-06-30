package lf1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf1.j f318246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f318247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f318248f;

    public e(lf1.j jVar, sf.f fVar, java.lang.Runnable runnable) {
        this.f318246d = jVar;
        this.f318247e = fVar;
        this.f318248f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf1.j jVar = this.f318246d;
        if (jVar.f318264g != null) {
            this.f318248f.run();
            return;
        }
        ((java.util.ArrayList) jVar.f318266i).add(this.f318247e);
    }
}
