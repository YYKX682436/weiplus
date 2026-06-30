package fa;

/* loaded from: classes14.dex */
public class a extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.internal.CheckableImageButton f260574e;

    public a(com.google.android.material.internal.CheckableImageButton checkableImageButton) {
        this.f260574e = checkableImageButton;
    }

    @Override // n3.c
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f260574e.isChecked());
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        lVar.m(true);
        lVar.f342642a.setChecked(this.f260574e.isChecked());
    }
}
