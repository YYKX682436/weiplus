package ng2;

/* loaded from: classes10.dex */
public final class d implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.g f336960d;

    public d(ng2.g gVar) {
        this.f336960d = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver;
        ng2.g gVar = this.f336960d;
        android.widget.FrameLayout frameLayout = gVar.f336957s;
        if (frameLayout != null && (viewTreeObserver = frameLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.tencent.mars.xlog.Log.i(gVar.f318557e, "addCoverViewContainerToWindow onPreDraw");
        android.view.ViewGroup viewGroup = gVar.f318566q;
        if (viewGroup == null) {
            return true;
        }
        viewGroup.setVisibility(4);
        return true;
    }
}
