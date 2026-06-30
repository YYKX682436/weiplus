package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class va implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210851e;

    public va(com.tencent.mm.ui.tools.ShowImageUI showImageUI, android.view.View view) {
        this.f210851e = showImageUI;
        this.f210850d = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r0.Y6(r0) == false) goto L6;
     */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGlobalLayout() {
        /*
            r6 = this;
            android.view.View r0 = r6.f210850d
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r6)
            com.tencent.mm.ui.tools.ShowImageUI r0 = r6.f210851e
            int r1 = i65.a.B(r0)
            int r2 = i65.a.k(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "MicroMsg.ShowImageUI"
            java.lang.String r5 = "handleHorizontalUI width = %d, height = %d"
            com.tencent.mars.xlog.Log.i(r4, r5, r3)
            if (r1 > r2) goto L30
            int r1 = com.tencent.mm.ui.tools.ShowImageUI.f210190u
            boolean r1 = r0.Y6(r0)
            if (r1 != 0) goto L3e
        L30:
            r1 = 24
            boolean r1 = fp.h.c(r1)
            if (r1 == 0) goto L42
            boolean r1 = r0.isInMultiWindowMode()
            if (r1 == 0) goto L42
        L3e:
            com.tencent.mm.ui.tools.ShowImageUI.T6(r0)
            goto L64
        L42:
            int r1 = com.tencent.mm.ui.tools.ShowImageUI.f210190u
            r0.getClass()
            r1 = 2131165523(0x7f070153, float:1.7945266E38)
            int r1 = i65.a.f(r0, r1)
            int r2 = r0.f210195h
            r3 = 1
            if (r2 != r3) goto L64
            android.widget.RelativeLayout r0 = r0.f210202r
            r2 = 2131296472(0x7f0900d8, float:1.8210862E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 == 0) goto L64
            r2 = 0
            r0.setPadding(r1, r2, r1, r2)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.va.onGlobalLayout():void");
    }
}
