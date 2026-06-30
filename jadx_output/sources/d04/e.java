package d04;

/* loaded from: classes8.dex */
public final class e extends db5.w5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView f225406d;

    public e(com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView) {
        this.f225406d = baseScrollTabView;
    }

    @Override // db5.w5, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.scanner.ui.widget.BaseScrollTabView baseScrollTabView = this.f225406d;
        boolean z17 = baseScrollTabView.B == baseScrollTabView.f159671i;
        if (java.lang.Math.abs(f17) > java.lang.Math.abs(f18) && z17) {
            java.util.ArrayList arrayList = baseScrollTabView.f159669g;
            if (f17 <= -100.0f) {
                int i17 = baseScrollTabView.f159671i + 1;
                if (i17 >= 0 && i17 < arrayList.size()) {
                    baseScrollTabView.C = true;
                    baseScrollTabView.h(i17, 2);
                }
            } else if (f17 >= 100.0f) {
                int i18 = baseScrollTabView.f159671i - 1;
                if (i18 >= 0 && i18 < arrayList.size()) {
                    baseScrollTabView.C = true;
                    baseScrollTabView.h(i18, 2);
                }
            }
        }
        return false;
    }
}
