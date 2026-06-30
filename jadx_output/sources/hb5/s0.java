package hb5;

/* loaded from: classes11.dex */
public class s0 implements s01.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatroomInfoUI f280257a;

    public s0(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI) {
        this.f280257a = bizChatroomInfoUI;
    }

    @Override // s01.l
    public void a(s01.k kVar) {
        if (kVar == null || kVar.f401891c == null) {
            return;
        }
        long j17 = kVar.f401890b;
        com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI = this.f280257a;
        if (j17 != bizChatroomInfoUI.f197945p || kVar.f401889a == s01.j.DELETE) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "bizChatExtension bizChat change");
        bizChatroomInfoUI.f197954y = r01.q3.Ui().z0(bizChatroomInfoUI.f197945p);
        bizChatroomInfoUI.onDataChanged();
    }
}
