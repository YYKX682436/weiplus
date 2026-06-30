package mw0;

/* loaded from: classes5.dex */
public final class b implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView f331677a;

    public b(com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.EmotionView emotionView) {
        this.f331677a = emotionView;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        yz5.l lVar = this.f331677a.f69309f;
        if (lVar != null) {
            lVar.invoke(emojiInfo);
        }
    }

    @Override // qk.u9
    public void onHide() {
        com.tencent.mm.api.SmileyPanel smileyPanel;
        smileyPanel = this.f331677a.getSmileyPanel();
        smileyPanel.h();
    }
}
