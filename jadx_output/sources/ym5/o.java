package ym5;

/* loaded from: classes10.dex */
public class o implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.h f463450a;

    public o(ym5.h hVar) {
        this.f463450a = hVar;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseDrawingView", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        ((l45.n) this.f463450a.getPresenter()).r(iEmojiInfo);
        onHide();
    }

    @Override // qk.u9
    public void onHide() {
        ym5.h hVar = this.f463450a;
        hVar.setActionBarVisible(true);
        hVar.c(true);
        hVar.setFooterVisible(true);
    }
}
