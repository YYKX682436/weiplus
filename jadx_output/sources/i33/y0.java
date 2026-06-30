package i33;

/* loaded from: classes10.dex */
public final class y0 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288290f;

    /* renamed from: g, reason: collision with root package name */
    public j33.x f288291g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f288292h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f288293i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288290f = "MicroMsg.AlbumScrollPerformanceUIC";
        this.f288292h = jz5.h.b(new i33.x0(activity));
        this.f288293i = jz5.h.b(new i33.u0(this));
    }

    @Override // i33.c
    public void V6(com.tencent.mm.ui.q2 oldMode, com.tencent.mm.ui.q2 newMode) {
        kotlin.jvm.internal.o.g(oldMode, "oldMode");
        kotlin.jvm.internal.o.g(newMode, "newMode");
        super.V6(oldMode, newMode);
        if (oldMode == newMode || newMode != com.tencent.mm.ui.q2.NORMAL) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f288290f, "onSelectModeChanged: to Normal");
        androidx.recyclerview.widget.f2 adapter = T6().getAdapter();
        e33.b0 b0Var = adapter instanceof e33.b0 ? (e33.b0) adapter : null;
        if (b0Var != null) {
            b0Var.f247146y = true;
        }
        W6();
        X6(0L);
    }

    public final void W6() {
        t23.p0.h().c();
        t23.p0.h().b();
        j33.x xVar = this.f288291g;
        if (xVar != null) {
            xVar.f297471h = true;
            com.tencent.mars.xlog.Log.i(xVar.f297470g, "stop: ");
        }
        T6().removeCallbacks(this.f288291g);
        this.f288291g = null;
    }

    public final void X6(long j17) {
        androidx.recyclerview.widget.f2 adapter = T6().getAdapter();
        e33.b0 b0Var = adapter instanceof e33.b0 ? (e33.b0) adapter : null;
        if (b0Var == null || !b0Var.f247146y) {
            return;
        }
        b0Var.f247146y = false;
        W6();
        this.f288291g = new j33.x(U6(), T6(), ((java.lang.Number) ((jz5.n) this.f288293i).getValue()).intValue());
        T6().postDelayed(this.f288291g, j17);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f353948a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            z0Var.X6(this, 2);
        }
        T6().i(new i33.w0(this));
        T6().setRecycledViewPool(new in5.a(((java.lang.Number) ((jz5.n) this.f288293i).getValue()).intValue()));
        androidx.recyclerview.widget.GridLayoutManager U6 = U6();
        com.tencent.mm.view.recyclerview.ObservableGridLayoutManager observableGridLayoutManager = U6 instanceof com.tencent.mm.view.recyclerview.ObservableGridLayoutManager ? (com.tencent.mm.view.recyclerview.ObservableGridLayoutManager) U6 : null;
        if (observableGridLayoutManager != null) {
            observableGridLayoutManager.D = new i33.v0(this);
        }
    }
}
