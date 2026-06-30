package my2;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f332728d;

    public f(my2.u uVar) {
        this.f332728d = uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (((mm2.c1) r4.a(mm2.c1.class)).f328784b6 != null) goto L23;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            my2.u r0 = r9.f332728d
            com.tencent.mm.plugin.finder.live.view.k0 r1 = r0.c()
            if (r1 == 0) goto L66
            boolean r1 = r1.isDestroyed()
            r2 = 0
            r3 = 0
            gk2.e r4 = r0.f332763d
            java.lang.Class<mm2.c1> r5 = mm2.c1.class
            if (r1 != 0) goto L52
            androidx.lifecycle.c1 r1 = r4.a(r5)
            mm2.c1 r1 = (mm2.c1) r1
            r45.me2 r1 = r1.f328784b6
            r6 = 1
            r7 = 4
            if (r1 == 0) goto L29
            int r1 = r1.getInteger(r7)
            r8 = 3
            if (r1 != r8) goto L29
            r1 = r6
            goto L2a
        L29:
            r1 = r2
        L2a:
            if (r1 != 0) goto L4a
            androidx.lifecycle.c1 r1 = r4.a(r5)
            mm2.c1 r1 = (mm2.c1) r1
            r45.me2 r1 = r1.f328784b6
            if (r1 == 0) goto L3d
            int r1 = r1.getInteger(r7)
            if (r1 != r7) goto L3d
            goto L3e
        L3d:
            r6 = r2
        L3e:
            if (r6 != 0) goto L4a
            androidx.lifecycle.c1 r1 = r4.a(r5)
            mm2.c1 r1 = (mm2.c1) r1
            r45.me2 r1 = r1.f328784b6
            if (r1 != 0) goto L52
        L4a:
            qo0.b r1 = qo0.b.f365439y2
            r6 = 2
            qo0.c r7 = r0.f332764e
            qo0.c.a(r7, r1, r3, r6, r3)
        L52:
            java.lang.String r0 = r0.f332765f
            java.lang.String r1 = "voteInfo clear"
            com.tencent.mars.xlog.Log.i(r0, r1)
            androidx.lifecycle.c1 r0 = r4.a(r5)
            mm2.c1 r0 = (mm2.c1) r0
            r0.f328784b6 = r3
            r0.f328789c6 = r2
            r0.f328794d6 = r2
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: my2.f.run():void");
    }
}
