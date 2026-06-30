package com.tencent.mm.ui.transmit;

@db5.a(19)
@gm0.a2
@java.lang.Deprecated
/* loaded from: classes9.dex */
public class SelectConversationUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final int B2 = com.tencent.mm.ui.contact.i5.g(1, 2);
    public java.lang.String A1;
    public java.lang.String B1;
    public android.widget.RelativeLayout C;
    public android.widget.RelativeLayout D;
    public android.widget.LinearLayout E;
    public android.widget.ImageView F;
    public android.widget.TextView G;
    public android.widget.TextView H;
    public boolean H1;
    public com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs I1;
    public com.tencent.mm.sendtowework.BaseDataToWeWork J1;
    public int K1;
    public int L1;
    public long M1;
    public java.lang.String N1;
    public java.util.ArrayList O1;
    public java.util.List P1;
    public java.lang.String Q1;
    public java.lang.String R1;
    public com.tencent.mm.storage.f9 S1;
    public java.lang.String T1;
    public int U1;
    public java.lang.String X1;
    public int Z;

    /* renamed from: b2, reason: collision with root package name */
    public com.tencent.mm.ui.contact.p6 f210982b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f210983c2;

    /* renamed from: d2, reason: collision with root package name */
    public java.util.List f210984d2;

    /* renamed from: e2, reason: collision with root package name */
    public java.lang.String f210985e2;

    /* renamed from: f2, reason: collision with root package name */
    public java.lang.String f210986f2;

    /* renamed from: g2, reason: collision with root package name */
    public int f210987g2;

    /* renamed from: h2, reason: collision with root package name */
    public java.lang.String f210988h2;

    /* renamed from: l2, reason: collision with root package name */
    public long f210993l2;

    /* renamed from: n2, reason: collision with root package name */
    public int f210995n2;

    /* renamed from: o2, reason: collision with root package name */
    public int f210996o2;

    /* renamed from: p0, reason: collision with root package name */
    public long f210997p0;

    /* renamed from: t2, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f211003t2;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f211007x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f211010y0;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f210980J = false;
    public boolean K = false;
    public boolean L = false;
    public boolean M = false;
    public boolean N = false;
    public boolean P = false;
    public boolean Q = false;
    public boolean R = false;
    public boolean S = false;
    public boolean T = false;
    public boolean U = false;
    public boolean V = false;
    public boolean W = false;
    public int X = 0;
    public boolean Y = false;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f210992l1 = false;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f210998p1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f211008x1 = false;

    /* renamed from: y1, reason: collision with root package name */
    public int f211011y1 = -1;

    /* renamed from: z1, reason: collision with root package name */
    public long f211013z1 = -1;
    public java.lang.Boolean C1 = java.lang.Boolean.FALSE;
    public boolean D1 = false;
    public boolean E1 = false;
    public java.util.List F1 = null;
    public java.util.Map G1 = null;
    public boolean V1 = false;
    public java.lang.String W1 = null;
    public java.lang.String Y1 = null;
    public java.lang.String Z1 = null;

    /* renamed from: a2, reason: collision with root package name */
    public java.lang.String f210981a2 = null;

    /* renamed from: i2, reason: collision with root package name */
    public int f210989i2 = 0;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f210990j2 = false;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f210991k2 = false;

    /* renamed from: m2, reason: collision with root package name */
    public int f210994m2 = 0;

    /* renamed from: p2, reason: collision with root package name */
    public boolean f210999p2 = false;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f211000q2 = false;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f211001r2 = false;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f211002s2 = true;

    /* renamed from: u2, reason: collision with root package name */
    public long f211004u2 = 0;

    /* renamed from: v2, reason: collision with root package name */
    public int f211005v2 = 0;

    /* renamed from: w2, reason: collision with root package name */
    public final boolean f211006w2 = com.tencent.mm.ui.chatting.hd.k();

    /* renamed from: x2, reason: collision with root package name */
    public final boolean f211009x2 = com.tencent.mm.ui.chatting.hd.j();

    /* renamed from: y2, reason: collision with root package name */
    public java.lang.String f211012y2 = "";

    /* renamed from: z2, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f211014z2 = new dk5.e4(this);
    public final android.view.MenuItem.OnMenuItemClickListener A2 = new dk5.f4(this);

    public static java.lang.String J7(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(str);
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490447vb);
        if (q17 == null) {
            return string;
        }
        com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(str2);
        int i17 = D3.f196374q;
        java.util.Set set = c01.e2.f37117a;
        if (!(com.tencent.mm.storage.z3.D3(i17) || q17.k2())) {
            return com.tencent.mm.storage.z3.m4(str) ? N7(context, q17) : com.tencent.mm.storage.z3.p4(str) ? context.getResources().getString(com.tencent.mm.R.string.f490446va) : context.getResources().getString(com.tencent.mm.R.string.f490447vb);
        }
        boolean z17 = D3.f196377t == 0;
        boolean n27 = q17.n2();
        int i18 = com.tencent.mm.R.string.v_;
        if (n27 && z17) {
            return context.getResources().getString(com.tencent.mm.R.string.v_);
        }
        if (!q17.l2()) {
            return context.getResources().getString(com.tencent.mm.R.string.mxk);
        }
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi()) {
            i18 = com.tencent.mm.R.string.n8y;
        }
        return context.getResources().getString(i18);
    }

    public static java.lang.String N7(android.content.Context context, com.tencent.mm.storage.z3 z3Var) {
        java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni(z3Var.Q0(), "openim_card_type_name", j41.a0.TYPE_WORDING);
        return android.text.TextUtils.isEmpty(Ni) ? context.getResources().getString(com.tencent.mm.R.string.f490447vb) : java.lang.String.format("[%s]", Ni);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0322, code lost:
    
        if (r3 != 6) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w7(final com.tencent.mm.ui.transmit.SelectConversationUI r21, com.tencent.wework.api.IWWAPI.WWAppType r22) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.SelectConversationUI.w7(com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.wework.api.IWWAPI$WWAppType):void");
    }

    public final void A7(int i17, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        java.lang.String string;
        switch (i17) {
            case 10:
                string = getString(com.tencent.mm.R.string.ifc);
                break;
            case 11:
                string = getString(com.tencent.mm.R.string.if7);
                break;
            case 12:
                string = getString(com.tencent.mm.R.string.f492957if5);
                break;
            case 13:
            default:
                string = getString(com.tencent.mm.R.string.ifb);
                break;
            case 14:
                string = getString(com.tencent.mm.R.string.f492956if3);
                break;
            case 15:
                string = getString(com.tencent.mm.R.string.if6);
                break;
            case 16:
                string = getString(com.tencent.mm.R.string.f492954if1);
                break;
            case 17:
                string = getString(com.tencent.mm.R.string.if_);
                break;
            case 18:
                string = getString(com.tencent.mm.R.string.ifa);
                break;
            case 19:
                string = getString(com.tencent.mm.R.string.f492955if2);
                break;
            case 20:
                string = getString(com.tencent.mm.R.string.if8);
                break;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "createTipsAndSendToWeWork() called with: contentTypeForwardToWeWork = [" + i17 + "], wwAppType = [" + wWAppType + "] tips:%s", string);
        this.J1 = new com.tencent.mm.sendtowework.TextData(string);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        com.tencent.mm.sendtowework.BaseDataToWeWork baseDataToWeWork = this.J1;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.ui.chatting.hd.f201679a;
        if (baseDataToWeWork != null && (baseDataToWeWork instanceof com.tencent.mm.sendtowework.TextData)) {
            com.tencent.mm.ui.chatting.hd.r(context, ((com.tencent.mm.sendtowework.TextData) baseDataToWeWork).f193179d, wWAppType);
        }
    }

    public final void B7(android.content.Intent intent, r35.i1 i1Var, java.util.HashMap hashMap, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        boolean z18;
        int i17;
        android.os.Bundle bundle;
        java.lang.String c17 = c01.od.c(hashMap.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID), null);
        int b17 = c01.od.b(hashMap.get("pkg_type"), 0);
        int b18 = c01.od.b(hashMap.get("pkg_version"), 0);
        java.lang.String c18 = c01.od.c(hashMap.get("cache_key"), null);
        java.lang.String c19 = c01.od.c(hashMap.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), null);
        java.lang.String c27 = c01.od.c(hashMap.get("delay_load_img_path"), null);
        java.lang.String c28 = c01.od.c(hashMap.get("nickname"), "");
        boolean a17 = c01.od.a(hashMap.get("is_dynamic"), false);
        int b19 = c01.od.b(hashMap.get("subType"), 0);
        int b27 = c01.od.b(hashMap.get("biz"), 2);
        if (ot0.o.b(b27)) {
            java.lang.String c29 = c01.od.c(hashMap.get("tail_lang"), "");
            z18 = a17;
            java.lang.String c37 = c01.od.c(hashMap.get("icon_url"), "");
            str4 = "pkg_version";
            android.os.Bundle bundle2 = new android.os.Bundle();
            i17 = b18;
            bundle2.putInt("key_biz", b27);
            bundle2.putString("key_footer_text_default", c28);
            bundle2.putString("key_footer_text", ot0.o.a(b27, c29, getContext()));
            bundle2.putString("key_footer_icon", c37);
            bundle = bundle2;
        } else {
            str4 = "pkg_version";
            z18 = a17;
            i17 = b18;
            if (z17) {
                bundle = new android.os.Bundle();
                bundle.putBoolean("is_video", true);
                java.lang.String c38 = c01.od.c(hashMap.get("footer_icon"), "");
                java.lang.String c39 = c01.od.c(hashMap.get("footer_text"), "");
                bundle.putString("key_footer_icon", c38);
                bundle.putString("key_footer_text", c39);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.SelectConversationUI", "fake native share msg biz invalidate, biz: %d.", java.lang.Integer.valueOf(b27));
                bundle = null;
            }
        }
        android.view.View wi6 = ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).wi(this, bundle, str3 == null ? false : c01.e2.Z(str3), new dk5.y2(this, intent));
        java.lang.String a18 = ik1.i0.a(this);
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, c17);
        bundle3.putString("msg_id", java.lang.String.format("%d-%d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(i17)));
        bundle3.putInt("msg_pkg_type", b17);
        bundle3.putInt(str4, i17);
        bundle3.putString("image_url", str);
        bundle3.putBoolean("is_dynamic_page", z18);
        bundle3.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
        bundle3.putString("cache_key", c18);
        bundle3.putString("msg_path", c19);
        bundle3.putString("delay_load_img_path", c27);
        bundle3.putInt("sub_type", b19);
        if (z17) {
            java.lang.String c47 = c01.od.c(hashMap.get("video_path"), "");
            java.lang.String c48 = c01.od.c(hashMap.get("video_thumb_path"), "");
            bundle3.putBoolean("is_video", true);
            bundle3.putString("video_path", c47);
            bundle3.putString("video_thumb_path", c48);
        }
        dk5.p7 p7Var = new dk5.p7(this);
        p7Var.f234822j = new dk5.b3(this, intent, str3, a18, wi6);
        ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Ri(a18, wi6, bundle3, new dk5.c3(this, p7Var));
        i1Var.c(wi6);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.h(false);
        i1Var.f369138e = new dk5.d3(this, a18, wi6);
        i1Var.f369137d = M7();
        i1Var.a(new dk5.e3(this, str3, wi6, p7Var));
        i1Var.k();
    }

    public final boolean C7(android.content.Intent intent, r35.i1 i1Var, java.lang.String str) {
        java.util.HashMap hashMap = (java.util.HashMap) getIntent().getSerializableExtra("appbrand_params");
        boolean a17 = c01.od.a(hashMap.get("is_weishi_video"), false);
        boolean a18 = c01.od.a(hashMap.get("is_video"), false);
        if (a17) {
            java.lang.String c17 = c01.od.c(hashMap.get("img_url"), null);
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                java.lang.String c18 = c01.od.c(hashMap.get("msg_img_path"), null);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(c18)) {
                    com.tencent.mars.xlog.Log.i("Weishi", "dealRetransmitFromWeishiVideoMiniProgram, imageUrl:%s, msgImgPath:%s", c17, c18);
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    android.graphics.Bitmap J3 = m11.b1.Di().J3(null, c18);
                    if (J3 != null) {
                        try {
                            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(c18).getOrientationInDegree();
                            if (orientationInDegree < 0) {
                                orientationInDegree = 0;
                            }
                            J3 = com.tencent.mm.sdk.platformtools.x.w0(J3, orientationInDegree);
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectConversationUI", th6, "unexpected exception.", new java.lang.Object[0]);
                        }
                    }
                    i1Var.d(J3, 2);
                }
            } else {
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
                android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f488672a01, (android.view.ViewGroup) null);
                relativeLayout.addView(inflate, new android.widget.RelativeLayout.LayoutParams(-2, -2));
                ((android.widget.RelativeLayout.LayoutParams) inflate.getLayoutParams()).addRule(14);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.jlj);
                ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h_u)).setImageResource(com.tencent.mm.R.raw.video_icon_in_gird);
                i1Var.c(relativeLayout);
                i1Var.h(false);
                l01.d0.f314761a.n(new dk5.f3(this, imageView, c17), c17, null, null);
            }
            i1Var.g(java.lang.Boolean.TRUE);
            return false;
        }
        int b17 = c01.od.b(hashMap.get("type"), 1);
        java.lang.String c19 = c01.od.c(hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), "");
        java.lang.String c27 = c01.od.c(hashMap.get("img_url"), null);
        int b18 = c01.od.b(hashMap.get("biz"), 2);
        if (c01.od.a(hashMap.get("is_native_game_card"), false)) {
            i1Var.i(getResources().getString(com.tencent.mm.R.string.f490589za) + c01.od.c(hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), ""));
            i1Var.g(java.lang.Boolean.TRUE);
            i1Var.f369137d = M7();
            i1Var.a(new dk5.g3(this, intent));
            i1Var.k();
            return true;
        }
        if (!ot0.o.b(b18) && (b17 == 2 || b17 == 3)) {
            if (str != null && c01.e2.Z(str) && com.tencent.mm.sdk.platformtools.o4.M("group_to_do").getBoolean("introduce_dialog_first", true)) {
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("group_to_do");
                M.getClass();
                M.putBoolean("introduce_dialog_first", false);
                dk5.m7.b(this, new dk5.u2(this, intent, i1Var, hashMap, a18, c27, c19, str));
            } else {
                B7(intent, i1Var, hashMap, a18, c27, c19, str);
            }
            return true;
        }
        if (!ot0.o.b(b18)) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(getResources().getString(com.tencent.mm.R.string.f490094kq));
            stringBuffer.append(c19);
            i1Var.i(stringBuffer.toString());
            com.tencent.mm.ui.widget.dialog.a aVar = i1Var.f369135b.f211821b;
            aVar.f211728r = c27;
            aVar.U = 8;
            i1Var.g(java.lang.Boolean.TRUE);
            return false;
        }
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.f490094kq);
        java.lang.String c28 = c01.od.c(hashMap.get("nickname"), null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c28)) {
            string = com.tencent.mm.sdk.platformtools.t8.z1(getResources().getString(com.tencent.mm.R.string.f490395ts), c28);
        }
        i1Var.i(string + c19);
        dk5.p7 p7Var = new dk5.p7(this);
        p7Var.f234822j = new dk5.v2(this, intent, str);
        l01.d0.f314761a.m(new dk5.w2(this, p7Var), c27, l01.q0.f314787d);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.f369137d = M7();
        i1Var.a(new dk5.x2(this, str, p7Var));
        i1Var.k();
        return true;
    }

    public final void D7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "doCallSelectContactUI");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.SelectContactUI.class);
        intent.putExtra("list_type", 5);
        intent.putExtra("titile", getString(com.tencent.mm.R.string.f489934fx));
        int i17 = this.X;
        if (((i17 == 4 || i17 == 9) && getIntent().getIntExtra("jsapi_select_mode", 0) == 1) || this.X == 10) {
            intent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(32, 16, 1, 2, 4, 16384));
        } else if (this.f211008x1 && !this.C1.booleanValue()) {
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(16, 1, 2, 4, 16384));
            intent.putExtra("without_openim", true);
            intent.putExtra("KBlockOpenImFav", true);
        } else if (this.P) {
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206780a, 16384, 64, 4096));
            intent.putExtra("without_openim", true);
            intent.putExtra("KBlockOpenImFav", true);
        } else {
            intent.setClass(this, com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206787h);
            java.util.HashSet i18 = c01.e2.i();
            i18.add(c01.z1.r());
            i18.add("weixin");
            intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(i18, ","));
            pf5.j0.a(intent, gk5.k1.class);
            pf5.j0.a(intent, kk5.o0.class);
            pf5.j0.a(intent, cj5.q4.class);
            pf5.j0.a(intent, aj5.g1.class);
            pf5.j0.a(intent, aj5.i.class);
            pf5.j0.a(intent, cj5.u3.class);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, cj5.s.class);
            pf5.j0.a(intent, cj5.h3.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            pf5.j0.a(intent, aj5.a0.class);
            pf5.j0.a(intent, cj5.j.class);
        }
        getContext().startActivityForResult(intent, 1);
    }

    public final void E7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "doCallSelectContactUIForMultiRetransmit");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("list_type", 14);
        intent.putExtra("titile", getString(com.tencent.mm.R.string.f489934fx));
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206788i);
        intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(this.F1, ","));
        intent.putExtra("max_limit_num", 9);
        intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
        pf5.j0.a(intent, gk5.k1.class);
        pf5.j0.a(intent, cj5.q4.class);
        pf5.j0.a(intent, aj5.g1.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.u3.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        getContext().startActivityForResult(intent, 5);
    }

    public final void F7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "doChooseMsgFile userName:%s type:%s count:%d ", str, this.f210986f2, java.lang.Integer.valueOf(this.f210987g2));
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "doChooseMsgFile extension:%s ", this.f210988h2);
        ((uv1.d) ((lo.k) i95.n0.c(lo.k.class))).wi(this, str, this.f210986f2, this.f210987g2, this.f210988h2, new dk5.q2(this), null);
    }

    public void G7(java.lang.String str) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "doClickUser=%s", str);
        if (z7(str) || y7(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_User", str);
        android.content.Intent intent2 = (android.content.Intent) getIntent().getParcelableExtra("Select_Conv_NextStep");
        if (intent2 != null) {
            P7(intent, intent2);
        } else if (this.I || this.f210992l1 || this.f210980J || this.K || this.L || this.U || this.P || this.Q || this.R || this.S || this.T) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = elapsedRealtime - this.f211013z1;
            if (j17 <= 40 || j17 >= 300) {
                this.f211013z1 = elapsedRealtime;
                z17 = true;
            } else {
                this.f211013z1 = elapsedRealtime;
                z17 = false;
            }
            if (z17) {
                H7(intent, str);
            }
        } else if (this.X == 11) {
            F7(str);
        } else {
            a8(-1, intent);
            finish();
        }
        hideVKB();
    }

    public final void H7(android.content.Intent intent, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI;
        java.lang.Class<n13.a0> cls;
        java.lang.String str3;
        java.lang.String t17;
        java.lang.String stringBuffer;
        int P;
        if (z7(str)) {
            return;
        }
        if (com.tencent.mm.ui.contact.i5.d(this.K1, 256)) {
            a8(-1, intent);
            finish();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        str2 = "";
        if (com.tencent.mm.storage.z3.R4(str)) {
            int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str);
            if (this.f210998p1 && wi6 > (P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CheckBigFileUploadChatroomMemberCountLimit"), 50))) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SelectConversationUI", "summerbig SelectConversationUI group limit[%d], count[%d]", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(wi6));
                db5.e1.s(this, getString(com.tencent.mm.R.string.ifq, java.lang.Integer.valueOf(P)), "");
                return;
            }
            getString(com.tencent.mm.R.string.ifo, java.lang.Integer.valueOf(wi6));
        }
        r35.i1 i1Var = new r35.i1(getContext());
        i1Var.l(str);
        boolean z17 = true;
        if (this.f210992l1) {
            T7(i1Var, this.A1);
            if (com.tencent.mm.storage.z3.R4(str)) {
                java.lang.String str4 = this.A1;
                iz5.a.g("cardNameToSend is null", str4 != null);
                intent.putExtra("be_send_card_name", str4);
                intent.putExtra("received_card_name", str);
                intent.putExtra("Is_Chatroom", true);
            } else {
                java.lang.String str5 = this.A1;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str);
                Z7(intent, str5, linkedList);
            }
            i1Var.g(java.lang.Boolean.TRUE);
        } else if (this.f210980J) {
            if (getIntent().hasExtra("appbrand_params") && C7(intent, i1Var, null)) {
                return;
            }
            if (this.f210997p0 != -1) {
                R7(i1Var);
                com.tencent.mm.autogen.events.FavInitConfirmDialogContentEvent favInitConfirmDialogContentEvent = new com.tencent.mm.autogen.events.FavInitConfirmDialogContentEvent();
                long j17 = this.M1;
                am.u9 u9Var = favInitConfirmDialogContentEvent.f54238g;
                u9Var.f8059a = j17;
                u9Var.f8060b = this.Z;
                u9Var.f8061c = this.f210997p0;
                u9Var.f8062d = this.f211007x0;
                u9Var.f8063e = this.L1;
                u9Var.f8064f = i1Var;
                u9Var.f8066h = this.f210985e2;
                u9Var.f8065g = getContext();
                u9Var.f8067i = this.S1.Q0();
                favInitConfirmDialogContentEvent.e();
            } else if (this.L1 == 17 && this.f211010y0 != 0) {
                java.lang.String string = getContext().getString(com.tencent.mm.R.string.f492837i25, java.lang.Integer.valueOf(this.f211010y0));
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(getResources().getString(com.tencent.mm.R.string.f490491wk));
                stringBuffer2.append(string);
                i1Var.i(stringBuffer2.toString());
            }
            i1Var.g(java.lang.Boolean.TRUE);
        } else if (this.Q) {
            if (this.L1 == 17 && this.f211010y0 != 0) {
                java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.f492837i25, java.lang.Integer.valueOf(this.f211010y0));
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer(getResources().getString(com.tencent.mm.R.string.f490491wk));
                stringBuffer3.append(string2);
                i1Var.i(stringBuffer3.toString());
                i1Var.g(java.lang.Boolean.TRUE);
            }
        } else if (this.K && !this.U) {
            java.util.HashMap hashMap = (java.util.HashMap) getIntent().getSerializableExtra("webview_params");
            java.lang.String str6 = (java.lang.String) hashMap.get("img_url");
            java.lang.String str7 = (java.lang.String) hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String str8 = (java.lang.String) hashMap.get("url");
            int P2 = hashMap.containsKey("item_show_type") ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) hashMap.get("item_show_type"), -1) : -1;
            if (this.V) {
                java.lang.String str9 = (java.lang.String) hashMap.get("nickname");
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer(getResources().getString(com.tencent.mm.R.string.f490449vd));
                stringBuffer4.append(str9);
                stringBuffer = stringBuffer4.toString();
            } else if (this.W) {
                java.lang.String str10 = (java.lang.String) hashMap.get(ya.b.SOURCE);
                java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer(str10 == null ? getResources().getString(com.tencent.mm.R.string.f490589za) : str10.equals("2") ? getResources().getString(com.tencent.mm.R.string.f490371t4) : str10.equals("3") ? getResources().getString(com.tencent.mm.R.string.f490384th) : getResources().getString(com.tencent.mm.R.string.f490589za));
                stringBuffer5.append(str7);
                stringBuffer = stringBuffer5.toString();
            } else {
                java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer(this.L1 != 4 ? P2 == 16 ? getResources().getString(com.tencent.mm.R.string.f490596zi) : getResources().getString(com.tencent.mm.R.string.f490589za) : "");
                stringBuffer6.append(str7);
                stringBuffer = stringBuffer6.toString();
            }
            if (!this.W) {
                i1Var.b(new dk5.r2(this, str8));
            }
            i1Var.g(java.lang.Boolean.TRUE);
            com.tencent.mm.ui.widget.dialog.i0 i0Var = i1Var.f369135b;
            if (P2 == 8 && hashMap.containsKey("coverPicImageUrl")) {
                java.lang.String str11 = (java.lang.String) hashMap.get("coverPicImageUrl");
                int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) hashMap.get("coverPicWidth"), 0);
                int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) hashMap.get("coverPicHeight"), 0);
                int P5 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) hashMap.get("picCount"), 0);
                java.lang.String str12 = (java.lang.String) hashMap.get("srcUserName");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str11)) {
                    i1Var.c(r35.g0.f369112a.a(getContext(), java.lang.Integer.valueOf(P2), (java.lang.String) hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), str12, str11, P3, P4, P5, "0", 0));
                    com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
                    aVar.A = false;
                    aVar.B = false;
                    z17 = false;
                }
            }
            if (z17) {
                com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var.f211821b;
                aVar2.f211728r = str6;
                aVar2.U = 8;
                i1Var.i(stringBuffer);
            }
        } else {
            if (this.L && C7(intent, i1Var, str)) {
                return;
            }
            if (this.N) {
                java.lang.String string3 = getResources().getString(com.tencent.mm.R.string.f490452vg);
                if (this.f210981a2 != null) {
                    java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer(string3);
                    stringBuffer7.append(this.f210981a2);
                    string3 = stringBuffer7.toString();
                }
                i1Var.i(string3);
                i1Var.g(java.lang.Boolean.FALSE);
            } else {
                if (!this.P) {
                    java.lang.Class<n13.a0> cls2 = n13.a0.class;
                    if (!this.S) {
                        selectConversationUI = this;
                        if (!selectConversationUI.T) {
                            selectConversationUI.Q7(i1Var, str);
                            selectConversationUI.R7(i1Var);
                            i1Var.g(java.lang.Boolean.TRUE);
                            i1Var.f369137d = M7();
                            i1Var.a(new dk5.s2(selectConversationUI, intent, str));
                            i1Var.k();
                        }
                        java.lang.String stringExtra = getIntent().getStringExtra("custom_send_text");
                        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Conv_User");
                        dk5.i3 i3Var = new dk5.i3(this, (java.util.HashMap) getIntent().getSerializableExtra("appbrand_params"), stringExtra, getIntent().getStringExtra("kWeAppSourceUsername"), stringExtra2, intent);
                        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                        ne5.a aVar3 = new ne5.a();
                        aVar3.n(stringExtra);
                        ((dk5.y) ((n13.a0) i95.n0.c(cls2))).wi(selectConversationUI, aVar3, stringExtra2, n13.t.a(i3Var));
                        return;
                    }
                    java.lang.String stringExtra3 = getIntent().getStringExtra("Select_Conv_User");
                    java.lang.String stringExtra4 = getIntent().getStringExtra("kWeAppSourceUsername");
                    java.lang.String stringExtra5 = getIntent().getStringExtra("KSelectUserList");
                    java.lang.String str13 = stringExtra5 == null ? "" : stringExtra5;
                    java.lang.String[] split = str13.split(",");
                    com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(stringExtra3);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.String stringExtra6 = getIntent().getStringExtra("custom_send_text");
                    try {
                        int length = split.length;
                        int i17 = 0;
                        while (i17 < length) {
                            int i18 = length;
                            java.lang.String str14 = split[i17];
                            if ("notify@all".equals(str14)) {
                                cls = cls2;
                                try {
                                    str3 = str2;
                                    t17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a6j, str2);
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandNotifyGroupMembers e:%s", e);
                                    java.lang.String str15 = stringExtra6;
                                    dk5.h3 h3Var = new dk5.h3(this, str15, stringExtra4, str13, split, arrayList, stringExtra3, intent);
                                    ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                                    ne5.a aVar4 = new ne5.a();
                                    aVar4.n(str15);
                                    ((dk5.y) ((n13.a0) i95.n0.c(cls))).wi(this, aVar4, stringExtra3, n13.t.a(h3Var));
                                    return;
                                }
                            } else {
                                str3 = str2;
                                cls = cls2;
                                t17 = c01.e2.t(z07, str14, false);
                            }
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(t17)) {
                                arrayList.add(nm5.j.c(t17, str14));
                                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra6)) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.SelectConversationUI", "customText is null");
                                } else if ("notify@all".equals(str14)) {
                                    stringExtra6 = stringExtra6.replace("notify@all", t17 + (char) 8197);
                                } else {
                                    stringExtra6 = stringExtra6.replace("@" + str14, "@" + t17).replace("@" + t17, "@" + t17 + (char) 8197);
                                }
                            }
                            i17++;
                            length = i18;
                            cls2 = cls;
                            str2 = str3;
                        }
                        cls = cls2;
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        cls = cls2;
                    }
                    java.lang.String str152 = stringExtra6;
                    dk5.h3 h3Var2 = new dk5.h3(this, str152, stringExtra4, str13, split, arrayList, stringExtra3, intent);
                    ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                    ne5.a aVar42 = new ne5.a();
                    aVar42.n(str152);
                    ((dk5.y) ((n13.a0) i95.n0.c(cls))).wi(this, aVar42, stringExtra3, n13.t.a(h3Var2));
                    return;
                }
                i1Var.i(getResources().getString(com.tencent.mm.R.string.f490537xw));
                i1Var.g(java.lang.Boolean.FALSE);
            }
        }
        selectConversationUI = this;
        i1Var.f369137d = M7();
        i1Var.a(new dk5.s2(selectConversationUI, intent, str));
        i1Var.k();
    }

    public final void I7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "doSendCardOrQRCode2CallSelectContactUI");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.SelectContactUI.class);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206785f);
        intent.putExtra("list_type", 3);
        intent.putExtra("be_send_card_name", this.A1);
        intent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
        intent.putExtra("Add_SendCard", true);
        intent.putExtra("titile", getString(com.tencent.mm.R.string.f489934fx));
        intent.putExtra("Forbid_SelectChatRoom", this.f210992l1 && com.tencent.mm.storage.z3.m4(this.A1));
        getContext().startActivityForResult(intent, 3);
    }

    public final android.graphics.Bitmap K7() {
        com.tencent.mm.storage.f9 f9Var = this.S1;
        if (f9Var == null) {
            return null;
        }
        java.lang.String z07 = f9Var.z0();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap J3 = m11.b1.Di().J3(this.S1, z07);
        if (J3 == null) {
            return J3;
        }
        try {
            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(z07).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            return com.tencent.mm.sdk.platformtools.x.w0(J3, orientationInDegree);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectConversationUI", th6, "unexpected exception.", new java.lang.Object[0]);
            return J3;
        }
    }

    public final java.lang.String L7(int i17) {
        java.lang.String str;
        java.lang.String str2;
        ot0.q v17;
        java.lang.String str3;
        if (i17 == 1) {
            str = this.Q1;
        } else {
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SelectConversationUI", "getMsgType: Parameter flag error ");
                return "0";
            }
            str = this.R1;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.P1)) {
            com.tencent.mm.storage.f9 f9Var = this.S1;
            if (f9Var != null) {
                if (i17 == 1) {
                    str2 = f9Var.k2() ? java.lang.String.valueOf(49) : java.lang.String.valueOf(this.S1.getType());
                } else {
                    ot0.q v18 = ot0.q.v(f9Var.j());
                    if (v18 != null) {
                        str2 = java.lang.String.valueOf(v18.f348666i);
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.X1) && (v17 = ot0.q.v(this.X1)) != null) {
                        str2 = java.lang.String.valueOf(v17.f348666i);
                    }
                }
            }
            str2 = "0";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (com.tencent.mm.storage.f9 f9Var2 : this.P1) {
                if (f9Var2 != null) {
                    if (i17 == 1) {
                        str3 = f9Var2.k2() ? java.lang.String.valueOf(49) : java.lang.String.valueOf(f9Var2.getType());
                    } else {
                        ot0.q v19 = ot0.q.v(f9Var2.j());
                        if (v19 != null) {
                            str3 = java.lang.String.valueOf(v19.f348666i);
                        }
                    }
                    sb6.append(str3);
                    sb6.append("｜");
                }
                str3 = "0";
                sb6.append(str3);
                sb6.append("｜");
            }
            str2 = sb6.substring(0, sb6.length() - 1);
        }
        if (str2.equals("0")) {
            int i18 = this.L1;
            if (i18 == 18) {
                str2 = i17 == 1 ? java.lang.String.valueOf(49) : java.lang.String.valueOf(51);
            } else if (i18 == 42) {
                str2 = i17 == 1 ? java.lang.String.valueOf(49) : java.lang.String.valueOf(129);
            } else if (i18 == 36) {
                str2 = i17 == 1 ? java.lang.String.valueOf(49) : java.lang.String.valueOf(106);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return "0";
        }
        if (i17 == 1) {
            this.Q1 = str2;
        } else {
            this.R1 = str2;
        }
        return str2;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.F1.remove(str);
            ((java.util.HashMap) this.G1).remove(str);
            b7().notifyDataSetChanged();
            java.util.List list = this.F1;
            com.tencent.mm.ui.contact.p6 p6Var = this.f210982b2;
            if (p6Var != null) {
                p6Var.w(list);
            }
            e8();
        }
    }

    public final java.lang.String M7() {
        java.lang.String stringExtra = getIntent().getStringExtra("KSendWording");
        return com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? getString(com.tencent.mm.R.string.f490551ya) : stringExtra;
    }

    public final android.graphics.Bitmap O7() {
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        com.tencent.mm.storage.f9 f9Var = this.S1;
        java.lang.String tj6 = ((k90.b) u0Var).tj(f9Var, f9Var.z0(), false);
        if (tj6 != null) {
            return com.tencent.mm.sdk.platformtools.x.T(tj6, 1080, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, true);
        }
        java.lang.String str = this.Y1;
        if (!d61.c.a(str)) {
            return com.tencent.mm.sdk.platformtools.x.T(str, 1080, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, true);
        }
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        return ai3.d.p(str);
    }

    public final void P7(android.content.Intent intent, android.content.Intent intent2) {
        java.util.Objects.toString(intent2);
        intent2.setExtrasClassLoader(getClass().getClassLoader());
        intent2.putExtras(intent.getExtras());
        startActivityForResult(intent2, 2);
        db5.f.a(getContext(), intent2);
    }

    public final void Q7(r35.i1 i1Var, java.lang.String str) {
        android.os.Bundle bundle;
        java.lang.String string;
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        r45.lv2 lv2Var;
        r45.hd2 hd2Var;
        r35.i1 i1Var2 = i1Var;
        switch (this.L1) {
            case 0:
            case 16:
                android.graphics.Bitmap K7 = K7();
                if (K7 == null && this.Y1 != null) {
                    android.graphics.Bitmap j07 = com.tencent.mm.sdk.platformtools.x.j0(this.Y1, 140, 140, i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a));
                    int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(this.Y1).getOrientationInDegree();
                    if (orientationInDegree < 0) {
                        orientationInDegree = 0;
                    }
                    K7 = com.tencent.mm.sdk.platformtools.x.w0(j07, orientationInDegree);
                }
                i1Var2.d(K7, 3);
                return;
            case 1:
                i1Var2.d(O7(), 2);
                return;
            case 2:
            case 10:
                ot0.q v17 = ot0.q.v(this.X1);
                if (this.S1.t2() && v17 == null) {
                    v17 = ot0.q.v(this.X1);
                }
                if (v17 == null) {
                    if (this.Z1 != null) {
                        java.lang.String string2 = getResources().getString(com.tencent.mm.R.string.f490596zi);
                        java.lang.String str4 = this.Z1;
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(string2);
                        stringBuffer.append(str4);
                        i1Var2.i(stringBuffer.toString());
                        return;
                    }
                    return;
                }
                java.lang.String str5 = v17.f348654f;
                if (com.tencent.mm.ui.chatting.a4.b(this.S1, this.f211011y1)) {
                    string = getResources().getString(com.tencent.mm.R.string.f490094kq);
                } else {
                    int i17 = v17.f348666i;
                    if (i17 == 5) {
                        string = getResources().getString(com.tencent.mm.R.string.f490589za);
                    } else if (ez.v0.f257777a.j(java.lang.Integer.valueOf(i17))) {
                        string = getResources().getString(com.tencent.mm.R.string.f490430uv);
                    } else {
                        int i18 = v17.f348666i;
                        if (i18 == 24) {
                            string = getResources().getString(com.tencent.mm.R.string.f490506x0);
                            com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
                            am.eq eqVar = recordOperationEvent.f54663g;
                            eqVar.f6583a = 0;
                            eqVar.f6584b = v17.f348663h0;
                            recordOperationEvent.e();
                            r45.ul5 ul5Var = recordOperationEvent.f54664h.f6692a;
                            if (ul5Var != null) {
                                str2 = ul5Var.f387464e;
                                java.lang.String str6 = v17.f348658g;
                                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                if (str2 == null) {
                                    str2 = str6;
                                }
                            } else {
                                str2 = null;
                            }
                            str5 = !com.tencent.mm.sdk.platformtools.t8.K0(str2) ? str2.replaceAll("\n", " ") : str2;
                        } else if (i18 == 19) {
                            string = getResources().getString(com.tencent.mm.R.string.f490535xv);
                        } else if (v17.r()) {
                            com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = (com.tencent.mm.pluginsdk.ui.tools.i0) v17.y(com.tencent.mm.pluginsdk.ui.tools.i0.class);
                            if (i0Var != null) {
                                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                                m11.l0 Di = m11.b1.Di();
                                com.tencent.mm.storage.f9 f9Var = this.S1;
                                java.lang.String D2 = Di.D2(f9Var, f9Var.z0(), true);
                                com.tencent.mm.vfs.w6.j(D2);
                                com.tencent.mm.vfs.w6.j(this.W1);
                                if (com.tencent.mm.sdk.platformtools.t8.K0(D2) || !com.tencent.mm.vfs.w6.j(D2)) {
                                    D2 = this.W1;
                                }
                                i1Var2.c(r35.f4.b(this, D2, v17, i0Var));
                                i1Var2.h(false);
                                return;
                            }
                            string = getResources().getString(com.tencent.mm.R.string.f490494wn);
                        } else {
                            int i19 = v17.f348666i;
                            if (i19 == 93) {
                                il4.a aVar = (il4.a) v17.y(il4.a.class);
                                if (aVar != null) {
                                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                                    m11.l0 Di2 = m11.b1.Di();
                                    com.tencent.mm.storage.f9 f9Var2 = this.S1;
                                    java.lang.String D22 = Di2.D2(f9Var2, f9Var2.z0(), true);
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(D22)) {
                                        com.tencent.mm.vfs.w6.j(D22);
                                    }
                                    com.tencent.mm.storage.f9 f9Var3 = this.S1;
                                    android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.cmx, null);
                                    com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = (com.tencent.mm.plugin.ting.widget.TingCategoryView) inflate.findViewById(com.tencent.mm.R.id.o9e);
                                    tingCategoryView.setContainerBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478492d));
                                    tingCategoryView.b(il4.d.a(this, aVar, v17, f9Var3));
                                    i1Var2.c(inflate);
                                    i1Var2.h(false);
                                    return;
                                }
                                string = getResources().getString(com.tencent.mm.R.string.f490572yu);
                            } else if (i19 == 118) {
                                string = getResources().getString(com.tencent.mm.R.string.n3s);
                            } else if (i19 == 4) {
                                string = getResources().getString(com.tencent.mm.R.string.f490596zi);
                            } else if (i19 == 8) {
                                string = getResources().getString(com.tencent.mm.R.string.f490384th);
                            } else if (i19 == 44) {
                                string = com.tencent.mm.sdk.platformtools.t8.K0(v17.f348726x) ? getResources().getString(com.tencent.mm.R.string.f490562yk) : com.tencent.mm.sdk.platformtools.t8.z1(getResources().getString(com.tencent.mm.R.string.f490395ts), v17.f348726x);
                            } else if (i19 == 33 || i19 == 36 || i19 == 48) {
                                int i27 = v17.f348681l2;
                                if (i27 == 2 || i27 == 3 || i19 == 36 || i19 == 48) {
                                    int i28 = v17.f348697p2;
                                    if (v17.s(false)) {
                                        bundle = new android.os.Bundle();
                                        bundle.putInt("key_biz", i28);
                                        bundle.putString("key_footer_text_default", v17.f348726x);
                                        bundle.putString("key_footer_text", v17.l(getContext(), false));
                                        bundle.putString("key_footer_icon", v17.B2);
                                    } else if (v17.f348666i == 48) {
                                        bundle = new android.os.Bundle();
                                        bundle.putBoolean("is_video", true);
                                        bundle.putString("key_footer_icon", v17.B2);
                                        bundle.putString("key_footer_text", v17.f348726x);
                                    } else {
                                        com.tencent.mars.xlog.Log.w("MicroMsg.SelectConversationUI", "fake native share msg biz invalidate, biz: %d.", java.lang.Integer.valueOf(i28));
                                        bundle = null;
                                    }
                                    android.view.View wi6 = ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).wi(this, bundle, str == null ? false : c01.e2.Z(str), new dk5.j3(this));
                                    i1Var2.c(wi6);
                                    i1Var2.g(java.lang.Boolean.TRUE);
                                    i1Var2.h(false);
                                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                                    m11.l0 Di3 = m11.b1.Di();
                                    com.tencent.mm.storage.f9 f9Var4 = this.S1;
                                    java.lang.String D23 = Di3.D2(f9Var4, f9Var4.z0(), true);
                                    java.lang.String a17 = ik1.i0.a(this);
                                    android.os.Bundle bundle2 = new android.os.Bundle();
                                    bundle2.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, v17.f348677k2);
                                    bundle2.putString("msg_id", java.lang.String.format("%d-%d", java.lang.Integer.valueOf(v17.f348737z2), 0));
                                    bundle2.putInt("msg_pkg_type", v17.f348737z2);
                                    bundle2.putInt("pkg_version", 0);
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(D23)) {
                                        bundle2.putString("image_url", "file://" + D23);
                                    }
                                    ot0.a aVar2 = (ot0.a) v17.y(ot0.a.class);
                                    if (aVar2 != null) {
                                        bundle2.putBoolean("is_dynamic_page", aVar2.f348346b);
                                        bundle2.putString("cache_key", aVar2.f348347c);
                                        bundle2.putInt("sub_type", aVar2.f348366v);
                                    }
                                    bundle2.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, v17.f348654f);
                                    bundle2.putString("msg_path", v17.f348669i2);
                                    ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Ri(a17, wi6, bundle2, null);
                                    i1Var2.f369138e = new dk5.k3(this, a17, wi6);
                                    return;
                                }
                                string = getResources().getString(com.tencent.mm.R.string.f490094kq);
                            } else {
                                string = (i19 == 53 || i19 == 57) ? "" : i19 == 101 ? getResources().getString(com.tencent.mm.R.string.f490589za) : getResources().getString(com.tencent.mm.R.string.f490009ic);
                            }
                        }
                    }
                }
                if (v17.f348666i == 48) {
                    string = getResources().getString(com.tencent.mm.R.string.f490450ve);
                }
                int i29 = v17.f348666i;
                if (i29 == 46) {
                    i1Var2.d(K7(), 2);
                } else if (i29 == 69) {
                    c53.a aVar3 = (c53.a) v17.y(c53.a.class);
                    if (aVar3 != null) {
                        i1Var2.i(getResources().getString(com.tencent.mm.R.string.f490449vd) + aVar3.f38645c);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar3.f38644b)) {
                            java.lang.String str7 = aVar3.f38644b;
                            com.tencent.mm.ui.widget.dialog.a aVar4 = i1Var2.f369135b.f211821b;
                            aVar4.f211728r = str7;
                            aVar4.U = 8;
                        }
                    }
                } else {
                    i1Var2.i(string + (str5 != null ? str5 : ""));
                    java.lang.String str8 = v17.f348734z;
                    if (str8 != null) {
                        com.tencent.mm.ui.widget.dialog.a aVar5 = i1Var2.f369135b.f211821b;
                        aVar5.f211728r = str8;
                        aVar5.U = 8;
                    }
                }
                if (this.E1 && 10 == this.L1 && this.H1) {
                    com.tencent.mm.modelstat.b.b(this.S1, 8);
                    return;
                }
                return;
            case 3:
                if (this.f210981a2 != null) {
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(getResources().getString(com.tencent.mm.R.string.f490430uv));
                    stringBuffer2.append(this.f210981a2);
                    i1Var2.i(stringBuffer2.toString());
                    return;
                }
                return;
            case 4:
                i1Var2.i(this.X1);
                i1Var2.f369135b.f211821b.Q = 2;
                return;
            case 5:
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.T1)) {
                    i1Var2.e(this.T1);
                    return;
                }
                java.lang.String z07 = this.S1.z0();
                if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
                    i1Var2.e(this.Y1);
                    return;
                } else {
                    i1Var2.e(z07);
                    return;
                }
            case 6:
            case 7:
            case 14:
            case 15:
            case 17:
            case 24:
            case 26:
            case 34:
            case 41:
            default:
                return;
            case 8:
                com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(this.X1);
                this.A1 = D3.f196358a;
                this.B1 = D3.f196359b;
                int i37 = D3.f196374q;
                java.util.Set set = c01.e2.f37117a;
                this.C1 = java.lang.Boolean.valueOf(com.tencent.mm.storage.z3.D3(i37));
                T7(i1Var2, this.A1);
                return;
            case 9:
                i1Var2.i(getContext().getString(com.tencent.mm.R.string.f490470vz) + ((com.tencent.mm.storage.g9) c01.d9.b().u()).H6(this.X1).f193779e);
                return;
            case 11:
                i1Var2.d(O7(), 2);
                return;
            case 12:
                java.util.List list = com.tencent.mm.ui.chatting.x3.f(getContext()).f54663g.f6595m;
                java.lang.String string3 = getContext().getString(com.tencent.mm.R.string.f492837i25, java.lang.Integer.valueOf(list != null ? list.size() : 0));
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer(getResources().getString(com.tencent.mm.R.string.f490491wk));
                stringBuffer3.append(string3);
                i1Var2.i(stringBuffer3.toString());
                return;
            case 13:
                java.lang.String str9 = com.tencent.mm.ui.chatting.x3.f(getContext()).f54664h.f6697f.f360129d;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str10 = str9 != null ? str9 : "";
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer(getResources().getString(com.tencent.mm.R.string.f490492wl));
                stringBuffer4.append(str10);
                i1Var2.i(stringBuffer4.toString());
                if (this.E1 && this.H1) {
                    com.tencent.mm.modelstat.b.b(this.S1, 8);
                    return;
                }
                return;
            case 18:
            case 36:
            case 42:
                java.lang.String str11 = this.X1;
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.i iVar = (zy2.i) ot0.q.v(str11).y(zy2.i.class);
                if (iVar != null) {
                    yo0.f fVar = new yo0.f();
                    fVar.f464078b = true;
                    fVar.f464077a = true;
                    fVar.f464087k = true;
                    yo0.i a18 = fVar.a();
                    android.view.View inflate2 = android.view.View.inflate(this, com.tencent.mm.R.layout.cmz, null);
                    android.view.View findViewById = inflate2.findViewById(com.tencent.mm.R.id.edt);
                    vo0.e.f438468b.c(iVar.f(), (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.e_e), a18);
                    android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.bnp);
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String g17 = iVar.g();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, g17));
                    android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.bnk);
                    imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_channel, i65.a.d(imageView.getContext(), com.tencent.mm.R.color.f478526a7)));
                    android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.f484975g41);
                    android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.f484868fs2);
                    com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView imageIndicatorView = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) findViewById.findViewById(com.tencent.mm.R.id.bnn);
                    android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.ebv);
                    android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.bne);
                    android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.fsk);
                    android.view.View findViewById3 = findViewById.findViewById(com.tencent.mm.R.id.f484452eb5);
                    if (iVar.f477411b.getInteger(5) == 1) {
                        imageView2.setVisibility(8);
                        android.widget.TextView textView3 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.g3z);
                        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String string4 = iVar.f477411b.getString(4);
                        ((ke0.e) xVar2).getClass();
                        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, string4));
                        textView3.setVisibility(0);
                        textView2.setVisibility(8);
                    } else {
                        if (iVar.f477411b.getList(7).size() > 0) {
                            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                            ya2.l.f460502a.h(((r45.iv2) iVar.f477411b.getList(7).get(0)).getString(2), imageView2, mn2.f1.B);
                        }
                        textView2.setVisibility(8);
                    }
                    if (iVar.f477411b.getInteger(5) == 4 || iVar.f477411b.getInteger(5) == 6) {
                        imageView3.setVisibility(0);
                        if (imageIndicatorView != null) {
                            imageIndicatorView.setVisibility(8);
                        }
                    } else if (iVar.f477411b.getInteger(5) == 2) {
                        imageView3.setVisibility(8);
                        if (imageIndicatorView != null) {
                            imageIndicatorView.setVisibility(0);
                            imageIndicatorView.f170651e = java.lang.Math.min(iVar.f477411b.getInteger(6), ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ui());
                        }
                    } else {
                        imageView3.setVisibility(8);
                        if (imageIndicatorView != null) {
                            imageIndicatorView.setVisibility(8);
                        }
                    }
                    if ((iVar.f477411b.getInteger(25) & 4) > 0 && findViewById2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ri() == 1) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (imageIndicatorView != null) {
                            imageIndicatorView.f170655i = com.tencent.mm.R.color.BW_100_Alpha_0_3;
                            imageIndicatorView.f170654h = com.tencent.mm.R.color.f478553an;
                        }
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById3, "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMsgContentFinderObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479655jf);
                    r45.iv2 iv2Var = !iVar.f477411b.getList(7).isEmpty() ? (r45.iv2) iVar.f477411b.getList(7).get(0) : null;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate2.findViewById(com.tencent.mm.R.id.bnh);
                    if (iv2Var != null) {
                        float f17 = dimension;
                        int i38 = (int) ((iv2Var.getFloat(4) * f17) / iv2Var.getFloat(3));
                        int i39 = (int) ((f17 * 4.0f) / 3.0f);
                        if (dimension > i38) {
                            imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i39, dimension));
                            if (linearLayout != null) {
                                android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                layoutParams.width = i39;
                                linearLayout.setLayoutParams(layoutParams);
                            }
                            findViewById.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                        } else {
                            imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(dimension, i39));
                            if (linearLayout != null) {
                                android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                                layoutParams2.width = dimension;
                                linearLayout.setLayoutParams(layoutParams2);
                            }
                            findViewById.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                        }
                    } else {
                        imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(dimension, dimension));
                        findViewById.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                    }
                    int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
                    int a19 = dz2.b.a(iVar.f477411b);
                    java.lang.String b17 = dz2.b.b(iVar.f477411b);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    ya2.m1.f460511a.d(textView, dimension2, imageView4, a19, b17);
                    if (linearLayout != null) {
                        ho.b.b(linearLayout, com.tencent.mm.R.drawable.aci, com.tencent.mm.R.drawable.ach);
                    }
                    i1Var2 = i1Var;
                    i1Var2.c(inflate2);
                    z17 = false;
                } else {
                    z17 = false;
                }
                i1Var2.h(z17);
                return;
            case 19:
                java.lang.String str12 = this.X1;
                boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.z4 z4Var = (zy2.z4) ot0.q.v(str12).y(zy2.z4.class);
                if (z4Var != null) {
                    i1Var2.i(getString(com.tencent.mm.R.string.f490435uy) + z4Var.f477634b);
                    return;
                }
                return;
            case 20:
                java.lang.String str13 = this.X1;
                boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.h hVar = (zy2.h) ot0.q.v(str13).y(zy2.h.class);
                if (hVar != null) {
                    i1Var2.i(getString(com.tencent.mm.R.string.f490438v1) + hVar.f477394e);
                    return;
                }
                return;
            case 21:
            case 25:
                java.lang.String str14 = this.X1;
                boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.m mVar = (zy2.m) ot0.q.v(str14).y(zy2.m.class);
                if (mVar == null || mVar.f477457b == null) {
                    return;
                }
                java.lang.String string5 = getString(com.tencent.mm.R.string.f490432ux);
                if (mVar.f477457b.getInteger(1) == 1) {
                    str3 = string5 + getString(com.tencent.mm.R.string.f8m, mVar.f477457b.getString(0));
                } else if (mVar.f477457b.getInteger(1) == 4) {
                    str3 = string5 + mVar.f477457b.getString(3);
                } else {
                    str3 = string5 + mVar.f477457b.getString(0);
                }
                i1Var2.i(str3);
                return;
            case 22:
                java.lang.String str15 = this.X1;
                boolean z38 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.f fVar2 = (zy2.f) ot0.q.v(str15).y(zy2.f.class);
                if (fVar2 != null) {
                    android.view.View inflate3 = android.view.View.inflate(this, com.tencent.mm.R.layout.cmy, null);
                    android.widget.TextView textView4 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.obc);
                    zy2.x6 x6Var = (zy2.x6) inflate3.findViewById(com.tencent.mm.R.id.f484350dz4);
                    x6Var.setItemViewWidth(i65.a.b(inflate3.getContext(), 70));
                    java.util.LinkedList list2 = fVar2.f477382b.getList(3);
                    java.util.List subList = list2.subList(0, java.lang.Math.min(4, list2.size()));
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    for (int i47 = 0; i47 < subList.size(); i47++) {
                        r45.mb4 mb4Var = new r45.mb4();
                        mb4Var.set(0, (java.lang.String) fVar2.f477382b.getList(3).get(i47));
                        mb4Var.set(18, (java.lang.String) fVar2.f477382b.getList(4).get(i47));
                        mb4Var.set(19, mb4Var.getString(18));
                        mb4Var.set(1, mb4Var.getString(0));
                        linkedList.add(mb4Var);
                    }
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    x6Var.setAdapter(new tw2.e(linkedList, false));
                    textView4.setText(fVar2.f477382b.getString(1));
                    i1Var2.c(inflate3);
                }
                i1Var2.h(false);
                return;
            case 23:
            case 29:
            case 31:
                java.lang.String str16 = this.X1;
                boolean z39 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.c cVar = (zy2.c) ot0.q.v(str16).y(zy2.c.class);
                if (cVar != null) {
                    i1Var2.c(S7(cVar));
                }
                i1Var2.h(false);
                return;
            case 27:
            case 32:
                java.lang.String str17 = this.X1;
                boolean z47 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.e eVar = (zy2.e) ot0.q.v(str17).y(zy2.e.class);
                if (eVar == null || ((r45.ht0) eVar.f477372b.getCustom(6)) == null) {
                    return;
                }
                java.lang.String string6 = getString(com.tencent.mm.R.string.f490432ux);
                i1Var2.i(eVar.f477372b.getInteger(1) == 7 ? string6 + ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).pj((r45.ht0) eVar.f477372b.getCustom(6)) : string6 + eVar.f477372b.getString(0));
                return;
            case 28:
                java.lang.String str18 = this.X1;
                boolean z48 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.k kVar = (zy2.k) ot0.q.v(str18).y(zy2.k.class);
                if (kVar == null || (lv2Var = kVar.f477427b) == null) {
                    return;
                }
                i1Var2.i(lv2Var.getString(2));
                return;
            case 30:
                java.lang.String str19 = this.X1;
                boolean z49 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.l lVar = (zy2.l) ot0.q.v(str19).y(zy2.l.class);
                if (lVar != null) {
                    zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                    r45.br2 br2Var = lVar.f477449b;
                    ((c61.l7) b6Var).getClass();
                    i1Var2.c(com.tencent.mm.plugin.finder.view.xi.f133331a.b(this, br2Var));
                }
                i1Var2.h(false);
                return;
            case 33:
            case 37:
                java.lang.String str20 = this.X1;
                boolean z57 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                hs.a aVar6 = (hs.a) ot0.q.v(str20).y(hs.a.class);
                if (aVar6 != null) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    i1Var2.c(com.tencent.mm.plugin.finder.view.fj.f132109a.a(this, aVar6));
                    return;
                }
                return;
            case 35:
                java.lang.String str21 = this.X1;
                boolean z58 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.h hVar2 = (zy2.h) ot0.q.v(str21).y(zy2.h.class);
                if (hVar2 != null) {
                    i1Var2.i(getString(com.tencent.mm.R.string.f490437v0) + hVar2.f477394e);
                    return;
                }
                return;
            case 38:
                java.lang.String str22 = this.X1;
                boolean z59 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.d dVar = (zy2.d) ot0.q.v(str22).y(zy2.d.class);
                if (dVar == null || (hd2Var = dVar.f477371b) == null) {
                    return;
                }
                java.lang.String string7 = hd2Var.getString(0);
                i1Var2.i(string7 != null ? string7 : "");
                return;
            case 39:
                java.lang.String str23 = this.X1;
                boolean z66 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                zy2.e eVar2 = (zy2.e) ot0.q.v(str23).y(zy2.e.class);
                if (eVar2 != null) {
                    i1Var2.i(getString(com.tencent.mm.R.string.f490432ux) + eVar2.f477372b.getString(0));
                    return;
                }
                return;
            case 40:
                ot0.q v18 = ot0.q.v(this.X1);
                zy2.g gVar = (zy2.g) v18.y(zy2.g.class);
                if (gVar != null) {
                    java.lang.String tail = v18.f348666i == 119 ? getString(com.tencent.mm.R.string.nyc) : getString(com.tencent.mm.R.string.njl);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    kotlin.jvm.internal.o.g(tail, "tail");
                    i1Var2.c(com.tencent.mm.plugin.finder.view.ui.f133181a.a(this, gVar.f477383b, tail));
                }
                i1Var2.h(false);
                return;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                java.lang.String str24 = this.X1;
                boolean z67 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                ot0.h0 h0Var = (ot0.h0) ot0.q.v(str24).y(ot0.h0.class);
                if (h0Var != null) {
                    i1Var2.i(getString(((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi() ? com.tencent.mm.R.string.n8y : com.tencent.mm.R.string.v_) + h0Var.f348483c);
                    return;
                }
                return;
        }
    }

    public final void R7(r35.i1 i1Var) {
        int i17;
        int i18 = this.L1;
        if (i18 != 0 && i18 != 1) {
            if (i18 != 2) {
                if (i18 == 3) {
                    i1Var.b(new dk5.y3(this));
                    return;
                }
                if (i18 == 4) {
                    i1Var.b(new dk5.m3(this));
                    return;
                }
                if (i18 != 16) {
                    switch (i18) {
                        case 9:
                            if (c01.d9.b().u() == null) {
                                return;
                            }
                            com.tencent.mm.storage.b9 H6 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).H6(this.X1);
                            i1Var.b(new dk5.o3(this, H6, H6.f193779e));
                            return;
                        case 10:
                            break;
                        case 11:
                            break;
                        case 12:
                            com.tencent.mm.ui.chatting.x3.f(getContext());
                            return;
                        case 13:
                            i1Var.b(new dk5.x3(this));
                            return;
                        default:
                            return;
                    }
                }
            }
            java.lang.String str = this.X1;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            ot0.q v17 = ot0.q.v(str);
            if (v17 == null) {
                return;
            }
            if ((v17.f348666i == 5 && !com.tencent.mm.ui.chatting.a4.b(this.S1, this.f211011y1)) || (i17 = v17.f348666i) == 69) {
                i1Var.b(new dk5.p3(this, v17.f348674k));
                return;
            }
            if (ez.v0.f257777a.j(java.lang.Integer.valueOf(i17))) {
                i1Var.b(new dk5.q3(this));
                return;
            }
            int i19 = v17.f348666i;
            if (i19 == 24) {
                i1Var.b(new dk5.r3(this, v17));
                return;
            }
            if (i19 == 19) {
                i1Var.b(new dk5.s3(this, v17));
                return;
            }
            if (v17.r()) {
                i1Var.b(new dk5.t3(this, v17));
                return;
            }
            int i27 = v17.f348666i;
            if (i27 == 4) {
                i1Var.b(new dk5.u3(this));
                return;
            } else {
                if (i27 == 53 || i27 == 57) {
                    i1Var.b(new dk5.v3(this, v17));
                    return;
                }
                return;
            }
        }
        i1Var.b(new dk5.n3(this));
    }

    public final android.view.View S7(zy2.c cVar) {
        int i17;
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.f464087k = true;
        yo0.i a17 = fVar.a();
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f489457cn0, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.edt);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.eby);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.e_e);
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.fvb);
        findViewById.findViewById(com.tencent.mm.R.id.g2v);
        vo0.e eVar = vo0.e.f438467a;
        vo0.a aVar = vo0.e.f438468b;
        java.lang.String string = cVar.f477359b.getString(11);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        aVar.c(string, imageView2, a17);
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.f484459ec1);
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.f484460ec2);
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.ebz);
        imageView4.setImageDrawable(com.tencent.mm.ui.uk.e(imageView4.getContext(), com.tencent.mm.R.raw.icons_filled_channel, i65.a.d(imageView4.getContext(), com.tencent.mm.R.color.f478526a7)));
        if (cVar.f477359b.getString(21) == null || android.text.TextUtils.isEmpty(cVar.f477359b.getString(21))) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string2 = cVar.f477359b.getString(3);
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, string2));
        } else {
            textView.setText(cVar.f477359b.getString(21));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.ebv);
        if (cVar.f477359b.getString(4) == null || cVar.f477359b.getString(4).isEmpty() || !((r40.i) ((tc.e) i95.n0.c(tc.e.class))).wi()) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string3 = cVar.f477359b.getString(4);
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, string3));
        }
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById.findViewById(com.tencent.mm.R.id.f484975g41);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.e_l);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById.findViewById(com.tencent.mm.R.id.ebw);
        android.view.View findViewById3 = findViewById.findViewById(com.tencent.mm.R.id.f484452eb5);
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).yj(textView, imageView, cVar, 0.0f);
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Aj(imageView3, cVar.f477359b.getString(40), 1.0f, null);
        if (linearLayout != null) {
            ho.b.b(linearLayout, com.tencent.mm.R.drawable.aci, com.tencent.mm.R.drawable.ach);
        }
        if (cVar.f477359b.getInteger(35) == 1) {
            vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
            java.lang.String string4 = cVar.f477359b.getString(5);
            if (string4 == null) {
                string4 = "";
            }
            ((c61.i8) i5Var).Bi(string4, imageView5, mn2.f1.B);
            textView3.setText(cVar.f477359b.getString(36));
            textView3.setVisibility(0);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l lVar = ya2.l.f460502a;
            java.lang.String string5 = cVar.f477359b.getString(5);
            if (string5 == null) {
                string5 = "";
            }
            lVar.h(string5, imageView5, mn2.f1.B);
            textView3.setVisibility(8);
        }
        if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ri() == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderLiveObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderLiveObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderLiveObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderLiveObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479655jf);
        int i18 = (int) (dimension * 1.3333334f);
        imageView5.setLayoutParams(new android.widget.FrameLayout.LayoutParams(dimension, i18));
        findViewById2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(dimension, i18));
        if (cVar.f477359b.getString(28) != null && !cVar.f477359b.getString(28).isEmpty() && java.util.Objects.equals(cVar.f477359b.getString(31), "1")) {
            android.widget.ImageView imageView6 = (android.widget.ImageView) findViewById2.findViewById(com.tencent.mm.R.id.fv8);
            android.widget.ImageView imageView7 = (android.widget.ImageView) findViewById2.findViewById(com.tencent.mm.R.id.fv9);
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk(imageView6, qs5.y.f366475d, com.tencent.mm.R.drawable.c5e);
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk(imageView7, qs5.y.f366476e, com.tencent.mm.R.drawable.c5f);
            android.widget.TextView textView4 = (android.widget.TextView) findViewById2.findViewById(com.tencent.mm.R.id.fva);
            textView4.setTextSize(1, 14.0f);
            android.widget.TextView textView5 = (android.widget.TextView) findViewById2.findViewById(com.tencent.mm.R.id.fv_);
            textView5.setTextSize(1, 14.0f);
            android.widget.TextView textView6 = (android.widget.TextView) findViewById2.findViewById(com.tencent.mm.R.id.fvc);
            textView6.setTextSize(1, 13.0f);
            com.tencent.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
            com.tencent.mm.ui.bk.r0(textView5.getPaint(), 0.8f);
            com.tencent.mm.ui.bk.r0(textView6.getPaint(), 0.8f);
            if (cVar.f477359b.getString(29) == null || cVar.f477359b.getString(29).isEmpty()) {
                i17 = 8;
                textView5.setVisibility(8);
            } else {
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string6 = cVar.f477359b.getString(29);
                ((ke0.e) xVar3).getClass();
                textView5.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, string6));
                textView5.setVisibility(0);
                i17 = 8;
            }
            java.lang.String string7 = getContext().getResources().getString(com.tencent.mm.R.string.esj, cVar.f477359b.getString(28));
            int b17 = dimension - (i65.a.b(getContext(), 12) * 2);
            java.lang.String replace = string7.replace("\n", "");
            if (new android.text.StaticLayout(replace, 0, replace.length(), textView4.getPaint(), b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                string7 = replace;
            }
            textView4.setText(string7);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderLiveObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/transmit/SelectConversationUI", "initFinderLiveObjectDialog", "(Lcom/tencent/mm/plugin/findersdk/api/AppMSgContentFinderLiveObject;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView5.setVisibility(i17);
        }
        findViewById.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ik(findViewById.findViewById(com.tencent.mm.R.id.f4x), false, cVar.f477359b.getInteger(22), cVar.f477359b);
        ((com.tencent.mm.feature.finder.live.c) ((s40.p0) i95.n0.c(s40.p0.class))).wi(cVar.f477359b.getString(0), cVar.f477359b.getString(2));
        return inflate;
    }

    public final void T7(r35.i1 i1Var, java.lang.String str) {
        ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(str);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B1)) {
            e17 = this.B1;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(J7(this, str, this.X1));
        stringBuffer.append(e17);
        i1Var.i(stringBuffer.toString());
    }

    public boolean U7() {
        return this.D1;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.tools.b9
    public void V5() {
        com.tencent.mm.ui.contact.item.q1 q1Var;
        com.tencent.mm.ui.contact.p6 p6Var = this.f210982b2;
        if (p6Var == null || (q1Var = p6Var.E) == null) {
            return;
        }
        q1Var.i(false);
    }

    public final void V7(java.lang.String str, int i17) {
        Y6();
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView != null) {
            multiSelectContactView.d(str);
        }
        if (!this.F1.contains(str)) {
            this.F1.add(str);
            this.G1.put(str, java.lang.Integer.valueOf(i17));
        } else {
            this.F1.remove(str);
            if (this.G1.containsKey(str)) {
                this.G1.remove(str);
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str = dVar.f206850s;
        int i17 = 0;
        if (str != null && com.tencent.mm.storage.z3.N3(str)) {
            java.util.List<java.lang.String> list = this.F1;
            if (list != null) {
                for (java.lang.String str2 : list) {
                    ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                    if (c01.v1.y(str2)) {
                        i17++;
                    }
                }
            }
            if (i17 != 0) {
                return getString(com.tencent.mm.R.string.f492960ig2, java.lang.Integer.valueOf(i17));
            }
            return null;
        }
        java.lang.String str3 = dVar.f206850s;
        if (str3 == null || !com.tencent.mm.storage.z3.o4(str3)) {
            return null;
        }
        java.util.List list2 = this.F1;
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.storage.z3.p4((java.lang.String) it.next())) {
                    i17++;
                }
            }
        }
        if (i17 != 0) {
            return getString(com.tencent.mm.R.string.f492961ig3, java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    public final void W7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "resetData: recent forward control switch on");
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.F1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectConversationUI", "reportAndStorageRecentForward:  mSelectedUserSet is empty ");
            return;
        }
        for (int i17 = 0; i17 < this.F1.size(); i17++) {
            java.lang.String str = (java.lang.String) this.F1.get(i17);
            java.util.Map map = this.G1;
            int intValue = (map == null || ((java.util.HashMap) map).size() <= 0 || !((java.util.HashMap) this.G1).containsKey(str)) ? 0 : ((java.lang.Integer) ((java.util.HashMap) this.G1).get(str)).intValue();
            if (intValue == 0) {
                intValue = -2;
            }
            Y7(str, intValue);
            com.tencent.mm.ui.contact.k3.a(str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.Q1)) {
            this.Q1 = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.R1)) {
            return;
        }
        this.R1 = null;
    }

    public final void X7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "resetData: recent forward control switch on");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectConversationUI", "reportAndStorageRecentForward:  userName is empty ");
            return;
        }
        com.tencent.mm.ui.contact.k3.a(str);
        Y7(str, this.U1);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.Q1)) {
            this.Q1 = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.R1)) {
            return;
        }
        this.R1 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0143 A[Catch: Exception -> 0x0214, TryCatch #2 {Exception -> 0x0214, blocks: (B:3:0x0006, B:9:0x000f, B:12:0x003c, B:15:0x008a, B:17:0x0090, B:19:0x0094, B:22:0x009d, B:25:0x00b5, B:27:0x00bb, B:29:0x00bf, B:32:0x00c8, B:38:0x0155, B:41:0x0162, B:44:0x016d, B:47:0x0182, B:73:0x00ee, B:76:0x00fc, B:79:0x010a, B:82:0x0111, B:84:0x0117, B:86:0x011b, B:89:0x0124, B:94:0x0130, B:96:0x0136, B:98:0x013a, B:101:0x0143, B:103:0x014b, B:110:0x00f6, B:111:0x00d2, B:113:0x00a7, B:115:0x0048, B:118:0x004e, B:128:0x005f, B:136:0x006e, B:138:0x0072, B:141:0x0077, B:143:0x007b, B:150:0x0022, B:154:0x002a, B:157:0x0032), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b A[Catch: Exception -> 0x0214, TryCatch #2 {Exception -> 0x0214, blocks: (B:3:0x0006, B:9:0x000f, B:12:0x003c, B:15:0x008a, B:17:0x0090, B:19:0x0094, B:22:0x009d, B:25:0x00b5, B:27:0x00bb, B:29:0x00bf, B:32:0x00c8, B:38:0x0155, B:41:0x0162, B:44:0x016d, B:47:0x0182, B:73:0x00ee, B:76:0x00fc, B:79:0x010a, B:82:0x0111, B:84:0x0117, B:86:0x011b, B:89:0x0124, B:94:0x0130, B:96:0x0136, B:98:0x013a, B:101:0x0143, B:103:0x014b, B:110:0x00f6, B:111:0x00d2, B:113:0x00a7, B:115:0x0048, B:118:0x004e, B:128:0x005f, B:136:0x006e, B:138:0x0072, B:141:0x0077, B:143:0x007b, B:150:0x0022, B:154:0x002a, B:157:0x0032), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d2 A[Catch: Exception -> 0x0214, TryCatch #2 {Exception -> 0x0214, blocks: (B:3:0x0006, B:9:0x000f, B:12:0x003c, B:15:0x008a, B:17:0x0090, B:19:0x0094, B:22:0x009d, B:25:0x00b5, B:27:0x00bb, B:29:0x00bf, B:32:0x00c8, B:38:0x0155, B:41:0x0162, B:44:0x016d, B:47:0x0182, B:73:0x00ee, B:76:0x00fc, B:79:0x010a, B:82:0x0111, B:84:0x0117, B:86:0x011b, B:89:0x0124, B:94:0x0130, B:96:0x0136, B:98:0x013a, B:101:0x0143, B:103:0x014b, B:110:0x00f6, B:111:0x00d2, B:113:0x00a7, B:115:0x0048, B:118:0x004e, B:128:0x005f, B:136:0x006e, B:138:0x0072, B:141:0x0077, B:143:0x007b, B:150:0x0022, B:154:0x002a, B:157:0x0032), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7 A[Catch: Exception -> 0x0214, TryCatch #2 {Exception -> 0x0214, blocks: (B:3:0x0006, B:9:0x000f, B:12:0x003c, B:15:0x008a, B:17:0x0090, B:19:0x0094, B:22:0x009d, B:25:0x00b5, B:27:0x00bb, B:29:0x00bf, B:32:0x00c8, B:38:0x0155, B:41:0x0162, B:44:0x016d, B:47:0x0182, B:73:0x00ee, B:76:0x00fc, B:79:0x010a, B:82:0x0111, B:84:0x0117, B:86:0x011b, B:89:0x0124, B:94:0x0130, B:96:0x0136, B:98:0x013a, B:101:0x0143, B:103:0x014b, B:110:0x00f6, B:111:0x00d2, B:113:0x00a7, B:115:0x0048, B:118:0x004e, B:128:0x005f, B:136:0x006e, B:138:0x0072, B:141:0x0077, B:143:0x007b, B:150:0x0022, B:154:0x002a, B:157:0x0032), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8 A[Catch: Exception -> 0x0214, TryCatch #2 {Exception -> 0x0214, blocks: (B:3:0x0006, B:9:0x000f, B:12:0x003c, B:15:0x008a, B:17:0x0090, B:19:0x0094, B:22:0x009d, B:25:0x00b5, B:27:0x00bb, B:29:0x00bf, B:32:0x00c8, B:38:0x0155, B:41:0x0162, B:44:0x016d, B:47:0x0182, B:73:0x00ee, B:76:0x00fc, B:79:0x010a, B:82:0x0111, B:84:0x0117, B:86:0x011b, B:89:0x0124, B:94:0x0130, B:96:0x0136, B:98:0x013a, B:101:0x0143, B:103:0x014b, B:110:0x00f6, B:111:0x00d2, B:113:0x00a7, B:115:0x0048, B:118:0x004e, B:128:0x005f, B:136:0x006e, B:138:0x0072, B:141:0x0077, B:143:0x007b, B:150:0x0022, B:154:0x002a, B:157:0x0032), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bf A[Catch: Exception -> 0x0210, TRY_LEAVE, TryCatch #0 {Exception -> 0x0210, blocks: (B:50:0x01a5, B:52:0x01bf), top: B:49:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y7(java.lang.String r26, int r27) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.SelectConversationUI.Y7(java.lang.String, int):void");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        com.tencent.mm.ui.contact.p6 p6Var = new com.tencent.mm.ui.contact.p6(this, this.f210984d2, this.f210983c2, this.E1, this.Y, this.K1);
        this.f210982b2 = p6Var;
        boolean z17 = com.tencent.mm.ui.chatting.hd.i(getContext()) && !this.f210999p2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "setSupportForwardToWeWork() called with: isSupport = [" + z17 + "]");
        p6Var.H = z17;
        if (this.X == 24 && (com.tencent.mm.ui.contact.i5.d(this.K1, 4) || com.tencent.mm.ui.contact.i5.d(this.K1, 16))) {
            com.tencent.mm.ui.contact.p6 p6Var2 = this.f210982b2;
            p6Var2.I = true;
            p6Var2.s();
            this.f210982b2.f207082J = true;
        }
        if (this.f211001r2) {
            com.tencent.mm.ui.contact.p6 p6Var3 = this.f210982b2;
            p6Var3.I = true;
            p6Var3.s();
            this.f210982b2.f207082J = true;
        }
        com.tencent.mm.ui.contact.p6 p6Var4 = this.f210982b2;
        p6Var4.C = new dk5.w3(this);
        p6Var4.D = new dk5.g4(this);
        return p6Var4;
    }

    public final void Z7(android.content.Intent intent, java.lang.String str, java.util.List list) {
        if (list.size() > 0) {
            intent.putExtra("be_send_card_name", str);
            intent.putExtra("received_card_name", com.tencent.mm.sdk.platformtools.t8.c1(list, ","));
            intent.putExtra("Is_Chatroom", false);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.ui.contact.f5(this, this.f210984d2, this.E1, this.A);
    }

    public final void a8(int i17, android.content.Intent intent) {
        if (this.L1 == 5) {
            if (intent == null) {
                intent = new android.content.Intent();
            }
            intent.putExtra("emoji_thumb_path", this.T1);
            intent.putExtra("emoji_activity_id", getIntent().getStringExtra("emoji_activity_id"));
        }
        if (this.L1 == 30 && intent != null) {
            intent.getStringExtra("Select_Conv_User");
        }
        super.setResult(i17, intent);
    }

    public final void b8(java.lang.String str) {
        try {
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","));
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            java.util.Iterator it = P1.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    if (z17) {
                        stringBuffer.append(",");
                    }
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    stringBuffer.append(c01.a2.e(str2));
                    z17 = true;
                }
            }
            db5.e1.t(this, getString(com.tencent.mm.R.string.j3x, stringBuffer), "", null);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final boolean c8(boolean z17) {
        if (!this.f211002s2) {
            return false;
        }
        if (!z17 ? this.F1.size() > 9 : this.F1.size() >= 9) {
            return false;
        }
        db5.e1.t(getContext(), getString(com.tencent.mm.R.string.ifr, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 9))), "", new dk5.i4(this));
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        int[] intArrayExtra = getIntent().getIntArrayExtra("search_range");
        int i17 = this.X;
        return (i17 == 4 || i17 == 10) ? new int[]{131072} : intArrayExtra != null ? intArrayExtra : super.d7();
    }

    public final void d8() {
        java.lang.String string;
        int i17;
        if (this.E1) {
            string = getString(com.tencent.mm.R.string.ifk);
            i17 = com.tencent.mm.R.raw.icons_filled_contacts;
        } else {
            string = getString(com.tencent.mm.R.string.iew);
            i17 = -1;
        }
        android.widget.TextView textView = this.G;
        if (textView != null) {
            textView.setText(string);
        }
        android.widget.ImageView imageView = this.F;
        if (imageView != null) {
            if (i17 <= 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.F.setImageResource(i17);
            }
        }
    }

    public final void e8() {
        if (U7()) {
            java.util.List list = this.F1;
            if (this.f206456q != null && list != null) {
                u7(list.size());
            }
            java.util.List list2 = this.F1;
            if ((list2 != null && list2.size() > 0) || this.f211001r2) {
                updateOptionMenuText(1, M7() + "(" + this.F1.size() + ")");
                updateOptionMenuStyle(1, com.tencent.mm.ui.fb.GREEN);
                updateOptionMenuListener(1, this.A2, null);
                enableOptionMenu(1, true);
                return;
            }
            boolean z17 = this.E1;
            android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f211014z2;
            com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.ALTER_BTN_BACKGROUND;
            if (z17) {
                updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490563yl));
                updateOptionMenuStyle(1, fbVar);
                updateOptionMenuListener(1, onMenuItemClickListener, null);
                enableOptionMenu(1, true);
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.setVisibility(0);
                }
                i7();
                return;
            }
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490493wm));
            updateOptionMenuStyle(1, fbVar);
            updateOptionMenuListener(1, onMenuItemClickListener, null);
            enableOptionMenu(1, true);
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView2 = this.f206450h;
            if (multiSelectContactView2 != null) {
                multiSelectContactView2.setVisibility(8);
            }
            android.view.View view = this.f206452m;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "showTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "showTopSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f206456q.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_93));
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.tencent.mm.R.anim.f477877e1);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_ui_title");
        return (stringExtra == null || stringExtra.length() <= 0) ? getString(com.tencent.mm.R.string.ig9) : stringExtra;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String userName;
        com.tencent.mm.ui.contact.item.q1 q1Var;
        if (this.E1) {
            int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
            if (headerViewsCount < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
                E7();
                return;
            }
            com.tencent.mm.ui.contact.p4 b76 = b7();
            com.tencent.mm.ui.contact.item.d item = b76.getItem(headerViewsCount);
            if (item == null || (userName = item.f206850s) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "ClickUser=%s", userName);
            if (y7(userName)) {
                return;
            }
            if (!this.F1.contains(userName) && c8(true)) {
                Y6();
                return;
            }
            V7(userName, i17);
            e8();
            com.tencent.mm.ui.contact.p6 p6Var = this.f210982b2;
            if (p6Var != null && (q1Var = p6Var.E) != null) {
                kotlin.jvm.internal.o.g(userName, "userName");
                java.util.ArrayList<com.tencent.mm.ui.contact.v8> arrayList = q1Var.C;
                if (arrayList != null) {
                    for (com.tencent.mm.ui.contact.v8 v8Var : arrayList) {
                        if (kotlin.jvm.internal.o.b(v8Var.f207220d.f207231a, userName)) {
                            v8Var.f207220d.f207233c = !r7.f207233c;
                        }
                    }
                }
            }
            b76.notifyDataSetChanged();
            return;
        }
        if (i17 < this.f206446d.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
            if (this.f210992l1) {
                I7();
                return;
            }
            D7();
        } else {
            com.tencent.mm.ui.contact.item.d dVar = (com.tencent.mm.ui.contact.item.d) this.f206446d.getAdapter().getItem(i17);
            if (dVar == null) {
                return;
            }
            if ((dVar instanceof com.tencent.mm.ui.contact.item.e) && ((com.tencent.mm.ui.contact.item.e) dVar).I == getResources().getString(com.tencent.mm.R.string.f489922fj)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "doCallSelectBizItem");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("list_attr", 16384);
                j45.l.n(this, "brandservice", ".ui.BrandServiceIndexUI", intent, 4);
                this.K = true;
                return;
            }
            if (dVar instanceof com.tencent.mm.ui.contact.item.i0) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.A);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str : ((com.tencent.mm.ui.contact.item.i0) dVar).A.f351131c) {
                    arrayList2.add(str);
                }
                intent2.putExtra("query_phrase_list", arrayList2);
                j45.l.v(this, ".ui.transmit.MMCreateChatroomUI", intent2, 1);
                return;
            }
            java.lang.String str2 = dVar.f206850s;
            if (str2 == null) {
                return;
            }
            this.U1 = i17;
            G7(str2);
        }
        if (this.H1) {
            com.tencent.mm.modelstat.b.b(this.S1, 4);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        java.util.List list;
        super.initView();
        this.C = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.lls);
        this.D = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.gzk);
        this.E = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.chj);
        this.F = (android.widget.ImageView) this.C.findViewById(com.tencent.mm.R.id.h6y);
        this.G = (android.widget.TextView) this.C.findViewById(com.tencent.mm.R.id.f483931ci2);
        android.widget.TextView textView = (android.widget.TextView) this.C.findViewById(com.tencent.mm.R.id.gze);
        this.H = textView;
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        this.H.setText(getString(com.tencent.mm.R.string.iex));
        d8();
        this.E.setOnClickListener(new dk5.j4(this));
        this.f206446d.setOnScrollListener(new dk5.l3(this));
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView == null || (list = this.F1) == null) {
            return;
        }
        multiSelectContactView.e(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x005f, code lost:
    
        if (r0 != false) goto L41;
     */
    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j7() {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.SelectConversationUI.j7():void");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        if (U7()) {
            return !this.E1;
        }
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean o7() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.transmit.SelectConversationUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.p7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f210993l2 = c01.id.a();
        ((qg5.j2) ((ct.y2) i95.n0.c(ct.y2.class))).getClass();
        fk5.y.f263683d.getClass();
        fk5.y.f263684e = true;
        java.lang.String stringExtra = getIntent().getStringExtra("Select_App_Id");
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Open_Id");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "onCreate, appId = " + stringExtra + ", openId = " + stringExtra2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            new com.tencent.mm.plugin.base.stub.k(this, stringExtra, stringExtra2, new dk5.z2(this)).a();
        }
        o25.n1.c(this);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeAllOptionMenu();
        if (!this.V1) {
            Y7("", -1);
        }
        android.support.v4.os.ResultReceiver resultReceiver = (android.support.v4.os.ResultReceiver) getIntent().getParcelableExtra("Result_Recevier");
        if (resultReceiver != null) {
            resultReceiver.b(this.f211005v2, null);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f211000q2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "onPause: hasClickForwardToWeWork");
            com.tencent.mm.sdk.platformtools.u3.i(new dk5.h4(this), 200L);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f211004u2 = c01.id.c() - getIntent().getLongExtra("KEY_START_TIME", c01.id.c());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        if (this.X == 5) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.gnh), null, getString(com.tencent.mm.R.string.ihp), getString(com.tencent.mm.R.string.aq7), true, new dk5.k4(this), new dk5.l4(this));
        } else {
            super.p7();
            hideVKB();
        }
        com.tencent.mm.pluginsdk.model.app.ReportUtil$ReportArgs reportUtil$ReportArgs = this.I1;
        if (reportUtil$ReportArgs != null) {
            reportUtil$ReportArgs.f188786e = 0;
            com.tencent.mm.pluginsdk.model.app.m5.c(this, reportUtil$ReportArgs, true, true);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(gk5.r0.class);
        hashSet.add(la5.h1.class);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.F1.contains(str);
    }

    public final boolean y7(java.lang.String str) {
        if ("conversationboxservice".equals(str)) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.transmit.ConvBoxTransmitUI.class);
            intent.putExtras(getIntent().getExtras());
            intent.putExtra("KIsMultiSelect", this.E1);
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(this.F1, ","));
            startActivityForResult(intent, 7);
            db5.f.a(getContext(), intent);
            return true;
        }
        if (!"opencustomerservicemsg".equals(str)) {
            return false;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.transmit.OpenImKefuTransmitUI.class);
        intent2.putExtras(getIntent().getExtras());
        intent2.putExtra("KIsMultiSelect", this.E1);
        intent2.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(this.F1, ","));
        startActivityForResult(intent2, 8);
        db5.f.a(getContext(), intent2);
        return true;
    }

    public boolean z7(java.lang.String str) {
        if (!(com.tencent.mm.storage.z3.m4(str) || com.tencent.mm.storage.z3.q4(str))) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("Select_App_Id")) && this.f210992l1) {
            return false;
        }
        if (this.f210992l1) {
            if (com.tencent.mm.storage.z3.D3(((com.tencent.mm.storage.k4) c01.d9.b().q()).q(this.A1).f1())) {
                b8(str);
                return true;
            }
        }
        if (this.L1 != 8) {
            return false;
        }
        java.lang.String str2 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(this.X1).f196358a;
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(str2);
        if (q17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectConversationUI", "get contact error, cardName: %s, msgContent: %s", str2, this.X1);
            return false;
        }
        int f17 = q17.f1();
        java.util.Set set = c01.e2.f37117a;
        if (!com.tencent.mm.storage.z3.D3(f17)) {
            return false;
        }
        b8(str);
        return true;
    }
}
