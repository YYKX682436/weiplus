package o;

/* loaded from: classes15.dex */
public class a0 extends o.v implements android.view.ActionProvider.VisibilityListener {

    /* renamed from: d, reason: collision with root package name */
    public n3.e f341687d;

    public a0(o.b0 b0Var, android.content.Context context, android.view.ActionProvider actionProvider) {
        super(b0Var, context, actionProvider);
    }

    @Override // n3.f
    public boolean a() {
        return this.f341824b.isVisible();
    }

    @Override // n3.f
    public android.view.View b(android.view.MenuItem menuItem) {
        return this.f341824b.onCreateActionView(menuItem);
    }

    @Override // n3.f
    public boolean c() {
        return this.f341824b.overridesItemVisibility();
    }

    @Override // n3.f
    public void d(n3.e eVar) {
        this.f341687d = eVar;
        this.f341824b.setVisibilityListener(eVar != null ? this : null);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z17) {
        n3.e eVar = this.f341687d;
        if (eVar != null) {
            o.r rVar = ((o.t) eVar).f341803a.f341817t;
            rVar.f341787n = true;
            rVar.p(true);
        }
    }
}
