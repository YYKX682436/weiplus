package za3;

/* loaded from: classes15.dex */
public class l0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.u0 f470980d;

    public l0(za3.u0 u0Var) {
        this.f470980d = u0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkMgr", "onSeizeMicSuccess expired to execute");
        this.f470980d.b();
        return false;
    }
}
