package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class c9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123589d;

    public c9(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123589d = obVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r1.R6() == true) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.tencent.mm.plugin.finder.profile.uic.ob r0 = r8.f123589d
            jz5.g r1 = r0.P
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.mm.ui.widget.imageview.WeImageView) r1
            r2 = 8
            r1.setVisibility(r2)
            kk.l r1 = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r
            java.lang.String r2 = r0.getUsername()
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.l2 r1 = (com.tencent.mm.plugin.finder.profile.uic.l2) r1
            android.app.Activity r1 = r0.getContext()
            java.lang.String r2 = "context"
            kotlin.jvm.internal.o.g(r1, r2)
            pf5.z r3 = pf5.z.f353948a
            boolean r4 = r1 instanceof androidx.appcompat.app.AppCompatActivity
            java.lang.String r5 = "Check failed."
            if (r4 == 0) goto L95
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            pf5.v r1 = r3.a(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.profile.uic.o0> r4 = com.tencent.mm.plugin.finder.profile.uic.o0.class
            pf5.b0 r1 = r1.e(r4)
            com.tencent.mm.plugin.finder.profile.uic.o0 r1 = (com.tencent.mm.plugin.finder.profile.uic.o0) r1
            r6 = 0
            if (r1 == 0) goto L47
            boolean r1 = r1.R6()
            r7 = 1
            if (r1 != r7) goto L47
            goto L48
        L47:
            r7 = r6
        L48:
            boolean r1 = r0.getFragmentMode()
            if (r1 == 0) goto L6e
            if (r7 == 0) goto L6e
            jz5.g r1 = r0.P
            r7 = r1
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.mm.ui.widget.imageview.WeImageView) r7
            r7.setVisibility(r6)
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.mm.ui.widget.imageview.WeImageView) r1
            com.tencent.mm.plugin.finder.profile.uic.b9 r6 = new com.tencent.mm.plugin.finder.profile.uic.b9
            r6.<init>(r0)
            r1.setOnClickListener(r6)
        L6e:
            android.app.Activity r0 = r0.getContext()
            kotlin.jvm.internal.o.g(r0, r2)
            boolean r1 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L8b
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r3.a(r0)
            pf5.b0 r0 = r0.e(r4)
            com.tencent.mm.plugin.finder.profile.uic.o0 r0 = (com.tencent.mm.plugin.finder.profile.uic.o0) r0
            if (r0 == 0) goto L8a
            r0.S6()
        L8a:
            return
        L8b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        L95:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.uic.c9.run():void");
    }
}
