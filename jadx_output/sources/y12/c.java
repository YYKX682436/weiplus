package y12;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static y12.c f458852b;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f458853a = new java.util.ArrayList();

    public void a(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17) {
        if (emojiInfo != null) {
            emojiInfo.field_reserved4 = 0;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().V2(emojiInfo);
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Zi(emojiInfo);
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(231L, 0L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(231L, 1L, 1L, false);
            }
        }
    }
}
