package of2;

/* loaded from: classes10.dex */
public final class m extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final nf2.f1 H;
    public final of2.a I;

    /* renamed from: J, reason: collision with root package name */
    public nf2.a f345091J;
    public nf2.l1 K;
    public boolean L;
    public of2.g M;
    public of2.d N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, nf2.f1 initialConfig, of2.a callback) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(initialConfig, "initialConfig");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.H = initialConfig;
        this.I = callback;
        this.f345091J = initialConfig.f336732n;
        this.K = initialConfig.f336736r;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.ea6;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getString(com.tencent.mm.R.string.ose);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        X(new android.graphics.drawable.ColorDrawable(this.f118183e.getResources().getColor(com.tencent.mm.R.color.f478489a)));
        d0();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.uen);
        this.M = new of2.g(this, new of2.h(this));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.M);
        recyclerView.N(new of2.i(recyclerView));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) rootView.findViewById(com.tencent.mm.R.id.uek);
        this.N = new of2.d(this, new of2.j(this));
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView2.getContext(), 0, false));
        recyclerView2.setAdapter(this.N);
        recyclerView2.N(new of2.k(recyclerView2));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        android.view.View view;
        super.S();
        if (this.L) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsStyleEditPanel", "onDismiss: cancelled (not confirmed)");
        nf2.g gVar = (nf2.g) this.I;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsController", "onPanelCancelled");
        nf2.d1 d1Var = gVar.f336738b.f336808m;
        if (d1Var == null || !d1Var.f336703x) {
            return;
        }
        d1Var.f336703x = false;
        nf2.f1 f1Var = d1Var.f336705z;
        jz5.l lVar = d1Var.f336704y;
        nf2.a aVar = d1Var.f336682c.f336732n;
        d1Var.f336704y = null;
        d1Var.f336705z = null;
        if (f1Var != null) {
            boolean z17 = aVar != f1Var.f336732n;
            d1Var.D = lVar;
            d1Var.j(f1Var);
            if (!z17 && lVar != null) {
                d1Var.l(((java.lang.Number) lVar.f302833d).floatValue(), ((java.lang.Number) lVar.f302834e).floatValue());
            }
        }
        if (!d1Var.f336700u && d1Var.f336682c.f336723e && (view = d1Var.f336688i) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "exitPreviewMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "exitPreviewMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "exitPreviewMode: restored position=" + lVar);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void T() {
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsStyleEditPanel", "onLeftClick: cancel");
        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        nf2.k1 k1Var;
        android.view.View view;
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsStyleEditPanel", "onRightClick: componentLayout=" + this.f345091J + ", color=" + this.K);
        this.L = true;
        int ordinal = this.f345091J.ordinal();
        if (ordinal == 0) {
            k1Var = nf2.k1.f336767d;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            k1Var = nf2.k1.f336768e;
        }
        nf2.f1 a17 = nf2.f1.a(this.H, 0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.f345091J, k1Var, null, 0L, this.K, 106495, null);
        nf2.g gVar = (nf2.g) this.I;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsController", "onStyleConfirmed: componentLayout=" + a17.f336732n + ", renderDirection=" + a17.f336733o + ", color=" + a17.f336736r);
        nf2.w wVar = gVar.f336738b;
        nf2.d1 d1Var = wVar.f336808m;
        if (d1Var != null && d1Var.f336703x) {
            d1Var.f336703x = false;
            jz5.l lVar = d1Var.f336704y;
            d1Var.f336704y = null;
            d1Var.f336705z = null;
            if (lVar != null) {
                d1Var.l(((java.lang.Number) lVar.f302833d).floatValue(), ((java.lang.Number) lVar.f302834e).floatValue());
            }
            if (!d1Var.f336700u && d1Var.f336682c.f336723e && (view = d1Var.f336688i) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "confirmPreviewMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "confirmPreviewMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "confirmPreviewMode: restored position=" + lVar);
        }
        wVar.f336818w = a17;
        wVar.f7(1, 2);
        wVar.f7(2, null);
        if (dk2.ef.f233384g) {
            wVar.h7(a17);
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View u() {
        return y();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        android.widget.TextView textView = new android.widget.TextView(this.f118183e);
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.f490441v5));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        textView.setBackground(textView.getContext().getDrawable(com.tencent.mm.R.drawable.f481060jo));
        textView.setMinWidth((int) textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        textView.setMinHeight((int) textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7));
        textView.setGravity(17);
        return textView;
    }
}
