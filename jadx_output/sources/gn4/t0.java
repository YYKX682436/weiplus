package gn4;

/* loaded from: classes2.dex */
public class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273655d;

    public t0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI) {
        this.f273655d = topStoryFSVideoUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (r2 <= r9) goto L17;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r21, android.view.MotionEvent r22) {
        /*
            r20 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r21
            r4.add(r5)
            r6 = r22
            r4.add(r6)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r20
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r0 = r20
            com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI r1 = r0.f273655d
            android.view.View r2 = r1.f175162u
            int r2 = r2.getVisibility()
            r3 = 0
            if (r2 != 0) goto Ld0
            float r2 = r22.getX()
            float r4 = r22.getY()
            android.view.View r5 = r1.f175164w
            r1.getClass()
            if (r5 != 0) goto L41
            goto L6b
        L41:
            r6 = 2
            int[] r6 = new int[r6]
            r5.getLocationOnScreen(r6)
            r7 = r6[r3]
            r8 = 1
            r6 = r6[r8]
            int r9 = r5.getMeasuredWidth()
            int r9 = r9 + r7
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r6
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L6b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L6b
            float r4 = (float) r7
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L6b
            float r4 = (float) r9
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L6b
            goto L6c
        L6b:
            r8 = r3
        L6c:
            if (r8 == 0) goto L86
            java.lang.String r1 = "MicroMsg.TopStory.TopStoryFSVideoUI"
            java.lang.String r2 = "touch in mContentViewNotFull"
            com.tencent.mars.xlog.Log.i(r1, r2)
            java.lang.String r8 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r9 = "android/view/View$OnTouchListener"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r6 = 0
            r7 = r20
            yj0.a.i(r6, r7, r8, r9, r10, r11)
            return r3
        L86:
            android.view.View r1 = r1.f175162u
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r4 = zj0.c.f473285a
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.add(r4)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r13 = r2.toArray()
            java.lang.String r14 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r15 = "onTouch"
            java.lang.String r16 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            yj0.a.d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r14 = "onTouch"
            java.lang.String r15 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r12 = r1
            yj0.a.f(r12, r13, r14, r15, r16, r17, r18)
        Ld0:
            java.lang.String r8 = "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$6"
            java.lang.String r9 = "android/view/View$OnTouchListener"
            java.lang.String r10 = "onTouch"
            java.lang.String r11 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r6 = 0
            r7 = r20
            yj0.a.i(r6, r7, r8, r9, r10, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gn4.t0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
