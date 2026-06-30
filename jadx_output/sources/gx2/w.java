package gx2;

/* loaded from: classes2.dex */
public final class w extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout f277389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f277390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx2.r f277391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f277392g;

    public w(com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout finderDraggableLayout, int i17, gx2.r rVar, yz5.a aVar) {
        this.f277389d = finderDraggableLayout;
        this.f277390e = i17;
        this.f277391f = rVar;
        this.f277392g = aVar;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f277389d.setSettling(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r6.getTranslation() == r6.getBorderExpand()) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
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
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout r6 = r5.f277389d
            r0 = 0
            r6.setSettling(r0)
            int r1 = r6.getEdgeAttached()
            int r1 = -r1
            r2 = 1
            int r3 = r5.f277390e
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
            goto L5a
        L3b:
            int r1 = r6.getEdgeAttached()
            if (r3 != r1) goto L5a
            float r1 = r6.getTranslation()
            float r3 = r6.getBorderClose()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4f
            r1 = r2
            goto L50
        L4f:
            r1 = r0
        L50:
            if (r1 == 0) goto L5a
            gx2.r r1 = r5.f277391f
            r6.h(r1)
            r6.setDrawerOpen(r0)
        L5a:
            float r1 = r6.getTranslation()
            float r3 = r6.getBorderExpand()
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L68
            r3 = r2
            goto L69
        L68:
            r3 = r0
        L69:
            if (r3 == 0) goto L74
            r6.e()
            gx2.s r0 = gx2.s.f277382f
            r6.setCurrentState(r0)
            goto L87
        L74:
            float r3 = r6.getBorderPeek()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L7d
            r0 = r2
        L7d:
            if (r0 == 0) goto L87
            r6.g()
            gx2.s r0 = gx2.s.f277381e
            r6.setCurrentState(r0)
        L87:
            yz5.a r6 = r5.f277392g
            if (r6 == 0) goto L8e
            r6.invoke()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx2.w.onAnimationEnd(android.animation.Animator):void");
    }
}
