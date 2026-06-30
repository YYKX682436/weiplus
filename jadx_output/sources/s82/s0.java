package s82;

/* loaded from: classes9.dex */
public final class s0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f404835f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f404836g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f404837h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.fav.ui.ra imageServer) {
        super(imageServer);
        kotlin.jvm.internal.o.g(imageServer, "imageServer");
        this.f404837h = new s82.r0(imageServer, this);
        this.f404835f = i65.a.h(imageServer.f101384a, com.tencent.mm.R.dimen.f479775ew);
        this.f404836g = new java.util.HashSet();
    }

    public static final void l(s82.s0 s0Var, android.widget.ImageView imageView) {
        java.util.HashSet hashSet = (java.util.HashSet) s0Var.f404836g;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTingMusicListItem", "mask iv set size is %d", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) it.next();
            if (imageView2 == imageView) {
                if (imageView2 != null) {
                    imageView2.setImageResource(com.tencent.mm.R.drawable.as6);
                }
            } else if (imageView2 != null) {
                imageView2.setImageResource(com.tencent.mm.R.drawable.as8);
            }
        }
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        java.lang.String string;
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String str = J2.f375408f;
        r45.hp0 hp0Var = J2.J1;
        r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
        java.lang.String string2 = xs4Var != null ? xs4Var.getString(4) : null;
        if (!(string2 == null || string2.length() == 0)) {
            str = (xs4Var == null || (string = xs4Var.getString(4)) == null) ? "" : string;
        }
        return str == null ? "" : str;
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.tencent.mm.R.raw.fav_type_music);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup parent, o72.r2 r2Var) {
        android.view.View view2;
        s82.q0 q0Var;
        android.widget.ImageView imageView;
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (view == null) {
            s82.q0 q0Var2 = new s82.q0();
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.abb, null);
            a(inflate, q0Var2, r2Var);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.dum);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            q0Var2.f404829q = (android.widget.ImageView) findViewById;
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.dwp);
            kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            q0Var2.f404831s = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f484314du0);
            kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.dur);
            kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            q0Var2.f404830r = (android.widget.ImageView) findViewById4;
            android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.dvy);
            kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) findViewById5).setVisibility(8);
            android.widget.ImageView imageView2 = q0Var2.f404830r;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this.f404837h);
            }
            android.widget.ImageView imageView3 = q0Var2.f404830r;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ((java.util.HashSet) this.f404836g).add(q0Var2.f404830r);
            s82.c.i(q0Var2.f404829q, 32, o72.x1.J(r2Var));
            q0Var = q0Var2;
            view2 = inflate;
        } else {
            try {
                java.lang.Object tag = view.getTag();
                view2 = view;
                q0Var = tag instanceof s82.q0 ? (s82.q0) tag : null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavTingMusicListItem", "invalid type, message:" + e17.getMessage());
                return view;
            }
        }
        if (q0Var == null) {
            return view2;
        }
        g(q0Var, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        if (J2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTingMusicListItem", "getView, data item is null");
            return view2;
        }
        java.lang.String str = J2.f375404d;
        r45.hp0 hp0Var = J2.J1;
        r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
        java.lang.String string = xs4Var != null ? xs4Var.getString(4) : null;
        if (!(string == null || string.length() == 0) && xs4Var != null) {
            xs4Var.getString(4);
        }
        if (xs4Var != null) {
            xs4Var.getString(16);
        }
        android.widget.TextView textView = q0Var.f404831s;
        if (textView != null) {
            textView.setText(str);
        }
        if (J2.J1 == null) {
            J2.J1 = new r45.hp0();
        }
        r45.hp0 hp0Var2 = J2.J1;
        if (hp0Var2.C == null) {
            hp0Var2.C = new r45.xs4();
        }
        com.tencent.mm.plugin.fav.ui.ra raVar = this.f404739c;
        android.widget.ImageView imageView4 = q0Var.f404829q;
        int Vi = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi();
        int i17 = this.f404835f;
        raVar.c(imageView4, J2, r2Var, Vi, i17, i17);
        android.widget.ImageView imageView5 = q0Var.f404830r;
        if (imageView5 != null) {
            imageView5.setTag(r2Var);
        }
        android.widget.ImageView imageView6 = q0Var.f404830r;
        if (imageView6 != null) {
            imageView6.setVisibility(0);
        }
        if (o72.x1.k0(J2)) {
            android.widget.ImageView imageView7 = q0Var.f404830r;
            if (imageView7 != null) {
                imageView7.setImageResource(com.tencent.mm.R.drawable.as6);
            }
            android.widget.ImageView imageView8 = q0Var.f404830r;
            if (imageView8 != null) {
                imageView8.setContentDescription(context.getString(com.tencent.mm.R.string.f490511x5));
            }
        } else {
            android.widget.ImageView imageView9 = q0Var.f404830r;
            if (imageView9 != null) {
                imageView9.setImageResource(com.tencent.mm.R.drawable.as8);
            }
            android.widget.ImageView imageView10 = q0Var.f404830r;
            if (imageView10 != null) {
                imageView10.setContentDescription(context.getString(com.tencent.mm.R.string.f490519xf));
            }
        }
        if (xs4Var != null && xs4Var.getInteger(18) > 0) {
            qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
            int integer = xs4Var.getInteger(18);
            ((ef0.l4) i9Var).getClass();
            if (!km4.v.b(context, integer, false) && (imageView = q0Var.f404830r) != null) {
                imageView.setVisibility(8);
            }
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        kotlin.jvm.internal.o.g(view, "view");
        if (com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(view.getContext(), null)) {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavTingMusicListItem.FavTingMusicHolder");
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(view.getContext(), ((s82.q0) tag).f404774a, dq0Var);
        }
    }
}
