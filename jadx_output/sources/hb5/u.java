package hb5;

/* loaded from: classes11.dex */
public class u implements s01.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatFavUI f280259a;

    public u(com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI) {
        this.f280259a = bizChatFavUI;
    }

    @Override // s01.l
    public void a(s01.k kVar) {
        if (kVar == null || kVar.f401891c == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatFavUI", "bizChatExtension bizChat change");
        r01.q3.Ui().z0(kVar.f401890b);
        com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI = this.f280259a;
        if (bizChatFavUI.f197921m) {
            bizChatFavUI.f197917f.q();
        }
    }
}
