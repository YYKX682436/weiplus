package v01;

/* loaded from: classes11.dex */
public final class m implements com.tencent.wechat.iam.biz.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.ui.BizProfileCardFragment f432212a;

    public m(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment) {
        this.f432212a = bizProfileCardFragment;
    }

    @Override // com.tencent.wechat.iam.biz.u0
    public final void a(com.tencent.wechat.mm.biz.b bVar, boolean z17) {
        if (z17) {
            pm0.v.X(new v01.l(this.f432212a, bVar));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizProfileCardFragment", "fetchAcctMessagesAsync failed");
        }
    }
}
