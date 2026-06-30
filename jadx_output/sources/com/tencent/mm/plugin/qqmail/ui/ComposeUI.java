package com.tencent.mm.plugin.qqmail.ui;

@ul5.d(0)
/* loaded from: classes8.dex */
public class ComposeUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p1, reason: collision with root package name */
    public static java.util.List f154830p1;
    public com.tencent.mm.ui.widget.dialog.u3 A;
    public java.lang.String C;
    public java.lang.String D;
    public db5.d5 E;
    public java.lang.String P;
    public java.util.List Q;
    public java.util.List R;
    public final java.lang.String S;
    public final java.lang.String T;
    public final java.lang.String U;
    public boolean V;
    public boolean W;
    public final com.tencent.mm.sdk.platformtools.b4 X;
    public final com.tencent.mm.sdk.platformtools.b4 Y;
    public final ks3.y Z;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ScrollView f154832d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f154833e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f154834f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f154835g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f154836h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f154837i;

    /* renamed from: l1, reason: collision with root package name */
    public final android.view.View.OnClickListener f154838l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f154839m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f154840n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl f154841o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f154842p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnClickListener f154843p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.EditText f154844q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f154845r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f154846s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f154847t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f154848u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.EditText f154849v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f154850w;

    /* renamed from: x, reason: collision with root package name */
    public ks3.z f154851x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.View.OnClickListener f154852x0;

    /* renamed from: y, reason: collision with root package name */
    public os3.v1 f154853y;

    /* renamed from: y0, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f154854y0;

    /* renamed from: z, reason: collision with root package name */
    public final os3.p3 f154855z = new os3.p3(this);
    public int B = 1;
    public final boolean F = true;
    public final boolean G = true;
    public final java.lang.String H = "(function() { \nvar imgList = document.getElementsByTagName('img');var result = ''; \nfor (var i = 0; i < imgList.length; i++) {var img = imgList[i];var info = img.id + '@@' + img.src;result += info + '&&'}return result;})()";
    public final java.lang.String I = "document.getElementById('history').innerHTML";

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f154831J = "<div id=\"htmlContent\" contenteditable=\"true\" >";
    public final java.lang.String K = "</div>";
    public java.lang.String L = null;
    public int M = 20;
    public final java.util.Map N = new java.util.HashMap();

    public ComposeUI() {
        hs3.s sVar = (hs3.s) ((ks3.t) i95.n0.c(ks3.t.class));
        sVar.getClass();
        gm0.j1.b().c();
        if (sVar.f284597e == null) {
            sVar.f284597e = new ks3.q0();
        }
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = "weixin://get_img_info/";
        this.T = "weixin://get_mail_content/";
        this.U = "weixin://img_onclick/";
        this.V = false;
        this.W = false;
        this.X = new com.tencent.mm.sdk.platformtools.b4(new os3.d0(this), true);
        this.Y = new com.tencent.mm.sdk.platformtools.b4(new os3.e0(this), true);
        this.Z = new os3.f0(this);
        this.f154843p0 = new os3.s(this);
        this.f154852x0 = new os3.v(this);
        this.f154854y0 = new os3.y(this);
        this.f154838l1 = new os3.b0(this);
    }

    public static boolean T6(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI, boolean z17) {
        if (z17 && composeUI.f154833e.getMailAddrs().size() == 0 && composeUI.f154837i.getMailAddrs().size() == 0 && composeUI.f154841o.getMailAddrs().size() == 0 && !composeUI.f154833e.d() && !composeUI.f154837i.d() && !composeUI.f154841o.d()) {
            return false;
        }
        int i17 = composeUI.M;
        if (i17 == 20) {
            if (composeUI.f154844q.getText().toString().trim().length() == 0 && composeUI.f154853y.e().size() == 0 && composeUI.f154849v.getText().length() == 0) {
                return false;
            }
        } else if (i17 == 21 && composeUI.f154844q.getText().toString().trim().length() == 0 && composeUI.f154853y.e().size() == 0) {
            return false;
        }
        return true;
    }

    public static java.lang.String U6(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        composeUI.getClass();
        composeUI.D = "SendMail_" + java.lang.System.currentTimeMillis();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("mail_id", composeUI.C);
        int i17 = composeUI.B;
        int i18 = 2;
        if (i17 != 2) {
            i18 = 3;
            if (i17 != 3) {
                i18 = 1;
            }
        }
        bundle.putInt("mail_send_type", i18);
        java.lang.String obj = composeUI.f154844q.getText().toString();
        if (obj.trim().length() <= 0) {
            java.lang.String X6 = composeUI.X6();
            int i19 = composeUI.M;
            if (i19 == 20) {
                if (X6.length() > 0) {
                    obj = X6.substring(0, X6.length() <= 40 ? X6.length() : 40);
                }
                obj = composeUI.getString(com.tencent.mm.R.string.f492716hk5);
            } else {
                if (i19 == 21 && !com.tencent.mm.sdk.platformtools.t8.K0(X6)) {
                    obj = X6.substring(0, X6.length() <= 40 ? X6.length() : 40);
                }
                obj = composeUI.getString(com.tencent.mm.R.string.f492716hk5);
            }
        }
        bundle.putString("mail_subject", obj);
        bundle.putString("mail_content", composeUI.X6());
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.lang.String str5 = ks3.k0.f311703g;
        java.lang.String str6 = ((com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCVoid(), js3.c.class)).f68406d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Mail.ComposeUI", "bindMail is null");
            dp.a.makeText(composeUI, com.tencent.mm.R.string.hjo, 1).show();
            com.tencent.mm.ui.widget.dialog.u3 u3Var = composeUI.A;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            return composeUI.D;
        }
        java.lang.String str7 = "item_addr";
        bundle2.putString("item_addr", str6);
        arrayList.add(bundle2);
        bundle.putParcelableArrayList("mail_from_list", arrayList);
        java.lang.String str8 = "mail_to_list";
        bundle.putParcelableArrayList("mail_to_list", composeUI.a7(composeUI.f154833e.getMailAddrs()));
        java.lang.String str9 = "mail_cc_list";
        bundle.putParcelableArrayList("mail_cc_list", composeUI.a7(composeUI.f154837i.getMailAddrs()));
        java.lang.String str10 = "mail_bcc_list";
        bundle.putParcelableArrayList("mail_bcc_list", composeUI.a7(composeUI.f154841o.getMailAddrs()));
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList3 = new java.util.ArrayList<>();
        java.util.Iterator it = composeUI.f154853y.e().iterator();
        while (true) {
            str = "attach_path";
            str2 = str10;
            str3 = str9;
            if (!it.hasNext()) {
                break;
            }
            java.util.Iterator it6 = it;
            ks3.v0 v0Var = (ks3.v0) it.next();
            java.lang.String str11 = str8;
            android.os.Bundle bundle3 = new android.os.Bundle();
            java.lang.String str12 = str7;
            bundle3.putString("attach_fileId", v0Var.f311760i);
            bundle3.putString("attach_name", v0Var.f311756e);
            bundle3.putString("attach_path", v0Var.f311755d);
            bundle3.putInt("attach_size", (int) v0Var.f311757f);
            if (((java.util.HashMap) composeUI.N).containsKey(v0Var.f311756e)) {
                arrayList3.add(bundle3);
            } else {
                arrayList2.add(bundle3);
            }
            str8 = str11;
            str10 = str2;
            str9 = str3;
            it = it6;
            str7 = str12;
        }
        java.lang.String str13 = str8;
        java.lang.String str14 = str7;
        bundle.putParcelableArrayList("mail_normal_attach", arrayList2);
        bundle.putParcelableArrayList("mail_image_attach", arrayList3);
        java.lang.String str15 = composeUI.D;
        ks3.z0 z0Var = new ks3.z0();
        z0Var.f311793d = bundle.getInt("mail_send_type");
        z0Var.f311802p = bundle.getString("mail_id");
        z0Var.f311798i = bundle.getString("mail_subject");
        java.lang.String string = bundle.getString("mail_content");
        z0Var.f311799m = string;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NormalMailAppService", "parseSendMailContent before content:%s", string);
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("mail_image_attach");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            java.util.Iterator it7 = parcelableArrayList.iterator();
            while (it7.hasNext()) {
                android.os.Bundle bundle4 = (android.os.Bundle) it7.next();
                java.lang.String string2 = bundle4.getString("attach_fileId", "");
                java.util.Iterator it8 = it7;
                java.lang.String string3 = bundle4.getString("attach_name", "");
                java.lang.String string4 = bundle4.getString(str, "");
                z0Var.f311799m = z0Var.f311799m.replaceAll(java.lang.String.format("src=\"%s\"", "file://" + string4), java.lang.String.format("src=\"/attach/preview?bizid=50&fileid=%s&name=%s\"", string2, string3));
                it7 = it8;
                str = str;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NormalMailAppService", "parseSendMailContent after content:%s", z0Var.f311799m);
        z0Var.f311803q = true;
        java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("mail_from_list");
        if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty()) {
            str4 = str14;
        } else {
            ks3.x0 x0Var = new ks3.x0();
            z0Var.f311794e = x0Var;
            x0Var.f311772f = gm0.j1.b().h();
            str4 = str14;
            z0Var.f311794e.f311771e = ((android.os.Bundle) parcelableArrayList2.get(0)).getString(str4);
            z0Var.f311794e.f311770d = ((android.os.Bundle) parcelableArrayList2.get(0)).getString(ya.b.ITEM_NAME);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NormalMailAppService", "from addr %s", z0Var.f311794e.f311771e);
        }
        java.util.ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(str13);
        if (parcelableArrayList3 != null && !parcelableArrayList3.isEmpty()) {
            java.util.Iterator it9 = parcelableArrayList3.iterator();
            while (it9.hasNext()) {
                android.os.Bundle bundle5 = (android.os.Bundle) it9.next();
                ks3.x0 x0Var2 = new ks3.x0();
                x0Var2.f311771e = bundle5.getString(str4);
                x0Var2.f311770d = bundle5.getString(ya.b.ITEM_NAME);
                z0Var.f311795f.add(x0Var2);
                com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NormalMailAppService", "to addr %s", x0Var2.f311771e);
            }
        }
        java.util.ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(str3);
        if (parcelableArrayList4 != null && !parcelableArrayList4.isEmpty()) {
            java.util.Iterator it10 = parcelableArrayList4.iterator();
            while (it10.hasNext()) {
                android.os.Bundle bundle6 = (android.os.Bundle) it10.next();
                ks3.x0 x0Var3 = new ks3.x0();
                x0Var3.f311771e = bundle6.getString(str4);
                x0Var3.f311770d = bundle6.getString(ya.b.ITEM_NAME);
                z0Var.f311796g.add(x0Var3);
                com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NormalMailAppService", "cc addr %s", x0Var3.f311771e);
            }
        }
        java.util.ArrayList parcelableArrayList5 = bundle.getParcelableArrayList(str2);
        if (parcelableArrayList5 != null && !parcelableArrayList5.isEmpty()) {
            java.util.Iterator it11 = parcelableArrayList5.iterator();
            while (it11.hasNext()) {
                android.os.Bundle bundle7 = (android.os.Bundle) it11.next();
                ks3.x0 x0Var4 = new ks3.x0();
                x0Var4.f311771e = bundle7.getString(str4);
                x0Var4.f311770d = bundle7.getString(ya.b.ITEM_NAME);
                z0Var.f311797h.add(x0Var4);
                com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NormalMailAppService", "bcc addr %s", x0Var4.f311771e);
            }
        }
        java.util.ArrayList parcelableArrayList6 = bundle.getParcelableArrayList("mail_normal_attach");
        if (parcelableArrayList6 != null && !parcelableArrayList6.isEmpty()) {
            java.util.Iterator it12 = parcelableArrayList6.iterator();
            while (it12.hasNext()) {
                android.os.Bundle bundle8 = (android.os.Bundle) it12.next();
                ks3.w0 w0Var = new ks3.w0();
                w0Var.f311762d = bundle8.getString("attach_fileId");
                w0Var.f311767i = bundle8.getString("attach_key");
                w0Var.f311763e = bundle8.getString("attach_name");
                w0Var.f311764f = bundle8.getInt("attach_size");
                w0Var.f311766h = bundle8.getString("attach_download_url");
                w0Var.f311765g = bundle8.getString("attach_type");
                z0Var.f311800n.add(w0Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NormalMailAppService", "attach %s,%s,%s", w0Var.f311762d, w0Var.f311763e, w0Var.f311766h);
            }
        }
        java.util.ArrayList parcelableArrayList7 = bundle.getParcelableArrayList("mail_big_attach");
        if (parcelableArrayList7 != null && !parcelableArrayList7.isEmpty()) {
            java.util.Iterator it13 = parcelableArrayList7.iterator();
            while (it13.hasNext()) {
                android.os.Bundle bundle9 = (android.os.Bundle) it13.next();
                ks3.w0 w0Var2 = new ks3.w0();
                w0Var2.f311762d = bundle9.getString("attach_fileId");
                w0Var2.f311767i = bundle9.getString("attach_key");
                w0Var2.f311763e = bundle9.getString("attach_name");
                w0Var2.f311764f = bundle9.getInt("attach_size");
                w0Var2.f311766h = bundle9.getString("attach_download_url");
                w0Var2.f311765g = bundle9.getString("attach_type");
                z0Var.f311801o.add(w0Var2);
                com.tencent.mars.xlog.Log.i("MicroMsg.Mail.NormalMailAppService", "big attach %s,%s,%s", w0Var2.f311762d, w0Var2.f311763e, w0Var2.f311766h);
            }
        }
        gm0.j1.d().g(new ms3.e(str15, z0Var));
        return composeUI.D;
    }

    public final void V6() {
        this.f154833e.clearFocus();
        this.f154837i.clearFocus();
        this.f154841o.clearFocus();
    }

    public final void W6(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "comfirmToUpload() called with: path = [" + str + "], title = [" + str2 + "]");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m()) {
            if (((java.util.HashMap) this.f154853y.f348226h).containsKey(str)) {
                db5.e1.i(getContext(), com.tencent.mm.R.string.hkp, com.tencent.mm.R.string.f490573yv);
                return;
            }
            int C = (int) r6Var.C();
            if (C > 20971520) {
                db5.e1.m(this, com.tencent.mm.R.string.hkq, com.tencent.mm.R.string.f490573yv, null);
            } else {
                db5.e1.u(this, getString(com.tencent.mm.R.string.hks, com.tencent.mm.sdk.platformtools.t8.f0(C)), getString(com.tencent.mm.R.string.f490573yv), new os3.c0(this, C, r6Var, str, str2), null);
            }
        }
    }

    public final java.lang.String X6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f154849v.getText().toString());
        zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f154850w;
        ((yg0.s4) q3Var).getClass();
        com.tencent.mm.pluginsdk.ui.tools.e9.i(mMWebView, this.T, this.I, true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
            java.lang.String str = this.P;
            java.lang.String str2 = this.f154831J;
            int indexOf = str.indexOf(str2);
            java.lang.String str3 = this.P;
            java.lang.String str4 = this.K;
            int lastIndexOf = str3.lastIndexOf(str4);
            if (indexOf == -1 || lastIndexOf == -1) {
                sb6.append("\n");
                sb6.append(this.P);
            } else {
                java.lang.String substring = this.P.substring(indexOf + str2.length(), lastIndexOf + str4.length());
                sb6.append("\n");
                sb6.append(substring);
            }
        }
        return sb6.toString();
    }

    public final void Y6() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f154850w;
        if (mMWebView != null) {
            mMWebView.clearFocus();
            com.tencent.xweb.z0 settings = this.f154850w.getSettings();
            settings.E(true);
            settings.h(true);
            this.f154850w.setWebViewClient(new os3.r0(this, null));
            this.f154850w.setWebChromeClient(new os3.q0(this, null));
            this.f154850w.setOnTouchListener(new os3.q(this));
        }
    }

    public final java.util.List Z6(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                ks3.u uVar = null;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    java.lang.String trim = str.trim();
                    int lastIndexOf = trim.trim().lastIndexOf(" ");
                    if (lastIndexOf != -1) {
                        uVar = new ks3.u();
                        uVar.f311750e = trim.substring(0, lastIndexOf);
                        uVar.f311751f = trim.substring(lastIndexOf + 1);
                    }
                }
                if (uVar != null) {
                    arrayList.add(uVar);
                }
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList a7(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ks3.u uVar = (ks3.u) it.next();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("item_addr", uVar.f311751f);
            bundle.putString(ya.b.ITEM_NAME, uVar.f311750e);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void b7() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String m17 = lp0.b.m();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        ((ub0.r) oVar).getClass();
        if (com.tencent.mm.pluginsdk.ui.tools.l7.l(this, m17, str, 3)) {
            return;
        }
        dp.a.makeText(this, getString(com.tencent.mm.R.string.igw), 1).show();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cbg;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x015f  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.qqmail.ui.ComposeUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String b17;
        if (i18 != -1) {
            return;
        }
        if (i17 == 0) {
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl = this.f154833e;
            java.util.List<ks3.u> list = f154830p1;
            if (list != null) {
                mailAddrsViewControl.setMailAdds(list);
            }
            showVKB();
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl2 = this.f154837i;
            java.util.List<ks3.u> list2 = f154830p1;
            if (list2 != null) {
                mailAddrsViewControl2.setMailAdds(list2);
            }
            showVKB();
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl mailAddrsViewControl3 = this.f154841o;
            java.util.List<ks3.u> list3 = f154830p1;
            if (list3 != null) {
                mailAddrsViewControl3.setMailAdds(list3);
            }
            showVKB();
            return;
        }
        if (i17 == 3) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b18 = com.tencent.mm.pluginsdk.ui.tools.l7.b(this, intent, a17);
            if (b18 == null) {
                return;
            }
            W6(b18, "");
            V6();
            return;
        }
        if (i17 == 4) {
            if (intent == null || (b17 = com.tencent.mm.ui.tools.i1.b(this, intent, g83.a.a())) == null || b17.length() <= 0) {
                return;
            }
            W6(b17, "");
            V6();
            return;
        }
        if (i17 == 6 && intent != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("selected_file_lst");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("selected_file_title_lst");
            if (com.tencent.mm.sdk.platformtools.t8.L0(stringArrayListExtra) || com.tencent.mm.sdk.platformtools.t8.L0(stringArrayListExtra2)) {
                return;
            }
            W6(stringArrayListExtra.get(0), stringArrayListExtra2.get(0));
            V6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.L = this.f154831J + "%s" + this.K;
        this.V = false;
        this.B = getIntent().getIntExtra("composeType", 1);
        java.lang.String stringExtra = getIntent().getStringExtra("mailid");
        this.C = stringExtra;
        if (stringExtra == null) {
            this.C = "";
        }
        this.M = getIntent().getIntExtra("mail_mode", 20);
        initView();
        ks3.z zVar = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f311706b;
        this.f154851x = zVar;
        zVar.b(this.Z);
        this.f154851x.d();
        this.Y.c(180000L, 180000L);
        gm0.j1.d().a(11166, this);
        this.landscapeMode = getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("settings_landscape_mode", false);
        this.W = this.landscapeMode || getIntent().getBooleanExtra("KEY_SUPPORT_ORIENTATION", false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (f154830p1 != null) {
            f154830p1 = null;
        }
        this.f154853y.a();
        os3.v1 v1Var = this.f154853y;
        v1Var.getClass();
        gm0.j1.n().f273288b.q(11665, v1Var);
        this.f154851x.f(this.Z);
        os3.p3 p3Var = this.f154855z;
        p3Var.getClass();
        gm0.j1.n().f273288b.q(138, p3Var);
        gm0.j1.d().q(11166, this);
        this.Y.d();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f154854y0;
        getContext().getResources().getColor(com.tencent.mm.R.color.FG_0);
        os3.y yVar = (os3.y) onMenuItemClickListener;
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = yVar.f348252d;
        if ((T6(composeUI, false) && composeUI.M == 20) || composeUI.M == 21) {
            db5.e1.A(composeUI.getContext(), composeUI.getString(com.tencent.mm.R.string.f492715hk4), "", composeUI.getString(com.tencent.mm.R.string.hk6), composeUI.getString(com.tencent.mm.R.string.f490347sg), new os3.x(yVar), null);
            return true;
        }
        composeUI.setResult(0);
        composeUI.finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        hideVKB();
        this.X.d();
        db5.d5 d5Var = this.E;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr[0] == 0) {
            b7();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new os3.w(this), null);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.X.c(1500L, 1500L);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!((ms3.e) m1Var).f330988f.equals(this.D)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Mail.ComposeUI", "not current request, ignore");
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.A;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = getString(com.tencent.mm.R.string.hjo);
            }
            dp.a.makeText(this, str, 1).show();
            return;
        }
        dp.a.makeText(this, com.tencent.mm.R.string.hjq, 1).show();
        ks3.i iVar = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f311707c;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(iVar.f311686a.f311746a + iVar.a(this.C, this.B));
        if (r6Var.m()) {
            r6Var.l();
        }
        this.f154851x.c(this.f154833e.getMailAddrs());
        this.f154851x.c(this.f154837i.getMailAddrs());
        this.f154851x.c(this.f154841o.getMailAddrs());
        setResult(-1);
        finish();
    }
}
