package zk1;

/* loaded from: classes14.dex */
public final class k extends android.view.accessibility.AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk1.m f473412a;

    public k(zk1.m mVar) {
        this.f473412a = mVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i17) {
        zk1.m mVar = this.f473412a;
        android.view.accessibility.AccessibilityNodeInfo obtain = android.view.accessibility.AccessibilityNodeInfo.obtain(mVar.f473416a);
        mVar.f473416a.onInitializeAccessibilityNodeInfo(obtain);
        if (obtain != null) {
            obtain.getBoundsInScreen(mVar.f473425j);
        }
        android.graphics.Rect rect = mVar.f473425j;
        int i18 = rect.left;
        android.graphics.Rect rect2 = mVar.f473424i;
        rect.left = i18 - rect2.left;
        rect.top -= rect2.top;
        rect.right += rect2.right;
        rect.bottom += rect2.bottom;
        if (obtain != null) {
            obtain.setBoundsInScreen(rect);
        }
        return obtain;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i17, int i18, android.os.Bundle bundle) {
        return this.f473412a.f473416a.performAccessibilityAction(i18, bundle);
    }
}
