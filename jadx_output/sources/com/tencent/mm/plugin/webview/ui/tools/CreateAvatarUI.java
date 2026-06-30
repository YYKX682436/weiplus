package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class CreateAvatarUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, ck5.e {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f183583y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.inputmethod.InputMethodManager f183584d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f183585e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f183586f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f183587g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183588h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f183589i;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f183592o;

    /* renamed from: p, reason: collision with root package name */
    public volatile hy4.m f183593p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f183594q;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f183597t;

    /* renamed from: m, reason: collision with root package name */
    public boolean f183590m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f183591n = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f183595r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f183596s = false;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f183598u = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f183599v = false;

    /* renamed from: w, reason: collision with root package name */
    public long f183600w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f183601x = 0;

    @Override // ck5.e
    public void R5(java.lang.String str) {
        db5.e1.i(this, com.tencent.mm.R.string.it9, com.tencent.mm.R.string.itb);
    }

    public final void T6() {
        if (!this.f183599v && this.f183585e.getText().toString().equals(this.f183598u)) {
            finish();
            return;
        }
        final com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, true);
        k0Var.q(this.f183596s ? getContext().getResources().getString(com.tencent.mm.R.string.lso) : getContext().getResources().getString(com.tencent.mm.R.string.lsl), 17);
        k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$$a
            @Override // db5.o4
            public final void onCreateMMMenu(db5.g4 g4Var) {
                int i17 = com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.f183583y;
                com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.this;
                g4Var.d(0, createAvatarUI.getContext().getResources().getColor(com.tencent.mm.R.color.f479482a31), createAvatarUI.getContext().getResources().getString(com.tencent.mm.R.string.lsn));
                g4Var.f(1, createAvatarUI.getContext().getResources().getString(com.tencent.mm.R.string.lsm));
            }
        };
        k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$$b
            @Override // db5.t4
            public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                int i18 = com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.f183583y;
                com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.this;
                createAvatarUI.getClass();
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    createAvatarUI.finish();
                } else {
                    if (itemId != 1) {
                        return;
                    }
                    k0Var.u();
                }
            }
        };
        k0Var.v();
    }

    public final void U6(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "doAddAvatar appid: %s", str);
        X6();
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.x0(str, str2, str3, i17));
        this.f183600w = java.lang.System.currentTimeMillis();
    }

    public final void V6(java.lang.String str, java.lang.String str2) {
        X6();
        int intExtra = getIntent().getIntExtra("extra_edit_avatar_id", -1);
        java.lang.String str3 = this.f183588h;
        if (str2 == null) {
            str2 = "";
        }
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.n1(intExtra, str3, str, str2, this.f183597t, this.f183599v));
    }

    public final boolean W6(int i17) {
        if (i17 == 1 || i17 == 2 || i17 == 7 || i17 == 8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CreateAvatarUI", "isNetworkAvailable false, errType = " + i17);
            return false;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CreateAvatarUI", "isNetworkAvailable false, not connected");
        return false;
    }

    public final void X6() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183592o;
        if (u3Var == null || u3Var.isShowing()) {
            this.f183592o = db5.e1.Q(this, null, getString(com.tencent.mm.R.string.blv), true, true, new com.tencent.mm.plugin.webview.ui.tools.k(this));
        } else {
            this.f183592o.show();
        }
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        this.f183595r = true;
        boolean z17 = this.f183596s;
        hy4.l lVar = hy4.l.FAIL;
        hy4.l lVar2 = hy4.l.SUCCESS;
        if (z17) {
            if (this.f183593p != null && this.f183593p.f286172f == lVar2) {
                V6(str, this.f183594q);
                return;
            }
            if (this.f183593p != null && this.f183593p.f286172f == lVar) {
                X6();
                this.f183593p.a(this.f183587g, this.f183588h);
                return;
            } else if (this.f183593p == null) {
                V6(str, this.f183589i);
                return;
            } else {
                X6();
                return;
            }
        }
        if (!this.f183591n && this.f183593p != null && !this.f183590m) {
            if (this.f183593p.f286172f == lVar2) {
                U6(this.f183588h, str, this.f183594q, 1);
                return;
            } else if (this.f183593p.f286172f != lVar) {
                X6();
                return;
            } else {
                X6();
                this.f183593p.a(this.f183587g, this.f183588h);
                return;
            }
        }
        java.lang.String str2 = this.f183589i;
        if (str2 != null && !str2.isEmpty()) {
            U6(this.f183588h, str, this.f183589i, 1);
            return;
        }
        android.graphics.Bitmap k07 = com.tencent.mm.sdk.platformtools.x.k0(com.tencent.mm.sdk.platformtools.x.c0(com.tencent.mm.R.raw.default_avatar), 500, 500, false);
        java.lang.String str3 = this.f183588h;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.tencent.mm.sdk.platformtools.x.i(k07, android.graphics.Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CreateAvatarUI", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "doAddAvatar appid: %s", str3);
        X6();
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.x0(str3, str, byteArray, 0));
        this.f183600w = java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L7b
            android.view.View r0 = r8.getCurrentFocus()
            if (r0 == 0) goto L50
            boolean r3 = r0 instanceof android.widget.EditText
            if (r3 == 0) goto L50
            int[] r3 = new int[]{r2, r2}
            r0.getLocationInWindow(r3)
            r4 = r3[r2]
            r3 = r3[r1]
            int r5 = r0.getHeight()
            int r5 = r5 + r3
            int r6 = r0.getWidth()
            int r6 = r6 + r4
            float r7 = r9.getX()
            float r4 = (float) r4
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L51
            float r4 = r9.getX()
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L51
            float r4 = r9.getY()
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L51
            float r3 = r9.getY()
            float r4 = (float) r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L51
            android.widget.EditText r3 = r8.f183585e
            r3.setCursorVisible(r1)
        L50:
            r1 = r2
        L51:
            if (r1 == 0) goto L76
            java.lang.String r1 = "input_method"
            java.lang.Object r1 = r8.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r8.f183584d = r1
            if (r1 == 0) goto L76
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r2)
            android.widget.EditText r0 = r8.f183585e
            r0.setCursorVisible(r2)
            android.view.Window r0 = r8.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.requestFocus()
        L76:
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L7b:
            android.view.Window r0 = r8.getWindow()
            boolean r0 = r0.superDispatchTouchEvent(r9)
            if (r0 != 0) goto L8d
            boolean r9 = r8.onTouchEvent(r9)
            if (r9 == 0) goto L8c
            goto L8d
        L8c:
            r1 = r2
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a38;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CreateAvatarUI", "Get image from album failed");
            return;
        }
        if (i17 == 4) {
            if (intent == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(this, "com.tencent.mm.plugin.gallery.picker.view.ImageCropUI");
            intent2.putExtra("CropImageMode", 1);
            intent2.putExtra("CropImage_Filter", true);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent2.putExtra("CropImage_OutputPath", com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            intent2.putExtra("CropImage_ImgPath", (java.lang.String) null);
            intent2.putExtra("CropImage_from_scene", 3);
            com.tencent.mm.ui.tools.i1.a(this, intent, intent2, g83.a.a(), 5, null);
            return;
        }
        if (i17 == 5 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
            if (stringExtra == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CreateAvatarUI", "crop picture failed");
                return;
            }
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(stringExtra);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!a17.f213279f.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "onActivityResult(CROP_PICTURE_FOR_AVATAR)  file:%s, size:%d", stringExtra, java.lang.Long.valueOf((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L));
            this.f183587g = stringExtra;
            this.f183595r = false;
            this.f183590m = false;
            this.f183591n = false;
            this.f183599v = true;
            enableOptionMenu(true);
            this.f183586f.setImageBitmap(com.tencent.mm.graphics.e.c(stringExtra));
            if (this.f183593p == null) {
                this.f183593p = new hy4.m();
                this.f183593p.f286169c.observe(this, new com.tencent.mm.plugin.webview.ui.tools.j(this));
            }
            this.f183594q = null;
            this.f183593p.a(this.f183587g, this.f183588h);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            setMMTitle(getString(com.tencent.mm.R.string.h87));
        } else {
            setMMTitle(stringExtra);
        }
        this.f183588h = getIntent().getStringExtra("0");
        this.f183589i = getIntent().getStringExtra("default_fileid");
        this.f183596s = getIntent().getBooleanExtra("extra_is_edit_page", false);
        this.f183585e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.kbk);
        this.f183586f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a_g);
        setBackBtn(new com.tencent.mm.plugin.webview.ui.tools.c(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.webview.ui.tools.d(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(false);
        this.f183585e.setOnEditorActionListener(new com.tencent.mm.plugin.webview.ui.tools.e(this));
        this.f183585e.setOnKeyListener(new com.tencent.mm.plugin.webview.ui.tools.f(this));
        this.f183585e.setHintTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
        this.f183585e.addTextChangedListener(new com.tencent.mm.plugin.webview.ui.tools.g(this));
        this.f183585e.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.h(this));
        findViewById(com.tencent.mm.R.id.bu7).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.i(this));
        if (this.f183596s) {
            this.f183598u = getIntent().getStringExtra("extra_edit_frefill_avatar_name");
            this.f183597t = getIntent().getStringExtra("extra_edit_frefill_avatar_icon");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f183598u)) {
                this.f183585e.setText(this.f183598u);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f183597t)) {
                getResources().getDimension(com.tencent.mm.R.dimen.a9h);
                n11.a.b().g(this.f183597t, this.f183586f);
            }
        }
        android.content.Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("extra_call_by_appbrand", false)) {
            return;
        }
        hy4.b.INSTANCE.d(4, "");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183592o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(2500, this);
        gm0.j1.d().q(2785, this);
        gm0.j1.d().q(2667, this);
        gm0.j1.d().q(29251, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(2500, this);
        gm0.j1.d().a(2785, this);
        gm0.j1.d().a(2667, this);
        gm0.j1.d().a(29251, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof com.tencent.mm.plugin.webview.model.x0;
        hy4.b bVar = hy4.b.INSTANCE;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "onAddAvatarEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183592o;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                r45.mx4 mx4Var = ((r45.v3) ((com.tencent.mm.plugin.webview.model.x0) m1Var).f183175d.f70711b.f70700a).f387835d;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(dm.i4.COL_ID, mx4Var.f380893d);
                intent.putExtra("nickname", mx4Var.f380894e);
                intent.putExtra("avatarurl", mx4Var.f380895f);
                setResult(-1, intent);
                finish();
            } else if (W6(i17)) {
                db5.e1.s(this, str, getString(com.tencent.mm.R.string.blo));
            } else {
                db5.e1.s(this, getString(com.tencent.mm.R.string.l8c), getString(com.tencent.mm.R.string.blo));
            }
            bVar.b(6, (int) (java.lang.System.currentTimeMillis() - this.f183600w), i18);
            return;
        }
        if (m1Var instanceof com.tencent.mm.plugin.webview.model.e1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "onGetRandomAvatarEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 == 0 && i18 == 0) {
                r45.hm3 hm3Var = (r45.hm3) ((com.tencent.mm.plugin.webview.model.e1) m1Var).f182847d.f70711b.f70700a;
                o11.f fVar = new o11.f();
                fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
                fVar.f342097u = getResources().getDimension(com.tencent.mm.R.dimen.a9h);
                fVar.f342096t = true;
                n11.a.b().h(hm3Var.f376291e, this.f183586f, fVar.a());
                this.f183591n = true;
                this.f183590m = false;
                this.f183589i = hm3Var.f376292f;
                this.f183599v = true;
                enableOptionMenu(true);
            } else if (W6(i17)) {
                db5.e1.s(this, str, getString(com.tencent.mm.R.string.blq));
            } else {
                db5.e1.s(this, getString(com.tencent.mm.R.string.l8c), getString(com.tencent.mm.R.string.blq));
            }
            bVar.b(5, (int) (java.lang.System.currentTimeMillis() - this.f183601x), i18);
            return;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.webview.model.a1)) {
            if (m1Var instanceof com.tencent.mm.plugin.webview.model.n1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "onModAvatarEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f183592o;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                }
                if (i17 != 0 || i18 != 0) {
                    if (W6(i17)) {
                        db5.e1.s(this, str, getString(com.tencent.mm.R.string.lsp));
                        return;
                    } else {
                        db5.e1.s(this, getString(com.tencent.mm.R.string.l8c), getString(com.tencent.mm.R.string.lsp));
                        return;
                    }
                }
                com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.webview.model.n1) m1Var).f183038d;
                com.tencent.mm.protobuf.f fVar2 = oVar != null ? oVar.f70711b.f70700a : null;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModAvatarResp");
                r45.mx4 mx4Var2 = ((r45.jn4) fVar2).f377970d;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(dm.i4.COL_ID, mx4Var2.f380893d);
                intent2.putExtra("nickname", mx4Var2.f380894e);
                intent2.putExtra("avatarurl", mx4Var2.f380895f);
                intent2.putExtra("desc", mx4Var2.f380896g);
                setResult(-1, intent2);
                finish();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CreateAvatarUI", "onGetCreateAvatarEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (this.f183593p == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CreateAvatarUI", "uploadEngine == null, multi-Thread Error, thread name = " + java.lang.Thread.currentThread().getName());
            return;
        }
        hy4.m mVar = this.f183593p;
        mVar.getClass();
        com.tencent.mm.plugin.webview.model.a1 a1Var = (com.tencent.mm.plugin.webview.model.a1) m1Var;
        java.lang.String str2 = a1Var.f182758f;
        boolean equals = str2.equals(mVar.f286171e);
        hy4.l lVar = hy4.l.SUCCESS;
        if (!equals) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VestImgUploadEngine", "currentPath=%s,callbackPath=%s, path updated after onSceneEnd", mVar.f286171e, str2);
        } else if (i17 == 0 && i18 == 0) {
            mVar.f286172f = lVar;
            r45.t3 t3Var = (r45.t3) a1Var.f182756d.f70711b.f70700a;
            mVar.f286169c.postValue(t3Var.f386081d);
            com.tencent.mars.xlog.Log.i("MicroMsg.VestImgUploadEngine", "file id create success: %s", t3Var.f386081d);
        } else {
            mVar.f286172f = hy4.l.FAIL;
            com.tencent.mars.xlog.Log.i("MicroMsg.VestImgUploadEngine", "file id create failed: errType = %s, errCode = %s, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
        if (this.f183595r) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f183592o;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
            if (this.f183593p.f286172f == lVar) {
                return;
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var4 = this.f183592o;
            if (u3Var4 != null) {
                u3Var4.dismiss();
            }
            if (W6(i17)) {
                db5.e1.s(this, str, getString(com.tencent.mm.R.string.blo));
                return;
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var5 = this.f183592o;
            if (u3Var5 != null) {
                u3Var5.dismiss();
            }
            db5.e1.s(this, getString(com.tencent.mm.R.string.l8c), getString(com.tencent.mm.R.string.blo));
        }
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        db5.e1.i(this, com.tencent.mm.R.string.it_, com.tencent.mm.R.string.itb);
    }
}
