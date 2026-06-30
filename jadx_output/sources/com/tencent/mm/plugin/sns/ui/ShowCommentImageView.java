package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes5.dex */
public class ShowCommentImageView extends android.widget.ImageView {

    /* renamed from: e, reason: collision with root package name */
    public static android.graphics.Bitmap f166627e;

    /* renamed from: f, reason: collision with root package name */
    public static android.graphics.Bitmap f166628f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Field f166629g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.reflect.Field f166630h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f166631i;

    /* renamed from: d, reason: collision with root package name */
    public boolean f166632d;

    public ShowCommentImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166632d = false;
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        if (f166629g != null && f166630h != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
            return;
        }
        try {
            f166629g = android.view.View.class.getDeclaredField("mDrawingCache");
            f166630h = android.view.View.class.getDeclaredField("mUnscaledDrawingCache");
            f166629g.setAccessible(true);
            f166630h.setAccessible(true);
            f166631i = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShowCommentImageView", "init error: %s", e17.getMessage());
            f166631i = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    public final void b(boolean z17, boolean z18) {
        java.lang.reflect.Field field;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        try {
            field = z17 ? f166629g : f166630h;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", e17.getMessage());
        }
        if (z18) {
            field.set(this, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        } else {
            android.graphics.Bitmap bitmap = z17 ? f166628f : f166627e;
            if (bitmap != null) {
                field.set(this, bitmap);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void buildDrawingCache(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = "buildDrawingCache"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.ShowCommentImageView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166631i
            if (r2 == 0) goto La0
            boolean r2 = r8.f166632d
            r3 = 1
            if (r2 != 0) goto L99
            java.lang.String r2 = "checkIfCanReuseDrawingCache"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            boolean r4 = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166631i
            java.lang.String r5 = "MicroMsg.ShowCommentImageView"
            r6 = 0
            if (r4 != 0) goto L21
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L1f:
            r3 = r6
            goto L4f
        L21:
            if (r9 == 0) goto L26
            java.lang.reflect.Field r4 = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166629g     // Catch: java.lang.Exception -> L36
            goto L28
        L26:
            java.lang.reflect.Field r4 = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166630h     // Catch: java.lang.Exception -> L36
        L28:
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Exception -> L36
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Exception -> L36
            if (r4 == 0) goto L31
            goto L32
        L31:
            r3 = r6
        L32:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L4f
        L36:
            r3 = move-exception
            java.lang.String r4 = ""
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r3, r4, r7)
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "checkIfCanReuseDrawingCache error: %s"
            com.tencent.mars.xlog.Log.e(r5, r4, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L1f
        L4f:
            if (r3 != 0) goto L95
            if (r9 == 0) goto L56
            android.graphics.Bitmap r2 = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166628f
            goto L58
        L56:
            android.graphics.Bitmap r2 = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166627e
        L58:
            if (r2 == 0) goto L64
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L64
            r8.b(r9, r6)
            goto La3
        L64:
            super.buildDrawingCache(r9)
            java.lang.String r2 = "getStaticDrawingCache"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            if (r9 == 0) goto L71
            java.lang.reflect.Field r3 = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166629g     // Catch: java.lang.Exception -> L83
            goto L73
        L71:
            java.lang.reflect.Field r3 = com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166630h     // Catch: java.lang.Exception -> L83
        L73:
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Exception -> L83
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Exception -> L83
            if (r3 == 0) goto L91
            if (r9 == 0) goto L80
            com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166628f = r3     // Catch: java.lang.Exception -> L83
            goto L91
        L80:
            com.tencent.mm.plugin.sns.ui.ShowCommentImageView.f166627e = r3     // Catch: java.lang.Exception -> L83
            goto L91
        L83:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r3 = "getStaticDrawingCache error: %s"
            com.tencent.mars.xlog.Log.e(r5, r3, r9)
        L91:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto La3
        L95:
            super.buildDrawingCache(r9)
            goto La3
        L99:
            r8.b(r9, r3)
            super.buildDrawingCache(r9)
            goto La3
        La0:
            super.buildDrawingCache(r9)
        La3:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.ShowCommentImageView.buildDrawingCache(boolean):void");
    }

    @Override // android.view.View
    public void destroyDrawingCache() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.destroyDrawingCache();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        try {
            f166629g.set(this, null);
            f166630h.set(this, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShowCommentImageView", "setDrawingCache error: %s", e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDrawingCache", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            postDelayed(new com.tencent.mm.plugin.sns.ui.n8(this), 100L);
        } else {
            this.f166632d = true;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        super.setOnClickListener(new com.tencent.mm.plugin.sns.ui.m8(this, onClickListener));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
    }

    public ShowCommentImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166632d = false;
        a();
    }
}
