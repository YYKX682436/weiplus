package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f117115e;

    public g6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var, android.view.View view) {
        this.f117114d = b8Var;
        this.f117115e = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (((mm2.c1) r1.a(mm2.c1.class)).O7() == true) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.live.viewmodel.b8 r0 = r7.f117114d
            gk2.e r1 = r0.f116944o
            r2 = 0
            if (r1 == 0) goto L17
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r1.a(r3)
            mm2.c1 r1 = (mm2.c1) r1
            boolean r1 = r1.O7()
            r3 = 1
            if (r1 != r3) goto L17
            goto L18
        L17:
            r3 = r2
        L18:
            if (r3 != 0) goto L1d
            com.tencent.mm.plugin.finder.live.viewmodel.b8.O6(r0)
        L1d:
            int r1 = r0.f116955z
            r3 = -1
            if (r1 != r3) goto L2c
            androidx.appcompat.app.AppCompatActivity r1 = r0.getActivity()
            int r1 = com.tencent.mm.ui.bl.c(r1)
            r0.f116955z = r1
        L2c:
            android.view.View r1 = r7.f117115e
            int r3 = r1.getPaddingLeft()
            int r4 = r1.getPaddingTop()
            int r5 = r1.getPaddingRight()
            int r6 = r1.getPaddingBottom()
            int r0 = r0.f116955z
            if (r0 >= 0) goto L43
            goto L44
        L43:
            r2 = r0
        L44:
            int r6 = r6 + r2
            r1.setPadding(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.g6.run():void");
    }
}
