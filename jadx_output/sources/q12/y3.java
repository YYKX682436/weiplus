package q12;

/* loaded from: classes12.dex */
public class y3 extends com.tencent.mm.sdk.event.n {
    public y3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiStorageMgr", "RefreshSmileyPanelEvent was arrived before login, ignore it.");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStorageMgr", "REFRESH_PANEL_EVENT");
        gr.t g17 = gr.t.g();
        g17.l(true);
        g17.n(true);
        g17.m(true);
        return false;
    }
}
