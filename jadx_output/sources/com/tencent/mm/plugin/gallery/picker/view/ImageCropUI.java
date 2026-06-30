package com.tencent.mm.plugin.gallery.picker.view;

@db5.a(512)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/ImageCropUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class ImageCropUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public int B;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f138473q;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f138476t;

    /* renamed from: u, reason: collision with root package name */
    public z23.h f138477u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f138478v;

    /* renamed from: w, reason: collision with root package name */
    public int f138479w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f138480x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f138481y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.Bitmap f138482z;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f138463d = jz5.h.b(new d33.h(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f138464e = jz5.h.b(new d33.l0(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f138465f = jz5.h.b(new d33.i(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f138466g = jz5.h.b(new d33.d(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f138467h = jz5.h.b(new d33.e(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f138468i = jz5.h.b(new d33.o0(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f138469m = jz5.h.b(new d33.m0(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f138470n = jz5.h.b(new d33.m(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f138471o = jz5.h.b(new d33.g(this));

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f138472p = "";

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f138474r = jz5.h.b(new d33.g0(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f138475s = jz5.h.b(new d33.n0(this));
    public final yz5.q C = new d33.k0(this);
    public final yz5.q D = new d33.l(this);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r2 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T6(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI r15) {
        /*
            java.lang.String r0 = r15.X6()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lda
            boolean r0 = r15.f138478v
            if (r0 == 0) goto L10
            goto Lda
        L10:
            r0 = 1
            r15.f138478v = r0
            r15.b7()
            e60.g1 r0 = new e60.g1
            r0.<init>()
            r1 = 100
            r0.f249702f = r1
            int r1 = com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade.p()
            r0.f249701e = r1
            int r1 = com.tencent.mm.repairer.config.avatar.RepairerConfigAvatarHdResolutionUpgrade.p()
            r0.f249700d = r1
            java.lang.String r1 = r15.Y6()
            r0.f249699c = r1
            java.lang.String r1 = "MicroMsg.AvatarCropUI"
            java.lang.String r2 = "get avatar/cover config"
            com.tencent.mars.xlog.Log.i(r1, r2)
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r1 = r15.V6()
            d33.t0 r1 = r1.getCurrentCropInfo()
            java.lang.String r2 = r15.X6()
            boolean r2 = com.tencent.mm.vfs.w6.j(r2)
            if (r2 == 0) goto L50
            java.lang.String r2 = r15.X6()
        L4e:
            r4 = r2
            goto L96
        L50:
            android.graphics.Bitmap r2 = r15.f138473q
            if (r2 == 0) goto L93
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<lp0.b> r4 = lp0.b.class
            monitor-enter(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r5.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = lp0.b.D()     // Catch: java.lang.Throwable -> L90
            r5.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = "image_crop/"
            r5.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r4)
            r3.append(r5)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            boolean r2 = r15.a7(r3, r2, r4)
            if (r2 == 0) goto L8b
            r15.f138472p = r3
            r2 = r3
            goto L8d
        L8b:
            java.lang.String r2 = ""
        L8d:
            if (r2 != 0) goto L4e
            goto L93
        L90:
            r15 = move-exception
            monitor-exit(r4)
            throw r15
        L93:
            java.lang.String r2 = ""
            goto L4e
        L96:
            kotlin.jvm.internal.o.d(r4)
            java.lang.String r2 = "MicroMsg.AvatarCropUI"
            java.lang.String r3 = "input path: "
            java.lang.String r3 = r3.concat(r4)
            com.tencent.mars.xlog.Log.i(r2, r3)
            z23.h r2 = new z23.h
            r2.<init>(r0)
            r5 = 1
            android.graphics.Matrix r6 = r1.f226276d
            android.graphics.Matrix r0 = r1.f226275c
            r6.set(r0)
            android.graphics.Rect r3 = r1.f226278f
            int r7 = r3.top
            float r7 = (float) r7
            float r7 = -r7
            r8 = 0
            r6.postTranslate(r8, r7)
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r6)
            java.util.Objects.toString(r3)
            android.graphics.Rect r7 = r1.f226278f
            android.graphics.Rect r8 = r1.f226281i
            android.graphics.Rect r9 = r1.f226280h
            r10 = 0
            r11 = 0
            d33.f r12 = new d33.f
            r12.<init>(r15)
            r13 = 128(0x80, float:1.8E-43)
            r14 = 0
            r3 = r2
            e60.i1.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.f138477u = r2
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI.T6(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI):void");
    }

    public static final void U6(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI imageCropUI, int i17, int i18) {
        imageCropUI.getClass();
        if (i17 == 0 || i18 == 0) {
            com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 8");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, 8, 1L);
            imageCropUI.setResult(-1);
            imageCropUI.finish();
            return;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(imageCropUI.X6());
        imageCropUI.f138479w = a17;
        int i19 = (a17 == 90 || a17 == 270) ? i18 : i17;
        int i27 = (a17 == 90 || a17 == 270) ? i17 : i18;
        d33.a aVar = d33.a.f226199a;
        aVar.b(4);
        aVar.c(14);
        aVar.b(13);
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "preview background");
        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(imageCropUI.X6(), i27, i19, true);
        android.widget.ImageView imageView = null;
        android.graphics.Bitmap w07 = T != null ? com.tencent.mm.sdk.platformtools.x.w0(T, imageCropUI.f138479w) : null;
        if (w07 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "background image decode successful");
            aVar.c(20);
            aVar.b(19);
            imageView = imageCropUI.Z6();
            int width = w07.getWidth();
            int height = w07.getHeight();
            int width2 = imageView.getWidth();
            int height2 = imageView.getHeight();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.reset();
            float f17 = width;
            float f18 = width2;
            float f19 = f17 / f18;
            float f27 = height;
            float f28 = height2;
            float f29 = f27 / f28;
            if (f19 >= f29) {
                f19 = f29;
            }
            if (width2 > height2) {
                f18 = f28;
            }
            float f37 = f18 / f17;
            float f38 = f18 / f27;
            if (f37 <= f38) {
                f37 = f38;
            }
            if (f19 < 1.0d) {
                matrix.postScale(f37, f37);
            }
            imageView.setImageMatrix(matrix);
            imageView.setImageBitmap(w07);
        }
        if (imageView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "background image decode fail");
            aVar.b(8);
            imageCropUI.setResult(-1);
            imageCropUI.finish();
        }
    }

    public final com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout V6() {
        return (com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout) ((jz5.n) this.f138463d).getValue();
    }

    public final android.graphics.RectF W6() {
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(null);
        float dimension = a17.f197135a - getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df);
        float f17 = a17.f197136b;
        float f18 = 2;
        float f19 = (f17 - dimension) / f18;
        int i17 = this.B;
        if (i17 != 5 && i17 != 6) {
            return new android.graphics.RectF(getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz), f19, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz) + dimension, dimension + f19);
        }
        float floatExtra = getIntent().getFloatExtra("CropImage_aspect_ratio", 1.0f);
        float f27 = floatExtra > 0.0f ? (1 / floatExtra) * dimension : dimension;
        float f28 = (f17 - f27) / f18;
        return new android.graphics.RectF(getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz), f28, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz) + dimension, f27 + f28);
    }

    public final java.lang.String X6() {
        return (java.lang.String) ((jz5.n) this.f138470n).getValue();
    }

    public final java.lang.String Y6() {
        return (java.lang.String) ((jz5.n) this.f138474r).getValue();
    }

    public final android.widget.ImageView Z6() {
        return (android.widget.ImageView) ((jz5.n) this.f138464e).getValue();
    }

    public final boolean a7(java.lang.String str, android.graphics.Bitmap bitmap, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "saveBitmapToImage successful ");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvatarCropUI", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.AvatarCropUI", "saveBitmapToImage failed: " + e17);
            return false;
        }
    }

    public final void b7() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f138476t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f138476t = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), false, 0, null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489178bk4;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        z23.h hVar = this.f138477u;
        if (hVar != null) {
            hVar.f469746d.shutdownNow();
        }
        com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 9");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, (long) 9, 1L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.B = getIntent().getIntExtra("CropImage_from_scene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "crop image fromScene: " + this.B + ", source: " + ((java.lang.Number) ((jz5.n) this.f138475s).getValue()).intValue());
        com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 10");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1361L, (long) 10, 1L);
        setMMTitle("");
        jz5.g gVar = this.f138471o;
        if (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() == 1) {
            getWindow().setFlags(201327616, 201327616);
            setLightNavigationbarIcon();
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485311h93);
            findViewById.setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(getContext()));
            findViewById.post(new d33.n(findViewById, this));
            setActionbarColor(com.tencent.mm.R.color.a9e);
            setActionbarColor(-16777216);
            fullScreenNoTitleBar(true, 0L);
            ((android.widget.LinearLayout) ((jz5.n) this.f138465f).getValue()).setVisibility(0);
            ((android.widget.Button) ((jz5.n) this.f138466g).getValue()).setOnClickListener(new d33.o(this));
            ((android.widget.Button) ((jz5.n) this.f138467h).getValue()).setOnClickListener(new d33.p(this));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f138469m).getValue()).setOnClickListener(new d33.q(this));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f138468i).getValue()).setOnClickListener(new d33.r(this));
        } else {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.fif), new d33.s(this), null, com.tencent.mm.ui.fb.GREEN);
            setBackBtn(new d33.t(this));
        }
        this.A = false;
        b7();
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        if (intValue == 1) {
            if (this.B == 3) {
                com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 0");
                g0Var.C(1361L, 0, 1L);
                com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "scene avatar");
            } else {
                com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 1");
                g0Var.C(1361L, 1, 1L);
                com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "scene cover");
            }
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout V6 = V6();
            V6.setVisibility(0);
            V6.setShowBorder(false);
            V6.f(W6(), ru3.o.f399765f);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String X6 = X6();
            kotlin.jvm.internal.o.f(X6, "<get-imgPath>(...)");
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout.g(V6, currentTimeMillis, X6, true, null, this.D, 8, null);
            return;
        }
        if (intValue == 2) {
            com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 2");
            g0Var.C(1361L, 2, 1L);
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "scene background");
            android.widget.ImageView Z6 = Z6();
            Z6.post(new d33.x(Z6, this));
            return;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return;
            }
            pm0.v.K(null, new d33.a0(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: 3");
        g0Var.C(1361L, 3, 1L);
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCropUI", "scene emoji");
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout V62 = V6();
        V62.setVisibility(0);
        V62.setShowBorder(false);
        V62.setCropLayoutScaleType(ml5.k.f328432f);
        V62.j();
        pm0.v.K(null, new d33.w(this, V62));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f138473q = null;
        if (android.text.TextUtils.isEmpty(this.f138472p) || !com.tencent.mm.vfs.w6.j(this.f138472p)) {
            return;
        }
        com.tencent.mm.vfs.w6.h(this.f138472p);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
        super.setRequestedOrientation(1);
    }
}
