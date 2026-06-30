package gx0;

/* loaded from: classes5.dex */
public final class ff extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.gf f276438d;

    public ff(gx0.gf gfVar) {
        this.f276438d = gfVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        gx0.gf gfVar = this.f276438d;
        com.tencent.maas.model.time.MJTime i76 = ((gx0.bf) ((jz5.n) gfVar.f276475h).getValue()).i7();
        if (i76.isValid()) {
            gfVar.f276472e.postValue(i76);
        }
    }
}
