package t21;

/* loaded from: classes12.dex */
public class q0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.r0 f414883d;

    public q0(t21.r0 r0Var) {
        this.f414883d = r0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        t21.r0 r0Var = this.f414883d;
        if (r0Var.doScene(r0Var.dispatcher(), r0Var.f414903d) != -1) {
            return false;
        }
        r0Var.f414903d.onSceneEnd(3, -1, "doScene failed", r0Var);
        return false;
    }
}
