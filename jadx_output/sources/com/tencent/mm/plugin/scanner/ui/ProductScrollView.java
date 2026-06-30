package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class ProductScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.i0 f159307d;

    public ProductScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r8 > 1.0f) goto L40;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollChanged(int r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            super.onScrollChanged(r5, r6, r7, r8)
            com.tencent.mm.plugin.scanner.ui.i0 r5 = r4.f159307d
            if (r5 == 0) goto L70
            com.tencent.mm.plugin.scanner.ui.c1 r5 = (com.tencent.mm.plugin.scanner.ui.c1) r5
            com.tencent.mm.plugin.scanner.ui.d1 r5 = r5.f159515a
            com.tencent.mm.plugin.scanner.ui.ProductScrollView r6 = r5.f159527a
            int r6 = r6.getScrollY()
            com.tencent.mm.plugin.scanner.ui.ProductUI r7 = r5.f159530d
            r8 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L1b
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L31
        L1b:
            int r1 = r7.f159325w
            int r2 = r5.f159528b
            int r2 = r1 - r2
            if (r6 >= r2) goto L30
            float r1 = (float) r1
            int r2 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r2 != 0) goto L29
            goto L30
        L29:
            float r6 = (float) r6
            r2 = 1068457001(0x3faf5c29, float:1.37)
            float r6 = r6 * r2
            float r6 = r6 / r1
            goto L31
        L30:
            r6 = r0
        L31:
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 != 0) goto L3e
            boolean r1 = r5.f159529c
            if (r1 == 0) goto L3a
            goto L70
        L3a:
            r1 = 1
            r5.f159529c = r1
            goto L41
        L3e:
            r1 = 0
            r5.f159529c = r1
        L41:
            android.widget.LinearLayout r5 = r7.f159318p
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            if (r5 == 0) goto L58
            float r2 = r0 - r6
            float r2 = r2 - r1
            int r3 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r3 > 0) goto L50
            r2 = r8
        L50:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L55
            r2 = r0
        L55:
            r7.f7(r5, r2)
        L58:
            android.view.View r5 = r7.f159320r
            if (r5 == 0) goto L70
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L61
            goto L6d
        L61:
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L66
            goto L6c
        L66:
            float r8 = r6 + r1
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 <= 0) goto L6d
        L6c:
            r8 = r0
        L6d:
            r7.f7(r5, r8)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.ProductScrollView.onScrollChanged(int, int, int, int):void");
    }

    public void setOnScrollListener(com.tencent.mm.plugin.scanner.ui.i0 i0Var) {
        this.f159307d = i0Var;
    }

    public ProductScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
