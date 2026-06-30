package hb5;

/* loaded from: classes11.dex */
public class x implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatFavUI f280265a;

    public x(com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI) {
        this.f280265a = bizChatFavUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        com.tencent.mm.ui.bizchat.BizChatFavUI bizChatFavUI = this.f280265a;
        java.lang.String str = bizChatFavUI.f197919h;
        ((sg3.a) v0Var).getClass();
        bizChatFavUI.setMMTitle(c01.a2.e(str));
        if (bizChatFavUI.f197917f.getCount() <= 0) {
            bizChatFavUI.f197915d.setVisibility(0);
            bizChatFavUI.f197916e.setVisibility(8);
        } else {
            bizChatFavUI.f197915d.setVisibility(8);
            bizChatFavUI.f197916e.setVisibility(0);
        }
    }
}
