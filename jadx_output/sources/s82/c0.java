package s82;

/* loaded from: classes9.dex */
public class c0 extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final int f404749f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f404750g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f404751h;

    public c0(com.tencent.mm.plugin.fav.ui.ra raVar) {
        super(raVar);
        this.f404751h = new s82.a0(this);
        this.f404749f = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479775ew);
        this.f404750g = new java.util.HashSet();
    }

    public static void l(s82.c0 c0Var, android.widget.ImageView imageView) {
        java.util.HashSet hashSet = (java.util.HashSet) c0Var.f404750g;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "mask iv set size is %d", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) it.next();
            if (imageView2 == imageView) {
                imageView2.setImageResource(com.tencent.mm.R.drawable.as6);
            } else {
                imageView2.setImageResource(com.tencent.mm.R.drawable.as8);
            }
        }
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        r45.gp0 J2 = o72.x1.J(r2Var);
        java.lang.String str = J2.f375408f;
        r45.hp0 hp0Var = J2.J1;
        r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
        if (xs4Var == null) {
            return str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(3))) {
            return !com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(4)) ? xs4Var.getString(4) : str;
        }
        return xs4Var.getString(3) + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h47);
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.tencent.mm.R.raw.fav_type_music);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.b0 b0Var;
        java.lang.String str;
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            s82.b0 b0Var2 = new s82.b0();
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.abb, null);
            a(inflate, b0Var2, r2Var);
            b0Var2.f404733q = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.dum);
            b0Var2.f404735s = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dwp);
            b0Var2.f404736t = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484314du0);
            b0Var2.f404734r = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.dur);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dvy)).setVisibility(8);
            b0Var2.f404734r.setOnClickListener(this.f404751h);
            b0Var2.f404734r.setVisibility(0);
            ((java.util.HashSet) this.f404750g).add(b0Var2.f404734r);
            s82.c.h(b0Var2.f404733q, 7);
            b0Var = b0Var2;
            view2 = inflate;
        } else {
            try {
                view2 = view;
                b0Var = (s82.b0) view.getTag();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavBaseListItem", "invalid type, message:" + e17.getMessage());
                return view;
            }
        }
        g(b0Var, r2Var);
        if (r2Var.field_sourceType == 31) {
            android.widget.TextView textView = b0Var.f404776c;
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.clc));
        }
        r45.gp0 J2 = o72.x1.J(r2Var);
        if (J2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavBaseListItem", "getView, data item is null");
            return view2;
        }
        java.lang.String str2 = J2.f375404d;
        java.lang.String str3 = J2.f375408f;
        r45.hp0 hp0Var = J2.J1;
        r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
        if (xs4Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(3))) {
                str3 = xs4Var.getString(3) + context.getString(com.tencent.mm.R.string.h47);
                str2 = str2 + java.lang.String.format("·%s", J2.f375408f);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(4))) {
                str3 = xs4Var.getString(4);
            }
            str = xs4Var.getString(2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = xs4Var.getString(16);
            }
        } else {
            str = "";
        }
        b0Var.f404735s.setText(str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            b0Var.f404736t.setVisibility(0);
        }
        if (J2.J1 == null) {
            J2.J1 = new r45.hp0();
        }
        r45.hp0 hp0Var2 = J2.J1;
        if (hp0Var2.C == null) {
            hp0Var2.C = new r45.xs4();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.fav.ui.ra raVar = this.f404739c;
            android.widget.ImageView imageView = b0Var.f404733q;
            int i17 = this.f404749f;
            raVar.c(imageView, J2, r2Var, com.tencent.mm.R.raw.music_default, i17, i17);
        } else {
            o11.f fVar = new o11.f();
            java.lang.String c17 = xl3.c.c(str.hashCode() + "", false);
            fVar.f342082f = c17;
            fVar.f342078b = true;
            fVar.f342096t = true;
            fVar.f342077a = true;
            fVar.f342095s = true;
            fVar.f342097u = i65.a.b(context, 2);
            n11.a.b().h(str, b0Var.f404733q, fVar.a());
            J2.J1.C.set(13, c17);
        }
        b0Var.f404734r.setTag(r2Var);
        if (o72.x1.k0(J2)) {
            b0Var.f404734r.setImageResource(com.tencent.mm.R.drawable.as6);
            b0Var.f404734r.setContentDescription(context.getString(com.tencent.mm.R.string.f490511x5));
        } else {
            b0Var.f404734r.setImageResource(com.tencent.mm.R.drawable.as8);
            b0Var.f404734r.setContentDescription(context.getString(com.tencent.mm.R.string.f490519xf));
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        if (com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(view.getContext(), null)) {
            s82.b0 b0Var = (s82.b0) view.getTag();
            android.content.Context context = view.getContext();
            ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, b0Var.f404774a, dq0Var);
        }
    }
}
