package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class k1 extends db5.p8 {
    public static boolean B = false;
    public static long C = -1;
    public static boolean D;
    public static final java.util.HashMap E = new java.util.HashMap();
    public static final java.util.Set F = new java.util.HashSet();
    public final java.util.Map A;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201092g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.d2 f201093h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f201094i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f201096n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.t2 f201097o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.j1 f201098p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.t4 f201099q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.g2 f201100r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f201101s;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f201103u;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.q3 f201105w;

    /* renamed from: x, reason: collision with root package name */
    public final vh5.s f201106x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f201107y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct f201108z;

    /* renamed from: m, reason: collision with root package name */
    public boolean f201095m = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f201102t = false;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f201104v = true;

    public k1(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, long j17, java.lang.String str, boolean z17, long j18, boolean z18, java.lang.String str2, java.lang.Boolean bool, int i17, com.tencent.mm.ui.chatting.gallery.q3 q3Var) {
        this.f201096n = false;
        this.f201101s = false;
        this.f201103u = null;
        wh5.f fVar = wh5.f.f446052a;
        this.f201106x = new vh5.s(fVar.a());
        this.f201107y = true;
        new java.util.ArrayList();
        this.f201108z = null;
        this.A = new java.util.HashMap();
        this.f201105w = q3Var;
        boolean booleanExtra = imageGalleryUI.getIntent().getBooleanExtra("img_gallery_is_mp_video_without_msg", false);
        this.f201101s = booleanExtra;
        if (!booleanExtra) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.ImageGalleryAdapter, invalid argument, context = ");
            sb6.append(imageGalleryUI);
            sb6.append(", currentMsgId = ");
            sb6.append(j17);
            sb6.append(", talker = ");
            sb6.append(str);
            sb6.append(", stack = ");
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            iz5.a.g(sb6.toString(), j17 > 0 && str != null && str.length() > 0);
        }
        this.f201092g = imageGalleryUI;
        D = z17;
        C = j18;
        this.f201103u = str;
        com.tencent.mm.ui.chatting.gallery.d2 d2Var = new com.tencent.mm.ui.chatting.gallery.d2(j17, str, this, bool, i17);
        this.f201093h = d2Var;
        this.f201096n = z18;
        this.f201094i = str2;
        this.f201097o = new com.tencent.mm.ui.chatting.gallery.t2(this, new int[(d2Var.f200852c - d2Var.f200854e) + com.tencent.mm.ui.chatting.gallery.d2.f200849o + 1]);
        this.f201098p = new com.tencent.mm.ui.chatting.gallery.ja(this);
        this.f201099q = new com.tencent.mm.ui.chatting.gallery.t4(this);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigMediaGalleryDebug()) == 1) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - wh5.f.f446053b >= 300000) {
                wh5.f.f446053b = currentTimeMillis;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("live实验: ");
                sb7.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigC2CLiveImageSend()) == 1);
                sb7.append(" 设备支持情况: ");
                ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                sb7.append(qp.b.f365678e);
                dp.a.makeText(context, sb7.toString(), 1).show();
            }
        }
        B = fVar.a();
    }

    public static com.tencent.mm.ui.chatting.gallery.f2 B(com.tencent.mm.storage.f9 f9Var) {
        if (K(f9Var)) {
            return com.tencent.mm.ui.chatting.gallery.f2.liveImage;
        }
        if (G(f9Var)) {
            return com.tencent.mm.ui.chatting.gallery.f2.appimage;
        }
        if (L(f9Var)) {
            return com.tencent.mm.ui.chatting.gallery.f2.image;
        }
        if (E(f9Var)) {
            return com.tencent.mm.ui.chatting.gallery.f2.sight;
        }
        boolean N = N(f9Var);
        com.tencent.mm.ui.chatting.gallery.f2 f2Var = com.tencent.mm.ui.chatting.gallery.f2.video;
        return (N || M(f9Var)) ? f2Var : com.tencent.mm.ui.chatting.gallery.f2.unkown;
    }

    public static boolean E(com.tencent.mm.storage.f9 f9Var) {
        r45.uf6 uf6Var;
        if (f9Var == null || f9Var.M2()) {
            return false;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 != null && (uf6Var = h17.E) != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(uf6Var.f387333d)) {
                return true;
            }
            r45.uf6 uf6Var2 = h17.E;
            if (uf6Var2.f387334e > 0 || !com.tencent.mm.sdk.platformtools.t8.K0(uf6Var2.f387335f) || !com.tencent.mm.sdk.platformtools.t8.K0(h17.E.f387336g) || !com.tencent.mm.sdk.platformtools.t8.K0(h17.E.f387337h) || !com.tencent.mm.sdk.platformtools.t8.K0(h17.E.f387338i) || !com.tencent.mm.sdk.platformtools.t8.K0(h17.E.f387339m) || !com.tencent.mm.sdk.platformtools.t8.K0(h17.E.f387340n)) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(com.tencent.mm.storage.f9 f9Var) {
        return f9Var != null && f9Var.getType() == 49;
    }

    public static boolean G(com.tencent.mm.storage.f9 f9Var) {
        return f9Var != null && f9Var.getType() == 268435505;
    }

    public static boolean J(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        return f9Var.getType() == 3 || f9Var.getType() == 39 || f9Var.getType() == 13;
    }

    public static boolean K(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || !B) {
            return false;
        }
        if (!(f9Var.getType() == 3 || f9Var.getType() == 39 || f9Var.getType() == 13) || wh5.f.f446052a.b(f9Var)) {
            return false;
        }
        long msgId = f9Var.getMsgId();
        java.util.HashMap hashMap = E;
        if (hashMap.containsKey(java.lang.Long.valueOf(msgId))) {
            return java.lang.Boolean.TRUE.equals(hashMap.get(java.lang.Long.valueOf(msgId)));
        }
        j15.d dVar = new j15.d();
        java.lang.String j17 = f9Var.j();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (j17 == null) {
            j17 = "";
        }
        dVar.fromXml(j17);
        boolean b17 = xs.l1.b(dVar, f9Var.A0() == 1);
        hashMap.put(java.lang.Long.valueOf(msgId), java.lang.Boolean.valueOf(b17));
        return b17;
    }

    public static boolean L(com.tencent.mm.storage.f9 f9Var) {
        if (K(f9Var)) {
            return false;
        }
        return J(f9Var);
    }

    public static boolean M(com.tencent.mm.storage.f9 f9Var) {
        return f9Var != null && f9Var.getType() == 62;
    }

    public static boolean N(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || E(f9Var)) {
            return false;
        }
        return f9Var.getType() == 43 || f9Var.getType() == 486539313 || f9Var.getType() == 44 || f9Var.getType() == 62;
    }

    public static void Q(java.lang.String str, android.net.Uri uri, com.tencent.mm.storage.f9 f9Var) {
        int intValue = ((java.lang.Integer) ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(f9Var).f302833d).intValue();
        if (intValue != 3 && intValue != 2) {
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f279671d;
            ((g90.u) wVar).Ui(f9Var, 4, str, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryAdapter", "insert DeviceFileExtInfo, %s, %s, %s", java.lang.Long.valueOf(f9Var.getMsgId()), f9Var.Q0(), str);
        h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr2 = h90.a.f279671d;
        ((g90.u) wVar2).Ui(f9Var, 1, str, null);
        if (uri != null) {
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).aj(f9Var.Q0(), f9Var.getMsgId(), android.content.ContentUris.parseId(uri), 1);
        }
    }

    public static void i(android.content.Context context, java.util.List list) {
        if (context == null || list == null || list.size() <= 0) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.tencent.mm.ui.chatting.gallery.s1 s1Var = new com.tencent.mm.ui.chatting.gallery.s1(list, context);
        com.tencent.mm.ui.chatting.gallery.t1 t1Var = new com.tencent.mm.ui.chatting.gallery.t1(context);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.h(context, s1Var, t1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0163, code lost:
    
        if (r11 != (-4)) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(android.content.Context r17, com.tencent.mm.storage.f9 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.k1.j(android.content.Context, com.tencent.mm.storage.f9, boolean):boolean");
    }

    public static void k(android.content.Context context, com.tencent.mm.storage.f9 f9Var, boolean z17, com.tencent.mm.ui.chatting.gallery.e2 e2Var) {
        if (context == null || f9Var == null) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.tencent.mm.ui.chatting.gallery.z1 z1Var = new com.tencent.mm.ui.chatting.gallery.z1(context, f9Var, z17, e2Var);
        com.tencent.mm.ui.chatting.gallery.l1 l1Var = new com.tencent.mm.ui.chatting.gallery.l1(z17, context);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.h(context, z1Var, l1Var);
    }

    public static boolean l(android.content.Context context, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        java.lang.String str;
        boolean z18;
        java.lang.String str2;
        if (f9Var == null) {
            if (z17) {
                com.tencent.mm.platformtools.ExportFileUtil.m(context, context.getString(com.tencent.mm.R.string.k7a));
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryAdapter", "doExportVideo, msg is null or is clean, just return");
            return false;
        }
        if (f9Var.z2()) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
        if (g17 != null) {
            int wi6 = com.tencent.mm.storage.z3.R4(g17.h()) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(g17.h()) : 0;
            z18 = g17.i();
            str2 = g17.S;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(106L, 216L, 1L, false);
            str = "MicroMsg.ImageGalleryAdapter";
            g0Var.d(12084, java.lang.Integer.valueOf(g17.f415008f), java.lang.Integer.valueOf(g17.f415015m * 1000), 0, 2, g17.h(), java.lang.Integer.valueOf(wi6), t21.v2.c(g17.g()), java.lang.Long.valueOf(g17.f415012j));
        } else {
            str = "MicroMsg.ImageGalleryAdapter";
            z18 = false;
            str2 = null;
        }
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(str2);
        boolean i17 = h17 != null ? h17.i() : false;
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22570r, f9Var.z0(), false);
        boolean z19 = f9Var.A0() == 1;
        boolean j17 = com.tencent.mm.vfs.w6.j(rj6);
        boolean j18 = com.tencent.mm.vfs.w6.j(rj7);
        if (!z18 && !i17) {
            if (!z19 || (!j17 && !j18)) {
                com.tencent.mars.xlog.Log.w(str, "do export video but video had not download finish.");
                if (z17) {
                    com.tencent.mm.platformtools.ExportFileUtil.m(context, context.getString(com.tencent.mm.R.string.k7a));
                }
                return false;
            }
            com.tencent.mars.xlog.Log.i(str, "do export video for sending video, compressExists=%b, originExists=%b", java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(j18));
        }
        if (i17 && j18) {
            rj6 = rj7;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.tencent.mm.ui.chatting.gallery.w1 w1Var = new com.tencent.mm.ui.chatting.gallery.w1(i17, f9Var);
        ((yb0.g) b0Var).getClass();
        java.lang.String g18 = com.tencent.mm.platformtools.ExportFileUtil.g(context, rj6, null, w1Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g18)) {
            if (z17) {
                com.tencent.mm.platformtools.ExportFileUtil.m(context, context.getString(com.tencent.mm.R.string.k7a));
            }
            com.tencent.mars.xlog.Log.w(str, "doExportVideo, export video fail, video path = " + rj6);
            return false;
        }
        if (z17) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            ((ku5.t0) ku5.t0.f312615d).D(new com.tencent.mm.ui.chatting.gallery.x1(context));
        }
        x51.x0.f452109a.a(com.tencent.mm.vfs.w6.p(g18), c01.ia.v(f9Var.G));
        q75.c.g(g18, context);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.gallery.y1(f9Var, rj6, g17), "MsgVideoExportReport");
        return true;
    }

    public static void m(android.content.Context context, com.tencent.mm.storage.f9 f9Var, boolean z17, com.tencent.mm.ui.chatting.gallery.e2 e2Var) {
        if (context == null || f9Var == null) {
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        com.tencent.mm.ui.chatting.gallery.u1 u1Var = new com.tencent.mm.ui.chatting.gallery.u1(context, f9Var, z17, e2Var);
        com.tencent.mm.ui.chatting.gallery.v1 v1Var = new com.tencent.mm.ui.chatting.gallery.v1(z17, context);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.h(context, u1Var, v1Var);
    }

    public static java.lang.String s(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        com.tencent.mm.pluginsdk.model.app.d D0;
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null || (str = v17.f348694p) == null || str.length() <= 0 || (D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p)) == null) {
            return null;
        }
        return D0.field_fileFullPath;
    }

    public java.lang.Boolean A(com.tencent.mm.storage.f9 f9Var) {
        java.util.Map map = this.A;
        if (map.containsKey(f9Var)) {
            return (java.lang.Boolean) map.get(f9Var);
        }
        return null;
    }

    public android.view.View C(int i17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "position : %s getVideoViewByPosition is null", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.tencent.mm.R.id.oy9);
        if (findViewById == null) {
            findViewById = e17.findViewById(com.tencent.mm.R.id.oy7);
        }
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return null;
        }
        return findViewById;
    }

    @Override // db5.p8
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public android.view.View d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.chatting.gallery.ta taVar;
        vh5.q qVar;
        com.tencent.mm.storage.f9 y17 = y(i17);
        if (view == null) {
            view = android.view.View.inflate(this.f201092g, com.tencent.mm.R.layout.bka, null);
            taVar = new com.tencent.mm.ui.chatting.gallery.ta(this, view, y17);
            view.setTag(taVar);
        } else {
            taVar = (com.tencent.mm.ui.chatting.gallery.ta) view.getTag();
        }
        final com.tencent.mm.ui.chatting.gallery.q3 q3Var = this.f201105w;
        if (q3Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "instantiateItem: " + i17);
            android.util.SparseArray sparseArray = q3Var.f201292a;
            com.tencent.mm.ui.chatting.gallery.g4 g4Var = (com.tencent.mm.ui.chatting.gallery.g4) sparseArray.get(i17);
            if (g4Var != null) {
                if (!(!kotlin.jvm.internal.o.b(g4Var.f200948c, g4Var.f200946a.f265404a))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "instantiateItem: rebind container");
                    android.view.View view2 = g4Var.f200948c;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "rebindContainer: " + view);
                    g4Var.f200948c = view;
                    ((android.view.ViewGroup) view).addView(view2, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else if (kotlin.jvm.internal.o.b(g4Var.f200948c, view)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "instantiateItem: skip create");
                }
            }
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.cn9);
            if (relativeLayout != null) {
                sparseArray.put(i17, new com.tencent.mm.ui.chatting.gallery.g4(fq.d.a(relativeLayout), i17, view, new kotlin.jvm.internal.s(q3Var) { // from class: com.tencent.mm.ui.chatting.gallery.n3
                    @Override // kotlin.jvm.internal.s, f06.s
                    public java.lang.Object get() {
                        return java.lang.Boolean.valueOf(((com.tencent.mm.ui.chatting.gallery.q3) this.receiver).f201296e);
                    }
                }));
            } else {
                android.view.ViewStub viewStub = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.u3v);
                if (viewStub != null) {
                    viewStub.setOnInflateListener(new com.tencent.mm.ui.chatting.gallery.p3(q3Var, i17, view));
                    viewStub.inflate();
                }
            }
        }
        com.tencent.mm.ui.chatting.gallery.f2 B2 = B(y17);
        taVar.e(i17, B2, y17);
        vh5.s sVar = this.f201106x;
        sVar.getClass();
        boolean z17 = sVar.f437239a;
        android.view.ViewGroup viewGroup2 = taVar.E;
        if (z17) {
            java.lang.Object tag = viewGroup2.getTag();
            vh5.q qVar2 = tag instanceof vh5.q ? (vh5.q) tag : null;
            if (qVar2 != null && qVar2.f437232f != i17) {
                viewGroup2.setVisibility(8);
                qVar2.recycle();
            }
        }
        if (((G(y17) || L(y17) || K(y17)) && ((java.util.HashMap) this.A).containsKey(y17) && !U(i17)) ? A(y17).booleanValue() : false) {
            r(taVar, y17, i17);
            this.f201107y = false;
            return view;
        }
        int ordinal = B2.ordinal();
        if (ordinal == 1) {
            this.f201097o.j(taVar, y17, i17, (w() == null || y17 == null || w().getMsgId() != y17.getMsgId()) ? false : true);
        } else if (ordinal == 2) {
            this.f201098p.i(taVar, y17, i17);
        } else if (ordinal == 3) {
            this.f201099q.i(taVar, y17, i17);
        } else if (ordinal == 4) {
            q(taVar, y17, i17);
        } else if (ordinal == 5) {
            m11.b0 x17 = x(y17, false);
            if (z17 && y17 != null && x17 != null) {
                android.content.Context context = taVar.f201423a.getContext();
                if (viewGroup2.getTag() instanceof vh5.q) {
                    java.lang.Object tag2 = viewGroup2.getTag();
                    kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.media.chat.legacy.LegacyMediaHolder");
                    qVar = (vh5.q) tag2;
                } else {
                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejc, viewGroup2, false);
                    viewGroup2.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
                    kotlin.jvm.internal.o.d(inflate);
                    vh5.q qVar3 = new vh5.q(inflate, mf3.u.f326125g);
                    qVar3.u(viewGroup2);
                    viewGroup2.setTag(qVar3);
                    qVar = qVar3;
                }
                viewGroup2.setVisibility(0);
                sVar.f437243e.put(i17, qVar);
                if (qVar.f437232f != i17) {
                    qVar.t(new mf3.s(wh5.h0.f446068a.a(y17, x17), i17, i17 == com.tencent.mm.ui.chatting.gallery.d2.f200849o));
                }
            }
            if (i17 == com.tencent.mm.ui.chatting.gallery.d2.f200849o && sVar.f437240b) {
                sVar.f437242d.onPageSelected(i17);
                vh5.k kVar = sVar.f437241c;
                if (kVar != null) {
                    kVar.a(i17);
                }
                sVar.f437240b = false;
            }
        }
        this.f201107y = false;
        return view;
    }

    public boolean H(com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var) {
        if (f9Var == null || b0Var == null) {
            return false;
        }
        return ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(b0Var.f322633a, tg3.l1.a(f9Var), 1);
    }

    public final void O(com.tencent.mm.storage.f9 f9Var, boolean z17, int i17) {
        com.tencent.mm.ui.chatting.gallery.t2 t2Var = this.f201097o;
        dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(t2Var.y(f9Var, t2Var.w(f9Var, false), false));
        wh5.m0 m0Var = new wh5.m0(z17, "", bj6 != null ? bj6.field_resultFile : null);
        vh5.s sVar = this.f201106x;
        sVar.getClass();
        vh5.q a17 = sVar.a(i17);
        if (a17 != null) {
            a17.c(i17, m0Var);
        }
    }

    public void P(int i17) {
        t21.v2 p17;
        com.tencent.mm.ui.chatting.gallery.t4 t4Var = this.f201099q;
        com.tencent.mm.storage.f9 y17 = t4Var.f200886d.y(i17);
        com.tencent.mm.ui.chatting.gallery.ta k17 = t4Var.k(i17);
        if (y17 == null || k17 == null || (p17 = t4Var.p(y17)) == null) {
            return;
        }
        if (y17.A0() == 0) {
            int i18 = p17.f415011i;
            if (i18 == 113 || i18 == 111 || i18 == 112) {
                t4Var.n(p17, k17);
                return;
            } else if (i18 == 198) {
                t4Var.n(p17, k17);
                return;
            }
        }
        t4Var.r(y17, k17);
    }

    public void R(com.tencent.mm.storage.f9 f9Var, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryAdapter", "setTranslateStatus() called with: msg = [" + f9Var.getMsgId() + "], translate = [" + z17 + "], position = [" + i17 + "]");
        if (G(f9Var) || L(f9Var) || K(f9Var)) {
            ((java.util.HashMap) this.A).put(f9Var, java.lang.Boolean.valueOf(z17));
            v().e(i17, G(f9Var) ? com.tencent.mm.ui.chatting.gallery.f2.appimage : L(f9Var) ? com.tencent.mm.ui.chatting.gallery.f2.image : K(f9Var) ? com.tencent.mm.ui.chatting.gallery.f2.liveImage : null, f9Var);
            java.util.Set set = F;
            if (z17) {
                ((java.util.HashSet) set).add(java.lang.Long.valueOf(f9Var.getMsgId()));
                if (U(i17)) {
                    O(f9Var, z17, i17);
                    return;
                } else {
                    r(v(), f9Var, i17);
                    return;
                }
            }
            ((java.util.HashSet) set).remove(java.lang.Long.valueOf(f9Var.getMsgId()));
            if (U(i17)) {
                O(f9Var, z17, i17);
            } else if (G(f9Var)) {
                q(v(), f9Var, i17);
            } else if (L(f9Var)) {
                this.f201097o.i(v(), f9Var, i17);
            }
        }
    }

    public void S(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        if (f9Var == null) {
            return;
        }
        com.tencent.mm.storage.f9 w17 = w();
        if (w17 == null || w17.getMsgId() != f9Var.getMsgId()) {
            w17.getClass();
            return;
        }
        long I0 = f9Var.I0();
        com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct = this.f201108z;
        if (c2CImgWaitingTimeStruct != null && (c2CImgWaitingTimeStruct.f55486f != I0 || c2CImgWaitingTimeStruct.f55488h != z17)) {
            c2CImgWaitingTimeStruct.f55493m = c2CImgWaitingTimeStruct.i();
            c2CImgWaitingTimeStruct.f55494n = cm.b.cancel;
            c2CImgWaitingTimeStruct.k();
        }
        com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct2 = new com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct();
        this.f201108z = c2CImgWaitingTimeStruct2;
        c2CImgWaitingTimeStruct2.f55492l = c2CImgWaitingTimeStruct2.i();
        com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct3 = this.f201108z;
        c2CImgWaitingTimeStruct3.f55486f = I0;
        c2CImgWaitingTimeStruct3.f55487g = f9Var.getCreateTime();
        c2CImgWaitingTimeStruct3.f55488h = z17;
        java.lang.String str = this.f201103u;
        int wi6 = com.tencent.mm.storage.z3.R4(str) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 2;
        com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct4 = this.f201108z;
        c2CImgWaitingTimeStruct4.f55484d = c2CImgWaitingTimeStruct4.b("ChatName", str, true);
        c2CImgWaitingTimeStruct4.f55485e = wi6;
    }

    public void T(com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var, int i17, cm.b bVar) {
        com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct;
        long j17;
        long j18;
        long j19;
        if (f9Var == null || (c2CImgWaitingTimeStruct = this.f201108z) == null) {
            return;
        }
        c2CImgWaitingTimeStruct.f55493m = c2CImgWaitingTimeStruct.i();
        c2CImgWaitingTimeStruct.f55494n = bVar;
        long I0 = f9Var.I0();
        boolean z17 = i17 == 1;
        com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct2 = this.f201108z;
        long j27 = c2CImgWaitingTimeStruct2.f55486f;
        if (j27 != I0 && c2CImgWaitingTimeStruct2.f55488h != z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryAdapter", "waiting img[%d] download finish but other img[%d] download finish callback don't report", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(I0));
            com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct3 = this.f201108z;
            c2CImgWaitingTimeStruct3.f55494n = cm.b.cancel;
            c2CImgWaitingTimeStruct3.k();
            return;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (bVar == cm.b.ok) {
            java.lang.String x17 = com.tencent.mm.ui.chatting.gallery.t2.x(f9Var, b0Var, false);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
                j17 = com.tencent.mm.vfs.w6.k(x17);
                this.f201097o.getClass();
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(x17, options);
                if (d17 != null) {
                    d17.recycle();
                }
                j18 = options.outWidth;
                j19 = options.outHeight;
                com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct4 = this.f201108z;
                c2CImgWaitingTimeStruct4.f55489i = j17;
                c2CImgWaitingTimeStruct4.f55491k = j19;
                c2CImgWaitingTimeStruct4.f55490j = j18;
                c2CImgWaitingTimeStruct4.k();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryAdapter", "stopWaitingImg [%d] [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), this.f201108z.m());
                this.f201108z = null;
            }
        }
        j17 = 0;
        j18 = 0;
        j19 = 0;
        com.tencent.mm.autogen.mmdata.rpt.C2CImgWaitingTimeStruct c2CImgWaitingTimeStruct42 = this.f201108z;
        c2CImgWaitingTimeStruct42.f55489i = j17;
        c2CImgWaitingTimeStruct42.f55491k = j19;
        c2CImgWaitingTimeStruct42.f55490j = j18;
        c2CImgWaitingTimeStruct42.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryAdapter", "stopWaitingImg [%d] [%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), this.f201108z.m());
        this.f201108z = null;
    }

    public boolean U(int i17) {
        return K(y(i17));
    }

    public void V(int i17, boolean z17) {
        com.tencent.mm.ui.chatting.gallery.t2 t2Var = this.f201097o;
        t2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryHolderImage", "viewHdImg, pos = " + i17);
        com.tencent.mm.storage.f9 y17 = t2Var.f200886d.y(i17);
        if (y17 == null || y17.getMsgId() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryHolderImage", "msg is null");
            return;
        }
        if (!L(y17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryHolderImage", "not img can't download hd");
            return;
        }
        m11.b0 w17 = t2Var.w(y17, true);
        if (w17 == null || w17.f322633a == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("viewHdImg fail, msgLocalId = ");
            sb6.append(java.lang.Long.valueOf(y17.getMsgId()));
            sb6.append(", imgLocalId = ");
            sb6.append(w17 == null ? "null" : java.lang.Long.valueOf(w17.f322633a));
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryHolderImage", sb6.toString());
            return;
        }
        if (!z17) {
            t2Var.F(y17, 3);
            if (t2Var.k(i17) != null) {
                t2Var.n(t2Var.k(i17), y17, w17, true, false, i17);
            }
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = t2Var.f200886d;
        if (k1Var != null) {
            k1Var.S(y17, true);
        }
        if (!z17) {
            ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).Zi(y17.getMsgId(), y17.Q0(), 2);
            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(w17.f322633a, tg3.l1.a(y17), 1, java.lang.Integer.valueOf(i17), com.tencent.mm.R.drawable.bzt, t2Var, 0, false);
            return;
        }
        com.tencent.mm.ui.chatting.gallery.ua a17 = com.tencent.mm.ui.chatting.gallery.ua.a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] startScene, msgLoacalID:%d", java.lang.Long.valueOf(y17.getMsgId()));
        a17.f201497d.add(tg3.l1.a(y17));
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(w17.f322633a, tg3.l1.a(y17), 1, java.lang.Integer.valueOf(i17), com.tencent.mm.R.drawable.bzt, a17, 0, false);
    }

    @Override // db5.p8
    public boolean a() {
        return this.f201104v;
    }

    @Override // db5.p8
    public int b() {
        return com.tencent.mm.ui.chatting.gallery.d2.f200849o - this.f201093h.f200854e;
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.MultiTouchImageView c(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "position : %s getMultiTouchImageViewByPosition is null", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (U(i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryAdapter", "position : %s getMultiTouchImageViewByPosition null , useMultiLayer", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.tencent.mm.R.id.h88);
        if (findViewById == null || (z17 && findViewById.getVisibility() == 8)) {
            return null;
        }
        return (com.tencent.mm.ui.base.MultiTouchImageView) findViewById;
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) obj);
        com.tencent.mm.ui.chatting.gallery.q3 q3Var = this.f201105w;
        if (q3Var != null) {
            q3Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "destroyItem: " + i17);
            q3Var.f201292a.remove(i17);
        }
        super.destroyItem(viewGroup, i17, obj);
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.WxImageView f(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            return null;
        }
        if (U(i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryAdapter", "position : %s getWxImageViewByPosition null , useMultiLayer", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.tencent.mm.R.id.pr8);
        if (findViewById == null || (z17 && findViewById.getVisibility() == 8)) {
            return null;
        }
        return (com.tencent.mm.ui.base.WxImageView) findViewById;
    }

    @Override // db5.p8
    public int g() {
        int i17 = com.tencent.mm.ui.chatting.gallery.d2.f200849o;
        com.tencent.mm.ui.chatting.gallery.d2 d2Var = this.f201093h;
        return ((i17 - d2Var.f200854e) + d2Var.f200852c) - 1;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        com.tencent.mm.ui.chatting.gallery.d2 d2Var = this.f201093h;
        return (d2Var.f200852c - d2Var.f200854e) + com.tencent.mm.ui.chatting.gallery.d2.f200849o + 1;
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        if (this.f201102t) {
            return -2;
        }
        return super.getItemPosition(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(com.tencent.mm.storage.f9 r25) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.k1.n(com.tencent.mm.storage.f9):void");
    }

    @Override // androidx.viewpager.widget.a
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f201102t = false;
    }

    public void o(int i17) {
        com.tencent.mm.storage.f9 y17 = y(i17);
        int ordinal = B(y17).ordinal();
        if (ordinal == 2 || ordinal == 3) {
            p(y17);
            return;
        }
        if (ordinal != 4) {
            n(y17);
            return;
        }
        java.lang.String s17 = s(y17);
        android.content.Intent intent = new android.content.Intent(this.f201092g, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_File_Name", s17);
        intent.putExtra("Retr_Msg_Id", y17.getMsgId());
        intent.putExtra("Retr_MsgTalker", y17.Q0());
        intent.putExtra("Retr_Msg_Type", 16);
        intent.putExtra("Retr_Msg_content", y17.j());
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("ForwardParams_ReportFromScene", 9);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201092g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageGalleryUI, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitAppImg", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        imageGalleryUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(imageGalleryUI, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitAppImg", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    public void onPageSelected(int i17) {
        com.tencent.mm.ui.chatting.gallery.t2 t2Var = this.f201097o;
        if (t2Var != null && L(y(i17))) {
            t2Var.f201386h.onPageSelected(i17);
        }
        vh5.s sVar = this.f201106x;
        sVar.f437242d.onPageSelected(i17);
        vh5.k kVar = sVar.f437241c;
        if (kVar != null) {
            kVar.a(i17);
        }
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).Ai(y(i17));
    }

    public void p(com.tencent.mm.storage.f9 f9Var) {
        boolean E2 = c01.d9.b().E();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201092g;
        if (!E2) {
            db5.t7.k(imageGalleryUI, null);
            return;
        }
        if (f9Var.M2()) {
            ot0.m1 r17 = com.tencent.mm.ui.chatting.gallery.j1.r(f9Var);
            if (r17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "doRestransmitVideo mpShareVideoInfo should not be null");
                return;
            }
            if (imageGalleryUI.f200619i == null) {
                imageGalleryUI.f200619i = new com.tencent.mm.plugin.webview.ui.tools.media.n0();
            }
            imageGalleryUI.f200619i.f185807a = r17;
            boolean z17 = this.f201101s;
            r17.f348587y = imageGalleryUI.f200676y.f201173m;
            com.tencent.mm.plugin.webview.ui.tools.media.j0.f185786a.b(imageGalleryUI, r17.f373343h, "", r17.f373342g, r17.f373347o, z17 ? 1 : 0);
            return;
        }
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "videoInfo should not be null");
            return;
        }
        boolean fj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f436205g);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.K0(h17.S) || !((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).fj(f9Var);
        if (fj6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryAdapter", "start forward video " + f9Var.getMsgId() + " launch forward UIC , forceForwardCompress %b", java.lang.Boolean.valueOf(z18));
            jd5.c cVar = new jd5.c();
            long msgId = f9Var.getMsgId();
            int i17 = cVar.f43702d;
            cVar.set(i17 + 0, java.lang.Long.valueOf(msgId));
            cVar.set(i17 + 2, java.lang.Long.valueOf(f9Var.I0()));
            cVar.set(i17 + 3, java.lang.Integer.valueOf(f9Var.getType()));
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            cVar.set(i17 + 1, Q0);
            cVar.q(h17.f415015m);
            cVar.l(z18);
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334120d.f334139a = 1;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(imageGalleryUI, cVar, rVar);
        } else {
            android.content.Intent intent = new android.content.Intent(imageGalleryUI, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
            intent.putExtra("Retr_length", h17.f415015m);
            intent.putExtra("Retr_File_Name", f9Var.z0());
            intent.putExtra("Retr_video_isexport", h17.f415022t);
            intent.putExtra("Retr_Msg_Type", M(f9Var) ? 11 : 1);
            intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_From", "gallery");
            intent.putExtra("ForwardParams_ReportFromScene", 9);
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f201092g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageGalleryUI2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            imageGalleryUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(imageGalleryUI2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryAdapter", "doRestransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    public final void q(com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        android.graphics.Bitmap Ai;
        taVar.f(taVar.C, 0);
        taVar.f(taVar.f201443u, 8);
        android.widget.ProgressBar progressBar = taVar.f201447y;
        taVar.f(progressBar, 8);
        taVar.f(taVar.f201448z, 8);
        taVar.f(taVar.f201439q, 8);
        java.lang.String s17 = s(f9Var);
        try {
            Ai = x51.w0.c(s17);
        } catch (java.lang.OutOfMemoryError unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", s17);
            java.lang.Runtime.getRuntime().gc();
            java.lang.Runtime.getRuntime().runFinalization();
            Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(s17);
        }
        if (Ai == null) {
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            x60.e eVar = (x60.e) fVar;
            Ai = eVar.Ai(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), true));
            taVar.f(progressBar, 0);
            new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.ui.chatting.gallery.q1(this, f9Var, taVar, s17));
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = taVar.C;
        if (Ai != null) {
            multiTouchImageView.setEnableHorLongBmpMode(false);
            int width = Ai.getWidth();
            int height = Ai.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
            multiTouchImageView.setImageBitmap(Ai);
            multiTouchImageView.invalidate();
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryAdapter", "get image fail");
        multiTouchImageView.setVisibility(8);
        taVar.b();
        taVar.f201448z.setVisibility(0);
        taVar.b();
        taVar.B.setImageResource(com.tencent.mm.R.raw.image_download_fail_icon);
        taVar.b();
        taVar.A.setText(this.f201092g.getString(com.tencent.mm.R.string.g0_));
    }

    public void r(com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        java.lang.String y17;
        if (G(f9Var)) {
            y17 = s(f9Var);
        } else {
            if (!L(f9Var)) {
                return;
            }
            com.tencent.mm.ui.chatting.gallery.t2 t2Var = this.f201097o;
            y17 = t2Var.y(f9Var, t2Var.w(f9Var, false), false);
        }
        dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(y17);
        java.lang.String str = bj6 != null ? bj6.field_resultFile : null;
        taVar.f(taVar.C, 0);
        taVar.f(taVar.f201443u, 8);
        taVar.f(taVar.f201447y, 8);
        taVar.f(taVar.f201448z, 8);
        taVar.f(taVar.f201439q, 8);
        android.graphics.Bitmap Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(str);
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = taVar.C;
        if (Ai == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryAdapter", "get image fail");
            multiTouchImageView.setImageResource(com.tencent.mm.R.raw.download_image_icon);
            return;
        }
        multiTouchImageView.setEnableHorLongBmpMode(false);
        int width = Ai.getWidth();
        int height = Ai.getHeight();
        multiTouchImageView.f197651o = width;
        multiTouchImageView.f197652p = height;
        multiTouchImageView.setImageBitmap(Ai);
        multiTouchImageView.invalidate();
    }

    public int t(com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var) {
        if (f9Var.A0() == 1) {
            if (b0Var.j()) {
                ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                m11.b0 d17 = m11.c0.d(b0Var);
                if (d17 != null && d17.f322633a > 0 && d17.k()) {
                    if (com.tencent.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22562g, d17.f322637e, "", ""))) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        if (b0Var.k() && b0Var.j()) {
            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
            m11.b0 d18 = m11.c0.d(b0Var);
            java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22562g, d18.f322637e, "", "");
            if (d18.f322633a > 0 && d18.k() && com.tencent.mm.vfs.w6.j(aj6)) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r1.field_isUpload == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.ui.chatting.gallery.gb u() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.k1.u():com.tencent.mm.ui.chatting.gallery.gb");
    }

    public com.tencent.mm.ui.chatting.gallery.ta v() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201092g;
        com.tencent.mm.ui.chatting.gallery.ta k17 = this.f201097o.k(imageGalleryUI.I7());
        if (k17 == null) {
            k17 = this.f201098p.k(imageGalleryUI.I7());
        }
        return k17 == null ? this.f201099q.k(imageGalleryUI.I7()) : k17;
    }

    public com.tencent.mm.storage.f9 w() {
        return y(this.f201092g.I7());
    }

    public m11.b0 x(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        return this.f201097o.w(f9Var, z17);
    }

    public com.tencent.mm.storage.f9 y(int i17) {
        return this.f201093h.b(i17);
    }

    public android.view.View z(int i17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryAdapter", "position : %s getTPVideoViewByPosition is null", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.tencent.mm.R.id.p0_);
        if (findViewById == null || findViewById.getVisibility() == 8) {
            return null;
        }
        return findViewById;
    }
}
