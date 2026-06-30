package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final /* synthetic */ class ImageGalleryUI$$s implements yz5.p {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0.f201322c == true) goto L8;
     */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            com.tencent.mm.ui.chatting.gallery.g4 r5 = (com.tencent.mm.ui.chatting.gallery.g4) r5
            java.lang.String r6 = (java.lang.String) r6
            r5.getClass()
            java.lang.String r0 = "errorTips"
            kotlin.jvm.internal.o.g(r6, r0)
            com.tencent.mm.ui.chatting.gallery.r3 r0 = r5.f200950e
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r0.f201322c
            r2 = 1
            if (r0 != r2) goto L17
            goto L18
        L17:
            r2 = r1
        L18:
            r0 = 0
            if (r2 == 0) goto L5b
            android.widget.TextView r2 = r5.f200954i
            java.lang.String r3 = "errorTipsOnSeekbar"
            if (r2 == 0) goto L57
            r2.setText(r6)
            android.widget.TextView r5 = r5.f200954i
            if (r5 == 0) goto L53
            int r6 = r5.getVisibility()
            if (r6 != 0) goto L4f
            r5.clearAnimation()
            r6 = 10
            float[] r6 = new float[r6]
            r6 = {x005c: FILL_ARRAY_DATA , data: [0, -1046478848, 1101004800, -1046478848, 1101004800, -1054867456, 1092616192, -1063256064, 1084227584, 0} // fill-array
            java.lang.String r2 = "translationX"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r5, r2, r6)
            r2 = 600(0x258, double:2.964E-321)
            r6.setDuration(r2)
            android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator
            r2.<init>()
            r6.setInterpolator(r2)
            r6.start()
        L4f:
            r5.setVisibility(r1)
            goto L5b
        L53:
            kotlin.jvm.internal.o.o(r3)
            throw r0
        L57:
            kotlin.jvm.internal.o.o(r3)
            throw r0
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
