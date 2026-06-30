package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class ProductUI extends com.tencent.mm.ui.base.preference.MMPreference implements y60.e, com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int S = 0;
    public java.util.HashMap A;
    public com.tencent.mm.plugin.scanner.ui.m B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String F;
    public fz3.a H;
    public i11.e I;
    public boolean K;
    public java.util.List P;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f159309d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f159310e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f159311f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f159312g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f159313h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f159314i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f159315m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f159316n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f159317o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f159318p;

    /* renamed from: q, reason: collision with root package name */
    public e04.n3 f159319q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f159320r;

    /* renamed from: t, reason: collision with root package name */
    public long f159322t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f159323u;

    /* renamed from: v, reason: collision with root package name */
    public int f159324v;

    /* renamed from: w, reason: collision with root package name */
    public int f159325w;

    /* renamed from: x, reason: collision with root package name */
    public long f159326x;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.b1 f159328z;

    /* renamed from: s, reason: collision with root package name */
    public int f159321s = 0;

    /* renamed from: y, reason: collision with root package name */
    public android.app.ProgressDialog f159327y = null;
    public boolean E = false;
    public boolean G = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f159308J = false;
    public final i11.c L = new com.tencent.mm.plugin.scanner.ui.r0(this);
    public final c01.zc M = new com.tencent.mm.plugin.scanner.ui.t0(this);
    public final com.tencent.mm.plugin.scanner.ui.s N = new com.tencent.mm.plugin.scanner.ui.m0(this);
    public boolean Q = true;
    public final com.tencent.mm.sdk.event.IListener R = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.scanner.ui.ProductUI.13
        {
            this.__eventId = -1155728636;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
            int i17 = musicPlayerEvent.f54512g.f7036b;
            if (i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 7) {
                return false;
            }
            com.tencent.mm.plugin.scanner.ui.ProductUI productUI = com.tencent.mm.plugin.scanner.ui.ProductUI.this;
            if (productUI.f159309d == null) {
                return false;
            }
            productUI.e7();
            return false;
        }
    };

    public static void V6(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        e04.n3 n3Var = productUI.f159319q;
        if (n3Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_detailurl)) {
                productUI.X6(10000, productUI.f159319q.field_detailurl);
                productUI.g7(productUI.f159319q.field_detailurl);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(productUI.f159319q.field_xml) || !productUI.E) {
                return;
            }
            productUI.X6(10001, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(productUI, com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.class);
            intent.putExtra("key_Product_xml", productUI.f159319q.field_xml);
            intent.putExtra("key_title", productUI.F);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(productUI, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "toProductDetail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            productUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(productUI, "com/tencent/mm/plugin/scanner/ui/ProductUI", "toProductDetail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || this.f159319q == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.p0(this, str, bitmap));
    }

    public final void W6(java.lang.String str) {
        if (a7(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            intent.putExtra("add_scene", this.f159321s != 3 ? 49 : 47);
            ((com.tencent.mm.app.y7) com.tencent.mm.plugin.scanner.i1.a()).j(intent, getContext());
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Contact_User", str);
        intent2.putExtra("force_get_contact", true);
        intent2.putExtra("Contact_Scene", this.f159321s != 3 ? 49 : 47);
        ((com.tencent.mm.app.y7) com.tencent.mm.plugin.scanner.i1.a()).l(intent2, this);
    }

    public final void X6(int i17, java.lang.String str) {
        e04.n3 n3Var = this.f159319q;
        if (n3Var == null) {
            return;
        }
        gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.h0(n3Var.field_productid, "", i17, str, 0, 11294, 0, null));
    }

    public final void Y6() {
        if (this.f159319q != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "doUpdateActionLogic, flag=:" + this.f159319q.field_getaction);
            e04.n3 n3Var = this.f159319q;
            int i17 = n3Var.field_getaction;
            if ((i17 & 2) <= 0) {
                if ((i17 & 1) > 0) {
                    gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.c0(this.C, com.tencent.mm.plugin.scanner.model.n0.a(n3Var.f246032a), this.f159324v, this.D, 0.0d, 0.0d));
                    return;
                }
                return;
            }
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h e17 = i11.h.e();
            this.I = e17;
            if (e17 != null) {
                e17.l(this.L, true, false, false);
                com.tencent.mm.plugin.report.service.b1.f(22, 10);
            }
        }
    }

    public final void Z6(java.lang.String str, java.lang.String str2, boolean z17) {
        this.C = str;
        this.D = str2;
        com.tencent.mm.plugin.scanner.model.d0 d0Var = new com.tencent.mm.plugin.scanner.model.d0(str, this.f159324v, str2);
        gm0.j1.d().g(d0Var);
        if (z17) {
            return;
        }
        this.f159327y = db5.e1.R(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.i_b), true, true, new com.tencent.mm.plugin.scanner.ui.q0(this, d0Var));
    }

    public final boolean a7(java.lang.String str) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        return n17 != null && ((int) n17.E2) > 0 && n17.r2();
    }

    public final void b7(e04.n3 n3Var) {
        java.util.LinkedList linkedList;
        com.tencent.mm.ui.base.preference.r rVar;
        java.util.LinkedList linkedList2;
        boolean z17;
        int i17;
        if (n3Var == null || (linkedList = n3Var.f246032a) == null || linkedList.size() == 0 || (rVar = this.f159309d) == null) {
            return;
        }
        ((com.tencent.mm.ui.base.preference.h0) rVar).t();
        for (int i18 = 0; i18 < n3Var.f246032a.size(); i18++) {
            com.tencent.mm.plugin.scanner.model.b bVar = (com.tencent.mm.plugin.scanner.model.b) n3Var.f246032a.get(i18);
            if (bVar != null && (linkedList2 = bVar.f158816f) != null && linkedList2.size() != 0 && bVar.f158813c != 1 && bVar.f158815e) {
                if (i18 != 0) {
                    com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
                    preference.G = com.tencent.mm.R.layout.f489361ca2;
                    ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(preference, -1);
                }
                android.util.AttributeSet attributeSet = null;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f158812b) && ((i17 = bVar.f158811a) == 6 || i17 == 7)) {
                    com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference categoryWithTitlePreference = new com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference(this, null);
                    categoryWithTitlePreference.L(bVar.f158812b);
                    ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(categoryWithTitlePreference, -1);
                }
                if (bVar.f158811a == 6) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i19 = 0; i19 < bVar.f158816f.size(); i19++) {
                        com.tencent.mm.plugin.scanner.model.a aVar = (com.tencent.mm.plugin.scanner.model.a) bVar.f158816f.get(i19);
                        if (aVar.f158781a == 10) {
                            arrayList.add(aVar);
                        }
                    }
                    if (arrayList.size() > 0) {
                        com.tencent.mm.plugin.scanner.ui.g0 g0Var = new com.tencent.mm.plugin.scanner.ui.g0(this);
                        g0Var.C((i18 * 100) + "");
                        g0Var.N = arrayList;
                        ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(g0Var, -1);
                    }
                } else {
                    int i27 = 0;
                    while (i27 < bVar.f158816f.size()) {
                        java.lang.String str = "" + ((i18 * 100) + i27);
                        com.tencent.mm.plugin.scanner.model.a aVar2 = (com.tencent.mm.plugin.scanner.model.a) bVar.f158816f.get(i27);
                        int i28 = aVar2.f158781a;
                        if (i28 == 11) {
                            this.E = true;
                            this.F = aVar2.f158782b;
                        }
                        int i29 = aVar2.f158788h;
                        if (i29 != 2) {
                            if (i29 != 1) {
                                if (i28 == 5) {
                                    com.tencent.mm.plugin.scanner.ui.MusicPreference musicPreference = new com.tencent.mm.plugin.scanner.ui.MusicPreference(this, attributeSet);
                                    musicPreference.C(str);
                                    musicPreference.L(aVar2.f158782b);
                                    java.lang.String str2 = aVar2.f158791k;
                                    musicPreference.Q = str2;
                                    musicPreference.R = aVar2.f158792l;
                                    musicPreference.S = aVar2.f158793m;
                                    if (c7(java.lang.String.format("%s_cd_%s", str2, str))) {
                                        musicPreference.M(true);
                                    } else {
                                        musicPreference.M(false);
                                    }
                                    musicPreference.T = this.N;
                                    ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(musicPreference, -1);
                                    this.R.alive();
                                    if (this.P == null) {
                                        this.P = new java.util.ArrayList();
                                    }
                                    if (this.Q) {
                                        this.P.add(musicPreference);
                                    }
                                } else if (i28 == 6) {
                                    com.tencent.mm.plugin.scanner.ui.n nVar = new com.tencent.mm.plugin.scanner.ui.n(this);
                                    nVar.C(str);
                                    nVar.T = aVar2.f158782b;
                                    nVar.H(aVar2.f158783c);
                                    ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(nVar, -1);
                                    nVar.W = this.B;
                                } else if (i28 == 12) {
                                    com.tencent.mm.plugin.scanner.ui.q qVar = new com.tencent.mm.plugin.scanner.ui.q(this);
                                    qVar.C(str);
                                    qVar.N = aVar2.f158790j;
                                    com.tencent.mm.ui.base.preference.r rVar2 = this.f159309d;
                                    qVar.Q = rVar2;
                                    ((com.tencent.mm.ui.base.preference.h0) rVar2).d(qVar, -1);
                                } else if (i28 == 2) {
                                    java.lang.String str3 = a7(aVar2.f158785e) ? aVar2.f158799s : aVar2.f158798r;
                                    com.tencent.mm.plugin.scanner.ui.b bVar2 = new com.tencent.mm.plugin.scanner.ui.b(this);
                                    bVar2.C(str);
                                    bVar2.L(str3);
                                    bVar2.H(aVar2.f158783c);
                                    bVar2.Q = aVar2.f158787g;
                                    ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(bVar2, -1);
                                } else if (i28 == 22) {
                                    com.tencent.mm.plugin.scanner.ui.h hVar = new com.tencent.mm.plugin.scanner.ui.h(this);
                                    hVar.C(str);
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f158786f)) {
                                        hVar.S = aVar2.f158786f + ":";
                                    }
                                    hVar.R = aVar2.f158801u;
                                    hVar.Q = aVar2.f158790j;
                                    ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(hVar, -1);
                                } else {
                                    com.tencent.mm.plugin.scanner.ui.b bVar3 = new com.tencent.mm.plugin.scanner.ui.b(this);
                                    bVar3.C(str);
                                    bVar3.L(aVar2.f158782b);
                                    bVar3.H(aVar2.f158783c);
                                    bVar3.Q = aVar2.f158787g;
                                    bVar3.P = aVar2.f158803w;
                                    ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(bVar3, -1);
                                }
                                if (i27 < bVar.f158816f.size() - 1 && aVar2.f158781a != 12) {
                                    int i37 = i27 + 1;
                                    if (((com.tencent.mm.plugin.scanner.model.a) bVar.f158816f.get(i37)).f158781a != 12 && ((com.tencent.mm.plugin.scanner.model.a) bVar.f158816f.get(i37)).f158788h != 1) {
                                        java.util.LinkedList linkedList3 = bVar.f158816f;
                                        if (linkedList3 != null) {
                                            while (i37 < linkedList3.size()) {
                                                if (((com.tencent.mm.plugin.scanner.model.a) linkedList3.get(i37)).f158788h != 2) {
                                                    z17 = true;
                                                    break;
                                                }
                                                i37++;
                                            }
                                        }
                                        z17 = false;
                                        if (z17) {
                                            ((com.tencent.mm.ui.base.preference.h0) this.f159309d).d(new com.tencent.mm.plugin.scanner.ui.t(this), -1);
                                        }
                                    }
                                }
                            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f158789i)) {
                                com.tencent.mm.plugin.scanner.ui.c cVar = new com.tencent.mm.plugin.scanner.ui.c(this);
                                cVar.C(str);
                                cVar.N = aVar2.f158789i;
                                com.tencent.mm.ui.base.preference.r rVar3 = this.f159309d;
                                cVar.Q = rVar3;
                                ((com.tencent.mm.ui.base.preference.h0) rVar3).d(cVar, -1);
                            }
                        }
                        i27++;
                        attributeSet = null;
                    }
                }
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f159309d).notifyDataSetChanged();
        if (this.P != null) {
            this.Q = false;
        }
    }

    public final boolean c7(java.lang.String str) {
        b21.r b17 = b21.m.b();
        return b17 != null && b17.f17345d == 5 && str.equals(b17.f17346e) && b21.m.c();
    }

    public final void d7(e04.n3 n3Var, boolean z17) {
        int i17;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "refreshViewByProduct(), pd == null");
            finish();
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_thumburl)) {
            this.f159328z = new com.tencent.mm.plugin.scanner.ui.b1(n3Var);
        }
        this.f159325w = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7w);
        e04.n3 n3Var2 = this.f159319q;
        if (n3Var2 != null && ((i17 = n3Var2.field_type) == 1 || i17 == 2)) {
            this.f159325w = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7x);
            android.view.ViewGroup.LayoutParams layoutParams = this.f159311f.getLayoutParams();
            layoutParams.height = this.f159325w;
            this.f159311f.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f159312g.getLayoutParams();
            layoutParams2.height = this.f159325w;
            this.f159318p.setLayoutParams(layoutParams2);
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.l6x);
            android.view.ViewGroup.LayoutParams layoutParams3 = relativeLayout.getLayoutParams();
            layoutParams3.height = this.f159325w;
            relativeLayout.setLayoutParams(layoutParams3);
            android.view.ViewGroup.LayoutParams layoutParams4 = this.f159318p.getLayoutParams();
            layoutParams4.height = this.f159325w;
            this.f159318p.setLayoutParams(layoutParams4);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_introtitle) || com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_introlink)) {
            this.f159317o.setVisibility(8);
        } else {
            this.f159317o.setText(n3Var.field_introtitle);
            this.f159317o.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.z0(this, n3Var));
            this.f159317o.setVisibility(0);
        }
        this.f159321s = this.f159319q.field_functionType;
        int i18 = n3Var.field_xmlType;
        if (i18 == 3) {
            this.f159313h.setText(n3Var.field_title);
            if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_certification)) {
                this.f159314i.setText(n3Var.field_source);
                this.f159315m.setVisibility(8);
                this.f159316n.setOnClickListener(null);
                this.f159316n.setBackgroundDrawable(null);
                this.f159316n.setFocusable(false);
            } else {
                this.f159314i.setText(n3Var.field_certification);
                this.f159315m.setVisibility(0);
            }
            int i19 = n3Var.field_type;
            if (i19 == 1 || i19 == 2) {
                this.f159310e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.l6z);
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.l6z);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f486439l72);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f159310e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486439l72);
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f486439l72);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.l6z);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_playurl)) {
                android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.l6v);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.a1(this, n3Var));
            }
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.scanner.ui.k0(this));
        } else if (i18 == 4) {
            this.f159310e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486439l72);
            android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f486439l72);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.l6z);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/scanner/ui/ProductUI", "refreshViewByProduct", "(Lcom/tencent/mm/plugin/scanner/util/ScanXmlHelper$XmlProduct;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f159310e.setImageResource(com.tencent.mm.R.raw.scan_without_commodity_icon);
            this.f159310e.setBackgroundResource(com.tencent.mm.R.raw.scan_without_commodity_icon);
            this.f159313h.setText(com.tencent.mm.R.string.i_a);
            this.f159314i.setText((java.lang.CharSequence) null);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.l0(this, n3Var));
    }

    public final void e7() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        e04.n3 n3Var = this.f159319q;
        if (n3Var == null || (linkedList = n3Var.f246032a) == null || linkedList.size() == 0 || this.f159309d == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f159319q.f246032a.size(); i17++) {
            com.tencent.mm.plugin.scanner.model.b bVar = (com.tencent.mm.plugin.scanner.model.b) this.f159319q.f246032a.get(i17);
            if (bVar != null && (linkedList2 = bVar.f158816f) != null && linkedList2.size() != 0) {
                for (int i18 = 0; i18 < bVar.f158816f.size(); i18++) {
                    com.tencent.mm.plugin.scanner.model.a aVar = (com.tencent.mm.plugin.scanner.model.a) bVar.f158816f.get(i18);
                    if (aVar.f158781a == 5) {
                        java.lang.String str = "" + ((i17 * 100) + i18);
                        com.tencent.mm.plugin.scanner.ui.MusicPreference musicPreference = (com.tencent.mm.plugin.scanner.ui.MusicPreference) ((com.tencent.mm.ui.base.preference.h0) this.f159309d).h(str);
                        if (musicPreference != null) {
                            if (c7(java.lang.String.format("%s_cd_%s", aVar.f158791k, str))) {
                                musicPreference.M(true);
                            } else {
                                musicPreference.M(false);
                            }
                        }
                    }
                }
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f159309d).notifyDataSetChanged();
    }

    public final void f7(android.view.View view, float f17) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(f17, f17);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    public final void g7(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("jsapi_args_appid", com.tencent.mm.plugin.scanner.model.k0.a(this.f159321s));
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("pay_channel", 3);
        int i17 = this.f159321s;
        intent.putExtra("geta8key_scene", i17 == 4 ? 11 : i17 == 3 ? 12 : 0);
        j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.caa;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489363ca4;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494910bc;
    }

    public final void h7() {
        this.f159322t = getIntent().getLongExtra("key_ProductUI_chatting_msgId", 0L);
        this.f159323u = getIntent().getStringExtra("key_ProductUI_chatting_talker");
        if (this.f159322t <= 0 || !gm0.j1.a()) {
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f159323u, this.f159322t);
        if (Li.getMsgId() > 0) {
            Li.i1(this.f159328z.k());
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(this.f159322t, Li, true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iab);
        this.f159309d = getPreferenceScreen();
        java.lang.String str = null;
        if (getSupportActionBar() != null) {
            getSupportActionBar().w(null);
            getSupportActionBar().j();
        }
        setBackBtn(new com.tencent.mm.plugin.scanner.ui.u0(this));
        this.f159313h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l7s);
        this.f159311f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.l6w);
        this.f159312g = findViewById(com.tencent.mm.R.id.f486438l71);
        this.f159315m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.l6k);
        this.f159320r = findViewById(com.tencent.mm.R.id.l6d);
        this.f159318p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486437l70);
        this.f159316n = findViewById(com.tencent.mm.R.id.l6j);
        f7(this.f159320r, 0.0f);
        if (i65.a.D(getContext())) {
            this.f159313h.setTextSize(0, getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479636bb) * i65.a.z(getContext()));
        } else {
            this.f159313h.setTextSize(0, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479636bb));
        }
        this.f159314i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l6i);
        this.f159317o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m_t);
        this.A = new java.util.HashMap();
        this.B = new com.tencent.mm.plugin.scanner.ui.v0(this);
        fz3.a aVar = new fz3.a();
        this.H = aVar;
        aVar.field_ScanTime = java.lang.System.currentTimeMillis();
        fz3.a aVar2 = this.H;
        int i17 = this.f159324v;
        aVar2.field_scene = i17;
        if (i17 == 5) {
            this.G = true;
            java.lang.String stringExtra = getIntent().getStringExtra("key_Qrcode_Url");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                try {
                    str = android.net.Uri.parse(stringExtra).getQueryParameter("p");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", stringExtra + ";" + e17.getLocalizedMessage());
                }
            }
            fz3.a aVar3 = this.H;
            aVar3.field_qrcodeUrl = stringExtra;
            aVar3.field_productId = str;
            Z6(str, stringExtra, false);
        } else if (i17 == 4) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_product_id");
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_Qrcode_Url");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "jsapi jump finish productId null");
                finish();
                return;
            }
            Z6(stringExtra2, stringExtra3, false);
        } else {
            getIntent().getBooleanExtra("key_is_from_barcode", false);
            this.G = getIntent().getBooleanExtra("key_need_add_to_history", false);
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_Product_xml");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                java.lang.String stringExtra5 = getIntent().getStringExtra("key_Product_ID");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "normal finish productId null");
                    finish();
                    return;
                }
                Z6(stringExtra5, null, false);
            } else {
                int intExtra = getIntent().getIntExtra("key_Product_funcType", 0);
                e04.n3 b17 = com.tencent.mm.plugin.scanner.model.k0.b(stringExtra4, intExtra);
                this.f159319q = b17;
                if (b17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "initView(), product == null");
                    finish();
                    return;
                }
                java.lang.String str2 = b17.field_productid;
                this.C = str2;
                this.D = b17.field_extinfo;
                if (!this.G || android.text.TextUtils.isEmpty(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "shouldAddToHistory:" + this.G + " mProductId:" + this.C);
                } else {
                    fz3.a aVar4 = this.H;
                    aVar4.field_xmlContent = stringExtra4;
                    aVar4.field_qrcodeUrl = this.D;
                    aVar4.field_productId = this.C;
                    aVar4.field_funcType = intExtra;
                    com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "mHistoryItem ScanHistoryUtil.shouldShowHistoryList() is false!");
                }
                d7(this.f159319q, getIntent().getBooleanExtra("key_ProductUI_addToDB", true));
                if (intExtra != 0 || com.tencent.mm.sdk.platformtools.t8.K0(this.f159319q.field_productid)) {
                    Y6();
                } else {
                    e04.n3 n3Var = this.f159319q;
                    Z6(n3Var.field_productid, n3Var.field_extinfo, true);
                }
            }
        }
        findViewById(com.tencent.mm.R.id.f486440l73).setOnClickListener(new com.tencent.mm.plugin.scanner.ui.w0(this));
        findViewById(com.tencent.mm.R.id.l6r).setOnClickListener(new com.tencent.mm.plugin.scanner.ui.x0(this));
        this.f159316n.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.y0(this));
        new com.tencent.mm.plugin.scanner.ui.d1(this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f159326x = com.tencent.mm.sdk.platformtools.t8.i1();
        this.f159324v = getIntent().getIntExtra("key_ProductUI_getProductInfoScene", 0);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.a(this);
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.b("scanproductinfo", this.M, true);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.e(this);
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).getClass();
        c01.ad.f37061a.h("scanproductinfo", this.M, true);
        this.R.dead();
        i11.e eVar = this.I;
        if (eVar != null) {
            ((i11.h) eVar).m(this.L);
        }
        X6(10100, (com.tencent.mm.sdk.platformtools.t8.i1() - this.f159326x) + "");
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        gm0.j1.d().q(1063, this);
        gm0.j1.d().q(1068, this);
        super.onPause();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "onPreferenceTreeClick item: [%s]", preference.f197780q);
        e04.n3 n3Var = this.f159319q;
        if (n3Var == null || n3Var.f246032a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "product == null || product.actionlist == null");
            return false;
        }
        try {
            int intValue = java.lang.Integer.valueOf(preference.f197780q).intValue();
            int i17 = intValue / 100;
            int i18 = intValue % 100;
            if (i17 >= 0 && i17 < this.f159319q.f246032a.size()) {
                com.tencent.mm.plugin.scanner.model.b bVar = (com.tencent.mm.plugin.scanner.model.b) this.f159319q.f246032a.get(i17);
                if (bVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "actionList == null");
                    return false;
                }
                if (i18 >= 0 && i18 < bVar.f158816f.size()) {
                    com.tencent.mm.plugin.scanner.model.a aVar = (com.tencent.mm.plugin.scanner.model.a) bVar.f158816f.get(i18);
                    if (aVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "action == null");
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "action.type = [%s]", java.lang.Integer.valueOf(aVar.f158781a));
                    android.content.Intent intent = new android.content.Intent();
                    int i19 = aVar.f158781a;
                    if (i19 != 21) {
                        if (i19 != 22) {
                            int i27 = 12;
                            str = null;
                            switch (i19) {
                                case 1:
                                case 3:
                                    break;
                                case 2:
                                case 4:
                                    str = aVar.f158785e;
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                        W6(aVar.f158785e);
                                        break;
                                    }
                                    break;
                                case 5:
                                    str = aVar.f158793m;
                                    intent.putExtra("rawUrl", str);
                                    int i28 = this.f159321s;
                                    if (i28 == 4) {
                                        i27 = 11;
                                    } else if (i28 != 3) {
                                        i27 = 0;
                                    }
                                    intent.putExtra("geta8key_scene", i27);
                                    ((com.tencent.mm.app.y7) com.tencent.mm.plugin.scanner.i1.a()).D(intent, this);
                                    b21.m.j();
                                    e7();
                                    break;
                                case 6:
                                case 7:
                                case 10:
                                    break;
                                case 8:
                                    str3 = aVar.f158795o;
                                    intent.putExtra("key_card_id", aVar.f158797q);
                                    intent.putExtra("key_card_ext", aVar.f158796p);
                                    intent.putExtra("key_from_scene", 9);
                                    j45.l.j(this, "card", ".ui.CardDetailUI", intent, null);
                                    str2 = str3;
                                    break;
                                case 9:
                                    str3 = aVar.f158795o;
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                                        intent.putExtra("key_product_id", aVar.f158795o);
                                        intent.putExtra("key_product_scene", 12);
                                        j45.l.j(this, "product", ".ui.MallProductUI", intent, null);
                                    }
                                    str2 = str3;
                                    break;
                                case 11:
                                    intent.setClass(this, com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.class);
                                    intent.putExtra("key_Product_xml", this.f159319q.field_xml);
                                    intent.putExtra("key_title", aVar.f158782b);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(intent);
                                    java.util.Collections.reverse(arrayList);
                                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    startActivity((android.content.Intent) arrayList.get(0));
                                    yj0.a.f(this, "com/tencent/mm/plugin/scanner/ui/ProductUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    break;
                                case 12:
                                    str = aVar.f158784d;
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                        g7(aVar.f158784d);
                                        break;
                                    }
                                    break;
                                default:
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f158784d)) {
                                        g7(aVar.f158784d);
                                        break;
                                    }
                                    break;
                            }
                            gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.h0(this.f159319q.field_productid, aVar.f158794n, aVar.f158781a, str2, bVar.f158816f.size(), 11294, aVar.f158788h, null));
                            return true;
                        }
                        str = aVar.f158784d;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            g7(aVar.f158784d);
                        }
                    } else {
                        str = aVar.f158802v;
                        intent.setClass(this, com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI.class);
                        intent.putExtra("key_Product_xml", this.f159319q.field_xml);
                        intent.putExtra("referkey", aVar.f158802v);
                        intent.putExtra("key_Product_funcType", this.f159321s);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/scanner/ui/ProductUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    str2 = str;
                    gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.h0(this.f159319q.field_productid, aVar.f158794n, aVar.f158781a, str2, bVar.f158816f.size(), 11294, aVar.f158788h, null));
                    return true;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "index out of bounds, jj=[%s], actions Size=[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bVar.f158816f.size()));
                return false;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "index out of bounds, ii=[%s], list Size=[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f159319q.f246032a.size()));
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "onPreferenceTreeClick, [%s]", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.scanner.ProductUI", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(1063, this);
        gm0.j1.d().a(1068, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.protobuf.f fVar;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "scene == null");
            return;
        }
        r45.uk ukVar = null;
        if (m1Var.getType() != 1063) {
            if (m1Var.getType() == 1068 && i17 == 0 && i18 == 0) {
                java.util.LinkedList linkedList = ((r45.sk) ((com.tencent.mm.plugin.scanner.model.c0) m1Var).f158835e.f70711b.f70700a).f385805e;
                e04.n3 n3Var = this.f159319q;
                if (n3Var != null) {
                    java.util.LinkedList linkedList2 = n3Var.f246032a;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    for (int i19 = 0; i19 < linkedList.size(); i19++) {
                        java.lang.String str4 = (java.lang.String) linkedList.get(i19);
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mm.plugin.scanner.model.a a17 = com.tencent.mm.plugin.scanner.model.b.a(com.tencent.mm.sdk.platformtools.aa.d(str4, "action", null), ".action");
                        if (a17 != null && a17.f158788h != 2) {
                            hashMap.put(a17.f158800t, a17);
                        }
                    }
                    if (com.tencent.mm.plugin.scanner.model.n0.b(linkedList2, hashMap)) {
                        b7(this.f159319q);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "onSceneEnd() errType = [%s], errCode = [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.scanner.model.d0) m1Var).f158839e;
        if (oVar != null && (fVar = oVar.f70711b.f70700a) != null) {
            ukVar = (r45.uk) fVar;
        }
        if (ukVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "onSceneEnd productInfo == null");
            return;
        }
        java.lang.String str5 = ukVar.f387425e;
        if (str5 != null) {
            e04.n3 b17 = com.tencent.mm.plugin.scanner.model.k0.b(str5, this.f159321s);
            e04.n3 n3Var2 = this.f159319q;
            if (n3Var2 != null && (str2 = n3Var2.field_xml) != null && b17 != null && (str3 = b17.field_xml) != null && !str2.equals(str3)) {
                this.f159319q = b17;
                d7(b17, true);
            } else if (b17 != null && b17.field_xml != null) {
                this.f159319q = b17;
                d7(b17, true);
            }
            android.app.ProgressDialog progressDialog = this.f159327y;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f159327y.dismiss();
            }
            Y6();
            if (this.G && !android.text.TextUtils.isEmpty(this.C)) {
                fz3.a aVar = this.H;
                aVar.field_xmlContent = ukVar.f387425e;
                aVar.field_funcType = this.f159321s;
                com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "mHistoryItem ScanHistoryUtil.shouldShowHistoryList() is false!");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "shouldAddToHistory:" + this.G + " mProductId:" + this.C + "  hasAddToHistory:false");
        }
    }
}
