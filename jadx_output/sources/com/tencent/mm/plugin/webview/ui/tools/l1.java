package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class l1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f185623d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f185624e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.c36 f185625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI f185626g;

    public l1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI sDKOAuthAppDataUI, android.content.Context context, java.util.LinkedList linkedList, r45.xv5 xv5Var) {
        this.f185626g = sDKOAuthAppDataUI;
        android.view.LayoutInflater.from(context);
        this.f185623d = linkedList;
        this.f185624e = linkedList;
        r45.c36 c36Var = new r45.c36();
        this.f185625f = c36Var;
        c36Var.f371256e = sDKOAuthAppDataUI.f183665w;
        java.util.LinkedList linkedList2 = sDKOAuthAppDataUI.f183664v;
        c36Var.f371255d = linkedList2;
        sDKOAuthAppDataUI.f183663u = new com.tencent.mm.plugin.webview.ui.tools.e1(context, sDKOAuthAppDataUI.f183666x.f370317e.f392414d, linkedList2);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.cih, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mcw);
        textView.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(0.8f);
        com.tencent.mm.plugin.webview.ui.tools.e1 e1Var = sDKOAuthAppDataUI.f183663u;
        e1Var.f184114a.t(inflate);
        e1Var.f184118e = inflate;
        sDKOAuthAppDataUI.f183663u.f184121h.observe((com.tencent.mm.ui.MMActivity) context, new com.tencent.mm.plugin.webview.ui.tools.j1(this, sDKOAuthAppDataUI));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f185624e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.m1 m1Var = (com.tencent.mm.plugin.webview.ui.tools.m1) k3Var;
        r45.h04 h04Var = (r45.h04) this.f185624e.get(i17);
        m1Var.f185672e.setText(h04Var.f375710e);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(h04Var.f375711f);
        android.widget.TextView textView = m1Var.f185674g;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setText(h04Var.f375711f);
        }
        m1Var.f185671d.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.k1(this, i17));
        for (int i18 = 0; i18 < ((r45.h04) this.f185624e.get(i17)).f375713h.size(); i18++) {
            int i19 = ((r45.yv6) this.f185625f.f371255d.get(i17)).f391429e;
            r45.f14 f14Var = (r45.f14) ((r45.h04) this.f185624e.get(i17)).f375713h.get(i18);
            if (f14Var.f373926d == i19) {
                m1Var.f185673f.setText(f14Var.f373927e);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI sDKOAuthAppDataUI = this.f185626g;
        return new com.tencent.mm.plugin.webview.ui.tools.m1(sDKOAuthAppDataUI, com.tencent.mm.ui.id.b(sDKOAuthAppDataUI.getContext()).inflate(com.tencent.mm.R.layout.cij, viewGroup, false));
    }
}
