package wt1;

/* loaded from: classes15.dex */
public class d implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.g f449264d;

    public d(wt1.g gVar) {
        this.f449264d = gVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardCodeMgr", "onTimerExpired, do request code");
        wt1.g gVar = this.f449264d;
        gVar.a(gVar.f449270e);
        gVar.e();
        return true;
    }
}
