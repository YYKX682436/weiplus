package com.tencent.mm.plugin.profile.ui;

@java.lang.Deprecated
/* loaded from: classes11.dex */
public class AddDescriptionUI extends com.tencent.mm.ui.vas.VASActivity implements com.tencent.mm.ui.tools.c5 {
    public static final /* synthetic */ int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f153628d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f153629e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f153630f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f153631g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f153632h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f153633i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f153634m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f153635n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f153637p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f153638q;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153642u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.storage.ya f153643v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f153644w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f153645x;

    /* renamed from: o, reason: collision with root package name */
    public int f153636o = 0;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f153639r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f153640s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f153641t = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final int[] f153646y = new int[3];

    /* renamed from: z, reason: collision with root package name */
    public final hr3.u f153647z = new hr3.u(this, null);
    public boolean A = true;

    public static void U6(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI, boolean z17) {
        addDescriptionUI.A = true;
        ck5.f b17 = ck5.f.b(addDescriptionUI.f153629e.getEditText());
        b17.f42561f = 0;
        b17.f42560e = 400;
        b17.d(new hr3.g(addDescriptionUI));
        if (addDescriptionUI.A) {
            boolean c76 = addDescriptionUI.c7();
            java.util.ArrayList arrayList = addDescriptionUI.f153641t;
            if (c76) {
                if (z17) {
                    java.util.ArrayList arrayList2 = addDescriptionUI.f153639r;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    if (size > 0) {
                        for (int i17 = 0; i17 < size; i17++) {
                            java.lang.String c17 = i21.q.h().c(addDescriptionUI.f153644w, i17);
                            if (!c17.equals(arrayList2.get(i17))) {
                                com.tencent.mm.vfs.w6.c((java.lang.String) arrayList2.get(i17), c17);
                                com.tencent.mm.vfs.w6.h((java.lang.String) arrayList2.get(i17));
                            }
                            arrayList.add(c17);
                        }
                    }
                } else {
                    arrayList.clear();
                    arrayList.addAll(addDescriptionUI.f153640s);
                }
                addDescriptionUI.Z6();
            }
            com.tencent.mars.xlog.Log.i("MiroMsg.AddDescriptionUI", "[dealModRemarkDesc] :%s", addDescriptionUI.f153644w);
            if (addDescriptionUI.b7()) {
                java.lang.String charSequence = addDescriptionUI.f153629e.getText().toString();
                addDescriptionUI.f153637p = charSequence;
                r45.wn4 wn4Var = new r45.wn4();
                wn4Var.f389311d = addDescriptionUI.f153644w;
                wn4Var.f389312e = charSequence;
                ((e21.z0) c01.d9.b().w()).c(new xg3.p0(54, wn4Var));
            }
            java.lang.String str = addDescriptionUI.f153637p;
            java.lang.String b18 = com.tencent.mm.contact.b.b(arrayList);
            com.tencent.mars.xlog.Log.i("MiroMsg.AddDescriptionUI", "[saveStrangerRemarkInfo] :%s ", addDescriptionUI.f153644w);
            if (((com.tencent.mm.storage.k4) c01.d9.b().q()).n(addDescriptionUI.f153644w, true) != null) {
                addDescriptionUI.f153642u.d3(str);
                addDescriptionUI.f153642u.e3(b18);
                addDescriptionUI.f153642u.getClass();
                com.tencent.mars.xlog.Log.i("MiroMsg.AddDescriptionUI", "saveStrangerRemarkInfo ret %s, remarkImgUrl:%s", java.lang.Boolean.valueOf(((com.tencent.mm.storage.k4) c01.d9.b().q()).l0(addDescriptionUI.f153642u)), b18);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.valueOf(str == null);
                objArr[1] = java.lang.Integer.valueOf(str != null ? str.length() : 0);
                objArr[2] = str == null ? "" : com.tencent.mm.sdk.platformtools.t8.G1(str);
                com.tencent.mars.xlog.Log.i("MiroMsg.AddDescriptionUI", "remarkDesc (%s, %s, %s)", objArr);
            }
            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(addDescriptionUI.f153644w);
            if (z07 != null) {
                z07.field_encryptUsername = addDescriptionUI.f153644w;
                z07.field_conDescription = str;
                ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z07);
            }
            addDescriptionUI.finish();
        }
    }

    public static void V6(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI, int i17) {
        addDescriptionUI.getClass();
        android.content.Intent intent = new android.content.Intent(addDescriptionUI, (java.lang.Class<?>) com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI.class);
        intent.putExtra("Contact_User", addDescriptionUI.f153644w);
        intent.putExtra("remark_image_path", addDescriptionUI.f153639r);
        intent.putExtra("selected_item", i17);
        intent.putExtra("view_only", false);
        addDescriptionUI.startActivityForResult(intent, 400);
    }

    public static void W6(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI, int i17) {
        addDescriptionUI.f153636o--;
        java.util.ArrayList arrayList = addDescriptionUI.f153639r;
        arrayList.remove(i17);
        if (i17 == 0) {
            addDescriptionUI.f153630f.setVisibility(8);
        } else if (i17 == 1) {
            addDescriptionUI.f153631g.setVisibility(8);
        } else if (i17 == 2) {
            addDescriptionUI.f153632h.setVisibility(8);
        }
        addDescriptionUI.f153628d.setVisibility(0);
        addDescriptionUI.f153635n.setVisibility(8);
        addDescriptionUI.d7(arrayList, 0);
        addDescriptionUI.X6();
    }

    public final void X6() {
        if (!b7() && !c7()) {
            enableOptionMenu(false);
        } else if (this.f153629e.c()) {
            enableOptionMenu(false);
        } else {
            enableOptionMenu(true);
        }
    }

    public final java.lang.String Y6(java.lang.String str, int i17) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        java.lang.String str2 = i21.q.h().c(this.f153644w, i17) + ".tmp";
        if (!com.tencent.mm.sdk.platformtools.x.v(str, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            com.tencent.mars.xlog.Log.e("MiroMsg.AddDescriptionUI", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.tencent.mm.sdk.platformtools.x.y0(str2, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            return str2;
        }
        com.tencent.mars.xlog.Log.e("MiroMsg.AddDescriptionUI", "rotate big pic fail");
        return null;
    }

    public final void Z6() {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17;
        java.lang.String a17 = i21.q.h().a(this.f153644w);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a17);
        if (r6Var.m() && r6Var.y() && (s17 = com.tencent.mm.vfs.w6.s(a17, true)) != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null) {
                    if (!this.f153641t.contains(a17 + x1Var.f213232b)) {
                        x1Var.a();
                    }
                }
            }
        }
    }

    public final void a7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_get_desc_report_data", this.f153646y);
        setResult(-1, intent);
        if (b7() || c7()) {
            db5.e1.A(this, getString(com.tencent.mm.R.string.bgj), null, getString(com.tencent.mm.R.string.bgl), getString(com.tencent.mm.R.string.bgk), new hr3.e(this), new hr3.f(this));
        } else {
            hideVKB();
            finish();
        }
    }

    public final boolean b7() {
        java.lang.String charSequence = this.f153629e.getText().toString();
        java.lang.String str = this.f153637p;
        return (str == null || !str.equals(charSequence)) && !(x51.t1.b(this.f153637p) && x51.t1.b(charSequence));
    }

    public final boolean c7() {
        java.util.ArrayList arrayList = this.f153640s;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.f153639r;
        return (size == arrayList2.size() && arrayList.containsAll(arrayList2)) ? false : true;
    }

    public final void d7(java.util.ArrayList arrayList, int i17) {
        android.graphics.Bitmap a17;
        this.f153635n.setVisibility(8);
        this.f153628d.setVisibility(0);
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
                    this.f153636o = 1;
                    this.f153630f.setVisibility(0);
                    this.f153630f.setImageBitmap(a17);
                    this.f153631g.setVisibility(8);
                    this.f153632h.setVisibility(8);
                } else if (i17 == 1) {
                    this.f153636o = 2;
                    this.f153631g.setVisibility(0);
                    this.f153631g.setImageBitmap(a17);
                    this.f153632h.setVisibility(8);
                } else if (i17 == 2) {
                    this.f153636o = 3;
                    this.f153632h.setVisibility(0);
                    this.f153632h.setImageBitmap(a17);
                    this.f153628d.setVisibility(8);
                    this.f153635n.setVisibility(0);
                }
                i17++;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487981d6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0219 A[EDGE_INSN: B:34:0x0219->B:35:0x0219 BREAK  A[LOOP:0: B:17:0x01c8->B:31:0x01c8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bc  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.AddDescriptionUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MiroMsg.AddDescriptionUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.ArrayList arrayList = this.f153639r;
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
            d7(arrayList, 0);
            X6();
            return;
        }
        if (i17 == 200) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MiroMsg.AddDescriptionUI", "data shouldnot be null");
                return;
            }
            java.util.Iterator<java.lang.String> it = intent.getStringArrayListExtra("CropImage_OutputPath_List").iterator();
            while (it.hasNext()) {
                arrayList.add(Y6(it.next(), arrayList.size()));
            }
            d7(arrayList, 0);
            X6();
            return;
        }
        if (i17 != 400) {
            return;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.AddDescriptionUI", "data shouldnot be null");
            return;
        }
        if (intent.getBooleanExtra("response_delete", false)) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("remark_image_path");
            if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                this.f153636o = 0;
                this.f153630f.setVisibility(8);
                this.f153631g.setVisibility(8);
                this.f153632h.setVisibility(8);
            }
            d7(stringArrayListExtra, 0);
            arrayList.clear();
            arrayList.addAll(stringArrayListExtra);
            X6();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        com.tencent.mars.xlog.Log.i("MiroMsg.AddDescriptionUI", "onClickDialogSpaceOnHalfScreenMode");
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        setMMTitle(com.tencent.mm.R.string.o_k);
        hideActionbarLine();
        this.f153644w = getIntent().getStringExtra("Contact_User");
        this.f153645x = getIntent().getStringExtra("Contact_verify_string");
        this.f153642u = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f153644w, true);
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(this.f153644w);
        this.f153643v = z07;
        if (z07 == null || x51.t1.b(z07.field_conDescription)) {
            this.f153637p = this.f153642u.f236589y1;
        } else {
            this.f153637p = this.f153643v.field_conDescription;
        }
        java.lang.String str = this.f153642u.f236591z1;
        this.f153638q = str;
        if (x51.t1.b(str) || this.f153638q.startsWith("http://")) {
            java.lang.String b17 = i21.q.h().b(this.f153644w);
            if (i21.q.h().i(this.f153644w)) {
                this.f153638q = b17;
            } else {
                this.f153638q = "";
            }
        }
        initView();
        X6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        a7();
        return true;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
    }
}
