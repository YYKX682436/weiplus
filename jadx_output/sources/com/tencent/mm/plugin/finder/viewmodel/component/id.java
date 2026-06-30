package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class id implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ld f134734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134735e;

    public id(com.tencent.mm.plugin.finder.viewmodel.component.ld ldVar, in5.s0 s0Var) {
        this.f134734d = ldVar;
        this.f134735e = s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r3.e() == false) goto L12;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r6 = r18
            java.lang.String r0 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicFollowPatUIC$onBindView$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r9 = r19
            r4.add(r9)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r18
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            kotlin.jvm.internal.o.d(r19)
            com.tencent.mm.plugin.finder.viewmodel.component.ld r0 = r6.f134734d
            r0.getClass()
            in5.s0 r1 = r6.f134735e
            java.lang.Object r2 = r1.f293125i
            boolean r3 = r2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r3 == 0) goto L33
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r2
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 != 0) goto L37
            goto L9b
        L37:
            jz5.g r3 = r0.f135052g
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6b
            com.tencent.mm.autogen.events.FinderMusicFollowPatPostEvent r3 = new com.tencent.mm.autogen.events.FinderMusicFollowPatPostEvent
            r3.<init>()
            androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
            android.content.Intent r4 = r4.getIntent()
            java.lang.String r5 = "key_source_feed_id"
            long r7 = r2.getItemId()
            r4.putExtra(r5, r7)
            am.nc r4 = r3.f54308g
            androidx.appcompat.app.AppCompatActivity r5 = r0.getActivity()
            r4.f7419a = r5
            boolean r3 = r3.e()
            if (r3 != 0) goto L9b
        L6b:
            xc2.p0 r2 = r0.e7(r2)
            if (r2 != 0) goto L72
            goto L9b
        L72:
            xc2.y2 r10 = xc2.y2.f453343a
            java.lang.String r3 = "getContext(...)"
            android.content.Context r11 = r1.f293121e
            kotlin.jvm.internal.o.f(r11, r3)
            r13 = 0
            r14 = 0
            r15 = 12
            r1 = 0
            r16 = 0
            r12 = r2
            xc2.y2.i(r10, r11, r12, r13, r14, r15, r16)
            xc2.n r7 = xc2.n.f453212a
            android.app.Activity r8 = r0.getContext()
            r11 = 0
            java.lang.String r12 = "feed_jump_carousel"
            r15 = 0
            r16 = 232(0xe8, float:3.25E-43)
            r17 = 0
            r9 = r19
            r10 = r2
            r13 = r1
            xc2.n.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L9b:
            java.lang.String r0 = "onClick"
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicFollowPatUIC$onBindView$1"
            java.lang.String r3 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.id.onClick(android.view.View):void");
    }
}
