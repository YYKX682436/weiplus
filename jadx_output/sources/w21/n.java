package w21;

/* loaded from: classes12.dex */
public class n implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w21.k f442429d;

    public n(w21.k kVar) {
        this.f442429d = kVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        w21.k kVar = this.f442429d;
        if (kVar.doScene(kVar.dispatcher(), kVar.f442402d) != -1) {
            return false;
        }
        kVar.f442402d.onSceneEnd(3, -1, "doScene failed", kVar);
        return false;
    }
}
