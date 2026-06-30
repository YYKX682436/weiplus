package com.tencent.mm.plugin.game.ui;

/* loaded from: classes4.dex */
public class q2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141725d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f141726e = new java.util.LinkedList();

    public q2(android.content.Context context) {
        this.f141725d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f141726e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (m53.x5) ((java.util.LinkedList) this.f141726e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.game.ui.p2 p2Var;
        android.content.Context context = this.f141725d;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bfk, viewGroup, false);
            p2Var = new com.tencent.mm.plugin.game.ui.p2(null);
            p2Var.f141705a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gkk);
            p2Var.f141706b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gkl);
            p2Var.f141707c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gkm);
            view.setTag(p2Var);
        } else {
            p2Var = (com.tencent.mm.plugin.game.ui.p2) view.getTag();
        }
        m53.x5 x5Var = (m53.x5) ((java.util.LinkedList) this.f141726e).get(i17);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(p2Var.f141705a, x5Var.f324178d, 0.5f);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x5Var.f324178d, true);
        if (n17 != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String g27 = n17.g2();
            float textSize = p2Var.f141706b.getTextSize();
            ((ke0.e) xVar).getClass();
            p2Var.f141706b.setText(new android.text.SpannableString(com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize)));
        } else {
            p2Var.f141706b.setText("");
        }
        p2Var.f141707c.setText(x5Var.f324179e);
        return view;
    }
}
