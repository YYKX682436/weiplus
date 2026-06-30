package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedSubscriptView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f140826d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f140827e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f140828f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f140829g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f140830h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f140831i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f140832m;

    /* renamed from: n, reason: collision with root package name */
    public m53.y0 f140833n;

    public GameFeedSubscriptView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i17) {
        java.lang.String a17 = i17 == 1 ? n53.a.a(this.f140833n.f324185f, "clickType", "leftCorner") : n53.a.a(this.f140833n.f324185f, "clickType", "rightCorner");
        android.content.Context context = getContext();
        m53.y0 y0Var = this.f140833n;
        com.tencent.mm.game.report.l.f(context, 10, 1024, y0Var.f324184e, 7, y0Var.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), a17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        m53.w wVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f140833n == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.i0g || view.getId() == com.tencent.mm.R.id.i0h || view.getId() == com.tencent.mm.R.id.a_j) {
            m53.w wVar2 = this.f140833n.f324198v;
            if (wVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(wVar2.f324137g)) {
                r53.f.u(getContext(), this.f140833n.f324198v.f324137g);
                a(1);
            }
        } else if (view.getId() == com.tencent.mm.R.id.m4f && (wVar = this.f140833n.f324199w) != null && !com.tencent.mm.sdk.platformtools.t8.K0(wVar.f324137g)) {
            r53.f.u(getContext(), this.f140833n.f324199w.f324137g);
            a(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedSubscriptView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489146bg1, (android.view.ViewGroup) this, true);
        this.f140826d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.i0g);
        this.f140827e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.i0h);
        this.f140828f = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.a_j);
        this.f140829g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a9m);
        this.f140830h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kb_);
        this.f140831i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ou9);
        this.f140832m = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m4f);
        this.f140826d.setOnClickListener(this);
        this.f140827e.setOnClickListener(this);
        this.f140828f.setOnClickListener(this);
        this.f140832m.setOnClickListener(this);
    }

    public void setData(m53.y0 y0Var) {
        if (y0Var == null || (y0Var.f324198v == null && y0Var.f324199w == null)) {
            setVisibility(8);
            return;
        }
        this.f140833n = y0Var;
        setVisibility(0);
        this.f140826d.setVisibility(8);
        this.f140827e.setVisibility(8);
        this.f140828f.setVisibility(8);
        m53.w wVar = y0Var.f324198v;
        if (wVar != null) {
            int i17 = wVar.f324138h;
            if (i17 == 1) {
                this.f140827e.setVisibility(0);
                this.f140827e.setText(y0Var.f324198v.f324136f);
            } else if (i17 == 2) {
                this.f140826d.setVisibility(0);
                this.f140826d.setText(y0Var.f324198v.f324136f);
            } else if (i17 == 3) {
                this.f140828f.setVisibility(0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324198v.f324134d)) {
                    r53.v vVar = new r53.v();
                    vVar.f392705c = true;
                    r53.y.a().e(this.f140829g, y0Var.f324198v.f324134d, vVar.a(), null);
                    this.f140829g.setVisibility(0);
                }
                this.f140830h.setText(y0Var.f324198v.f324135e);
                this.f140831i.setText(y0Var.f324198v.f324136f);
            }
        }
        m53.w wVar2 = y0Var.f324199w;
        if (wVar2 == null) {
            this.f140832m.setVisibility(8);
        } else {
            this.f140832m.setText(wVar2.f324136f);
            this.f140832m.setVisibility(0);
        }
    }
}
