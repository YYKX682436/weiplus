package sz4;

/* loaded from: classes12.dex */
public class j0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sz4.k0 f414204a;

    public j0(sz4.k0 k0Var) {
        this.f414204a = k0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        sz4.k0 k0Var = this.f414204a;
        if (k0Var.F.f296134r) {
            k0Var.G.removeMessages(4096);
            return;
        }
        k0Var.E.setText(" " + ((java.lang.String) c31.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, k0Var.F.f296160u)).toString());
        sendEmptyMessageDelayed(4096, 500L);
    }
}
