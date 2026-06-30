package y9;

/* loaded from: classes14.dex */
public class f extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.i f460245e;

    public f(y9.i iVar) {
        this.f460245e = iVar;
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        boolean z17 = this.f460245e.f460248g;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f342642a;
        if (!z17) {
            accessibilityNodeInfo.setDismissable(false);
        } else {
            lVar.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
        }
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        if (i17 == 1048576) {
            y9.i iVar = this.f460245e;
            if (iVar.f460248g) {
                iVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i17, bundle);
    }
}
