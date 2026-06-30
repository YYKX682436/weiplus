package e33;

/* loaded from: classes10.dex */
public class v2 extends db5.p8 {

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f247499g;

    /* renamed from: h, reason: collision with root package name */
    public final int f247500h;

    /* renamed from: n, reason: collision with root package name */
    public boolean f247503n;

    /* renamed from: s, reason: collision with root package name */
    public e33.s2 f247508s;

    /* renamed from: t, reason: collision with root package name */
    public e33.r2 f247509t;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f247501i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f247502m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f247504o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f247505p = -1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f247506q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f247507r = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f247510u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f247511v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f247512w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f247513x = "";

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Handler f247514y = new e33.p2(this, android.os.Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f247515z = new java.util.HashMap();
    public final e33.m3 A = new e33.m3(this);
    public final e33.l3 B = new e33.l3(this);

    public v2(android.content.Context context, int i17) {
        this.f247499g = context;
        this.f247500h = i17;
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.MultiTouchImageView c(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageAdapter", "position : %d getMultiTouchImageViewByPosition view is null.", java.lang.Integer.valueOf(i17));
            return null;
        }
        e33.u2 u2Var = (e33.u2) e17.getTag();
        if (u2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageAdapter", "position : %d getMultiTouchImageViewByPosition holder is null.", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (z17 && u2Var.f247484b.getVisibility() == 8) {
            return null;
        }
        return u2Var.f247484b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.p8
    public java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        e33.u2 u2Var;
        java.lang.String str;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        java.lang.String str2;
        int i18;
        android.view.View view3;
        int i19;
        com.tencent.mm.vfs.x1 m17;
        java.lang.Object obj;
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView;
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView2;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        if (view == null || view.getTag() == null) {
            android.view.View inflate = android.view.View.inflate(this.f247499g, com.tencent.mm.R.layout.bke, null);
            e33.u2 u2Var2 = new e33.u2();
            u2Var2.f247484b = (com.tencent.mm.ui.base.MultiTouchImageView) inflate.findViewById(com.tencent.mm.R.id.h88);
            u2Var2.f247485c = (com.tencent.mm.ui.base.WxImageView) inflate.findViewById(com.tencent.mm.R.id.pr8);
            u2Var2.f247486d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ozf);
            u2Var2.f247487e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jdz);
            u2Var2.f247488f = (com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer) inflate.findViewById(com.tencent.mm.R.id.p0x);
            inflate.setTag(u2Var2);
            view2 = inflate;
            u2Var = u2Var2;
        } else {
            e33.u2 u2Var3 = (e33.u2) view.getTag();
            u2Var3.f247484b.setVisibility(4);
            com.tencent.mm.ui.base.WxImageView wxImageView = u2Var3.f247485c;
            if (this.f247510u && wxImageView != null && (subsamplingScaleImageView2 = wxImageView.f68217f) != null) {
                subsamplingScaleImageView2.recycle();
            }
            u2Var3.f247485c.setVisibility(4);
            u2Var3.f247486d.setVisibility(0);
            u2Var3.f247487e.setVisibility(8);
            o(u2Var3);
            view2 = view;
            u2Var = u2Var3;
        }
        if (this.f247503n) {
            galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f247502m.get(i17);
            str = galleryItem$MediaItem.f138430e;
            str2 = galleryItem$MediaItem.f138433h;
            i18 = galleryItem$MediaItem.getType();
        } else {
            java.lang.String str3 = (java.lang.String) this.f247501i.get(i17);
            if (t23.p0.l() != null) {
                int indexOf = t23.p0.l().indexOf(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str3, str3, ""));
                if (indexOf >= 0) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) t23.p0.l().get(indexOf);
                    i18 = galleryItem$MediaItem2.getType();
                    str2 = null;
                    str = str3;
                    galleryItem$MediaItem = galleryItem$MediaItem2;
                }
            }
            str = str3;
            galleryItem$MediaItem = null;
            str2 = null;
            i18 = -1;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(galleryItem$MediaItem != null ? galleryItem$MediaItem.getType() : -1);
        objArr[3] = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138438p : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "getView >> position: %d，filePath: %s, itemType: %d, mimeType: %s", objArr);
        view2.setTag(com.tencent.mm.R.id.tzk, java.lang.Integer.valueOf(i18));
        if (galleryItem$MediaItem != null && galleryItem$MediaItem.getType() == 2) {
            u2Var.f247483a = false;
            u2Var.f247486d.setVisibility(0);
            u2Var.f247487e.setVisibility(8);
            u2Var.f247486d.setOnClickListener(new e33.t2(this, u2Var, str, this.f247508s));
            u2Var.f247488f.g();
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem3 = galleryItem$MediaItem;
            u2Var.f247488f.f(new ok4.w(new com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct(), java.lang.System.currentTimeMillis(), 3));
            u2Var.f247488f.setVideoCallback(new e33.k2(this, u2Var));
            if (t23.p0.k().f415297f == 4 || t23.p0.k().f415297f == 3 || t23.p0.k().f415297f == 14) {
                galleryItem$MediaItem = galleryItem$MediaItem3;
                t23.r2 r2Var = new t23.r2(galleryItem$MediaItem.f138430e, i17, (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem, new e33.l2(this, u2Var));
                if (!r2Var.equals(u2Var.f247487e.getTag())) {
                    u2Var.f247487e.setTag(r2Var);
                    ((ku5.t0) ku5.t0.f312615d).g(r2Var);
                }
                view3 = view2;
            } else {
                view3 = view2;
                galleryItem$MediaItem = galleryItem$MediaItem3;
            }
        } else {
            if (galleryItem$MediaItem != null && (galleryItem$MediaItem.getType() == 6 || ((galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) && ((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem).f138425w))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "livePhotoMediaItem getView >> position: %d, mediaId: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(galleryItem$MediaItem.f138434i));
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem D7 = galleryItem$MediaItem.getType() == 6 ? (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem : com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.D7((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem);
                com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout galleryLivePhotoTagLayout = new com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout(this.f247499g, null);
                galleryLivePhotoTagLayout.f138407d = 1;
                galleryLivePhotoTagLayout.a(D7);
                galleryLivePhotoTagLayout.b(D7.A);
                java.lang.String tips = i65.a.r(this.f247499g, com.tencent.mm.R.string.meg);
                kotlin.jvm.internal.o.g(tips, "tips");
                y51.c Ai = ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).Ai(new a61.a(new a61.d(true, galleryLivePhotoTagLayout, false, false, true, tips, false, null, true, null), new a61.c(1, D7.f138433h, java.lang.Boolean.valueOf(D7.G == 1).booleanValue(), D7.f138430e, java.lang.Long.valueOf(D7.f138434i), new e33.m2(this, D7, galleryLivePhotoTagLayout), null)), this.f247499g);
                galleryLivePhotoTagLayout.setLivePhotoTagClickCallback(new e33.n2(this, i17, Ai, D7));
                Ai.setTagViewCallback(new e33.o2(this));
                galleryLivePhotoTagLayout.setVisibility(0);
                android.view.View view4 = (android.view.View) Ai;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/gallery/ui/ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                u2Var.f247486d.setVisibility(8);
                u2Var.f247486d.setOnClickListener(null);
                u2Var.f247483a = false;
                y51.b bVar = (y51.b) Ai;
                bVar.d();
                if (i17 == this.f247511v && D7.H == 1 && D7.A != 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "getView is current live photo to play");
                    bVar.c();
                    p(D7, 1);
                }
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f247499g);
                frameLayout.addView(view4, new android.widget.FrameLayout.LayoutParams(-1, -1));
                frameLayout.setTag(com.tencent.mm.R.id.tzk, java.lang.Integer.valueOf(i18));
                if (this.f247500h == 2) {
                    fe0.m4 m4Var = (fe0.m4) i95.n0.c(fe0.m4.class);
                    java.lang.String str4 = java.lang.System.currentTimeMillis() + "";
                    java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
                    java.lang.String e17 = kk.k.e(D7.f138430e);
                    java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
                    int i27 = D7.B;
                    ((ee0.r4) m4Var).getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoExposure", "com.tencent.mm.feature.sns.SnsReportHelperService");
                    ke4.a.f307025a.b(str4, 0, "", Bi, 1, e17, Ni, i27);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoExposure", "com.tencent.mm.feature.sns.SnsReportHelperService");
                }
                android.view.View findViewById = galleryLivePhotoTagLayout.findViewById(com.tencent.mm.R.id.ut_);
                if (com.tencent.mm.ui.b4.c(this.f247499g) && findViewById != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "onSelectItem >> avoidNavigationBarForApi35");
                    com.tencent.mm.ui.a4.e(findViewById, false, false, 2, null);
                }
                return frameLayout;
            }
            if (t23.p0.k().f415297f == 3 && galleryItem$MediaItem != null && galleryItem$MediaItem.f138438p.equalsIgnoreCase("image/gif")) {
                android.widget.TextView textView = u2Var.f247487e;
                android.content.Context context = this.f247499g;
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str5 = a17.f213279f;
                if (str5 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
                    if (!a17.f213279f.equals(l17)) {
                        view3 = view2;
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                        textView.setText(context.getString(com.tencent.mm.R.string.fii, com.tencent.mm.sdk.platformtools.t8.f0((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L)));
                        u2Var.f247487e.setVisibility(0);
                        u2Var.f247483a = false;
                        i19 = 8;
                    }
                }
                view3 = view2;
                com.tencent.mm.vfs.z2 m182 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m182.a()) {
                    textView.setText(context.getString(com.tencent.mm.R.string.fii, com.tencent.mm.sdk.platformtools.t8.f0((m182.a() && (m17 = m182.f213266a.m(m182.f213267b)) != null) ? m17.f213233c : 0L)));
                    u2Var.f247487e.setVisibility(0);
                    u2Var.f247483a = false;
                    i19 = 8;
                }
                textView.setText(context.getString(com.tencent.mm.R.string.fii, com.tencent.mm.sdk.platformtools.t8.f0((m182.a() && (m17 = m182.f213266a.m(m182.f213267b)) != null) ? m17.f213233c : 0L)));
                u2Var.f247487e.setVisibility(0);
                u2Var.f247483a = false;
                i19 = 8;
            } else {
                view3 = view2;
                i19 = 8;
                u2Var.f247487e.setVisibility(8);
                u2Var.f247483a = true;
            }
            u2Var.f247486d.setVisibility(i19);
            u2Var.f247486d.setOnClickListener(null);
        }
        if (t23.p0.k().f415297f != 3 || (!(galleryItem$MediaItem == null && com.tencent.mm.sdk.platformtools.y1.c(str)) && (galleryItem$MediaItem == null || !galleryItem$MediaItem.f138438p.equalsIgnoreCase("image/gif")))) {
            long j17 = galleryItem$MediaItem == null ? 0L : galleryItem$MediaItem.f138435m;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "initImageView, filePath: %s.", str);
            e33.l3 l3Var = this.B;
            if (((lt0.f) l3Var.f247324g).k(str)) {
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) l3Var.f247324g).i(str);
                if (bitmap.isRecycled()) {
                    ((jt0.i) l3Var.f247324g).remove(str);
                } else {
                    q(u2Var, bitmap);
                }
            }
            android.graphics.Bitmap g17 = t23.p0.h().g(com.tencent.mm.sdk.platformtools.t8.K0(str2) ? str : str2, str, -1L, null, j17);
            boolean c17 = rq5.a.c(com.tencent.mm.vfs.w6.i(str, false));
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "isSupport: %s, path: %s.", java.lang.Boolean.valueOf(c17), str);
            if (c17) {
                u2Var.f247484b.setVisibility(4);
                u2Var.f247485c.setVisibility(0);
                android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
                if (n07 != null) {
                    int a18 = com.tencent.mm.sdk.platformtools.l.a(str);
                    com.tencent.mm.ui.base.WxImageView wxImageView2 = u2Var.f247485c;
                    int i28 = n07.outWidth;
                    int i29 = n07.outHeight;
                    wxImageView2.f68219h = i28;
                    wxImageView2.f68220i = i29;
                    wxImageView2.setOrientation(a18);
                    u2Var.f247485c.i();
                    u2Var.f247485c.setOnImageLoadEventListener(new e33.q2(this, u2Var, g17, str, i18));
                    if (g17 != null) {
                        u2Var.f247485c.t(str, com.davemorrissey.labs.subscaleview.view.ImageSource.cachedBitmap(g17));
                    } else {
                        u2Var.f247485c.t(str, null);
                    }
                }
            } else {
                q(u2Var, g17);
                java.util.HashSet hashSet = this.f247504o;
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    u2Var.f247484b.setTag(u2Var);
                    l3Var.b(u2Var.f247484b, str, i18);
                }
            }
        } else {
            u2Var.f247484b.setVisibility(0);
            com.tencent.mm.ui.base.WxImageView wxImageView3 = u2Var.f247485c;
            if (this.f247510u && wxImageView3 != null && (subsamplingScaleImageView = wxImageView3.f68217f) != null) {
                subsamplingScaleImageView.recycle();
            }
            u2Var.f247485c.setVisibility(4);
            u2Var.f247484b.setMaxZoomLimit(1.0f);
            u2Var.f247484b.setEnableHorLongBmpMode(false);
            u2Var.f247484b.setGifPath(str);
            u2Var.f247484b.setImageViewMatrix(new android.graphics.Matrix());
            u2Var.f247484b.h();
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = u2Var.f247484b;
            if (multiTouchImageView.f197653p0 && (obj = multiTouchImageView.f197662x0) != null) {
                ((og5.e) obj).stop();
                ((og5.e) multiTouchImageView.f197662x0).start();
            }
        }
        android.os.SystemClock.elapsedRealtime();
        return view3;
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        y51.c j17 = j(i17);
        if (j17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "destroyItem >> to release livePhotoPlayer: %d", java.lang.Integer.valueOf(i17));
            ((y51.b) j17).e();
        }
        if (this.f247503n) {
            viewGroup.removeView((android.view.View) obj);
            super.destroyItem(viewGroup, i17, obj);
        } else {
            if (obj == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageAdapter", "[destroyItem] position:%s", java.lang.Integer.valueOf(i17));
                return;
            }
            if (this.f247506q != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "[destroyItem] position:%s object:%s lastVisibleView:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(obj.hashCode()), java.lang.Integer.valueOf(this.f247506q.hashCode()));
            }
            if (obj == this.f247506q && this.f247507r) {
                return;
            }
            super.destroyItem(viewGroup, i17, obj);
            viewGroup.removeView((android.view.View) obj);
        }
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.WxImageView f(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageAdapter", "position : %d getWxImageViewByPosition view is null.", java.lang.Integer.valueOf(i17));
            return null;
        }
        e33.u2 u2Var = (e33.u2) e17.getTag();
        if (u2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageAdapter", "position : %d getWxImageViewByPosition holder is null.", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (z17 && u2Var.f247485c.getVisibility() == 8) {
            return null;
        }
        return u2Var.f247485c;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f247503n ? this.f247502m.size() : this.f247501i.size();
    }

    public java.lang.String i(int i17) {
        if (this.f247503n) {
            java.util.ArrayList arrayList = this.f247502m;
            if (i17 >= 0 && i17 < arrayList.size()) {
                return ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17)).f138430e;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageAdapter", "error position %d, mediaitems size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
            return "";
        }
        java.util.ArrayList arrayList2 = this.f247501i;
        if (i17 >= 0 && i17 < arrayList2.size()) {
            return (java.lang.String) arrayList2.get(i17);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList2.size()));
        return "";
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        if (this.f247503n) {
            return super.instantiateItem(viewGroup, i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "[instantiateItem] position:%s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f247505p));
        int i18 = this.f247505p;
        if (i17 != i18 || !this.f247507r) {
            return super.instantiateItem(viewGroup, i17);
        }
        this.f228470e.put(this.f247506q, java.lang.Integer.valueOf(i18));
        this.f228471f.put(this.f247505p, this.f247506q);
        this.f247505p = -1;
        this.f247507r = false;
        return this.f247506q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y51.c j(int i17) {
        java.lang.Object tag;
        java.lang.Object obj = this.f228471f.get(i17);
        if (obj != null && (tag = ((android.view.View) obj).getTag(com.tencent.mm.R.id.tzk)) != null) {
            boolean z17 = ((java.lang.Integer) tag).intValue() == 6;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "getLivePhotoPlayViewByPosition position: %d, isLivePhoto: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            if (z17) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
                int childCount = viewGroup.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    android.view.View childAt = viewGroup.getChildAt(i18);
                    if (childAt instanceof y51.c) {
                        return (y51.c) childAt;
                    }
                }
                return null;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(obj == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "getLivePhotoPlayViewByPosition >> position: %d is no livePhoto object is null: %b", objArr);
        return null;
    }

    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k(int i17) {
        int indexOf;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = null;
        if (this.f247503n) {
            java.util.ArrayList arrayList = this.f247502m;
            if (i17 >= 0 && i17 < arrayList.size()) {
                return (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17);
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageAdapter", "error position %d mediaitems size", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
            return null;
        }
        java.util.ArrayList arrayList2 = this.f247501i;
        if (i17 < 0 || i17 >= arrayList2.size()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList2.size()));
            return null;
        }
        java.lang.String str = (java.lang.String) arrayList2.get(i17);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(0, 0L, str, str, "");
        if (t23.p0.l() != null && (indexOf = t23.p0.l().indexOf(b17)) >= 0) {
            galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) t23.p0.l().get(indexOf);
        }
        if (galleryItem$MediaItem != null || t23.p0.m().isEmpty()) {
            return galleryItem$MediaItem;
        }
        java.util.Iterator it = t23.p0.m().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (galleryItem$MediaItem2.equals(b17)) {
                return galleryItem$MediaItem2;
            }
        }
        return galleryItem$MediaItem;
    }

    public void l() {
        y51.c cVar;
        y51.f fVar;
        android.util.SparseArray sparseArray = this.f228471f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "notifyBottomHeightChange >> cacheSize: %d", java.lang.Integer.valueOf(sparseArray.size()));
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            android.view.View view = (android.view.View) sparseArray.get(keyAt);
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.tzk);
            if (tag != null) {
                boolean z17 = ((java.lang.Integer) tag).intValue() == 6;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "view Cache position: %d, isLivePhoto: %b", java.lang.Integer.valueOf(keyAt), java.lang.Boolean.valueOf(z17));
                if (z17) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= childCount) {
                            cVar = null;
                            break;
                        }
                        android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i18);
                        if (childAt instanceof y51.c) {
                            cVar = (y51.c) childAt;
                            break;
                        }
                        i18++;
                    }
                    if (cVar != null) {
                        z51.r rVar = (z51.r) ((y51.b) cVar).a(z51.r.class);
                        rVar.f("changeTagViewLocation >> locationDepends: " + rVar.f470216k);
                        if (rVar.f470211f && (fVar = rVar.f470215j) != null && !rVar.f470213h && rVar.f470216k != 0) {
                            int c17 = fVar.c();
                            rVar.f("changeTagViewLocation >> bottomHeight: " + c17);
                            rVar.k(c17);
                        }
                    }
                }
            }
        }
    }

    public void m(int i17) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17;
        if (i17 >= 0 && (k17 = k(i17)) != null && k17.getType() == 6) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) k17;
            int i18 = galleryItem$LivePhotoMediaItem.A;
            if (i18 == 1) {
                o23.m.f342426a.D.a(2);
            } else if (i18 == 2) {
                o23.m.f342426a.D.a(1);
            } else if (i18 == 0) {
                o23.m.f342426a.D.a(galleryItem$LivePhotoMediaItem.I != 1 ? 1 : 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(boolean r12, int r13) {
        /*
            r11 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "MicroMsg.ImageAdapter"
            java.lang.String r2 = "onSelectItem >> position: %d, isSelect: %b"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = r11.k(r13)
            if (r0 == 0) goto Lad
            int r2 = r0.getType()
            r3 = 6
            if (r2 == r3) goto L22
            goto Lad
        L22:
            android.util.SparseArray r2 = r11.f228471f
            java.lang.Object r2 = r2.get(r13)
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L7c
            r7 = r2
            android.view.View r7 = (android.view.View) r7
            r8 = 2131309176(0x7f093278, float:1.8236628E38)
            java.lang.Object r7 = r7.getTag(r8)
            if (r7 == 0) goto L7c
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r3) goto L43
            r3 = r4
            goto L44
        L43:
            r3 = r6
        L44:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "getLivePhotoTagViewByPosition position: %d, isLivePhoto: %b"
            com.tencent.mars.xlog.Log.i(r1, r8, r7)
            if (r3 == 0) goto L7c
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r7 = r3.getChildCount()
            r8 = r6
        L5f:
            if (r8 >= r7) goto L6f
            android.view.View r9 = r3.getChildAt(r8)
            boolean r10 = r9 instanceof y51.c
            if (r10 == 0) goto L6c
            y51.c r9 = (y51.c) r9
            goto L70
        L6c:
            int r8 = r8 + 1
            goto L5f
        L6f:
            r9 = r5
        L70:
            if (r9 == 0) goto L7c
            y51.b r9 = (y51.b) r9
            android.view.View r1 = r9.getTagLayout()
            r5 = r1
            com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout r5 = (com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout) r5
            goto L93
        L7c:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r3[r6] = r7
            if (r2 != 0) goto L88
            r6 = r4
        L88:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r3[r4] = r2
            java.lang.String r2 = "getLivePhotoTagViewByPosition >> position: %d is no livePhoto object is null: %b"
            com.tencent.mars.xlog.Log.i(r1, r2, r3)
        L93:
            if (r5 == 0) goto L98
            r5.c(r12)
        L98:
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem r0 = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) r0
            int r12 = r0.A
            if (r12 != r4) goto Lad
            y51.c r12 = r11.j(r13)
            if (r12 == 0) goto Lad
            y51.b r12 = (y51.b) r12
            r12.c()
            r12 = 4
            r11.p(r0, r12)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.v2.n(boolean, int):void");
    }

    public final void o(e33.u2 u2Var) {
        u2Var.f247488f.setVisibility(8);
        u2Var.f247486d.setVisibility(0);
        u2Var.f247485c.setVisibility(0);
        u2Var.f247484b.setVisibility(0);
        this.f247514y.removeMessages(1);
    }

    public final void p(com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem, int i17) {
        if (this.f247500h != 2) {
            return;
        }
        fe0.m4 m4Var = (fe0.m4) i95.n0.c(fe0.m4.class);
        java.lang.String str = java.lang.System.currentTimeMillis() + "";
        java.lang.String e17 = kk.k.e(galleryItem$LivePhotoMediaItem.f138430e);
        java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        int i18 = galleryItem$LivePhotoMediaItem.B;
        ((ee0.r4) m4Var).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoPlay", "com.tencent.mm.feature.sns.SnsReportHelperService");
        ke4.a.f307025a.c(i17, str, 1, e17, Ni, 0, "", Bi, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoPlay", "com.tencent.mm.feature.sns.SnsReportHelperService");
    }

    public void q(e33.u2 u2Var, android.graphics.Bitmap bitmap) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "showImage, bmp:%s, trace: %s.", bitmap, new com.tencent.mm.sdk.platformtools.z3());
        if (bitmap == null) {
            u2Var.f247484b.setVisibility(4);
            u2Var.f247485c.setVisibility(4);
            return;
        }
        u2Var.f247484b.setVisibility(0);
        com.tencent.mm.ui.base.WxImageView wxImageView = u2Var.f247485c;
        if (this.f247510u && wxImageView != null && (subsamplingScaleImageView = wxImageView.f68217f) != null) {
            subsamplingScaleImageView.recycle();
        }
        u2Var.f247485c.setVisibility(4);
        u2Var.f247484b.setMaxZoomLimit(4.5f);
        u2Var.f247484b.setEnableHorLongBmpMode(false);
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = u2Var.f247484b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        multiTouchImageView.f197651o = width;
        multiTouchImageView.f197652p = height;
        u2Var.f247484b.setImageBitmap(bitmap);
        u2Var.f247484b.requestLayout();
    }

    public void r() {
        e33.u2 u2Var;
        com.tencent.mars.xlog.Log.w("MicroMsg.ImageAdapter", "stop all video");
        android.util.SparseArray sparseArray = this.f228471f;
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            java.lang.Object valueAt = sparseArray.valueAt(i17);
            if ((valueAt instanceof android.view.View) && (u2Var = (e33.u2) ((android.view.View) valueAt).getTag()) != null && u2Var.f247488f.isInitialized()) {
                u2Var.f247488f.stop();
                o(u2Var);
            }
        }
        this.f247514y.removeMessages(1);
    }
}
