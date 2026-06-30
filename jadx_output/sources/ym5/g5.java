package ym5;

/* loaded from: classes15.dex */
public class g5 extends ym5.i5 implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.SmileySubGrid f463344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.view.SmileySubGrid smileySubGrid, ym5.e5 e5Var) {
        super(smileySubGrid, null);
        this.f463344f = smileySubGrid;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            java.lang.String r0 = "LongPress run"
            java.lang.String r1 = "MicroMsg.emoji.SmileyPanel.SmileySubGrid"
            com.tencent.mars.xlog.Log.i(r1, r0)
            com.tencent.mm.view.SmileySubGrid r0 = r10.f463344f
            int r2 = r0.f213467f
            int r3 = r0.getFirstVisiblePosition()
            int r3 = r2 - r3
            android.view.View r3 = r0.getChildAt(r3)
            if (r3 == 0) goto Lc8
            int r4 = r0.f213467f
            android.widget.ListAdapter r5 = r0.getAdapter()
            int r6 = r0.f213467f
            long r5 = r5.getItemId(r6)
            com.tencent.mm.view.SmileySubGrid r7 = r10.f463388e
            boolean r8 = r7.hasWindowFocus()
            r9 = 0
            if (r8 == 0) goto L36
            int r7 = com.tencent.mm.view.SmileySubGrid.c(r7)
            int r8 = r10.f463387d
            if (r7 != r8) goto L36
            r7 = 1
            goto L37
        L36:
            r7 = r9
        L37:
            if (r7 == 0) goto Lc8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "CheckForLongPress performLongPress position:[%d] id:[%d]"
            com.tencent.mars.xlog.Log.i(r1, r5, r4)
            int r1 = r0.f213479u
            if (r2 == r1) goto Lae
            java.lang.String r1 = "MicroMsg.emoji.SmileyPanel.SmileySubGrid"
            java.lang.String r4 = "jacks begin show:%d"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.i(r1, r4, r5)
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r2)
            com.tencent.mm.view.popview.AbstractPopView r4 = r0.f213473o
            if (r4 != 0) goto L82
            android.content.Context r4 = r0.getContext()
            com.tencent.mm.view.popview.AbstractPopView r4 = gn5.l.a(r4, r1)
            r0.f213473o = r4
            android.view.WindowManager r5 = r0.f213472n
            android.view.WindowManager$LayoutParams r6 = r4.getF213696n()
            r5.addView(r4, r6)
            com.tencent.mm.view.popview.AbstractPopView r4 = r0.f213473o
            r5 = 4
            r4.setVisibility(r5)
        L82:
            java.lang.Object r4 = r0.f213481w
            monitor-enter(r4)
            com.tencent.mm.view.popview.AbstractPopView r5 = r0.f213473o     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L8d
            gn5.l.b(r5, r1)     // Catch: java.lang.Throwable -> Lab
            goto L94
        L8d:
            java.lang.String r1 = "MicroMsg.emoji.SmileyPanel.SmileySubGrid"
            java.lang.String r5 = "mPopImageView is null."
            com.tencent.mars.xlog.Log.i(r1, r5)     // Catch: java.lang.Throwable -> Lab
        L94:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            android.view.WindowManager r1 = r0.f213472n
            com.tencent.mm.view.popview.AbstractPopView r4 = r0.f213473o
            android.view.WindowManager$LayoutParams r5 = r4.getF213696n()
            r1.updateViewLayout(r4, r5)
            com.tencent.mm.view.popview.AbstractPopView r1 = r0.f213473o
            ym5.f5 r4 = new ym5.f5
            r4.<init>(r0, r3)
            r1.post(r4)
            goto Lbd
        Lab:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            throw r0
        Lae:
            java.lang.String r1 = "MicroMsg.emoji.SmileyPanel.SmileySubGrid"
            java.lang.String r3 = "jacks already show:%d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            com.tencent.mars.xlog.Log.i(r1, r3, r4)
        Lbd:
            r0.f213479u = r2
            r1 = -1
            r0.f213466e = r1
            r1 = 5
            r0.f213465d = r1
            r0.setScrollEnable(r9)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ym5.g5.run():void");
    }
}
