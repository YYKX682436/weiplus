package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedQipaiView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f140816d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f140817e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f140818f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f140819g;

    /* renamed from: h, reason: collision with root package name */
    public m53.y0 f140820h;

    public GameFeedQipaiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f140820h == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.f485975jr1) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f140820h.f324197u.f324129g)) {
                com.tencent.mm.game.report.l.f(getContext(), 10, 1023, 999, r53.f.v(getContext(), this.f140820h.f324197u.f324129g, null, null), null, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140820h.f324185f));
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (intValue < 0 || intValue > this.f140820h.f324197u.f324127e.size() - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        m53.i1 i1Var = (m53.i1) this.f140820h.f324197u.f324127e.get(intValue);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f323779g)) {
            com.tencent.mm.game.report.l.f(getContext(), 10, 1023, intValue + 1, r53.f.v(getContext(), i1Var.f323779g, null, null), i1Var.f323780h, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140820h.f324185f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameFeedQipaiView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140816d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f140817e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485975jr1);
        this.f140818f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jqn);
        this.f140819g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gme);
        this.f140817e.setOnClickListener(this);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        if (cVar == null || (y0Var = cVar.f140238d) == null || y0Var.f324197u == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f140820h = y0Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324197u.f324126d)) {
            this.f140816d.setVisibility(8);
        } else {
            this.f140816d.setText(y0Var.f324197u.f324126d);
            this.f140816d.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f324197u.f324128f)) {
            this.f140817e.setVisibility(8);
            this.f140818f.setVisibility(8);
        } else {
            this.f140818f.setVisibility(0);
            this.f140817e.setVisibility(0);
            this.f140817e.setText(y0Var.f324197u.f324128f);
        }
        this.f140819g.removeAllViews();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(y0Var.f324197u.f324127e)) {
            java.util.Iterator it = y0Var.f324197u.f324127e.iterator();
            while (it.hasNext()) {
                m53.i1 i1Var = (m53.i1) it.next();
                android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bea, (android.view.ViewGroup) this, false);
                inflate.setOnClickListener(this);
                inflate.setTag(java.lang.Integer.valueOf(y0Var.f324197u.f324127e.indexOf(i1Var)));
                this.f140819g.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0f));
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lne);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.lnb);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lnd);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lna);
                textView.setVisibility(8);
                r53.y.a().e(imageView, i1Var.f323776d, null, null);
                textView2.setText(i1Var.f323777e);
                textView3.setText(i1Var.f323778f);
            }
        }
        if (cVar.f140240f) {
            return;
        }
        n53.a.b(getContext(), 10, 1023, cVar.f140236b, 1, cVar.f140238d.f324186g, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(cVar.f140238d.f324185f));
        cVar.f140240f = true;
    }
}
