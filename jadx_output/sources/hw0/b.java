package hw0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.g f285453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hw0.g gVar) {
        super(1);
        this.f285453d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.api.IEmojiInfo emojiInfo = (com.tencent.mm.api.IEmojiInfo) obj;
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        jw0.a aVar = this.f285453d.F;
        if (aVar != null) {
            hw0.n nVar = ((hw0.k) aVar).f285466a;
            nVar.getClass();
            com.tencent.mars.xlog.Log.i("ComposingStickerPanelUI", "addEmoticonSegment: isEmojiFileExist " + emojiInfo.E0());
            kotlinx.coroutines.l.d(nVar.getMainScope(), null, null, new hw0.h(nVar, emojiInfo, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
