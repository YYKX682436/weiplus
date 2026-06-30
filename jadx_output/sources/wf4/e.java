package wf4;

/* loaded from: classes12.dex */
public class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf4.g f445660d;

    public e(wf4.g gVar, int i17) {
        this.f445660d = gVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        wf4.g gVar = this.f445660d;
        if (gVar.f445678m) {
            return false;
        }
        gVar.f(wf4.f.GET, null);
        return false;
    }
}
