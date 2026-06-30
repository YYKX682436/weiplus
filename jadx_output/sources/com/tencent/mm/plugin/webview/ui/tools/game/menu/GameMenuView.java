package com.tencent.mm.plugin.webview.ui.tools.game.menu;

/* loaded from: classes8.dex */
public class GameMenuView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f184767d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f184768e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f184769f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f184770g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f184771h;

    /* renamed from: i, reason: collision with root package name */
    public tx4.q f184772i;

    /* renamed from: m, reason: collision with root package name */
    public tx4.f f184773m;

    /* renamed from: n, reason: collision with root package name */
    public tx4.d f184774n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f184775o;

    public GameMenuView(android.content.Context context) {
        super(context, null);
        this.f184775o = false;
        this.f184767d = context;
        this.f184768e = android.view.LayoutInflater.from(context);
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f184775o = displayMetrics.widthPixels > displayMetrics.heightPixels;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (((r5.f422708d.size() + 1) / 2) > 4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView.a(com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView):void");
    }

    public final void b() {
        android.view.View inflate;
        boolean z17 = this.f184775o;
        android.view.LayoutInflater layoutInflater = this.f184768e;
        if (z17) {
            setOrientation(0);
            layoutInflater.inflate(com.tencent.mm.R.layout.f489155bh4, (android.view.ViewGroup) this, true);
            inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f489152bh1, (android.view.ViewGroup) this, true);
        } else {
            setOrientation(1);
            layoutInflater.inflate(com.tencent.mm.R.layout.f489156bh5, (android.view.ViewGroup) this, true);
            inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f489153bh2, (android.view.ViewGroup) this, true);
        }
        this.f184769f = inflate.findViewById(com.tencent.mm.R.id.gnb);
        this.f184770g = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.gna);
        this.f184771h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.gnc);
    }

    public void setAdapter(tx4.q qVar) {
        this.f184772i = qVar;
        qVar.registerDataSetObserver(new tx4.m(this));
        qVar.notifyDataSetChanged();
    }

    public void setDismissListener(tx4.d dVar) {
        this.f184774n = dVar;
    }

    public void setGameMenuItemSelectedListener(tx4.f fVar) {
        this.f184773m = fVar;
    }

    public GameMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f184775o = false;
        this.f184767d = context;
        b();
    }
}
