package gy;

/* loaded from: classes14.dex */
public final class a implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy.c f277462d;

    public a(gy.c cVar) {
        this.f277462d = cVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i17) {
        if (i17 == -3 || i17 == -2) {
            gy.c cVar = this.f277462d;
            synchronized (cVar.f277467d) {
                if (cVar.f277471h) {
                    cVar.f277465b.pause();
                    wu5.c cVar2 = cVar.f277468e;
                    if (cVar2 != null && !cVar2.isCancelled()) {
                        wu5.c cVar3 = cVar.f277468e;
                        if (cVar3 != null) {
                            cVar3.cancel(true);
                        }
                        cVar.f277468e = null;
                    }
                }
            }
            this.f277462d.f277472i = true;
            return;
        }
        if (i17 == -1) {
            this.f277462d.f();
            return;
        }
        if (i17 != 1) {
            return;
        }
        gy.c cVar4 = this.f277462d;
        if (cVar4.f277472i) {
            synchronized (cVar4.f277467d) {
                if (cVar4.f277471h && cVar4.f277465b.getPlayState() != 3) {
                    cVar4.a();
                    cVar4.d();
                    if (cVar4.f277465b.getState() != 1) {
                        cVar4.b();
                        if (cVar4.f277465b.getState() != 1) {
                        }
                    }
                    cVar4.f277465b.play();
                    cVar4.f277473j = android.os.SystemClock.elapsedRealtime() - cVar4.f277474k;
                    cVar4.c();
                }
            }
            this.f277462d.f277472i = false;
        }
    }
}
