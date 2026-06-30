package pa;

/* loaded from: classes15.dex */
public class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f352930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ da.a f352932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.transformation.ExpandableBehavior f352933g;

    public a(com.google.android.material.transformation.ExpandableBehavior expandableBehavior, android.view.View view, int i17, da.a aVar) {
        this.f352933g = expandableBehavior;
        this.f352930d = view;
        this.f352931e = i17;
        this.f352932f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f352930d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        com.google.android.material.transformation.ExpandableBehavior expandableBehavior = this.f352933g;
        if (expandableBehavior.f44623d == this.f352931e) {
            java.lang.Object obj = this.f352932f;
            expandableBehavior.y((android.view.View) obj, view, ((com.google.android.material.floatingactionbutton.FloatingActionButton) obj).f44504u.f227727b, false);
        }
        return false;
    }
}
