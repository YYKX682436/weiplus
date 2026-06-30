package com.tencent.mm.plugin.subapp.ui.gallery;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX)
@ul5.d(0)
/* loaded from: classes12.dex */
public class GestureGalleryUI extends com.tencent.mm.ui.MMActivity implements c01.p7, c01.o7, g04.h, com.tencent.mm.plugin.subapp.ui.gallery.i, com.tencent.mm.plugin.subapp.ui.gallery.h {
    public static final /* synthetic */ int G2 = 0;
    public volatile java.lang.String A;
    public int A2;
    public int B;
    public final com.tencent.mm.sdk.event.IListener B2;
    public final com.tencent.mm.sdk.event.IListener C2;
    public android.view.View D2;
    public com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayProgressTask E2;
    public sy3.d F2;
    public com.tencent.mm.plugin.scanner.MultiCodeMaskView G1;

    /* renamed from: J, reason: collision with root package name */
    public android.os.Bundle f172184J;
    public android.view.GestureDetector K1;
    public com.tencent.mm.ui.tools.s4 L;
    public android.view.View M;
    public android.widget.ImageView S;
    public android.widget.TextView U;
    public com.tencent.mm.ui.base.MMPageControlView V;
    public kd0.p2 W;
    public com.tencent.mm.plugin.subapp.ui.gallery.j Y;
    public hy4.h0 Z;

    /* renamed from: b2, reason: collision with root package name */
    public java.util.Set f172186b2;

    /* renamed from: c2, reason: collision with root package name */
    public java.util.Set f172187c2;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter f172188d;

    /* renamed from: d2, reason: collision with root package name */
    public java.util.Map f172189d2;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f172190e;

    /* renamed from: e2, reason: collision with root package name */
    public java.util.ArrayList f172191e2;

    /* renamed from: f, reason: collision with root package name */
    public int f172192f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f172194g;

    /* renamed from: h, reason: collision with root package name */
    public c01.r7 f172196h;

    /* renamed from: h2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f172197h2;

    /* renamed from: i2, reason: collision with root package name */
    public java.util.List f172199i2;

    /* renamed from: j2, reason: collision with root package name */
    public java.util.List f172200j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.List f172201k2;

    /* renamed from: l2, reason: collision with root package name */
    public final java.util.List f172203l2;

    /* renamed from: m2, reason: collision with root package name */
    public int f172205m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f172207n2;

    /* renamed from: o2, reason: collision with root package name */
    public int f172209o2;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.RelativeLayout f172212p1;

    /* renamed from: p2, reason: collision with root package name */
    public int f172213p2;

    /* renamed from: q2, reason: collision with root package name */
    public java.lang.String f172215q2;

    /* renamed from: r2, reason: collision with root package name */
    public java.lang.String f172217r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f172219s2;

    /* renamed from: t2, reason: collision with root package name */
    public boolean f172221t2;

    /* renamed from: u, reason: collision with root package name */
    public int f172222u;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f172223u2;

    /* renamed from: v, reason: collision with root package name */
    public long f172224v;

    /* renamed from: v2, reason: collision with root package name */
    public float f172225v2;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f172226w;

    /* renamed from: w2, reason: collision with root package name */
    public int f172227w2;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f172228x;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.RelativeLayout f172230x1;

    /* renamed from: x2, reason: collision with root package name */
    public int f172231x2;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder f172233y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.RelativeLayout f172234y1;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f172235y2;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar f172237z1;

    /* renamed from: z2, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemSelectedListener f172238z2;

    /* renamed from: i, reason: collision with root package name */
    public boolean f172198i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f172204m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f172206n = false;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f172208o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f172210p = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f172214q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f172216r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f172218s = true;

    /* renamed from: t, reason: collision with root package name */
    public org.json.JSONArray f172220t = null;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f172232y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ImageQBarDataBean f172236z = null;
    public final java.util.Set C = new java.util.HashSet();
    public final java.util.Set D = new java.util.HashSet();
    public final java.util.concurrent.ConcurrentHashMap E = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ConcurrentHashMap F = new java.util.concurrent.ConcurrentHashMap();
    public final java.util.Set G = new java.util.HashSet();
    public boolean H = false;
    public boolean I = false;
    public boolean K = false;
    public int N = 0;
    public int P = 0;
    public int Q = 0;
    public int R = 0;
    public final com.tencent.mm.sdk.platformtools.n3 T = new com.tencent.mm.sdk.platformtools.n3();
    public final boolean X = com.tencent.mm.plugin.scanner.k1.f158750b;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f172211p0 = "";

    /* renamed from: x0, reason: collision with root package name */
    public boolean f172229x0 = false;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f172202l1 = false;
    public long A1 = 0;
    public long B1 = 0;
    public com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState C1 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Idle;
    public boolean D1 = false;
    public boolean E1 = false;
    public boolean F1 = false;
    public java.lang.Long H1 = 0L;
    public java.lang.Long I1 = 0L;
    public java.lang.Long J1 = 0L;
    public int L1 = 1;
    public boolean M1 = true;
    public boolean N1 = true;
    public int O1 = 0;
    public long P1 = 0;
    public long Q1 = 0;
    public long R1 = 0;
    public java.lang.String S1 = null;
    public java.lang.String T1 = null;
    public java.lang.String U1 = null;
    public java.lang.String V1 = null;
    public int W1 = 0;
    public boolean X1 = false;
    public boolean Y1 = false;
    public o25.y1 Z1 = null;

    /* renamed from: a2, reason: collision with root package name */
    public r01.h0 f172185a2 = null;

    /* renamed from: f2, reason: collision with root package name */
    public java.lang.Runnable f172193f2 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$a();

