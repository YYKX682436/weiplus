package com.tencent.mm.ui.contact;

@java.lang.Deprecated
/* loaded from: classes11.dex */
public class ContactRemarkInfoModUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int T1 = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView C1;
    public android.view.View D1;
    public android.view.View E1;
    public java.lang.String F1;
    public java.lang.String G1;
    public com.tencent.mm.ui.base.FlowLayout H1;
    public com.tencent.mm.ui.base.FlowLayout I1;
    public java.lang.String J1;
    public java.lang.String K1;
    public java.lang.String L1;
    public android.widget.TextView T;
    public android.widget.LinearLayout U;
    public java.lang.String V;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f206369d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f206370e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f206371f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.core.widget.NestedScrollView f206372g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f206373h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f206374i;

    /* renamed from: l1, reason: collision with root package name */
    public int f206375l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f206376m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f206377n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f206378o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f206379p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f206382q;

    /* renamed from: r, reason: collision with root package name */
    public android.app.ProgressDialog f206383r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f206384s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f206385t;

    /* renamed from: u, reason: collision with root package name */
    public int f206386u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f206387v;

    /* renamed from: x0, reason: collision with root package name */
    public long f206390x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f206393y0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f206395z;

    /* renamed from: w, reason: collision with root package name */
    public int f206388w = 0;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f206389x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f206392y = new java.util.LinkedList();
    public final java.util.ArrayList D = new java.util.ArrayList();
    public final java.util.ArrayList E = new java.util.ArrayList();
    public boolean F = true;
    public final java.util.ArrayList G = new java.util.ArrayList();
    public final java.util.ArrayList H = new java.util.ArrayList();
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f206368J = new java.util.ArrayList();
    public boolean K = false;
    public boolean L = false;
    public int M = 0;
    public boolean N = false;
    public final java.util.ArrayList P = new java.util.ArrayList();
    public final com.tencent.mm.sdk.coroutines.LifecycleScope Q = new com.tencent.mm.sdk.coroutines.LifecycleScope("remark", this, 1);
    public final com.tencent.mm.sdk.coroutines.LifecycleScope R = new com.tencent.mm.sdk.coroutines.LifecycleScope("remark_upload", this, 1);
    public final com.tencent.mm.ui.contact.w2 S = new com.tencent.mm.ui.contact.w2(this, null);
    public java.util.List W = new java.util.ArrayList();
    public java.util.List X = new java.util.ArrayList();
    public final java.util.List Y = new java.util.ArrayList();
    public final java.util.HashSet Z = new java.util.HashSet();

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.HashSet f206380p0 = new java.util.HashSet();

    /* renamed from: p1, reason: collision with root package name */
    public int f206381p1 = 0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.HashSet f206391x1 = new java.util.HashSet();

    /* renamed from: y1, reason: collision with root package name */
    public final java.util.HashSet f206394y1 = new java.util.HashSet();

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.HashSet f206396z1 = new java.util.HashSet();
    public final java.util.HashSet A1 = new java.util.HashSet();
    public final java.util.HashSet B1 = new java.util.HashSet();
    public final android.text.TextWatcher M1 = new com.tencent.mm.ui.contact.h2(this);
    public final com.tencent.mm.ui.contact.x2 N1 = new com.tencent.mm.ui.contact.x2(this, null);
    public java.lang.Runnable O1 = null;
    public final l75.z0 P1 = new com.tencent.mm.ui.contact.o2(this);
    public boolean Q1 = true;
    public int R1 = 0;
    public boolean S1 = false;

    public static void T6(final com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        j93.n nVar = (j93.n) contactRemarkInfoModUI.component(j93.n.class);
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$$g
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                r61.a h17;
                com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI2 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.this;
                contactRemarkInfoModUI2.Q1 = true;
                ck5.f b17 = ck5.f.b(contactRemarkInfoModUI2.f206369d.getEditText());
                b17.f42561f = 0;
                b17.f42560e = 64;
                b17.d(new com.tencent.mm.ui.contact.b2(contactRemarkInfoModUI2));
                ck5.f b18 = ck5.f.b(contactRemarkInfoModUI2.f206370e.getEditText());
                b18.f42561f = 0;
                b18.f42560e = 400;
                b18.d(new com.tencent.mm.ui.contact.c2(contactRemarkInfoModUI2));
                if (!contactRemarkInfoModUI2.Q1) {
                    return null;
                }
                boolean h76 = contactRemarkInfoModUI2.h7();
                if (!h76) {
                    contactRemarkInfoModUI2.f206371f = db5.e1.Q(contactRemarkInfoModUI2, contactRemarkInfoModUI2.getString(com.tencent.mm.R.string.f490573yv), contactRemarkInfoModUI2.getResources().getString(com.tencent.mm.R.string.g8r), true, true, new com.tencent.mm.ui.contact.m2(contactRemarkInfoModUI2));
                }
                com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "[dealModRemarkDesc] :%s", contactRemarkInfoModUI2.f206385t);
                if (contactRemarkInfoModUI2.g7()) {
                    java.lang.String charSequence = contactRemarkInfoModUI2.f206370e.getText().toString();
                    contactRemarkInfoModUI2.C = charSequence;
                    r45.wn4 wn4Var = new r45.wn4();
                    wn4Var.f389311d = contactRemarkInfoModUI2.f206385t;
                    wn4Var.f389312e = charSequence;
                    ((e21.z0) c01.d9.b().w()).c(new xg3.p0(54, wn4Var));
                } else {
                    com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "[dealModRemarkDesc] : don't need to save");
                }
                java.lang.String charSequence2 = contactRemarkInfoModUI2.f206369d.getText().toString();
                com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "Set New RemarkName : " + charSequence2 + ", Report kvStat, addContactScene = " + contactRemarkInfoModUI2.f206386u);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10448, java.lang.Integer.valueOf(contactRemarkInfoModUI2.f206386u));
                int source = contactRemarkInfoModUI2.f206384s.getSource();
                if ((source == 10 || source == 11 || source == 13) && (h17 = m61.k.wi().h(contactRemarkInfoModUI2.f206384s.d1())) != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.h())) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence2)) {
                        h17.f392801q |= 1;
                    } else {
                        h17.f392801q &= -2;
                    }
                    m61.k.wi().j(h17.e(), h17);
                }
                com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(contactRemarkInfoModUI2.f206384s.d1());
                if ((z07 == null || com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) && !com.tencent.mm.sdk.platformtools.t8.K0(contactRemarkInfoModUI2.f206384s.J0())) {
                    z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(contactRemarkInfoModUI2.f206384s.J0());
                }
                if (z07 != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                    ((com.tencent.mm.storage.ab) c01.d9.b().B()).y0(z07.field_encryptUsername);
                }
                if (contactRemarkInfoModUI2.i7(false)) {
                    contactRemarkInfoModUI2.f206395z = charSequence2;
                    com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "usernamne %s operationSetRemark %s", contactRemarkInfoModUI2.f206384s.d1(), charSequence2);
                    c01.e2.q0(contactRemarkInfoModUI2.f206384s, charSequence2);
                } else {
                    com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "remarkNameChanged %s", java.lang.Boolean.valueOf(contactRemarkInfoModUI2.i7(false)));
                }
                if (contactRemarkInfoModUI2.S1) {
                    r45.qo4 qo4Var = new r45.qo4();
                    qo4Var.f384148d = contactRemarkInfoModUI2.f206385t;
                    r45.c85 c85Var = new r45.c85();
                    c85Var.f371374e = new java.util.LinkedList();
                    java.util.ArrayList<java.lang.String> phoneNumberList = contactRemarkInfoModUI2.C1.getPhoneNumberList();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (phoneNumberList != null) {
                        java.util.Iterator<java.lang.String> it = phoneNumberList.iterator();
                        while (it.hasNext()) {
                            java.lang.String next = it.next();
                            if (aq1.e.d(next)) {
                                r45.b85 b85Var = new r45.b85();
                                b85Var.f370631d = next;
                                c85Var.f371374e.add(b85Var);
                                arrayList.add(next);
                            }
                        }
                    }
                    c85Var.f371373d = arrayList.size();
                    qo4Var.f384149e = c85Var;
                    ((e21.z0) c01.d9.b().w()).c(new xg3.p0(60, qo4Var));
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(contactRemarkInfoModUI2.f206385t, true);
                    if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
                        java.lang.String a17 = com.tencent.mm.contact.a.a(arrayList);
                        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "[dealModPhoneNumberList] username:%s %s", contactRemarkInfoModUI2.f206385t, a17);
                        contactRemarkInfoModUI2.f206384s.a3(a17);
                        com.tencent.mm.contact.a.d(contactRemarkInfoModUI2.f206384s);
                        ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(contactRemarkInfoModUI2.f206385t, contactRemarkInfoModUI2.f206384s);
                    }
                }
                java.lang.String str = contactRemarkInfoModUI2.f206395z;
                java.lang.String str2 = contactRemarkInfoModUI2.C;
                java.util.ArrayList arrayList2 = contactRemarkInfoModUI2.D;
                java.lang.String b19 = com.tencent.mm.contact.b.b(arrayList2);
                com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "[saveRemarkInfo] :%s :%s", contactRemarkInfoModUI2.f206385t, str);
                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(contactRemarkInfoModUI2.f206385t, true);
                if (n18 == null || ((int) n18.E2) <= 0 || !n18.r2()) {
                    com.tencent.mars.xlog.Log.e("MiroMsg.ContactRemarkInfoModUI", "[saveRemarkInfo] is error!");
                } else {
                    contactRemarkInfoModUI2.f206384s.n1(str);
                    contactRemarkInfoModUI2.f206384s.d3(str2);
                    contactRemarkInfoModUI2.f206384s.e3(b19);
                    contactRemarkInfoModUI2.f206384s.getClass();
                    ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(contactRemarkInfoModUI2.f206385t, contactRemarkInfoModUI2.f206384s);
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = java.lang.Boolean.valueOf(str2 == null);
                    objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
                    objArr[2] = str2 == null ? "" : com.tencent.mm.sdk.platformtools.t8.G1(str2);
                    com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "remarkDesc (%s, %s, %s)", objArr);
                    new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent().e();
                }
                if (!h76) {
                    contactRemarkInfoModUI2.finish();
                    return null;
                }
                contactRemarkInfoModUI2.f206383r = db5.e1.Q(contactRemarkInfoModUI2, contactRemarkInfoModUI2.getString(com.tencent.mm.R.string.f490573yv), contactRemarkInfoModUI2.getString(com.tencent.mm.R.string.bcs), true, false, null);
                if (!contactRemarkInfoModUI2.F || arrayList2 == null || arrayList2.size() <= 0) {
                    c01.d9.e().g(new i21.a(contactRemarkInfoModUI2.f206385t, contactRemarkInfoModUI2.f206392y));
                    return null;
                }
                java.util.ArrayList arrayList3 = contactRemarkInfoModUI2.E;
                arrayList3.addAll(arrayList2);
                i21.p.f287911a.b(arrayList3, contactRemarkInfoModUI2.R, new com.tencent.mm.ui.contact.j2(contactRemarkInfoModUI2));
                return null;
            }
        };
        nVar.getClass();
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(nVar.getActivity()), null, null, new j93.g(new java.util.ArrayList(nVar.f298453s), new java.util.ArrayList(nVar.f298451q), nVar, lVar, null), 3, null);
    }

    public static void U6(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI, int i17) {
        contactRemarkInfoModUI.Z6();
        java.util.ArrayList arrayList = contactRemarkInfoModUI.H;
        arrayList.clear();
        arrayList.addAll(contactRemarkInfoModUI.G);
        arrayList.addAll(contactRemarkInfoModUI.D);
        android.content.Intent intent = new android.content.Intent(contactRemarkInfoModUI, (java.lang.Class<?>) com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.class);
        intent.putExtra("Contact_User", contactRemarkInfoModUI.f206385t);
        intent.putExtra("remark_image_path", arrayList);
        intent.putExtra("view_temp_remark_image", false);
        intent.putExtra("selected_item", i17);
        intent.putExtra("view_only", false);
        contactRemarkInfoModUI.startActivityForResult(intent, 400);
    }

    public static void V6(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI, int i17) {
        contactRemarkInfoModUI.I--;
        java.util.ArrayList arrayList = contactRemarkInfoModUI.G;
        int size = arrayList != null ? arrayList.size() : 0;
        java.util.ArrayList arrayList2 = contactRemarkInfoModUI.D;
        int size2 = arrayList2 != null ? arrayList2.size() : 0;
        if (i17 < size) {
            com.tencent.mm.vfs.w6.h((java.lang.String) arrayList.get(i17));
            arrayList.remove(i17);
            java.util.LinkedList linkedList = contactRemarkInfoModUI.f206392y;
            if (linkedList.size() > i17) {
                linkedList.remove(i17);
            }
            java.util.ArrayList arrayList3 = contactRemarkInfoModUI.E;
            if (arrayList3.size() > i17) {
                arrayList3.remove(i17);
            }
            contactRemarkInfoModUI.N = true;
        } else {
            int i18 = i17 - size;
            if (i18 < size2) {
                arrayList2.remove(i18);
            }
        }
        contactRemarkInfoModUI.f206368J.remove(i17);
        if (i17 == 0) {
            contactRemarkInfoModUI.f206376m.setVisibility(8);
        } else if (i17 == 1) {
            contactRemarkInfoModUI.f206377n.setVisibility(8);
        } else if (i17 == 2) {
            contactRemarkInfoModUI.f206378o.setVisibility(8);
        }
        contactRemarkInfoModUI.f206373h.setVisibility(0);
        contactRemarkInfoModUI.f206374i.setVisibility(8);
        if (arrayList != null) {
            size = arrayList.size();
        }
        contactRemarkInfoModUI.f7(arrayList, 0);
        contactRemarkInfoModUI.f7(arrayList2, size);
        contactRemarkInfoModUI.Y6();
    }

    public final void W6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MiroMsg.ContactRemarkInfoModUI", "tag is empty");
            return;
        }
        java.lang.String trim = str.trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            com.tencent.mars.xlog.Log.w("MiroMsg.ContactRemarkInfoModUI", "new tag is empty");
            return;
        }
        com.tencent.mm.storage.d4 o17 = b93.r.wi().o1(trim);
        java.util.List list = this.W;
        if (list == null || !list.contains(trim) || (o17 != null && o17.field_isTemporary)) {
            this.f206380p0.add(trim);
        }
        java.util.HashSet hashSet = this.Z;
        if (hashSet == null || !hashSet.contains(trim)) {
            return;
        }
        hashSet.remove(trim);
    }

    public final boolean X6(java.util.List list, java.util.List list2) {
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

    public final void Y6() {
        this.S1 = this.C1.e();
        if (!g7() && !h7() && !i7(false) && !this.S1) {
            enableOptionMenu(false);
        } else if (this.f206369d.c() || this.f206370e.c()) {
            enableOptionMenu(false);
        } else {
            enableOptionMenu(true);
        }
        if (((j93.n) component(j93.n.class)).R6()) {
            enableOptionMenu(true);
        }
        if (this.f206368J.size() >= 3) {
            ((gc0.p2) pf5.z.f353948a.a(this).a(gc0.p2.class)).f270242d.invoke();
        }
    }

    public final void Z6() {
        this.f206369d.clearFocus();
        this.f206370e.clearFocus();
        this.C1.clearFocus();
        hideVKB();
    }

    public final java.lang.String a7(java.lang.String str, int i17) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        java.lang.String c17 = i21.q.h().c(this.f206385t, i17);
        if (!com.tencent.mm.sdk.platformtools.x.v(str, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, c17)) {
            com.tencent.mars.xlog.Log.e("MiroMsg.ContactRemarkInfoModUI", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.tencent.mm.sdk.platformtools.x.y0(c17, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, c17)) {
            return c17;
        }
        com.tencent.mars.xlog.Log.e("MiroMsg.ContactRemarkInfoModUI", "rotate big pic fail");
        return null;
    }

    public final void b7() {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17;
        java.lang.String a17 = i21.q.h().a(this.f206385t);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a17);
        if (r6Var.m() && r6Var.y() && (s17 = com.tencent.mm.vfs.w6.s(a17, true)) != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null && !this.P.contains(x1Var.f213232b)) {
                    x1Var.a();
                }
            }
        }
    }

    public void c7(long j17) {
        if (j17 == 1) {
            ((gc0.p2) pf5.z.f353948a.a(this).a(gc0.p2.class)).f270248m.b(this.f206369d.getActualText(), this.C1.getPhoneNumberList(), this.D, this.f206370e);
            ((hr3.w1) component(hr3.w1.class)).O6();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.contact.n2(this, j17));
    }

    public final void d7() {
        boolean h76 = h7();
        boolean i76 = i7(true);
        boolean g76 = g7();
        if (h76 || i76 || g76) {
            db5.e1.A(this, getString(com.tencent.mm.R.string.bgj), null, getString(com.tencent.mm.R.string.bgl), getString(com.tencent.mm.R.string.bgk), new com.tencent.mm.ui.contact.k2(this), new com.tencent.mm.ui.contact.l2(this));
            return;
        }
        c7(2L);
        hideVKB();
        finish();
    }

    public final void e7(boolean z17) {
        ((j93.n) pf5.z.f353948a.a(this).a(j93.n.class)).V6(600, new android.content.Intent(), z17, (java.util.ArrayList) this.Y);
    }

    public final void f7(java.util.ArrayList arrayList, int i17) {
        this.f206374i.setVisibility(8);
        this.f206373h.setVisibility(0);
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                float g17 = i65.a.g(this);
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    android.graphics.Bitmap a18 = com.tencent.mm.sdk.platformtools.j.a(str, g17);
                    com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "loadRemarkImageFromFile() called with imgPath:%s bitmap:%s", str, a18);
                    if (a18 != null) {
                        if (i17 == 0) {
                            this.I = 1;
                            this.f206376m.setVisibility(0);
                            this.f206376m.setImageBitmap(a18);
                            this.f206377n.setVisibility(8);
                            this.f206378o.setVisibility(8);
                        } else if (i17 == 1) {
                            this.I = 2;
                            this.f206377n.setVisibility(0);
                            this.f206377n.setImageBitmap(a18);
                            this.f206378o.setVisibility(8);
                        } else if (i17 == 2) {
                            this.I = 3;
                            this.f206378o.setVisibility(0);
                            this.f206378o.setImageBitmap(a18);
                            this.f206373h.setVisibility(8);
                            this.f206374i.setVisibility(0);
                        }
                        i17++;
                    }
                }
            }
        }
    }

    public final boolean g7() {
        java.lang.String charSequence = this.f206370e.getText().toString();
        java.lang.String str = this.C;
        return (str == null || !str.equals(charSequence)) && !(com.tencent.mm.sdk.platformtools.t8.K0(this.C) && com.tencent.mm.sdk.platformtools.t8.K0(charSequence));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2o;
    }

    public final boolean h7() {
        java.util.ArrayList arrayList = this.D;
        return (arrayList != null && arrayList.size() > 0) || this.N;
    }

    public final boolean i7(boolean z17) {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f206369d;
        if (!mMLimitedClearEditText.isEdited) {
            return false;
        }
        java.lang.String charSequence = mMLimitedClearEditText.getText().toString();
        if (z17) {
            java.lang.String str = this.f206395z;
            if ((str == null || !str.equals(charSequence)) && !(com.tencent.mm.sdk.platformtools.t8.K0(this.f206395z) && com.tencent.mm.sdk.platformtools.t8.K0(charSequence))) {
                return charSequence == null || !charSequence.equals(this.f206384s.P0());
            }
            return false;
        }
        java.lang.String str2 = this.f206395z;
        if (str2 == null || !str2.equals(charSequence)) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(this.f206395z) && com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int i17;
        java.util.ArrayList arrayList;
        boolean z17;
        boolean z18;
        r61.a h17;
        com.tencent.mm.storage.z3 z3Var;
        this.f206372g = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.mcq);
        this.f206373h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cdj);
        this.f206374i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.har);
        this.f206369d = (com.tencent.mm.ui.base.MMLimitedClearEditText) findViewById(com.tencent.mm.R.id.cdb);
        this.f206370e = (com.tencent.mm.ui.base.MMLimitedClearEditText) findViewById(com.tencent.mm.R.id.cda);
        this.f206376m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ha7);
        this.f206377n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ha9);
        this.f206378o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ha8);
        com.tencent.mm.ui.bl.b(getContext());
        int i18 = com.tencent.mm.ui.bl.b(getContext()).x;
        int i19 = 3;
        if (i18 > 0) {
            int dimensionPixelSize = (i18 - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn)) / 3;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f206376m.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            this.f206376m.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f206377n.getLayoutParams();
            layoutParams2.width = dimensionPixelSize;
            layoutParams2.height = dimensionPixelSize;
            this.f206377n.setLayoutParams(layoutParams2);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f206378o.getLayoutParams();
            layoutParams3.width = dimensionPixelSize;
            layoutParams3.height = dimensionPixelSize;
            this.f206378o.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f206373h.getLayoutParams();
            layoutParams4.width = dimensionPixelSize;
            layoutParams4.height = dimensionPixelSize;
            this.f206373h.setLayoutParams(layoutParams4);
        }
        this.E1 = findViewById(com.tencent.mm.R.id.jcz);
        this.D1 = findViewById(com.tencent.mm.R.id.t3c);
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = (com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView) findViewById(com.tencent.mm.R.id.f485961jp2);
        this.C1 = profileEditPhoneNumberView;
        profileEditPhoneNumberView.f189812d = this.f206384s;
        this.I1 = (com.tencent.mm.ui.base.FlowLayout) findViewById(com.tencent.mm.R.id.upz);
        this.H1 = (com.tencent.mm.ui.base.FlowLayout) findViewById(com.tencent.mm.R.id.uya);
        if (this.G1 == null && (z3Var = this.f206384s) != null) {
            java.lang.String str = z3Var.E1;
            this.G1 = str;
            com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "is null phone, mContactPhoneNumberList: %s, mContactPhoneNumberByMD5: %s, ", str, this.F1);
        }
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView2 = this.C1;
        java.lang.String str2 = this.F1;
        java.lang.String str3 = this.G1;
        profileEditPhoneNumberView2.f189804e = str2;
        profileEditPhoneNumberView2.f189805f = str3;
        boolean z19 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            i17 = 0;
        } else {
            profileEditPhoneNumberView2.b(profileEditPhoneNumberView2.f189804e, true, false);
            i17 = 1;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(profileEditPhoneNumberView2.f189805f)) {
            java.lang.String[] c17 = com.tencent.mm.contact.a.c(profileEditPhoneNumberView2.f189812d, profileEditPhoneNumberView2.f189805f);
            profileEditPhoneNumberView2.f189806g = c17;
            if (c17 != null) {
                int i27 = i17;
                while (true) {
                    java.lang.String[] strArr = profileEditPhoneNumberView2.f189806g;
                    if (i27 >= strArr.length + i17) {
                        break;
                    }
                    profileEditPhoneNumberView2.b(strArr[i27 - i17].trim(), false, false);
                    i27++;
                }
                i17 = i27;
            }
        }
        if (i17 < 5) {
            profileEditPhoneNumberView2.g();
        } else {
            profileEditPhoneNumberView2.d();
        }
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView3 = this.C1;
        profileEditPhoneNumberView3.f189809m = new com.tencent.mm.ui.contact.p2(this);
        if (profileEditPhoneNumberView3.f()) {
            android.view.View view = this.E1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.E1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.U = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cd8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cd6);
        this.T = textView;
        textView.setVisibility(0);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a4u);
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_arrow, i65.a.d(getContext(), com.tencent.mm.R.color.BW_70)));
        }
        this.U.setOnClickListener(this.S);
        setMMTitle("");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f206395z)) {
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = this.f206369d;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String f27 = this.f206384s.f2();
            if (f27 == null) {
                f27 = "";
            }
            float textSize = this.f206369d.getTextSize();
            ((ke0.e) xVar).getClass();
            mMLimitedClearEditText.setHint(com.tencent.mm.pluginsdk.ui.span.c0.j(this, f27, textSize));
            if (com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p()) {
                this.f206369d.setHintToText(false);
                this.f206369d.setHint(getString(com.tencent.mm.R.string.f492551gy1));
            }
        } else {
            com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = this.f206369d;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str4 = this.f206395z;
            if (str4 == null) {
                str4 = "";
            }
            float textSize2 = this.f206369d.getTextSize();
            ((ke0.e) xVar2).getClass();
            mMLimitedClearEditText2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str4, textSize2));
        }
        if (this.f206369d.getText() != null) {
            this.A = this.f206369d.getText().toString();
        }
        this.B = this.f206395z;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText3 = this.f206369d;
        mMLimitedClearEditText3.setSelection(mMLimitedClearEditText3.getText().length());
        this.f206369d.b(this.M1);
        this.f206369d.setOnFocusChangeListener(new com.tencent.mm.ui.contact.q2(this));
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str5 = this.C;
        if (str5 == null) {
            str5 = "";
        }
        float textSize3 = this.f206370e.getTextSize();
        ((ke0.e) xVar3).getClass();
        this.f206370e.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str5, textSize3));
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText4 = this.f206370e;
        mMLimitedClearEditText4.setSelection(mMLimitedClearEditText4.getText().length());
        this.f206370e.b(this.N1);
        int i28 = 0;
        while (true) {
            arrayList = this.G;
            if (i28 >= i19) {
                break;
            }
            if (i28 < this.f206388w && this.f206389x != null) {
                java.lang.String d17 = i21.q.h().d(this.f206385t, ((r45.c5) this.f206389x.get(i28)).f371292d);
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(d17);
                java.lang.String str6 = a17.f213279f;
                if (str6 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str6, z19, z19);
                    if (!str6.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? z19 : m17.f213266a.F(m17.f213267b)) {
                    arrayList.add(d17);
                    java.util.ArrayList arrayList4 = this.f206368J;
                    if (i28 < arrayList4.size()) {
                        ((r45.ko5) arrayList4.get(i28)).set(2, d17);
                    }
                    if (i28 == 0 && ((r45.c5) this.f206389x.get(i28)).f371293e == null) {
                        this.E.add(d17);
                        this.f206392y.remove(i28);
                    }
                } else {
                    r45.c5 cdnInfo = (r45.c5) this.f206389x.get(i28);
                    com.tencent.mm.ui.contact.g2 g2Var = new com.tencent.mm.ui.contact.g2(this);
                    this.R1++;
                    java.lang.String username = this.f206385t;
                    kotlin.jvm.internal.o.g(username, "username");
                    kotlin.jvm.internal.o.g(cdnInfo, "cdnInfo");
                    com.tencent.mm.sdk.coroutines.LifecycleScope scope = this.Q;
                    kotlin.jvm.internal.o.g(scope, "scope");
                    v65.i.b(scope, null, new i21.e(username, cdnInfo, i28, g2Var, null), 1, null);
                }
            }
            i28++;
            i19 = 3;
            z19 = 0;
        }
        f7(arrayList, z19);
        this.f206376m.setOnClickListener(new com.tencent.mm.ui.contact.t2(this));
        this.f206377n.setOnClickListener(new com.tencent.mm.ui.contact.u2(this));
        this.f206378o.setOnClickListener(new com.tencent.mm.ui.contact.v2(this));
        this.f206376m.setOnLongClickListener(new com.tencent.mm.ui.contact.u1(this));
        this.f206377n.setOnLongClickListener(new com.tencent.mm.ui.contact.x1(this));
        this.f206378o.setOnLongClickListener(new com.tencent.mm.ui.contact.a2(this));
        this.f206373h.setOnClickListener(new com.tencent.mm.ui.contact.r2(this));
        if (com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p() || (h17 = m61.k.wi().h(this.f206384s.d1())) == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.h()) || h17.h().equals(this.f206369d.getText().toString())) {
            z17 = false;
        } else {
            this.f206379p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jpd);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485964jp5);
            this.f206382q = findViewById;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView2 = this.f206379p;
            java.lang.String string = getString(com.tencent.mm.R.string.bh7, h17.h());
            if (string == null) {
                string = "";
            }
            textView2.setText(string);
            com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(getString(com.tencent.mm.R.string.la6));
            f0Var.c(new com.tencent.mm.ui.contact.y2(this, h17.h()), 0, f0Var.length(), 17);
            this.f206379p.append(" ");
            this.f206379p.append(f0Var);
            this.f206379p.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            z17 = true;
        }
        if (!z17) {
            if (com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname.p() || this.f206386u != 14 || com.tencent.mm.sdk.platformtools.t8.K0(this.f206387v) || this.f206387v.equals(this.f206369d.getText().toString())) {
                z18 = false;
            } else {
                this.f206379p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jpd);
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f485964jp5);
                this.f206382q = findViewById2;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "iniChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI", "iniChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView3 = this.f206379p;
                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string2 = getString(com.tencent.mm.R.string.bh6, this.f206387v);
                java.lang.String str7 = string2 != null ? string2 : "";
                float textSize4 = this.f206379p.getTextSize();
                ((ke0.e) xVar4).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str7, textSize4));
                com.tencent.mm.pluginsdk.ui.span.f0 f0Var2 = new com.tencent.mm.pluginsdk.ui.span.f0(getString(com.tencent.mm.R.string.la6));
                f0Var2.c(new com.tencent.mm.ui.contact.y2(this, this.f206387v), 0, f0Var2.length(), 17);
                this.f206379p.append(" ");
                this.f206379p.append(f0Var2);
                this.f206379p.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                z18 = true;
            }
            if (!z18 && ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(2)) {
                final gc0.p2 p2Var = (gc0.p2) pf5.z.f353948a.a(this).a(gc0.p2.class);
                p2Var.V6(new gc0.b0(this.f206385t, this.f206384s.f2()), new yz5.a() { // from class: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$$h
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return com.tencent.mm.ui.contact.ContactRemarkInfoModUI.this.f206369d.getEditText();
                    }
                }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$$i
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return com.tencent.mm.ui.contact.ContactRemarkInfoModUI.this.C1.getPhoneNumberList();
                    }
                }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$$j
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(!com.tencent.mm.ui.contact.ContactRemarkInfoModUI.this.C1.f());
                    }
                }, new yz5.l() { // from class: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$$k
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        java.lang.String str8 = (java.lang.String) obj;
                        int i29 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.T1;
                        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.this;
                        contactRemarkInfoModUI.getClass();
                        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "onclick AddPhone");
                        if (!contactRemarkInfoModUI.C1.f()) {
                            return java.lang.Boolean.FALSE;
                        }
                        contactRemarkInfoModUI.C1.c(str8, false, false);
                        contactRemarkInfoModUI.Y6();
                        return java.lang.Boolean.TRUE;
                    }
                }, new yz5.l() { // from class: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$$l
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        r45.kl5 kl5Var = (r45.kl5) obj;
                        final com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.this;
                        if (!android.text.TextUtils.isEmpty(contactRemarkInfoModUI.L1)) {
                            return null;
                        }
                        java.lang.String talker = contactRemarkInfoModUI.f206385t;
                        android.widget.LinearLayout addImageView = contactRemarkInfoModUI.f206373h;
                        java.util.ArrayList remarkImgInfo = contactRemarkInfoModUI.f206368J;
                        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$$c
                            @Override // yz5.l
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                java.lang.String str8 = (java.lang.String) obj2;
                                com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI2 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.this;
                                java.util.ArrayList arrayList7 = contactRemarkInfoModUI2.D;
                                arrayList7.add(str8);
                                r45.ko5 ko5Var = new r45.ko5();
                                ko5Var.set(2, str8);
                                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                                ko5Var.set(3, bool);
                                contactRemarkInfoModUI2.f206368J.add(ko5Var);
                                java.util.ArrayList arrayList8 = contactRemarkInfoModUI2.G;
                                contactRemarkInfoModUI2.f7(arrayList7, (arrayList8 == null || arrayList8.isEmpty()) ? 0 : arrayList8.size());
                                contactRemarkInfoModUI2.Y6();
                                return bool;
                            }
                        };
                        gc0.p2 p2Var2 = p2Var;
                        p2Var2.getClass();
                        kotlin.jvm.internal.o.g(talker, "talker");
                        kotlin.jvm.internal.o.g(addImageView, "addImageView");
                        kotlin.jvm.internal.o.g(remarkImgInfo, "remarkImgInfo");
                        if (remarkImgInfo.size() >= 3) {
                            return null;
                        }
                        kotlinx.coroutines.l.d(v65.m.b(p2Var2.getActivity()), null, null, new gc0.m2(kl5Var, talker, p2Var2, remarkImgInfo, addImageView, lVar, null), 3, null);
                        return null;
                    }
                }, null);
            }
        }
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.ui.contact.s2(this), null, com.tencent.mm.ui.fb.GREEN);
        getController().x0(getString(com.tencent.mm.R.string.f490347sg), new java.lang.Runnable() { // from class: com.tencent.mm.ui.contact.ContactRemarkInfoModUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i29 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.T1;
                com.tencent.mm.ui.contact.ContactRemarkInfoModUI.this.d7();
            }
        });
        setBackBtnVisible(false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f206395z)) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
        if (!this.L) {
            com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "oncreate initWithViewMode");
        }
        Z6();
    }

    public final void j7() {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f206385t, true);
        this.f206384s = n17;
        this.V = n17.D0();
        this.X = ((b93.b) c93.a.a()).i(this.V);
        this.W.clear();
        java.util.List list = this.X;
        if (list != null) {
            this.W.addAll(list);
        } else {
            this.W = new java.util.ArrayList();
            this.X = new java.util.ArrayList();
        }
        java.util.List c17 = ((b93.b) c93.a.a()).c();
        if (c17 != null) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) c17;
                if (i17 >= arrayList.size()) {
                    break;
                }
                if (!this.W.contains(arrayList.get(i17))) {
                    this.W.add((java.lang.String) arrayList.get(i17));
                }
                i17++;
            }
        }
        java.util.List list2 = this.Y;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(this.X);
        java.util.Iterator it = this.X.iterator();
        while (it.hasNext()) {
            W6((java.lang.String) it.next());
        }
        this.f206393y0 = ((java.util.ArrayList) c17).size();
        this.f206375l1 = this.X.size();
        this.f206391x1.addAll(this.X);
        k7(this.X);
    }

    public final void k7(java.util.List list) {
        java.util.ArrayList arrayList = (java.util.ArrayList) ((j93.n) pf5.z.f353948a.a(this).a(j93.n.class)).W6(list);
        if (arrayList.isEmpty()) {
            this.T.setText("");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (i17 < arrayList.size()) {
            sb6.append((java.lang.String) arrayList.get(i17));
            sb6.append(i17 < arrayList.size() + (-1) ? "，" : "");
            i17++;
        }
        this.T.setText(sb6.toString());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.ArrayList arrayList = this.f206368J;
        java.util.ArrayList arrayList2 = this.G;
        java.util.ArrayList arrayList3 = this.D;
        int i19 = 0;
        if (i17 == 100) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            java.lang.String a76 = a7(b17, arrayList3.size());
            arrayList3.add(a76);
            r45.ko5 ko5Var = new r45.ko5();
            ko5Var.set(2, a76);
            ko5Var.set(3, java.lang.Boolean.TRUE);
            arrayList.add(ko5Var);
            if (arrayList2 != null && arrayList2.size() > 0) {
                i19 = arrayList2.size();
            }
            f7(arrayList3, i19);
            Y6();
            return;
        }
        if (i17 == 200) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MiroMsg.ContactRemarkInfoModUI", "data shouldnot be null");
                return;
            }
            java.util.Iterator<java.lang.String> it = intent.getStringArrayListExtra("CropImage_OutputPath_List").iterator();
            while (it.hasNext()) {
                java.lang.String a77 = a7(it.next(), arrayList3.size());
                arrayList3.add(a77);
                r45.ko5 ko5Var2 = new r45.ko5();
                ko5Var2.set(2, a77);
                ko5Var2.set(3, java.lang.Boolean.TRUE);
                arrayList.add(ko5Var2);
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                i19 = arrayList2.size();
            }
            f7(arrayList3, i19);
            Y6();
            return;
        }
        if (i17 == 400) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MiroMsg.ContactRemarkInfoModUI", "data shouldnot be null");
                return;
            }
            if (intent.getBooleanExtra("response_delete", false)) {
                this.N = true;
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("remark_image_path");
                if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                    this.I = 0;
                    this.f206376m.setVisibility(8);
                    this.f206377n.setVisibility(8);
                    this.f206378o.setVisibility(8);
                }
                f7(stringArrayListExtra, 0);
                java.util.LinkedList linkedList = this.f206392y;
                linkedList.clear();
                arrayList2.clear();
                arrayList3.clear();
                for (int i27 = 0; i27 < arrayList.size(); i27++) {
                    r45.ko5 ko5Var3 = (r45.ko5) arrayList.get(i27);
                    if (stringArrayListExtra.contains(ko5Var3.getString(2))) {
                        if (ko5Var3.getBoolean(3) || com.tencent.mm.sdk.platformtools.t8.K0(ko5Var3.getString(1))) {
                            arrayList3.add(ko5Var3.getString(2));
                        } else {
                            arrayList2.add(ko5Var3.getString(2));
                            r45.fu fuVar = new r45.fu();
                            fuVar.set(0, ko5Var3.getString(0));
                            fuVar.set(1, ko5Var3.getString(1));
                            linkedList.add(fuVar);
                        }
                    }
                }
                Y6();
                return;
            }
            return;
        }
        if (i17 != 600) {
            return;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.ContactRemarkInfoModUI", "data shouldnot be null");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("result_label_id_list");
        ((j93.n) pf5.z.f353948a.a(this).a(j93.n.class)).O6(stringArrayListExtra2, intent.getIntExtra("recommend_label_adopt_count", 0));
        java.util.List c17 = ((b93.b) c93.a.a()).c();
        java.util.List list = this.Y;
        if (X6(stringArrayListExtra2, list) || X6(c17, this.W)) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_new_list");
            if (stringArrayListExtra3 != null) {
                this.f206394y1.addAll(stringArrayListExtra3);
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_search_label_add_list");
            if (stringArrayListExtra4 != null) {
                this.f206396z1.addAll(stringArrayListExtra4);
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_add_list");
            if (stringArrayListExtra5 != null) {
                this.B1.addAll(stringArrayListExtra5);
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra6 = intent.getStringArrayListExtra("contact_select_label_new_list");
            if (stringArrayListExtra6 != null) {
                this.A1.addAll(stringArrayListExtra6);
            }
            java.util.Iterator<java.lang.String> it6 = stringArrayListExtra2.iterator();
            while (it6.hasNext()) {
                java.lang.String next = it6.next();
                if (!((java.util.ArrayList) list).contains(next)) {
                    W6(next);
                }
            }
            java.util.Iterator it7 = ((java.util.ArrayList) list).iterator();
            while (it7.hasNext()) {
                java.lang.String str = (java.lang.String) it7.next();
                if (!stringArrayListExtra2.contains(str)) {
                    java.util.List list2 = this.X;
                    if (list2 != null && list2.contains(str)) {
                        this.Z.add(str);
                    }
                    java.util.HashSet hashSet = this.f206380p0;
                    if (hashSet != null && hashSet.contains(str)) {
                        hashSet.remove(str);
                    }
                }
            }
            if (this.W == null) {
                this.W = new java.util.ArrayList();
            }
            this.W = c17;
            java.util.Iterator<java.lang.String> it8 = stringArrayListExtra2.iterator();
            while (it8.hasNext()) {
                java.lang.String next2 = it8.next();
                if (this.W.contains(next2)) {
                    this.W.remove(next2);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.addAll(this.W);
            this.W.clear();
            this.W.addAll(stringArrayListExtra2);
            this.W.addAll(arrayList4);
            ((java.util.ArrayList) list).clear();
            ((java.util.ArrayList) list).addAll(stringArrayListExtra2);
            k7(list);
            if (i7(true) || g7() || h7() || intent.getBooleanExtra("hasLableChange", false)) {
                enableOptionMenu(true);
            } else {
                enableOptionMenu(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a9  */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.ContactRemarkInfoModUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(638, this);
        c01.d9.e().q(575, this);
        c01.d9.e().q(576, this);
        this.f206369d.e(this.M1);
        this.f206370e.e(this.N1);
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.Q;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope2 = this.R;
        if (lifecycleScope2 != null) {
            lifecycleScope2.onDestroy();
        }
        i21.p.f287912b = null;
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        d7();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(kd1.c.CTRL_INDEX, this);
        ((l75.a1) c01.d9.b().q()).e(this.P1);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(kd1.c.CTRL_INDEX, this);
        ((l75.a1) c01.d9.b().q()).a(this.P1);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MiroMsg.ContactRemarkInfoModUI", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f206383r;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f206383r = null;
        }
        android.app.ProgressDialog progressDialog2 = this.f206371f;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.f206371f.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.s(this, getString(com.tencent.mm.R.string.f490390tn), null);
            return;
        }
        if (m1Var.getType() == 575) {
            if ((i17 == 0 || i18 == 0) && (arrayList = this.D) != null && arrayList.size() != 0) {
                java.util.ArrayList arrayList2 = this.G;
                int size = (arrayList2 == null || arrayList2.size() <= 0) ? 0 : arrayList2.size();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.lang.String d17 = i21.q.h().d(this.f206385t, ((r45.fu) this.f206392y.get(size)).getString(0));
                    com.tencent.mm.vfs.w6.c(str2, d17);
                    arrayList2.add(d17);
                    size++;
                }
            }
            finish();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(la5.x.class);
        hashSet.add(gc0.p2.class);
        hashSet.add(vf5.j.class);
        hashSet.add(j93.n.class);
        hashSet.add(hr3.w1.class);
        hashSet.add(gc0.b.class);
    }
}
