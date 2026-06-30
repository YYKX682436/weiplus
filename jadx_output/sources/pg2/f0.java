package pg2;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c50.e1 f354103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f354104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f354105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f354106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c50.e1 e1Var, ug5.v vVar, yz5.a aVar, long j17) {
        super(0);
        this.f354103d = e1Var;
        this.f354104e = vVar;
        this.f354105f = aVar;
        this.f354106g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "handlePlayerInPlaying==frameShow");
        c50.e1 e1Var = this.f354103d;
        if ((e1Var != null ? e1Var.f38600d : -1) != -1) {
            ug5.v vVar = this.f354104e;
            ug5.g gVar = vVar.f427658a;
            android.view.Window window = gVar.f427589c;
            if (window == null) {
                window = gVar.f427588b;
            }
            if (window != null) {
                android.view.View view = new android.view.View(window.getContext());
                view.setBackgroundColor(e1Var != null ? e1Var.f38600d : 0);
                android.view.View decorView = window.getDecorView();
                android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
                if (frameLayout != null) {
                    frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
                }
                vVar.f427661d = view;
            }
        }
        yz5.a aVar = this.f354105f;
        if (aVar != null) {
            aVar.invoke();
        }
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.i(this.f354106g);
        }
        return jz5.f0.f302826a;
    }
}
