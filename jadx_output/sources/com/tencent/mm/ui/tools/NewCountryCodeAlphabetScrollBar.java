package com.tencent.mm.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/tools/NewCountryCodeAlphabetScrollBar;", "Lcom/tencent/mm/ui/base/AlphabetScrollBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class NewCountryCodeAlphabetScrollBar extends com.tencent.mm.ui.base.AlphabetScrollBar {
    public NewCountryCodeAlphabetScrollBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.AlphabetScrollBar, com.tencent.mm.ui.base.VerticalScrollBar
    public void c() {
        super.c();
        this.f197706f = new java.lang.String[]{"🔍", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "X", "Y", "Z"};
    }

    public final void e(java.lang.String header, boolean z17) {
        kotlin.jvm.internal.o.g(header, "header");
        java.lang.String[] alphabet = this.f197706f;
        kotlin.jvm.internal.o.f(alphabet, "alphabet");
        int X = kz5.z.X(alphabet, header);
        if (z17 && X >= 0) {
            java.lang.String[] strArr = this.f197706f;
            if (X < strArr.length) {
                this.f197707g = X;
                d(strArr[X]);
                this.f197711n = true;
                invalidate();
            }
        }
        this.f197707g = 0;
        this.f197711n = false;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if ((r4.getAction() == 3) != false) goto L11;
     */
    @Override // com.tencent.mm.ui.base.VerticalScrollBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            super.onTouchEvent(r4)
            int r0 = r4.getAction()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 != 0) goto L1a
            int r4 = r4.getAction()
            r0 = 3
            if (r4 != r0) goto L18
            r1 = r2
        L18:
            if (r1 == 0) goto L20
        L1a:
            int r4 = r3.f197707g
            if (r4 == 0) goto L20
            r3.f197711n = r2
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
