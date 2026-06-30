package e72;

/* loaded from: classes14.dex */
public class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e72.k f249905d;

    public i(e72.k kVar) {
        this.f249905d = kVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        if (!this.f249905d.f249913g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NormalFaceMotion", "hy: already stopped");
            return false;
        }
        if (this.f249905d.j() == null) {
            return true;
        }
        this.f249905d.j().startAnimation(this.f249905d.f249914h);
        return true;
    }
}
