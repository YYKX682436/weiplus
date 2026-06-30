package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes2.dex */
public class v2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f143041d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI f143042e;

    public v2(com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI iPCallMyGiftCardUI) {
        this.f143042e = null;
        iz5.a.g(null, iPCallMyGiftCardUI != null);
        this.f143042e = iPCallMyGiftCardUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f143041d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f143041d;
        if (list != null) {
            return list.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.ipcall.ui.u2 u2Var;
        if (view == null) {
            view = ((android.view.LayoutInflater) this.f143042e.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f489186bm2, viewGroup, false);
            u2Var = new com.tencent.mm.plugin.ipcall.ui.u2(this, null);
            u2Var.f143019a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ckd);
            u2Var.f143020b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cqh);
            u2Var.f143021c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dki);
            u2Var.f143022d = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.gyk);
            u2Var.f143023e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cro);
            view.setTag(u2Var);
        } else {
            u2Var = (com.tencent.mm.plugin.ipcall.ui.u2) view.getTag();
        }
        r45.n57 n57Var = (r45.n57) getItem(i17);
        if (n57Var == null) {
            return view;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(n57Var.f381099h)) {
            u2Var.f143019a.setVisibility(0);
            u2Var.f143020b.setVisibility(0);
            u2Var.f143021c.setVisibility(8);
            u2Var.f143019a.setText(n57Var.f381095d);
            u2Var.f143020b.setText(n57Var.f381096e);
        } else {
            u2Var.f143019a.setVisibility(8);
            u2Var.f143020b.setVisibility(8);
            u2Var.f143021c.setVisibility(0);
            u2Var.f143021c.setText(n57Var.f381099h);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(u2Var.f143023e, "", 0.5f);
        if (com.tencent.mm.sdk.platformtools.t8.K0(n57Var.f381098g)) {
            u2Var.f143023e.setVisibility(0);
            u2Var.f143022d.setVisibility(4);
        } else {
            u2Var.f143022d.setVisibility(0);
            u2Var.f143022d.setUrl(n57Var.f381098g);
            u2Var.f143023e.setVisibility(4);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
