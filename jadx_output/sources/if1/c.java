package if1;

/* loaded from: classes4.dex */
public class c extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291063b;

    public c(java.lang.String str, java.lang.String str2) {
        this.f291062a = str;
        this.f291063b = str2;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        java.lang.String str = this.f291062a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            accessibilityNodeInfo.setContentDescription(str);
        }
        java.lang.String str2 = this.f291063b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str2.equalsIgnoreCase("button")) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setClassName(android.widget.TextView.class.getName());
        } else {
            accessibilityNodeInfo.setClickable(true);
            accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
        }
    }
}
