package i12;

/* loaded from: classes14.dex */
public class i extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i12.j f287215a;

    public i(i12.j jVar, i12.k kVar) {
        this.f287215a = jVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.f287215a.f287219d.f287221e.getString(com.tencent.mm.R.string.nf9));
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }
}
