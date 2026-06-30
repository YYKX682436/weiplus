package com.tencent.mm.plugin.scanner.ui;

@db5.a(35)
/* loaded from: classes3.dex */
public class TranslationResultUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int C = 0;
    public boolean A;
    public com.tencent.mm.view.AnimationLayout B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f159468d;

    /* renamed from: e, reason: collision with root package name */
    public long f159469e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f159470f;

    /* renamed from: g, reason: collision with root package name */
    public int f159471g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f159472h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f159473i;

    /* renamed from: m, reason: collision with root package name */
    public dm.aa f159474m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f159475n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.k4 f159476o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f159477p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.base.MultiTouchImageView f159478q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f159479r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f159480s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f159481t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f159482u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Rect f159483v;

    /* renamed from: w, reason: collision with root package name */
    public float f159484w;

    /* renamed from: x, reason: collision with root package name */
    public float f159485x;

    /* renamed from: y, reason: collision with root package name */
    public float f159486y;

    /* renamed from: z, reason: collision with root package name */
    public float f159487z;

    public final void T6() {
        android.graphics.Rect rect = this.f159483v;
        if (rect == null) {
            finish();
            overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        } else {
            if (this.A) {
                return;
            }
            this.A = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.TranslationResultUI", "runExitAnimation, thumbRect %s", rect);
            this.B.a(this.f159479r, this.f159481t, new com.tencent.mm.view.ViewAnimHelper$ViewInfo(this.f159483v), new com.tencent.mm.plugin.scanner.ui.h4(this), new com.tencent.mm.plugin.scanner.ui.i4(this));
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bkl;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f159481t = findViewById(com.tencent.mm.R.id.m7j);
        this.f159480s = findViewById(com.tencent.mm.R.id.m9u);
        this.f159479r = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.B = (com.tencent.mm.view.AnimationLayout) findViewById(com.tencent.mm.R.id.f483056vf);
        this.f159482u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oje);
        this.f159468d = getIntent().getStringExtra("original_file_path");
        this.f159469e = getIntent().getLongExtra("msg_id", -1L);
        this.f159470f = getIntent().getStringExtra("msg_talker");
        this.f159471g = getIntent().getIntExtra("translate_source", 0);
        this.f159483v = (android.graphics.Rect) getIntent().getParcelableExtra("thumb_location");
        this.f159472h = getIntent().getStringExtra("fileid");
        this.f159473i = getIntent().getStringExtra("aeskey");
        com.tencent.mars.xlog.Log.i("MicroMsg.TranslationResultUI", "file path %s", this.f159468d);
        if (!com.tencent.mm.vfs.w6.j(this.f159468d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TranslationResultUI", "translation original file not exist!");
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m9o);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.bottomMargin += com.tencent.mm.ui.bk.j(this);
        findViewById.setLayoutParams(layoutParams);
        getSupportActionBar().o();
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        getController().E0(getResources().getColor(com.tencent.mm.R.color.a9e));
        this.f159477p = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.oji);
        com.tencent.mm.plugin.scanner.ui.k4 k4Var = new com.tencent.mm.plugin.scanner.ui.k4(this, null);
        this.f159476o = k4Var;
        this.f159477p.setAdapter((android.widget.SpinnerAdapter) k4Var);
        this.f159477p.setSingleClickOverListener(new com.tencent.mm.plugin.scanner.ui.c4(this));
        dm.aa bj6 = ((com.tencent.mm.plugin.scanner.q0) ((com.tencent.mm.plugin.scanner.z) i95.n0.c(com.tencent.mm.plugin.scanner.z.class))).bj(this.f159468d);
        this.f159474m = bj6;
        if (bj6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TranslationResultUI", "translation result not found!");
            T6();
            return;
        }
        android.graphics.Bitmap bitmap = this.f159475n;
        if (bitmap == null) {
            s75.d.f404635a.a(new com.tencent.mm.plugin.scanner.ui.e4(this), "decode_translate_result_img", true);
        } else {
            com.tencent.mm.plugin.scanner.ui.k4 k4Var2 = this.f159476o;
            k4Var2.f159580d = bitmap;
            k4Var2.notifyDataSetChanged();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f159474m.field_brand)) {
            this.f159482u.setText(this.f159474m.field_brand);
            this.f159482u.setVisibility(0);
        }
        this.f159480s.setOnClickListener(new com.tencent.mm.plugin.scanner.ui.f4(this));
        android.view.View view = this.f159480s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f159477p.setGalleryScaleListener(new com.tencent.mm.plugin.scanner.ui.g4(this));
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f159470f, this.f159469e);
        if (this.f159469e != -1) {
            com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = new com.tencent.mm.autogen.events.ChattingUIPhotoInfoEvent();
            chattingUIPhotoInfoEvent.f54044g.f6895a = Li;
            chattingUIPhotoInfoEvent.e();
            android.graphics.Rect rect = new android.graphics.Rect();
            this.f159483v = rect;
            am.j2 j2Var = chattingUIPhotoInfoEvent.f54045h;
            int i17 = j2Var.f6999a;
            rect.left = i17;
            int i18 = j2Var.f7000b;
            rect.top = i18;
            rect.right = j2Var.f7001c + i17;
            rect.bottom = j2Var.f7002d + i18;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f159475n = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        getWindow().getDecorView().setBackgroundDrawable(null);
        getWindow().getDecorView().setSystemUiVisibility(5892);
    }
}
