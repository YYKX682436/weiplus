package qq0;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq0.u f365909d;

    public r(qq0.u uVar) {
        this.f365909d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qq0.u uVar = this.f365909d;
        if (uVar.f365919h) {
            return;
        }
        uVar.f365919h = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclViewCoverLogic", "CoverLogic, removeCoverFromScl, remove cover when timeout");
        uVar.b(false);
        qq0.u.a(uVar, "removeCoverFromScl");
    }
}
