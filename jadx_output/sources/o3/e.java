package o3;

/* loaded from: classes14.dex */
public final class e implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final o3.d f342622d;

    public e(o3.d dVar) {
        this.f342622d = dVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o3.e) {
            return this.f342622d.equals(((o3.e) obj).f342622d);
        }
        return false;
    }

    public int hashCode() {
        return this.f342622d.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z17) {
        this.f342622d.onTouchExplorationStateChanged(z17);
    }
}
