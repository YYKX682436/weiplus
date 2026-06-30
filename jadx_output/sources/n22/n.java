package n22;

/* loaded from: classes12.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f334299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f334300b;

    public n(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2) {
        this.f334299a = emojiInfo;
        this.f334300b = emojiInfo2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "gameToCustom: %s, %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            return null;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f334299a;
        emojiInfo.field_catalog = 81;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = this.f334300b;
        emojiInfo2.field_catalog = 81;
        int z17 = com.tencent.mm.storage.n5.f().c().z1();
        emojiInfo.field_reserved3 = z17 + 1;
        emojiInfo2.field_reserved3 = z17 + 2;
        com.tencent.mm.storage.n5.f().c().V2(emojiInfo);
        com.tencent.mm.storage.n5.f().c().G2(emojiInfo2);
        gr.v vVar = gr.v.f274696a;
        vVar.a(false);
        vVar.b().putBoolean("game_to_custom", true);
        return null;
    }
}
