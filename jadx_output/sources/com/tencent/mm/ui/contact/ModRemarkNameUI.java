package com.tencent.mm.ui.contact;

@java.lang.Deprecated
/* loaded from: classes11.dex */
public class ModRemarkNameUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f206466y1 = 0;
    public android.widget.ImageView A;
    public android.widget.ImageView B;
    public android.widget.TextView C;
    public java.lang.String D;
    public android.view.View K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.LinearLayout N;
    public java.lang.String P;
    public com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView R;
    public com.tencent.mm.ui.base.FlowLayout S;
    public boolean X;
    public long Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f206468d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f206469e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f206470f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.ya f206471g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f206472h;

    /* renamed from: i, reason: collision with root package name */
    public int f206473i;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f206477o;

    /* renamed from: p0, reason: collision with root package name */
    public int f206479p0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f206481q;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f206486v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f206487w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f206488x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f206491y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f206493z;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f206475m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f206476n = "";

    /* renamed from: p, reason: collision with root package name */
    public int f206478p = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f206482r = false;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f206483s = null;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f206484t = "";

    /* renamed from: u, reason: collision with root package name */
    public boolean f206485u = false;
    public int E = 0;
    public final java.util.ArrayList F = new java.util.ArrayList();
    public final java.util.ArrayList G = new java.util.ArrayList();
    public final java.util.ArrayList H = new java.util.ArrayList();
    public int I = 9;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.e6 f206467J = new com.tencent.mm.ui.contact.e6(this, null);
    public int Q = 0;
    public java.util.List T = new java.util.ArrayList();
    public final java.util.List U = new java.util.ArrayList();
    public final java.util.List V = new java.util.ArrayList();
    public boolean W = false;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.HashSet f206489x0 = new java.util.HashSet();

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.HashSet f206492y0 = new java.util.HashSet();

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.HashSet f206474l1 = new java.util.HashSet();

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.HashSet f206480p1 = new java.util.HashSet();

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.HashSet f206490x1 = new java.util.HashSet();

    public static void T6(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI, int i17) {
        modRemarkNameUI.E--;
        java.util.ArrayList arrayList = modRemarkNameUI.F;
        arrayList.remove(i17);
        if (i17 == 0) {
            modRemarkNameUI.f206493z.setVisibility(8);
        } else if (i17 == 1) {
            modRemarkNameUI.A.setVisibility(8);
        } else if (i17 == 2) {
            modRemarkNameUI.B.setVisibility(8);
        }
        modRemarkNameUI.f206491y.setVisibility(0);
        modRemarkNameUI.C.setVisibility(8);
        modRemarkNameUI.f7(arrayList, 0);
        modRemarkNameUI.X6();
    }

    public static void U6(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI) {
        int i17 = modRemarkNameUI.f206473i;
        if (i17 != 0) {
            if (i17 == 3) {
                java.lang.String trim = modRemarkNameUI.f206468d.getText().toString().trim();
                android.content.Intent intent = new android.content.Intent();
                if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                    trim = modRemarkNameUI.getResources().getString(com.tencent.mm.R.string.jfq);
                }
                intent.putExtra("k_sns_tag_name", trim);
                modRemarkNameUI.setResult(-1, intent);
                modRemarkNameUI.finish();
                return;
            }
            if (i17 != 4) {
                return;
            }
            java.lang.String trim2 = modRemarkNameUI.f206468d.getText().toString().trim();
            if (trim2.length() > 32) {
                db5.e1.y(modRemarkNameUI.getContext(), modRemarkNameUI.getString(com.tencent.mm.R.string.f492881i41), modRemarkNameUI.getString(com.tencent.mm.R.string.i6g), modRemarkNameUI.getString(com.tencent.mm.R.string.f490347sg), null);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_Nick", trim2);
            modRemarkNameUI.setResult(-1, intent2);
            modRemarkNameUI.finish();
            new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent().e();
            return;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MiroMsg.ModRemarkName", "!MMCore.hasSetUin()");
        } else if (modRemarkNameUI.f206468d == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.ModRemarkName", "remarkName == null in dealModNickName(), return");
        } else {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(modRemarkNameUI.f206470f.d1(), true);
            if (n17 != null && !android.text.TextUtils.isEmpty(n17.d1())) {
                modRemarkNameUI.f206470f = n17;
            }
            java.lang.String trim3 = modRemarkNameUI.f206468d.getText().toString().trim();
            com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "Set New RemarkName : " + trim3 + ", Report kvStat, addContactScene = " + modRemarkNameUI.I);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10448, java.lang.Integer.valueOf(modRemarkNameUI.I));
            if (modRemarkNameUI.f206485u) {
                modRemarkNameUI.f206470f.n1(trim3);
                modRemarkNameUI.f206470f.d3(modRemarkNameUI.f206483s.getText().toString());
                boolean d76 = modRemarkNameUI.d7();
                java.util.ArrayList arrayList = modRemarkNameUI.H;
                if (d76) {
                    java.util.ArrayList arrayList2 = modRemarkNameUI.F;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    if (size > 0) {
                        for (int i18 = 0; i18 < size; i18++) {
                            java.lang.String c17 = i21.q.h().c(modRemarkNameUI.f206472h, i18);
                            if (!c17.equals(arrayList2.get(i18))) {
                                com.tencent.mm.vfs.w6.c((java.lang.String) arrayList2.get(i18), c17);
                                com.tencent.mm.vfs.w6.h((java.lang.String) arrayList2.get(i18));
                            }
                            arrayList.add(c17);
                        }
                    }
                    modRemarkNameUI.Z6();
                } else {
                    arrayList.clear();
                    arrayList.addAll(modRemarkNameUI.G);
                }
                modRemarkNameUI.f206470f.e3(com.tencent.mm.contact.b.b(arrayList));
                com.tencent.mm.storage.ya yaVar = new com.tencent.mm.storage.ya(modRemarkNameUI.f206470f.d1(), trim3);
                yaVar.field_conDescription = modRemarkNameUI.f206483s.getText().toString().trim();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(modRemarkNameUI.P)) {
                    yaVar.field_contactLabels = modRemarkNameUI.P;
                }
                ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(yaVar);
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).l0(modRemarkNameUI.f206470f);
            }
            modRemarkNameUI.finish();
        }
        com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "cpan[saveStranger]");
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(modRemarkNameUI.f206472h);
        java.util.List list = modRemarkNameUI.V;
        if (list != null) {
            java.lang.String h17 = ((b93.b) c93.a.a()).h(list);
            if (com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                z07.field_contactLabels = "";
                ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z07);
            } else {
                z07.field_contactLabels = h17;
                if (com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                    z07.field_encryptUsername = modRemarkNameUI.f206472h;
                }
                ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z07);
            }
        }
        pf5.z zVar = pf5.z.f353948a;
        if (((j93.n) zVar.a(modRemarkNameUI).a(j93.n.class)).R6()) {
            ((j93.n) zVar.a(modRemarkNameUI).a(j93.n.class)).T6();
        }
        modRemarkNameUI.a7(1L);
    }

    public static void V6(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI, int i17) {
        modRemarkNameUI.getClass();
        android.content.Intent intent = new android.content.Intent(modRemarkNameUI, (java.lang.Class<?>) com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.class);
        intent.putExtra("Contact_User", modRemarkNameUI.f206472h);
        intent.putExtra("remark_image_path", modRemarkNameUI.F);
        intent.putExtra("selected_item", i17);
        intent.putExtra("view_only", false);
        modRemarkNameUI.startActivityForResult(intent, 400);
    }

    public final boolean W6(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        java.util.Collections.sort(arrayList);
        java.util.Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    public final void X6() {
        this.W = this.R.e();
        if (!c7() && !e7() && !d7() && !this.W) {
            enableOptionMenu(false);
        } else if (this.f206468d.c() || this.f206483s.c()) {
            enableOptionMenu(false);
        } else {
            enableOptionMenu(true);
        }
        if (((j93.n) component(j93.n.class)).R6()) {
            enableOptionMenu(true);
        }
    }

    public final java.lang.String Y6(java.lang.String str, int i17) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        java.lang.String str2 = i21.q.h().c(this.f206472h, i17) + ".tmp";
        if (!com.tencent.mm.sdk.platformtools.x.v(str, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            com.tencent.mars.xlog.Log.e("MiroMsg.ModRemarkName", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.tencent.mm.sdk.platformtools.x.y0(str2, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            return str2;
        }
        com.tencent.mars.xlog.Log.e("MiroMsg.ModRemarkName", "rotate big pic fail");
        return null;
    }

    public final void Z6() {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17;
        java.lang.String a17 = i21.q.h().a(this.f206472h);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a17);
        if (r6Var.m() && r6Var.y() && (s17 = com.tencent.mm.vfs.w6.s(a17, true)) != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null) {
                    if (!this.H.contains(a17 + x1Var.f213232b)) {
                        x1Var.a();
                    }
                }
            }
        }
    }

    public void a7(long j17) {
        if (j17 == 1) {
            ((gc0.p2) pf5.z.f353948a.a(this).a(gc0.p2.class)).f270248m.b(this.f206468d.getText().toString(), this.R.getPhoneNumberList(), this.F, this.f206468d);
            ((hr3.w1) component(hr3.w1.class)).O6();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.contact.u5(this, j17));
    }

    public final void b7() {
        boolean e76 = e7();
        boolean c76 = c7();
        if (e76 || c76 || d7()) {
            db5.e1.A(this, getString(com.tencent.mm.R.string.bgj), null, getString(com.tencent.mm.R.string.bgl), getString(com.tencent.mm.R.string.bgk), new com.tencent.mm.ui.contact.s5(this), new com.tencent.mm.ui.contact.t5(this));
        } else {
            finish();
            a7(2L);
        }
    }

    public final boolean c7() {
        java.lang.String trim = this.f206483s.getText().toString().trim();
        java.lang.String str = this.f206484t;
        return (str == null || !str.equals(trim)) && !(com.tencent.mm.sdk.platformtools.t8.K0(this.f206484t) && com.tencent.mm.sdk.platformtools.t8.K0(trim));
    }

    public final boolean d7() {
        java.util.ArrayList arrayList = this.G;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.F;
        return (size == arrayList2.size() && arrayList.containsAll(arrayList2)) ? false : true;
    }

    public final boolean e7() {
        java.lang.String trim = this.f206468d.getText().toString().trim();
        if (trim == null) {
            trim = "";
        }
        int i17 = this.f206473i;
        if (i17 == 0) {
            int i18 = this.f206478p;
            if (i18 == 1) {
                return !com.tencent.mm.sdk.platformtools.t8.K0(trim) || this.f206482r;
            }
            if (i18 == 2) {
                return ((com.tencent.mm.sdk.platformtools.t8.K0(trim) && com.tencent.mm.sdk.platformtools.t8.K0(this.f206477o)) || trim.equals(this.f206477o)) ? false : true;
            }
        }
        if (i17 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f206477o)) {
            return !this.f206477o.equals(trim);
        }
        java.lang.String str = this.f206476n;
        if (str == null || !str.equals(trim)) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(this.f206476n) && com.tencent.mm.sdk.platformtools.t8.K0(trim)) ? false : true;
        }
        return false;
    }

    public final void f7(java.util.ArrayList arrayList, int i17) {
        android.graphics.Bitmap a17;
        this.C.setVisibility(8);
        this.f206491y.setVisibility(0);
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            float g17 = i65.a.g(this);
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a18.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
            if ((!m17.a() ? false : m17.f213266a.F(m17.f213267b)) && (a17 = com.tencent.mm.sdk.platformtools.j.a(str, g17)) != null) {
                if (i17 == 0) {
                    this.E = 1;
                    this.f206493z.setVisibility(0);
                    this.f206493z.setImageBitmap(a17);
                    this.A.setVisibility(8);
                    this.B.setVisibility(8);
                } else if (i17 == 1) {
                    this.E = 2;
                    this.A.setVisibility(0);
                    this.A.setImageBitmap(a17);
                    this.B.setVisibility(8);
                } else if (i17 == 2) {
                    this.E = 3;
                    this.B.setVisibility(0);
                    this.B.setImageBitmap(a17);
                    this.f206491y.setVisibility(8);
                    this.C.setVisibility(0);
                }
                i17++;
            }
        }
    }

    public final void g7() {
        java.util.List list;
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(this.f206472h);
        this.f206471g = z07;
        if (z07 != null) {
            this.P = z07.field_contactLabels;
            list = ((b93.b) c93.a.a()).f(this.P);
        } else {
            list = null;
        }
        if (this.T == null) {
            this.T = new java.util.ArrayList();
        }
        java.util.List list2 = this.U;
        ((java.util.ArrayList) list2).clear();
        this.T.clear();
        java.util.List list3 = this.V;
        ((java.util.ArrayList) list3).clear();
        if (list != null) {
            this.T.addAll(list);
            ((java.util.ArrayList) list2).addAll(list);
            ((java.util.ArrayList) list3).addAll(list);
        } else {
            new java.util.ArrayList();
        }
        java.util.List c17 = ((b93.b) c93.a.a()).c();
        if (c17 != null) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) c17;
                if (i17 >= arrayList.size()) {
                    break;
                }
                if (!this.T.contains(arrayList.get(i17))) {
                    this.T.add((java.lang.String) arrayList.get(i17));
                }
                i17++;
            }
        }
        h7(list2);
        this.Z = ((java.util.ArrayList) c17).size();
        this.f206479p0 = ((java.util.ArrayList) list2).size();
        this.f206489x0.addAll(list2);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c2d;
    }

    public final void h7(java.util.List list) {
        java.util.ArrayList arrayList = (java.util.ArrayList) ((j93.n) pf5.z.f353948a.a(this).a(j93.n.class)).W6(list);
        if (arrayList.isEmpty()) {
            this.L.setText("");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (i17 < arrayList.size()) {
            sb6.append((java.lang.String) arrayList.get(i17));
            sb6.append(i17 < arrayList.size() + (-1) ? "，" : "");
            i17++;
        }
        this.L.setText(sb6.toString());
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        hashSet.add(gc0.p2.class);
        hashSet.add(vf5.j.class);
        hashSet.add(j93.n.class);
        hashSet.add(hr3.w1.class);
        hashSet.add(gc0.b.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.util.ArrayList arrayList;
        com.tencent.mm.storage.z3 z3Var;
        boolean z17;
        boolean z18;
        android.widget.TextView textView;
        r61.a h17;
        int i17;
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        this.f206472h = stringExtra;
        if (stringExtra != null && stringExtra.length() > 0) {
            this.f206470f = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f206472h, true);
            this.f206471g = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(this.f206472h);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = this.f206472h;
            objArr[1] = java.lang.Boolean.valueOf(this.f206470f != null);
            com.tencent.mm.storage.z3 z3Var2 = this.f206470f;
            objArr[2] = z3Var2 != null ? z3Var2.d1() : "null";
            com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "initView() called user:%s contact:%s contactUsername:%s", objArr);
            com.tencent.mm.storage.z3 z3Var3 = this.f206470f;
            if (z3Var3 == null || com.tencent.mm.sdk.platformtools.t8.K0(z3Var3.d1())) {
                com.tencent.mm.storage.z3 z3Var4 = new com.tencent.mm.storage.z3(this.f206472h);
                this.f206470f = z3Var4;
                java.lang.String str = this.f206475m;
                if (str == null) {
                    str = "";
                }
                z3Var4.M1(str);
                com.tencent.mm.storage.z3 z3Var5 = this.f206470f;
                java.lang.String str2 = this.f206476n;
                if (str2 == null) {
                    str2 = "";
                }
                z3Var5.n1(str2);
            }
            com.tencent.mm.storage.z3 z3Var6 = this.f206470f;
            if (z3Var6 != null) {
                this.D = z3Var6.f236591z1;
            }
            if (x51.t1.b(this.D) || this.D.startsWith("http://")) {
                java.lang.String b17 = i21.q.h().b(this.f206472h);
                if (i21.q.h().i(this.f206472h)) {
                    this.D = b17;
                } else {
                    this.D = "";
                }
            }
        }
        this.f206469e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obp);
        this.f206468d = (com.tencent.mm.ui.base.MMLimitedClearEditText) findViewById(com.tencent.mm.R.id.cdb);
        this.S = (com.tencent.mm.ui.base.FlowLayout) findViewById(com.tencent.mm.R.id.uya);
        this.f206483s = (com.tencent.mm.ui.base.MMLimitedClearEditText) findViewById(com.tencent.mm.R.id.cda);
        this.f206491y = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cdj);
        this.f206493z = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ha7);
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ha9);
        this.B = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ha8);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.har);
        this.R = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) findViewById(com.tencent.mm.R.id.f485961jp2);
        com.tencent.mm.ui.bl.b(getContext());
        int i18 = com.tencent.mm.ui.bl.b(getContext()).x;
        if (i18 > 0) {
            int dimensionPixelSize = (i18 - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn)) / 3;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f206493z.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            this.f206493z.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams2.width = dimensionPixelSize;
            layoutParams2.height = dimensionPixelSize;
            this.A.setLayoutParams(layoutParams2);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams3.width = dimensionPixelSize;
            layoutParams3.height = dimensionPixelSize;
            this.B.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f206491y.getLayoutParams();
            layoutParams4.width = dimensionPixelSize;
            layoutParams4.height = dimensionPixelSize;
            this.f206491y.setLayoutParams(layoutParams4);
        }
        com.tencent.mm.plugin.profile.n2 n2Var = com.tencent.mm.plugin.profile.n2.f153540a;
        com.tencent.mm.storage.z3 z3Var7 = this.f206470f;
        java.util.Iterator it = (z3Var7 == null ? kz5.p0.f313996d : n2Var.e(z3Var7.d1())).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.G;
            if (!hasNext) {
                break;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str3);
                java.lang.String str4 = a17.f213279f;
                if (str4 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                    if (!str4.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    arrayList.add(str3);
                    this.F.add(str3);
                }
            }
        }
        f7(arrayList, 0);
        this.f206493z.setOnClickListener(new com.tencent.mm.ui.contact.b6(this));
        this.A.setOnClickListener(new com.tencent.mm.ui.contact.c6(this));
        this.B.setOnClickListener(new com.tencent.mm.ui.contact.d6(this));
        this.f206493z.setOnLongClickListener(new com.tencent.mm.ui.contact.l5(this));
        this.A.setOnLongClickListener(new com.tencent.mm.ui.contact.o5(this));
        this.B.setOnLongClickListener(new com.tencent.mm.ui.contact.r5(this));
        this.f206491y.setOnClickListener(new com.tencent.mm.ui.contact.v5(this));
        com.tencent.mm.ui.contact.w5 w5Var = new com.tencent.mm.ui.contact.w5(this);
        com.tencent.mm.ui.contact.x5 x5Var = new com.tencent.mm.ui.contact.x5(this);
        x5Var.f191896d = w5Var;
        this.f206468d.b(x5Var);
        this.f206468d.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z19) {
                com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = com.tencent.mm.ui.contact.ModRemarkNameUI.this;
                if (z19) {
                    modRemarkNameUI.f206482r = true;
                    modRemarkNameUI.Q = 1;
                } else {
                    int i19 = com.tencent.mm.ui.contact.ModRemarkNameUI.f206466y1;
                    modRemarkNameUI.getClass();
                }
            }
        });
        com.tencent.mm.storage.z3 z3Var8 = this.f206470f;
        if (z3Var8 != null && (i17 = this.f206473i) != 3) {
            if (i17 == 4) {
                com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f206468d;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str5 = this.f206475m;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str5 == null) {
                    str5 = "";
                }
                float textSize = this.f206468d.getTextSize();
                ((ke0.e) xVar).getClass();
                mMLimitedClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str5, textSize));
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(z3Var8.w0())) {
                if (this.f206473i != 0 || com.tencent.mm.sdk.platformtools.t8.K0(this.f206476n)) {
                    com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = this.f206468d;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String w07 = this.f206470f.w0();
                    if (w07 == null) {
                        w07 = "";
                    }
                    float textSize2 = this.f206468d.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    mMLimitedClearEditText2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, w07, textSize2));
                } else {
                    com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText3 = this.f206468d;
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str6 = this.f206476n;
                    float textSize3 = this.f206468d.getTextSize();
                    ((ke0.e) xVar3).getClass();
                    mMLimitedClearEditText3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str6, textSize3));
                }
                this.f206470f.w0().equals(this.f206476n);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f206476n)) {
                com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText4 = this.f206468d;
                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str7 = this.f206476n;
                if (str7 == null) {
                    str7 = "";
                }
                float textSize4 = this.f206468d.getTextSize();
                ((ke0.e) xVar4).getClass();
                mMLimitedClearEditText4.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str7, textSize4));
                this.f206470f.w0().equals(this.f206476n);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f206470f.P0())) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f206475m)) {
                    java.lang.String P0 = this.f206470f.P0();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(P0) && P0.length() <= 50) {
                        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText5 = this.f206468d;
                        le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String g27 = this.f206470f.g2();
                        if (g27 == null) {
                            g27 = "";
                        }
                        float textSize5 = this.f206468d.getTextSize();
                        ((ke0.e) xVar5).getClass();
                        mMLimitedClearEditText5.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, g27, textSize5));
                    } else {
                        this.f206468d.setText("");
                    }
                } else {
                    com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText6 = this.f206468d;
                    le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str8 = this.f206475m;
                    if (str8 == null) {
                        str8 = "";
                    }
                    float textSize6 = this.f206468d.getTextSize();
                    ((ke0.e) xVar6).getClass();
                    mMLimitedClearEditText6.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str8, textSize6));
                }
            } else if (this.f206473i != 0 || com.tencent.mm.sdk.platformtools.t8.K0(this.f206475m) || this.f206470f.r2()) {
                com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText7 = this.f206468d;
                le0.x xVar7 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String P02 = this.f206470f.P0();
                if (P02 == null) {
                    P02 = "";
                }
                float textSize7 = this.f206468d.getTextSize();
                ((ke0.e) xVar7).getClass();
                mMLimitedClearEditText7.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, P02, textSize7));
            } else {
                com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText8 = this.f206468d;
                le0.x xVar8 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str9 = this.f206475m;
                if (str9 == null) {
                    str9 = "";
                }
                float textSize8 = this.f206468d.getTextSize();
                ((ke0.e) xVar8).getClass();
                mMLimitedClearEditText8.setHint(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str9, textSize8));
            }
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText9 = this.f206468d;
            mMLimitedClearEditText9.setSelection(mMLimitedClearEditText9.getText().length());
        }
        if (this.f206473i != 0 || com.tencent.mm.storage.z3.V3(this.f206472h)) {
            int i19 = this.f206473i;
            if (i19 == 3) {
                this.f206469e.setText(com.tencent.mm.R.string.f493306jo5);
                this.f206468d.setHint("");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f206475m)) {
                    this.f206468d.setText(this.f206475m);
                }
                android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cdc);
                textView2.setText(com.tencent.mm.R.string.f492976ij0);
                textView2.setVisibility(0);
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.jp6);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f485960jp1);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i19 == 4) {
                this.f206469e.setText(com.tencent.mm.R.string.i5k);
                this.f206468d.setHint("");
                android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cdc);
                textView3.setText(com.tencent.mm.R.string.i6d);
                textView3.setVisibility(0);
            } else if (com.tencent.mm.storage.z3.V3(this.f206472h)) {
                this.f206469e.setText(com.tencent.mm.R.string.f493306jo5);
            }
        } else {
            this.f206469e.setText(com.tencent.mm.R.string.bf9);
            if (com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p() || (h17 = m61.k.wi().h(this.f206470f.d1())) == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.h()) || h17.h().equals(this.f206468d.getText())) {
                z17 = false;
            } else {
                java.lang.String f17 = h17.f();
                if (f17 == null) {
                    f17 = "";
                }
                f17.replace(" ", "");
                this.f206486v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jpd);
                android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f485964jp5);
                this.f206487w = findViewById3;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView4 = this.f206486v;
                java.lang.String string = getString(com.tencent.mm.R.string.bh7, h17.h());
                if (string == null) {
                    string = "";
                }
                textView4.setText(string);
                com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(getString(com.tencent.mm.R.string.la6));
                f0Var.c(new com.tencent.mm.ui.contact.g6(this, h17.h()), 0, f0Var.length(), 17);
                this.f206486v.append(" ");
                this.f206486v.append(f0Var);
                this.f206486v.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                z17 = true;
            }
            if (!z17) {
                if (!com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p()) {
                    com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "initChatRoomNameArea() chatroomName: %s, mobileName: %s, remarkName: %s", this.f206488x, this.f206486v, this.f206468d.getText());
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f206488x) && (((textView = this.f206486v) == null || com.tencent.mm.sdk.platformtools.t8.J0(textView.getText())) && (this.f206468d.getText() == null || !this.f206488x.equals(this.f206468d.getText().toString())))) {
                        this.f206486v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jpd);
                        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f485964jp5);
                        this.f206487w = findViewById4;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initChatRoomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(findViewById4, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initChatRoomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.TextView textView5 = this.f206486v;
                        le0.x xVar9 = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String string2 = getString(com.tencent.mm.R.string.bh6, this.f206488x);
                        if (string2 == null) {
                            string2 = "";
                        }
                        float textSize9 = this.f206486v.getTextSize();
                        ((ke0.e) xVar9).getClass();
                        textView5.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, string2, textSize9));
                        com.tencent.mm.pluginsdk.ui.span.f0 f0Var2 = new com.tencent.mm.pluginsdk.ui.span.f0(getString(com.tencent.mm.R.string.la6));
                        f0Var2.c(new com.tencent.mm.ui.contact.g6(this, this.f206488x), 0, f0Var2.length(), 17);
                        this.f206486v.append(" ");
                        this.f206486v.append(f0Var2);
                        this.f206486v.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                        z18 = true;
                        if (!z18 && ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1)) {
                            ((gc0.p2) pf5.z.f353948a.a(this).a(gc0.p2.class)).V6(new gc0.b0(this.f206472h, this.f206475m), new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$d
                                @Override // yz5.a
                                public final java.lang.Object invoke() {
                                    return com.tencent.mm.ui.contact.ModRemarkNameUI.this.f206468d.getEditText();
                                }
                            }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$e
                                @Override // yz5.a
                                public final java.lang.Object invoke() {
                                    return com.tencent.mm.ui.contact.ModRemarkNameUI.this.R.getPhoneNumberList();
                                }
                            }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$f
                                @Override // yz5.a
                                public final java.lang.Object invoke() {
                                    return java.lang.Boolean.valueOf(!com.tencent.mm.ui.contact.ModRemarkNameUI.this.R.f());
                                }
                            }, new yz5.l() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$g
                                @Override // yz5.l
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    java.lang.String str10 = (java.lang.String) obj;
                                    int i27 = com.tencent.mm.ui.contact.ModRemarkNameUI.f206466y1;
                                    com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = com.tencent.mm.ui.contact.ModRemarkNameUI.this;
                                    com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) modRemarkNameUI.findViewById(com.tencent.mm.R.id.f485961jp2);
                                    if (!modRemarkNameUI.R.f()) {
                                        return java.lang.Boolean.FALSE;
                                    }
                                    profileEditPhoneNumberView.c(str10, false, false);
                                    return java.lang.Boolean.TRUE;
                                }
                            }, null, null);
                        }
                    }
                }
                z18 = false;
                if (!z18) {
                    ((gc0.p2) pf5.z.f353948a.a(this).a(gc0.p2.class)).V6(new gc0.b0(this.f206472h, this.f206475m), new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$d
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            return com.tencent.mm.ui.contact.ModRemarkNameUI.this.f206468d.getEditText();
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$e
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            return com.tencent.mm.ui.contact.ModRemarkNameUI.this.R.getPhoneNumberList();
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$f
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(!com.tencent.mm.ui.contact.ModRemarkNameUI.this.R.f());
                        }
                    }, new yz5.l() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$g
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            java.lang.String str10 = (java.lang.String) obj;
                            int i27 = com.tencent.mm.ui.contact.ModRemarkNameUI.f206466y1;
                            com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = com.tencent.mm.ui.contact.ModRemarkNameUI.this;
                            com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) modRemarkNameUI.findViewById(com.tencent.mm.R.id.f485961jp2);
                            if (!modRemarkNameUI.R.f()) {
                                return java.lang.Boolean.FALSE;
                            }
                            profileEditPhoneNumberView.c(str10, false, false);
                            return java.lang.Boolean.TRUE;
                        }
                    }, null, null);
                }
            }
            if (com.tencent.mm.storage.z3.m4(this.f206472h)) {
                android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.jp6);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f485960jp1);
                if (findViewById6 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById6, arrayList7.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1);
            }
        }
        setMMTitle("");
        if (this.f206468d.getHint() != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f206468d.getHint().toString())) {
            this.f206477o = this.f206468d.getHint().toString();
            this.f206478p = 1;
        }
        if (this.f206468d.getText() != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f206468d.getText().toString())) {
            this.f206477o = this.f206468d.getText().toString();
            this.f206478p = 2;
        }
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490547y6), new com.tencent.mm.ui.contact.y5(this), null, com.tencent.mm.ui.fb.GREEN);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aay));
        hideActionbarLine();
        this.mController.G0(getResources().getColor(com.tencent.mm.R.color.aay));
        getController().x0(getString(com.tencent.mm.R.string.f490347sg), new java.lang.Runnable() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$b
            @Override // java.lang.Runnable
            public final void run() {
                int i27 = com.tencent.mm.ui.contact.ModRemarkNameUI.f206466y1;
                com.tencent.mm.ui.contact.ModRemarkNameUI.this.b7();
            }
        });
        setBackBtnVisible(false);
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText10 = this.f206483s;
        le0.x xVar10 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str10 = this.f206484t;
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str10 == null) {
            str10 = "";
        }
        float textSize10 = this.f206483s.getTextSize();
        ((ke0.e) xVar10).getClass();
        android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(this, str10, textSize10);
        mMLimitedClearEditText10.getClass();
        mMLimitedClearEditText10.editText.append(j17);
        com.tencent.mm.storage.ya yaVar = this.f206471g;
        if (yaVar != null) {
            java.lang.String str11 = yaVar.field_conDescription;
            if (str11 == null) {
                str11 = "";
            }
            this.f206484t = str11;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f206484t) && (z3Var = this.f206470f) != null) {
            this.f206484t = z3Var.f236589y1;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f206484t)) {
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText11 = this.f206483s;
            le0.x xVar11 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str12 = this.f206484t;
            java.lang.String str13 = str12 != null ? str12 : "";
            float textSize11 = this.f206483s.getTextSize();
            ((ke0.e) xVar11).getClass();
            mMLimitedClearEditText11.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str13, textSize11));
        }
        this.f206483s.b(new com.tencent.mm.ui.contact.f6(this, null));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.ArrayList arrayList = this.F;
        if (i17 == 100) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            arrayList.add(Y6(b17, arrayList.size()));
            f7(arrayList, 0);
            X6();
            return;
        }
        if (i17 == 200) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MiroMsg.ModRemarkName", "data shouldnot be null");
                return;
            }
            java.util.Iterator<java.lang.String> it = intent.getStringArrayListExtra("CropImage_OutputPath_List").iterator();
            while (it.hasNext()) {
                arrayList.add(Y6(it.next(), arrayList.size()));
            }
            f7(arrayList, 0);
            X6();
            return;
        }
        if (i17 == 400) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MiroMsg.ModRemarkName", "data shouldnot be null");
                return;
            }
            if (intent.getBooleanExtra("response_delete", false)) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("remark_image_path");
                if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                    this.E = 0;
                    this.f206493z.setVisibility(8);
                    this.A.setVisibility(8);
                    this.B.setVisibility(8);
                }
                f7(stringArrayListExtra, 0);
                arrayList.clear();
                arrayList.addAll(stringArrayListExtra);
                X6();
                return;
            }
            return;
        }
        if (i17 != 600) {
            return;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.ModRemarkName", "data shouldnot be null");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("result_label_id_list");
        ((j93.n) pf5.z.f353948a.a(this).a(j93.n.class)).O6(stringArrayListExtra2, intent.getIntExtra("recommend_label_adopt_count", 0));
        java.util.List c17 = ((b93.b) c93.a.a()).c();
        com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "onAcvityResult，labelLists: %s, allLabelListsNow: %s.", stringArrayListExtra2, c17);
        if (!W6(stringArrayListExtra2, this.V) && !W6(c17, this.T)) {
            com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "onAcvityResult checkLebalChanges.");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_new_list");
        if (stringArrayListExtra3 != null) {
            this.f206492y0.addAll(stringArrayListExtra3);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_search_label_add_list");
        if (stringArrayListExtra4 != null) {
            this.f206474l1.addAll(stringArrayListExtra4);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_add_list");
        if (stringArrayListExtra5 != null) {
            this.f206490x1.addAll(stringArrayListExtra5);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra6 = intent.getStringArrayListExtra("contact_select_label_new_list");
        if (stringArrayListExtra6 != null) {
            this.f206480p1.addAll(stringArrayListExtra6);
        }
        if (this.T == null) {
            this.T = new java.util.ArrayList();
        }
        g7();
        if (i18 == -1) {
            enableOptionMenu(true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText;
        super.onCreate(bundle);
        this.Y = java.lang.System.currentTimeMillis();
        this.I = getIntent().getIntExtra("Contact_Scene", 9);
        this.f206488x = getIntent().getStringExtra("Contact_RoomNickname");
        this.f206473i = getIntent().getIntExtra("Contact_mode_name_type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_Nick");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f206475m = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("Contact_RemarkName");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        this.f206476n = str;
        this.f206481q = str;
        this.f206485u = getIntent().getBooleanExtra("Contact_ModStrangerRemark", true);
        initView();
        int i17 = 8;
        if (com.tencent.mm.storage.z3.m4(this.f206472h)) {
            com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "initLabelPanelAll, isOpenIM, userName: %s.", this.f206472h);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.cd9);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.cd8);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            this.M = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cd9);
            this.K = findViewById(com.tencent.mm.R.id.cd8);
            this.N = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cd8);
            this.L = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cd6);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a4u);
            if (imageView != null) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_arrow, i65.a.d(getContext(), com.tencent.mm.R.color.BW_70)));
            }
            this.N.setOnClickListener(this.f206467J);
            if (this.f206473i != 0) {
                android.view.View view = this.K;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.M.setVisibility(8);
            } else {
                android.view.View view2 = this.K;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.M.setVisibility(0);
                this.L.setVisibility(0);
            }
            g7();
        }
        X6();
        com.tencent.mm.storage.z3 z3Var = this.f206470f;
        if ((z3Var != null && com.tencent.mm.storage.z3.m4(z3Var.d1())) && (mMLimitedClearEditText = this.f206468d) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) mMLimitedClearEditText.getParent();
            int childCount = viewGroup.getChildCount();
            int i18 = 0;
            while (i18 < childCount) {
                android.view.View childAt = viewGroup.getChildAt(i18);
                int id6 = childAt.getId();
                if (id6 != com.tencent.mm.R.id.cdc && id6 != com.tencent.mm.R.id.cdb) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(childAt, arrayList5.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "hideNonRemarkField", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/ui/contact/ModRemarkNameUI", "hideNonRemarkField", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                i18++;
                i17 = 8;
            }
        }
        ((j93.n) component(j93.n.class)).S6(this.f206472h, true, (com.tencent.mm.ui.base.FlowLayout) findViewById(com.tencent.mm.R.id.u8m), new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$c
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = com.tencent.mm.ui.contact.ModRemarkNameUI.this;
                modRemarkNameUI.h7(modRemarkNameUI.U);
                modRemarkNameUI.X6();
                return null;
            }
        });
        ((hr3.w1) component(hr3.w1.class)).P6(iy1.c.WeChatNotesandTabsPage);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        b7();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(kd1.c.CTRL_INDEX, this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(kd1.c.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MiroMsg.ModRemarkName", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.getType() == 44) {
            if (i17 == 0 || i18 >= 0) {
                finish();
            } else {
                android.widget.Toast.makeText(this, getString(com.tencent.mm.R.string.f492898i64, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                finish();
            }
        }
    }
}
