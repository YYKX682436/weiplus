package cs3;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f222097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f222098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f222099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer f222100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f222101h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f222102i;

    public b(android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams, android.view.Window window, com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer bizProfileServiceInfoDrawer, kotlin.jvm.internal.h0 h0Var, int i17) {
        this.f222097d = context;
        this.f222098e = layoutParams;
        this.f222099f = window;
        this.f222100g = bizProfileServiceInfoDrawer;
        this.f222101h = h0Var;
        this.f222102i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f222097d;
        int g17 = com.tencent.mm.ui.bl.g(context);
        android.widget.FrameLayout.LayoutParams layoutParams = this.f222098e;
        layoutParams.bottomMargin = g17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawer", "[initView] bottomMargin= " + g17);
        android.view.View decorView = this.f222099f.getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer bizProfileServiceInfoDrawer = this.f222100g;
        ((android.widget.FrameLayout) decorView).addView(bizProfileServiceInfoDrawer, layoutParams);
        kotlin.jvm.internal.h0 h0Var = this.f222101h;
        cs3.f fVar = (cs3.f) h0Var.f310123d;
        android.widget.FrameLayout headerLayout = bizProfileServiceInfoDrawer.getHeaderLayout();
        fVar.getClass();
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        fVar.f222110h = headerLayout;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dpv, fVar.h().getHeaderLayout());
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ank);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        fVar.f222107e = textView;
        textView.setText(context.getString(this.f222102i == 1 ? com.tencent.mm.R.string.n4n : com.tencent.mm.R.string.ak9));
        android.widget.TextView textView2 = fVar.f222107e;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("headerTitleTv");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.rdr);
        viewGroup.setOnClickListener(new cs3.e(fVar));
        fVar.h().k(viewGroup);
        cs3.f fVar2 = (cs3.f) h0Var.f310123d;
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = bizProfileServiceInfoDrawer.getCenterLayout();
        fVar2.getClass();
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        fVar2.f222108f = rlLayout;
        androidx.recyclerview.widget.RecyclerView recyclerView = rlLayout.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        vr3.z zVar = (vr3.z) fVar2.f222106d;
        zVar.getClass();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
        recyclerView.N(new vr3.w());
        xr3.i iVar = new xr3.i(zVar.f439664g);
        iVar.f456229e = zVar;
        recyclerView.setAdapter(iVar);
    }
}
