package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f120188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f120189e;

    public wh(r45.kv1 kv1Var, com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f120188d = kv1Var;
        this.f120189e = xhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$7$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "selectGift click dot, "
            r7.<init>(r0)
            r45.rv1 r0 = new r45.rv1
            r0.<init>()
            r1 = 15
            r45.kv1 r2 = r6.f120188d
            com.tencent.mm.protobuf.g r1 = r2.getByteString(r1)
            r3 = 0
            if (r1 == 0) goto L35
            byte[] r1 = r1.f192156a
            goto L36
        L35:
            r1 = r3
        L36:
            if (r1 != 0) goto L3a
        L38:
            r0 = r3
            goto L4b
        L3a:
            r0.parseFrom(r1)     // Catch: java.lang.Exception -> L3e
            goto L4b
        L3e:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r4, r1, r0)
            goto L38
        L4b:
            if (r0 == 0) goto L52
            r1 = 1
            java.lang.String r3 = r0.getString(r1)
        L52:
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "Finder.FinderLiveFansModifyGiftWidget"
            com.tencent.mars.xlog.Log.i(r0, r7)
            java.lang.String r7 = "$gift"
            kotlin.jvm.internal.o.f(r2, r7)
            com.tencent.mm.plugin.finder.live.widget.xh r7 = r6.f120189e
            r7.g(r2)
            java.lang.String r7 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget$updateViews$7$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r1, r2, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.wh.onClick(android.view.View):void");
    }
}
