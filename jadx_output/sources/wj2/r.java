package wj2;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446714d;

    public r(wj2.w wVar) {
        this.f446714d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wj2.w wVar = this.f446714d;
        if (wVar.f446731x == 1) {
            wj2.w.v(wVar);
            wVar.f446732y = true;
        }
        wVar.f446731x = 0;
        wVar.O();
    }
}
