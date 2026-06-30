package dy3;

/* loaded from: classes.dex */
public final class n extends hg5.d implements tj5.n {
    public static final /* synthetic */ int C = 0;
    public java.lang.String A;
    public final jz5.g B;

    /* renamed from: r, reason: collision with root package name */
    public final dy3.a f244586r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.search.FTSEditTextView f244587s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f244588t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.base.AlphabetScrollBar f244589u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f244590v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f244591w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f244592x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f244593y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f244594z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, dy3.a callback) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f244586r = callback;
        this.f244590v = jz5.h.b(dy3.e.f244577d);
        this.f244591w = jz5.h.b(new dy3.m(this));
        this.f244592x = jz5.h.b(new dy3.j(this));
        this.f244593y = jz5.h.b(new dy3.d(this));
        this.f244594z = jz5.h.b(new dy3.i(context));
        com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent();
        updateSearchIndexAtOnceEvent.f54924g.f6419a = 0L;
        updateSearchIndexAtOnceEvent.e();
        this.A = "";
        this.B = jz5.h.b(new dy3.l(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // tj5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C3(java.lang.String r1, java.lang.String r2, java.util.List r3, tj5.o r4) {
        /*
            r0 = this;
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L23
            boolean r4 = r26.n0.N(r1)
            r4 = r4 ^ r2
            if (r4 == 0) goto Lc
            goto Ld
        Lc:
            r1 = r3
        Ld:
            if (r1 == 0) goto L23
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r4 = r0.K()
            r4.D(r1)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f244589u
            if (r1 != 0) goto L1b
            goto L20
        L1b:
            r4 = 8
            r1.setVisibility(r4)
        L20:
            jz5.f0 r1 = jz5.f0.f302826a
            goto L24
        L23:
            r1 = r3
        L24:
            if (r1 != 0) goto L46
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r1 = r0.K()
            ym3.b r4 = r1.A
            r4.e()
            kotlinx.coroutines.r2 r1 = r1.B
            if (r1 == 0) goto L36
            kotlinx.coroutines.p2.a(r1, r3, r2, r3)
        L36:
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r1 = r0.K()
            com.tencent.mm.plugin.mvvmlist.MvvmList.r(r1, r3, r2, r3)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f244589u
            if (r1 != 0) goto L42
            goto L46
        L42:
            r2 = 0
            r1.setVisibility(r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dy3.n.C3(java.lang.String, java.lang.String, java.util.List, tj5.o):void");
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cgs, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        android.view.View findViewById;
        super.G();
        android.view.View view = this.f281403i;
        if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.f483758bz2)) != null) {
            findViewById.setOnClickListener(new dy3.f(this));
        }
        android.view.View view2 = this.f281403i;
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = view2 != null ? (com.tencent.mm.ui.search.FTSEditTextView) view2.findViewById(com.tencent.mm.R.id.gfl) : null;
        this.f244587s = fTSEditTextView;
        if (fTSEditTextView != null) {
            fTSEditTextView.g();
        }
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView2 = this.f244587s;
        if (fTSEditTextView2 != null) {
            fTSEditTextView2.setFtsEditTextListener(this);
        }
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView3 = this.f244587s;
        if (fTSEditTextView3 != null) {
            fTSEditTextView3.setHint(getContext().getResources().getString(com.tencent.mm.R.string.f490549y8));
        }
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView4 = this.f244587s;
        if (fTSEditTextView4 != null) {
            fTSEditTextView4.f209816g.setTextSize(1, 17.0f);
        }
        android.view.View view3 = this.f281403i;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = view3 != null ? (com.tencent.mm.view.recyclerview.WxRecyclerView) view3.findViewById(com.tencent.mm.R.id.f483621bh0) : null;
        this.f244588t = wxRecyclerView;
        jz5.g gVar = this.f244593y;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter((xm3.t0) ((jz5.n) gVar).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f244588t;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) this.f244594z).getValue());
        }
        ((xm3.t0) ((jz5.n) gVar).getValue()).B = (dy3.k) ((jz5.n) this.B).getValue();
        android.view.View view4 = this.f281403i;
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar = view4 != null ? (com.tencent.mm.ui.base.AlphabetScrollBar) view4.findViewById(com.tencent.mm.R.id.f482946sj) : null;
        this.f244589u = alphabetScrollBar;
        if (alphabetScrollBar != null) {
            alphabetScrollBar.setOnScrollBarTouchListener(new dy3.g(this));
        }
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar2 = this.f244589u;
        if (alphabetScrollBar2 != null) {
            alphabetScrollBar2.setAlphabet(new java.lang.String[]{"🔍", "#"});
        }
        K().f152071u.observe(this, new dy3.h(this));
    }

    @Override // tj5.n
    public boolean G0() {
        return true;
    }

    public final com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList K() {
        return (com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList) ((jz5.n) this.f244592x).getValue();
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    public void onClickClearTextBtn(android.view.View view) {
    }
}
