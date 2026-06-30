package hk4;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.n f281953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hk4.n nVar) {
        super(0);
        this.f281953d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f281953d.f281956k, "start finished ensure imageBitmap, isStarted:" + this.f281953d.f281970y + ", isPlaying:" + this.f281953d.f281969x + ", isInvokeOnPlayStarted:" + this.f281953d.B);
        this.f281953d.f281969x = true;
        hk4.n.p(this.f281953d);
        hk4.n nVar = this.f281953d;
        synchronized (nVar) {
            if (!nVar.B) {
                pm0.v.X(new hk4.f(nVar));
                nVar.B = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
