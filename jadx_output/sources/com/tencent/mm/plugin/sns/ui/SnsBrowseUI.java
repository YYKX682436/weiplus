package com.tencent.mm.plugin.sns.ui;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX)
@ul5.d(0)
/* loaded from: classes4.dex */
public class SnsBrowseUI extends com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI {
    public static final /* synthetic */ int Q1 = 0;
    public com.tencent.mm.ui.tools.s4 A1;
    public android.os.Bundle D1;
    public android.content.Intent G1;
    public java.lang.String S;
    public java.lang.String T;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.b4 f166827p0;

    /* renamed from: x0, reason: collision with root package name */
    public int f166829x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.ImageView f166830x1;

    /* renamed from: y0, reason: collision with root package name */
    public int f166831y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.graphics.Rect f166832y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f166833z1;
    public int U = 0;
    public int V = 0;
    public boolean W = false;
    public boolean X = false;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: l1, reason: collision with root package name */
    public int f166826l1 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public int f166828p1 = 0;
    public final com.tencent.mm.sdk.platformtools.n3 B1 = new com.tencent.mm.sdk.platformtools.n3();
    public int C1 = 0;
    public int E1 = 0;
    public boolean F1 = false;
    public boolean H1 = false;
    public long I1 = 0;
    public boolean J1 = false;
    public boolean K1 = false;
    public float L1 = 1.0f;
    public int M1 = 0;
    public int N1 = 0;
    public boolean O1 = false;
    public final com.tencent.mm.modelbase.u0 P1 = new com.tencent.mm.plugin.sns.ui.ef(this);

    public static /* synthetic */ float r7(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        float f17 = snsBrowseUI.L1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return f17;
    }

    public static /* synthetic */ int s7(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int i17 = snsBrowseUI.f166828p1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return i17;
    }

