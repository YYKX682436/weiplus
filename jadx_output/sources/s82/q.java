package s82;

/* loaded from: classes9.dex */
public final class q extends s82.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.fav.ui.ra imageServer) {
        super(imageServer);
        kotlin.jvm.internal.o.g(imageServer, "imageServer");
        i65.a.h(imageServer.f101384a, com.tencent.mm.R.dimen.f479773eu);
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        java.lang.String str;
        r45.bq0 bq0Var;
        r45.kv2 kv2Var;
        if (r2Var == null || (bq0Var = r2Var.field_favProto) == null || (kv2Var = bq0Var.M) == null) {
            str = null;
        } else {
            java.lang.String string = kv2Var.getString(15);
            java.lang.String string2 = string == null || string.length() == 0 ? kv2Var.getString(2) : kv2Var.getString(15);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ke0.e) xVar).getClass();
            str = com.tencent.mm.pluginsdk.ui.span.c0.i(context, string2).toString();
        }
        return str == null ? "" : str;
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_finder_icon);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        s82.p pVar;
        android.view.View view2;
        r45.bq0 bq0Var;
        r45.kv2 kv2Var;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (view == null) {
            pVar = new s82.p(this);
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.abe, null);
            a(view2, pVar, r2Var);
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.dvj);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            pVar.f404826s = (android.widget.ImageView) findViewById;
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.dvr);
            kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            pVar.f404824q = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.dvk);
            kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            pVar.f404825r = (android.widget.TextView) findViewById3;
            android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.f484528ei5);
            kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            pVar.f404827t = (android.widget.ImageView) findViewById4;
            android.view.View findViewById5 = view2.findViewById(com.tencent.mm.R.id.dvq);
            kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
            pVar.f404828u = (android.widget.ImageView) findViewById5;
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderListItem.FavFinderHolder");
            pVar = (s82.p) tag;
            view2 = view;
        }
        g(pVar, r2Var);
        s82.c.j(pVar.f404826s, r2Var);
        android.widget.TextView textView = pVar.f404824q;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = pVar.f404825r;
        if (textView2 != null) {
            textView2.setText("");
        }
        if (r2Var != null && (bq0Var = r2Var.field_favProto) != null && (kv2Var = bq0Var.M) != null) {
            java.lang.String string = kv2Var.getString(15);
            boolean z17 = true;
            java.lang.String string2 = string == null || string.length() == 0 ? kv2Var.getString(2) : kv2Var.getString(15);
            if (kv2Var.getInteger(5) != 1) {
                java.lang.String string3 = kv2Var.getString(4);
                if (string3 != null && string3.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    android.widget.TextView textView3 = pVar.f404825r;
                    if (textView3 != null) {
                        kotlin.jvm.internal.o.d(context);
                        textView3.setText(context.getResources().getString(com.tencent.mm.R.string.f491216cd3, string2));
                    }
                } else {
                    android.widget.TextView textView4 = pVar.f404825r;
                    if (textView4 != null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String string4 = kv2Var.getString(4);
                        ((ke0.e) xVar).getClass();
                        textView4.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string4));
                    }
                }
            }
            android.widget.ImageView imageView = pVar.f404828u;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            int integer = kv2Var.getInteger(5);
            if (integer == 2) {
                android.widget.ImageView imageView2 = pVar.f404827t;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                android.widget.ImageView imageView3 = pVar.f404827t;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_album, i65.a.d(context, com.tencent.mm.R.color.f478553an)));
                }
            } else if (integer != 4) {
                android.widget.ImageView imageView4 = pVar.f404827t;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
            } else {
                android.widget.ImageView imageView5 = pVar.f404828u;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                }
            }
            if (kv2Var.getList(7) != null && !kv2Var.getList(7).isEmpty()) {
                r45.iv2 iv2Var = (r45.iv2) kv2Var.getList(7).get(0);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                zy2.v8.b(ya2.l.f460502a, iv2Var.getString(2), pVar.f404826s, null, 4, null);
            }
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.bq0 bq0Var;
        r45.kv2 kv2Var;
        if (com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(view != null ? view.getContext() : null, null)) {
            java.lang.Object tag = view != null ? view.getTag() : null;
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderListItem.FavFinderHolder");
            o72.r2 r2Var = ((s82.p) tag).f404774a;
            if (r2Var == null || (bq0Var = r2Var.field_favProto) == null || (kv2Var = bq0Var.M) == null) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.x2 x2Var = com.tencent.mm.plugin.fav.ui.x2.f101594a;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            x2Var.a(context, kv2Var);
        }
    }
}
