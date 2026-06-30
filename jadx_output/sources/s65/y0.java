package s65;

/* loaded from: classes11.dex */
public class y0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sandbox.updater.UpdaterService f403559d;

    public y0(com.tencent.mm.sandbox.updater.UpdaterService updaterService) {
        this.f403559d = updaterService;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        return !this.f403559d.i();
    }
}
