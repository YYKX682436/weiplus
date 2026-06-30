package t3;

/* loaded from: classes14.dex */
public class b extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout f415355e;

    public b(androidx.drawerlayout.widget.DrawerLayout drawerLayout) {
        this.f415355e = drawerLayout;
        new android.graphics.Rect();
    }

    @Override // n3.c
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.f415355e;
        android.view.View f17 = drawerLayout.f();
        if (f17 == null) {
            return true;
        }
        int h17 = drawerLayout.h(f17);
        drawerLayout.getClass();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        android.view.Gravity.getAbsoluteGravity(h17, n3.v0.d(drawerLayout));
        return true;
    }

    @Override // n3.c
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(androidx.drawerlayout.widget.DrawerLayout.class.getName());
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        int[] iArr = androidx.drawerlayout.widget.DrawerLayout.G;
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        lVar.n(androidx.drawerlayout.widget.DrawerLayout.class.getName());
        lVar.r(false);
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f342642a;
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) o3.f.f342623e.f342636a);
        accessibilityNodeInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) o3.f.f342624f.f342636a);
    }

    @Override // n3.c
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        int[] iArr = androidx.drawerlayout.widget.DrawerLayout.G;
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
