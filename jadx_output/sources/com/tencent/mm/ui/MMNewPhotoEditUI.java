package com.tencent.mm.ui;

@db5.a(19)
/* loaded from: classes10.dex */
public class MMNewPhotoEditUI extends com.tencent.mm.ui.MMActivity implements qk.i6 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f196899t = 0;

    /* renamed from: d, reason: collision with root package name */
    public qk.o9 f196900d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f196901e;

    /* renamed from: f, reason: collision with root package name */
    public long f196902f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f196903g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f196904h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f196905i;

    /* renamed from: m, reason: collision with root package name */
    public int f196906m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f196907n;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.PhotoEditProxy f196909p;

    /* renamed from: r, reason: collision with root package name */
    public android.app.Dialog f196911r;

    /* renamed from: o, reason: collision with root package name */
    public final k55.k f196908o = new k55.k(this);

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f196910q = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f196912s = null;

    public static void T6(com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI, java.lang.String str) {
        mMNewPhotoEditUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 8);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("image_path", str);
        intent.putExtra("Retr_Msg_Type", 0);
        j45.l.v(mMNewPhotoEditUI, ".ui.transmit.SelectConversationUI", intent, 1);
    }

    public static void U6(com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI, int i17) {
        int i18 = mMNewPhotoEditUI.f196906m;
        int i19 = (i18 == 290 || i18 == 291) ? 1 : (i18 == 4 || i18 == 293) ? 2 : 0;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(13858, java.lang.Integer.valueOf(i19), 1, 1, java.lang.Integer.valueOf(i17));
        int b17 = ((f65.r) mMNewPhotoEditUI.f196900d.b()).b();
        int e17 = ((f65.r) mMNewPhotoEditUI.f196900d.b()).e();
        int c17 = ((f65.r) mMNewPhotoEditUI.f196900d.b()).c();
        int a17 = ((f65.r) mMNewPhotoEditUI.f196900d.b()).a();
        ((f65.r) mMNewPhotoEditUI.f196900d.b()).getClass();
        um.d dVar = (um.d) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.CROP_PHOTO);
        int i27 = (dVar != null && dVar.A3(true) > 0) ? 1 : 0;
        boolean h17 = ((f65.r) mMNewPhotoEditUI.f196900d.b()).h();
        int f17 = ((f65.r) mMNewPhotoEditUI.f196900d.b()).f();
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = java.lang.Integer.valueOf(b17);
        objArr[1] = java.lang.Integer.valueOf(e17);
        objArr[2] = java.lang.Integer.valueOf(c17);
        objArr[3] = java.lang.Integer.valueOf(a17);
        objArr[4] = java.lang.Integer.valueOf(i27);
        objArr[5] = java.lang.Integer.valueOf(f17);
        objArr[6] = java.lang.Integer.valueOf(mMNewPhotoEditUI.f196907n ? 5 : 4);
        objArr[7] = java.lang.Boolean.valueOf(h17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNewPhotoEditUI", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,mSmallPreview:%s isRotaion:%s", objArr);
        java.lang.Object[] objArr2 = new java.lang.Object[11];
        objArr2[0] = 0;
        objArr2[1] = 1;
        objArr2[2] = java.lang.Integer.valueOf(b17);
        objArr2[3] = java.lang.Integer.valueOf(e17);
        objArr2[4] = java.lang.Integer.valueOf(c17);
        objArr2[5] = java.lang.Integer.valueOf(a17);
        objArr2[6] = java.lang.Integer.valueOf(i27);
        objArr2[7] = java.lang.Integer.valueOf(f17);
        objArr2[8] = 1;
        objArr2[9] = java.lang.Integer.valueOf(mMNewPhotoEditUI.f196907n ? 5 : 4);
        objArr2[10] = java.lang.Integer.valueOf(h17 ? 1 : 0);
        g0Var.d(13857, objArr2);
    }

    public static void V6(com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI, java.lang.String str) {
        java.lang.String str2;
        mMNewPhotoEditUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNewPhotoEditUI", "[gotoImagePreviewUI] :%s", str);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = mMNewPhotoEditUI.getIntent().getStringArrayListExtra("preview_image_list");
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = mMNewPhotoEditUI.getIntent().getStringArrayListExtra("preview_select_image_list");
        int i17 = 0;
        while (true) {
            if (stringArrayListExtra == null || i17 >= stringArrayListExtra.size()) {
                break;
            }
            java.lang.String str3 = stringArrayListExtra.get(i17);
            java.lang.String str4 = mMNewPhotoEditUI.f196901e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str4 == null) {
                str4 = "";
            }
            if (!str3.equalsIgnoreCase(str4)) {
                java.lang.String str5 = mMNewPhotoEditUI.f196903g;
                if (!str3.equalsIgnoreCase(str5 != null ? str5 : "")) {
                    arrayList.add(str3);
                    i17++;
                }
            }
            str3 = str;
            arrayList.add(str3);
            i17++;
        }
        for (int i18 = 0; stringArrayListExtra2 != null && i18 < stringArrayListExtra2.size(); i18++) {
            java.lang.String str6 = stringArrayListExtra2.get(i18);
            java.lang.String str7 = mMNewPhotoEditUI.f196901e;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str7 == null) {
                str7 = "";
            }
            if (!str6.equalsIgnoreCase(str7)) {
                java.lang.String str8 = mMNewPhotoEditUI.f196903g;
                if (str8 == null) {
                    str8 = "";
                }
                if (!str6.equalsIgnoreCase(str8)) {
                    arrayList2.add(str6);
                }
            }
            str6 = str;
            arrayList2.add(str6);
        }
        if (mMNewPhotoEditUI.f196905i) {
            str2 = null;
        } else {
            str2 = com.tencent.mm.vfs.w6.i("wcf://temp/photoEdited_" + java.lang.System.currentTimeMillis(), true);
            com.tencent.mm.vfs.w6.c(str, str2);
        }
        com.tencent.mm.vfs.w6.h(mMNewPhotoEditUI.f196903g);
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("max_select_count", mMNewPhotoEditUI.getIntent().getIntExtra("max_select_count", 9));
        intent.putExtra("isPreviewPhoto", true);
        intent.putExtra("raw_photo_path", mMNewPhotoEditUI.f196901e);
        intent.putExtra("raw_photo_img_id", mMNewPhotoEditUI.f196902f);
        intent.putExtra("after_photo_edit", str);
        intent.putExtra("tmp_photo_edit", str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("raw_photo_path", mMNewPhotoEditUI.f196901e);
        bundle.putString("after_photo_edit", str);
        bundle.putInt("report_info_emotion_count", ((f65.r) mMNewPhotoEditUI.f196900d.b()).b());
        bundle.putInt("report_info_text_count", ((f65.r) mMNewPhotoEditUI.f196900d.b()).e());
        bundle.putInt("report_info_mosaic_count", ((f65.r) mMNewPhotoEditUI.f196900d.b()).c());
        bundle.putInt("report_info_doodle_count", ((f65.r) mMNewPhotoEditUI.f196900d.b()).a());
        ((f65.r) mMNewPhotoEditUI.f196900d.b()).getClass();
        um.d dVar = (um.d) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.CROP_PHOTO);
        bundle.putBoolean("report_info_iscrop", dVar != null && dVar.A3(true) > 0);
        bundle.putInt("report_info_undo_count", ((f65.r) mMNewPhotoEditUI.f196900d.b()).f());
        bundle.putBoolean("report_info_is_rotation", ((f65.r) mMNewPhotoEditUI.f196900d.b()).h());
        intent.putExtra("report_info", bundle);
        java.lang.String stringExtra = mMNewPhotoEditUI.getIntent().getStringExtra("GalleryUI_FromUser");
        java.lang.String stringExtra2 = mMNewPhotoEditUI.getIntent().getStringExtra("GalleryUI_ToUser");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            intent.putExtra("GalleryUI_FromUser", stringExtra);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            intent.putExtra("GalleryUI_ToUser", stringExtra2);
        }
        intent.putStringArrayListExtra("preview_image_list", arrayList);
        intent.putStringArrayListExtra("preview_select_image_list", arrayList2);
        mMNewPhotoEditUI.setResult(-1, intent);
        mMNewPhotoEditUI.W6(false);
        mMNewPhotoEditUI.finish();
    }

    public final void W6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNewPhotoEditUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f196912s = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.hly), true, 0, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f196912s;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f196912s.dismiss();
        this.f196912s = null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c7q;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cgi);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        rj.l lVar = new rj.l();
        this.f196900d = lVar;
        qk.l9 l9Var = new qk.l9();
        int i17 = this.f196906m;
        l9Var.f364232b = (i17 == 291 || i17 == 293) ? false : true;
        l9Var.f364233c = true;
        l9Var.f364231a = qk.n9.PHOTO;
        l9Var.f364234d = this.f196901e;
        lVar.d(l9Var);
        qk.s c17 = this.f196900d.c(getContext());
        c17.setActionBarCallback(this);
        frameLayout.addView(c17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        c17.setSelectedFeatureListener(new com.tencent.mm.ui.vd(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || i17 != 1 || intent == null) {
            if (intent == null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f196904h) && this.f196906m == 291) {
                com.tencent.mm.vfs.w6.h(this.f196904h);
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        this.f196911r = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.f492702hi3), true, false, null);
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        com.tencent.mm.ui.PhotoEditProxy photoEditProxy = this.f196909p;
        photoEditProxy.sendImage(stringExtra2, this.f196904h, photoEditProxy.getSelfUsername(), stringExtra);
        android.app.Dialog dialog = this.f196911r;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (this.f196905i) {
            q75.c.f(this.f196904h, this);
        } else {
            com.tencent.mm.vfs.w6.h(this.f196904h);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f196900d.e()) {
            return;
        }
        int i17 = this.f196906m;
        if (i17 == 290 || i17 == 291) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13859, 1, 2);
        } else if (i17 == 4 || i17 == 293) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13859, 2, 2);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13859, 0, 2);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        fullScreenNoTitleBar(true, 0L);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        com.tencent.mm.ui.r0.a(this, false);
        k55.k kVar = this.f196908o;
        this.f196909p = new com.tencent.mm.ui.PhotoEditProxy(kVar);
        kVar.a(new com.tencent.mm.ui.ud(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f196900d.f();
        this.f196908o.d();
    }

    @Override // qk.i6
    public void onFinish() {
        int i17 = this.f196906m;
        if (i17 == 290 || i17 == 291) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13859, 1, 1);
        } else if (i17 == 4 || i17 == 293) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13859, 2, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13859, 0, 1);
        }
        int i18 = this.f196906m;
        if (i18 != 291 && i18 != 293) {
            W6(true);
            this.f196900d.g(new com.tencent.mm.ui.ae(this, -1), true);
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        com.tencent.mm.ui.wd wdVar = new com.tencent.mm.ui.wd(this);
        com.tencent.mm.ui.zd zdVar = new com.tencent.mm.ui.zd(this);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f228381y = null;
            h4Var.f228382z = null;
        }
        arrayList.clear();
        db5.g4 g4Var = new db5.g4(context);
        wdVar.onCreateMMMenu(g4Var);
        if (g4Var.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = wdVar;
            k0Var.f211881s = zdVar;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        db5.e1.a(context2, null);
    }
}
