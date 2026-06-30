package ls0;

/* loaded from: classes10.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.v f320876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f320877e;

    public o(ls0.v vVar, android.media.MediaFormat mediaFormat) {
        this.f320876d = vVar;
        this.f320877e = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ls0.v vVar = this.f320876d;
        yz5.p pVar = vVar.f320931c;
        if (pVar != null) {
            pVar.invoke(this.f320877e, vVar);
        }
    }
}
