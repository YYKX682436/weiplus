package sr;

/* loaded from: classes10.dex */
public class l implements sr.a, dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.emoji.view.AbsEmojiView f411397a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f411398b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f411399c;

    public l(com.tencent.mm.emoji.view.AbsEmojiView view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f411397a = view;
        this.f411398b = "MicroMsg.EmojiViewDelegate";
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = this.f411397a;
        absEmojiView.getClass();
        absEmojiView.setStatusNotify(z17 ? 1 : -1);
    }

    @Override // sr.a
    public void destroy() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy: ");
        sb6.append(this);
        sb6.append(' ');
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = this.f411397a;
        sb6.append(absEmojiView);
        com.tencent.mars.xlog.Log.i(this.f411398b, sb6.toString());
        zq.h.f474972a.b(absEmojiView);
        absEmojiView.setStatusListener(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r1 != 49) goto L13;
     */
    @Override // sr.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void reload() {
        /*
            r5 = this;
            com.tencent.mm.api.IEmojiInfo r0 = r5.f411399c
            com.tencent.mm.storage.emotion.EmojiInfo r0 = (com.tencent.mm.storage.emotion.EmojiInfo) r0
            java.lang.String r1 = r5.f411398b
            com.tencent.mm.emoji.view.AbsEmojiView r2 = r5.f411397a
            if (r0 == 0) goto L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "reload: "
            r3.<init>(r4)
            java.lang.String r4 = r0.getMd5()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r1, r3)
            boolean r1 = r2.getGameUseCover()
            r3 = 1
            if (r1 == 0) goto L48
            int r1 = r0.field_catalog
            r4 = 18
            if (r1 == r4) goto L37
            l75.e0 r4 = com.tencent.mm.storage.emotion.EmojiInfo.L2
            r4 = 50
            if (r1 == r4) goto L37
            r4 = 49
            if (r1 != r4) goto L48
        L37:
            r2.setStatusNotify(r3)
            android.content.Context r1 = r2.getContext()
            r3 = 300(0x12c, float:4.2E-43)
            android.graphics.Bitmap r0 = r0.a0(r1, r3)
            r2.setImageBitmap(r0)
            goto L68
        L48:
            r1 = 0
            r2.setStatusNotify(r1)
            zq.h r4 = zq.h.f474972a
            java.lang.String r4 = "emojiView"
            kotlin.jvm.internal.o.g(r2, r4)
            dr.p r4 = new dr.p
            r4.<init>(r0, r2, r5)
            r0 = 0
            dr.s.g(r4, r1, r3, r0)
            goto L68
        L5d:
            java.lang.String r0 = "reload: emojiInfo is null"
            com.tencent.mars.xlog.Log.i(r1, r0)
            zq.h r0 = zq.h.f474972a
            r0.b(r2)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sr.l.reload():void");
    }
}
