package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameBestSellingItemView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.widget.AutoResizeTextView f140668d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f140669e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f140670f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.widget.GameTagListView f140671g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.GameDownloadView f140672h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f140673i;

    /* renamed from: m, reason: collision with root package name */
    public int f140674m;

    /* renamed from: n, reason: collision with root package name */
    public m53.o0 f140675n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.c f140676o;

    public GameBestSellingItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m53.o0 o0Var = this.f140675n;
        if (o0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(o0Var.f323932d.f323722i)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.game.report.l.f(getContext(), 10, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, this.f140676o.f140239e + 1, r53.f.v(getContext(), this.f140675n.f323932d.f323722i, null, null), this.f140675n.f323932d.f323717d, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(this.f140676o.f140238d.f324185f));
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140668d = (com.tencent.mm.plugin.game.widget.AutoResizeTextView) findViewById(com.tencent.mm.R.id.gnz);
        this.f140669e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.glm);
        this.f140670f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gnr);
        this.f140671g = (com.tencent.mm.plugin.game.widget.GameTagListView) findViewById(com.tencent.mm.R.id.nwu);
        this.f140672h = (com.tencent.mm.plugin.game.ui.GameDownloadView) findViewById(com.tencent.mm.R.id.giw);
        this.f140673i = findViewById(com.tencent.mm.R.id.nd6);
        this.f140674m = r53.f.h(getContext()) - i65.a.b(getContext(), 190);
        setOnClickListener(this);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        m53.y0 y0Var;
        m53.m1 m1Var;
        m53.h hVar;
        if (cVar == null || (y0Var = cVar.f140238d) == null || (m1Var = y0Var.f324194r) == null || com.tencent.mm.sdk.platformtools.t8.L0(m1Var.f323892d)) {
            setVisibility(8);
            return;
        }
        this.f140676o = cVar;
        m53.o0 o0Var = (m53.o0) cVar.f140238d.f324194r.f323892d.get(cVar.f140239e);
        int i17 = cVar.f140239e + 1;
        if (o0Var == null || (hVar = o0Var.f323932d) == null) {
            setVisibility(8);
        } else {
            this.f140675n = o0Var;
            com.tencent.mm.plugin.game.model.b a17 = com.tencent.mm.plugin.game.model.t1.a(hVar);
            a17.f140212o2 = 10;
            a17.f140213p2 = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED;
            a17.f140214q2 = this.f140676o.f140239e + 1;
            this.f140672h.setDownloadInfo(new com.tencent.mm.plugin.game.model.c0(a17));
            setVisibility(0);
            this.f140668d.setText("" + i17);
            if (i17 == 1) {
                this.f140668d.setTextColor(r53.f.z("#EED157"));
            } else if (i17 == 2) {
                this.f140668d.setTextColor(r53.f.z("#BDC5CB"));
            } else if (i17 == 3) {
                this.f140668d.setTextColor(r53.f.z("#D4B897"));
            } else {
                this.f140668d.setTextColor(r53.f.z("#B2B2B2"));
            }
            r53.y.a().b(this.f140669e, o0Var.f323932d.f323717d, i65.a.g(getContext()));
            this.f140670f.setText(o0Var.f323932d.f323719f);
            this.f140671g.a(o0Var.f323932d.C, this.f140674m);
            if (com.tencent.mm.sdk.platformtools.t8.L0(o0Var.f323933e) && o0Var.f323934f == null && o0Var.f323935g == null) {
                android.view.View view = this.f140673i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "setData", "(Lcom/tencent/mm/plugin/game/protobuf/Game;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameBestSellingItemView", "setData", "(Lcom/tencent/mm/plugin/game/protobuf/Game;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = this.f140673i;
                if (view2 instanceof android.view.ViewStub) {
                    this.f140673i = ((android.view.ViewStub) view2).inflate();
                }
                ((com.tencent.mm.plugin.game.ui.GameFeedSocialInfoView) this.f140673i.findViewById(com.tencent.mm.R.id.gow)).setData(o0Var);
            }
        }
        if (cVar.f140240f) {
            return;
        }
        n53.a.b(getContext(), 10, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, cVar.f140239e + 1, 1, o0Var.f323932d.f323717d, com.tencent.mm.plugin.game.ui.GameIndexListView.getSourceScene(), n53.a.e(cVar.f140238d.f324185f));
        cVar.f140240f = true;
    }
}
