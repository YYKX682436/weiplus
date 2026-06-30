package ze5;

/* loaded from: classes9.dex */
public class da implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.ia f471887d;

    public da(ze5.ba baVar, ze5.ia iaVar) {
        this.f471887d = iaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ze5.ia iaVar = this.f471887d;
        z01.j0 viewModel = iaVar.f472009b.getViewModel();
        viewModel.f469074r.a(false);
        iaVar.f472009b.setViewModel(viewModel);
    }
}
