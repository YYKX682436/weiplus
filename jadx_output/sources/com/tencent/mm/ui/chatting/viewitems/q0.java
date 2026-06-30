package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class q0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f205289d;

    /* renamed from: e, reason: collision with root package name */
    public final db5.n4 f205290e;

    /* renamed from: g, reason: collision with root package name */
    public rl5.r f205292g;

    /* renamed from: h, reason: collision with root package name */
    public wl5.v f205293h;

    /* renamed from: i, reason: collision with root package name */
    public wl5.v f205294i;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Object f205302t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f205304v;

    /* renamed from: m, reason: collision with root package name */
    public int f205295m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f205296n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f205297o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long f205298p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f205299q = false;

    /* renamed from: r, reason: collision with root package name */
    public final yn.l f205300r = new com.tencent.mm.ui.chatting.viewitems.l0(this);

    /* renamed from: s, reason: collision with root package name */
    public long f205301s = 0;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.PopupWindow.OnDismissListener f205303u = new com.tencent.mm.ui.chatting.viewitems.o0(this);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.p0 f205291f = new com.tencent.mm.ui.chatting.viewitems.p0(this);

    public q0(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar) {
        this.f205304v = a0Var;
        this.f205289d = dVar;
        this.f205290e = new com.tencent.mm.ui.chatting.viewitems.m0(this, a0Var, dVar);
    }

    public static void a(com.tencent.mm.ui.chatting.viewitems.q0 q0Var, db5.g4 g4Var, com.tencent.mm.storage.f9 f9Var, int i17) {
        android.view.MenuItem menuItem;
        ot0.q v17;
        q0Var.getClass();
        if (g4Var instanceof db5.g4) {
            boolean n27 = f9Var.n2();
            yb5.d dVar = q0Var.f205289d;
            if (n27 && (v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()))) != null && ez.v0.f257777a.k(java.lang.Integer.valueOf(v17.f348666i))) {
                return;
            }
            boolean z17 = (g4Var.findItem(116) == null && g4Var.findItem(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER) == null) ? false : true;
            boolean z18 = g4Var.findItem(134) != null;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = (java.util.ArrayList) g4Var.f228344d;
            java.util.Iterator it = arrayList.iterator();
            if (!z17 && !z18) {
                int y17 = g4Var.y(100);
                if (g4Var.size() != 1 || y17 == -1) {
                    g4Var.c(i17, 136, 0, dVar.g().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
                    return;
                } else {
                    g4Var.c(i17, 136, 0, dVar.g().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
                    g4Var.v((android.view.MenuItem) arrayList.remove(y17));
                    return;
                }
            }
            if (f9Var.J2() && (com.tencent.mm.storage.z3.m4(dVar.x()) || com.tencent.mm.storage.z3.p4(dVar.x()))) {
                g4Var.c(i17, 136, 0, dVar.g().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
                return;
            }
            if (f9Var.g3() && g4Var.findItem(165) != null) {
                int y18 = g4Var.y(121);
                g4Var.c(i17, 136, 0, dVar.g().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
                if (y18 < 0 || (menuItem = (android.view.MenuItem) arrayList.remove(g4Var.y(136))) == null) {
                    return;
                }
                arrayList.add(java.lang.Math.min(y18 + 1, arrayList.size() - 1), menuItem);
                return;
            }
            while (it.hasNext()) {
                android.view.MenuItem menuItem2 = (android.view.MenuItem) it.next();
                if (menuItem2.getItemId() == 116 && f9Var.getType() != 3) {
                    db5.h4 h4Var = new db5.h4(dVar.g(), 136, i17);
                    h4Var.f228368i = dVar.s().getString(com.tencent.mm.R.string.b3v);
                    h4Var.setIcon(com.tencent.mm.R.raw.icons_filled_quote);
                    linkedList.add(menuItem2);
                    linkedList.add(h4Var);
                } else if ((!z17 || f9Var.getType() == 3) && menuItem2.getItemId() == 134) {
                    db5.h4 h4Var2 = new db5.h4(dVar.g(), 136, i17);
                    h4Var2.f228368i = dVar.s().getString(com.tencent.mm.R.string.b3v);
                    h4Var2.setIcon(com.tencent.mm.R.raw.icons_filled_quote);
                    linkedList.add(h4Var2);
                    linkedList.add(menuItem2);
                } else {
                    linkedList.add(menuItem2);
                }
            }
            arrayList.clear();
            arrayList.addAll(linkedList);
            linkedList.clear();
        }
    }

    public static void b(com.tencent.mm.ui.chatting.viewitems.q0 q0Var, db5.g4 g4Var, com.tencent.mm.storage.f9 f9Var, int i17) {
        q0Var.getClass();
        if (g4Var instanceof db5.g4) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = (java.util.ArrayList) g4Var.f228344d;
            java.util.Iterator it = arrayList.iterator();
            int size = arrayList.size();
            yb5.d dVar = q0Var.f205289d;
            if (size <= 3) {
                g4Var.c(i17, 100, 0, dVar.g().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
                return;
            }
            int i18 = 0;
            while (it.hasNext()) {
                android.view.MenuItem menuItem = (android.view.MenuItem) it.next();
                if (i18 == 3) {
                    db5.h4 h4Var = new db5.h4(dVar.g(), 100, i17);
                    h4Var.f228368i = dVar.s().getString(com.tencent.mm.R.string.b3p);
                    h4Var.setIcon(com.tencent.mm.R.raw.icons_filled_delete);
                    linkedList.add(h4Var);
                    linkedList.add(menuItem);
                } else {
                    linkedList.add(menuItem);
                }
                i18++;
            }
            arrayList.clear();
            arrayList.addAll(linkedList);
            linkedList.clear();
        }
    }

    public static void c(com.tencent.mm.ui.chatting.viewitems.q0 q0Var, db5.g4 g4Var, android.view.MenuItem menuItem, wj.t0 t0Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str, boolean z17) {
        java.lang.String str2;
        gm0.b bVar;
        q0Var.getClass();
        ct.k3 k3Var = (ct.k3) i95.n0.c(ct.k3.class);
        xj.m Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(t0Var);
        ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
        g4Var.removeItem(menuItem.getItemId());
        if (Ui != null) {
            ((java.util.ArrayList) g4Var.f228344d).add(menuItem);
        }
        boolean z18 = Ui != null;
        q0Var.f205299q = z18;
        if (z18) {
            java.lang.String aid = Ui.f454753a;
            qg5.z2 z2Var = (qg5.z2) j3Var;
            z2Var.getClass();
            kotlin.jvm.internal.o.g(aid, "aid");
            z2Var.f363276r = aid;
            qg5.e3 e3Var = (qg5.e3) k3Var;
            e3Var.getClass();
            gm0.m b17 = gm0.j1.b();
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = (b17 == null || (bVar = b17.f273245h) == null) ? null : bVar.f273145e;
            if (lifecycleScope != null) {
                v65.i.b(lifecycleScope, null, new qg5.d3(e3Var, null), 1, null);
            }
        }
        if (z17) {
            qg5.e3 e3Var2 = (qg5.e3) k3Var;
            e3Var2.getClass();
            if (f9Var != null) {
                if (str == null || str.length() == 0) {
                    return;
                }
                v05.b Zi = e3Var2.Zi(f9Var);
                int i17 = Zi.f368365d;
                ((cy1.a) e3Var2.ij()).Hj("yuanbao_menu_sum_btn", "view_exp", kz5.c1.m(e3Var2.mj(str, null), kz5.c1.k(new jz5.l("share_type", 9), new jz5.l("article_url", java.net.URLEncoder.encode(Zi.getString(i17 + 9), com.tencent.mapsdk.internal.rv.f51270c)), new jz5.l("yuanbao_landing_type", 2), new jz5.l("account_article_title", Zi.getString(i17 + 2)))), 35480);
                return;
            }
            return;
        }
        qg5.e3 e3Var3 = (qg5.e3) k3Var;
        e3Var3.getClass();
        if (f9Var != null) {
            if (str == null || str.length() == 0) {
                return;
            }
            v05.b Zi2 = e3Var3.Zi(f9Var);
            v05.a aVar = (v05.a) Zi2.getCustom(Zi2.f432315e + 8);
            if (aVar == null || (str2 = aVar.r()) == null) {
                str2 = "";
            }
            ((cy1.a) e3Var3.ij()).Hj("yuanbao_menu_sum_btn", "view_exp", kz5.c1.m(e3Var3.mj(str, null), kz5.c1.k(new jz5.l("share_type", 10), new jz5.l("file_extension", str2), new jz5.l("yuanbao_landing_type", 2), new jz5.l("is_file_download", java.lang.Integer.valueOf(e3Var3.cj(f9Var, Zi2))), new jz5.l("file_source", java.lang.Integer.valueOf(e3Var3.bj(Zi2))))), 35480);
        }
    }

    public static void d(com.tencent.mm.ui.chatting.viewitems.q0 q0Var, db5.g4 g4Var, com.tencent.mm.storage.f9 f9Var, int i17, boolean z17) {
        ot0.q v17;
        int i18;
        yb5.d dVar = q0Var.f205289d;
        if (com.tencent.mm.storage.z3.z3(dVar.x()) || f9Var.t2() || com.tencent.mm.storage.z3.p4(dVar.x()) || f9Var.P0() == 5) {
            return;
        }
        if (f9Var.P0() == 1 || !(g4Var instanceof db5.g4) || f9Var.getType() == 318767153) {
            return;
        }
        if (f9Var.getType() == 49 && ((v17 = ot0.q.v(f9Var.U1())) == null || ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i)) || (i18 = v17.f348666i) == 38 || i18 == 39)) {
            return;
        }
        boolean z18 = (g4Var.findItem(116) == null && g4Var.findItem(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER) == null) ? false : true;
        boolean z19 = g4Var.findItem(100) != null;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = (java.util.ArrayList) g4Var.f228344d;
        java.util.Iterator it = arrayList.iterator();
        if ((!z18 && !z19) || ((f9Var.getType() == 34 && !z17) || f9Var.getType() == 3)) {
            g4Var.c(i17, 134, 0, dVar.g().getString(com.tencent.mm.R.string.b4c), com.tencent.mm.R.raw.icons_filled_bell_ring_on);
            return;
        }
        while (it.hasNext()) {
            android.view.MenuItem menuItem = (android.view.MenuItem) it.next();
            if (menuItem.getItemId() == 116) {
                db5.h4 h4Var = new db5.h4(dVar.g(), 134, i17);
                h4Var.f228368i = dVar.s().getString(com.tencent.mm.R.string.b4c);
                h4Var.setIcon(com.tencent.mm.R.raw.icons_filled_bell_ring_on);
                linkedList.add(menuItem);
                linkedList.add(h4Var);
            } else if (z19 && !z18 && menuItem.getItemId() == 100) {
                db5.h4 h4Var2 = new db5.h4(dVar.g(), 134, i17);
                h4Var2.f228368i = dVar.s().getString(com.tencent.mm.R.string.b4c);
                h4Var2.setIcon(com.tencent.mm.R.raw.icons_filled_bell_ring_on);
                linkedList.add(h4Var2);
                linkedList.add(menuItem);
            } else {
                linkedList.add(menuItem);
            }
        }
        arrayList.clear();
        arrayList.addAll(linkedList);
        linkedList.clear();
    }

    public static void e(com.tencent.mm.ui.chatting.viewitems.q0 q0Var, db5.g4 g4Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        jz5.l c17;
        com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel;
        java.lang.Object obj;
        com.tencent.mm.plugin.appbrand.service.k5 k5Var;
        q0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItem", "reportOpenMenuVisible: ");
        if (g4Var.findItem(171) == null || (c17 = db0.g.f227828a.c(f9Var, true)) == null || (materialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) c17.f302833d) == null || (obj = c17.f302834e) == null || (k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class)) == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection Ri = ((zh1.p) k5Var).Ri(materialModel);
        bi1.g gVar = (bi1.g) obj;
        gVar.toString();
        di1.f a17 = di1.g.a(3L, gVar, Ri);
        a17.d();
        if (erVar.f203904J == null) {
            erVar.f203904J = new android.os.Bundle();
        }
        erVar.f203904J.putString("key_session_id", a17.f232640l);
        erVar.f203904J.putLong("key_scene_type", a17.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r6.field_status == 199) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(com.tencent.mm.ui.chatting.viewitems.q0 r6, com.tencent.mm.storage.f9 r7) {
        /*
            yb5.d r6 = r6.f205289d
            com.tencent.mm.storage.z3 r6 = r6.u()
            boolean r6 = r6.k2()
            r0 = 0
            if (r6 != 0) goto Lc6
            long r1 = r7.I0()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto Lc6
            int r6 = ti3.i.f419588a
            int r6 = r7.getType()
            r1 = 1
            switch(r6) {
                case -2130706383: goto L90;
                case -2113929167: goto L90;
                case 1: goto L9b;
                case 3: goto L9b;
                case 11: goto L9b;
                case 13: goto L9b;
                case 21: goto L9b;
                case 23: goto L9b;
                case 31: goto L9b;
                case 33: goto L9b;
                case 34: goto L9b;
                case 36: goto L9b;
                case 39: goto L9b;
                case 42: goto L9b;
                case 43: goto L9b;
                case 44: goto L9b;
                case 47: goto L9b;
                case 48: goto L9b;
                case 49: goto L74;
                case 50: goto L6a;
                case 62: goto L9b;
                case 66: goto L9b;
                case 1048625: goto L9b;
                case 16777265: goto L9b;
                case 268435505: goto L9b;
                case 301989937: goto L9b;
                case 419430449: goto L9b;
                case 436207665: goto L9b;
                case 754974769: goto L9b;
                case 771751985: goto L9b;
                case 805306417: goto L9b;
                case 822083633: goto L9b;
                case 855638065: goto L9b;
                case 939524145: goto L9b;
                case 973078577: goto L9b;
                case 974127153: goto L9b;
                case 975175729: goto L9b;
                case 976224305: goto L9b;
                case 978321457: goto L9b;
                case 979370033: goto L9b;
                case 1040187441: goto L9b;
                case 1090519089: goto L23;
                case 1107296305: goto L9b;
                case 1157627953: goto L9b;
                case 1174405169: goto L9b;
                case 1224736817: goto L9b;
                case 1241514033: goto L9b;
                case 1409286193: goto L9b;
                case 1426063409: goto L9b;
                case 1442840625: goto L9b;
                case 1476395057: goto L9b;
                default: goto L21;
            }
        L21:
            goto L9d
        L23:
            int r6 = r7.Z1()
            if (r6 == 0) goto L2b
            goto L9b
        L2b:
            java.lang.Class<lt.q0> r6 = lt.q0.class
            i95.m r6 = i95.n0.c(r6)
            lt.q0 r6 = (lt.q0) r6
            kt.q0 r6 = (kt.q0) r6
            lt.g0 r6 = r6.wi()
            long r2 = r7.getMsgId()
            java.lang.String r4 = r7.Q0()
            com.tencent.mm.pluginsdk.model.app.e r6 = (com.tencent.mm.pluginsdk.model.app.e) r6
            com.tencent.mm.pluginsdk.model.app.d r6 = r6.J0(r2, r4)
            if (r6 == 0) goto L52
            long r2 = r6.field_status
            r4 = 199(0xc7, double:9.83E-322)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L9d
            goto L9b
        L52:
            java.lang.Class<ct.w2> r6 = ct.w2.class
            i95.m r6 = i95.n0.c(r6)
            ct.w2 r6 = (ct.w2) r6
            com.tencent.mm.pluginsdk.model.app.d3 r6 = (com.tencent.mm.pluginsdk.model.app.d3) r6
            r6.getClass()
            ez.v0 r6 = ez.v0.f257777a
            java.lang.String r2 = r7.j()
            boolean r6 = r6.d(r2)
            goto L9e
        L6a:
            java.lang.String r6 = r7.j()
            boolean r6 = ip.l.f(r6)
            r6 = r6 ^ r1
            goto L9e
        L74:
            java.lang.String r6 = r7.j()
            ot0.q r6 = ot0.q.v(r6)
            if (r6 == 0) goto L9d
            int r6 = r6.f348666i
            r2 = 3
            if (r6 == r2) goto L9b
            r2 = 4
            if (r6 == r2) goto L9b
            r2 = 5
            if (r6 == r2) goto L9b
            r2 = 6
            if (r6 == r2) goto L9b
            switch(r6) {
                case 1: goto L9b;
                case 19: goto L9b;
                case 24: goto L9b;
                case 33: goto L9b;
                case 36: goto L9b;
                case 44: goto L9b;
                case 48: goto L9b;
                case 53: goto L9b;
                case 68: goto L9b;
                case 130: goto L9b;
                case 132: goto L9b;
                default: goto L8f;
            }
        L8f:
            goto L9d
        L90:
            java.lang.Class<c00.e3> r6 = c00.e3.class
            i95.m r6 = i95.n0.c(r6)
            c00.e3 r6 = (c00.e3) r6
            r6.getClass()
        L9b:
            r6 = r1
            goto L9e
        L9d:
            r6 = r0
        L9e:
            if (r6 == 0) goto Lc6
            int r6 = r7.getType()
            r2 = 47
            if (r6 != r2) goto Lc5
            java.lang.Class<k12.s> r6 = k12.s.class
            i95.m r6 = i95.n0.c(r6)
            k12.s r6 = (k12.s) r6
            g30.h r6 = (g30.h) r6
            s25.a r6 = r6.wi()
            y12.h r6 = (y12.h) r6
            com.tencent.mm.storage.emotion.EmojiInfo r6 = r6.M(r7)
            if (r6 == 0) goto Lc5
            boolean r6 = r6.I1()
            if (r6 == 0) goto Lc5
            goto Lc6
        Lc5:
            r0 = r1
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.q0.f(com.tencent.mm.ui.chatting.viewitems.q0, com.tencent.mm.storage.f9):boolean");
    }

    public void g(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItem", "open menu but tag is null");
            return;
        }
        this.f205291f.f205225d = erVar;
        rl5.r rVar = this.f205292g;
        if (rVar != null) {
            rVar.a();
            this.f205292g = null;
        }
        yb5.d dVar = this.f205289d;
        rl5.r rVar2 = new rl5.r(dVar.g());
        this.f205292g = rVar2;
        rVar2.C = true;
        rVar2.I = true;
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.nwp);
        this.f205302t = tag;
        if ((tag instanceof java.lang.Boolean) && ((java.lang.Boolean) tag).booleanValue()) {
            if (la5.b.f317600a.g(true)) {
                rl5.r rVar3 = this.f205292g;
                rVar3.Z = true;
                rVar3.Q = true;
            } else {
                rl5.r rVar4 = this.f205292g;
                rVar4.Z = false;
                rVar4.Q = false;
            }
            this.f205292g.f397346p0 = true;
        }
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f205303u;
        if (onDismissListener instanceof com.tencent.mm.ui.chatting.viewitems.o0) {
            ((com.tencent.mm.ui.chatting.viewitems.o0) onDismissListener).f204956d = erVar;
        }
        this.f205292g.L = onDismissListener;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItem", "openContextMenu[%s] left:%s, top:%s, width:%s, height:%s", com.tencent.mm.accessibility.uitl.IdUtil.INSTANCE.getName(view.getId()) + "@" + view.hashCode(), java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(view.getWidth()), java.lang.Integer.valueOf(view.getHeight()));
        com.tencent.mm.storage.f9 c17 = erVar.c();
        if (c17.T2() || c17.q2() || c17.b3()) {
            java.lang.String j17 = com.tencent.mm.storage.z3.R4(c17.Q0()) ? c17.A0() == 1 ? c17.j() : c01.w9.r(c17.j()) : c17.j();
            if (c17.q2() || c17.T2()) {
                ot0.q v17 = ot0.q.v(j17);
                j17 = v17 != null ? v17.f348654f : "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                return;
            }
            rq1.k0 Bi = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Bi(j17);
            java.lang.String str = Bi != null ? Bi.f398751a : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f205292g.Y = null;
            } else {
                rl5.r rVar5 = this.f205292g;
                com.tencent.mm.ui.chatting.viewitems.a0 a0Var = this.f205304v;
                a0Var.getClass();
                rVar5.Y = new com.tencent.mm.ui.chatting.viewitems.b0(a0Var, dVar, str);
            }
            this.f205304v.E(this.f205289d, c17, 1, !com.tencent.mm.sdk.platformtools.t8.K0(str), j17, false, "65_" + c01.id.c(), 3, Bi);
        }
        int width = iArr[0] + ((int) (view.getWidth() / 2.0f));
        int i17 = iArr[1];
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItem", "openContextMenu posX:%s, posY:%s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(i17));
        rl5.r rVar6 = this.f205292g;
        rVar6.f397352v = new com.tencent.mm.ui.chatting.viewitems.n0(this, c17);
        rVar6.f(view, this.f205290e, this.f205291f, width, i17);
        dVar.P(false);
        dVar.V(false);
        dVar.f460728w = false;
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(4);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItem$LongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        g(view);
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItem$LongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
