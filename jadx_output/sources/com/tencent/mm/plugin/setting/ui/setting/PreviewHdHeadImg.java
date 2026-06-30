package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(128)
/* loaded from: classes5.dex */
public class PreviewHdHeadImg extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f160156f = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160157d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f160158e;

    public static boolean T6(android.graphics.Bitmap bitmap, java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, str, true);
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreviewHdHeadImg", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.PreviewHdHeadImg", "saveBitmapToImage failed:" + e17.toString());
            }
        }
        return false;
    }

    public final void U6() {
        ((com.tencent.mm.plugin.setting.ui.setting.tq) component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).O6();
        com.tencent.mm.plugin.setting.ui.setting.tq tqVar = (com.tencent.mm.plugin.setting.ui.setting.tq) component(com.tencent.mm.plugin.setting.ui.setting.tq.class);
        tqVar.getClass();
        boolean z17 = (j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.RepairerConfigYuanBaoMakingAvatarEnable()) == 1) && tqVar.f161587d != null;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.p1(this, z17);
        k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.q1(this);
        k0Var.f211854d = new com.tencent.mm.ui.widget.dialog.c1() { // from class: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$$e
            @Override // com.tencent.mm.ui.widget.dialog.c1
            public final void onDismiss() {
                int i17 = com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.f160156f;
                ((com.tencent.mm.plugin.setting.ui.setting.tq) com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.this.component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).Q6();
            }
        };
        k0Var.f211860g = new com.tencent.mm.ui.widget.dialog.c1() { // from class: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$$f
            @Override // com.tencent.mm.ui.widget.dialog.c1
            public final void onDismiss() {
                int i17 = com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.f160156f;
                ((com.tencent.mm.plugin.setting.ui.setting.tq) com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.this.component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).P6(new com.tencent.mm.plugin.setting.ui.setting.mq(com.tencent.mm.plugin.setting.ui.setting.kq.f161255n));
            }
        };
        k0Var.v();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bic;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.ipu);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.BW_0));
        java.lang.String stringExtra = getIntent().getStringExtra("USERNAME");
        this.f160157d = stringExtra;
        if (stringExtra == null) {
            stringExtra = c01.z1.r();
        }
        this.f160157d = stringExtra;
        boolean booleanExtra = getIntent().getBooleanExtra("need_show_menu_choose", false);
        com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = (com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView) findViewById(com.tencent.mm.R.id.ghs);
        this.f160158e = getHdHeadImageGalleryView;
        getHdHeadImageGalleryView.setUsername(this.f160157d);
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.setting.ui.setting.o1(this));
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.f160156f;
                com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.this.finish();
                return true;
            }
        });
        if (booleanExtra) {
            this.f160158e.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.f160156f;
                    com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.this.U6();
                }
            }, 150L);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.modelavatar.y0 y0Var;
        android.content.Intent intent2 = intent;
        com.tencent.mars.xlog.Log.i("MicroMsg.PreviewHdHeadImg", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (intent2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreviewHdHeadImg", "data is null!!!");
        }
        if (i18 != -1) {
            if (i17 == 2 || i17 == 4) {
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.setting.ui.setting.r1(this));
                return;
            }
            return;
        }
        if (i17 != 2 && i17 != 3) {
            if (i17 != 4) {
                return;
            }
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$$c());
            if (intent2 == null) {
                return;
            }
            java.lang.String stringExtra = intent2.getStringExtra("CropImage_OutputPath");
            int intExtra = intent2.getIntExtra("CropImage_source", 0);
            if (stringExtra == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PreviewHdHeadImg", "crop picture failed");
                return;
            }
            if (intExtra == 2) {
                ((com.tencent.mm.plugin.setting.ui.setting.tq) component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).P6(new com.tencent.mm.plugin.setting.ui.setting.pq(2));
            } else {
                ((com.tencent.mm.plugin.setting.ui.setting.tq) component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).P6(new com.tencent.mm.plugin.setting.ui.setting.pq(1));
            }
            v14.p pVar = (v14.p) component(v14.p.class);
            java.lang.String username = this.f160157d;
            yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg$$d
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i19 = com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.f160156f;
                    com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg previewHdHeadImg = com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.this;
                    previewHdHeadImg.getClass();
                    android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0((java.lang.String) obj);
                    com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = previewHdHeadImg.f160158e;
                    if (i07 == null) {
                        getHdHeadImageGalleryView.getClass();
                    } else if (!kotlin.jvm.internal.o.b(getHdHeadImageGalleryView.f161653y1, i07)) {
                        getHdHeadImageGalleryView.f161653y1 = i07;
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetHdHeadImageGalleryView", "onAvatarBitmapChange: " + getHdHeadImageGalleryView.f161648l1 + ", bitmap: " + i07.getWidth() + 'x' + i07.getHeight());
                        ym5.a1.f(new x14.j(getHdHeadImageGalleryView));
                    }
                    return jz5.f0.f302826a;
                }
            };
            pVar.getClass();
            kotlin.jvm.internal.o.g(username, "username");
            boolean booleanExtra = intent2.getBooleanExtra("CropImage_NeedCompress", true);
            if (com.tencent.mm.storage.z3.L4(username)) {
                kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
                androidx.appcompat.app.AppCompatActivity activity = pVar.getActivity();
                ((com.tencent.mm.feature.avatar.k0) l0Var).getClass();
                y0Var = new com.tencent.mm.modelavatar.y0(activity, username, stringExtra, false);
            } else {
                kv.l0 l0Var2 = (kv.l0) i95.n0.c(kv.l0.class);
                androidx.appcompat.app.AppCompatActivity activity2 = pVar.getActivity();
                ((com.tencent.mm.feature.avatar.k0) l0Var2).getClass();
                y0Var = new com.tencent.mm.modelavatar.y0(activity2, stringExtra, false);
            }
            kotlinx.coroutines.l.d(pVar.getLifecycleScope(), null, null, new v14.o(pVar, username, y0Var, booleanExtra, stringExtra, lVar, null), 3, null);
            return;
        }
        if (i17 == 3) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent2, a17);
            if (b17 == null) {
                return;
            }
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(b17);
            java.lang.String str = a18.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                }
            }
            intent2 = new android.content.Intent();
            intent2.setData(a18.h());
        }
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtra("CropImageMode", 1);
        intent3.putExtra("CropImage_Filter", true);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        intent3.putExtra("CropImage_OutputPath", com.tencent.mm.modelavatar.d1.Ai().j(c01.z1.r() + ".crop", true));
        intent3.putExtra("CropImage_source", 1);
        intent3.putExtra("CropImage_from_scene", 3);
        ((com.tencent.mm.plugin.setting.ui.setting.tq) component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).P6(new com.tencent.mm.plugin.setting.ui.setting.nq(1));
        ((com.tencent.mm.app.y7) f14.g.b()).q(this, intent2, intent3, g83.a.a(), 4, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        initView();
        ((com.tencent.mm.plugin.setting.ui.setting.tq) component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).onNewIntent(getIntent());
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            ((com.tencent.mm.plugin.setting.ui.setting.tq) component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).onNewIntent(intent);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        android.view.View findViewById;
        super.onResume();
        if (!com.tencent.mm.ui.b4.c(this) || (findViewById = findViewById(com.tencent.mm.R.id.f482435ei)) == null) {
            return;
        }
        com.tencent.mm.ui.a4.f(findViewById);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.setting.ui.setting.tq.class);
        hashSet.add(v14.p.class);
    }
}
