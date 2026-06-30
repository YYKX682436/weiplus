package t21;

/* loaded from: classes12.dex */
public class p1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f414861d;

    public p1(t21.w0 w0Var) {
        this.f414861d = w0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        t21.w0 w0Var = this.f414861d;
        if (w0Var.doScene(w0Var.dispatcher(), w0Var.f415031d) == -1) {
            w0Var.f415036i = 0 - (fp.k.a() + 10000);
            w0Var.f415031d.onSceneEnd(3, -1, "doScene failed", w0Var);
        }
        return false;
    }
}
