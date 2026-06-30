package s82;

/* loaded from: classes9.dex */
public class v0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f404848f;

    public v0(com.tencent.mm.plugin.fav.ui.ra raVar) {
        super(raVar);
        this.f404848f = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479775ew);
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        r45.jq0 jq0Var;
        com.tencent.mm.storage.z3 f07;
        java.lang.String str;
        r45.km6 km6Var;
        r45.gp0 J2 = o72.x1.J(r2Var);
        int i17 = r2Var.field_type;
        if (i17 == 33) {
            if (J2 != null && (km6Var = J2.J1.G) != null) {
                boolean q17 = il4.d.q(km6Var.f378838d);
                boolean z17 = !il4.d.f292102a.u(km6Var.f378838d);
                il4.d.n(com.tencent.mm.sdk.platformtools.x2.f193071a, km6Var);
                return (q17 || z17) ? il4.d.g(il4.d.v(km6Var.f378839e)) : J2.f375408f;
            }
        } else {
            if (i17 == 24) {
                r45.bq0 bq0Var = r2Var.field_favProto;
                r45.op0 op0Var = bq0Var != null ? bq0Var.P : null;
                return (op0Var == null || (str = op0Var.f382410g) == null) ? "" : str;
            }
            if (i17 == 5 && (jq0Var = r2Var.field_favProto.f370962d) != null && !com.tencent.mm.sdk.platformtools.t8.K0(jq0Var.B) && (f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(jq0Var.B)) != null && f07.d1().equals(jq0Var.B)) {
                return f07.g2();
            }
        }
        return "";
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return (gp0Var == null || gp0Var.I == 33) ? java.lang.Integer.valueOf(com.tencent.mm.R.raw.fav_type_music) : java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_subscriptions);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.u0 u0Var;
        int i17;
        r45.op0 op0Var;
        r45.qp0 qp0Var;
        r45.km6 km6Var;
        if (r2Var.field_favProto == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavUrlListItem", "getView: err favProto null");
            r2Var.field_favProto = new r45.bq0();
        }
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            s82.u0 u0Var2 = new s82.u0();
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.abb, null);
            a(inflate, u0Var2, r2Var);
            u0Var2.f404841q = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.dum);
            u0Var2.f404842r = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.dur);
            u0Var2.f404843s = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dwp);
            u0Var2.f404844t = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484314du0);
            u0Var2.f404843s.setMaxLines(2);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484314du0);
            u0Var2.f404844t = textView;
            textView.setMaxLines(2);
            u0Var = u0Var2;
            view2 = inflate;
        } else {
            view2 = view;
            u0Var = (s82.u0) view.getTag();
        }
        g(u0Var, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        r45.tq0 tq0Var = r2Var.field_favProto.f370968m;
        if (tq0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavUrlListItem", "getView: urlItem null, type=%d, id=%d, sourceType=%d", java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(r2Var.field_id), java.lang.Integer.valueOf(r2Var.field_sourceType));
        }
        android.widget.TextView textView2 = u0Var.f404843s;
        r45.gp0 J3 = o72.x1.J(r2Var);
        java.lang.String str = tq0Var != null ? tq0Var.f386664d : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && J3 != null) {
            str = J3.f375404d;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView2.setVisibility(8);
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = textView2.getContext();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str));
            textView2.setVisibility(0);
        }
        int i18 = r2Var.field_type;
        if (i18 == 33) {
            if (J2 != null && (km6Var = J2.J1.G) != null) {
                int i19 = km6Var.f378838d;
                il4.d dVar = il4.d.f292102a;
                boolean z17 = i19 == 4;
                boolean q17 = il4.d.q(i19);
                boolean u17 = true ^ il4.d.f292102a.u(km6Var.f378838d);
                java.lang.String n17 = il4.d.n(viewGroup.getContext(), km6Var);
                if (z17) {
                    u0Var.f404844t.setText(n17);
                } else if (q17 || u17) {
                    il4.d.g(il4.d.v(km6Var.f378839e));
                    if (u17) {
                        u0Var.f404844t.setText(i65.a.r(context, com.tencent.mm.R.string.c_6));
                    } else {
                        u0Var.f404844t.setText(i65.a.r(context, com.tencent.mm.R.string.c_5));
                    }
                }
            }
        } else if (i18 == 24) {
            r45.bq0 bq0Var = r2Var.field_favProto;
            r45.op0 op0Var2 = bq0Var != null ? bq0Var.P : null;
            int i27 = r2Var.field_subType;
            if (op0Var2 != null) {
                if (i27 == 0 && (i17 = op0Var2.f382408e) != 0) {
                    i27 = i17;
                }
                u0Var.f404843s.setVisibility(0);
                u0Var.f404844t.setVisibility(0);
                java.lang.String str2 = op0Var2.f382413m;
                if (str2 == null) {
                    str2 = "";
                }
                java.lang.String str3 = op0Var2.f382412i;
                if (str3 == null) {
                    str3 = "";
                }
                u0Var.f404844t.setText(str2);
                u0Var.f404843s.setText(str3);
                u0Var.f404775b.setVisibility(0);
                if (i27 == 1) {
                    u0Var.f404775b.s(com.tencent.mm.R.raw.favorites_ask_logo, com.tencent.mm.R.color.FG_2);
                } else if (i27 == 2) {
                    u0Var.f404775b.s(com.tencent.mm.R.raw.search_filled, com.tencent.mm.R.color.FG_2);
                } else if (i27 == 3) {
                    u0Var.f404775b.s(com.tencent.mm.R.raw.game_fav, com.tencent.mm.R.color.FG_2);
                }
            }
        }
        int a17 = o25.y.a(J2.K);
        com.tencent.mm.plugin.fav.ui.ra raVar = this.f404739c;
        android.widget.ImageView imageView = u0Var.f404841q;
        if (a17 == (com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.unknown_default_dark : com.tencent.mm.R.raw.unknown_default_light)) {
            a17 = com.tencent.mm.R.drawable.f481487bi5;
        }
        int i28 = this.f404848f;
        raVar.c(imageView, J2, r2Var, a17, i28, i28);
        r45.bq0 bq0Var2 = r2Var.field_favProto;
        if ((bq0Var2 == null || (qp0Var = bq0Var2.K) == null || qp0Var.f384162d != 16) && (tq0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(tq0Var.f386678u))) {
            u0Var.f404842r.setVisibility(8);
        } else {
            u0Var.f404842r.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
            u0Var.f404842r.setVisibility(0);
        }
        if (r2Var.field_type == 24) {
            r45.bq0 bq0Var3 = r2Var.field_favProto;
            if (bq0Var3 == null || (op0Var = bq0Var3.P) == null || op0Var.f382411h != 2) {
                u0Var.f404842r.setVisibility(8);
            } else {
                u0Var.f404842r.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
                u0Var.f404842r.setVisibility(0);
            }
        }
        android.widget.ImageView imageView2 = u0Var.f404842r;
        if (imageView2 != null) {
            imageView2.setContentDescription("");
        }
        if (J2.I == 33) {
            s82.c.h(u0Var.f404841q, 33);
        } else {
            s82.c.h(u0Var.f404841q, 5);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.qp0 qp0Var;
        s82.u0 u0Var = (s82.u0) view.getTag();
        android.content.Context context = view.getContext();
        android.widget.ImageView imageView = u0Var.f404841q;
        o72.r2 r2Var = u0Var.f404774a;
        r45.bq0 bq0Var = r2Var.field_favProto;
        if (bq0Var != null && (qp0Var = bq0Var.K) != null && qp0Var.f384162d >= 0) {
            int[] iArr = new int[2];
            if (imageView != null) {
                int width = imageView.getWidth();
                int height = imageView.getHeight();
                imageView.getLocationInWindow(iArr);
                r45.qp0 qp0Var2 = r2Var.field_favProto.K;
                r45.rp0 rp0Var = new r45.rp0();
                qp0Var2.f384172q = rp0Var;
                rp0Var.f385070d = iArr[0];
                rp0Var.f385071e = iArr[1];
                rp0Var.f385072f = width;
                rp0Var.f385073g = height;
            }
        }
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, u0Var.f404774a, dq0Var);
    }
}
