package ox2;

/* loaded from: classes2.dex */
public final class c implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f349645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f349646b;

    public c(com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f349645a = centerInteractionEasterEgg;
        this.f349646b = iEmojiInfo;
    }

    @Override // sr.b
    public void a(int i17) {
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f349645a;
        com.tencent.mm.api.IEmojiInfo emoji = centerInteractionEasterEgg.getEmoji();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f349646b;
        if (kotlin.jvm.internal.o.b(emoji, iEmojiInfo)) {
            if (!iEmojiInfo.E0() && i17 != 1) {
                if (i17 == -1) {
                    centerInteractionEasterEgg.setEmojiDownloadComplete(false);
                }
            } else {
                com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = centerInteractionEasterEgg.f132373h;
                if (finderEmojiView != null) {
                    hc2.f1.z(finderEmojiView, iEmojiInfo, new ox2.a(centerInteractionEasterEgg), new ox2.b(centerInteractionEasterEgg));
                }
                centerInteractionEasterEgg.setEmojiDownloadComplete(true);
            }
        }
    }
}