    /* renamed from: g2, reason: collision with root package name */
    public boolean f172195g2 = false;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$11, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass11 implements com.tencent.mm.ui.tools.o5 {
        public AnonymousClass11() {
        }

        @Override // com.tencent.mm.ui.tools.o5
        public void a(float f17, float f18) {
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
            if (gestureGalleryUI.f172190e.getHeight() <= 0) {
                return;
            }
            float height = 1.0f - (f18 / gestureGalleryUI.f172190e.getHeight());
            float f19 = height <= 1.0f ? height : 1.0f;
            gestureGalleryUI.f172225v2 = f19;
            android.view.View c17 = gestureGalleryUI.f172188d.c();
            if (c17 != null) {
                c17.setPivotX(gestureGalleryUI.f172190e.getWidth() / 2);
                c17.setPivotY(gestureGalleryUI.f172190e.getHeight() / 2);
                c17.setScaleX(f19);
                c17.setScaleY(f19);
                c17.setTranslationX(f17);
                c17.setTranslationY(f18);
                gestureGalleryUI.S.setAlpha(f19);
                gestureGalleryUI.w7(f19);
            }
        }

        @Override // com.tencent.mm.ui.tools.o5
        public void b(float f17, float f18) {
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
            gestureGalleryUI.f172227w2 = (int) f17;
            gestureGalleryUI.f172231x2 = (int) f18;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$24, reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass24 implements hw4.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f172291a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene f172292b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f172293c;

        public AnonymousClass24(java.lang.String str, com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene downloadVideoScene, java.lang.String str2) {
            this.f172291a = str;
            this.f172292b = downloadVideoScene;
            this.f172293c = str2;
        }

        @Override // hw4.a
        public int a(com.tencent.mm.network.j2 j2Var, com.tencent.mars.cdn.CronetLogic.ResponseHeader responseHeader, int i17, java.lang.String str) {
            return 0;
        }

        @Override // hw4.a
        public void b(com.tencent.mm.network.j2 j2Var, java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
            final int i17 = (int) ((((float) cronetDownloadProgress.currentWriteByte) / ((float) cronetDownloadProgress.totalByte)) * 100.0f);
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
            if (gestureGalleryUI.f172187c2 == null) {
                gestureGalleryUI.f172187c2 = new java.util.concurrent.CopyOnWriteArraySet();
            }
            if (!gestureGalleryUI.f172187c2.contains(j2Var.f72036b)) {
                gestureGalleryUI.f172187c2.add(j2Var.f72036b);
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "videoDownloadTaskIds = " + java.util.Arrays.toString(gestureGalleryUI.f172187c2.toArray()));
                if (gestureGalleryUI.f172189d2 == null) {
                    gestureGalleryUI.f172189d2 = new java.util.concurrent.ConcurrentHashMap();
                }
                gestureGalleryUI.f172189d2.put(j2Var.f72036b, this.f172293c);
            }
            final java.lang.String str2 = this.f172291a;
            gestureGalleryUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$24$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass24 anonymousClass24 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass24.this;
                    anonymousClass24.getClass();
                    int i18 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    gestureGalleryUI2.D7(gestureGalleryUI2.m7(), i17, str2);
                }
            });
        }

        @Override // hw4.a
        public void c(final com.tencent.mm.network.j2 j2Var, java.lang.String str, com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult, java.lang.String str2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "downloadUrl onCronetTaskCompleted statusCode: %s", java.lang.Integer.valueOf(cronetTaskResult.statusCode));
            if (cronetTaskResult.statusCode == 200) {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                ((java.util.concurrent.CopyOnWriteArraySet) gestureGalleryUI.f172186b2).remove(this.f172291a);
                final java.lang.String str3 = this.f172291a;
                final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene downloadVideoScene = this.f172292b;
                final java.lang.String str4 = this.f172293c;
                gestureGalleryUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$24$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass24 anonymousClass24 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass24.this;
                        anonymousClass24.getClass();
                        int i17 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder m76 = gestureGalleryUI2.m7();
                        java.util.List list = gestureGalleryUI2.f172201k2;
                        java.lang.String str5 = str3;
                        if (m76 != null) {
                            java.util.ArrayList arrayList = (java.util.ArrayList) list;
                            if (!((java.util.concurrent.CopyOnWriteArraySet) gestureGalleryUI2.f172186b2).contains(((com.tencent.mm.media.model.AppBrandMediaSource) arrayList.get(gestureGalleryUI2.f172209o2)).f68932d)) {
                                if (m76.f172359i.getVisibility() == 0) {
                                    gestureGalleryUI2.D7(m76, 100, str5);
                                    m76.f172359i.setVisibility(8);
                                }
                                m76.f172356f.setVisibility(0);
                                gestureGalleryUI2.f172237z1.setVisibility(0);
                            }
                        }
                        java.util.Set set = gestureGalleryUI2.f172187c2;
                        if (set != null) {
                            com.tencent.mm.network.j2 j2Var2 = j2Var;
                            if (set.contains(j2Var2.f72036b)) {
                                if (gestureGalleryUI2.u7(gestureGalleryUI2.f172209o2)) {
                                    if (str5.equals(((com.tencent.mm.media.model.AppBrandMediaSource) ((java.util.ArrayList) list).get(gestureGalleryUI2.f172209o2)).f68932d)) {
                                        gestureGalleryUI2.E7(downloadVideoScene, str4);
                                    }
                                }
                                gestureGalleryUI2.f172187c2.remove(j2Var2.f72036b);
                                java.util.Map map = gestureGalleryUI2.f172189d2;
                                if (map != null) {
                                    map.remove(j2Var2.f72036b);
                                }
                            }
                        }
                    }
                });
            }
        }

        @Override // hw4.a
        public void d(com.tencent.mm.network.j2 j2Var) {
            j2Var.f72040f = 50000;
            j2Var.f72039e = 10000;
        }
    }

    /* loaded from: classes6.dex */
    public enum DownloadVideoScene {
        SHARE_TO_FRIEND,
        SAVE_LOCAL
    }

    /* loaded from: classes12.dex */
    public class ImageAdapter extends android.widget.BaseAdapter {

        /* loaded from: classes12.dex */
        public class ViewHolder {

            /* renamed from: a, reason: collision with root package name */
            public android.widget.ProgressBar f172351a;

            /* renamed from: b, reason: collision with root package name */
            public com.tencent.mm.plugin.gif.MMAnimateView f172352b;

            /* renamed from: c, reason: collision with root package name */
            public android.widget.ImageView f172353c;

            /* renamed from: d, reason: collision with root package name */
            public android.view.View f172354d;

            /* renamed from: e, reason: collision with root package name */
            public android.widget.VideoView f172355e;

            /* renamed from: f, reason: collision with root package name */
            public android.widget.ImageView f172356f;

            /* renamed from: g, reason: collision with root package name */
            public android.view.View f172357g;

            /* renamed from: h, reason: collision with root package name */
            public android.widget.TextView f172358h;

            /* renamed from: i, reason: collision with root package name */
            public com.tencent.mm.ui.widget.loading.MMProgressLoading f172359i;

            /* renamed from: j, reason: collision with root package name */
            public com.tencent.mm.ui.base.MultiTouchImageView f172360j;

            /* renamed from: k, reason: collision with root package name */
            public com.tencent.mm.ui.base.WxImageView f172361k;

            /* renamed from: l, reason: collision with root package name */
            public android.widget.Button f172362l;

            public ViewHolder(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter imageAdapter) {
            }
        }

        public ImageAdapter(android.content.Context context) {
        }

        public android.graphics.Bitmap a(java.lang.String str) {
            if (str == null) {
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", str);
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
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter", "extractBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
            yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter", "extractBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", java.lang.String.valueOf(options.outWidth) + ", " + java.lang.String.valueOf(options.outHeight));
            if (decodeFile != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "recycle bitmap:%s", decodeFile.toString());
                decodeFile.recycle();
            }
            android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(str);
            if (i07 == null && com.tencent.mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(str) && com.tencent.mm.sdk.platformtools.MMNativeJpeg.isProgressive(str)) {
                i07 = com.tencent.mm.sdk.platformtools.MMNativeJpeg.decodeAsBitmap(str);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(i07 == null);
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "Progressive jpeg, result isNull:%b", objArr);
            }
            if (i07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "getSuitableBmp fail, temBmp is null, filePath = ".concat(str));
                return null;
            }
            n11.a.b().o(str + "_" + com.tencent.mm.vfs.w6.k(str), i07);
            return i07;
        }

        public android.view.View c() {
            com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172190e;
            if (mMGestureGallery != null) {
                return mMGestureGallery.getSelectedView();
            }
            return null;
        }

        public void d(com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView, android.graphics.Bitmap bitmap, boolean z17) {
            if (bitmap == null) {
                return;
            }
            if (z17) {
                multiTouchImageView.setEnabled(false);
            } else {
                multiTouchImageView.setEnabled(true);
            }
            multiTouchImageView.setEnableHorLongBmpMode(false);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
            multiTouchImageView.setImageBitmap(bitmap);
            multiTouchImageView.setVisibility(0);
        }

        public void f(com.tencent.mm.ui.base.WxImageView wxImageView, java.lang.String str) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, options);
            if (d17 != null) {
                d17.recycle();
            }
            wxImageView.setVisibility(0);
            wxImageView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.1
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.r7();
                    yj0.a.i(true, this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$ImageAdapter$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
            });
            wxImageView.setOrientation(com.tencent.mm.sdk.platformtools.l.a(str));
            int i17 = options.outWidth;
            int i18 = options.outHeight;
            wxImageView.f68219h = i17;
            wxImageView.f68220i = i18;
            wxImageView.i();
            wxImageView.t(str, null);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
            gestureGalleryUI.f172199i2.size();
            return gestureGalleryUI.f172199i2.size();
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i17) {
            return java.lang.Integer.valueOf(i17);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i17) {
            return i17;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x047b A[Catch: Exception -> 0x0482, TRY_LEAVE, TryCatch #1 {Exception -> 0x0482, blocks: (B:42:0x02f7, B:44:0x0300, B:46:0x0309, B:50:0x033e, B:53:0x0344, B:56:0x034c, B:59:0x0352, B:61:0x0358, B:63:0x0360, B:71:0x03aa, B:73:0x03b0, B:75:0x03b4, B:77:0x03b8, B:82:0x03e1, B:85:0x0400, B:87:0x0406, B:90:0x0418, B:92:0x041e, B:94:0x043f, B:96:0x0445, B:98:0x045b, B:100:0x0465, B:102:0x0469, B:103:0x0475, B:104:0x047b, B:105:0x0370, B:107:0x0393, B:109:0x0399, B:116:0x0316, B:118:0x031a, B:120:0x0322, B:122:0x0334, B:124:0x0339, B:79:0x03bb), top: B:41:0x02f7, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x03a8  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0488  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x02f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x036b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x03b8 A[Catch: Exception -> 0x0482, TRY_LEAVE, TryCatch #1 {Exception -> 0x0482, blocks: (B:42:0x02f7, B:44:0x0300, B:46:0x0309, B:50:0x033e, B:53:0x0344, B:56:0x034c, B:59:0x0352, B:61:0x0358, B:63:0x0360, B:71:0x03aa, B:73:0x03b0, B:75:0x03b4, B:77:0x03b8, B:82:0x03e1, B:85:0x0400, B:87:0x0406, B:90:0x0418, B:92:0x041e, B:94:0x043f, B:96:0x0445, B:98:0x045b, B:100:0x0465, B:102:0x0469, B:103:0x0475, B:104:0x047b, B:105:0x0370, B:107:0x0393, B:109:0x0399, B:116:0x0316, B:118:0x031a, B:120:0x0322, B:122:0x0334, B:124:0x0339, B:79:0x03bb), top: B:41:0x02f7, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x03fe A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0416 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x043f A[Catch: Exception -> 0x0482, TryCatch #1 {Exception -> 0x0482, blocks: (B:42:0x02f7, B:44:0x0300, B:46:0x0309, B:50:0x033e, B:53:0x0344, B:56:0x034c, B:59:0x0352, B:61:0x0358, B:63:0x0360, B:71:0x03aa, B:73:0x03b0, B:75:0x03b4, B:77:0x03b8, B:82:0x03e1, B:85:0x0400, B:87:0x0406, B:90:0x0418, B:92:0x041e, B:94:0x043f, B:96:0x0445, B:98:0x045b, B:100:0x0465, B:102:0x0469, B:103:0x0475, B:104:0x047b, B:105:0x0370, B:107:0x0393, B:109:0x0399, B:116:0x0316, B:118:0x031a, B:120:0x0322, B:122:0x0334, B:124:0x0339, B:79:0x03bb), top: B:41:0x02f7, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x045b A[Catch: Exception -> 0x0482, TryCatch #1 {Exception -> 0x0482, blocks: (B:42:0x02f7, B:44:0x0300, B:46:0x0309, B:50:0x033e, B:53:0x0344, B:56:0x034c, B:59:0x0352, B:61:0x0358, B:63:0x0360, B:71:0x03aa, B:73:0x03b0, B:75:0x03b4, B:77:0x03b8, B:82:0x03e1, B:85:0x0400, B:87:0x0406, B:90:0x0418, B:92:0x041e, B:94:0x043f, B:96:0x0445, B:98:0x045b, B:100:0x0465, B:102:0x0469, B:103:0x0475, B:104:0x047b, B:105:0x0370, B:107:0x0393, B:109:0x0399, B:116:0x0316, B:118:0x031a, B:120:0x0322, B:122:0x0334, B:124:0x0339, B:79:0x03bb), top: B:41:0x02f7, inners: #0 }] */
        @Override // android.widget.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.view.View getView(final int r23, android.view.View r24, android.view.ViewGroup r25) {
            /*
                Method dump skipped, instructions count: 1248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* loaded from: classes12.dex */
    public class PlayProgressTask implements java.lang.Runnable {

        /* renamed from: d, reason: collision with root package name */
        public boolean f172363d = true;

        public PlayProgressTask(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass1 anonymousClass1) {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "start run play progress task");
            while (!this.f172363d) {
                try {
                    final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState playerState = gestureGalleryUI.C1;
                    if ((playerState == com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Start || playerState == com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Prepared || playerState == com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Resume) && gestureGalleryUI.f172233y0 != null) {
                        gestureGalleryUI.f172237z1.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.44
                            @Override // java.lang.Runnable
                            public void run() {
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                                gestureGalleryUI2.f172237z1.a(gestureGalleryUI2.f172233y0.f172355e.getCurrentPosition() / 1000);
                            }
                        });
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "PlayProgressTask run exception:" + e17.getMessage());
                }
                try {
                    java.lang.Thread.sleep(200L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public enum PlayerState {
        Idle,
        Prepared,
        Start,
        Resume,
        Paused,
        Complete,
        Stop,
        Error
    }

    /* loaded from: classes8.dex */
    public interface WatermarkCallback {
        void a(java.lang.String str);
    }

    public GestureGalleryUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f172197h2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CloseImagePreviewEvent>(a0Var) { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.3
            {
                this.__eventId = 105104325;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CloseImagePreviewEvent closeImagePreviewEvent) {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.finish();
                return false;
            }
        };
        this.f172199i2 = new java.util.ArrayList();
        this.f172200j2 = new java.util.ArrayList();
        this.f172201k2 = new java.util.ArrayList();
        this.f172203l2 = new java.util.ArrayList();
        this.f172205m2 = 0;
        this.f172207n2 = false;
        this.f172209o2 = -1;
        this.f172213p2 = -1;
        this.f172215q2 = null;
        this.f172217r2 = null;
        this.f172219s2 = false;
        this.f172221t2 = false;
        this.f172223u2 = false;
        this.f172225v2 = 1.0f;
        this.f172227w2 = 0;
        this.f172231x2 = 0;
        this.f172235y2 = false;
        this.f172238z2 = new android.widget.AdapterView.OnItemSelectedListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.30

            /* renamed from: d, reason: collision with root package name */
            public android.widget.VideoView f172305d;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                org.json.JSONArray jSONArray;
                android.view.View view2;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "onItemSelected  pos:" + i17);
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                gestureGalleryUI.f172209o2 = i17;
                gestureGalleryUI.U.setText((gestureGalleryUI.f172209o2 + 1) + "/" + gestureGalleryUI.f172188d.getCount());
                gestureGalleryUI.setMMTitle("" + (gestureGalleryUI.f172209o2 + 1) + " / " + gestureGalleryUI.f172199i2.size());
                gestureGalleryUI.f172211p0 = (java.lang.String) gestureGalleryUI.f172199i2.get(i17);
                gestureGalleryUI.f172194g = "";
                if (gestureGalleryUI.N1) {
                    if (gestureGalleryUI.V.getCount() != gestureGalleryUI.f172188d.getCount()) {
                        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = gestureGalleryUI.V;
                        int count = gestureGalleryUI.f172188d.getCount();
                        int i18 = gestureGalleryUI.f172209o2;
                        mMPageControlView.f197514e = count;
                        mMPageControlView.a(i18);
                    }
                    gestureGalleryUI.V.setPage(gestureGalleryUI.f172209o2);
                }
                gestureGalleryUI.f172202l1 = false;
                android.widget.VideoView videoView = this.f172305d;
                if (videoView != null) {
                    videoView.stopPlayback();
                    this.f172305d = null;
                }
                gestureGalleryUI.f172237z1.setIsPlay(false);
                gestureGalleryUI.C1 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Idle;
                if (view != null && view.getTag() != null) {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder viewHolder = (com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder) view.getTag();
                    if (viewHolder != null && gestureGalleryUI.u7(i17)) {
                        this.f172305d = viewHolder.f172355e;
                        gestureGalleryUI.f172233y0 = viewHolder;
                        android.view.View view3 = viewHolder.f172354d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        java.util.Set set = gestureGalleryUI.f172186b2;
                        if (set != null) {
                            if (((java.util.concurrent.CopyOnWriteArraySet) set).contains(((com.tencent.mm.media.model.AppBrandMediaSource) ((java.util.ArrayList) gestureGalleryUI.f172201k2).get(gestureGalleryUI.f172209o2)).f68932d)) {
                                viewHolder.f172356f.setVisibility(8);
                                viewHolder.f172359i.setVisibility(0);
                                gestureGalleryUI.f172237z1.setVisibility(8);
                                viewHolder.f172351a.setVisibility(8);
                                android.view.View view4 = viewHolder.f172357g;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                arrayList3.add(8);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                yj0.a.f(view4, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                        viewHolder.f172356f.setVisibility(0);
                        viewHolder.f172359i.setVisibility(8);
                        gestureGalleryUI.f172237z1.setVisibility(0);
                        viewHolder.f172351a.setVisibility(8);
                        android.view.View view42 = viewHolder.f172357g;
                        java.util.ArrayList arrayList32 = new java.util.ArrayList();
                        arrayList32.add(8);
                        java.util.Collections.reverse(arrayList32);
                        yj0.a.d(view42, arrayList32.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view42.setVisibility(((java.lang.Integer) arrayList32.get(0)).intValue());
                        yj0.a.f(view42, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else if (viewHolder != null && (view2 = viewHolder.f172354d) != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                if (gestureGalleryUI.u7(i17)) {
                    gestureGalleryUI.f172194g = gestureGalleryUI.o7();
                    gestureGalleryUI.f172192f = i17;
                } else {
                    java.lang.String c17 = gestureGalleryUI.f172196h.c((java.lang.String) gestureGalleryUI.f172199i2.get(i17), gestureGalleryUI.f172205m2, i17, gestureGalleryUI.f172210p);
                    gestureGalleryUI.f172194g = c17;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                        gestureGalleryUI.f172194g = (java.lang.String) gestureGalleryUI.f172199i2.get(i17);
                    }
                    gestureGalleryUI.f172192f = i17;
                    if (gestureGalleryUI.D2 != null && (jSONArray = gestureGalleryUI.f172220t) != null) {
                        int length = jSONArray.length();
                        int i19 = gestureGalleryUI.f172192f;
                        if (length > i19) {
                            if (gestureGalleryUI.f172220t.optJSONObject(i19) == null || !gestureGalleryUI.f172220t.optJSONObject(gestureGalleryUI.f172192f).has("jumpType")) {
                                android.view.View view5 = gestureGalleryUI.D2;
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                                arrayList5.add(8);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                yj0.a.f(view5, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                android.view.View view6 = gestureGalleryUI.D2;
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                                arrayList6.add(0);
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                yj0.a.f(view6, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "curFilename:%s", gestureGalleryUI.f172194g);
                if (gestureGalleryUI.H) {
                    gestureGalleryUI.f172190e.setGalleryScaleListener(new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass11());
                }
                gestureGalleryUI.f172234y1.setVisibility(8);
                gestureGalleryUI.h7();
                int i27 = gestureGalleryUI.f172192f;
                if (gestureGalleryUI.f172219s2 || gestureGalleryUI.f172221t2) {
                    com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent webViewImagePreviewPositionChangedEvent = new com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent();
                    am.m20 m20Var = webViewImagePreviewPositionChangedEvent.f54985g;
                    m20Var.f7317b = i27;
                    m20Var.f7316a = gestureGalleryUI.f172204m;
                    webViewImagePreviewPositionChangedEvent.e();
                }
                gestureGalleryUI.f7(1);
                gestureGalleryUI.K7(gestureGalleryUI.f172209o2);
                gestureGalleryUI.y7(gestureGalleryUI.f172209o2);
                yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$30", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(android.widget.AdapterView adapterView) {
            }
        };
        this.A2 = -1;
        this.B2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.31
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                if (recogQBarOfImageFileResultEvent2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "RecogQBarOfImageFileResultEvent is null.");
                } else if (recogQBarOfImageFileResultEvent2.f54661g.f6368a.equals(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.A)) {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    int i17 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    gestureGalleryUI.getClass();
                    java.util.ArrayList a17 = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a.a(recogQBarOfImageFileResultEvent2);
                    if (gestureGalleryUI.E1 || gestureGalleryUI.f172214q) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        boolean o17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(gestureGalleryUI.f172217r2);
                        android.os.Bundle bundleExtra = gestureGalleryUI.getIntent().getBundleExtra("_stat_obj");
                        java.util.Iterator it = a17.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) it.next();
                            if (com.tencent.mm.plugin.scanner.z0.c(imageQBarDataBean.f158620e, imageQBarDataBean.f158619d, o17, gestureGalleryUI.f172216r)) {
                                arrayList.add(imageQBarDataBean);
                                gestureGalleryUI.B7(true, imageQBarDataBean.f158620e, imageQBarDataBean.f158619d, false, bundleExtra);
                            } else {
                                gestureGalleryUI.B7(false, imageQBarDataBean.f158620e, imageQBarDataBean.f158619d, false, bundleExtra);
                            }
                        }
                        a17 = arrayList;
                    }
                    gestureGalleryUI.f172232y = a17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "recog result size: " + com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172232y.size());
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.H1 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.I1 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.J1.longValue());
                    if (com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172232y.size() != 0) {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.A = null;
                        if (com.tencent.mm.sdk.platformtools.t8.L0(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172232y)) {
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172236z = null;
                        } else {
                            com.tencent.mm.ui.widget.dialog.k0 k0Var = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172226w;
                            if ((k0Var != null && k0Var.i()) || com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172229x0) {
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.I7();
                            }
                            com.tencent.mm.plugin.scanner.ImageQBarDataBean q76 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.q7();
                            if (q76 != null) {
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                                gestureGalleryUI2.f172236z = q76;
                                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) gestureGalleryUI2.W).i(q76.f158620e, com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.d7(gestureGalleryUI2, q76.f158619d));
                            } else if (com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172232y.size() == 1) {
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI3 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                                gestureGalleryUI3.f172236z = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) gestureGalleryUI3.f172232y.get(0);
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI4 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                                kd0.p2 p2Var = gestureGalleryUI4.W;
                                com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean2 = gestureGalleryUI4.f172236z;
                                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).i(imageQBarDataBean2.f158620e, com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.d7(gestureGalleryUI4, imageQBarDataBean2.f158619d));
                            } else {
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172236z = null;
                            }
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "not same filepath");
                }
                return false;
            }
        };
        this.C2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.32
            {
                this.__eventId = 1280295539;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
                com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean;
                com.tencent.mm.autogen.events.NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent2 = notifyDealQBarStrResultEvent;
                if (notifyDealQBarStrResultEvent2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "NotifyDealQBarStrResultEvent is null.");
                    return false;
                }
                am.kl klVar = notifyDealQBarStrResultEvent2.f54539g;
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "notify Event: %d", java.lang.Integer.valueOf(klVar.f7168c));
                android.app.Activity activity = klVar.f7167b;
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                if (activity != gestureGalleryUI || (imageQBarDataBean = gestureGalleryUI.f172236z) == null || !klVar.f7166a.equals(imageQBarDataBean.f158619d)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "not the same");
                    return false;
                }
                if (klVar.f7168c != 3) {
                    return false;
                }
                gestureGalleryUI.finish();
                return false;
            }
        };
    }

    public static void T6(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI, int i17) {
        java.util.ArrayList arrayList = gestureGalleryUI.f172191e2;
        com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo circleSearchInfo = (arrayList == null || gestureGalleryUI.f172209o2 >= arrayList.size()) ? null : (com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo) gestureGalleryUI.f172191e2.get(gestureGalleryUI.f172209o2);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (circleSearchInfo != null) {
            hashMap.putAll(circleSearchInfo.b());
        }
        java.lang.String mpImageUrl = (java.lang.String) gestureGalleryUI.f172199i2.get(gestureGalleryUI.f172209o2);
        java.lang.String mpSourceUrl = gestureGalleryUI.f172217r2;
        kotlin.jvm.internal.o.g(mpImageUrl, "mpImageUrl");
        kotlin.jvm.internal.o.g(mpSourceUrl, "mpSourceUrl");
        java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("item_show_type", 0), new jz5.l("mp_image_url", mpImageUrl), new jz5.l("mp_source_url", mpSourceUrl))).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        hashMap.put("reportInfoFor33399", jSONObject);
        int i18 = gestureGalleryUI.f172221t2 ? 8 : 7;
        if (gestureGalleryUI.f172223u2) {
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            hashMap.put("thirdExtInfo", L.getString("KPassExtInfoToSearch", ""));
            hashMap.put("reportInfoFor33399", L.getString("KPassReportInfoToSearch", ""));
            i18 = 16;
        }
        hashMap.put("imgPath", gestureGalleryUI.f172194g);
        hashMap.put("imageUrl", gestureGalleryUI.f172199i2.get(gestureGalleryUI.f172209o2));
        hashMap.put("sourceUrl", gestureGalleryUI.f172217r2);
        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(gestureGalleryUI.getContext(), i18, i17, hashMap);
        if (circleSearchInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(circleSearchInfo.f181452p)) {
            return;
        }
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).fj(34875, circleSearchInfo.a(((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).f407702d, 3000));
    }

    public static void U6(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI, int i17) {
        java.lang.String str = gestureGalleryUI.f172194g;
        if (str == null || str.equals("")) {
            return;
        }
        try {
            su4.i1 i1Var = new su4.i1();
            i1Var.f412923b = gestureGalleryUI.getContext();
            i1Var.f412928g = gestureGalleryUI.f172194g;
            i1Var.f412925d = i17;
            i1Var.f412930i = gestureGalleryUI.f172222u;
            i1Var.f412922a = gestureGalleryUI.f172224v;
            ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "doSosAction fail, ex = ", e17);
        }
    }

    public static void V6(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI, int i17) {
        if (gestureGalleryUI.F2 == null) {
            ((yz3.q) ((ty3.e) i95.n0.c(ty3.e.class))).getClass();
            gestureGalleryUI.F2 = new kz3.o();
        }
        sy3.d dVar = gestureGalleryUI.F2;
        int i18 = (gestureGalleryUI.E1 || gestureGalleryUI.f172214q) ? 6 : 5;
        java.lang.String str = gestureGalleryUI.f172194g;
        ((kz3.o) dVar).a(i17, i18, (str == null || !((java.util.HashSet) gestureGalleryUI.G).contains(str)) ? 0 : 1);
    }

    public static void W6(final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(gestureGalleryUI.f172194g)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GestureGalleryUI", "share image to friend fail, imgPath is null");
            return;
        }
        gestureGalleryUI.g7(1, null);
        final int i17 = (gestureGalleryUI.f172214q || gestureGalleryUI.E1) ? 6 : 5;
        if (!com.tencent.mm.sdk.platformtools.y1.c(gestureGalleryUI.f172194g)) {
            if (gestureGalleryUI.u7(gestureGalleryUI.f172209o2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "send video to friend");
                s75.d.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$e
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        java.lang.String str = ((com.tencent.mm.media.model.AppBrandMediaSource) ((java.util.ArrayList) gestureGalleryUI2.f172201k2).get(gestureGalleryUI2.f172209o2)).f68932d;
                        gestureGalleryUI2.k7(str, go4.a.a(gestureGalleryUI2.getContext()).a(str).getAbsolutePath(), com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene.SHARE_TO_FRIEND);
                    }
                }, "");
                return;
            }
            r01.h0 h0Var = gestureGalleryUI.f172185a2;
            if (h0Var == null || !h0Var.f368094b || com.tencent.mm.sdk.platformtools.y1.c(gestureGalleryUI.f172194g)) {
                gestureGalleryUI.i7(gestureGalleryUI.f172194g, i17);
                return;
            } else {
                gestureGalleryUI.l7(new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.WatermarkCallback() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.23
                    @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.WatermarkCallback
                    public void a(java.lang.String str) {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        com.tencent.mm.sdk.platformtools.x.L0(com.tencent.mm.sdk.platformtools.x.Y(gestureGalleryUI2.f172194g), str);
                        gestureGalleryUI2.i7(str, i17);
                    }
                });
                return;
            }
        }
        com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(com.tencent.mm.vfs.w6.p(gestureGalleryUI.f172194g));
        if (N == null) {
            N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).I(com.tencent.mm.sdk.platformtools.x2.f193071a, gestureGalleryUI.f172194g));
        }
        long k17 = N == null ? 0L : com.tencent.mm.vfs.w6.k(N.N0());
        java.lang.String N0 = N == null ? gestureGalleryUI.f172194g : N.N0();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        boolean z17 = (com.tencent.mm.sdk.platformtools.x.J(N0, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            db5.e1.y(gestureGalleryUI.getContext(), gestureGalleryUI.getString(com.tencent.mm.R.string.f493407k21), "", gestureGalleryUI.getString(com.tencent.mm.R.string.apu), null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_File_Name", N != null ? N.getMd5() : "");
        intent.putExtra("Retr_Msg_Type", 5);
        intent.putExtra("Retr_MsgImgScene", 1);
        intent.putExtra("from_scene_forward_to_wework", i17);
        intent.putExtra("content_type_forward_to_wework", 14);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.v(intent, gestureGalleryUI.getContext());
    }

    public static void X6(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI, int i17) {
        gestureGalleryUI.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FTSSeachSimilarImgActionReportStruct fTSSeachSimilarImgActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FTSSeachSimilarImgActionReportStruct();
        fTSSeachSimilarImgActionReportStruct.f56142d = 2L;
        fTSSeachSimilarImgActionReportStruct.f56146h = fTSSeachSimilarImgActionReportStruct.b("PicMD5", com.tencent.mm.sdk.platformtools.w2.a(gestureGalleryUI.f172211p0), true);
        fTSSeachSimilarImgActionReportStruct.f56147i = i17;
        fTSSeachSimilarImgActionReportStruct.f56143e = fTSSeachSimilarImgActionReportStruct.b("SessionId", "", true);
        fTSSeachSimilarImgActionReportStruct.f56145g = fTSSeachSimilarImgActionReportStruct.b("DocId", "", true);
        fTSSeachSimilarImgActionReportStruct.f56144f = fTSSeachSimilarImgActionReportStruct.b("SearchId", "", true);
        fTSSeachSimilarImgActionReportStruct.k();
    }

    public static void Y6(final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI) {
        java.lang.String str = gestureGalleryUI.f172194g;
        if (str == null || str.equals("")) {
            return;
        }
        java.util.ArrayList arrayList = gestureGalleryUI.f172232y;
        gestureGalleryUI.g7(2, (arrayList == null || arrayList.size() <= 0) ? null : (com.tencent.mm.plugin.scanner.ImageQBarDataBean) gestureGalleryUI.f172232y.get(0));
        if (!c01.d9.b().E()) {
            db5.t7.k(gestureGalleryUI, null);
            return;
        }
        if (gestureGalleryUI.u7(gestureGalleryUI.f172209o2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "save video to album");
            s75.d.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$g
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    java.lang.String str2 = ((com.tencent.mm.media.model.AppBrandMediaSource) ((java.util.ArrayList) gestureGalleryUI2.f172201k2).get(gestureGalleryUI2.f172209o2)).f68932d;
                    gestureGalleryUI2.k7(str2, go4.a.a(gestureGalleryUI2.getContext()).a(str2).getAbsolutePath(), com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene.SAVE_LOCAL);
                }
            }, "");
            return;
        }
        r01.h0 h0Var = gestureGalleryUI.f172185a2;
        if (h0Var != null && h0Var.f368094b && !com.tencent.mm.sdk.platformtools.y1.c(gestureGalleryUI.f172194g)) {
            gestureGalleryUI.l7(new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.WatermarkCallback() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.26
                @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.WatermarkCallback
                public void a(java.lang.String str2) {
                    zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                    ((yb0.g) b0Var).wi(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this, str2, new zb0.a0() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.26.1
                        @Override // zb0.a0
                        public void a(java.lang.String str3, java.lang.String str4) {
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass26 anonymousClass26 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass26.this;
                            com.tencent.mm.sdk.platformtools.x.L0(com.tencent.mm.sdk.platformtools.x.Y(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172194g), str4);
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                            dp.a.makeText(gestureGalleryUI2, gestureGalleryUI2.getString(com.tencent.mm.R.string.f492304g00, str4), 1).show();
                        }

                        @Override // zb0.a0
                        public void b(java.lang.String str3, java.lang.String str4) {
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                            dp.a.makeText(gestureGalleryUI2, gestureGalleryUI2.getString(com.tencent.mm.R.string.i87), 1).show();
                        }
                    });
                }
            });
            return;
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String str2 = gestureGalleryUI.f172194g;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.a(str2, gestureGalleryUI, null);
    }

    public static void Z6(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI) {
        gestureGalleryUI.g7(3, null);
        if (gestureGalleryUI.u7(gestureGalleryUI.f172209o2)) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            java.lang.String str = ((com.tencent.mm.media.model.AppBrandMediaSource) ((java.util.ArrayList) gestureGalleryUI.f172201k2).get(gestureGalleryUI.f172209o2)).f68934f;
            if (!com.tencent.mm.vfs.w6.j(str)) {
                str = gestureGalleryUI.f172196h.c(str, gestureGalleryUI.f172205m2, gestureGalleryUI.f172209o2, gestureGalleryUI.f172210p);
            }
            com.tencent.mm.pluginsdk.model.a2.h(doFavoriteEvent, 1, gestureGalleryUI.f172194g, str, 0, "", "", true);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6323i = gestureGalleryUI;
            c4Var.f6327m = 32;
            doFavoriteEvent.e();
            return;
        }
        r01.h0 h0Var = gestureGalleryUI.f172185a2;
        if (h0Var != null && h0Var.f368094b && !com.tencent.mm.sdk.platformtools.y1.c(gestureGalleryUI.f172194g)) {
            gestureGalleryUI.l7(new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.WatermarkCallback() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.22
                @Override // com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.WatermarkCallback
                public void a(java.lang.String str2) {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    com.tencent.mm.sdk.platformtools.x.L0(com.tencent.mm.sdk.platformtools.x.Y(gestureGalleryUI2.f172194g), str2);
                    com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2 = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                    com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent2, 1, str2);
                    am.c4 c4Var2 = doFavoriteEvent2.f54090g;
                    c4Var2.f6323i = gestureGalleryUI2;
                    c4Var2.f6327m = 32;
                    doFavoriteEvent2.e();
                }
            });
            return;
        }
        java.lang.String str2 = gestureGalleryUI.f172194g;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2 = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent2, 1, str2);
        am.c4 c4Var2 = doFavoriteEvent2.f54090g;
        c4Var2.f6323i = gestureGalleryUI;
        c4Var2.f6327m = 32;
        doFavoriteEvent2.e();
    }

    public static void a7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI) {
        final android.os.Bundle bundleExtra = gestureGalleryUI.getIntent().getBundleExtra("_stat_obj");
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "request deal QBAR string");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = gestureGalleryUI.f172226w;
        if (k0Var != null && k0Var.i()) {
            gestureGalleryUI.f172226w.u();
        }
        if (gestureGalleryUI.f172232y.size() > 0) {
            com.tencent.mm.plugin.scanner.c0.b(gestureGalleryUI, gestureGalleryUI.f172188d.c(), gestureGalleryUI.f172232y, 0, new com.tencent.mm.plugin.scanner.b0() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.27
                @Override // com.tencent.mm.plugin.scanner.b0
                public void a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = gestureGalleryUI2.G1;
                    if (multiCodeMaskView != null) {
                        multiCodeMaskView.c(gestureGalleryUI2.n7(), arrayList3, arrayList, arrayList2, gestureGalleryUI2.f172190e.getMeasuredHeight());
                        gestureGalleryUI2.G1.setMMultiCodeMaskViewListener(new com.tencent.mm.plugin.scanner.f0() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.27.1
                            @Override // com.tencent.mm.plugin.scanner.f0
                            public void a(java.util.ArrayList arrayList4, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, boolean z17) {
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass27 anonymousClass27 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass27.this;
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI3 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                                gestureGalleryUI3.f172236z = null;
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.b7(gestureGalleryUI3, imageQBarDataBean, bundleExtra);
                                com.tencent.mm.plugin.scanner.d0.f158718a.b(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.H1.longValue(), z17 ? 1 : 2, arrayList4, imageQBarDataBean, com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.I1.longValue(), 1, com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.n7());
                            }

                            @Override // com.tencent.mm.plugin.scanner.f0
                            public void b(java.util.ArrayList arrayList4) {
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass27 anonymousClass27 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass27.this;
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI3 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                                gestureGalleryUI3.f172236z = null;
                                com.tencent.mm.plugin.scanner.d0.f158718a.b(gestureGalleryUI3.H1.longValue(), 3, arrayList4, null, com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.I1.longValue(), 1, com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.n7());
                            }
                        });
                        if (arrayList.size() > 1) {
                            com.tencent.mm.plugin.scanner.d0.f158718a.b(gestureGalleryUI2.H1.longValue(), 11, arrayList3, null, gestureGalleryUI2.I1.longValue(), 1, gestureGalleryUI2.n7());
                        }
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.c7(gestureGalleryUI2, arrayList.size());
                    }
                }

                @Override // com.tencent.mm.plugin.scanner.b0
                public void b(com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, java.util.ArrayList arrayList) {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    gestureGalleryUI2.f172236z = null;
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.b7(gestureGalleryUI2, imageQBarDataBean, bundleExtra);
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.c7(gestureGalleryUI2, 0);
                    com.tencent.mm.plugin.scanner.d0.f158718a.b(gestureGalleryUI2.H1.longValue(), 1, arrayList, imageQBarDataBean, gestureGalleryUI2.I1.longValue(), 1, gestureGalleryUI2.n7());
                }
            });
        }
    }

    public static void b7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        gestureGalleryUI.g7(4, imageQBarDataBean);
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = gestureGalleryUI;
        r3Var.f7780a = imageQBarDataBean.f158619d;
        r3Var.f7782c = imageQBarDataBean.f158620e;
        r3Var.f7783d = imageQBarDataBean.f158621f;
        r3Var.f7792m = imageQBarDataBean.f158627o;
        int i17 = gestureGalleryUI.B;
        if (44 == i17) {
            r3Var.f7788i = i17;
        } else {
            r3Var.f7788i = 40;
        }
        r3Var.f7791l = bundle;
        r3Var.f7798s = imageQBarDataBean.f158626n;
        r3Var.f7797r = imageQBarDataBean.f158625m;
        r3Var.f7796q = imageQBarDataBean.f158630r;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "addStatInfo4AppBrand, statObj is null");
            bundle2 = new android.os.Bundle();
            r3Var.f7791l = bundle2;
        } else {
            bundle2 = bundle;
        }
        if (gestureGalleryUI.E1 || gestureGalleryUI.f172214q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "addStatInfo4AppBrand, from app brand");
            bundle2.putInt("LaunchCodeScene_ScanScene", 5);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "addStatInfo4AppBrand, from h5");
            bundle2.putInt("LaunchCodeScene_ScanScene", 3);
        }
        if (gestureGalleryUI.f172214q || gestureGalleryUI.E1) {
            r45.vm4 vm4Var = new r45.vm4();
            android.os.Bundle bundle3 = r3Var.f7791l;
            if (bundle3 != null) {
                vm4Var.f388360d = bundle3.getString("stat_app_id");
            }
            vm4Var.f388361e = gestureGalleryUI.getIntent().getIntExtra("wxaScene", 0);
            ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ai(dealQBarStrEvent, 0, vm4Var);
        } else if (gestureGalleryUI.f172198i) {
            try {
                r45.nu3 nu3Var = new r45.nu3();
                nu3Var.f381685d = xw4.b.c(gestureGalleryUI.f172217r2);
                jd0.d2 d2Var = (jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class));
                d2Var.getClass();
                d2Var.wi(dealQBarStrEvent);
                r3Var.f7795p.f372281d.f371137i = nu3Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGalleryUI", e17, "addDealQBarStrExtraInfo exception", new java.lang.Object[0]);
            }
        }
        dealQBarStrEvent.e();
        gestureGalleryUI.B7(true, imageQBarDataBean.f158620e, imageQBarDataBean.f158619d, true, bundle);
    }

    public static void c7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23040, java.lang.Long.valueOf(gestureGalleryUI.H1.longValue()), java.lang.Integer.valueOf(gestureGalleryUI.f172232y.size()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf((gestureGalleryUI.E1 || gestureGalleryUI.f172214q) ? 6 : 4), "");
    }

    public static kd0.f2 d7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI, java.lang.String str) {
        android.os.Bundle bundleExtra = gestureGalleryUI.getIntent().getBundleExtra("_stat_obj");
        if (bundleExtra != null) {
            java.lang.String string = bundleExtra.getString("stat_app_id");
            if (string != null) {
                kd0.f2 f2Var = new kd0.f2(str);
                f2Var.f306635b = 5;
                f2Var.f306636c = string;
                return f2Var;
            }
            java.lang.String string2 = bundleExtra.getString("stat_url");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                kd0.f2 f2Var2 = new kd0.f2(str);
                f2Var2.f306635b = 4;
                f2Var2.f306636c = string2;
                return f2Var2;
            }
        }
        return new kd0.f2(str);
    }

    public static void e7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI) {
        java.util.List list;
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "resumeVideo currentVideoPos:%d", java.lang.Long.valueOf(gestureGalleryUI.B1));
        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder viewHolder = gestureGalleryUI.f172233y0;
        if (viewHolder != null && !viewHolder.f172355e.isPlaying() && gestureGalleryUI.C1 == com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Paused) {
            long j17 = gestureGalleryUI.B1;
            if (j17 >= 0) {
                gestureGalleryUI.f172233y0.f172355e.seekTo((int) j17);
                gestureGalleryUI.f172237z1.a(((int) gestureGalleryUI.B1) / 1000);
            }
            gestureGalleryUI.f172233y0.f172355e.start();
            gestureGalleryUI.f172233y0.f172356f.setVisibility(8);
            if (gestureGalleryUI.f172233y0.f172353c.getVisibility() == 0) {
                gestureGalleryUI.f172233y0.f172353c.setVisibility(8);
            }
            gestureGalleryUI.C1 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Resume;
            gestureGalleryUI.f172237z1.setIsPlay(true);
            gestureGalleryUI.J7();
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayProgressTask playProgressTask = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayProgressTask(null);
            gestureGalleryUI.E2 = playProgressTask;
            playProgressTask.f172363d = false;
            s75.d.b(playProgressTask, "gesture_gallery_ui_video_update_progress");
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "start");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "call playVideo");
        if (gestureGalleryUI.f172233y0 == null || gestureGalleryUI.f172209o2 < 0 || (list = gestureGalleryUI.f172201k2) == null || ((java.util.ArrayList) list).size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "playVideo fail");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "playVideo");
        gestureGalleryUI.J7();
        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayProgressTask playProgressTask2 = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayProgressTask(null);
        gestureGalleryUI.E2 = playProgressTask2;
        playProgressTask2.f172363d = false;
        s75.d.b(playProgressTask2, "gesture_gallery_ui_video_update_progress");
        gestureGalleryUI.f172237z1.setIsPlay(true);
        java.lang.String o76 = gestureGalleryUI.o7();
        gestureGalleryUI.f172233y0.f172356f.setVisibility(8);
        gestureGalleryUI.f172233y0.f172351a.setVisibility(0);
        android.view.View view = gestureGalleryUI.f172233y0.f172357g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "playVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "playVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        gestureGalleryUI.f172233y0.f172355e.setVisibility(0);
        gestureGalleryUI.f172233y0.f172355e.setVideoURI(android.net.Uri.parse(o76));
        gestureGalleryUI.f172233y0.f172355e.start();
        gestureGalleryUI.C1 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Start;
    }

    public void A7(boolean z17, int i17) {
        com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct finderCommentResourceLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct();
        finderCommentResourceLoadingStruct.q(pm0.v.u(this.Q1));
        finderCommentResourceLoadingStruct.p(pm0.v.u(this.P1));
        finderCommentResourceLoadingStruct.f56687g = z17 ? 0L : 1L;
        finderCommentResourceLoadingStruct.f56686f = 2L;
        finderCommentResourceLoadingStruct.f56689i = finderCommentResourceLoadingStruct.b("Url", this.U1, true);
        finderCommentResourceLoadingStruct.f56692l = finderCommentResourceLoadingStruct.b("Token", this.V1, true);
        finderCommentResourceLoadingStruct.f56690j = 0L;
        finderCommentResourceLoadingStruct.f56688h = i17;
        finderCommentResourceLoadingStruct.k();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2091L, z17 ? 2L : 3L, 1L, false);
    }

    public final void B7(boolean z17, int i17, java.lang.String str, boolean z18, android.os.Bundle bundle) {
        java.lang.String str2;
        java.lang.String str3;
        if (this.f172214q || this.E1) {
            java.lang.String stringExtra = getIntent().getStringExtra("wxaSessionId");
            int intExtra = getIntent().getIntExtra("wxaScene", 0);
            if (bundle != null) {
                java.lang.String string = bundle.getString("wxappPathWithQuery");
                str2 = bundle.getString("stat_app_id");
                str3 = string;
            } else {
                str2 = "";
                str3 = str2;
            }
            com.tencent.mm.plugin.scanner.a.f158657a.b(stringExtra, intExtra, str2, this.E1, str3, i17, str, z17, z18, this.f172217r2);
        }
    }

    public void C7() {
        if (this.F1) {
            return;
        }
        if ((this.f172190e.getSelectedItemPosition() != this.f172213p2 && !(this instanceof com.tencent.mm.plugin.subapp.ui.gallery.ecs.EcsGestureGalleryUI)) || !this.H || this.I) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        if (this.f172235y2 || this.f172188d == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "isRunningExitAnimation");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "runExitAnimation");
        int width = this.f172190e.getWidth();
        int height = this.f172190e.getHeight();
        int selectedItemPosition = this.f172190e.getSelectedItemPosition();
        java.lang.String str = (java.lang.String) this.f172199i2.get(selectedItemPosition);
        if (!com.tencent.mm.vfs.w6.j(str)) {
            str = this.f172196h.c(str, this.f172205m2, selectedItemPosition, this.f172210p);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
            height = (int) ((width / n07.outWidth) * n07.outHeight);
            if (height > this.f172190e.getHeight()) {
                if (height < this.f172190e.getHeight() * 2.5d) {
                    this.R = (this.f172190e.getHeight() * this.R) / height;
                }
                height = this.f172190e.getHeight();
            }
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.L;
        s4Var.f210699f = width;
        s4Var.f210700g = height;
        s4Var.e(this.P, this.N, this.Q, this.R);
        float f17 = this.f172225v2;
        if (f17 != 1.0d) {
            this.L.f210707n = 1.0f / f17;
            if (this.f172227w2 != 0 || this.f172231x2 != 0) {
                int width2 = ((int) ((this.f172190e.getWidth() / 2) * (1.0f - this.f172225v2))) + this.f172227w2;
                int height2 = (int) (((this.f172190e.getHeight() / 2) + this.f172231x2) - ((height / 2) * this.f172225v2));
                com.tencent.mm.ui.tools.s4 s4Var2 = this.L;
                s4Var2.f210708o = width2;
                s4Var2.f210709p = height2;
            }
        }
        this.L.d(this.f172190e, this.S, false, new com.tencent.mm.ui.tools.n4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.10
            @Override // com.tencent.mm.ui.tools.n4
            public void a() {
            }

            @Override // com.tencent.mm.ui.tools.n4
            public void onAnimationEnd() {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                gestureGalleryUI.T.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.10.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass10 anonymousClass10 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass10.this;
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.finish();
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.overridePendingTransition(0, 0);
                    }
                });
                gestureGalleryUI.f172235y2 = false;
            }

            @Override // com.tencent.mm.ui.tools.n4
            public void onAnimationStart() {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                gestureGalleryUI.f172235y2 = true;
                gestureGalleryUI.T.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        android.view.View c17 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.f172188d.c();
                        if (c17 instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
                            ((com.tencent.mm.ui.base.MultiTouchImageView) c17).i();
                        }
                    }
                }, 20L);
            }
        }, null);
    }

    public final void D7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder viewHolder, int i17, java.lang.String str) {
        if (viewHolder != null) {
            if (str.equals(((com.tencent.mm.media.model.AppBrandMediaSource) ((java.util.ArrayList) this.f172201k2).get(this.f172209o2)).f68932d)) {
                viewHolder.f172359i.setProgress(i17);
                viewHolder.f172359i.invalidate();
            }
        }
    }

    public final void E7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene downloadVideoScene, java.lang.String str) {
        if (downloadVideoScene != com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene.SHARE_TO_FRIEND) {
            if (downloadVideoScene == com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene.SAVE_LOCAL) {
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(this, o7(), new zb0.a0() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.25
                    @Override // zb0.a0
                    public void a(java.lang.String str2, java.lang.String str3) {
                        java.lang.Object[] objArr = {q75.c.c(str3)};
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        dp.a.makeText(gestureGalleryUI, gestureGalleryUI.getString(com.tencent.mm.R.string.k7b, objArr), 1).show();
                        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                        q75.c.f(str3, gestureGalleryUI);
                    }

                    @Override // zb0.a0
                    public void b(java.lang.String str2, java.lang.String str3) {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        dp.a.makeText(gestureGalleryUI, gestureGalleryUI.getString(com.tencent.mm.R.string.k7a), 1).show();
                    }
                });
                return;
            }
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        long C = r6Var.m() ? r6Var.C() : -1L;
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "send video to file size :%d, MaxSendVideoSize:%d", java.lang.Long.valueOf(C), java.lang.Long.valueOf(ip.c.l()));
        if (C <= 0) {
            db5.e1.y(getContext(), getString(com.tencent.mm.R.string.fje), "", getString(com.tencent.mm.R.string.f492294fz1), null);
            return;
        }
        if (C > ip.c.l()) {
            db5.e1.y(getContext(), getString(com.tencent.mm.R.string.fjz), "", getString(com.tencent.mm.R.string.f492294fz1), null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "select contact in SelectConversationUI");
        java.lang.String o76 = o7();
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.c cVar = new jd5.c();
        cVar.r(o76 != null ? o76 : "");
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        n13.r a17 = n13.r.a(1);
        a17.f334120d.f334139a = 9;
        ((dk5.b0) b0Var).Bi(context, cVar, a17);
    }

    public final void F7(final java.lang.String str) {
        if (str == null || str.length() == 0 || r35.j1.m(this.mController, str, null, true, "", new com.tencent.mm.ui.widget.dialog.j() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.29
            @Override // com.tencent.mm.ui.widget.dialog.j
            public void a(boolean z17, java.lang.String str2, int i17) {
                if (z17) {
                    if (p94.w0.g() != null) {
                        ((com.tencent.mm.plugin.sns.model.o7) p94.w0.g()).getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareImg", "com.tencent.mm.plugin.sns.model.UploadManager");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(com.tencent.mm.plugin.sns.model.l4.Ni());
                        java.lang.String str3 = str;
                        sb6.append(kk.k.g(str3.getBytes()));
                        java.lang.String sb7 = sb6.toString();
                        com.tencent.mm.vfs.w6.c(str3, sb7);
                        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(1, null);
                        y7Var.t(str2);
                        y7Var.N(6);
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.add(new ca4.w0(sb7, 2));
                        y7Var.V(linkedList);
                        y7Var.i();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareImg", "com.tencent.mm.plugin.sns.model.UploadManager");
                        ((com.tencent.mm.plugin.sns.model.o7) p94.w0.g()).d();
                    }
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    db5.e1.T(gestureGalleryUI, gestureGalleryUI.getResources().getString(com.tencent.mm.R.string.f490560yi));
                }
            }
        }) != null) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "doTimeline fail, cannot show dialog");
    }

    public final boolean G7() {
        return this.f172228x && !com.tencent.mm.sdk.platformtools.t8.L0(this.f172232y);
    }

    public final boolean H7(java.lang.String str, int i17, com.tencent.mm.media.model.AppBrandMediaSource appBrandMediaSource) {
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        if (!j17) {
            j17 = com.tencent.mm.vfs.w6.j(c01.r7.b(str, i17));
        }
        boolean z17 = (j17 || appBrandMediaSource == null || com.tencent.mm.sdk.platformtools.t8.K0(appBrandMediaSource.f68935g)) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "url:%s, showImageThumb:%b", str, java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public final void I7() {
        if (this.f172226w == null) {
            this.f172226w = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getContext(), this.L1, false);
        }
        int i17 = this.L1;
        if (i17 == 1) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f172226w;
            k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.12
                @Override // db5.o4
                public void onCreateMMMenu(db5.g4 g4Var) {
                    final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    gestureGalleryUI.f172226w.o(null);
                    g4Var.clear();
                    if (!gestureGalleryUI.f172229x0) {
                        g4Var.a(1, com.tencent.mm.R.string.hr_);
                        if (gestureGalleryUI.u7(gestureGalleryUI.f172209o2)) {
                            g4Var.a(2, com.tencent.mm.R.string.i8d);
                        } else {
                            g4Var.a(2, com.tencent.mm.R.string.i89);
                        }
                        g4Var.a(3, com.tencent.mm.R.string.hjg);
                    }
                    if ((gestureGalleryUI.X || gestureGalleryUI.t7()) && !com.tencent.mm.sdk.platformtools.t8.K0(gestureGalleryUI.f172194g)) {
                        g4Var.a(4, com.tencent.mm.R.string.b2e);
                        gestureGalleryUI.Y.c();
                    }
                    if (gestureGalleryUI.s7()) {
                        g4Var.g(12, gestureGalleryUI.getString(com.tencent.mm.R.string.b2c), com.tencent.mm.R.raw.icons_outlined_ocr);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.V6(gestureGalleryUI, 2);
                    }
                    if (!gestureGalleryUI.f172214q && !((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
                        if (((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(gestureGalleryUI.f172221t2 ? 8 : 7, 2)) {
                            g4Var.add(0, 13, 0, ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(gestureGalleryUI.f172221t2 ? 8 : 7, 2));
                            gestureGalleryUI.f7(2);
                        } else {
                            g4Var.add(0, 6, 0, gestureGalleryUI.getString(com.tencent.mm.R.string.f491241cg4));
                        }
                        gestureGalleryUI.j7(15);
                    }
                    if (gestureGalleryUI.G7()) {
                        android.view.View c17 = ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) gestureGalleryUI.W).c(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.28
                            @Override // android.view.View.OnClickListener
                            public void onClick(android.view.View view) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(view);
                                java.lang.Object[] array = arrayList.toArray();
                                arrayList.clear();
                                yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.a7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this);
                                yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        }, gestureGalleryUI.f172232y, gestureGalleryUI.q7(), 8);
                        gestureGalleryUI.f172226w.o(c17);
                        if (c17 instanceof com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) {
                            if (g4Var.size() > 1) {
                                ((com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) c17).setTopPaddingVisibility(0);
                            } else {
                                ((com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) c17).setTopPaddingVisibility(8);
                            }
                        }
                    }
                }
            };
            k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.13
                @Override // db5.t4
                public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    int itemId = menuItem.getItemId();
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (itemId == 12) {
                        com.tencent.mm.plugin.subapp.ui.gallery.j jVar = gestureGalleryUI.Y;
                        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = gestureGalleryUI.f172190e;
                        jVar.b(mMGestureGallery, mMGestureGallery.getSelectedView(), gestureGalleryUI.f172194g);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.V6(gestureGalleryUI, 1);
                        return;
                    }
                    if (itemId == 13) {
                        int i19 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                        gestureGalleryUI.g7(7, null);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.T6(gestureGalleryUI, 2);
                        return;
                    }
                    switch (itemId) {
                        case 1:
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.W6(gestureGalleryUI);
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.X6(gestureGalleryUI, 1);
                            return;
                        case 2:
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.Y6(gestureGalleryUI);
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.X6(gestureGalleryUI, 2);
                            return;
                        case 3:
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.X6(gestureGalleryUI, 3);
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.Z6(gestureGalleryUI);
                            return;
                        case 4:
                            if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(gestureGalleryUI.getContext(), null)) {
                                int i27 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                                gestureGalleryUI.g7(6, null);
                                gestureGalleryUI.Y.d();
                                return;
                            }
                            return;
                        case 5:
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.a7(gestureGalleryUI);
                            return;
                        case 6:
                            int i28 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                            gestureGalleryUI.g7(7, null);
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.U6(gestureGalleryUI, 15);
                            return;
                        default:
                            return;
                    }
                }
            };
        } else if (i17 == 0) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f172226w;
            k0Var2.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.14
                @Override // db5.o4
                public void onCreateMMMenu(db5.g4 g4Var) {
                    g4Var.clear();
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (!gestureGalleryUI.f172229x0) {
                        g4Var.h(1, gestureGalleryUI.getString(com.tencent.mm.R.string.jdx), com.tencent.mm.R.raw.icons_filled_share, gestureGalleryUI.getResources().getColor(com.tencent.mm.R.color.f478502m));
                        j45.l.g("favorite");
                        g4Var.h(3, gestureGalleryUI.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
                    }
                    if (gestureGalleryUI.f172214q || ((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
                        return;
                    }
                    g4Var.h(6, gestureGalleryUI.getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo, gestureGalleryUI.getResources().getColor(com.tencent.mm.R.color.f478532ac));
                    gestureGalleryUI.j7(15);
                }
            };
            k0Var2.f211874o = new db5.o4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.15
                @Override // db5.o4
                public void onCreateMMMenu(db5.g4 g4Var) {
                    g4Var.clear();
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (!gestureGalleryUI.f172229x0) {
                        g4Var.g(2, gestureGalleryUI.u7(gestureGalleryUI.f172209o2) ? gestureGalleryUI.getString(com.tencent.mm.R.string.i8d) : gestureGalleryUI.getString(com.tencent.mm.R.string.i89), com.tencent.mm.R.raw.icons_outlined_download);
                    }
                    if ((gestureGalleryUI.X || gestureGalleryUI.t7()) && !com.tencent.mm.sdk.platformtools.t8.K0(gestureGalleryUI.f172194g)) {
                        g4Var.g(4, gestureGalleryUI.getString(com.tencent.mm.R.string.b2f), com.tencent.mm.R.raw.icons_outlined_translate);
                        gestureGalleryUI.Y.c();
                    }
                    if (gestureGalleryUI.s7()) {
                        g4Var.g(12, gestureGalleryUI.getString(com.tencent.mm.R.string.b2c), com.tencent.mm.R.raw.icons_outlined_ocr);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.V6(gestureGalleryUI, 2);
                    }
                }
            };
            k0Var2.f211879q = new db5.o4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.16
                @Override // db5.o4
                public void onCreateMMMenu(db5.g4 g4Var) {
                    g4Var.clear();
                    int i18 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (gestureGalleryUI.G7()) {
                        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) gestureGalleryUI.W).e(gestureGalleryUI.f172232y, gestureGalleryUI.q7(), gestureGalleryUI.f172226w, g4Var, 5);
                    }
                }
            };
            k0Var2.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.17
                @Override // db5.t4
                public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    int itemId = menuItem.getItemId();
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (itemId == 1) {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.W6(gestureGalleryUI);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.X6(gestureGalleryUI, 1);
                        return;
                    }
                    if (itemId == 3) {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.X6(gestureGalleryUI, 3);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.Z6(gestureGalleryUI);
                    } else {
                        if (itemId != 6) {
                            return;
                        }
                        int i19 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                        gestureGalleryUI.g7(7, null);
                        if (gestureGalleryUI.f172195g2) {
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.T6(gestureGalleryUI, 8);
                        } else {
                            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.U6(gestureGalleryUI, 15);
                        }
                    }
                }
            };
            k0Var2.f211884v = new db5.t4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.18
                @Override // db5.t4
                public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    int itemId = menuItem.getItemId();
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (itemId == 2) {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.Y6(gestureGalleryUI);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.X6(gestureGalleryUI, 2);
                        return;
                    }
                    if (itemId == 4) {
                        if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(gestureGalleryUI.getContext(), null)) {
                            int i19 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                            gestureGalleryUI.g7(6, null);
                            gestureGalleryUI.Y.d();
                            return;
                        }
                        return;
                    }
                    if (itemId != 12) {
                        return;
                    }
                    com.tencent.mm.plugin.subapp.ui.gallery.j jVar = gestureGalleryUI.Y;
                    com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = gestureGalleryUI.f172190e;
                    jVar.b(mMGestureGallery, mMGestureGallery.getSelectedView(), gestureGalleryUI.f172194g);
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.V6(gestureGalleryUI, 1);
                }
            };
            k0Var2.f211889y = new db5.t4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.19
                @Override // db5.t4
                public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.a7(com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this);
                }
            };
        }
        final java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("comment_id", pm0.v.u(this.P1));
        hashMap.put("feed_id", pm0.v.u(this.Q1));
        final java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
        hashMap2.put("page_name", "image_detail_long_press_half_screen");
        this.f172226w.p(new com.tencent.mm.ui.widget.dialog.c1() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.20
            @Override // com.tencent.mm.ui.widget.dialog.c1
            public void onDismiss() {
                int i18 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                gestureGalleryUI.g7(5, null);
                gestureGalleryUI.f172236z = null;
                gestureGalleryUI.f172232y.clear();
                gestureGalleryUI.f172226w = null;
                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) gestureGalleryUI.W).n();
                if (gestureGalleryUI.O1 == 1) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_out", null, hashMap2, 1, false);
                }
            }
        });
        if (this.O1 == 1) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f172226w;
            k0Var3.f211876p = new db5.o4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$i
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (gestureGalleryUI.u7(gestureGalleryUI.f172209o2)) {
                        return;
                    }
                    ((com.tencent.mm.pluginsdk.forward.m) gestureGalleryUI.Z1).wi(gestureGalleryUI.getContext(), g4Var, gestureGalleryUI.f172226w);
                }
            };
            k0Var3.f211885w = new db5.t4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$j
                @Override // db5.t4
                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    ((com.tencent.mm.pluginsdk.forward.m) gestureGalleryUI.Z1).aj((db5.h4) menuItem, new yz5.l() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$d
                        @Override // yz5.l
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            final java.lang.String str = (java.lang.String) obj;
                            int i19 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                            final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                            gestureGalleryUI2.getClass();
                            com.tencent.mm.ui.widget.dialog.j jVar = new com.tencent.mm.ui.widget.dialog.j() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.21
                                @Override // com.tencent.mm.ui.widget.dialog.j
                                public void a(boolean z17, java.lang.String str2, int i27) {
                                    if (z17) {
                                        g45.b.f268846a.a(str, str2, 0);
                                        tg3.a1 a17 = tg3.t1.a();
                                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI3 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                                        ((dk5.s5) a17).Vi(gestureGalleryUI3.getContext(), str, gestureGalleryUI3.f172194g, 0, "", "", null);
                                        com.tencent.mm.ui.widget.snackbar.j.c(gestureGalleryUI3.getContext().getString(com.tencent.mm.R.string.fw6), null, gestureGalleryUI3.getContext(), null, null);
                                    }
                                }
                            };
                            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                            jd5.a aVar = new jd5.a();
                            aVar.p(gestureGalleryUI2.f172194g);
                            n13.t tVar = new n13.t();
                            tVar.f334133a = jVar;
                            ((dk5.y) i95.n0.c(dk5.y.class)).wi(gestureGalleryUI2.getContext(), aVar, str, tVar);
                            return null;
                        }
                    });
                }
            };
            k0Var3.f211856e = new com.tencent.mm.ui.widget.dialog.d1() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$k
                @Override // com.tencent.mm.ui.widget.dialog.d1
                public final void onShow() {
                    java.util.HashMap hashMap3 = hashMap2;
                    int i18 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_in", null, hashMap3, 1, false);
                }
            };
            final java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put(4, "translate_button");
            hashMap3.put(12, "ocr_button");
            hashMap3.put(2, "save_image_to_local");
            hashMap3.put(6, "search_button");
            hashMap3.put(3, "finder_forward_menu_fav");
            hashMap3.put(1, "finder_forward_share_to_chat");
            this.f172226w.f211892z = new db5.r4() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$l
                @Override // db5.r4
                public final void a(android.view.View view, int i18, android.view.MenuItem menuItem) {
                    int i19 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    java.lang.String str = (java.lang.String) hashMap3.get(java.lang.Integer.valueOf(menuItem.getItemId()));
                    if (str == null && (menuItem instanceof db5.v5)) {
                        str = "quick_forward_avatar";
                    }
                    if (str != null) {
                        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                        aVar.pk(view, str);
                        aVar.Tj(view, 40, 1, false);
                        aVar.gk(view, hashMap);
                    }
                }
            };
        }
        if (!getContext().isFinishing()) {
            if (!this.f172229x0 || G7() || t7() || s7()) {
                this.f172226w.v();
            }
        }
        if (this.f172228x && com.tencent.mm.sdk.platformtools.t8.L0(this.f172232y) && c01.d9.e().n() != 0) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
            recogQBarOfImageFileEvent.f54659g.f6174a = java.lang.System.currentTimeMillis();
            am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
            aqVar.f6175b = this.f172194g;
            aqVar.f6177d = new java.util.HashSet(this.C);
            am.aq aqVar2 = recogQBarOfImageFileEvent.f54659g;
            aqVar2.f6178e = true;
            aqVar2.f6179f = 2;
            this.A = this.f172194g;
            recogQBarOfImageFileEvent.e();
            this.J1 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
    }

    public final void J7() {
        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayProgressTask playProgressTask = this.E2;
        if (playProgressTask != null) {
            playProgressTask.f172363d = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K7(int r5) {
        /*
            r4 = this;
            r4.p7()
            android.view.View r0 = r4.M
            r1 = 2131300705(0x7f091161, float:1.8219447E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L6a
            java.util.ArrayList r1 = r4.f172191e2
            if (r1 == 0) goto L6a
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1086324736(0x40c00000, float:6.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            android.content.res.Resources r2 = r4.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 * r3
            int r2 = (int) r2
            java.util.ArrayList r3 = r4.f172191e2
            int r3 = r3.size()
            if (r5 >= r3) goto L5a
            java.util.ArrayList r3 = r4.f172191e2
            java.lang.Object r5 = r3.get(r5)
            com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo r5 = (com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo) r5
            if (r5 == 0) goto L5a
            java.lang.String r5 = r5.f181447h
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r3 != 0) goto L5a
            r0.setText(r5)
            r5 = 0
            r0.setVisibility(r5)
            r4.p7()
            android.view.View r3 = r4.M
            r3.setPadding(r2, r1, r2, r1)
            goto L5b
        L5a:
            r5 = 1
        L5b:
            if (r5 == 0) goto L6a
            r5 = 8
            r0.setVisibility(r5)
            r4.p7()
            android.view.View r5 = r4.M
            r5.setPadding(r1, r1, r1, r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.K7(int):void");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.G1;
        if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
            C7();
            return true;
        }
        this.G1.d(this.H1.longValue(), false);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.K1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getActionMasked() == 0) {
            android.view.View selectedView = this.f172190e.getSelectedView();
            if (selectedView instanceof com.tencent.mm.ui.base.WxImageView) {
                ((com.tencent.mm.ui.base.WxImageView) selectedView).setInternalTouchEventConsumed(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f7(int i17) {
        boolean z17 = true;
        if (i17 == 1) {
            p7();
            android.view.View view = this.M;
            android.view.View view2 = (android.view.View) view.getParent();
            if (!view.getTag().equals(1) || view.getVisibility() != 0 || view2 == null || view2.getVisibility() != 0 || this.A2 == this.f172209o2) {
                z17 = false;
            }
        }
        if (z17) {
            int i18 = this.f172209o2;
            this.A2 = i18;
            java.util.ArrayList arrayList = this.f172191e2;
            com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo circleSearchInfo = (arrayList == null || i18 >= arrayList.size()) ? null : (com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo) this.f172191e2.get(this.f172209o2);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (circleSearchInfo != null) {
                hashMap.putAll(circleSearchInfo.b());
            }
            java.lang.String mpImageUrl = (java.lang.String) this.f172199i2.get(this.f172209o2);
            java.lang.String mpSourceUrl = this.f172217r2;
            kotlin.jvm.internal.o.g(mpImageUrl, "mpImageUrl");
            kotlin.jvm.internal.o.g(mpSourceUrl, "mpSourceUrl");
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("item_show_type", 0), new jz5.l("mp_image_url", mpImageUrl), new jz5.l("mp_source_url", mpSourceUrl))).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            hashMap.put("reportInfoFor33399", jSONObject);
            int i19 = this.f172221t2 ? 8 : 7;
            if (this.f172223u2) {
                hashMap.put("reportInfoFor33399", com.tencent.mm.sdk.platformtools.o4.L().getString("KPassReportInfoToSearch", ""));
                i19 = 16;
            }
            ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ui(i19, i17, tg0.e1.f419061d, hashMap);
            if (circleSearchInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(circleSearchInfo.f181452p)) {
                return;
            }
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).fj(34875, circleSearchInfo.a("", 2000));
        }
    }

    public final void g7(int i17, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean) {
        if (this.Z == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f172217r2)) {
            return;
        }
        hy4.h0 h0Var = this.Z;
        h0Var.f286108b = this.f172217r2;
        h0Var.f286110d = this.B;
        if (imageQBarDataBean != null) {
            h0Var.f286109c = true;
            h0Var.f286113g = imageQBarDataBean.f158620e == 22 ? "WX_CODE" : "QR_CODE";
            h0Var.f286112f = imageQBarDataBean.f158619d;
        }
        java.lang.String str = this.f172211p0;
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.y9.a(str);
        hy4.h0 h0Var2 = this.Z;
        h0Var2.f286114h = a17;
        h0Var2.a(i17);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return (this.f172214q || this.f172216r) ? getIntent().getIntExtra("KOrientation", -1) : super.getForceOrientation();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cc6;
    }

    public final void h7() {
        boolean z17;
        android.graphics.Point point;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f172194g)) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.F;
        if (concurrentHashMap.containsKey(this.f172194g)) {
            return;
        }
        gm0.j1.i();
        if (gm0.j1.n().f273288b.n() == 0 || !com.tencent.mm.plugin.scanner.k1.d()) {
            return;
        }
        try {
            java.lang.String str = this.f172215q2;
            if (str != null && str.length() != 0) {
                z17 = false;
                point = null;
                if (!z17 && com.tencent.mm.vfs.w6.j(str)) {
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    com.tencent.mm.graphics.e.d(str, options);
                    point = new android.graphics.Point(options.outWidth, options.outHeight);
                }
                if (point != null || !((jd0.u2) ((kd0.z2) i95.n0.c(kd0.z2.class))).wi(point.x, point.y)) {
                    this.Y.f(this.f172194g);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "photoTransLogic.scan :" + this.f172194g);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "doWordDetectImage image overRatioLimit: %s , imagePath:%s", point, this.f172194g);
                java.lang.String str2 = this.f172194g;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                concurrentHashMap.put(str2, bool);
                this.E.put(this.f172194g, bool);
                ((java.util.HashSet) this.G).add(this.f172194g);
                return;
            }
            z17 = true;
            point = null;
            if (!z17) {
                android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                com.tencent.mm.graphics.e.d(str, options2);
                point = new android.graphics.Point(options2.outWidth, options2.outHeight);
            }
            if (point != null) {
            }
            this.Y.f(this.f172194g);
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "photoTransLogic.scan :" + this.f172194g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGalleryUI", e17, "", new java.lang.Object[0]);
        }
    }

    public final void i7(java.lang.String str, int i17) {
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        aVar.p(str);
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334120d.f334139a = this.f172198i ? 3 : 9;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(getContext(), aVar, rVar);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int indexOf;
        java.lang.String stringExtra = getIntent().getStringExtra("nowUrl");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("nowUrlPath");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f172215q2 = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("nowWebUrl");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f172217r2 = stringExtra3;
        this.f172205m2 = getIntent().getIntExtra("type", 0);
        this.f172219s2 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(this.f172217r2);
        this.f172221t2 = getIntent().hasExtra("liteAppId");
        this.f172223u2 = getIntent().hasExtra("KIsFromAppBrandEcs");
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("mediaSource");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f172201k2;
            arrayList.clear();
            arrayList.addAll(parcelableArrayListExtra);
        }
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("urlList");
        java.lang.String[] stringArrayExtra2 = getIntent().getStringArrayExtra("cacheList");
        this.f172191e2 = getIntent().getParcelableArrayListExtra("searchInfos");
        if (stringArrayExtra == null || stringArrayExtra.length == 0) {
            java.lang.String stringExtra4 = getIntent().getStringExtra("htmlData");
            java.lang.String str = stringExtra4 != null ? stringExtra4 : "";
            int i17 = 0;
            while (i17 >= 0) {
                int indexOf2 = str.indexOf("weixin://viewimage/", i17);
                if (indexOf2 < 0 || (indexOf = str.indexOf("\"", indexOf2)) < 0) {
                    break;
                }
                this.f172199i2.add(str.substring(indexOf2 + 19, indexOf));
                i17 = indexOf;
            }
        } else {
            this.f172199i2 = java.util.Arrays.asList(stringArrayExtra);
        }
        if (stringArrayExtra2 != null && stringArrayExtra2.length != 0) {
            this.f172200j2 = java.util.Arrays.asList(stringArrayExtra2);
        }
        java.lang.String stringExtra5 = getIntent().getStringExtra("pageInfos");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
            try {
                this.f172220t = new org.json.JSONArray(stringExtra5);
            } catch (java.lang.Exception unused) {
            }
        }
        int i18 = 0;
        while (true) {
            if (i18 >= this.f172199i2.size()) {
                break;
            }
            if (stringExtra.equals(this.f172199i2.get(i18))) {
                this.f172209o2 = i18;
                break;
            }
            i18++;
        }
        this.f172213p2 = this.f172209o2;
        if (getIntent().getIntExtra("currentPos", -1) >= 0) {
            this.f172213p2 = getIntent().getIntExtra("currentPos", -1);
        }
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.5
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.C7();
                return true;
            }
        });
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.koa);
        this.U = textView;
        if (this.M1) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = (com.tencent.mm.ui.base.MMPageControlView) findViewById(com.tencent.mm.R.id.pwm);
        this.V = mMPageControlView;
        mMPageControlView.setIndicatorLayoutRes(com.tencent.mm.R.layout.f489534cv4);
        if (this.N1) {
            this.V.setVisibility(0);
        } else {
            this.V.setVisibility(4);
        }
        this.U.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$m
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
            
                if (r1 > 0) goto L16;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r4 = this;
                    int r0 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI r0 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this
                    boolean r1 = com.tencent.mm.ui.b4.c(r0)
                    if (r1 == 0) goto L28
                    android.view.Window r1 = r0.getWindow()
                    android.view.View r1 = r1.getDecorView()
                    java.util.WeakHashMap r2 = n3.l1.f334362a
                    n3.g3 r1 = n3.b1.a(r1)
                    if (r1 == 0) goto L2b
                    n3.d3 r1 = r1.f334338a
                    r2 = 1
                    e3.d r1 = r1.h(r2)
                    if (r1 == 0) goto L2b
                    int r1 = r1.f247045b
                    if (r1 <= 0) goto L2b
                    goto L39
                L28:
                    r0.getClass()
                L2b:
                    int r1 = com.tencent.mm.ui.bl.j(r0)
                    if (r1 <= 0) goto L32
                    goto L39
                L32:
                    r1 = 2131165761(0x7f070241, float:1.7945748E38)
                    int r1 = i65.a.f(r0, r1)
                L39:
                    androidx.appcompat.app.AppCompatActivity r2 = r0.getContext()
                    r3 = 2131165988(0x7f070324, float:1.7946209E38)
                    int r2 = i65.a.f(r2, r3)
                    android.widget.TextView r3 = r0.U
                    r3.getY()
                    android.widget.TextView r0 = r0.U
                    android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                    android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
                    int r1 = r1 + r2
                    r0.topMargin = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$m.run():void");
            }
        });
        this.S = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.f172234y1 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.p0u);
        this.f172237z1 = (com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar) findViewById(com.tencent.mm.R.id.ozz);
        ((com.tencent.mm.ui.tools.PressAlphaImageView) findViewById(com.tencent.mm.R.id.f487545oy5)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.36
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$36", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.C7();
                yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$36", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f172237z1.setPlayBtnOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.37
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$37", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                if (gestureGalleryUI.f172237z1.f191446z) {
                    gestureGalleryUI.z7();
                } else {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.e7(gestureGalleryUI);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$37", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f172237z1.setVideoTotalTime(0);
        this.f172237z1.a(0);
        this.f172237z1.setIplaySeekCallback(new m34.e() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.38
            @Override // m34.e
            public void a(int i19) {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder viewHolder = gestureGalleryUI.f172233y0;
                if (viewHolder != null) {
                    gestureGalleryUI.B1 = i19 * 1000;
                    viewHolder.f172355e.seekTo(i19 * 1000);
                }
            }

            @Override // m34.e
            public void b() {
            }

            @Override // m34.e
            public void d(int i19) {
            }
        });
        this.f172230x1 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.uhd);
        if (n7() == 5) {
            this.f172230x1.setVisibility(0);
        }
        this.f172188d = new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter(this);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById(com.tencent.mm.R.id.ghs);
        this.f172190e = mMGestureGallery;
        mMGestureGallery.setVisibility(0);
        this.f172190e.setVerticalFadingEdgeEnabled(false);
        this.f172190e.setHorizontalFadingEdgeEnabled(false);
        this.f172190e.setAdapter((android.widget.SpinnerAdapter) this.f172188d);
        this.f172190e.setSelection(this.f172209o2);
        this.f172190e.setOnItemSelectedListener(this.f172238z2);
        K7(this.f172209o2);
        this.f172190e.setSingleClickOverListener(new com.tencent.mm.ui.tools.s5() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.6
            @Override // com.tencent.mm.ui.tools.s5
            public void a() {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                if (!gestureGalleryUI.u7(gestureGalleryUI.f172209o2)) {
                    if (gestureGalleryUI.Y.f172386d != 1) {
                        gestureGalleryUI.C7();
                    }
                } else {
                    if (!gestureGalleryUI.f172202l1) {
                        gestureGalleryUI.f172234y1.setVisibility(0);
                    } else {
                        gestureGalleryUI.f172234y1.setVisibility(8);
                    }
                    gestureGalleryUI.f172202l1 = !gestureGalleryUI.f172202l1;
                }
            }
        });
        getIntent().getIntExtra("nevNext", 1);
        this.f172190e.setLongClickOverListener(new com.tencent.mm.ui.tools.p5() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.7
            @Override // com.tencent.mm.ui.tools.p5
            public void a() {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                if (gestureGalleryUI.Y.f172386d == 1 || gestureGalleryUI.F1) {
                    return;
                }
                gestureGalleryUI.r7();
            }
        });
        this.L = new com.tencent.mm.ui.tools.s4(this);
        if ((!this.f172218s || this.f172229x0 || ((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) ? false : true) {
            p7();
            this.M.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.8
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    boolean equals = view.getTag().equals(1);
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (equals) {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.T6(gestureGalleryUI, 1);
                    } else {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.U6(gestureGalleryUI, 16);
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            p7();
            android.view.View view = this.M;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p7();
            if (this.M.getTag().equals(1)) {
                f7(1);
            } else {
                j7(16);
            }
        } else {
            p7();
            android.view.View view2 = this.M;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.G1 = (com.tencent.mm.plugin.scanner.MultiCodeMaskView) findViewById(com.tencent.mm.R.id.jun);
    }

    public final void j7(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
        chatImageWebSearchActionStruct.t(o13.p.c(this.f172224v));
        chatImageWebSearchActionStruct.r("");
        chatImageWebSearchActionStruct.f55628f = i17;
        chatImageWebSearchActionStruct.f55627e = 1;
        chatImageWebSearchActionStruct.q("");
        chatImageWebSearchActionStruct.p("");
        int i18 = this.f172222u;
        if (i18 == 0) {
            i18 = 83;
        }
        chatImageWebSearchActionStruct.f55629g = i18;
        chatImageWebSearchActionStruct.f55632j = 0;
        chatImageWebSearchActionStruct.s(kk.k.e(this.f172194g));
        chatImageWebSearchActionStruct.f55635m = java.lang.System.currentTimeMillis();
        chatImageWebSearchActionStruct.k();
        su4.k3.m(chatImageWebSearchActionStruct);
    }

    @Override // g04.h
    public void k5(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        g04.l lVar = (g04.l) obj2;
        int b17 = com.tencent.mm.plugin.scanner.k1.b(lVar.f267469a);
        boolean f17 = com.tencent.mm.plugin.scanner.k1.f(b17);
        ry3.j jVar = (ry3.j) i95.n0.c(ry3.j.class);
        java.util.List list = lVar.f267469a;
        boolean Di = ((yz3.w) jVar).Di(lVar.f267470b, list);
        this.E.put(str, java.lang.Boolean.valueOf(f17));
        this.F.put(str, java.lang.Boolean.valueOf(Di));
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "local translate, img %s, result %s, ratio %d, showTransEntrance %b, showOCREntrance %b", str, list, java.lang.Integer.valueOf(b17), java.lang.Boolean.valueOf(f17), java.lang.Boolean.valueOf(Di));
    }

    public final void k7(final java.lang.String str, final java.lang.String str2, final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene downloadVideoScene) {
        java.util.Set set = this.f172186b2;
        if (set != null && set.contains(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "video is downloading, skip");
            return;
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "video exist, path = " + str);
            runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$n
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.E7(downloadVideoScene, str);
                }
            });
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2));
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "file isExist = " + r6Var.m() + ", originUrl = " + str + ", filePath = " + r6Var.o());
        if (r6Var.m() && r6Var.C() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "video is downloaded");
            runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$o
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.E7(downloadVideoScene, str2);
                }
            });
            return;
        }
        if (this.f172237z1.f191446z) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "video is playing, needs to be paused until the download is complete");
            runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.z7();
                }
            });
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "file not exist, begin to download");
        runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$c
            @Override // java.lang.Runnable
            public final void run() {
                final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                com.tencent.mm.sdk.platformtools.n3 n3Var = gestureGalleryUI.T;
                n3Var.removeCallbacks(gestureGalleryUI.f172193f2);
                final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene downloadVideoScene2 = downloadVideoScene;
                final java.lang.String str3 = str;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene downloadVideoScene3 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.DownloadVideoScene.SHARE_TO_FRIEND;
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI2 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        if (downloadVideoScene2 != downloadVideoScene3) {
                            int i17 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                            gestureGalleryUI2.getClass();
                        } else if (((java.util.concurrent.CopyOnWriteArraySet) gestureGalleryUI2.f172186b2).contains(str3)) {
                            db5.t7.makeText(gestureGalleryUI2.getContext(), com.tencent.mm.R.string.bkr, 0).show();
                        }
                    }
                };
                gestureGalleryUI.f172193f2 = runnable;
                n3Var.postDelayed(runnable, 500L);
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder m76 = gestureGalleryUI.m7();
                if (m76 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "set videoDownloadingPB");
                    m76.f172356f.setVisibility(8);
                    gestureGalleryUI.f172237z1.setVisibility(8);
                    m76.f172359i.setVisibility(0);
                    gestureGalleryUI.D7(m76, 0, str3);
                }
            }
        });
        if (this.f172186b2 == null) {
            this.f172186b2 = new java.util.concurrent.CopyOnWriteArraySet();
        }
        this.f172186b2.add(str);
        hw4.d.a(str, str2, new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass24(str, downloadVideoScene, str2));
    }

    public final void l7(final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.WatermarkCallback watermarkCallback) {
        final boolean[] zArr = {false};
        final com.tencent.mm.ui.widget.dialog.u3[] u3VarArr = {null};
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        int size = this.f172199i2.size();
        int i17 = this.f172192f;
        if (size > i17 && i17 >= 0) {
            valueOf = (java.lang.String) this.f172199i2.get(i17);
        }
        final java.lang.String str = valueOf;
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.47
            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str2;
                rv.w2 w2Var = (rv.w2) i95.n0.c(rv.w2.class);
                androidx.appcompat.app.AppCompatActivity context = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.getContext();
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                final java.lang.String path = gestureGalleryUI.f172194g;
                r01.h0 mpInfo = gestureGalleryUI.f172185a2;
                java.lang.String imageUrl = str;
                vw.g gVar = (vw.g) w2Var;
                gVar.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(path, "path");
                kotlin.jvm.internal.o.g(mpInfo, "mpInfo");
                kotlin.jvm.internal.o.g(imageUrl, "imageUrl");
                if (com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(path)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark path null");
                } else {
                    if ((gVar.f440643e.length() == 0) || !kotlin.jvm.internal.o.b(gVar.f440643e, mpInfo.f368093a)) {
                        java.util.Set v17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar.f440647i).getValue()).v("key_biz_water_mark_path_cache");
                        gVar.f440646h = v17;
                        if (v17 != null && v17.size() > 0) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeWaterMark clean set size ");
                            java.util.Set set = gVar.f440646h;
                            sb6.append(set != null ? java.lang.Integer.valueOf(set.size()) : null);
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizPicWaterMarkService", sb6.toString());
                            java.util.Set<java.lang.String> set2 = gVar.f440646h;
                            if (set2 != null) {
                                for (java.lang.String str3 : set2) {
                                    if (com.tencent.mm.vfs.w6.j(str3)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark clean set file success");
                                        com.tencent.mm.vfs.w6.h(str3);
                                    }
                                }
                            }
                            java.util.Set set3 = gVar.f440646h;
                            if (set3 != null) {
                                set3.clear();
                            }
                        }
                    }
                    boolean containsKey = gVar.f440644f.containsKey(gVar.wi(imageUrl));
                    java.util.HashMap hashMap = gVar.f440645g;
                    if (containsKey && (str2 = (java.lang.String) hashMap.get(gVar.wi(imageUrl))) != null && com.tencent.mm.vfs.w6.j(str2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark use cache path");
                        path = str2;
                    } else {
                        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                        try {
                            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(path, null);
                            android.graphics.Bitmap Bi = gVar.Bi(context, J2, mpInfo, imageUrl);
                            if (Bi != null) {
                                h0Var.f310123d = new java.io.ByteArrayInputStream(com.tencent.mm.sdk.platformtools.x.a(Bi));
                                J2.recycle();
                                java.lang.String r17 = com.tencent.mm.vfs.w6.r(path);
                                java.lang.String q17 = com.tencent.mm.vfs.w6.q(path);
                                java.lang.String n17 = com.tencent.mm.vfs.w6.n(path);
                                kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
                                java.lang.String str4 = r17 + q17 + java.lang.System.currentTimeMillis() + '.' + n17;
                                h0Var2.f310123d = str4;
                                if (com.tencent.mm.vfs.w6.j(str4) || com.tencent.mm.vfs.w6.e((java.lang.String) h0Var2.f310123d)) {
                                    com.tencent.mm.sdk.platformtools.x.o0((java.lang.String) h0Var2.f310123d, new vw.f(h0Var2, h0Var));
                                    if (!hashMap.containsKey(gVar.wi(imageUrl)) && hashMap.size() < 3) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPicWaterMarkService", "writeWaterMark add cache path");
                                        hashMap.put(gVar.wi(imageUrl), h0Var2.f310123d);
                                        java.util.Set set4 = gVar.f440646h;
                                        if (set4 != null) {
                                            set4.add(h0Var2.f310123d);
                                        }
                                        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar.f440647i).getValue()).F("key_biz_water_mark_path_cache", gVar.f440646h);
                                    }
                                    path = (java.lang.String) h0Var2.f310123d;
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.BizPicWaterMarkService", "createNewFile failed");
                                }
                            }
                        } catch (java.lang.OutOfMemoryError e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BizPicWaterMarkService", "decodeFile oom " + e17);
                        }
                    }
                }
                zArr[0] = true;
                com.tencent.mm.ui.widget.dialog.u3 u3Var = u3VarArr[0];
                if (u3Var != null && u3Var.isShowing()) {
                    u3Var.dismiss();
                }
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.47.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.WatermarkCallback watermarkCallback2 = watermarkCallback;
                        if (watermarkCallback2 != null) {
                            watermarkCallback2.a(path);
                        }
                    }
                });
            }
        });
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.48
            @Override // java.lang.Runnable
            public void run() {
                if (zArr[0]) {
                    return;
                }
                hy4.h hVar = hy4.h.f286106a;
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                java.lang.String string = gestureGalleryUI.getContext().getString(com.tencent.mm.R.string.f490604zq);
                androidx.appcompat.app.AppCompatActivity context = gestureGalleryUI.getContext();
                com.tencent.mm.ui.widget.dialog.u3[] u3VarArr2 = u3VarArr;
                u3VarArr2[0] = hVar.a(string, context, u3VarArr2[0]);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 1000L, false);
    }

    public final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder m7() {
        return (com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder) this.f172188d.c().getTag();
    }

    public final int n7() {
        try {
            if (!this.f172214q && !this.E1) {
                return ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(this.f172217r2) ? 5 : 3;
            }
            return 4;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGalleryUI", e17, "getCurrScene", new java.lang.Object[0]);
            return 0;
        }
    }

    public final java.lang.String o7() {
        java.util.List list;
        if (this.f172209o2 < 0 || (list = this.f172201k2) == null) {
            return "";
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() == 0) {
            return "";
        }
        java.lang.String str = ((com.tencent.mm.media.model.AppBrandMediaSource) arrayList.get(this.f172209o2)).f68932d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "playVideo url :%s", str);
        if (str == null || !str.startsWith("http")) {
            return str;
        }
        u7.i a17 = go4.a.a(this);
        if (a17.a(str).exists()) {
            java.io.File a18 = a17.a(str);
            try {
                v7.h hVar = (v7.h) a17.f425055f.f425035c;
                hVar.getClass();
                hVar.f433595a.submit(new v7.g(hVar, a18));
            } catch (java.io.IOException unused) {
                java.util.Objects.toString(a18);
            }
            return android.net.Uri.fromFile(a18).toString();
        }
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = "127.0.0.1";
        objArr[1] = java.lang.Integer.valueOf(a17.f425054e);
        try {
            objArr[2] = java.net.URLEncoder.encode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            return java.lang.String.format(locale, "http://%s:%d/%s", objArr);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException("Error encoding url", e17);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
        final com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.f490552yb), true, false, null);
        final java.lang.Runnable runnable = new java.lang.Runnable(this) { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.45
            @Override // java.lang.Runnable
            public void run() {
                Q.dismiss();
            }
        };
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")).iterator();
        while (it.hasNext()) {
            final java.lang.String str = (java.lang.String) it.next();
            final java.lang.String str2 = ((com.tencent.mm.media.model.AppBrandMediaSource) ((java.util.ArrayList) this.f172201k2).get(this.f172209o2)).f68934f;
            if (!com.tencent.mm.vfs.w6.j(str2)) {
                str2 = this.f172196h.c(str2, this.f172205m2, this.f172209o2, this.f172210p);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "onActivityResult,  sendVideo video:%s,  thumbFilename:%s", o7(), str2);
            gm0.j1.e().j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.46
                @Override // java.lang.Runnable
                public void run() {
                    android.graphics.Bitmap D;
                    java.lang.String str3 = str2;
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str3);
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    if (K0) {
                        int i19 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                        java.lang.String o76 = gestureGalleryUI.o7();
                        gestureGalleryUI.getClass();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(o76)) {
                            str3 = "";
                        } else {
                            java.lang.String o17 = new com.tencent.mm.vfs.r6(t21.w2.p(), "temp" + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG).o();
                            if (!com.tencent.mm.vfs.w6.j(o17) && (D = com.tencent.mm.sdk.platformtools.x.D(o76, 1, -1)) != null) {
                                try {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "create thumbpath bitmap, saveBitmapToImage ");
                                    com.tencent.mm.sdk.platformtools.x.D0(D, 60, android.graphics.Bitmap.CompressFormat.JPEG, o17, true);
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGalleryUI", e17, "", new java.lang.Object[0]);
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "createThumbFilePath thumbPath:%s, exist:%b", o17, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(o17)));
                            str3 = o17;
                        }
                    }
                    java.lang.String str4 = str3;
                    tg3.a1 a17 = tg3.t1.a();
                    androidx.appcompat.app.AppCompatActivity context = gestureGalleryUI.getContext();
                    java.lang.String str5 = str;
                    int i27 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                    ((dk5.s5) a17).nj(context, str5, gestureGalleryUI.o7(), str4, 1, (int) gestureGalleryUI.A1, false, false, "", "");
                    com.tencent.mm.sdk.platformtools.u3.h(runnable);
                }

                public java.lang.String toString() {
                    return super.toString() + "send video";
                }
            });
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
            }
        }
        com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.f_p), null, this, null, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.G1;
        if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
            super.onBackPressed();
        } else {
            this.G1.d(this.H1.longValue(), false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        this.f172184J = bundle;
        this.f172197h2.alive();
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        fullScreenNoTitleBar(true);
        this.K1 = new android.view.GestureDetector(new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
            public boolean onContextClick(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onDoubleTap = super.onDoubleTap(motionEvent);
                yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return onDoubleTap;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = gestureGalleryUI.f172190e;
                if (mMGestureGallery == null || !(mMGestureGallery.getSelectedView() instanceof com.tencent.mm.ui.base.WxImageView)) {
                    return false;
                }
                gestureGalleryUI.C7();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
        boolean z17 = false;
        this.f172214q = getIntent().getBooleanExtra("isFromAppBrand", false);
        this.f172216r = getIntent().getBooleanExtra("isFromAppBrandGame", false);
        this.E1 = getIntent().getBooleanExtra("isFromAppBrandWebView", false);
        this.f172229x0 = getIntent().getBooleanExtra("forBidForward", false);
        this.f172198i = getIntent().getBooleanExtra("isFromWebView", false);
        this.f172204m = getIntent().getIntExtra("webViewId", 0);
        this.f172218s = getIntent().getBooleanExtra("showmenu", true);
        getIntent().getBooleanExtra("isFromSimilarImg", false);
        getIntent().getBooleanExtra("isOfficialAccountImg", false);
        this.f172206n = getIntent().getBooleanExtra("isOuntLink", false);
        this.f172208o = getIntent().getStringExtra("IsFromWebViewReffer");
        this.f172228x = getIntent().getBooleanExtra("shouldShowScanQrCodeMenu", false);
        this.H = getIntent().getBooleanExtra("shouldRunDragAnimation", false);
        this.I = getIntent().getBooleanExtra("shouldForbidExitAnimation", false);
        this.B = getIntent().getIntExtra("scanQrCodeGetA8KeyScene", 40);
        int[] intArrayExtra = getIntent().getIntArrayExtra("scanCodeTypes");
        this.f172222u = getIntent().getIntExtra("KScene", 0);
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        this.f172224v = o13.n.g(67);
        this.L1 = getIntent().getIntExtra("BottomSheetStyle", 1);
        this.f172195g2 = getIntent().getBooleanExtra("isCustomImageSearch", false);
        this.M1 = getIntent().getBooleanExtra("ShowIndicator", true);
        this.N1 = getIntent().getBooleanExtra("ShowGalleryIndicator", false);
        this.O1 = getIntent().getIntExtra("FinderScene", 0);
        this.P1 = getIntent().getLongExtra("FinderCommentId", 0L);
        this.Q1 = getIntent().getLongExtra("FinderFeedId", 0L);
        this.R1 = getIntent().getIntExtra("key_ref_comment_scene", 0);
        this.S1 = getIntent().getStringExtra("key_click_tab_context_id");
        this.T1 = getIntent().getStringExtra("key_context_id");
        this.U1 = getIntent().getStringExtra("FinderRawUrl");
        this.V1 = getIntent().getStringExtra("FinderUrlToken");
        this.W1 = getIntent().getIntExtra("KEY_FINDER_OPEN_CONTEXT_HASH", 0);
        this.X1 = getIntent().getBooleanExtra("showGifAsPic", false);
        if (intArrayExtra != null && intArrayExtra.length > 0) {
            for (int i17 : intArrayExtra) {
                ((java.util.HashSet) this.C).add(java.lang.Integer.valueOf(i17));
            }
        }
        int[] intArrayExtra2 = getIntent().getIntArrayExtra("scanResultCodeTypes");
        if (intArrayExtra2 != null && intArrayExtra2.length > 0) {
            for (int i18 : intArrayExtra2) {
                ((java.util.HashSet) this.D).add(java.lang.Integer.valueOf(i18));
            }
        }
        this.Y = new com.tencent.mm.plugin.subapp.ui.gallery.j(this, this, this, this, this.f172206n);
        this.f172210p = getIntent().getStringExtra("cookie");
        c01.r7 r7Var = new c01.r7(this.f172198i, this.f172208o);
        this.f172196h = r7Var;
        hashCode();
        r7Var.f37419e = this;
        r7Var.f37420f = this;
        this.B2.alive();
        this.C2.alive();
        initView();
        this.f172235y2 = false;
        if (this.f172214q) {
            getWindow().setBackgroundDrawableResource(com.tencent.mm.R.drawable.bgn);
        }
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        kd0.n2 n2Var = new kd0.n2() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.2
            @Override // kd0.n2
            public void a() {
                com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                com.tencent.mm.ui.widget.dialog.k0 k0Var = gestureGalleryUI.f172226w;
                if (k0Var != null && k0Var.i()) {
                    gestureGalleryUI.I7();
                }
                gestureGalleryUI.f172236z = null;
            }
        };
        ((jd0.q2) x2Var).getClass();
        this.W = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(this, n2Var);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.h8o);
        this.f172212p1 = relativeLayout;
        if (this.f172220t != null) {
            this.D2 = findViewById(com.tencent.mm.R.id.neb);
            this.f172212p1.setVisibility(0);
            android.widget.RelativeLayout relativeLayout2 = this.f172230x1;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.ljo)).setTextSize(1, 12.0f);
            this.D2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.33
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    try {
                        org.json.JSONObject optJSONObject = gestureGalleryUI.f172220t.optJSONObject(gestureGalleryUI.f172192f);
                        if (optJSONObject.optInt("jumpType", 0) == 9) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("feedId", optJSONObject.optString("feedId", ""));
                            jSONObject.put("extInfo", optJSONObject.optJSONObject("extInfo"));
                            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, ""));
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            ya2.e1.f460472a.B(com.tencent.mm.sdk.platformtools.x2.f193071a, jSONObject.toString(), null);
                        } else if (optJSONObject.optInt("jumpType", 0) == 2) {
                            java.lang.String optString = optJSONObject.optString("userName");
                            java.lang.String optString2 = optJSONObject.optString("weappUrl");
                            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                            nxVar.f7466a = optString;
                            nxVar.f7467b = optString2;
                            startAppBrandUIFromOuterEvent.e();
                        } else if (optJSONObject.optInt("jumpType", 0) == 3) {
                            java.lang.String optString3 = optJSONObject.optString("jumpUrl");
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("rawUrl", optString3);
                            j45.l.j(gestureGalleryUI, "webview", ".ui.tools.WebViewUI", intent, null);
                        }
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.X6(gestureGalleryUI, 5);
                    } catch (java.lang.Exception unused) {
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.h_4);
            if (this.f172218s && !this.f172229x0) {
                findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.34
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        int i19 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.G2;
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this.I7();
                        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "initImageToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "initImageToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.d2y);
            if (this.f172218s && !this.f172229x0) {
                findViewById2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.35
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.X6(gestureGalleryUI, 4);
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.Y6(gestureGalleryUI);
                        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI$35", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "initImageToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "initImageToolBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            relativeLayout.setVisibility(8);
        }
        if (this.O1 == 1) {
            ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
            this.Z1 = new com.tencent.mm.pluginsdk.forward.m();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("comment_id", pm0.v.u(this.P1));
            hashMap.put("feed_id", pm0.v.u(this.Q1));
            hashMap.put("comment_scene", java.lang.Long.valueOf(this.R1));
            hashMap.put("finder_tab_context_id", this.S1);
            hashMap.put("finder_context_id", this.T1);
            cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.finder_image_comment_browse);
            aVar.dk(this, "finder_image_comment_browse");
            aVar.Rj(this, iy1.a.Finder);
            aVar.gk(this, hashMap);
            aVar.Tj(this, 12, 1, false);
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ght);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById3.animate().alpha(1.0f).setDuration(400L).start();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("key_enable_share_image_watermark", false);
        if (booleanExtra) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_brand_name");
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_alias");
            int intExtra = getIntent().getIntExtra("key_brand_service_type", 0);
            int intExtra2 = getIntent().getIntExtra("key_image_watermark_type", 0);
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_share_image_watermark_params");
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_brand_user_name");
            java.lang.String str2 = "";
            java.lang.String str3 = stringExtra4 == null ? "" : stringExtra4;
            java.lang.String url = this.f172217r2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(url)) {
                if (url != null && gm0.j1.s(zq1.a0.class) != null) {
                    z17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(url);
                }
                if (!z17) {
                    str = url;
                    this.f172185a2 = new r01.h0(str, booleanExtra, stringExtra, stringExtra2, intExtra, intExtra2, stringExtra3, str3, "", -1);
                } else {
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                    kotlin.jvm.internal.o.g(url, "url");
                    str2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.n(url);
                }
            }
            str = str2;
            this.f172185a2 = new r01.h0(str, booleanExtra, stringExtra, stringExtra2, intExtra, intExtra2, stringExtra3, str3, "", -1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "clearVideoDownloaderCache");
        java.util.Map map = this.f172189d2;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "leave gestureGalleryUI, delete cache: " + u7.v.a(str2) + ", task id = " + str + ", cache path = " + str2);
                this.f172189d2.remove(str);
            }
        }
        java.util.Set set = this.f172186b2;
        if (set != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) set).clear();
        }
        this.T.removeCallbacks(this.f172193f2);
        java.util.Set set2 = this.f172187c2;
        if (set2 != null && !set2.isEmpty()) {
            s75.d.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI$$h
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                    for (java.lang.String str3 : gestureGalleryUI.f172187c2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "leave gestureGalleryUI, cancel downloading task id = " + str3);
                        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(str3);
                        gestureGalleryUI.f172187c2.remove(str3);
                    }
                }
            }, "");
        }
        c01.r7 r7Var = this.f172196h;
        r7Var.getClass();
        hashCode();
        r7Var.f37419e = null;
        r7Var.f37420f = null;
        c01.r7 r7Var2 = this.f172196h;
        c01.n7 n7Var = r7Var2.f37415a;
        if (n7Var != null) {
            n7Var.f37343d = true;
        }
        r7Var2.f37415a = null;
        this.B2.dead();
        this.C2.dead();
        this.f172197h2.dead();
        com.tencent.mm.plugin.subapp.ui.gallery.j jVar = this.Y;
        if (jVar != null) {
            jVar.g();
            jVar.f172393k.removeAllUpdateListeners();
            jVar.f172395m.dead();
            jVar.a();
            gm0.j1.n().d(jVar.f172396n);
            jVar.f172383a = null;
            jVar.f172388f = null;
            jVar.f172387e = null;
            jVar.f172389g = null;
        }
        com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent releaseDealQBarStrEvent = new com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent();
        releaseDealQBarStrEvent.f54672g.f7446a = this;
        releaseDealQBarStrEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "stopVideo");
        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder viewHolder = this.f172233y0;
        if (viewHolder != null) {
            viewHolder.f172355e.stopPlayback();
            this.C1 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Stop;
            this.f172237z1.setIsPlay(false);
            this.f172237z1.setIplaySeekCallback(null);
            this.f172233y0.f172356f.setVisibility(0);
            this.f172233y0.f172353c.setVisibility(0);
            this.f172233y0.f172355e.setVisibility(8);
        }
        J7();
        if (this.W1 != 0) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).cl(zy2.z5.f477639d, false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        z7();
        getWindow().setFlags(2048, 2048);
        qp1.h0.b();
        o25.y1 y1Var = this.Z1;
        if (y1Var != null) {
            y1Var.getClass();
        }
        if (this.W1 == 0 || isFinishing()) {
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Qk(false, this.W1, isFinishing());
        this.Y1 = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().clearFlags(2048);
        qp1.h0.a(true, true, true);
        o25.y1 y1Var = this.Z1;
        if (y1Var != null) {
            y1Var.getClass();
        }
        if (this.W1 == 0 || !this.Y1) {
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Qk(true, this.W1, false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        android.os.Bundle bundle = this.f172184J;
        if (!this.K && this.H) {
            this.K = true;
            this.N = getIntent().getIntExtra("img_gallery_top", 0);
            this.P = getIntent().getIntExtra("img_gallery_left", 0);
            this.Q = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.R = intExtra;
            this.L.e(this.P, this.N, this.Q, intExtra);
            if (bundle == null) {
                this.f172190e.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.9
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        gestureGalleryUI.f172190e.getViewTreeObserver().removeOnPreDrawListener(this);
                        gestureGalleryUI.L.c(gestureGalleryUI.f172190e, null, null);
                        if (!gestureGalleryUI.H) {
                            return true;
                        }
                        gestureGalleryUI.f172190e.setGalleryScaleListener(new com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.AnonymousClass11());
                        return true;
                    }
                });
            }
        }
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f172236z != null) {
            com.tencent.mm.autogen.events.CancelDealQBarStrEvent cancelDealQBarStrEvent = new com.tencent.mm.autogen.events.CancelDealQBarStrEvent();
            am.p1 p1Var = cancelDealQBarStrEvent.f54025g;
            p1Var.f7594b = this;
            p1Var.f7593a = this.f172236z.f158619d;
            cancelDealQBarStrEvent.e();
            this.f172236z = null;
        }
        this.f172232y.clear();
    }

    public final com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI p7() {
        if (this.M == null) {
            if (((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(this.f172221t2 ? 8 : 7, 1)) {
                android.widget.RelativeLayout relativeLayout = this.f172230x1;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    this.M = findViewById(com.tencent.mm.R.id.tzp);
                } else {
                    this.M = findViewById(com.tencent.mm.R.id.u4o);
                }
                this.M.setTag(1);
            } else {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.gib);
                this.M = findViewById;
                findViewById.setTag(0);
            }
        }
        return this;
    }

    public final com.tencent.mm.plugin.scanner.ImageQBarDataBean q7() {
        java.lang.Object obj = com.tencent.mm.plugin.scanner.c0.a(this, this.f172188d.c(), this.f172232y, 0).f302833d;
        if (((java.util.ArrayList) obj).size() == 1) {
            return (com.tencent.mm.plugin.scanner.ImageQBarDataBean) ((java.util.ArrayList) obj).get(0);
        }
        return null;
    }

    public void r7() {
        int intExtra = getIntent().getIntExtra("nevNext", 1);
        if (this.Y.f172386d == 1) {
            return;
        }
        if (!this.f172218s) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "showmenu is false, don't show menu");
            return;
        }
        hy4.h0 h0Var = new hy4.h0();
        this.Z = h0Var;
        h0Var.f286111e = 2;
        h0Var.f286107a = java.lang.System.currentTimeMillis();
        if (1 != intExtra) {
            if (2 == intExtra) {
                db5.e1.h(this, null, getContext().getResources().getStringArray(com.tencent.mm.R.array.f478022a7), "", false, new db5.c1() { // from class: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.4
                    @Override // db5.c1
                    public void e(int i17) {
                        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.this;
                        if (i17 == 0) {
                            gestureGalleryUI.F7(gestureGalleryUI.f172194g);
                            return;
                        }
                        if (i17 != 1) {
                            return;
                        }
                        java.lang.String str = gestureGalleryUI.f172194g;
                        gestureGalleryUI.getClass();
                        if (str == null || str.length() == 0) {
                            return;
                        }
                        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                        jd5.a aVar = new jd5.a();
                        aVar.p(str);
                        n13.r rVar = new n13.r();
                        rVar.f334117a = true;
                        rVar.f334120d.f334139a = 9;
                        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(gestureGalleryUI.getContext(), aVar, rVar);
                    }
                });
                return;
            }
            return;
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        android.graphics.PointF c18 = e04.i3.c(this.f172188d.c(), this.f172190e.getXDown(), this.f172190e.getYDown());
        if (c18 != null) {
            c17.i("key_basescanui_touch_normalize_x", java.lang.Float.valueOf(c18.x));
            c17.i("key_basescanui_touch_normalize_y", java.lang.Float.valueOf(c18.y));
        }
        com.tencent.mm.plugin.subapp.ui.gallery.j jVar = this.Y;
        int i17 = jVar.f172386d;
        if (i17 != 0 && i17 != 2) {
            I7();
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
        galleryTranslateReportStruct.f58316d = jVar.f172386d == 2 ? 1L : 0L;
        galleryTranslateReportStruct.f58317e = 1L;
        galleryTranslateReportStruct.f58318f = jVar.f172394l ? 6L : 5L;
        galleryTranslateReportStruct.k();
        I7();
    }

    public final boolean s7() {
        boolean z17 = false;
        try {
            java.lang.String str = this.f172194g;
            if (str != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.F;
                if (concurrentHashMap.containsKey(str)) {
                    z17 = ((java.lang.Boolean) concurrentHashMap.get(str)).booleanValue();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.GestureGalleryUI", "", e17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "isCurrentImgCanShowOCREntrance:" + z17);
        return z17;
    }

    public final boolean t7() {
        boolean z17 = false;
        try {
            java.lang.String str = this.f172194g;
            if (str != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.E;
                if (concurrentHashMap.containsKey(str)) {
                    z17 = ((java.lang.Boolean) concurrentHashMap.get(str)).booleanValue();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.GestureGalleryUI", "", e17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "isCurrentImgCanShowTransEntrance:" + z17);
        return z17;
    }

    public final boolean u7(int i17) {
        java.util.List list = this.f172201k2;
        return list != null && ((java.util.ArrayList) list).size() > i17 && ((java.util.ArrayList) list).get(i17) != null && "video".endsWith(((com.tencent.mm.media.model.AppBrandMediaSource) ((java.util.ArrayList) list).get(i17)).f68933e);
    }

    public void v7(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.util.List list;
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "onDownFailed, url:%s, pos:%d", str, java.lang.Integer.valueOf(i17));
        if (this.O1 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "onDownFailed, curFilename:%s, url:%s", this.f172194g, str);
            A7(false, i18);
        }
        if (i17 != this.f172190e.getSelectedItemPosition() || (list = this.f172201k2) == null) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.isEmpty() || arrayList.size() <= i17) {
            return;
        }
        com.tencent.mm.media.model.AppBrandMediaSource appBrandMediaSource = (com.tencent.mm.media.model.AppBrandMediaSource) arrayList.get(i17);
        java.lang.String str3 = (java.lang.String) this.f172199i2.get(i17);
        if (appBrandMediaSource == null || u7(i17) || android.text.TextUtils.isEmpty(str) || !str.equalsIgnoreCase(appBrandMediaSource.f68935g) || !H7(str3, this.f172205m2, appBrandMediaSource)) {
            return;
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f172203l2;
        if (!arrayList2.contains(appBrandMediaSource.f68935g)) {
            arrayList2.add(appBrandMediaSource.f68935g);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "onDownFailed, load thumbUrl:%s fail, load imageUrl:%s", appBrandMediaSource.f68935g, str3);
        this.f172196h.c(str3, this.f172205m2, i17, this.f172210p);
    }

    public void w7(float f17) {
    }

    public void x7() {
        this.F1 = false;
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f172190e;
        if (mMGestureGallery != null) {
            mMGestureGallery.f210063o = false;
        }
        if (this.M1) {
            this.U.setVisibility(0);
        }
    }

    public void y7(int i17) {
    }

    public final void z7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "pauseVideo");
        com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.ImageAdapter.ViewHolder viewHolder = this.f172233y0;
        if (viewHolder != null) {
            viewHolder.f172355e.pause();
            long currentPosition = this.f172233y0.f172355e.getCurrentPosition();
            this.B1 = currentPosition;
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryUI", "pauseVideo currentVideoPos：%d", java.lang.Long.valueOf(currentPosition));
            this.f172233y0.f172356f.setVisibility(0);
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState playerState = this.C1;
            if (playerState == com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Start || playerState == com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Resume) {
                this.C1 = com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.PlayerState.Paused;
                this.D1 = true;
            }
            this.f172237z1.setIsPlay(false);
        }
        J7();
    }
}
