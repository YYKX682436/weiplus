package dr;

/* loaded from: classes12.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr.d f242376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dr.d dVar) {
        super(2);
        this.f242376d = dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f242376d.f242400a;
        kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo;
        if (emojiInfo.field_width == 0 || emojiInfo.field_height == 0) {
            emojiInfo.field_width = intValue;
            emojiInfo.field_height = intValue2;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().m(emojiInfo);
        }
        return jz5.f0.f302826a;
    }
}
