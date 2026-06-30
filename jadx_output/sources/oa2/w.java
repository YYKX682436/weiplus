package oa2;

/* loaded from: classes2.dex */
public final class w extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f343842g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f343843h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f343844i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f343845m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f343842g = jz5.h.b(new oa2.t(this));
        this.f343843h = jz5.h.b(oa2.s.f343836d);
    }

    public static final void V6(oa2.w wVar, r45.r03 r03Var) {
        r45.rz6 rz6Var;
        wVar.getClass();
        r45.r23 r23Var = (r45.r23) r03Var.getCustom(23);
        if (r23Var == null || (rz6Var = (r45.rz6) r23Var.getCustom(1)) == null) {
            return;
        }
        r45.q23 q23Var = new r45.q23();
        q23Var.f383585d = rz6Var.f385320d;
        q23Var.f383586e = rz6Var.f385321e;
        q23Var.f383587f = rz6Var.f385322f;
        q23Var.f383594p = r03Var.getLong(1);
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        w40.e.s5((w40.e) c17, wVar.getContext(), q23Var, 0L, 54, null, null, 0, false, 240, null);
    }

    @Override // x92.r
    public void U6() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.rz6 rz6Var;
        r45.rz6 rz6Var2;
        r45.rz6 rz6Var3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo;
        r45.rz6 rz6Var4;
        r45.rz6 rz6Var5;
        r45.rz6 rz6Var6;
        z5();
        r45.r03 r03Var = (r45.r03) this.f452719d;
        if (r03Var == null) {
            return;
        }
        so2.d5 d5Var = new so2.d5(r03Var);
        android.widget.TextView tmplTopicTitle = W6().f434664n;
        kotlin.jvm.internal.o.f(tmplTopicTitle, "tmplTopicTitle");
        com.tencent.mm.ui.fk.a(tmplTopicTitle);
        android.widget.TextView textView = W6().f434664n;
        jz5.g gVar = this.f343843h;
        le0.x xVar = (le0.x) ((jz5.n) gVar).getValue();
        android.app.Activity context = getContext();
        java.lang.String b17 = d5Var.b();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, b17));
        r45.r23 r23Var = (r45.r23) r03Var.getCustom(23);
        if ((r23Var == null || (rz6Var6 = (r45.rz6) r23Var.getCustom(1)) == null || rz6Var6.f385321e != 3) ? false : true) {
            W6().f434660j.setText(getContext().getResources().getString(com.tencent.mm.R.string.mau));
        } else {
            W6().f434660j.setText(getContext().getResources().getString(com.tencent.mm.R.string.mav));
        }
        if (d5Var.c() > 0) {
            W6().f434662l.setVisibility(0);
            W6().f434662l.setText(getContext().getResources().getString(com.tencent.mm.R.string.f8i, com.tencent.mm.plugin.finder.assist.w2.o(d5Var.c(), false)));
        } else {
            W6().f434662l.setVisibility(8);
        }
        android.widget.TextView tmplTopicAuthor = W6().f434661k;
        kotlin.jvm.internal.o.f(tmplTopicAuthor, "tmplTopicAuthor");
        com.tencent.mm.ui.fk.a(tmplTopicAuthor);
        android.widget.TextView tmplTopicAuthor2 = W6().f434661k;
        kotlin.jvm.internal.o.f(tmplTopicAuthor2, "tmplTopicAuthor");
        Y6(tmplTopicAuthor2, "template_page_finderuin_nickname", r03Var);
        W6().f434661k.setOnClickListener(new oa2.u(this, r03Var));
        android.widget.TextView tmplPostSameTv = W6().f434660j;
        kotlin.jvm.internal.o.f(tmplPostSameTv, "tmplPostSameTv");
        com.tencent.mm.ui.fk.a(tmplPostSameTv);
        W6().f434659i.setOnClickListener(new oa2.v(this, r03Var));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateViews] topicId:");
        sb6.append((java.lang.Object) jz5.x.a(r03Var.getLong(1)));
        sb6.append(" templateId:");
        r45.r23 r23Var2 = (r45.r23) r03Var.getCustom(23);
        sb6.append((r23Var2 == null || (rz6Var5 = (r45.rz6) r23Var2.getCustom(1)) == null) ? null : rz6Var5.f385320d);
        sb6.append(" templateType:");
        r45.r23 r23Var3 = (r45.r23) r03Var.getCustom(23);
        sb6.append((r23Var3 == null || (rz6Var4 = (r45.rz6) r23Var3.getCustom(1)) == null) ? null : java.lang.Integer.valueOf(rz6Var4.f385321e));
        com.tencent.mars.xlog.Log.i("FinderTemplateTopicHeaderUIC", sb6.toString());
        android.widget.LinearLayout tmplPostSame = W6().f434659i;
        kotlin.jvm.internal.o.f(tmplPostSame, "tmplPostSame");
        Y6(tmplPostSame, "template_feed_shoot", r03Var);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        java.lang.String a17 = d5Var.a();
        com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128356f;
        mn2.q3 q3Var = new mn2.q3(a17, y90Var);
        android.widget.ImageView tmplTopicCover = W6().f434663m;
        kotlin.jvm.internal.o.f(tmplTopicCover, "tmplTopicCover");
        mn2.f1 f1Var = mn2.f1.f329953d;
        e17.c(q3Var, tmplTopicCover, g1Var.h(f1Var));
        r45.r23 r23Var4 = (r45.r23) r03Var.getCustom(23);
        if (r23Var4 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) r23Var4.getCustom(0)) == null) {
            str = "";
            str2 = "FinderTemplateTopicHeaderUIC";
            str3 = null;
        } else {
            le0.x xVar2 = (le0.x) ((jz5.n) gVar).getValue();
            android.app.Activity context2 = getContext();
            java.lang.String nickname = finderContact.getNickname();
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context2, nickname);
            W6().f434661k.setText(i17);
            r45.xk a18 = ya2.d.a(finderContact, false);
            if (a18 == null || (authInfo = ya2.d.e(a18)) == null) {
                authInfo = finderContact.getAuthInfo();
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f460511a;
            android.widget.ImageView authIcon = W6().f434652b;
            kotlin.jvm.internal.o.f(authIcon, "authIcon");
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = authInfo;
            zy2.tb.a(m1Var, authIcon, finderAuthInfo, 0, 4, null);
            W6().f434657g.setVisibility(0);
            vo0.d a19 = g1Var.a();
            str = "";
            str2 = "FinderTemplateTopicHeaderUIC";
            str3 = null;
            mn2.n nVar = new mn2.n(finderContact.getHeadUrl(), null, 2, null);
            android.widget.ImageView tmplDesignerAvatar = W6().f434655e;
            kotlin.jvm.internal.o.f(tmplDesignerAvatar, "tmplDesignerAvatar");
            a19.c(nVar, tmplDesignerAvatar, g1Var.h(mn2.f1.f329957h));
            android.widget.TextView tmplDesignerAuthor = W6().f434654d;
            kotlin.jvm.internal.o.f(tmplDesignerAuthor, "tmplDesignerAuthor");
            com.tencent.mm.ui.fk.a(tmplDesignerAuthor);
            W6().f434654d.setText(i17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.widget.ImageView tmplDesignerAuthIcon = W6().f434653c;
            kotlin.jvm.internal.o.f(tmplDesignerAuthIcon, "tmplDesignerAuthIcon");
            zy2.tb.a(m1Var, tmplDesignerAuthIcon, finderAuthInfo, 0, 4, null);
            r45.r23 r23Var5 = (r45.r23) r03Var.getCustom(23);
            int integer = r23Var5 != null ? r23Var5.getInteger(4) : 0;
            if (integer > 0 && finderContact.getFriend_follow_count() > 0) {
                W6().f434658h.setText(getContext().getResources().getString(com.tencent.mm.R.string.max, java.lang.Integer.valueOf(integer), java.lang.Integer.valueOf(finderContact.getFriend_follow_count())));
            } else if (integer > 0) {
                W6().f434658h.setText(getContext().getResources().getString(com.tencent.mm.R.string.may, java.lang.Integer.valueOf(integer)));
            } else if (finderContact.getFriend_follow_count() > 0) {
                W6().f434658h.setText(getContext().getResources().getString(com.tencent.mm.R.string.f491395cy5, java.lang.Integer.valueOf(finderContact.getFriend_follow_count())));
            }
            java.lang.String username = finderContact.getUsername();
            if (username == null) {
                username = str;
            }
            W6().f434657g.setOnClickListener(new oa2.p(username, this));
            android.widget.TextView tmplDesignerFollow = W6().f434656f;
            kotlin.jvm.internal.o.f(tmplDesignerFollow, "tmplDesignerFollow");
            com.tencent.mm.ui.fk.a(tmplDesignerFollow);
            android.widget.TextView tmplDesignerFollow2 = W6().f434656f;
            kotlin.jvm.internal.o.f(tmplDesignerFollow2, "tmplDesignerFollow");
            Y6(tmplDesignerFollow2, "template_page_follow", r03Var);
            W6().f434656f.setText(ya2.g.h(ya2.h.f460484a, username, null, false, false, 14, null) ? getString(com.tencent.mm.R.string.f491393cy3) : getString(com.tencent.mm.R.string.cxd));
            W6().f434656f.setOnClickListener(new oa2.q(username, this, finderContact));
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.r_4);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.eon);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.eoo);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.eoq);
        findViewById.setOnClickListener(oa2.n.f343826d);
        so2.d5 d5Var2 = new so2.d5(r03Var);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        le0.x xVar3 = (le0.x) ((jz5.n) gVar).getValue();
        android.app.Activity context3 = getContext();
        java.lang.String b18 = d5Var2.b();
        ((ke0.e) xVar3).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context3, b18));
        if (d5Var2.c() > 0) {
            textView3.setVisibility(0);
            textView3.setText(getContext().getResources().getString(com.tencent.mm.R.string.f8i, com.tencent.mm.plugin.finder.assist.w2.o(d5Var2.c(), false)));
        } else {
            textView3.setVisibility(8);
        }
        vo0.d e18 = g1Var.e();
        mn2.q3 q3Var2 = new mn2.q3(d5Var2.a(), y90Var);
        kotlin.jvm.internal.o.d(imageView);
        e18.c(q3Var2, imageView, g1Var.h(f1Var));
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.atl);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new oa2.o(this, r03Var));
        }
        android.widget.TextView textView4 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.atk);
        kotlin.jvm.internal.o.d(textView4);
        com.tencent.mm.ui.fk.a(textView4);
        r45.r23 r23Var6 = (r45.r23) r03Var.getCustom(23);
        textView4.setText(r23Var6 != null && (rz6Var3 = (r45.rz6) r23Var6.getCustom(1)) != null && rz6Var3.f385321e == 3 ? getContext().getResources().getString(com.tencent.mm.R.string.f9v) : getContext().getResources().getString(com.tencent.mm.R.string.f9u));
        r45.r23 r23Var7 = (r45.r23) r03Var.getCustom(23);
        java.lang.String str4 = (r23Var7 == null || (rz6Var2 = (r45.rz6) r23Var7.getCustom(1)) == null) ? str3 : rz6Var2.f385320d;
        java.lang.String str5 = str4 == null ? str : str4;
        r45.r23 r23Var8 = (r45.r23) r03Var.getCustom(23);
        int i18 = (r23Var8 == null || (rz6Var = (r45.rz6) r23Var8.getCustom(1)) == null) ? 0 : rz6Var.f385321e;
        com.tencent.mars.xlog.Log.i(str2, "[preloadCameraTemplate] templateId:" + str5 + " templateType:" + i18);
        if (i18 == 3) {
            i95.m c17 = i95.n0.c(bg0.v.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((b92.u2) ((bg0.v) c17)).fj(54, str5, false);
        }
    }

    public final vb2.l0 W6() {
        return (vb2.l0) ((jz5.n) this.f343842g).getValue();
    }

    public final void X6(com.tencent.mm.protocal.protobuf.FinderContact finderContact, boolean z17) {
        int i17;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        if (z17) {
            int i18 = db2.m0.f228066v;
            i17 = 1;
        } else {
            int i19 = db2.m0.f228066v;
            i17 = 2;
        }
        int i27 = i17;
        so2.z1 z1Var = so2.z1.f410730a;
        java.lang.String username = finderContact.getUsername();
        if (username == null) {
            username = "";
        }
        so2.z1.d(z1Var, V6, username, i27, 0L, null, false, null, null, null, 0, null, null, 0, null, null, null, 65504, null);
        W6().f434656f.setText(z17 ? getString(com.tencent.mm.R.string.f491393cy3) : getString(com.tencent.mm.R.string.cxd));
    }

    public final void Y6(android.view.View view, java.lang.String str, r45.r03 r03Var) {
        hc2.v0.e(view, str, 0, 0, false, false, null, new oa2.r(this, r03Var), 62, null);
    }
}
