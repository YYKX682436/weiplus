package lf4;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.g f318382d;

    public e(lf4.g gVar) {
        this.f318382d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf4.g gVar = this.f318382d;
        gVar.a(gVar.f318398h);
        ef4.w.f252468t.l().post(new lf4.b(gVar));
    }
}
