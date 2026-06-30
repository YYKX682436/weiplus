package wj3;

/* loaded from: classes14.dex */
public final class a implements uj3.b {

    /* renamed from: d, reason: collision with root package name */
    public int f446745d;

    /* renamed from: e, reason: collision with root package name */
    public final uj3.b0 f446746e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f446747f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f446748g;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f446745d = -1;
        this.f446747f = zj3.j.h();
        this.f446746e = new uj3.b0(context, this);
    }

    @Override // uj3.b
    public int b() {
        return 0;
    }

    @Override // uj3.b
    public boolean c() {
        return false;
    }

    @Override // uj3.b
    public boolean d() {
        return this.f446748g;
    }

    @Override // uj3.b
    public int e() {
        return this.f446745d;
    }

    @Override // uj3.b
    public void f(uj3.a status, android.os.Bundle bundle) {
        boolean z17;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        boolean z18 = false;
        if (ordinal != 7) {
            if (ordinal != 8) {
                return;
            }
            this.f446748g = false;
            return;
        }
        if (this.f446747f || com.tencent.mm.plugin.multitalk.model.e3.Ri().m().j()) {
            uj3.b0 b0Var = this.f446746e;
            if (b0Var != null) {
                android.view.ViewGroup viewGroup = b0Var.f428221i;
                if (viewGroup != null && viewGroup.getVisibility() == 0) {
                    z17 = true;
                    if (z17 || bundle == null) {
                    }
                    java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("avatar_available_speaker");
                    if (b0Var != null) {
                        kotlin.jvm.internal.o.d(stringArrayList);
                        b0Var.f(stringArrayList);
                        z18 = true;
                    }
                    this.f446748g = z18;
                    return;
                }
            }
            z17 = false;
            if (z17) {
            }
        }
    }

    public final void g(android.view.ViewGroup rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        rootView.removeAllViews();
        uj3.b0 b0Var = this.f446746e;
        if (b0Var != null) {
            b0Var.c(false);
        }
    }

    @Override // uj3.b
    public boolean getCurrentStatus() {
        return false;
    }
}
