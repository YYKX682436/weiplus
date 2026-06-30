package ra3;

/* loaded from: classes14.dex */
public final class r extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f393528a;

    public r(boolean z17) {
        this.f393528a = z17;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View host, android.view.accessibility.AccessibilityEvent event) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(event, "event");
        if (!this.f393528a) {
            return super.dispatchPopulateAccessibilityEvent(host, event);
        }
        kotlin.jvm.internal.o.f(event.getText(), "getText(...)");
        if (!(!r2.isEmpty())) {
            return true;
        }
        event.getText().clear();
        return true;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup host, android.view.View child, android.view.accessibility.AccessibilityEvent event) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f393528a) {
            return true;
        }
        return super.onRequestSendAccessibilityEvent(host, child, event);
    }
}
