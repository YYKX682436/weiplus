package ls0;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.v f320882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f320883e;

    public q(ls0.v vVar, android.media.MediaFormat mediaFormat) {
        this.f320882d = vVar;
        this.f320883e = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ls0.v vVar = this.f320882d;
        yz5.p pVar = vVar.f320931c;
        if (pVar != null) {
            pVar.invoke(this.f320883e, vVar);
        }
    }
}
