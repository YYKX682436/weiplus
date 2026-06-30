package dr;

/* loaded from: classes12.dex */
public final class g extends dr.s {

    /* renamed from: c, reason: collision with root package name */
    public final dr.r f242384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, dr.r rVar) {
        super(emojiInfo);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f242384c = rVar;
    }

    @Override // dr.s
    public er.f b() {
        zq.h hVar = zq.h.f474972a;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f242400a;
        kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        return hVar.a((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
    }

    @Override // dr.s
    public void c(boolean z17) {
        pm0.v.X(new dr.f(z17, ar.c.f13356a.a(this.f242400a.getMd5()), this));
    }

    @Override // dr.s
    public void f(boolean z17) {
        ar.c cVar = ar.c.f13356a;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f242400a;
        android.graphics.Bitmap a17 = cVar.a(iEmojiInfo.getMd5());
        iEmojiInfo.getMd5();
        java.util.Objects.toString(a17);
        if (a17 != null) {
            c(true);
            return;
        }
        dr.r rVar = this.f242384c;
        if (rVar != null) {
            rVar.a(0, iEmojiInfo, null);
        }
        dr.s.e(this, false, 1, null);
    }
}
