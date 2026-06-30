package ze5;

/* loaded from: classes9.dex */
public class ha implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.ia f471978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f471979e;

    public ha(ze5.ia iaVar, boolean z17) {
        this.f471978d = iaVar;
        this.f471979e = z17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ze5.ia iaVar = this.f471978d;
        iaVar.f472015h.getViewTreeObserver().removeOnPreDrawListener(this);
        iaVar.f472016i.setGravity((iaVar.f472015h.getWidth() <= iaVar.clickArea.getWidth() || this.f471979e) ? 3 : 5);
        return true;
    }
}