    public static void w7(android.content.Context context, android.content.Intent intent, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startActivity", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        intent.setClass(context, com.tencent.mm.plugin.sns.ui.SnsBrowseUI.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).overridePendingTransition(0, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startActivity", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public int d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return 3;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            return dispatchKeyEvent;
        }
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f166816u;
        if (multiCodeMaskView != null && multiCodeMaskView.getVisibility() == 0) {
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
            this.f166816u.d(snsInfoFlip != null ? snsInfoFlip.H.longValue() : 0L, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            return true;
        }
        this.G1 = new android.content.Intent();
        X6();
        v7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public int e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return 3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.I1 != 0 && !this.J1) {
            if (this.G1 == null) {
                this.G1 = new android.content.Intent();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "finish: set access back");
            this.G1.putExtra("result_forbid_access", this.H1);
            this.G1.putExtra("result_access_sns_id", this.I1);
        }
        android.content.Intent intent = this.G1;
        if (intent != null) {
            setResult(-1, intent);
        }
        super.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI
    public boolean g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return com.tencent.mm.R.layout.cqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d8  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsBrowseUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "onActivityResult requestCode:" + i17);
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        }
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "onCreate: ");
        com.tencent.mm.ui.bk.u0(this);
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(210, this.P1);
        this.H1 = getIntent().getBooleanExtra("k_forbid_access", false);
        this.I1 = getIntent().getLongExtra("k_feedid_need_check_forbid_access", 0L);
        t7();
        hideTitleView();
        com.tencent.mm.ui.bk.u0(this);
        getIntent().setExtrasClassLoader(getClass().getClassLoader());
        getWindow().setFlags(134218752, 134218752);
        getWindow().addFlags(67108864);
        if (com.tencent.mm.ui.b4.c(this) && enableEdgeToEdgeWrapperLayout()) {
            int color = getResources().getColor(com.tencent.mm.R.color.a9e);
            setActionbarColor(color);
            setNavigationbarColor(color);
        }
        setLightNavigationbarIcon();
        initView();
        this.D1 = bundle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0254  */
    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsBrowseUI.onDestroy():void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.b0();
        }
        super.onPause();
        if (this.O1) {
            this.O1 = false;
            u7(2);
        }
        qp1.h0.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.c0(false);
        }
        qp1.h0.a(true, true, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        android.os.Bundle bundle = this.D1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.Z) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        } else {
            this.Z = true;
            android.graphics.Rect rect = (android.graphics.Rect) getIntent().getParcelableExtra("sns_gallery_thumb_location");
            this.f166832y1 = rect;
            if (rect == null) {
                this.f166832y1 = new android.graphics.Rect();
            }
            com.tencent.mm.ui.tools.s4 s4Var = this.A1;
            android.graphics.Rect rect2 = this.f166832y1;
            s4Var.e(rect2.left, rect2.top, rect2.width(), this.f166832y1.height());
            if (bundle == null) {
                this.f166810o.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.ze(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        }
        super.onStart();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "[notifyData] opType:%s reset:%s localId;%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), str);
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            if (z17) {
                snsInfoFlip.c0(true);
            } else {
                snsInfoFlip.W();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public final void t7() {
        android.view.ViewStub viewStub;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowForbidAccessLayout", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.H1 && (viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.gce)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "checkShowForbidAccessLayout: show Not Access Layout!");
            viewStub.inflate();
            this.H1 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowForbidAccessLayout", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public final void u7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishExitStatus", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent = new com.tencent.mm.autogen.events.GalleryPhotoInfoEvent();
        int currentItem = this.f166810o.getGallery().getCurrentItem();
        am.ie ieVar = galleryPhotoInfoEvent.f54355g;
        ieVar.f6946b = currentItem;
        ieVar.f6945a = this.V;
        ieVar.f6949e = i17;
        galleryPhotoInfoEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishExitStatus", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v7() {
        android.graphics.BitmapFactory.Options n07;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.f166832y1 == null) {
            this.f166832y1 = new android.graphics.Rect();
        }
        android.view.View view = this.f166833z1;
        if (view != null && view.getVisibility() == 0) {
            android.view.View view2 = this.f166833z1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!this.X && !android.text.TextUtils.isEmpty(this.S)) {
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent = new com.tencent.mm.autogen.events.GalleryPhotoInfoEvent();
            int currentItem = this.f166810o.getGallery().getCurrentItem();
            am.ie ieVar = galleryPhotoInfoEvent.f54355g;
            ieVar.f6946b = currentItem;
            ieVar.f6945a = this.V;
            ieVar.f6948d = this.S;
            galleryPhotoInfoEvent.e();
            android.graphics.Rect rect = this.f166832y1;
            am.je jeVar = galleryPhotoInfoEvent.f54356h;
            int i17 = jeVar.f7027a;
            rect.left = i17;
            int i18 = jeVar.f7028b;
            rect.top = i18;
            rect.right = jeVar.f7029c + i17;
            rect.bottom = jeVar.f7030d + i18;
        }
        this.f166829x0 = this.f166810o.getWidth();
        this.f166831y0 = this.f166810o.getHeight();
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.S();
        }
        java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(this.f166810o.getCntMedia());
        if (l17 != null && (n07 = com.tencent.mm.sdk.platformtools.x.n0(l17)) != null) {
            int i19 = (int) ((this.f166829x0 / n07.outWidth) * n07.outHeight);
            this.f166831y0 = i19;
            if (i19 > this.f166810o.getHeight()) {
                if (this.f166831y0 < this.f166810o.getHeight() * 2.5d) {
                    this.C1 = this.f166831y0 - this.f166810o.getHeight();
                    if (this.f166810o.getCount() == 1) {
                        int height = (this.f166810o.getHeight() * this.f166832y1.height()) / this.f166831y0;
                        android.graphics.Rect rect2 = this.f166832y1;
                        rect2.bottom = rect2.top + height;
                        this.C1 = 0;
                    }
                }
                this.f166831y0 = this.f166810o.getHeight();
            }
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.A1;
        int i27 = this.f166829x0;
        int i28 = this.f166831y0;
        s4Var.f210699f = i27;
        s4Var.f210700g = i28;
        android.graphics.Rect rect3 = this.f166832y1;
        s4Var.e(rect3.left, rect3.top, rect3.width(), this.f166832y1.height());
        android.view.View currentImageView = this.f166810o.getCurrentImageView();
        com.tencent.mm.ui.base.MMViewPager gallery = this.f166810o.getGallery();
        android.view.View selectedView = gallery.getSelectedView();
        float width = (this.f166832y1.width() * 1.0f) / gallery.getWidth();
        float f17 = 1.0f - width;
        int height2 = (int) ((this.f166832y1.top - ((gallery.getHeight() * f17) / 2.0f)) - (((gallery.getHeight() - gallery.getWidth()) * width) / 2.0f));
        int width2 = (int) (this.f166832y1.left - ((gallery.getWidth() * f17) / 2.0f));
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPopMediasUI", "runExitAnimation useFixAnimation:%b zoomScale:%f rect:%s gallery width:%d height:%d topOffset:%d  leftOffset:%d", java.lang.Boolean.valueOf(this.K1), java.lang.Float.valueOf(width), this.f166832y1, java.lang.Integer.valueOf(gallery.getWidth()), java.lang.Integer.valueOf(gallery.getHeight()), java.lang.Integer.valueOf(height2), java.lang.Integer.valueOf(width2));
        if (this.K1 && (currentImageView instanceof db5.f0)) {
            ((db5.f0) currentImageView).setAnimationScale(width);
        } else {
            float f18 = this.L1;
            if (f18 != 1.0d) {
                this.A1.f210707n = 1.0f / f18;
                if (this.M1 != 0 || this.N1 != 0) {
                    int width3 = ((int) ((this.f166810o.getWidth() / 2) * (1.0f - this.L1))) + this.M1;
                    int height3 = (int) (((this.f166810o.getHeight() / 2) + this.N1) - ((this.f166831y0 / 2) * this.L1));
                    com.tencent.mm.ui.tools.s4 s4Var2 = this.A1;
                    s4Var2.f210708o = width3;
                    s4Var2.f210709p = height3;
                }
            }
        }
        com.tencent.mm.ui.tools.s4 s4Var3 = this.A1;
        s4Var3.f210711r = this.C1;
        s4Var3.d(selectedView, this.f166830x1, this.K1, new com.tencent.mm.plugin.sns.ui.cf(this, currentImageView, selectedView, width2, height2, width), new com.tencent.mm.ui.tools.l4(this) { // from class: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$c
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void y0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void y1(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        this.U = i17;
        this.M1 = 0;
        this.N1 = 0;
        if (this.E1 == 2) {
            com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(str);
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.a(b17, i17);
            s0Var.q(b17, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }
}
