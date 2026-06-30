package vu5;

/* loaded from: classes12.dex */
public class p implements vu5.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f440364d = new vu5.n(this, android.os.Looper.getMainLooper());

    public p(vu5.m mVar) {
    }

    @Override // vu5.a
    public void a(wu5.l lVar) {
        this.f440364d.postDelayed(lVar, lVar.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
    }
}
