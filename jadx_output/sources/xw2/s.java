package xw2;

/* loaded from: classes2.dex */
public abstract class s extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f457715o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final xw2.u f457716d;

    /* renamed from: e, reason: collision with root package name */
    public final int f457717e;

    /* renamed from: f, reason: collision with root package name */
    public final float f457718f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f457719g;

    /* renamed from: h, reason: collision with root package name */
    public final xw2.n f457720h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f457721i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f457722m;

    /* renamed from: n, reason: collision with root package name */
    public int f457723n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, xw2.u viewModel) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        this.f457716d = viewModel;
        this.f457717e = getCurrentGroupCount();
        this.f457718f = 0.5f;
        this.f457719g = jz5.h.b(new xw2.p(context));
        xw2.n nVar = new xw2.n(this);
        this.f457720h = nVar;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false);
        this.f457721i = linearLayoutManager;
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setClipToPadding(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(nVar);
        ((com.tencent.mm.plugin.finder.viewmodel.component.h00) viewModel).S6(com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d, new xw2.q(this, null), new xw2.r(this));
        this.f457722m = recyclerView;
        recyclerView.i(new xw2.f(this));
        addView(recyclerView, new android.widget.FrameLayout.LayoutParams(-1, -2));
        new androidx.recyclerview.widget.y1().b(recyclerView);
        addOnLayoutChangeListener(new xw2.g(this));
    }

    public static final java.lang.Object b(xw2.s sVar, java.util.List list, int i17, int i18) {
        java.util.List list2 = (java.util.List) kz5.n0.a0(sVar.c(list), i17);
        if (list2 != null) {
            return kz5.n0.a0(list2, i18);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentGroupCount() {
        return ((xw2.t) ((kotlinx.coroutines.flow.h3) ((com.tencent.mm.plugin.finder.viewmodel.component.h00) this.f457716d).f134568f).getValue()).f457726c;
    }

    public final java.util.List c(java.util.List list) {
        return kz5.n0.N(list, getCurrentGroupCount());
    }

    public float getExtendCount() {
        return this.f457718f;
    }

    public int getInitialGroupCount() {
        return this.f457717e;
    }

    public int getItemMinWidth() {
        return ((java.lang.Number) ((jz5.n) this.f457719g).getValue()).intValue();
    }

    public abstract int getItemResource();

    public final xw2.u getViewModel() {
        return this.f457716d;
    }
}
