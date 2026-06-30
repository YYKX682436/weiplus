package tr2;

/* loaded from: classes5.dex */
public final class k implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tr2.l f421387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f421388b;

    public k(tr2.l lVar, java.lang.Integer num) {
        this.f421387a = lVar;
        this.f421388b = num;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        lz5.m mVar = new lz5.m();
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f421387a.f421401m;
        mVar.put("easter_egg_emoji_md5", iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        if (kotlin.jvm.internal.o.b(str, "view_clk")) {
            mVar.put("set_like_easter_egg_clk", this.f421388b);
        }
        return kz5.b1.b(mVar);
    }
}
