package hb5;

/* loaded from: classes11.dex */
public class t implements s01.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatFavUI f280258d;

    public t(com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI) {
        this.f280258d = bizChatFavUI;
    }

    @Override // s01.f
    public void a(s01.e eVar) {
        s01.b bVar;
        if (eVar == null || (bVar = eVar.f401862b) == null) {
            return;
        }
        com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI = this.f280258d;
        if (bizChatFavUI.f197919h.equals(bVar.field_brandUserName)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatFavUI", "bizChatExtension bizChatConv change");
            if (bizChatFavUI.f197921m) {
                bizChatFavUI.f197917f.q();
            }
        }
    }
}
