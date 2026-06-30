package kr;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.y0 f311289d;

    public a(lr.y0 y0Var) {
        this.f311289d = y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r2.equals(r1.getMd5()) == true) goto L12;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            lr.y0 r0 = r4.f311289d
            r0.getClass()
            java.lang.String r1 = "MicroMsg.SimilarEmoji"
            java.lang.String r2 = "loadGif"
            com.tencent.mars.xlog.Log.i(r1, r2)
            ir.u0 r1 = r0.f320581e
            ir.g r1 = (ir.g) r1
            if (r1 == 0) goto L3e
            com.tencent.mm.emoji.view.EmojiStatusView r0 = r0.f320614g
            com.tencent.mm.api.IEmojiInfo r2 = r0.getEmojiInfo()
            com.tencent.mm.api.IEmojiInfo r1 = r1.f293836b
            if (r2 == 0) goto L2e
            java.lang.String r2 = r2.getMd5()
            if (r2 == 0) goto L2e
            java.lang.String r3 = r1.getMd5()
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 != r3) goto L2e
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r3 == 0) goto L3b
            boolean r1 = r0.r()
            if (r1 != 0) goto L3e
            r0.resume()
            goto L3e
        L3b:
            r0.setEmojiInfo(r1)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kr.a.run():void");
    }
}
