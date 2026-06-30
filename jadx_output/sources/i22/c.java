package i22;

/* loaded from: classes15.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f287948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackForFinderPageSource f287949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackForFinderPageSource emojiDesignerPackForFinderPageSource, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f287949e = emojiDesignerPackForFinderPageSource;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new i22.c(this.f287949e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((i22.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f287948d;
        com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackForFinderPageSource emojiDesignerPackForFinderPageSource = this.f287949e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.wechat.aff.emoticon.i iVar = emojiDesignerPackForFinderPageSource.f98498d;
            this.f287948d = 1;
            obj = iVar.a(false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((com.tencent.wechat.aff.emoticon.g) obj) == com.tencent.wechat.aff.emoticon.g.f216640d) {
            emojiDesignerPackForFinderPageSource.f98502h = !emojiDesignerPackForFinderPageSource.f98498d.b();
            emojiDesignerPackForFinderPageSource.f98499e.invoke(emojiDesignerPackForFinderPageSource.f98498d.f216647d, java.lang.Boolean.FALSE);
        }
        if (emojiDesignerPackForFinderPageSource.f98503i) {
            emojiDesignerPackForFinderPageSource.f98503i = false;
            emojiDesignerPackForFinderPageSource.a();
        }
        emojiDesignerPackForFinderPageSource.f98501g = false;
        return jz5.f0.f302826a;
    }
}
