package tl;

/* loaded from: classes12.dex */
public class u0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.q0 f420146d;

    public u0(tl.q0 q0Var) {
        this.f420146d = q0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        tl.q0 q0Var = this.f420146d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "onTimerExpired[%s]", q0Var.toString());
        tl.q0.b(q0Var);
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|scenePusher";
    }
}
