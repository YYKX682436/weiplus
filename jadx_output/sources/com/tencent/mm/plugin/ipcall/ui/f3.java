package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class f3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f142825d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI f142826e;

    public f3(com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI) {
        this.f142826e = null;
        this.f142826e = iPCallPackageUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f142825d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f142825d;
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
        com.tencent.mm.plugin.ipcall.ui.e3 e3Var;
        if (view == null) {
            view = ((android.view.LayoutInflater) this.f142826e.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f489188bm4, viewGroup, false);
            e3Var = new com.tencent.mm.plugin.ipcall.ui.e3(this, null);
            e3Var.f142793a = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.knp);
            e3Var.f142794b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.knt);
            e3Var.f142795c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.knu);
            e3Var.f142796d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.knk);
            e3Var.f142797e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.knl);
            e3Var.f142798f = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.knj);
            view.setTag(e3Var);
        } else {
            e3Var = (com.tencent.mm.plugin.ipcall.ui.e3) view.getTag();
        }
        r45.p57 p57Var = (r45.p57) getItem(i17);
        if (p57Var == null) {
            return view;
        }
        e3Var.f142794b.setText(p57Var.f382775d);
        e3Var.f142795c.setText(p57Var.f382776e);
        e3Var.f142797e.setText(p57Var.f382778g);
        e3Var.f142796d.setText(p57Var.f382777f);
        e3Var.f142793a.setVisibility(0);
        e3Var.f142793a.setUrl(p57Var.f382779h);
        if (p57Var.f382780i == 0) {
            e3Var.f142798f.setEnabled(true);
        } else {
            e3Var.f142798f.setEnabled(false);
        }
        e3Var.f142798f.setTag(java.lang.Integer.valueOf(i17));
        e3Var.f142798f.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.d3(this));
        return view;
    }
}
