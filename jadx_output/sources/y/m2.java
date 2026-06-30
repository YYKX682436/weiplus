package y;

/* loaded from: classes16.dex */
public final class m2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout f458399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f458400e;

    public m2(com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout, yz5.a aVar) {
        this.f458399d = finderLiveInterceptRelativeLayout;
        this.f458400e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver = this.f458399d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.f458400e.invoke();
    }
}
