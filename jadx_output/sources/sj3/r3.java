package sj3;

/* loaded from: classes5.dex */
public final class r3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408728d;

    public r3(sj3.d4 d4Var) {
        this.f408728d = d4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkSmallWindow", "click small view and time is up we remove it..");
        sj3.d4 d4Var = this.f408728d;
        d4Var.e(false);
        com.tencent.mm.sdk.platformtools.b4 b4Var = d4Var.f408479h;
        if (b4Var == null) {
            return true;
        }
        b4Var.d();
        return true;
    }
}
