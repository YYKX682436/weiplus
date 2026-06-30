package cp4;

/* loaded from: classes8.dex */
public final class g1 extends android.widget.LinearLayout {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f221003J = 0;
    public final java.util.List A;
    public yz5.a B;
    public yz5.l C;
    public yz5.l D;
    public yz5.p E;
    public yz5.p F;
    public yz5.a G;
    public final java.util.List H;
    public boolean I;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f221004d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f221005e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f221006f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f221007g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f221008h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f221009i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f221010m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f221011n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f221012o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f221013p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f221014q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f221015r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f221016s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f221017t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f221018u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f221019v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f221020w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f221021x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f221022y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f221023z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f221004d = jz5.h.b(new cp4.m0(this));
        this.f221005e = jz5.h.b(new cp4.p0(this));
        this.f221006f = jz5.h.b(new cp4.n0(this));
        this.f221007g = jz5.h.b(new cp4.y0(this));
        this.f221008h = jz5.h.b(new cp4.a1(this));
        this.f221009i = jz5.h.b(new cp4.z0(this));
        this.f221010m = jz5.h.b(new cp4.o0(this));
        this.f221011n = jz5.h.b(new cp4.l0(this));
        this.f221012o = jz5.h.b(new cp4.x0(this));
        this.f221013p = jz5.h.b(new cp4.f1(this));
        this.f221014q = jz5.h.b(new cp4.e1(this));
        this.f221015r = jz5.h.b(new cp4.b1(this));
        this.f221016s = jz5.h.b(new cp4.d1(this));
        this.f221017t = jz5.h.b(new cp4.c1(this));
        this.f221018u = jz5.h.b(new cp4.r0(this));
        this.f221019v = jz5.h.b(new cp4.q0(this));
        this.f221020w = jz5.h.b(new cp4.u0(this));
        this.f221021x = jz5.h.b(new cp4.v0(this));
        this.f221022y = jz5.h.b(new cp4.s0(this));
        this.f221023z = jz5.h.b(new cp4.w0(this));
        this.A = kz5.c0.i(new cp4.k0(this, 0, context), new cp4.k0(this, 1, context));
        this.H = kz5.c0.k(0, 0);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a5s, (android.view.ViewGroup) this, true);
        setBackgroundResource(com.tencent.mm.R.drawable.f480905f8);
        setOrientation(1);
        getContentLayout().setVisibility(4);
        getEmptyLayout().setVisibility(0);
        getCaptionTab().setOnClickListener(new cp4.a0(this));
        getRecordCaptionTab().setOnClickListener(new cp4.b0(this));
        findViewById(com.tencent.mm.R.id.f483543b61).setOnClickListener(new cp4.c0(this));
        findViewById(com.tencent.mm.R.id.oio).setOnClickListener(new cp4.d0(this));
        findViewById(com.tencent.mm.R.id.bxp).setOnClickListener(new cp4.e0(this));
        getRecordTransBtn().setOnClickListener(new cp4.f0(this));
        getClearRecordBtn().setOnClickListener(new cp4.g0(this));
        for (int i17 = 0; i17 < 2; i17++) {
            getCaptionViews().get(i17).setLayoutManager(new com.tencent.mm.plugin.vlog.ui.plugin.caption.EditorCaptionLayoutManager(context, 1));
            getCaptionViews().get(i17).setAdapter((androidx.recyclerview.widget.f2) this.A.get(i17));
            getCaptionViews().get(i17).i(new cp4.h0(this, i17));
        }
    }

    public static final boolean f(cp4.g1 g1Var, int i17, android.view.View view) {
        if (view == null) {
            g1Var.getClass();
            return false;
        }
        int top = (g1Var.getCaptionViews().get(i17).getTop() + g1Var.getCaptionViews().get(i17).getBottom()) / 2;
        return top < view.getBottom() && view.getTop() <= top;
    }

    public static final void g(cp4.g1 g1Var, int i17) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = g1Var.getCaptionViews().get(i17).getLayoutManager();
        if (layoutManager != null) {
            layoutManager.smoothScrollToPosition(g1Var.getCaptionViews().get(i17), new androidx.recyclerview.widget.h3(), ((java.lang.Number) g1Var.H.get(i17)).intValue());
        }
    }

    private final android.view.ViewGroup getCaptionPanel() {
        return (android.view.ViewGroup) ((jz5.n) this.f221011n).getValue();
    }

    private final android.view.ViewGroup getCaptionTab() {
        return (android.view.ViewGroup) ((jz5.n) this.f221004d).getValue();
    }

    private final android.view.View getCaptionTabIndicator() {
        return (android.view.View) ((jz5.n) this.f221006f).getValue();
    }

    private final android.view.View getCaptionTabSpace() {
        return (android.view.View) ((jz5.n) this.f221010m).getValue();
    }

    private final android.widget.TextView getCaptionTabText() {
        return (android.widget.TextView) ((jz5.n) this.f221005e).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<androidx.recyclerview.widget.RecyclerView> getCaptionViews() {
        return (java.util.List) ((jz5.n) this.f221019v).getValue();
    }

    private final android.view.ViewGroup getClearRecordBtn() {
        return (android.view.ViewGroup) ((jz5.n) this.f221018u).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.LinearLayout getContentLayout() {
        return (android.widget.LinearLayout) ((jz5.n) this.f221022y).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.LinearLayout getEmptyLayout() {
        return (android.widget.LinearLayout) ((jz5.n) this.f221020w).getValue();
    }

    private final android.widget.TextView getEmptyTipTxt() {
        return (android.widget.TextView) ((jz5.n) this.f221021x).getValue();
    }

    private final android.view.View getLoadingView() {
        return (android.view.View) ((jz5.n) this.f221023z).getValue();
    }

    private final android.view.ViewGroup getRecordCaptionPanel() {
        return (android.view.ViewGroup) ((jz5.n) this.f221012o).getValue();
    }

    private final android.view.ViewGroup getRecordCaptionTab() {
        return (android.view.ViewGroup) ((jz5.n) this.f221007g).getValue();
    }

    private final android.view.View getRecordCaptionTabIndicator() {
        return (android.view.View) ((jz5.n) this.f221009i).getValue();
    }

    private final android.widget.TextView getRecordCaptionTabText() {
        return (android.widget.TextView) ((jz5.n) this.f221008h).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.ViewGroup getRecordContentLayout() {
        return (android.view.ViewGroup) ((jz5.n) this.f221015r).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.ViewGroup getRecordEmptyLayout() {
        return (android.view.ViewGroup) ((jz5.n) this.f221017t).getValue();
    }

    private final android.view.View getRecordLoadingView() {
        return (android.view.View) ((jz5.n) this.f221016s).getValue();
    }

    private final android.widget.TextView getRecordTransBtn() {
        return (android.widget.TextView) ((jz5.n) this.f221014q).getValue();
    }

    private final android.widget.TextView getTransBtn() {
        return (android.widget.TextView) ((jz5.n) this.f221013p).getValue();
    }

    public static final void h(cp4.g1 g1Var, int i17) {
        g1Var.getClass();
        if (i17 == 0) {
            android.view.View captionTabIndicator = g1Var.getCaptionTabIndicator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(captionTabIndicator, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            captionTabIndicator.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(captionTabIndicator, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View recordCaptionTabIndicator = g1Var.getRecordCaptionTabIndicator();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recordCaptionTabIndicator, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recordCaptionTabIndicator.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recordCaptionTabIndicator, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g1Var.getCaptionTabText().setTextColor(g1Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            g1Var.getRecordCaptionTabText().setTextColor(g1Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479550ab1));
            g1Var.getCaptionPanel().setVisibility(0);
            g1Var.getRecordCaptionPanel().setVisibility(8);
            return;
        }
        android.view.View captionTabIndicator2 = g1Var.getCaptionTabIndicator();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(captionTabIndicator2, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        captionTabIndicator2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(captionTabIndicator2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View recordCaptionTabIndicator2 = g1Var.getRecordCaptionTabIndicator();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(recordCaptionTabIndicator2, arrayList4.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recordCaptionTabIndicator2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(recordCaptionTabIndicator2, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", nd1.h2.NAME, "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g1Var.getCaptionTabText().setTextColor(g1Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479550ab1));
        g1Var.getRecordCaptionTabText().setTextColor(g1Var.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        g1Var.getCaptionPanel().setVisibility(8);
        g1Var.getRecordCaptionPanel().setVisibility(0);
    }

    public final yz5.p getClearTransListener() {
        return this.E;
    }

    public final yz5.a getDismissListener() {
        return this.G;
    }

    public final yz5.p getItemClickListener() {
        return this.F;
    }

    public final yz5.l getStartTransListener() {
        return this.D;
    }

    public final yz5.a getVideoPauseListener() {
        return this.B;
    }

    public final yz5.l getVideoSeekListener() {
        return this.C;
    }

    public final void i(int i17, java.lang.String str) {
        java.util.List list = this.A;
        ((cp4.k0) list.get(i17)).f221043f.clear();
        ((cp4.k0) list.get(i17)).notifyDataSetChanged();
        if (i17 == 0) {
            android.view.View loadingView = getLoadingView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loadingView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getContentLayout().setVisibility(4);
            getEmptyLayout().setVisibility(0);
        } else {
            android.view.View recordLoadingView = getRecordLoadingView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recordLoadingView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recordLoadingView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recordLoadingView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "clearCaption", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getRecordContentLayout().setVisibility(4);
            getRecordEmptyLayout().setVisibility(0);
        }
        if (str != null) {
            getEmptyTipTxt().setText(str);
        }
        yz5.p pVar = this.E;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(getEmptyLayout().getVisibility() == 4 || getRecordEmptyLayout().getVisibility() == 4));
        }
    }

    public final void j(int i17, long j17) {
        boolean z17;
        if (this.I) {
            return;
        }
        java.util.List list = this.A;
        if (((cp4.k0) list.get(i17)).f221043f.isEmpty()) {
            return;
        }
        java.util.List list2 = this.H;
        int intValue = ((java.lang.Number) list2.get(i17)).intValue();
        if (((java.lang.Number) list2.get(i17)).intValue() >= ((cp4.k0) list.get(i17)).f221043f.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorTextCaptionView", "maybe clear captionItems");
            list2.set(i17, java.lang.Integer.valueOf(((cp4.k0) list.get(i17)).f221043f.size() - 1));
        }
        if (((r45.is) ((cp4.k0) list.get(i17)).f221043f.get(((java.lang.Number) list2.get(i17)).intValue())).f377298e > j17) {
            list2.set(i17, 0);
            z17 = true;
        } else {
            z17 = false;
        }
        while (((r45.is) ((cp4.k0) list.get(i17)).f221043f.get(((java.lang.Number) list2.get(i17)).intValue())).f377299f < j17) {
            list2.set(i17, java.lang.Integer.valueOf(((java.lang.Number) list2.get(i17)).intValue() + 1));
        }
        ((cp4.k0) list.get(i17)).f221044g = ((java.lang.Number) list2.get(i17)).intValue();
        if (z17) {
            androidx.recyclerview.widget.RecyclerView recyclerView = getCaptionViews().get(i17);
            int intValue2 = ((java.lang.Number) list2.get(i17)).intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "time2Pos", "(IJ)I", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "time2Pos", "(IJ)I", "Undefined", "scrollToPosition", "(I)V");
        }
        ((java.lang.Number) list2.get(i17)).intValue();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getCaptionViews().get(i17).getLayoutManager();
        if (layoutManager != null) {
            layoutManager.smoothScrollToPosition(getCaptionViews().get(i17), new androidx.recyclerview.widget.h3(), ((java.lang.Number) list2.get(i17)).intValue());
            ((cp4.k0) list.get(i17)).y(layoutManager.findViewByPosition(intValue));
            ((cp4.k0) list.get(i17)).x(layoutManager.findViewByPosition(((java.lang.Number) list2.get(i17)).intValue()), null);
        }
    }

    public final void k(int i17) {
        if (i17 == 0) {
            android.view.View loadingView = getLoadingView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loadingView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getEmptyLayout().setVisibility(4);
            getContentLayout().setVisibility(0);
            return;
        }
        android.view.View recordLoadingView = getRecordLoadingView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recordLoadingView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recordLoadingView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recordLoadingView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showCaption", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getRecordEmptyLayout().setVisibility(4);
        getRecordContentLayout().setVisibility(0);
    }

    public final void l(int i17) {
        if (i17 == 0) {
            android.view.View loadingView = getLoadingView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loadingView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getContentLayout().setVisibility(4);
            getEmptyLayout().setVisibility(4);
            return;
        }
        android.view.View recordLoadingView = getRecordLoadingView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recordLoadingView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recordLoadingView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recordLoadingView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView", "showLoading", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getRecordContentLayout().setVisibility(4);
        getRecordEmptyLayout().setVisibility(4);
    }

    public final void m(int i17, r45.is transResult) {
        kotlin.jvm.internal.o.g(transResult, "transResult");
        java.util.List list = this.A;
        int i18 = 0;
        for (java.lang.Object obj : ((cp4.k0) list.get(i17)).f221043f) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.is isVar = (r45.is) obj;
            if (isVar.f377301h == transResult.f377301h) {
                isVar.f377297d = transResult.f377297d;
                ((cp4.k0) list.get(i17)).notifyItemChanged(i18);
                return;
            }
            i18 = i19;
        }
    }

    public final void setClearTransListener(yz5.p pVar) {
        this.E = pVar;
    }

    public final void setDismissListener(yz5.a aVar) {
        this.G = aVar;
    }

    public final void setItemClickListener(yz5.p pVar) {
        this.F = pVar;
    }

    public final void setStartTransListener(yz5.l lVar) {
        this.D = lVar;
    }

    public final void setVideoPauseListener(yz5.a aVar) {
        this.B = aVar;
    }

    public final void setVideoSeekListener(yz5.l lVar) {
        this.C = lVar;
    }
}
