package gn5;

/* loaded from: classes12.dex */
public class k implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.popview.EmojiPopView f273679a;

    public k(com.tencent.mm.view.popview.EmojiPopView emojiPopView) {
        this.f273679a = emojiPopView;
    }

    @Override // sr.b
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPopView", "onStatus: %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.view.popview.EmojiPopView emojiPopView = this.f273679a;
        if (i17 == 1) {
            emojiPopView.f213674g.setVisibility(8);
            emojiPopView.f213673f.setVisibility(0);
        } else {
            emojiPopView.f213673f.setVisibility(4);
            emojiPopView.f213674g.setVisibility(0);
        }
    }
}
