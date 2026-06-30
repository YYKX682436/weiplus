package com.tencent.mm.plugin.game.chatroom.ui;

@db5.a(3)
@gm0.a2
@ul5.d(0)
/* loaded from: classes12.dex */
public class GameImagePreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f138818q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f138819d;

    /* renamed from: e, reason: collision with root package name */
    public x33.e f138820e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138821f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138822g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138823h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f138824i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f138825m = true;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f138826n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f138827o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f138828p;

    public final android.graphics.Bitmap T6(java.lang.String str) {
        if (str == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameImagePreviewUI", str);
        android.graphics.Bitmap e17 = n11.a.b().e(str + "_" + com.tencent.mm.vfs.w6.k(str));
        if (e17 != null && !e17.isRecycled()) {
            return e17;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "extractBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "extractBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameImagePreviewUI", java.lang.String.valueOf(options.outWidth) + ", " + java.lang.String.valueOf(options.outHeight));
        if (decodeFile != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameImagePreviewUI", "recycle bitmap:%s", decodeFile.toString());
            decodeFile.recycle();
        }
        android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(str);
        if (i07 == null && com.tencent.mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(str) && com.tencent.mm.sdk.platformtools.MMNativeJpeg.isProgressive(str)) {
            i07 = com.tencent.mm.sdk.platformtools.MMNativeJpeg.decodeAsBitmap(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(i07 == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameImagePreviewUI", "Progressive jpeg, result isNull:%b", objArr);
        }
        if (i07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameImagePreviewUI", "getSuitableBmp fail, temBmp is null, filePath = ".concat(str));
            return null;
        }
        n11.a.b().o(str + "_" + com.tencent.mm.vfs.w6.k(str), i07);
        return i07;
    }

    public final void U6(java.lang.String str, boolean z17) {
        android.graphics.Bitmap bitmap;
        boolean z18;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            this.f138820e.f451633d.setVisibility(8);
            this.f138820e.f451631b.setVisibility(8);
            this.f138820e.f451634e.setVisibility(8);
            this.f138820e.f451632c.setVisibility(8);
            int i17 = 1;
            if (rq5.a.d(str)) {
                bitmap = null;
                z18 = true;
            } else {
                bitmap = T6(str);
                z18 = false;
            }
            if (!((bitmap == null || bitmap.isRecycled() || (bitmap.getWidth() <= 1024 && bitmap.getHeight() <= 1024)) ? false : true) && com.tencent.mm.sdk.platformtools.y1.c(str)) {
                try {
                    this.f138820e.f451631b.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
                    this.f138820e.f451631b.setVisibility(0);
                    this.f138820e.f451631b.setImageFilePath(str);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameImagePreviewUI", e17, "", new java.lang.Object[0]);
                    this.f138820e.f451631b.setVisibility(0);
                    this.f138820e.f451631b.setImageBitmap(bitmap);
                }
            } else if (bitmap != null && !bitmap.isRecycled()) {
                this.f138820e.f451631b.setVisibility(8);
                com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f138820e.f451632c;
                multiTouchImageView.setEnabled(true);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                boolean z19 = com.tencent.mm.sdk.platformtools.l1.f192817a;
                int i18 = com.tencent.mm.sdk.platformtools.u1.f193003a.f193033a;
                if (width < i18 && height < i18) {
                    i17 = 0;
                }
                if (multiTouchImageView.getLayerType() != i17) {
                    multiTouchImageView.setLayerType(i17, null);
                }
                multiTouchImageView.setEnableHorLongBmpMode(false);
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                multiTouchImageView.f197651o = width2;
                multiTouchImageView.f197652p = height2;
                multiTouchImageView.setImageBitmap(bitmap);
                multiTouchImageView.setVisibility(0);
            } else if (!z18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameImagePreviewUI", "load image failed");
            } else if (this.f138820e.f451634e.getVisibility() == 8) {
                V6(this.f138820e.f451634e, str);
            }
            if (z17) {
                return;
            }
            this.f138827o = str;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameImagePreviewUI", "Catch Exception");
        }
    }

    public final void V6(com.tencent.mm.ui.base.WxImageView wxImageView, java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, options);
        if (d17 != null) {
            d17.recycle();
        }
        wxImageView.setVisibility(0);
        wxImageView.setOnLongClickListener(new com.tencent.mm.plugin.game.chatroom.ui.h(this));
        wxImageView.setOrientation(com.tencent.mm.sdk.platformtools.l.a(str));
        int i17 = options.outWidth;
        int i18 = options.outHeight;
        wxImageView.f68219h = i17;
        wxImageView.f68220i = i18;
        wxImageView.i();
        wxImageView.t(str, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f138819d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        fullScreenNoTitleBar(true);
        this.f138819d = new android.view.GestureDetector(new com.tencent.mm.plugin.game.chatroom.ui.d(this));
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bge, (android.view.ViewGroup) null, false);
        int i17 = com.tencent.mm.R.id.h88;
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = (com.tencent.mm.plugin.gif.MMAnimateView) x4.b.a(inflate, com.tencent.mm.R.id.h88);
        if (mMAnimateView != null) {
            i17 = com.tencent.mm.R.id.jut;
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) x4.b.a(inflate, com.tencent.mm.R.id.jut);
            if (multiTouchImageView != null) {
                i17 = com.tencent.mm.R.id.lc6;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(inflate, com.tencent.mm.R.id.lc6);
                if (progressBar != null) {
                    i17 = com.tencent.mm.R.id.pr8;
                    com.tencent.mm.ui.base.WxImageView wxImageView = (com.tencent.mm.ui.base.WxImageView) x4.b.a(inflate, com.tencent.mm.R.id.pr8);
                    if (wxImageView != null) {
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
                        this.f138820e = new x33.e(relativeLayout, mMAnimateView, multiTouchImageView, progressBar, wxImageView);
                        setContentView(relativeLayout);
                        this.f138821f = getIntent().getStringExtra("img_aeskey");
                        this.f138822g = getIntent().getStringExtra("img_url");
                        this.f138823h = getIntent().getStringExtra("img_md5");
                        this.f138828p = getIntent().getStringExtra("img_thumb");
                        java.lang.String m17 = s33.y.m(this.f138822g, false);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(m17) || !com.tencent.mm.vfs.w6.j(m17)) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f138828p) && com.tencent.mm.vfs.w6.j(this.f138828p)) {
                                U6(this.f138828p, true);
                            }
                            this.f138824i = e43.c.a(false, this.f138822g, this.f138821f, this.f138823h, new com.tencent.mm.plugin.game.chatroom.ui.e(this));
                        } else {
                            this.f138825m = false;
                            U6(m17, false);
                        }
                        this.f138820e.f451634e.setOnImageLoadEventListener(new com.tencent.mm.plugin.game.chatroom.ui.g(this));
                        if (this.f138825m) {
                            this.f138820e.f451633d.setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f138824i != null) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(this.f138824i);
        }
    }
}
