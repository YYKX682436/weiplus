package in2;

/* loaded from: classes10.dex */
public final class n0 extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f292864J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public com.tencent.mm.view.recyclerview.WxRecyclerView N;
    public final in2.f0 P;
    public int Q;
    public int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.f292864J = "FinderLiveAnchorSingSongAddWidget";
        this.P = new in2.f0(context, liveData);
        this.Q = -1;
        this.R = -1;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.f488849an3;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.K = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f486932mx3);
        this.L = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f486933mx4);
        this.M = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mx7);
        this.N = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.mx6);
        android.widget.TextView textView = this.M;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setText(com.tencent.mm.R.string.oji);
        }
        android.widget.TextView textView3 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f486937qa5);
        if (textView3 != null) {
            textView3.setText(com.tencent.mm.R.string.ojf);
        }
        android.widget.TextView textView4 = this.K;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        android.widget.TextView textView5 = this.L;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.N;
        if (wxRecyclerView != null) {
            in2.f0 f0Var = this.P;
            wxRecyclerView.setAdapter(f0Var);
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(wxRecyclerView.getContext()));
            f0Var.f292829n = new in2.g0(this, wxRecyclerView);
            f0Var.f292830o = new in2.h0(wxRecyclerView, this);
            f0Var.getClass();
            f0Var.f292831p = new in2.i0(wxRecyclerView);
        }
    }

    public final void e0(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationY2;
        android.view.ViewPropertyAnimator duration2;
        if (i17 < 1800 && i17 != 0) {
            this.R = i17;
        }
        if (i17 == 0) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.N;
            if (wxRecyclerView2 == null || (animate2 = wxRecyclerView2.animate()) == null || (translationY2 = animate2.translationY(0.0f)) == null || (duration2 = translationY2.setDuration(90L)) == null) {
                return;
            }
            duration2.start();
            return;
        }
        int b17 = (this.Q - this.R) - i65.a.b(this.f118183e, 40);
        if (b17 < 0 && (wxRecyclerView = this.N) != null && (animate = wxRecyclerView.animate()) != null && (translationY = animate.translationY(b17)) != null && (duration = translationY.setDuration(90L)) != null) {
            duration.start();
        }
        com.tencent.mars.xlog.Log.i(this.f292864J, "moveRv: " + this.Q + " - " + this.R + " = " + (this.Q - this.R));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f486932mx3) {
            this.I.r7();
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
            java.lang.Object systemService = this.f118183e.getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(H().getWindowToken(), 0);
            te2.d4 d4Var = te2.d4.f417948a;
            boolean a86 = ((mm2.c1) this.H.a(mm2.c1.class)).a8();
            ml2.u2[] u2VarArr = ml2.u2.f328109d;
            d4Var.a(a86, 10, "0", "");
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f486933mx4) {
            in2.m0 m0Var = new in2.m0(this, view);
            in2.f0 f0Var = this.P;
            f0Var.f292837v = m0Var;
            f0Var.notifyItemChanged(f0Var.f292832q, java.lang.Boolean.TRUE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void r() {
        int i17;
        gk2.e eVar = this.H;
        java.util.Iterator it = ((mm2.m6) eVar.a(mm2.m6.class)).f329241f.f234053b.iterator();
        while (it.hasNext()) {
            ((dk2.yg) it.next()).f234396d = false;
        }
        java.util.List a17 = ((mm2.m6) eVar.a(mm2.m6.class)).f329241f.a();
        in2.f0 f0Var = this.P;
        f0Var.getClass();
        f0Var.f292832q = -1;
        f0Var.f292833r = true;
        java.util.ArrayList arrayList = f0Var.f292826h;
        arrayList.clear();
        java.util.Iterator it6 = ((java.util.ArrayList) a17).iterator();
        while (it6.hasNext()) {
            dk2.yg ygVar = (dk2.yg) it6.next();
            java.lang.String songName = ygVar.f234393a;
            long j17 = ygVar.f234394b;
            int i18 = ygVar.f234395c;
            boolean z17 = ygVar.f234396d;
            boolean z18 = ygVar.f234397e;
            boolean z19 = ygVar.f234398f;
            boolean z27 = ygVar.f234399g;
            java.lang.String str = ygVar.f234400h;
            int i19 = ygVar.f234401i;
            kotlin.jvm.internal.o.g(songName, "songName");
            arrayList.add(new dk2.yg(songName, j17, i18, z17, z18, z19, z27, str, i19));
        }
        int size = arrayList.size();
        int i27 = f0Var.f292827i;
        if (size < i27) {
            arrayList.add(new dk2.yg("", 0L, 3, false, false, false, false, null, 0, 504, null));
        }
        if (arrayList.size() < i27) {
            arrayList.add(new dk2.yg("", 0L, 1, false, false, false, false, null, 0, 504, null));
            i17 = 1;
        } else {
            i17 = 0;
        }
        yz5.l lVar = f0Var.f292831p;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(arrayList.size() - 1));
        }
        f0Var.notifyDataSetChanged();
        yz5.l lVar2 = f0Var.f292829n;
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Integer.valueOf(arrayList.size() - i17));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void s(boolean z17) {
        super.s(z17);
        java.lang.Object systemService = this.f118183e.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(H().getWindowToken(), 0);
    }
}
