package lm4;

/* loaded from: classes14.dex */
public final class k extends lm4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout f319578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f319579e;

    public k(com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout tingPlayerDraggableLayout, int i17) {
        this.f319578d = tingPlayerDraggableLayout;
        this.f319579e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f319578d.setSettling(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r6.getTranslation() == r6.getBorderExpand()) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAnimationEnd(android.animation.Animator r6) {
        /*
            r5 = this;
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.o.g(r6, r0)
            com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout r6 = r5.f319578d
            r0 = 0
            r6.setSettling(r0)
            int r1 = r6.getEdgeAttached()
            int r1 = -r1
            r2 = 1
            int r3 = r5.f319579e
            if (r3 != r1) goto L3b
            float r1 = r6.getTranslation()
            float r4 = r6.getBorderPeek()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = r0
        L24:
            if (r1 != 0) goto L37
            float r1 = r6.getTranslation()
            float r4 = r6.getBorderExpand()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L34
            r1 = r2
            goto L35
        L34:
            r1 = r0
        L35:
            if (r1 == 0) goto L3b
        L37:
            r6.setDrawerOpen(r2)
            goto L55
        L3b:
            int r1 = r6.getEdgeAttached()
            if (r3 != r1) goto L55
            float r1 = r6.getTranslation()
            float r3 = r6.getBorderClose()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4f
            r1 = r2
            goto L50
        L4f:
            r1 = r0
        L50:
            if (r1 == 0) goto L55
            r6.setDrawerOpen(r0)
        L55:
            float r1 = r6.getTranslation()
            float r3 = r6.getBorderExpand()
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L63
            r3 = r2
            goto L64
        L63:
            r3 = r0
        L64:
            if (r3 == 0) goto L6a
            r6.c()
            goto L78
        L6a:
            float r3 = r6.getBorderPeek()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L73
            r0 = r2
        L73:
            if (r0 == 0) goto L78
            r6.e()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm4.k.onAnimationEnd(android.animation.Animator):void");
    }
}
