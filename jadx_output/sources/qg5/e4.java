package qg5;

/* loaded from: classes8.dex */
public final class e4 implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f362964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f362965b;

    public e4(qg5.q4 q4Var, yz5.a aVar) {
        this.f362964a = q4Var;
        this.f362965b = aVar;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        qg5.q4.U6(this.f362964a, 0);
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
        this.f362964a.Y6();
    }

    @Override // xj.l
    public void onJumpAppFail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoForwardChatRecordsFSC", "onJumpAppFail");
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        qg5.q4 q4Var = this.f362964a;
        qg5.q4.U6(q4Var, 1);
        qg5.q4.T6(q4Var);
        yz5.a aVar = this.f362965b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        com.tencent.mars.xlog.Log.w("MicroMsg.YuanBaoForwardChatRecordsFSC", "onJumpDownloadPage: unexpected in forward scenario");
    }
}
