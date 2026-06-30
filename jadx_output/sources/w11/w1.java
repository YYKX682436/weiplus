package w11;

@j95.b
/* loaded from: classes11.dex */
public class w1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver f442161d;

    public static w11.d2 wi() {
        return ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai();
    }

    public xg3.w0 Ai() {
        gm0.j1.i();
        gm0.j1.b().c();
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).nj();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver getChatroomMsgReceiver = new com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver();
        this.f442161d = getChatroomMsgReceiver;
        getChatroomMsgReceiver.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mm.modelgetchatroommsg.GetChatroomMsgReceiver getChatroomMsgReceiver = this.f442161d;
        if (getChatroomMsgReceiver != null) {
            getChatroomMsgReceiver.f71231d.dead();
            com.tencent.mm.modelgetchatroommsg.f.d().f71238d = null;
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(getChatroomMsgReceiver);
            ((w11.w1) i95.n0.c(w11.w1.class)).Ai().remove(getChatroomMsgReceiver);
            this.f442161d.dead();
        }
    }
}
