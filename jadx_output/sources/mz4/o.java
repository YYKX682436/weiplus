package mz4;

/* loaded from: classes10.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz4.s f333323f;

    public o(mz4.s sVar, java.lang.String str, int i17) {
        this.f333323f = sVar;
        this.f333321d = str;
        this.f333322e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        mz4.s sVar = this.f333323f;
        sVar.f333344i.b(this.f333321d, sVar.f333345m);
        if (sVar.f333349q || this.f333322e != -50006) {
            gm0.j1.e().k(new mz4.n(this), 80L);
        }
    }
}
