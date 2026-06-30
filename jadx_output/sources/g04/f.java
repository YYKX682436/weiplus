package g04;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g04.h f267459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g04.g f267460e;

    public f(g04.g gVar, g04.h hVar) {
        this.f267460e = gVar;
        this.f267459d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g04.g gVar = this.f267460e;
        this.f267459d.k5(new g04.i(gVar.f267461d), gVar.f267462e);
    }
}
