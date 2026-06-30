package cw2;

/* loaded from: classes2.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(0);
        this.f223859d = finderFullSeekBarLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (((java.lang.Boolean) r3.invoke()).booleanValue() == true) goto L25;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " onRewindViewDismiss "
            r0.<init>(r1)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r1 = r6.f223859d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r1.H
            r3 = 0
            if (r2 == 0) goto L19
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.getFeedObject()
            if (r2 == 0) goto L19
            java.lang.String r2 = r2.getDebugDescription()
            goto L1a
        L19:
            r2 = r3
        L1a:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Finder.FullSeekBarLayout"
            com.tencent.mars.xlog.Log.i(r2, r0)
            com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout r0 = com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.a(r1)
            if (r0 == 0) goto L30
            android.view.ViewGroup r3 = r0.getSeekerTimeLayout()
        L30:
            r0 = 8
            if (r3 != 0) goto L35
            goto L38
        L35:
            r3.setVisibility(r0)
        L38:
            android.content.Context r2 = r1.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            pf5.z r3 = pf5.z.f353948a
            boolean r4 = r2 instanceof androidx.appcompat.app.AppCompatActivity
            if (r4 == 0) goto L7e
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            pf5.v r2 = r3.a(r2)
            java.lang.Class<rc2.f> r3 = rc2.f.class
            pf5.b0 r2 = r2.e(r3)
            rc2.f r2 = (rc2.f) r2
            if (r2 == 0) goto L72
            yz5.a r3 = r1.isInScaleModeCallback
            r4 = 0
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r3.invoke()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r5 = 1
            if (r3 != r5) goto L6a
            goto L6b
        L6a:
            r5 = r4
        L6b:
            if (r5 == 0) goto L6e
            goto L6f
        L6e:
            r0 = r4
        L6f:
            r2.Y6(r1, r0)
        L72:
            yz5.a r0 = r1.getAdjustPositionCallback()
            if (r0 == 0) goto L7b
            r0.invoke()
        L7b:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        L7e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.m2.invoke():java.lang.Object");
    }
}
