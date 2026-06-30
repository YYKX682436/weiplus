package io;

/* loaded from: classes9.dex */
public final class b implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.o0 f293166a;

    /* renamed from: b, reason: collision with root package name */
    public nb5.a f293167b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.o0 o0Var = this.f293166a;
        android.view.View view = o0Var != null ? o0Var.f254656a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehn, (android.view.ViewGroup) null);
        this.f293166a = new em.o0(inflate);
        c(null, this.f293167b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        nb5.a aVar = (nb5.a) pVar;
        nb5.a aVar2 = this.f293167b;
        this.f293167b = aVar;
        c(aVar2, aVar);
    }

    public final void c(nb5.a aVar, nb5.a aVar2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        s05.a o17;
        s05.a o18;
        em.o0 o0Var = this.f293166a;
        v05.b j17 = aVar2 != null ? aVar2.j() : null;
        if (aVar2 == null || o0Var == null || j17 == null) {
            return;
        }
        android.view.View view = o0Var.f254656a;
        android.content.Context context = view.getContext();
        int i17 = j17.f432315e;
        s05.d dVar = (s05.d) j17.getCustom(i17 + 39);
        if (dVar == null || (str = dVar.y()) == null) {
            str = "";
        }
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
        java.lang.String string = Bi != null ? Bi.field_nickname : j17.getString(i17 + 12);
        if (Bi != null) {
            str2 = Bi.field_smallHeadURL;
        } else {
            s05.d dVar2 = (s05.d) j17.getCustom(i17 + 39);
            if (dVar2 == null || (str2 = dVar2.B()) == null) {
                str2 = "";
            }
        }
        s05.d dVar3 = (s05.d) j17.getCustom(i17 + 39);
        java.lang.String sourceName = (dVar3 == null || (o18 = dVar3.o()) == null) ? null : o18.getSourceName();
        s05.d dVar4 = (s05.d) j17.getCustom(i17 + 39);
        java.lang.String j18 = (dVar4 == null || (o17 = dVar4.o()) == null) ? null : o17.j();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(sourceName) && !com.tencent.mm.sdk.platformtools.t8.K0(j18)) {
            string = sourceName;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(sourceName) && !com.tencent.mm.sdk.platformtools.t8.K0(j18)) {
            str2 = j18;
        }
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479672c9);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f272433d = 0.5f;
        kVar.f272434e = com.tencent.mm.R.drawable.bhm;
        gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
        if (o0Var.f254659d == null) {
            o0Var.f254659d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ne8);
        }
        android.widget.ImageView imageView = o0Var.f254659d;
        kotlin.jvm.internal.o.f(imageView, "getSourceIv(...)");
        if (str2 == null) {
            str2 = "";
        }
        ((h83.g) n0Var).wi(imageView, str2, kVar);
        int h18 = i65.a.h(context, com.tencent.mm.R.dimen.f479723df);
        gk0.k kVar2 = new gk0.k(h18, h18);
        if (com.tencent.mm.vfs.w6.j(aVar2.k())) {
            gk0.n0 n0Var2 = (gk0.n0) i95.n0.c(gk0.n0.class);
            com.tencent.mm.ui.MMImageView a17 = o0Var.a();
            kotlin.jvm.internal.o.f(a17, "getThumbIv(...)");
            ((h83.g) n0Var2).Ai(a17, aVar2.k(), kVar2);
        } else {
            s05.d dVar5 = (s05.d) j17.getCustom(i17 + 39);
            if (com.tencent.mm.sdk.platformtools.t8.K0(dVar5 != null ? dVar5.C() : null)) {
                v05.a aVar3 = (v05.a) j17.getCustom(i17 + 8);
                if (aVar3 != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appcoverthumbdown_");
                    java.lang.String o19 = aVar3.o();
                    java.lang.String str4 = java.lang.Boolean.valueOf(o19.length() > 0).booleanValue() ? o19 : null;
                    if (str4 == null) {
                        str4 = aVar3.A();
                    }
                    sb6.append(str4);
                    y01.a aVar4 = new y01.a(sb6.toString());
                    if (com.tencent.mm.sdk.platformtools.t8.K0(aVar3.A())) {
                        aVar4.a(aVar3.j());
                        aVar4.d(aVar3.o());
                        aVar4.b(aVar3.n());
                        aVar4.f458575d = 3;
                    } else {
                        aVar4.a(aVar3.w());
                        aVar4.d(aVar3.A());
                        aVar4.b(aVar3.z());
                        aVar4.c(aVar3.u());
                        aVar4.f458575d = 19;
                    }
                    ho.b.a(aVar4, o0Var.a(), kVar2);
                }
            } else {
                l01.b bVar = l01.d0.f314761a;
                com.tencent.mm.ui.MMImageView a18 = o0Var.a();
                s05.d dVar6 = (s05.d) j17.getCustom(i17 + 39);
                if (dVar6 == null || (str3 = dVar6.C()) == null) {
                    str3 = "";
                }
                bVar.b(a18, str3, null, null);
            }
        }
        if (o0Var.f254660e == null) {
            o0Var.f254660e = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.odf);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView = o0Var.f254660e;
        int i18 = j17.f368365d;
        java.lang.String string2 = j17.getString(i18 + 2);
        if (string2 == null) {
            string2 = "";
        }
        mMTextView.setText(string2);
        if (o0Var.f254658c == null) {
            o0Var.f254658c = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.cut);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView2 = o0Var.f254658c;
        java.lang.String string3 = j17.getString(i18 + 3);
        mMTextView2.setText(string3 != null ? string3 : "");
        if (o0Var.f254657b == null) {
            o0Var.f254657b = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.nec);
        }
        o0Var.f254657b.setText(string);
        view.setOnClickListener(new io.a(str, j17));
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293167b;
    }
}
