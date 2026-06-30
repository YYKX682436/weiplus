package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jl0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ll0 f113137d;

    public jl0(com.tencent.mm.plugin.finder.live.plugin.ll0 ll0Var) {
        this.f113137d = ll0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r6.g7(r7) == true) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            com.tencent.mm.plugin.finder.live.plugin.ll0 r0 = r9.f113137d
            android.view.ViewGroup r1 = r0.f365323d
            android.content.Context r1 = r1.getContext()
            r2 = 24
            int r1 = com.tencent.mm.ui.zk.a(r1, r2)
            android.view.ViewGroup r2 = r0.f365323d
            android.content.Context r2 = r2.getContext()
            r3 = 16
            int r2 = com.tencent.mm.ui.zk.a(r2, r3)
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.ag0> r3 = com.tencent.mm.plugin.finder.live.plugin.ag0.class
            com.tencent.mm.plugin.finder.live.plugin.l r3 = r0.X0(r3)
            com.tencent.mm.plugin.finder.live.plugin.ag0 r3 = (com.tencent.mm.plugin.finder.live.plugin.ag0) r3
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L45
            java.lang.Class<jf2.k0> r6 = jf2.k0.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r6 = r3.U0(r6)
            jf2.k0 r6 = (jf2.k0) r6
            com.tencent.mm.plugin.finder.live.widget.e40 r7 = r3.F
            if (r6 == 0) goto L3a
            boolean r6 = r6.g7(r7)
            r8 = 1
            if (r6 != r8) goto L3a
            goto L3b
        L3a:
            r8 = r5
        L3b:
            if (r8 == 0) goto L42
            el2.u2 r3 = r3.f111879J
            android.view.ViewGroup r3 = r3.f253921d
            goto L46
        L42:
            android.view.ViewGroup r3 = r7.f118224d
            goto L46
        L45:
            r3 = r4
        L46:
            if (r3 == 0) goto L4c
            int[] r4 = pm0.v.t(r3)
        L4c:
            if (r3 == 0) goto L53
            int r6 = r3.getWidth()
            goto L54
        L53:
            r6 = r5
        L54:
            if (r3 == 0) goto L5b
            int r7 = r3.getPaddingStart()
            goto L5c
        L5b:
            r7 = r5
        L5c:
            int r6 = r6 - r7
            if (r3 == 0) goto L64
            int r7 = r3.getPaddingEnd()
            goto L65
        L64:
            r7 = r5
        L65:
            int r6 = r6 - r7
            if (r4 == 0) goto L73
            java.lang.Integer r4 = kz5.z.S(r4, r5)
            if (r4 == 0) goto L73
            int r4 = r4.intValue()
            goto L74
        L73:
            r4 = r5
        L74:
            if (r3 == 0) goto L7a
            int r5 = r3.getPaddingStart()
        L7a:
            int r4 = r4 + r5
            int r6 = r6 / 2
            int r4 = r4 + r6
            android.widget.RelativeLayout r3 = r0.f113411p
            int r3 = r3.getWidth()
            int r3 = r3 + r2
            android.view.ViewGroup r5 = r0.f365323d
            android.content.Context r5 = r5.getContext()
            android.graphics.Point r5 = com.tencent.mm.ui.bl.b(r5)
            int r5 = r5.x
            int r5 = r5 - r3
            int r5 = r5 - r2
            int r3 = r3 - r4
            if (r3 >= r1) goto Lb3
            android.view.ViewGroup r2 = r0.f365323d
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            float r1 = (float) r1
            float r3 = r3 + r1
            android.view.View r0 = r0.f113412q
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r3 = r3 + r0
            float r0 = (float) r5
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Laf
            r3 = r0
        Laf:
            r2.setTranslationX(r3)
            goto Lb9
        Lb3:
            android.view.ViewGroup r0 = r0.f365323d
            r1 = 0
            r0.setTranslationX(r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.jl0.run():void");
    }
}
