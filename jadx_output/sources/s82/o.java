package s82;

/* loaded from: classes10.dex */
public final class o extends s82.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f404822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.fav.ui.ra imageServer) {
        super(imageServer);
        kotlin.jvm.internal.o.g(imageServer, "imageServer");
        this.f404822f = "FavFinderCollectionLiteItem";
    }

    @Override // s82.c
    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        r45.bq0 bq0Var;
        r45.ev2 ev2Var;
        ya2.b2 Ui;
        boolean z17 = false;
        if (r2Var != null && r2Var.field_type == 34) {
            z17 = true;
        }
        if (!z17 || (bq0Var = r2Var.field_favProto) == null || (ev2Var = bq0Var.Q) == null) {
            return "";
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String string = ev2Var.getString(8);
        com.tencent.mm.protocal.protobuf.FinderContact i17 = (string == null || (Ui = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ui(string)) == null) ? null : ya2.d.i(Ui);
        if (i17 == null) {
            i17 = new com.tencent.mm.protocal.protobuf.FinderContact();
            i17.setNickname(ev2Var.getString(9));
            i17.setHeadUrl(ev2Var.getString(10));
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
            finderAuthInfo.setAuthIconUrl(ev2Var.getString(11));
            finderAuthInfo.setAuthIconType(ev2Var.getInteger(12));
            i17.setAuthInfo(finderAuthInfo);
        }
        java.lang.String nickname = i17.getNickname();
        return nickname == null ? "" : nickname;
    }

    @Override // s82.c
    public java.lang.Integer d(r45.gp0 gp0Var) {
        return java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_finder_icon);
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.n nVar;
        r45.bq0 bq0Var;
        r45.ev2 ev2Var;
        android.content.res.Resources resources;
        java.lang.String str = null;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (view == null) {
            nVar = new s82.n(this);
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f488760e54, null);
            a(view2, nVar, r2Var);
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.dvj);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            nVar.f404819s = (android.widget.ImageView) findViewById;
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.dvr);
            kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            nVar.f404817q = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.dvk);
            kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            nVar.f404818r = (android.widget.TextView) findViewById3;
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderCollectionLiteItem.FavFinderCollectionHolder");
            s82.n nVar2 = (s82.n) tag;
            view2 = view;
            nVar = nVar2;
        }
        g(nVar, r2Var);
        s82.c.j(nVar.f404819s, r2Var);
        android.widget.TextView textView = nVar.f404817q;
        if (textView != null) {
            textView.setText("");
        }
        android.widget.TextView textView2 = nVar.f404818r;
        if (textView2 != null) {
            textView2.setText("");
        }
        boolean z17 = true;
        if ((r2Var != null && r2Var.field_type == 34) && (bq0Var = r2Var.field_favProto) != null && (ev2Var = bq0Var.Q) != null) {
            com.tencent.mars.xlog.Log.i(this.f404822f, "sourceId=" + r2Var.field_sourceId + ",finderCollectionItem=" + ev2Var.toJSON());
            java.lang.String string = ev2Var.getString(1);
            java.lang.String string2 = string == null || string.length() == 0 ? ev2Var.getString(2) : ev2Var.getString(1);
            if (string2 != null && string2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                android.widget.TextView textView3 = nVar.f404817q;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
            } else {
                android.widget.TextView textView4 = nVar.f404817q;
                if (textView4 != null) {
                    textView4.setText(string2);
                }
                android.widget.TextView textView5 = nVar.f404817q;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
            }
            if (ev2Var.getInteger(4) > 0) {
                android.widget.TextView textView6 = nVar.f404818r;
                if (textView6 != null) {
                    if (context != null && (resources = context.getResources()) != null) {
                        str = resources.getString(com.tencent.mm.R.string.f491214ng4, java.lang.Integer.valueOf(ev2Var.getInteger(4)));
                    }
                    textView6.setText(str);
                }
                android.widget.TextView textView7 = nVar.f404818r;
                if (textView7 != null) {
                    textView7.setTextColor(textView7.getResources().getColor(com.tencent.mm.R.color.FG_2));
                    textView7.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3));
                }
                android.widget.TextView textView8 = nVar.f404818r;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
            } else {
                android.widget.TextView textView9 = nVar.f404818r;
                if (textView9 != null) {
                    textView9.setVisibility(8);
                }
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            zy2.v8.b(ya2.l.f460502a, ev2Var.getString(3), nVar.f404819s, null, 4, null);
        }
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.bq0 bq0Var;
        r45.ev2 ev2Var;
        if (com.tencent.mm.sdk.platformtools.f9.SessionChannels.k(view != null ? view.getContext() : null, null)) {
            java.lang.Object tag = view != null ? view.getTag() : null;
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.ui.listitem.FavFinderCollectionLiteItem.FavFinderCollectionHolder");
            o72.r2 r2Var = ((s82.n) tag).f404774a;
            if (!(r2Var != null && r2Var.field_type == 34) || r2Var == null || (bq0Var = r2Var.field_favProto) == null || (ev2Var = bq0Var.Q) == null) {
                return;
            }
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavFinderLogic", "goFinderCollection topicId " + pm0.v.u(ev2Var.getLong(0)) + '}');
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.n(context, ev2Var, 43);
        }
    }
}
