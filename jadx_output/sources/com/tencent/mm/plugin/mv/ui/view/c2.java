package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class c2 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.h2 f151791d;

    public c2(com.tencent.mm.plugin.mv.ui.view.h2 h2Var) {
        this.f151791d = h2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        r7.notifyDataSetChanged();
     */
    @Override // in5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s2(androidx.recyclerview.widget.f2 r7, android.view.View r8, int r9, androidx.recyclerview.widget.k3 r10) {
        /*
            r6 = this;
            in5.s0 r10 = (in5.s0) r10
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r8 = "holder"
            kotlin.jvm.internal.o.g(r10, r8)
            com.tencent.mm.plugin.mv.ui.view.h2 r8 = r6.f151791d
            java.util.ArrayList r10 = r8.f151842e
            int r0 = r10.size()
            r1 = 0
            if (r0 <= r9) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = r1
        L20:
            r2 = 0
            if (r0 == 0) goto L24
            goto L25
        L24:
            r10 = r2
        L25:
            if (r10 == 0) goto Le6
            java.lang.Object r9 = r10.get(r9)
            com.tencent.mm.plugin.mv.ui.view.d2 r9 = (com.tencent.mm.plugin.mv.ui.view.d2) r9
            if (r9 == 0) goto Le6
            fm3.u r10 = r8.f151846i
            fm3.u r9 = r9.f151808e
            boolean r10 = kotlin.jvm.internal.o.b(r10, r9)
            if (r10 != 0) goto Le1
            r8.f151846i = r9
            android.content.Context r10 = r8.f151841d
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r10, r0)
            pf5.z r0 = pf5.z.f353948a
            boolean r3 = r10 instanceof androidx.appcompat.app.AppCompatActivity
            if (r3 == 0) goto Ld5
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            pf5.v r10 = r0.a(r10)
            java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC> r0 = com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class
            androidx.lifecycle.c1 r10 = r10.a(r0)
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r10 = (com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) r10
            r10.getClass()
            java.lang.String r0 = "musicMv"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "start switchToMv from musicMv, dataList.size:"
            r0.<init>(r3)
            java.util.ArrayList r3 = r10.f150977g
            int r4 = r3.size()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r10.f150974d
            com.tencent.mars.xlog.Log.i(r4, r0)
            java.util.Iterator r0 = r3.iterator()
        L7c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Ld1
            java.lang.Object r3 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto Lcd
            lm3.e r3 = (lm3.e) r3
            fm3.u r3 = r3.f319482d
            boolean r3 = kotlin.jvm.internal.o.b(r3, r9)
            if (r3 == 0) goto Lcb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "switchToMv index:"
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r4, r9)
            r10.X6(r1)
            java.lang.Class<nd0.e> r9 = nd0.e.class
            i95.m r9 = i95.n0.c(r9)
            nd0.e r9 = (nd0.e) r9
            android.app.Activity r0 = r10.getContext()
            md0.e r9 = (md0.e) r9
            r2 = 7
            java.lang.Class<r45.bt4> r3 = r45.bt4.class
            com.tencent.mm.protobuf.f r9 = r9.Ui(r0, r2, r3)
            r45.bt4 r9 = (r45.bt4) r9
            if (r9 != 0) goto Lc3
            goto Lc7
        Lc3:
            r0 = 12
            r9.f371036d = r0
        Lc7:
            r10.Z6(r1)
            goto Ld1
        Lcb:
            r1 = r5
            goto L7c
        Lcd:
            kz5.c0.p()
            throw r2
        Ld1:
            r7.notifyDataSetChanged()
            goto Le1
        Ld5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Le1:
            wl3.e r7 = r8.f151843f
            r7.c()
        Le6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.view.c2.s2(androidx.recyclerview.widget.f2, android.view.View, int, androidx.recyclerview.widget.k3):void");
    }
}
