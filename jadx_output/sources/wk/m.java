package wk;

/* loaded from: classes8.dex */
public class m implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk.n f446888d;

    public m(wk.n nVar) {
        this.f446888d = nVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtSimpleRecord", "Voice record timeout.");
        wk.n nVar = this.f446888d;
        nVar.f446892g = true;
        nVar.b();
        return false;
    }
}
