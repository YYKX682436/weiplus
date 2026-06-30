package sm1;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409328d;

    public n(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409328d = bizCommentFooter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r26.n0.u0(java.lang.String.valueOf(r1)).toString().length() > 0) != false) goto L16;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            com.tencent.mm.plugin.audio.comment.view.BizCommentFooter r0 = r6.f409328d
            com.tencent.mm.ui.widget.MMEditText r1 = r0.getEditText()
            android.text.Editable r1 = r1.getText()
            r0.getClass()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            int r4 = r1.length()
            if (r4 <= 0) goto L19
            r4 = r2
            goto L1a
        L19:
            r4 = r3
        L1a:
            if (r4 == 0) goto L34
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.CharSequence r1 = r26.n0.u0(r1)
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            if (r1 <= 0) goto L30
            r1 = r2
            goto L31
        L30:
            r1 = r3
        L31:
            if (r1 == 0) goto L34
            goto L35
        L34:
            r2 = r3
        L35:
            boolean r1 = r0.sendBtnEnabled
            if (r2 != r1) goto L3a
            goto L89
        L3a:
            r0.sendBtnEnabled = r2
            r4 = 150(0x96, double:7.4E-322)
            if (r2 == 0) goto L65
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            int r2 = r0.replyBtnWidth
            int[] r2 = new int[]{r3, r2}
            r1.setIntValues(r2)
            sm1.c r2 = new sm1.c
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            r1.setDuration(r4)
            sm1.d r2 = new sm1.d
            r2.<init>(r0)
            r1.addListener(r2)
            r1.start()
            goto L89
        L65:
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            int r2 = r0.replyBtnWidth
            int[] r2 = new int[]{r2, r3}
            r1.setIntValues(r2)
            sm1.e r2 = new sm1.e
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            r1.setDuration(r4)
            sm1.f r2 = new sm1.f
            r2.<init>(r0)
            r1.addListener(r2)
            r1.start()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sm1.n.run():void");
    }
}
