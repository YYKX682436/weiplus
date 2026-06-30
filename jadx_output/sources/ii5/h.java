package ii5;

/* loaded from: classes15.dex */
public class h extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mogic.WxViewPager f291662e;

    public h(com.tencent.mm.ui.mogic.WxViewPager wxViewPager) {
        this.f291662e = wxViewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r1.getCount() > 1) goto L8;
     */
    @Override // n3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onInitializeAccessibilityEvent(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
        /*
            r3 = this;
            super.onInitializeAccessibilityEvent(r4, r5)
            java.lang.Class<com.tencent.mm.ui.mogic.WxViewPager> r4 = com.tencent.mm.ui.mogic.WxViewPager.class
            java.lang.String r4 = r4.getName()
            r5.setClassName(r4)
            android.view.accessibility.AccessibilityRecord r4 = android.view.accessibility.AccessibilityRecord.obtain()
            com.tencent.mm.ui.mogic.WxViewPager r0 = r3.f291662e
            androidx.viewpager.widget.a r1 = com.tencent.mm.ui.mogic.WxViewPager.access$200(r0)
            if (r1 == 0) goto L24
            androidx.viewpager.widget.a r1 = com.tencent.mm.ui.mogic.WxViewPager.access$200(r0)
            int r1 = r1.getCount()
            r2 = 1
            if (r1 <= r2) goto L24
            goto L25
        L24:
            r2 = 0
        L25:
            r4.setScrollable(r2)
            int r5 = r5.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 != r1) goto L4f
            androidx.viewpager.widget.a r5 = com.tencent.mm.ui.mogic.WxViewPager.access$200(r0)
            if (r5 == 0) goto L4f
            androidx.viewpager.widget.a r5 = com.tencent.mm.ui.mogic.WxViewPager.access$200(r0)
            int r5 = r5.getCount()
            r4.setItemCount(r5)
            int r5 = com.tencent.mm.ui.mogic.WxViewPager.access$300(r0)
            r4.setFromIndex(r5)
            int r5 = com.tencent.mm.ui.mogic.WxViewPager.access$300(r0)
            r4.setToIndex(r5)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ii5.h.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // n3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onInitializeAccessibilityNodeInfo(android.view.View r3, o3.l r4) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3, r4)
            java.lang.Class<com.tencent.mm.ui.mogic.WxViewPager> r3 = com.tencent.mm.ui.mogic.WxViewPager.class
            java.lang.String r3 = r3.getName()
            r4.n(r3)
            com.tencent.mm.ui.mogic.WxViewPager r3 = r2.f291662e
            androidx.viewpager.widget.a r0 = com.tencent.mm.ui.mogic.WxViewPager.access$200(r3)
            r1 = 1
            if (r0 == 0) goto L21
            androidx.viewpager.widget.a r0 = com.tencent.mm.ui.mogic.WxViewPager.access$200(r3)
            int r0 = r0.getCount()
            if (r0 <= r1) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = 0
        L22:
            r4.t(r0)
            boolean r0 = r3.canScrollHorizontally(r1)
            if (r0 == 0) goto L30
            r0 = 4096(0x1000, float:5.74E-42)
            r4.a(r0)
        L30:
            r0 = -1
            boolean r3 = r3.canScrollHorizontally(r0)
            if (r3 == 0) goto L3c
            r3 = 8192(0x2000, float:1.148E-41)
            r4.a(r3)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ii5.h.onInitializeAccessibilityNodeInfo(android.view.View, o3.l):void");
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        int i18;
        int i19;
        if (super.performAccessibilityAction(view, i17, bundle)) {
            return true;
        }
        com.tencent.mm.ui.mogic.WxViewPager wxViewPager = this.f291662e;
        if (i17 == 4096) {
            if (!wxViewPager.canScrollHorizontally(1)) {
                return false;
            }
            i18 = wxViewPager.mCurItem;
            wxViewPager.setCurrentItem(i18 + 1);
            return true;
        }
        if (i17 != 8192 || !wxViewPager.canScrollHorizontally(-1)) {
            return false;
        }
        i19 = wxViewPager.mCurItem;
        wxViewPager.setCurrentItem(i19 - 1);
        return true;
    }
}
