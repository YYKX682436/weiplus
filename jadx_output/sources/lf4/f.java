package lf4;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.g f318386d;

    public f(lf4.g gVar) {
        this.f318386d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.g gVar = this.f318386d;
        gVar.a(gVar.f318398h);
        ef4.w.f252468t.l().post(new lf4.b(gVar));
    }
}
