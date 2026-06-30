package lw2;

/* loaded from: classes2.dex */
public final class e implements com.tencent.mm.plugin.finder.view.gs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lw2.m f321567a;

    public e(lw2.m mVar) {
        this.f321567a = mVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.gs
    public boolean a(android.view.MotionEvent event) {
        boolean z17;
        kotlin.jvm.internal.o.g(event, "event");
        lw2.m mVar = this.f321567a;
        boolean F = mVar.f321576a.F();
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f17 = mVar.f();
        boolean z18 = f17 != null && f17.y(event);
        if (!mVar.f321578c) {
            return false;
        }
        android.view.View view = (android.view.View) ((jz5.n) mVar.f321584i).getValue();
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getGlobalVisibleRect(rect);
            int pointerCount = event.getPointerCount();
            for (int i17 = 0; i17 < pointerCount; i17++) {
                if (rect.contains((int) event.getX(i17), (int) event.getY(i17))) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
        return (F && z18) ? false : true;
    }
}
