package sr;

/* loaded from: classes10.dex */
public final class m extends sr.l {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.emoji.view.AbsEmojiView f411400d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f411401e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f411402f;

    /* renamed from: g, reason: collision with root package name */
    public long f411403g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.emoji.view.AbsEmojiView emojiView, yz5.p downloadListener) {
        super(emojiView);
        kotlin.jvm.internal.o.g(emojiView, "emojiView");
        kotlin.jvm.internal.o.g(downloadListener, "downloadListener");
        this.f411400d = emojiView;
        this.f411401e = "MicroMsg.FinderEmojiViewDelegate";
        this.f411402f = downloadListener;
    }

    @Override // sr.l, dr.q
    public void a(boolean z17) {
        super.a(z17);
        if (this.f411403g != 0) {
            this.f411402f.invoke(java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f411403g));
            this.f411403g = 0L;
        }
        this.f411400d.requestLayout();
    }

    @Override // sr.l, sr.a
    public void destroy() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy: md5=");
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f411399c;
        sb6.append(iEmojiInfo != null ? iEmojiInfo.getMd5() : null);
        sb6.append(' ');
        sb6.append(this);
        sb6.append(' ');
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = this.f411397a;
        sb6.append(absEmojiView);
        com.tencent.mars.xlog.Log.i(this.f411401e, sb6.toString());
        zq.h.f474972a.b(absEmojiView);
    }

    @Override // sr.l, sr.a
    public void reload() {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f411399c;
        if (iEmojiInfo != null) {
            boolean z17 = false;
            if (iEmojiInfo != null && !iEmojiInfo.E0()) {
                z17 = true;
            }
            if (z17) {
                this.f411403g = java.lang.System.currentTimeMillis();
            }
        }
        super.reload();
    }
}
