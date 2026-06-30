package tl4;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl4.h f420307d;

    public g(tl4.h hVar) {
        this.f420307d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b66.g gVar;
        b66.n a17;
        tl4.h hVar = this.f420307d;
        com.tencent.unit_rc.WeakPtr weakPtr = hVar.f420310c;
        if (((weakPtr == null || (gVar = (b66.g) weakPtr.lock()) == null || (a17 = ((b66.i) gVar).a()) == null) ? 0 : a17.i()) == 3) {
            hVar.f420308a.stopForeground(false);
        }
    }
}
