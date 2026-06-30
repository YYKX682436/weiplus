package dv2;

/* loaded from: classes2.dex */
public final class e2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: i, reason: collision with root package name */
    public static final int f243842i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f243843m;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f243844d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f243845e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f243846f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f243847g;

    /* renamed from: h, reason: collision with root package name */
    public final dv2.b2 f243848h;

    static {
        new dv2.x1(null);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f243842i = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Xe).getValue()).r()).intValue();
        f243843m = new java.util.concurrent.CopyOnWriteArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243844d = jz5.h.b(dv2.a2.f243812d);
        this.f243845e = jz5.h.b(new dv2.z1(activity));
        this.f243846f = jz5.h.b(new dv2.c2(this));
        this.f243848h = new dv2.b2(this);
    }

    public static final androidx.recyclerview.widget.RecyclerView O6(dv2.e2 e2Var) {
        android.view.View findViewById;
        if (e2Var.getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = e2Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.view.View view = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment().getView();
            findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.m6e) : null;
        } else {
            findViewById = e2Var.findViewById(com.tencent.mm.R.id.m6e);
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = findViewById instanceof com.tencent.mm.view.RefreshLoadMoreLayout ? (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById : null;
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout.getRecyclerView();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        boolean z17 = getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI;
        dv2.b2 b2Var = this.f243848h;
        if (!z17) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.a(b2Var);
                return;
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        for (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment : ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getFragments()) {
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            fc2.c Y6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Y6(finderHomeTabFragment.f129265p);
            if (Y6 != null) {
                Y6.a(b2Var);
            }
        }
    }
}
