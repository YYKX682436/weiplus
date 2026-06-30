package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes15.dex */
public class q0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f152199d;

    /* renamed from: e, reason: collision with root package name */
    public bb5.g f152200e = new bb5.g(15, new com.tencent.mm.plugin.nearby.ui.n0(this));

    /* renamed from: f, reason: collision with root package name */
    public bb5.e f152201f = null;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI f152202g;

    public q0(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI, android.content.Context context) {
        this.f152202g = nearbyFriendsUI;
        this.f152199d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f152202g.f152093m.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.b64) ((java.util.LinkedList) this.f152202g.f152093m).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.nearby.ui.r0 r0Var;
        if (this.f152201f == null) {
            this.f152201f = new com.tencent.mm.plugin.nearby.ui.o0(this);
        }
        bb5.g gVar = this.f152200e;
        if (gVar != null) {
            gVar.b(i17, this.f152201f);
        }
        android.content.Context context = this.f152199d;
        if (view == null) {
            r0Var = new com.tencent.mm.plugin.nearby.ui.r0();
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.c68, null);
            r0Var.f152204a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5r);
            r0Var.f152206c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5u);
            r0Var.f152205b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5m);
            r0Var.f152207d = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5l);
            r0Var.f152208e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5o);
            r0Var.f152209f = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5w);
            r0Var.f152210g = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5v);
            r0Var.f152212i = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5i);
            r0Var.f152213j = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5j);
            r0Var.f152214k = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5k);
            r0Var.f152215l = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.f483758bz2);
            android.view.ViewGroup.LayoutParams layoutParams = r0Var.f152210g.getLayoutParams();
            layoutParams.height = i65.a.h(context, com.tencent.mm.R.dimen.i_);
            layoutParams.width = i65.a.h(context, com.tencent.mm.R.dimen.i_);
            r0Var.f152210g.setLayoutParams(layoutParams);
            r0Var.f152211h = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5t);
            view2.setTag(r0Var);
        } else {
            view2 = view;
            r0Var = (com.tencent.mm.plugin.nearby.ui.r0) view.getTag();
        }
        com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI = this.f152202g;
        r45.b64 b64Var = (r45.b64) ((java.util.LinkedList) nearbyFriendsUI.f152093m).get(i17);
        android.widget.TextView textView = r0Var.f152204a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = b64Var.f370551e;
        float textSize = r0Var.f152204a.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        if (nearbyFriendsUI.f152096p == 1) {
            int i18 = b64Var.f370556m;
            if (i18 == 1) {
                r0Var.f152211h.setVisibility(0);
                r0Var.f152211h.setImageResource(com.tencent.mm.R.raw.ic_sex_male);
                r0Var.f152211h.setContentDescription(context.getString(com.tencent.mm.R.string.f492467gr0));
            } else if (i18 != 2) {
                r0Var.f152211h.setVisibility(8);
            } else {
                r0Var.f152211h.setVisibility(0);
                r0Var.f152211h.setImageResource(com.tencent.mm.R.raw.ic_sex_female);
                r0Var.f152211h.setContentDescription(context.getString(com.tencent.mm.R.string.cea));
            }
        } else {
            r0Var.f152211h.setVisibility(8);
        }
        if (b64Var.f370558o == 0 || c01.n8.b() == null) {
            r0Var.f152209f.setVisibility(8);
        } else {
            r0Var.f152209f.setVisibility(0);
            r0Var.f152209f.setImageBitmap(com.tencent.mm.sdk.platformtools.j.a(((xf4.d) c01.n8.b()).b(b64Var.f370558o, true), 2.0f));
            r0Var.f152211h.setVisibility(8);
        }
        r0Var.f152205b.setText(b64Var.f370555i);
        r0Var.f152212i.setVisibility(8);
        r0Var.f152213j.setVisibility(8);
        r0Var.f152214k.setVisibility(8);
        r0Var.f152215l.setVisibility(8);
        if (b64Var instanceof an3.c) {
            java.util.LinkedList linkedList = ((an3.c) b64Var).F;
            if (linkedList != null && linkedList.size() == 1) {
                r0Var.f152212i.setVisibility(0);
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.T6(nearbyFriendsUI, r0Var.f152212i, (java.lang.String) linkedList.get(0));
            } else if (linkedList != null && linkedList.size() == 2) {
                r0Var.f152212i.setVisibility(0);
                r0Var.f152213j.setVisibility(0);
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.T6(nearbyFriendsUI, r0Var.f152212i, (java.lang.String) linkedList.get(0));
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.T6(nearbyFriendsUI, r0Var.f152213j, (java.lang.String) linkedList.get(1));
            } else if (linkedList != null && linkedList.size() >= 3) {
                r0Var.f152212i.setVisibility(0);
                r0Var.f152213j.setVisibility(0);
                r0Var.f152214k.setVisibility(0);
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.T6(nearbyFriendsUI, r0Var.f152212i, (java.lang.String) linkedList.get(0));
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.T6(nearbyFriendsUI, r0Var.f152213j, (java.lang.String) linkedList.get(1));
                com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.T6(nearbyFriendsUI, r0Var.f152214k, (java.lang.String) linkedList.get(2));
            }
            com.tencent.mm.plugin.nearby.ui.l0 l0Var = (com.tencent.mm.plugin.nearby.ui.l0) ((java.util.HashMap) nearbyFriendsUI.f152094n).get(b64Var.f370550d);
            if (l0Var != null) {
                int i19 = l0Var.f152174l;
                if (i19 == -1) {
                    i19 = 0;
                }
                l0Var.f152174l = i19;
                if (l0Var.f152165c > 0) {
                    r0Var.f152215l.setVisibility(0);
                }
            }
            r0Var.f152215l.setOnClickListener(new com.tencent.mm.plugin.nearby.ui.p0(this, b64Var));
        }
        java.lang.String str2 = b64Var.f370554h;
        if (str2 == null || str2.trim().equals("")) {
            r0Var.f152206c.setVisibility(8);
        } else {
            r0Var.f152206c.setVisibility(0);
            android.widget.TextView textView2 = r0Var.f152206c;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = b64Var.f370554h;
            float textSize2 = r0Var.f152206c.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str3, textSize2));
        }
        r45.cb6 cb6Var = b64Var.f370566w;
        if (cb6Var == null || (cb6Var.f371428d & 1) <= 0) {
            r0Var.f152210g.setVisibility(8);
        } else {
            r0Var.f152210g.setVisibility(0);
        }
        if (b64Var.f370556m == 10000) {
            r0Var.f152207d.setImageBitmap(null);
            o11.f fVar = new o11.f();
            fVar.f342083g = g83.a.a();
            fVar.f342078b = true;
            fVar.f342095s = true;
            n11.a.b().h(b64Var.f370569z, r0Var.f152207d, fVar.a());
            if (com.tencent.mm.sdk.platformtools.t8.K0(b64Var.f370561r)) {
                r0Var.f152208e.setVisibility(8);
            } else {
                r0Var.f152208e.setText(b64Var.f370561r);
                r0Var.f152208e.setVisibility(0);
            }
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(r0Var.f152207d, b64Var.f370550d, null);
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(b64Var.f370550d)) {
                r0Var.f152208e.setVisibility(0);
                if (com.tencent.mm.storage.z3.D3(b64Var.f370558o)) {
                    r0Var.f152208e.setText(nearbyFriendsUI.getString(com.tencent.mm.R.string.f492620h62));
                } else {
                    com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(b64Var.f370550d);
                    if (q17 != null) {
                        android.widget.TextView textView3 = r0Var.f152204a;
                        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String g27 = com.tencent.mm.sdk.platformtools.t8.K0(q17.g2()) ? b64Var.f370551e : q17.g2();
                        float textSize3 = r0Var.f152204a.getTextSize();
                        ((ke0.e) xVar3).getClass();
                        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize3));
                    }
                    r0Var.f152208e.setText(nearbyFriendsUI.getString(com.tencent.mm.R.string.h67));
                }
            } else {
                r0Var.f152208e.setVisibility(8);
            }
        }
        return view2;
    }
}
