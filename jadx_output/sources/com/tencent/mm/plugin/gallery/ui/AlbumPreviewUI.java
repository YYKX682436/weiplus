package com.tencent.mm.plugin.gallery.ui;

@db5.a(1043)
/* loaded from: classes10.dex */
public class AlbumPreviewUI extends com.tencent.mm.ui.gallery.BaseMediaTabActivity implements t23.m1, e33.f2 {

    /* renamed from: s2, reason: collision with root package name */
    public static long f138508s2;

    /* renamed from: t2, reason: collision with root package name */
    public static final /* synthetic */ int f138509t2 = 0;
    public java.lang.String A;
    public java.lang.String B;
    public boolean B1;
    public boolean C1;
    public java.lang.String D1;
    public boolean E;
    public int E1;
    public boolean F;
    public int F1;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f138510J;
    public boolean K;
    public boolean K1;
    public java.lang.String L;
    public boolean M1;
    public boolean N1;
    public boolean O1;
    public int Q;
    public java.lang.String U;
    public java.lang.String V;
    public android.view.View W1;
    public long X;
    public android.widget.CheckBox X1;
    public e33.x1 Z1;

    /* renamed from: d2, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem f138514d2;

    /* renamed from: e2, reason: collision with root package name */
    public e33.q f138515e2;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f138516f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f138518g;

    /* renamed from: g2, reason: collision with root package name */
    public e33.d2 f138519g2;

    /* renamed from: h, reason: collision with root package name */
    public boolean f138520h;

    /* renamed from: h2, reason: collision with root package name */
    public e33.e2 f138521h2;

    /* renamed from: i, reason: collision with root package name */
    public boolean f138522i;

    /* renamed from: i2, reason: collision with root package name */
    public volatile e33.o1 f138523i2;

    /* renamed from: j2, reason: collision with root package name */
    public long f138524j2;

    /* renamed from: l1, reason: collision with root package name */
    public int f138526l1;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f138527l2;

    /* renamed from: m, reason: collision with root package name */
    public e33.b0 f138528m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f138530n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f138532o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f138534p;

    /* renamed from: p0, reason: collision with root package name */
    public int f138535p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f138536p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f138538q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView f138540r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f138542s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f138543t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f138544u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f138545v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f138546w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageButton f138547x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f138548x0;

    /* renamed from: x1, reason: collision with root package name */
    public t23.l1 f138549x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f138550y;

    /* renamed from: y0, reason: collision with root package name */
    public int f138551y0;

    /* renamed from: y1, reason: collision with root package name */
    public double f138552y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f138553z;

    /* renamed from: z1, reason: collision with root package name */
    public double f138554z1;
    public boolean C = false;
    public boolean D = false;
    public r15.b M = null;
    public boolean N = false;
    public boolean P = false;
    public boolean R = false;
    public int S = 0;
    public int T = 0;
    public long W = 0;
    public long Y = -1;
    public long Z = -1;
    public boolean A1 = true;
    public boolean G1 = false;
    public boolean H1 = false;
    public final java.util.List I1 = new java.util.ArrayList();
    public int J1 = 3;
    public d85.f0 L1 = null;
    public boolean P1 = false;
    public boolean Q1 = false;
    public boolean R1 = false;
    public boolean S1 = false;
    public boolean T1 = true;
    public boolean U1 = false;
    public boolean V1 = false;
    public final s23.o Y1 = new e33.p0(this);

    /* renamed from: a2, reason: collision with root package name */
    public volatile long f138511a2 = -1;

    /* renamed from: b2, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f138512b2 = new e33.f1(this);

    /* renamed from: c2, reason: collision with root package name */
    public final yz5.a f138513c2 = new e33.g1(this);

    /* renamed from: f2, reason: collision with root package name */
    public wu5.c f138517f2 = null;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.HashMap f138525k2 = new java.util.HashMap();

    /* renamed from: m2, reason: collision with root package name */
    public final e33.r f138529m2 = new e33.z0(this);

    /* renamed from: n2, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f138531n2 = null;

    /* renamed from: o2, reason: collision with root package name */
    public t23.p1 f138533o2 = t23.p1.f415247d;

    /* renamed from: p2, reason: collision with root package name */
    public int f138537p2 = -1;

    /* renamed from: q2, reason: collision with root package name */
    public int f138539q2 = -1;

    /* renamed from: r2, reason: collision with root package name */
    public java.lang.String f138541r2 = "";

    private int A7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        return galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem ? com.tencent.mm.sdk.platformtools.t8.V1(((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138446x) : j33.d0.a(galleryItem$MediaItem.f138430e);
    }

    public static com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem D7(com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem galleryItem$ImageMediaItem) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.a(6, galleryItem$ImageMediaItem.f138434i);
        galleryItem$LivePhotoMediaItem.f138443u = galleryItem$ImageMediaItem.f138443u;
        galleryItem$LivePhotoMediaItem.f138435m = galleryItem$ImageMediaItem.f138435m;
        galleryItem$LivePhotoMediaItem.f138430e = galleryItem$ImageMediaItem.f138427y;
        galleryItem$LivePhotoMediaItem.f138433h = galleryItem$ImageMediaItem.f138426x;
        galleryItem$LivePhotoMediaItem.f138438p = galleryItem$ImageMediaItem.f138438p;
        galleryItem$LivePhotoMediaItem.f138431f = galleryItem$ImageMediaItem.f138430e;
        galleryItem$LivePhotoMediaItem.I = 1;
        galleryItem$LivePhotoMediaItem.G = 1;
        galleryItem$LivePhotoMediaItem.A = 1;
        return galleryItem$LivePhotoMediaItem;
    }

    private java.lang.Boolean E7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, int i17) {
        if (galleryItem$MediaItem.getType() != 2) {
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138446x > java.lang.Math.max(j33.e.f297434a.a(i17), 3600000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F7() {
        if (this.P1) {
            return s23.n.f402323u && s23.n.f402309d.d();
        }
        r23.c cVar = r23.j.f368828b;
        if (cVar != null && cVar.f368812f) {
            return cVar != null && cVar.a();
        }
        return false;
    }

    private void W7(java.lang.String str) {
        if (r7()) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
            u1Var.u(str);
            u1Var.n(getString(com.tencent.mm.R.string.fil));
            u1Var.l(new e33.c0$$l());
            u1Var.q(false);
        }
    }

    public static /* synthetic */ void X6(final com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        final int v76 = albumPreviewUI.v7();
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: e33.c0$$d
            @Override // java.lang.Runnable
            public final void run() {
                sa5.x xVar = sa5.x.f405373a;
                com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI2 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this;
                if (v76 >= 3) {
                    android.view.View view = albumPreviewUI2.W1;
                    kotlin.jvm.internal.o.g(view, "<this>");
                    sa5.d.a(view, new sa5.e0(xVar), 300L, null);
                } else {
                    android.view.View view2 = albumPreviewUI2.W1;
                    kotlin.jvm.internal.o.g(view2, "<this>");
                    sa5.d.b(view2, new sa5.n0(xVar), 300L, null);
                    albumPreviewUI2.X1.setChecked(false);
                    albumPreviewUI2.V1 = false;
                }
            }
        });
    }

    private void Y7() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.CAMERA, new e33.r0(this))) {
            return;
        }
        if (com.tencent.mm.pluginsdk.ui.tools.l7.l(getContext(), lp0.b.K(), "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, 4369)) {
            java.lang.System.gc();
        } else {
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.igw), 1).show();
        }
    }

    public static void b7(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        if (albumPreviewUI.E1 == 3 && albumPreviewUI.D) {
            int k17 = (int) com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
            long z76 = albumPreviewUI.z7(galleryItem$MediaItem);
            long j17 = k17;
            if (z76 < j17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "[checkRawImageItem] item:%s file size:%s", galleryItem$MediaItem, java.lang.Integer.valueOf(k17));
                if (t21.d3.s()) {
                    albumPreviewUI.W7(albumPreviewUI.getString(com.tencent.mm.R.string.fhp, j33.d0.e(z76)));
                } else {
                    db5.e1.W(albumPreviewUI, albumPreviewUI.getString(com.tencent.mm.R.string.fjq));
                }
                com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct videoAlbumErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct();
                videoAlbumErrorReportStruct.p(albumPreviewUI.V);
                videoAlbumErrorReportStruct.f61549e = 3L;
                videoAlbumErrorReportStruct.f61550f = j17;
                videoAlbumErrorReportStruct.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b8(boolean z17) {
        if (z17) {
            this.f138545v.setImageResource(com.tencent.mm.R.raw.radio_checked);
            this.f138545v.setContentDescription(getResources().getString(com.tencent.mm.R.string.fhk));
        } else {
            this.f138545v.setImageResource(com.tencent.mm.R.raw.radio_off_white);
            this.f138545v.setContentDescription(getResources().getString(com.tencent.mm.R.string.fhm));
        }
    }

    public static void c7(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        if (albumPreviewUI.f138528m != null && t21.d3.s() && albumPreviewUI.D && albumPreviewUI.E1 == 3) {
            albumPreviewUI.c8(albumPreviewUI.f138528m.J());
            java.util.Iterator it = albumPreviewUI.f138528m.f247131g.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                if (galleryItem$MediaItem != null) {
                    long k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
                    if (galleryItem$MediaItem.getType() == 2) {
                        long z76 = albumPreviewUI.z7(galleryItem$MediaItem);
                        if (k17 > z76) {
                            albumPreviewUI.W7(albumPreviewUI.getString(com.tencent.mm.R.string.fhq, j33.d0.e(z76)));
                            ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).Ai(com.tencent.mm.vfs.w6.n(galleryItem$MediaItem.f138430e), com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e), 3, 2, albumPreviewUI.V, albumPreviewUI.A7(galleryItem$MediaItem));
                            return;
                        }
                    }
                    if (galleryItem$MediaItem.getType() == 1) {
                        long z77 = albumPreviewUI.z7(galleryItem$MediaItem);
                        if (k17 > z77) {
                            albumPreviewUI.W7(albumPreviewUI.getString(com.tencent.mm.R.string.fhp, j33.d0.e(z77)));
                            ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).wi(com.tencent.mm.vfs.w6.n(galleryItem$MediaItem.f138430e), com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e), 4, 1, albumPreviewUI.V);
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public static void d7(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI, int i17, android.view.View view, int i18) {
        int i19;
        java.lang.String str;
        if (albumPreviewUI.P) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "click open camera, but camera is opening");
            return;
        }
        albumPreviewUI.S++;
        albumPreviewUI.P = true;
        int i27 = albumPreviewUI.F1;
        if (i27 == 2 || (i19 = albumPreviewUI.E1) == 13) {
            if (albumPreviewUI.getIntent().getBooleanExtra("record_video_force_sys_camera", false)) {
                com.tencent.mm.pluginsdk.ui.tools.l7.i(albumPreviewUI.getContext(), albumPreviewUI.getIntent().getStringExtra("video_full_path"), 4372, albumPreviewUI.getIntent().getIntExtra("record_video_time_limit", 0), 0, albumPreviewUI.getIntent().getIntExtra("record_video_quality", 0), false);
                return;
            }
            if (!albumPreviewUI.getIntent().getBooleanExtra("record_video_is_sight_capture", false)) {
                if (wo.v1.f447833m.f447753k != 1 || iq.b.g(albumPreviewUI.getContext()) || iq.b.v(albumPreviewUI.getContext()) || iq.b.e(albumPreviewUI.getContext())) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "Should not be here!?");
                    return;
                }
                androidx.appcompat.app.AppCompatActivity context = albumPreviewUI.getContext();
                android.content.Intent intent = new android.content.Intent("android.media.action.VIDEO_CAPTURE");
                intent.putExtra("android.intent.extra.videoQuality", 0);
                if (fp.h.c(8)) {
                    intent.putExtra("android.intent.extra.durationLimit", 30);
                    intent.putExtra("android.intent.extra.sizeLimit", 10485760);
                }
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(4372);
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/compatible/video/TakeVideoUtil", "takeVideoFromSys", "(Landroid/app/Activity;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    return;
                } catch (android.content.ActivityNotFoundException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TakeVideoUtil", e17, "", new java.lang.Object[0]);
                    return;
                }
            }
            if (((com.tencent.mm.plugin.mmsight.SightParams) albumPreviewUI.getIntent().getParcelableExtra("KEY_SIGHT_PARAMS")) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "takeMMSight, sightParams == null");
            }
            if (albumPreviewUI.E1 != 13) {
                com.tencent.mm.pluginsdk.ui.tools.l7.j(albumPreviewUI.getContext(), 4375, albumPreviewUI.getIntent(), 3, 1);
                return;
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider h17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.h(4);
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.Map map = uICustomParam.f64779h;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            h17.f155677o = uICustomParam;
            int intExtra = albumPreviewUI.getIntent().getIntExtra("record_video_time_limit", 0);
            if (intExtra > 0) {
                h17.f155685w = intExtra;
            }
            if (albumPreviewUI.A1) {
                ut3.m.f431182a.d(albumPreviewUI.getContext(), 4378, com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1, h17, 0);
                return;
            } else {
                com.tencent.mm.pluginsdk.ui.tools.l7.j(albumPreviewUI.getContext(), 4375, albumPreviewUI.getIntent(), 4, 1);
                return;
            }
        }
        if (i19 == 32) {
            albumPreviewUI.K7();
            return;
        }
        if (i27 == 1 || i27 == 3) {
            if (i19 != 4) {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                androidx.appcompat.app.AppCompatActivity context2 = albumPreviewUI.getContext();
                ((sb0.f) jVar).getClass();
                boolean a17 = j35.u.a(context2, "android.permission.CAMERA", 16, "", "");
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), albumPreviewUI.getContext());
                if (a17) {
                    albumPreviewUI.Y7();
                    return;
                }
                return;
            }
            if (albumPreviewUI.f138528m.J() >= albumPreviewUI.Q) {
                albumPreviewUI.P = false;
                android.content.res.Resources resources = albumPreviewUI.getResources();
                int i28 = albumPreviewUI.Q;
                db5.e1.T(albumPreviewUI, resources.getQuantityString(com.tencent.mm.R.plurals.f489679p, i28, java.lang.Integer.valueOf(i28)));
                return;
            }
            fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
            boolean z18 = albumPreviewUI.f138528m.J() <= 0 && 9 == albumPreviewUI.Q;
            ((ee0.n4) k4Var).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCpatureMMSight", "com.tencent.mm.feature.sns.SnsFeatureService");
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            if (iq.b.v(albumPreviewUI)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            } else if (iq.b.e(albumPreviewUI)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                boolean a18 = j35.u.a(albumPreviewUI, "android.permission.CAMERA", 18, "", "");
                java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(a18);
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimelineUIUtil", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf3, new com.tencent.mm.sdk.platformtools.z3(), albumPreviewUI);
                if (a18) {
                    long c17 = c01.id.c();
                    java.lang.String l17 = ca4.z0.l();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimelineUIUtil", "doCpatureMMSight sessionID:%s", l17);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 2, l17, java.lang.Long.valueOf(c17));
                    qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
                    boolean booleanValue = valueOf2.booleanValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProvider", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
                    com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(2, 0);
                    jz5.l b17 = je4.c.f299317a.b();
                    java.lang.Object obj = b17.f302833d;
                    java.lang.Object obj2 = b17.f302834e;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimelineUIUtil", "record video path:%s thumb path:%s", obj, obj2);
                    com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightParams.f148819f;
                    com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b18 = com.tencent.mm.plugin.sns.statistics.h.f164856a.b((java.lang.String) obj, (java.lang.String) obj2, videoTransPara, videoTransPara.f71195h * 1000, 49);
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ignore_remux_without_edit, false)) {
                        b18.f155669d = 2;
                    }
                    com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
                    videoCaptureReportInfo.f155690d = 1;
                    b18.I = videoCaptureReportInfo;
                    com.tencent.mm.component.api.jumper.UICustomParam uICustomParam2 = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
                    java.util.Map map2 = uICustomParam2.f64779h;
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    java.util.HashMap hashMap2 = (java.util.HashMap) map2;
                    hashMap2.put("plugin_filter", bool2);
                    hashMap2.put("plugin_tip", bool2);
                    hashMap2.put("plugin_poi", bool2);
                    hashMap2.put("plugin_menu", bool2);
                    b18.f155677o = uICustomParam2;
                    b18.f155682t = java.lang.Boolean.valueOf(booleanValue);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProvider", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
                    ((pc0.e2) c1Var).wi(albumPreviewUI, b18, new com.tencent.mm.plugin.sns.ui.us(albumPreviewUI));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
                    str = "com.tencent.mm.feature.sns.SnsFeatureService";
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", str);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            }
            str = "com.tencent.mm.feature.sns.SnsFeatureService";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", str);
        }
    }

    public static void e7(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        if (albumPreviewUI.D) {
            java.util.Iterator it = albumPreviewUI.f138528m.f247131g.iterator();
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                if (galleryItem$MediaItem != null && galleryItem$MediaItem.getType() == 1) {
                    long z76 = albumPreviewUI.z7(galleryItem$MediaItem);
                    long k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
                    if (z76 < k17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "[onClick] item:%s file size:%s", galleryItem$MediaItem, java.lang.Long.valueOf(k17));
                        i17++;
                        com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct videoAlbumErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct();
                        videoAlbumErrorReportStruct.p(albumPreviewUI.V);
                        videoAlbumErrorReportStruct.f61549e = 3L;
                        videoAlbumErrorReportStruct.f61550f = k17;
                        videoAlbumErrorReportStruct.k();
                    }
                    i18++;
                }
            }
            if (i17 > 0) {
                if (i18 == i17) {
                    if (t21.d3.s() && albumPreviewUI.E1 == 3) {
                        albumPreviewUI.W7(albumPreviewUI.getString(com.tencent.mm.R.string.fhp, j33.d0.e(albumPreviewUI.Z)));
                        return;
                    } else {
                        db5.e1.W(albumPreviewUI, albumPreviewUI.getString(com.tencent.mm.R.string.fjq));
                        return;
                    }
                }
                if (t21.d3.s() && albumPreviewUI.E1 == 3) {
                    albumPreviewUI.W7(albumPreviewUI.getString(com.tencent.mm.R.string.fhp, j33.d0.e(albumPreviewUI.Z)));
                } else {
                    db5.e1.W(albumPreviewUI, albumPreviewUI.getString(com.tencent.mm.R.string.fji));
                }
            }
        }
    }

    private boolean i7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, long j17) {
        if (this.S1) {
            return j17 > this.Y ? j17 <= z7(galleryItem$MediaItem) : E7(galleryItem$MediaItem, this.E1).booleanValue();
        }
        return false;
    }

    private int v7() {
        e33.b0 b0Var = this.f138528m;
        java.util.ArrayList arrayList = b0Var == null ? null : b0Var.f247131g;
        int i17 = 0;
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i18);
            if (!i7(galleryItem$MediaItem, com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e)) && !galleryItem$MediaItem.f138438p.toLowerCase().contains("gif")) {
                i17++;
            }
        }
        return i17;
    }

    public boolean B7() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean d17 = j35.u.d(this, "android.permission.WRITE_EXTERNAL_STORAGE", true);
        this.K1 = d17;
        return d17;
    }

    public void C7() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kcc);
        if (findViewById == null || this.f138516f == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "[hideNoPermissionView] view found null, return");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "hideNoPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "hideNoPermissionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f138516f;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    public final java.lang.Boolean G7(com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem) {
        i33.l1 t76;
        java.lang.String str;
        if (!this.O1 || (t76 = t7()) == null) {
            java.lang.String str2 = this.A;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return java.lang.Boolean.valueOf((str2 != null ? str2 : "").equals(galleryItem$AlbumItem.f138415d));
        }
        v23.b bVar = ((i33.a0) t76).f288151p;
        if (bVar == null || (str = bVar.f432888c) == null) {
            str = "";
        }
        java.lang.String str3 = this.A;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return java.lang.Boolean.valueOf((str3 != null ? str3 : "").equals(galleryItem$AlbumItem.f138415d) && str.equals(galleryItem$AlbumItem.f138418g));
    }

    public void H7(int i17, boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138528m.f247130f.get(i17);
        int i18 = this.F1;
        if (i18 == 1 || i18 == 3) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.U) && !"medianote".equals(this.V)) {
                if (android.os.SystemClock.elapsedRealtime() - this.W < 1000) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "sendImg btn event frequency limit");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "notifyMM switch to SendImgProxyUI");
                if (galleryItem$MediaItem.getType() != 2) {
                    try {
                        long j17 = galleryItem$MediaItem.f138434i;
                        java.lang.String str = galleryItem$MediaItem.f138430e;
                        java.lang.String str2 = this.V;
                        if (!this.C && this.D) {
                            z18 = false;
                            j33.d0.k(j17, str, str2, z18, 0, z17, galleryItem$MediaItem);
                        }
                        z18 = true;
                        j33.d0.k(j17, str, str2, z18, 0, z17, galleryItem$MediaItem);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            j33.d0.p(this, galleryItem$MediaItem.f138434i, galleryItem$MediaItem.f138430e, this.V, this.C || !this.D, 0, z17);
        }
    }

    public void I7(java.util.List list, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, int i17, int i18, boolean z17) {
        o23.m.f342426a.c(galleryItem$MediaItem.f138430e, this.J1, i17);
        c8(list.size());
        H7(i17, z17);
    }

    public void J7() {
    }

    public void K7() {
    }

    public final void L7(int i17, boolean z17) {
        if (z17) {
            t23.p0.p(this.f138528m.f247130f);
        } else {
            t23.p0.p(this.f138528m.f247131g);
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
        intent.putExtra("key_edit_video_max_time_length", getIntent().getIntExtra("key_edit_video_max_time_length", 10));
        intent.putExtra("query_source_type", this.E1);
        intent.putStringArrayListExtra("preview_image_list", this.f138528m.K());
        intent.putExtra("key_filter_hdr_video", getIntent().getBooleanExtra("key_filter_hdr_video", false));
        intent.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
        intent.putExtra("preview_all", z17);
        intent.putExtra("key_from_sns_post_album_multi_tab", this instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI);
        intent.putExtra("is_from_sns_comment", getIntent().getBooleanExtra("is_from_sns_comment", false));
        if (i17 > 0) {
            int z18 = i17 - this.f138528m.z();
            intent.putExtra("preview_position", z18);
            H7(z18, true);
        }
        intent.putExtra("send_raw_img", this.D);
        intent.putExtra("isSelectAlbum", this.H1);
        if (!F7()) {
            intent.putExtra("key_force_hide_edit_image_button", this.E);
        } else if (this.M1) {
            intent.putExtra("key_force_hide_edit_image_button", false);
            intent.putExtra("key_force_hide_edit_video_button", false);
        } else {
            intent.putExtra("key_force_hide_edit_image_button", true);
            intent.putExtra("key_force_hide_edit_video_button", true);
        }
        intent.putExtra("key_force_show_raw_image_button", this.G);
        intent.putExtra("key_is_raw_image_button_disable", this.I);
        intent.putExtra("max_select_count", this.Q);
        intent.putExtra("GalleryUI_FromUser", this.U);
        intent.putExtra("GalleryUI_ToUser", this.V);
        intent.putExtra("album_business_tag", this.f138548x0);
        intent.putExtra("album_video_max_duration", this.f138551y0);
        intent.putExtra("album_video_min_duration", this.f138526l1);
        intent.putExtra("select_type_tag", this.J1);
        r15.b bVar = this.M;
        if (bVar != null) {
            ok5.d.b(intent, "key_quote_extcommon", bVar, new ok5.h());
        }
        startActivityForResult(intent, 0);
    }

    public void M7(int i17, android.view.View view, int i18) {
        int i19;
        int i27;
        boolean z17;
        boolean z18;
        java.lang.String str;
        int c17;
        int c18;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = this.f138528m.E(i17);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (E == null || com.tencent.mm.sdk.platformtools.t8.K0(E.f138430e)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(E == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "item is null %s, item original path is null", objArr);
            return;
        }
        this.f138531n2 = E;
        if ((t23.p0.k().f415297f == 5 || t23.p0.k().f415297f == 31 || t23.p0.k().f415297f == 33) && E.f138438p.equalsIgnoreCase("image/gif")) {
            db5.e1.T(getContext(), getString(com.tencent.mm.R.string.fjl));
            return;
        }
        int i28 = this.F1;
        if (1 == i28) {
            if (E.f138438p.toLowerCase().contains("video")) {
                db5.e1.T(getContext(), getString(com.tencent.mm.R.string.fjn));
                return;
            }
        } else if (2 == i28 && E.f138438p.toLowerCase().contains("image")) {
            db5.e1.T(getContext(), getString(com.tencent.mm.R.string.fjm));
            return;
        }
        int z19 = i17 - this.f138528m.z();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onMediaClick, querySource %s item %s.", java.lang.Integer.valueOf(this.E1), E);
        int i29 = this.E1;
        if (i29 == 0 || i29 == 5 || i29 == 10 || i29 == 11 || i29 == 46 || i29 == 27) {
            if (this.F1 == 2) {
                db5.e1.K(this, true, getString(com.tencent.mm.R.string.f492189fk1), "", getString(com.tencent.mm.R.string.f490551ya), getString(com.tencent.mm.R.string.f490347sg), new e33.a1(this, E, i17), null);
                return;
            }
            if (i29 == 11 || i29 == 46) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoji_from_video_enabled_android, false) || bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmojiEditorEnable()) == 1) {
                    if (!j7(E)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "not support ratio");
                        java.lang.String string = E instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem ? getResources().getString(com.tencent.mm.R.string.fjp) : null;
                        if (string != null) {
                            db5.e1.T(getContext(), string);
                            return;
                        }
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    if (E.getType() == 2) {
                        intent.putExtra("is_video", true);
                    } else if (E.f138438p.equals("image/gif")) {
                        intent.putExtra("is_gif", true);
                    }
                    intent.putExtra("media_path", E.f138430e);
                    intent.putExtra("query_source_type", this.E1);
                    intent.putExtra("appId", getIntent().getStringExtra("appId"));
                    intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE));
                    intent.putExtra("query", getIntent().getStringExtra("query"));
                    intent.putExtra("key_from_scene", getIntent().getIntExtra("key_from_scene", 0));
                    intent.setClassName(this, "com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity");
                    int i37 = this.E1;
                    if (i37 == 11) {
                        startActivityForResult(intent, 4387);
                    } else if (i37 == 46) {
                        startActivityForResult(intent, 4389);
                    }
                    overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477729q);
                    o23.m.f342426a.c(E.f138430e, this.J1, i17);
                    return;
                }
            }
            p7(i17, E);
            return;
        }
        j33.j jVar = j33.j.f297441a;
        if (i29 == 31) {
            if (E.getType() != 2 || (c18 = j33.e.f297434a.c(this.E1, E)) == 0) {
                p7(i17, E);
                return;
            } else {
                jVar.a(this, c18, this.E1);
                return;
            }
        }
        if (i29 == 4) {
            if (this.P1) {
                z18 = s23.n.f402323u;
                z17 = true;
            } else {
                r23.c cVar = r23.j.f368828b;
                if (cVar != null) {
                    z17 = true;
                    if (cVar.f368812f) {
                        z18 = true;
                    }
                } else {
                    z17 = true;
                }
                z18 = false;
            }
            if (z18) {
                L7(i17, z17);
                return;
            }
            boolean l17 = j33.d0.l();
            if (l17) {
                str = "preview_all";
            } else {
                str = "preview_all";
                if (E.getType() == 2 && this.f138528m.J() != 0) {
                    db5.e1.T(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.fiq));
                    return;
                }
            }
            boolean z27 = l17 && j33.d0.j(this.f138528m.f247131g, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "enableSnsVLog:%s skipEditVideo:%s", java.lang.Boolean.valueOf(l17), java.lang.Boolean.valueOf(z27));
            if (E.getType() == 2 && !z27) {
                if ((E instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) && (c17 = j33.e.f297434a.c(this.E1, E)) != 0) {
                    jVar.a(this, c17, this.E1);
                    return;
                }
                boolean booleanExtra = getIntent().getBooleanExtra("key_check_third_party_video", false);
                jz5.l Ri = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ri();
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "edit video path:%s thumb path:%s", Ri.f302833d, Ri.f302834e);
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider wi6 = ((ee0.b4) ((fe0.a4) i95.n0.c(fe0.a4.class))).wi(E.f138430e, getIntent().getIntExtra("key_edit_video_max_time_length", 10) * 1000, (java.lang.String) Ri.f302833d, (java.lang.String) Ri.f302834e, 33, this.f138528m.K());
                com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
                videoCaptureReportInfo.f155690d = 1;
                wi6.I = videoCaptureReportInfo;
                wi6.T = booleanExtra;
                if (this instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI) {
                    wi6.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 65);
                }
                com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
                java.util.Map map = uICustomParam.f64779h;
                ((java.util.HashMap) map).put("plugin_filter", bool);
                ((java.util.HashMap) map).put("plugin_poi", bool);
                ((java.util.HashMap) map).put("plugin_tip", bool);
                ((java.util.HashMap) map).put("plugin_menu", bool);
                wi6.f155677o = uICustomParam;
                o23.m.f342426a.c(E.f138430e, this.J1, i17);
                this.f138541r2 = E.f138430e;
                ut3.m.f431182a.f(getContext(), 4379, com.tencent.mm.R.anim.f477876e0, -1, wi6, 2, 0);
                return;
            }
            android.os.SystemClock.elapsedRealtime();
            java.util.ArrayList L = l17 ? this.f138528m.f247130f : this.f138528m.L(E.getType());
            t23.p0.p(L);
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
            intent2.putExtra("query_source_type", this.E1);
            intent2.putExtra("key_filter_hdr_video", getIntent().getBooleanExtra("key_filter_hdr_video", false));
            intent2.putExtra("key_edit_video_max_time_length", getIntent().getIntExtra("key_edit_video_max_time_length", 10));
            intent2.putExtra("key_edit_text_color", getIntent().getStringExtra("key_edit_text_color"));
            intent2.putStringArrayListExtra("preview_image_list", this.f138528m.K());
            intent2.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
            intent2.putExtra("is_from_sns_comment", getIntent().getBooleanExtra("is_from_sns_comment", false));
            intent2.putExtra(str, true);
            intent2.putExtra("preview_position", L.indexOf(E));
            H7(z19, true);
            intent2.putExtra("send_raw_img", this.D);
            intent2.putExtra("isSelectAlbum", this.H1);
            intent2.putExtra("key_force_hide_edit_image_button", this.E);
            intent2.putExtra("key_force_show_raw_image_button", this.G);
            intent2.putExtra("key_is_raw_image_button_disable", this.I);
            intent2.putExtra("max_select_count", this.Q);
            intent2.putExtra("GalleryUI_FromUser", this.U);
            intent2.putExtra("GalleryUI_ToUser", this.V);
            intent2.putExtra("select_type_tag", this.J1);
            intent2.putExtra("key_from_sns_post_album_multi_tab", this instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI);
            r15.b bVar = this.M;
            if (bVar != null) {
                ok5.d.b(intent2, "key_quote_extcommon", bVar, new ok5.h());
            }
            startActivityForResult(intent2, 0);
            return;
        }
        if (i29 == 14) {
            if (E.getType() == 2 && this.f138528m.J() != 0) {
                db5.e1.T(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.fiq));
                return;
            }
            if (E.getType() == 1) {
                java.util.ArrayList L2 = this.f138528m.L(E.getType());
                t23.p0.p(L2);
                android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
                intent3.putExtra("key_edit_video_max_time_length", getIntent().getIntExtra("key_edit_video_max_time_length", 10));
                intent3.putExtra("key_edit_text_color", getIntent().getStringExtra("key_edit_text_color"));
                intent3.putStringArrayListExtra("preview_image_list", this.f138528m.K());
                intent3.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
                intent3.putExtra("preview_all", true);
                intent3.putExtra("is_from_sns_comment", getIntent().getBooleanExtra("is_from_sns_comment", false));
                intent3.putExtra("preview_position", L2.indexOf(E));
                H7(z19, true);
                intent3.putExtra("send_raw_img", this.D);
                intent3.putExtra("key_force_hide_edit_image_button", this.E);
                intent3.putExtra("key_force_show_raw_image_button", this.G);
                intent3.putExtra("key_is_raw_image_button_disable", this.I);
                intent3.putExtra("max_select_count", this.Q);
                intent3.putExtra("GalleryUI_FromUser", this.U);
                intent3.putExtra("GalleryUI_ToUser", this.V);
                intent3.putExtra("select_type_tag", this.J1);
                intent3.putExtra("key_from_sns_post_album_multi_tab", this instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI);
                r15.b bVar2 = this.M;
                if (bVar2 != null) {
                    ok5.d.b(intent3, "key_quote_extcommon", bVar2, new ok5.h());
                }
                startActivityForResult(intent3, 0);
                return;
            }
            if (E instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) E;
                int i38 = galleryItem$VideoMediaItem.f138446x;
                if (i38 <= 2000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "select story video, duration too long, duration:%s", java.lang.Integer.valueOf(i38));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1005L, 53L, 1L);
                    db5.e1.T(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.fje));
                    return;
                }
                int i39 = galleryItem$VideoMediaItem.C;
                if (i39 <= 1 && i39 >= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "select story video, videoFrameRate too small:%s, videoPath:%s", java.lang.Integer.valueOf(i39), galleryItem$VideoMediaItem.f138430e);
                    if (galleryItem$VideoMediaItem.C <= 1) {
                        try {
                            java.lang.String simpleMp4InfoVFS = com.tencent.mm.plugin.sight.base.SightVideoJNI.getSimpleMp4InfoVFS(galleryItem$VideoMediaItem.f138430e);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(simpleMp4InfoVFS)) {
                                double optDouble = new org.json.JSONObject(simpleMp4InfoVFS).optDouble("videoFPS");
                                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "update from getSimpleMp4Info videoFPS:%s", java.lang.Double.valueOf(optDouble));
                                if (optDouble > 0.0d) {
                                    galleryItem$VideoMediaItem.C = (int) optDouble;
                                }
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    int i47 = galleryItem$VideoMediaItem.C;
                    if (i47 < 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "final videoFrameRate:%s, too small, videoPath:%s", java.lang.Integer.valueOf(i47), galleryItem$VideoMediaItem.f138430e);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1005L, 54L, 1L);
                        db5.e1.T(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.f492187fj5));
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "maxDuration=%s", java.lang.Long.valueOf((getIntent().getIntExtra("key_edit_video_max_time_length", 10) * 1000) + 500));
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("K_SEGMENTVIDEOPATH", galleryItem$VideoMediaItem.f138430e);
                intent4.putExtra("KSEGMENTVIDEOTHUMBPATH", galleryItem$VideoMediaItem.f138433h);
                T7(-1, intent4);
                o23.m.f342426a.c(E.f138430e, this.J1, i17);
                finish();
                return;
            }
            return;
        }
        if (i29 == 29) {
            if (E.getType() == 1) {
                java.util.ArrayList L3 = this.f138528m.L(E.getType());
                t23.p0.p(L3);
                android.content.Intent intent5 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
                intent5.putExtra("key_edit_video_max_time_length", getIntent().getIntExtra("key_edit_video_max_time_length", 10));
                intent5.putExtra("key_edit_text_color", getIntent().getStringExtra("key_edit_text_color"));
                intent5.putStringArrayListExtra("preview_image_list", this.f138528m.K());
                intent5.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
                intent5.putExtra("preview_all", true);
                intent5.putExtra("preview_position", L3.indexOf(E));
                intent5.putExtra("is_from_sns_comment", getIntent().getBooleanExtra("is_from_sns_comment", false));
                H7(z19, true);
                intent5.putExtra("send_raw_img", this.D);
                intent5.putExtra("isSelectAlbum", this.H1);
                intent5.putExtra("key_force_hide_edit_image_button", this.E);
                intent5.putExtra("key_force_show_raw_image_button", this.G);
                intent5.putExtra("key_is_raw_image_button_disable", this.I);
                intent5.putExtra("max_select_count", this.Q);
                intent5.putExtra("GalleryUI_FromUser", this.U);
                intent5.putExtra("GalleryUI_ToUser", this.V);
                intent5.putExtra("select_type_tag", this.J1);
                intent5.putExtra("key_from_sns_post_album_multi_tab", this instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI);
                startActivityForResult(intent5, 0);
                return;
            }
            return;
        }
        if (i29 == 30) {
            if (E.getType() == 1) {
                java.util.ArrayList L4 = this.f138528m.L(E.getType());
                t23.p0.p(L4);
                android.content.Intent intent6 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
                intent6.putExtra("key_edit_video_max_time_length", getIntent().getIntExtra("key_edit_video_max_time_length", 10));
                intent6.putExtra("key_edit_text_color", getIntent().getStringExtra("key_edit_text_color"));
                intent6.putStringArrayListExtra("preview_image_list", this.f138528m.K());
                intent6.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
                intent6.putExtra("preview_all", true);
                intent6.putExtra("is_from_sns_comment", getIntent().getBooleanExtra("is_from_sns_comment", false));
                intent6.putExtra("preview_position", L4.indexOf(E));
                H7(z19, true);
                intent6.putExtra("send_raw_img", this.D);
                intent6.putExtra("isSelectAlbum", this.H1);
                intent6.putExtra("key_force_hide_edit_image_button", this.E);
                intent6.putExtra("key_force_show_raw_image_button", this.G);
                intent6.putExtra("key_is_raw_image_button_disable", this.I);
                intent6.putExtra("max_select_count", this.Q);
                intent6.putExtra("GalleryUI_FromUser", this.U);
                intent6.putExtra("GalleryUI_ToUser", this.V);
                intent6.putExtra("select_type_tag", this.J1);
                intent6.putExtra("key_from_sns_post_album_multi_tab", this instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI);
                startActivityForResult(intent6, 0);
                return;
            }
            return;
        }
        if (this.N) {
            int i48 = E.getType() == 2 ? 1 : this.Q;
            int i49 = this.E1;
            int i57 = i48;
            if ((i49 == 16 || i49 == 37) && ((i19 = this.F1) == 2 || i19 == 3)) {
                if (this.f138528m.J() > 0 && ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138528m.f247131g.get(0)).getType() != E.getType()) {
                    db5.e1.T(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.fiq));
                    return;
                }
                i27 = this.Q;
            } else {
                if (E.getType() == 2 && this.f138528m.J() != 0) {
                    db5.e1.T(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.fiq));
                    return;
                }
                i27 = i57;
            }
            int i58 = i27;
            if (this.E1 == 15 && E.getType() == 2) {
                return;
            }
            java.util.ArrayList L5 = this.f138528m.L(E.getType());
            t23.p0.p(L5);
            android.content.Intent intent7 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
            intent7.putStringArrayListExtra("preview_image_list", this.f138528m.K());
            intent7.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
            intent7.putExtra("preview_all", true);
            intent7.putExtra("preview_position", L5.indexOf(E));
            H7(z19, true);
            intent7.putExtra("send_raw_img", this.D);
            intent7.putExtra("isSelectAlbum", this.H1);
            intent7.putExtra("key_force_hide_edit_image_button", this.E);
            intent7.putExtra("key_force_show_raw_image_button", this.G);
            intent7.putExtra("key_is_raw_image_button_disable", this.I);
            intent7.putExtra("max_select_count", i58);
            intent7.putExtra("is_from_sns_comment", getIntent().getBooleanExtra("is_from_sns_comment", false));
            int i59 = this.E1;
            if (i59 == 16) {
                intent7.putExtra("query_source_type", i59);
            }
            intent7.putExtra("GalleryUI_FromUser", this.U);
            intent7.putExtra("GalleryUI_ToUser", this.V);
            intent7.putExtra("select_type_tag", this.J1);
            intent7.putExtra("album_business_tag", this.f138548x0);
            intent7.putExtra("album_video_max_duration", this.f138551y0);
            intent7.putExtra("album_video_min_duration", this.f138526l1);
            intent7.putExtra("key_from_sns_post_album_multi_tab", this instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI);
            r15.b bVar3 = this.M;
            if (bVar3 != null) {
                ok5.d.b(intent7, "key_quote_extcommon", bVar3, new ok5.h());
            }
            startActivityForResult(intent7, 0);
            return;
        }
        if (i29 != 22) {
            t23.p0.p(this.f138528m.f247130f);
            android.content.Intent intent8 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
            intent8.putExtra("key_send_as_media_group", this.V1);
            intent8.putExtra("query_source_type", this.E1);
            intent8.putExtra("isSelectAlbum", this.H1);
            intent8.putStringArrayListExtra("preview_image_list", this.f138528m.K());
            intent8.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
            intent8.putExtra("preview_all", true);
            intent8.putExtra("preview_position", z19);
            intent8.putExtra("is_from_sns_comment", getIntent().getBooleanExtra("is_from_sns_comment", false));
            H7(z19, true);
            intent8.putExtra("send_raw_img", this.D);
            intent8.putExtra("key_force_hide_edit_image_button", this.E);
            intent8.putExtra("key_force_show_raw_image_button", this.G);
            intent8.putExtra("key_is_raw_image_button_disable", this.I);
            intent8.putExtra("max_select_count", this.Q);
            intent8.putExtra("GalleryUI_FromUser", this.U);
            intent8.putExtra("GalleryUI_ToUser", this.V);
            intent8.putExtra("album_business_tag", this.f138548x0);
            intent8.putExtra("album_video_max_duration", this.f138551y0);
            intent8.putExtra("album_video_min_duration", this.f138526l1);
            if (t23.p0.k().f415297f == 14) {
                intent8.putExtra("key_edit_video_max_time_length", 300500);
            }
            intent8.putExtra("select_type_tag", this.J1);
            r15.b bVar4 = this.M;
            if (bVar4 != null) {
                ok5.d.b(intent8, "key_quote_extcommon", bVar4, new ok5.h());
            }
            startActivityForResult(intent8, 0);
            return;
        }
        if (E.getType() == 1) {
            android.content.Intent intent9 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            arrayList.add(E.f138430e);
            intent9.putStringArrayListExtra("key_select_image_list", arrayList);
            T7(-1, intent9);
            finish();
            return;
        }
        if (E.getType() != 2) {
            if (E.getType() == 6) {
                java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
                arrayList2.add(E);
                t23.p0.p(arrayList2);
                java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                arrayList3.add(E.f138430e);
                android.content.Intent intent10 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
                intent10.putExtra("query_source_type", this.E1);
                intent10.putStringArrayListExtra("preview_image_list", arrayList3);
                intent10.putParcelableArrayListExtra("preview_media_item_list", arrayList2);
                intent10.putExtra("preview_all", true);
                intent10.putExtra("preview_position", 0);
                intent10.putExtra("max_select_count", 1);
                intent10.putExtra("Gallery_LivePhoto_Auto_Enable", this.T1);
                startActivityForResult(intent10, 0);
                return;
            }
            return;
        }
        new java.util.ArrayList().add(E.f138430e);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider c19 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.c(E.f138430e, "", "");
        c19.f155685w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_album_duration, 15) * 1000;
        c19.F = 2;
        c19.K = false;
        c19.L = false;
        c19.N = true;
        c19.f155680r = bool;
        c19.f155679q = 4;
        com.tencent.mm.modelcontrol.VideoTransPara nj6 = d11.s.fj().nj();
        nj6.f71204t = -1;
        c19.f155676n = nj6;
        c19.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 81);
        if (!android.text.TextUtils.isEmpty(this.D1)) {
            c19.a(2, this.D1);
        }
        dw3.c0.f244182a.c(c19);
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(E.f138430e, true);
        if (d17 != null && d17.f162382a > c19.f155685w) {
            ut3.m.f431182a.f(getContext(), 4383, com.tencent.mm.R.anim.f477876e0, -1, c19, 2, 0);
            return;
        }
        wp4.b0 b0Var = (wp4.b0) ((yc0.g) i95.n0.c(yc0.g.class));
        b0Var.getClass();
        b0Var.wi(this, 4374, c19, null);
    }

    public boolean N7() {
        java.util.ArrayList arrayList;
        if (this.E1 != 45) {
            return O7(false);
        }
        e33.b0 b0Var = this.f138528m;
        if (b0Var != null && (arrayList = b0Var.f247131g) != null && !arrayList.isEmpty()) {
            ox.g gVar = (ox.g) ((tk.o) i95.n0.c(tk.o.class));
            if ((gVar.oj() != null && gVar.oj().f218757d) && !com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                final java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f138528m.f247131g);
                ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: e33.c0$$p
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
                        final com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this;
                        final jz5.l w76 = albumPreviewUI.w7(arrayList2);
                        albumPreviewUI.runOnUiThread(new java.lang.Runnable() { // from class: e33.c0$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i18 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
                                final com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI2 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this;
                                if (albumPreviewUI2.isDestroyed() || albumPreviewUI2.isFinishing()) {
                                    return;
                                }
                                jz5.l lVar = w76;
                                java.lang.String str = (java.lang.String) lVar.f302833d;
                                if (((java.lang.Long) lVar.f302834e).longValue() < com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                    albumPreviewUI2.O7(false);
                                    return;
                                }
                                java.lang.String string = albumPreviewUI2.getString(com.tencent.mm.R.string.o1i, str);
                                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(albumPreviewUI2);
                                u1Var.u(string);
                                u1Var.n(albumPreviewUI2.getString(com.tencent.mm.R.string.f490507x1));
                                u1Var.l(new com.tencent.mm.ui.widget.dialog.w1() { // from class: e33.c0$$h
                                    @Override // com.tencent.mm.ui.widget.dialog.w1
                                    public final void a(boolean z17, java.lang.String str2) {
                                        int i19 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
                                        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this.O7(false);
                                    }
                                });
                                u1Var.j(albumPreviewUI2.getString(com.tencent.mm.R.string.f490347sg));
                                u1Var.i(new e33.c0$$l());
                                u1Var.q(false);
                            }
                        });
                    }
                });
                return true;
            }
        }
        O7(false);
        return true;
    }

    public boolean O7(boolean z17) {
        long j17;
        java.lang.String str;
        android.content.Intent intent;
        java.lang.String str2;
        boolean z18;
        int i17;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList;
        boolean z19;
        java.util.ArrayList<java.lang.String> arrayList2;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList3;
        java.lang.Object obj;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList4;
        java.util.ArrayList<java.lang.String> arrayList5;
        int[] iArr;
        java.util.ArrayList<java.lang.String> arrayList6;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList7;
        java.lang.String str3;
        java.util.ArrayList<java.lang.String> arrayList8;
        p23.c cVar;
        java.lang.String str4;
        int i18;
        int a17;
        java.lang.String str5;
        boolean z27;
        android.content.Intent intent2;
        java.lang.String str6;
        p23.c cVar2;
        java.lang.String d17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str7 = "MicroMsg.AlbumPreviewUI";
        com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "send image, previewImageCount:%d, chooseForTimeline:%b, queryType: %d", java.lang.Integer.valueOf(t23.p0.j().f415236h.size()), java.lang.Boolean.valueOf(this.C), java.lang.Integer.valueOf(this.F1));
        boolean z28 = this.G1;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (z28) {
            this.f138518g.performClick();
            return true;
        }
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        bz0.j.f36750a.c(2);
        j33.d0.o(11610, (this.C ? 3 : 2) + "," + t23.p0.j().f415236h.size());
        if (this.Y < 0) {
            this.Y = j33.d0.h();
        }
        t23.p0.j().f415236h.clear();
        if (this.f138528m.K().size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onMenuItemClick");
            T7(-2, null);
            finish();
            return true;
        }
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.b1 b1Var = (i33.b1) pf5.z.f353948a.a(activity).a(i33.b1.class);
        java.util.ArrayList arrayList9 = this.f138528m.f247131g;
        com.tencent.mm.autogen.mmdata.rpt.GalleryTecReportStruct galleryTecReportStruct = b1Var.f288162g;
        galleryTecReportStruct.f58301l = 0;
        galleryTecReportStruct.f58302m = 0;
        if (arrayList9 != null) {
            java.util.Iterator it = arrayList9.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                if (galleryItem$MediaItem.getType() == 2) {
                    galleryTecReportStruct.f58301l++;
                } else if (galleryItem$MediaItem.getType() == 1) {
                    galleryTecReportStruct.f58302m++;
                }
            }
        }
        android.content.Intent intent3 = new android.content.Intent();
        int i19 = this.F1;
        boolean z29 = this.N;
        if (z29) {
            if (z29 && this.E1 == 16) {
                java.util.Iterator it6 = this.f138528m.f247131g.iterator();
                if (it6.hasNext()) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next();
                    if (galleryItem$MediaItem2.getType() != 1 && galleryItem$MediaItem2.getType() == 2) {
                        i19 = 2;
                    }
                }
            }
            i19 = 1;
        }
        int i27 = t23.p0.k().f415297f;
        ut3.m mVar = ut3.m.f431182a;
        e33.n6 n6Var = com.tencent.mm.plugin.gallery.ui.VLogPreloadUI.f138639d;
        jt3.b bVar = jt3.h.f301628l;
        java.lang.String str8 = "";
        if (22 == i27) {
            java.util.ArrayList<java.lang.String> arrayList10 = new java.util.ArrayList<>();
            java.util.ArrayList<java.lang.String> arrayList11 = new java.util.ArrayList<>();
            int[] iArr2 = new int[this.Q];
            x7(arrayList10, arrayList11, iArr2);
            if (!this.C1 || arrayList11.size() <= 0) {
                boolean m17 = j33.d0.m();
                if (bVar.a(-1, arrayList10, arrayList11) == 4 && m17) {
                    n6Var.a(this, arrayList11, arrayList10, iArr2, null);
                    return true;
                }
                intent3.putStringArrayListExtra("key_select_video_list", arrayList11);
                intent3.putStringArrayListExtra("key_select_image_list", arrayList10);
                T7(-1, intent3);
                finish();
                return true;
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider c17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.c(arrayList11.get(0), "", "");
            c17.f155685w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_album_duration, 15) * 1000;
            c17.F = 2;
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.Map map = uICustomParam.f64779h;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("plugin_filter", bool2);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            c17.f155677o = uICustomParam;
            c17.K = false;
            c17.L = false;
            c17.N = true;
            c17.f155680r = bool2;
            c17.f155679q = 4;
            c17.f155676n = d11.s.fj().rj();
            if (!android.text.TextUtils.isEmpty(this.D1)) {
                c17.a(2, this.D1);
            }
            mVar.f(getContext(), 4383, com.tencent.mm.R.anim.f477876e0, -1, c17, 2, 0);
            return true;
        }
        int i28 = this.E1;
        if (i28 == 28) {
            java.util.ArrayList arrayList12 = this.f138528m.f247131g;
            if (arrayList12.size() <= 0) {
                return true;
            }
            p7(0, (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList12.get(0));
            return true;
        }
        if (i28 == 46) {
            java.util.ArrayList arrayList13 = this.f138528m.f247131g;
            if (arrayList13 == null || arrayList13.isEmpty()) {
                return true;
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem3 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList13.get(0);
            if (!j7(galleryItem$MediaItem3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "not support ratio");
                java.lang.String string = galleryItem$MediaItem3 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem ? getResources().getString(com.tencent.mm.R.string.fjp) : null;
                if (string == null) {
                    return true;
                }
                db5.e1.T(getContext(), string);
                return true;
            }
            if (galleryItem$MediaItem3.getType() == 2) {
                intent3.putExtra("is_video", true);
            } else if (galleryItem$MediaItem3.f138438p.equals("image/gif")) {
                intent3.putExtra("is_gif", true);
            }
            intent3.putExtra("media_path", galleryItem$MediaItem3.f138430e);
            intent3.putExtra("query_source_type", this.E1);
            intent3.putExtra("key_from_scene", getIntent().getIntExtra("key_from_scene", 0));
            intent3.setClassName(this, "com.tencent.mm.plugin.emoji.ui.EmojiEditorActivity");
            intent3.putExtra("appId", getIntent().getStringExtra("appId"));
            intent3.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE));
            intent3.putExtra("query", getIntent().getStringExtra("query"));
            startActivityForResult(intent3, 4389);
            overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477729q);
            return true;
        }
        if (this.P1) {
            t23.p0.d(this.f138528m.K(), this.f138528m.f247131g);
            j17 = currentTimeMillis;
            if (s23.n.f402309d.e(this.f138528m.f247131g, new yz5.a() { // from class: e33.c0$$a
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i29 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
                    com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this.N7();
                    return null;
                }
            })) {
                return true;
            }
        } else {
            j17 = currentTimeMillis;
            if (r23.j.f368827a.b(this.f138528m.f247131g, new yz5.a() { // from class: e33.c0$$i
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i29 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
                    com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this.N7();
                    return null;
                }
            })) {
                return true;
            }
        }
        u23.f0 f0Var = u23.f0.f424074a;
        java.lang.String str9 = "edit";
        java.lang.String str10 = "key_select_image_uri_list";
        java.lang.String str11 = "KSelectImgUseTime";
        java.lang.String str12 = "CropImage_Compress_Img";
        if (i19 == 1) {
            intent3.putExtra("CropImage_Compress_Img", this.C || !this.D);
            java.util.ArrayList arrayList14 = this.f138528m.f247131g;
            java.util.ArrayList<java.lang.String> arrayList15 = new java.util.ArrayList<>();
            java.util.ArrayList<? extends android.os.Parcelable> arrayList16 = new java.util.ArrayList<>();
            java.util.ArrayList<? extends android.os.Parcelable> arrayList17 = new java.util.ArrayList<>();
            java.util.Iterator it7 = arrayList14.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem4 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it7.next();
                java.util.Iterator it8 = it7;
                android.net.Uri c18 = f0Var.c(galleryItem$MediaItem4);
                java.lang.String b17 = f0Var.b(galleryItem$MediaItem4);
                java.lang.String str13 = str12;
                if ((galleryItem$MediaItem4 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) && ((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem4).f138425w) {
                    str5 = str11;
                    z27 = true;
                } else {
                    str5 = str11;
                    z27 = false;
                }
                java.lang.String str14 = str10;
                if (galleryItem$MediaItem4.getType() == 6 || z27) {
                    intent2 = intent3;
                    str6 = str9;
                    com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem D7 = z27 ? D7((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem4) : (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem4;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "QUERY_TYPE_IMAGE >> select item type is livePhoto >> isValid: %d, state: %d", java.lang.Integer.valueOf(D7.H), java.lang.Integer.valueOf(D7.A));
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    if (D7.H == 1 && D7.A == 1) {
                        cVar2 = new p23.c(true, "");
                    } else {
                        java.lang.String d18 = dw3.c0.f244182a.d(context, null, D7.f138433h, f0Var.b(D7), f0Var.c(D7));
                        if (d18 == null) {
                            d18 = "";
                        }
                        cVar2 = new p23.c(false, d18);
                    }
                    int i29 = this.E1;
                    boolean z37 = (i29 == 7 || i29 == 8 || i29 == 43) && D7.H == 1;
                    if (cVar2.f351428a || z37) {
                        arrayList17.add(D7);
                    } else if (cVar2.f351429b.isEmpty()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "getFinalPath isEmpty");
                    } else {
                        arrayList16.add(c18);
                        arrayList15.add(cVar2.f351429b);
                        com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem galleryItem$ImageMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, galleryItem$MediaItem4.f138434i, cVar2.f351429b, "", "");
                        galleryItem$ImageMediaItem.f138424v = 1;
                        arrayList17.add(galleryItem$ImageMediaItem);
                    }
                } else if (!galleryItem$MediaItem4.f138438p.equals(str9) || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem4.f138432g)) {
                    intent2 = intent3;
                    java.lang.String str15 = galleryItem$MediaItem4.f138430e;
                    if (this.E1 == 45 && (d17 = dw3.c0.f244182a.d(this.f138516f.getContext(), null, str15, b17, c18)) != null) {
                        str15 = d17;
                    }
                    arrayList15.add(str15);
                    arrayList16.add(c18);
                    str6 = str9;
                    arrayList17.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, galleryItem$MediaItem4.f138434i, str15, "", ""));
                } else {
                    arrayList15.add(galleryItem$MediaItem4.f138432g);
                    arrayList16.add(c18);
                    intent2 = intent3;
                    arrayList17.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, galleryItem$MediaItem4.f138434i, galleryItem$MediaItem4.f138432g, "", ""));
                    str6 = str9;
                }
                it7 = it8;
                intent3 = intent2;
                str9 = str6;
                str12 = str13;
                str11 = str5;
                str10 = str14;
            }
            java.lang.String str16 = str11;
            android.content.Intent intent4 = intent3;
            java.lang.String str17 = str12;
            intent4.putStringArrayListExtra("CropImage_OutputPath_List", arrayList15);
            intent4.putParcelableArrayListExtra("key_select_multi_pic_item", arrayList17);
            intent4.putParcelableArrayListExtra(str10, arrayList16);
            intent4.putExtra(str16, java.lang.System.currentTimeMillis() - this.X);
            this.X = 0L;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f138548x0) && this.f138548x0.equals("album_business_bubble_media_by_coordinate")) {
                intent4.putExtra(str17, false);
            }
            if (android.os.SystemClock.elapsedRealtime() - this.W < 1000) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "sendImg btn event frequency limit");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "QUERY_TYPE_IMAGE switch to SendImgProxyUI");
            this.W = android.os.SystemClock.elapsedRealtime();
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.U) || "medianote".equals(this.V)) {
                T7(-1, intent4);
                finish();
                if (this.E1 == 29) {
                    overridePendingTransition(0, com.tencent.mm.R.anim.b_);
                }
            } else {
                intent4.setClassName(this, "com.tencent.mm.ui.chatting.SendImgProxyUI");
                intent4.putExtra("GalleryUI_FromUser", this.U);
                intent4.putExtra("GalleryUI_ToUser", this.V);
                startActivityForResult(intent4, 4373);
            }
        } else {
            java.lang.String str18 = "CropImage_Compress_Img";
            java.lang.Object obj2 = "edit";
            if (i19 != 2) {
                if (i19 != 3) {
                    int i37 = i19;
                    str = "MicroMsg.AlbumPreviewUI";
                    if (i37 == 19) {
                        intent3.putStringArrayListExtra("CropImage_OutputPath_List", new java.util.ArrayList<>());
                        T7(-1, intent3);
                        finish();
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "onMenuItemClick default");
                        T7(-2, null);
                        finish();
                    }
                } else {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f138548x0) && this.f138548x0.equals("album_business_bubble_media_by_coordinate")) {
                        java.util.ArrayList arrayList18 = this.f138528m.f247131g;
                        java.util.ArrayList<java.lang.String> arrayList19 = new java.util.ArrayList<>();
                        java.util.ArrayList<java.lang.String> arrayList20 = new java.util.ArrayList<>();
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList21 = new java.util.ArrayList<>();
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList22 = new java.util.ArrayList<>();
                        java.util.Iterator it9 = arrayList18.iterator();
                        u23.f0 f0Var2 = f0Var;
                        while (it9.hasNext()) {
                            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem5 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it9.next();
                            android.net.Uri c19 = f0Var2.c(galleryItem$MediaItem5);
                            java.lang.String b18 = f0Var2.b(galleryItem$MediaItem5);
                            java.util.Iterator it10 = it9;
                            u23.f0 f0Var3 = f0Var2;
                            if (galleryItem$MediaItem5.getType() == 1) {
                                java.lang.Object obj3 = obj2;
                                if (!galleryItem$MediaItem5.f138438p.equals(obj3) || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem5.f138432g)) {
                                    arrayList20.add(dw3.c0.f244182a.d(this.f138516f.getContext(), null, galleryItem$MediaItem5.f138430e, b18, c19));
                                } else {
                                    arrayList20.add(galleryItem$MediaItem5.f138432g);
                                }
                                arrayList21.add(c19);
                                obj2 = obj3;
                            } else if (galleryItem$MediaItem5.getType() == 2) {
                                arrayList19.add(dw3.c0.f244182a.h(this.f138516f.getContext(), null, galleryItem$MediaItem5.f138430e, b18, c19));
                                arrayList22.add(c19);
                            }
                            it9 = it10;
                            f0Var2 = f0Var3;
                        }
                        intent3.putExtra(str18, false);
                        intent3.putStringArrayListExtra("CropImage_OutputPath_List", arrayList20);
                        intent3.putStringArrayListExtra("key_select_video_list", arrayList19);
                        intent3.putParcelableArrayListExtra("key_select_image_uri_list", arrayList21);
                        intent3.putParcelableArrayListExtra("key_select_video_uri_list", arrayList22);
                        if (arrayList20.size() + arrayList19.size() > 1) {
                            intent3.putExtra("key_select_revoke_batch_id", dh3.c.f232489a.f(this.V, dh3.d.f232497f));
                        }
                        int v76 = v7();
                        if (this.V1 && v76 >= 3) {
                            byte[] bytes = (java.util.UUID.randomUUID().toString() + c01.id.c()).getBytes(r26.c.f368865a);
                            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                            java.lang.String g17 = kk.k.g(bytes);
                            kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
                            intent3.putExtra("key_select_media_group_id", g17);
                            intent3.putExtra("key_select_media_group_count", v76);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "sendAsMediaGroup, groupId: %s, count: %d", g17, java.lang.Integer.valueOf(v76));
                        }
                        intent3.putExtra("KSelectImgUseTime", java.lang.System.currentTimeMillis() - this.X);
                        intent3.putExtra("longitude", this.f138554z1);
                        intent3.putExtra("latitude", this.f138552y1);
                        this.X = 0L;
                        T7(-1, intent3);
                        finish();
                        return true;
                    }
                    u23.f0 f0Var4 = f0Var;
                    java.lang.Object obj4 = obj2;
                    if (android.os.SystemClock.elapsedRealtime() - this.W < 1000) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "sendImg btn event frequency limit");
                        return true;
                    }
                    this.W = android.os.SystemClock.elapsedRealtime();
                    java.util.ArrayList arrayList23 = this.f138528m.f247131g;
                    java.util.ArrayList<java.lang.String> arrayList24 = new java.util.ArrayList<>();
                    java.util.ArrayList<java.lang.String> arrayList25 = new java.util.ArrayList<>();
                    java.util.ArrayList<java.lang.String> arrayList26 = new java.util.ArrayList<>();
                    java.util.ArrayList<java.lang.String> arrayList27 = new java.util.ArrayList<>();
                    java.util.ArrayList<? extends android.os.Parcelable> arrayList28 = new java.util.ArrayList<>();
                    java.util.ArrayList<? extends android.os.Parcelable> arrayList29 = new java.util.ArrayList<>();
                    java.util.ArrayList arrayList30 = new java.util.ArrayList();
                    java.util.ArrayList<? extends android.os.Parcelable> arrayList31 = new java.util.ArrayList<>();
                    int i38 = this.Q;
                    int[] iArr3 = new int[i38];
                    java.util.ArrayList arrayList32 = new java.util.ArrayList();
                    java.util.Iterator it11 = arrayList23.iterator();
                    int i39 = 0;
                    while (it11.hasNext()) {
                        java.lang.String str19 = str18;
                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem6 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it11.next();
                        java.util.ArrayList arrayList33 = arrayList23;
                        u23.f0 f0Var5 = f0Var4;
                        java.lang.String str20 = str7;
                        android.net.Uri c27 = f0Var5.c(galleryItem$MediaItem6);
                        f0Var5.b(galleryItem$MediaItem6);
                        u23.f0 f0Var6 = f0Var5;
                        if ((galleryItem$MediaItem6 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) && ((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem6).f138425w) {
                            arrayList = arrayList29;
                            z19 = true;
                        } else {
                            arrayList = arrayList29;
                            z19 = false;
                        }
                        java.util.ArrayList<java.lang.String> arrayList34 = arrayList24;
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList35 = arrayList31;
                        long k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem6.f138430e);
                        if (i7(galleryItem$MediaItem6, k17)) {
                            arrayList26.add(galleryItem$MediaItem6.f138430e);
                            java.lang.String str21 = galleryItem$MediaItem6.f138429d;
                            if (str21 != null) {
                                arrayList27.add(str21);
                            } else {
                                arrayList27.add(str8);
                            }
                            arrayList32.add(galleryItem$MediaItem6);
                            i18 = i39 + 1;
                            iArr3[i39] = 3;
                            arrayList2 = arrayList27;
                            arrayList5 = arrayList34;
                            arrayList3 = arrayList35;
                            obj = obj4;
                            arrayList6 = arrayList26;
                            arrayList4 = arrayList;
                            iArr = iArr3;
                        } else {
                            arrayList2 = arrayList27;
                            if (galleryItem$MediaItem6.getType() != 1 || z19) {
                                arrayList3 = arrayList35;
                                obj = obj4;
                                if (galleryItem$MediaItem6.getType() == 2) {
                                    if (this.E1 == 3 && t21.d3.s() && this.D) {
                                        long j18 = this.Y;
                                        if (k17 > j18) {
                                            W7(getString(com.tencent.mm.R.string.fhq, j33.d0.e(j18)));
                                            return false;
                                        }
                                    }
                                    java.lang.String str22 = galleryItem$MediaItem6.f138430e;
                                    arrayList5 = arrayList34;
                                    arrayList5.add(str22);
                                    arrayList30.add(str22);
                                    arrayList4 = arrayList;
                                    arrayList4.add(c27);
                                    iArr3[i39] = 2;
                                    iArr = iArr3;
                                    i39++;
                                    arrayList6 = arrayList26;
                                } else {
                                    arrayList4 = arrayList;
                                    arrayList5 = arrayList34;
                                    iArr = iArr3;
                                    arrayList6 = arrayList26;
                                    if (galleryItem$MediaItem6.getType() == 6 || z19) {
                                        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem D72 = z19 ? D7((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem6) : (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem6;
                                        arrayList7 = arrayList4;
                                        str3 = str20;
                                        com.tencent.mars.xlog.Log.i(str3, "select item type is livePhoto >> isValid: %d, state: %d", java.lang.Integer.valueOf(D72.H), java.lang.Integer.valueOf(D72.A));
                                        androidx.appcompat.app.AppCompatActivity context2 = getContext();
                                        kotlin.jvm.internal.o.g(context2, "context");
                                        arrayList8 = arrayList5;
                                        if (D72.H == 1 && D72.A == 1) {
                                            cVar = new p23.c(true, str8);
                                        } else {
                                            java.lang.String d19 = dw3.c0.f244182a.d(context2, null, D72.f138433h, f0Var6.b(D72), f0Var6.c(D72));
                                            f0Var6 = f0Var6;
                                            if (d19 == null) {
                                                d19 = str8;
                                            }
                                            cVar = new p23.c(false, d19);
                                        }
                                        int i47 = this.E1;
                                        boolean z38 = (i47 == 7 || i47 == 8 || i47 == 43) && D72.H == 1;
                                        if (cVar.f351428a || z38) {
                                            str4 = str8;
                                            arrayList3.add(D72);
                                        } else {
                                            java.lang.String str23 = cVar.f351429b;
                                            if (str23.isEmpty()) {
                                                com.tencent.mars.xlog.Log.e(str3, "getFinalPath isEmpty");
                                                arrayList31 = arrayList3;
                                                str7 = str3;
                                                arrayList24 = arrayList8;
                                                arrayList23 = arrayList33;
                                                str18 = str19;
                                                f0Var4 = f0Var6;
                                                iArr3 = iArr;
                                                arrayList26 = arrayList6;
                                                obj4 = obj;
                                                arrayList27 = arrayList2;
                                                arrayList29 = arrayList7;
                                            } else {
                                                if (this.E1 == 3 && t21.d3.s() && this.D) {
                                                    str4 = str8;
                                                    long j19 = this.Z;
                                                    if (k17 > j19) {
                                                        W7(getString(com.tencent.mm.R.string.fhp, j33.d0.e(j19)));
                                                        return false;
                                                    }
                                                } else {
                                                    str4 = str8;
                                                }
                                                arrayList25.add(str23);
                                                arrayList30.add(str23);
                                                arrayList28.add(c27);
                                                com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem galleryItem$ImageMediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, galleryItem$MediaItem6.f138434i, cVar.f351429b, "", "");
                                                galleryItem$ImageMediaItem2.f138424v = 1;
                                                arrayList3.add(galleryItem$ImageMediaItem2);
                                            }
                                        }
                                        arrayList31 = arrayList3;
                                        str8 = str4;
                                        str7 = str3;
                                        arrayList24 = arrayList8;
                                        arrayList23 = arrayList33;
                                        str18 = str19;
                                        f0Var4 = f0Var6;
                                        iArr3 = iArr;
                                        arrayList26 = arrayList6;
                                        obj4 = obj;
                                        arrayList27 = arrayList2;
                                        arrayList29 = arrayList7;
                                    }
                                }
                                i18 = i39;
                            } else {
                                if (this.E1 == 3 && t21.d3.s() && this.D) {
                                    if (k17 > ((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).Bi(this.V)) {
                                        W7(getString(com.tencent.mm.R.string.fhp, j33.d0.e(((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).Bi(this.V))));
                                        return false;
                                    }
                                }
                                if (!galleryItem$MediaItem6.f138438p.equals(obj4) || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem6.f138432g)) {
                                    arrayList3 = arrayList35;
                                    java.lang.String str24 = galleryItem$MediaItem6.f138430e;
                                    arrayList25.add(str24);
                                    arrayList30.add(str24);
                                    arrayList28.add(c27);
                                    arrayList3.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, galleryItem$MediaItem6.f138434i, str24, "", ""));
                                } else {
                                    arrayList25.add(galleryItem$MediaItem6.f138432g);
                                    arrayList30.add(galleryItem$MediaItem6.f138432g);
                                    arrayList28.add(c27);
                                    arrayList3 = arrayList35;
                                    arrayList3.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, galleryItem$MediaItem6.f138434i, galleryItem$MediaItem6.f138432g, "", ""));
                                }
                                i18 = i39 + 1;
                                iArr3[i39] = 1;
                                obj = obj4;
                                arrayList4 = arrayList;
                                arrayList5 = arrayList34;
                                iArr = iArr3;
                                arrayList6 = arrayList26;
                            }
                        }
                        i39 = i18;
                        arrayList7 = arrayList4;
                        str3 = str20;
                        arrayList8 = arrayList5;
                        str4 = str8;
                        arrayList31 = arrayList3;
                        str8 = str4;
                        str7 = str3;
                        arrayList24 = arrayList8;
                        arrayList23 = arrayList33;
                        str18 = str19;
                        f0Var4 = f0Var6;
                        iArr3 = iArr;
                        arrayList26 = arrayList6;
                        obj4 = obj;
                        arrayList27 = arrayList2;
                        arrayList29 = arrayList7;
                    }
                    int[] iArr4 = iArr3;
                    java.util.ArrayList arrayList36 = arrayList23;
                    java.util.ArrayList<java.lang.String> arrayList37 = arrayList24;
                    str = str7;
                    java.util.ArrayList<java.lang.String> arrayList38 = arrayList27;
                    java.util.ArrayList<? extends android.os.Parcelable> arrayList39 = arrayList29;
                    java.lang.String str25 = str18;
                    java.util.ArrayList<java.lang.String> arrayList40 = arrayList26;
                    java.util.ArrayList<? extends android.os.Parcelable> arrayList41 = arrayList31;
                    if (!z17 && !this.U1 && !arrayList32.isEmpty()) {
                        j33.d.f297427a.a(getContext(), arrayList32, arrayList36, arrayList36.size(), 4390);
                        return true;
                    }
                    if (this.C || !this.D) {
                        intent = intent3;
                        str2 = str25;
                        z18 = true;
                    } else {
                        intent = intent3;
                        str2 = str25;
                        z18 = false;
                    }
                    intent.putExtra(str2, z18);
                    intent.putStringArrayListExtra("key_select_video_list", arrayList37);
                    intent.putParcelableArrayListExtra("key_select_image_uri_list", arrayList28);
                    intent.putParcelableArrayListExtra("key_select_video_uri_list", arrayList39);
                    if (arrayList25.size() + arrayList37.size() > 1) {
                        intent.putExtra("key_select_revoke_batch_id", dh3.c.f232489a.f(this.V, dh3.d.f232497f));
                    }
                    int v77 = v7();
                    if (this.V1 && v77 >= 3) {
                        byte[] bytes2 = (java.util.UUID.randomUUID().toString() + c01.id.c()).getBytes(r26.c.f368865a);
                        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                        java.lang.String g18 = kk.k.g(bytes2);
                        kotlin.jvm.internal.o.f(g18, "getMessageDigest(...)");
                        intent.putExtra("key_select_media_group_id", g18);
                        intent.putExtra("key_select_media_group_count", v77);
                        com.tencent.mars.xlog.Log.i(str, "sendAsMediaGroup, groupId: %s, count: %d", g18, java.lang.Integer.valueOf(v77));
                    }
                    intent.putStringArrayListExtra("key_select_file_list", arrayList40);
                    intent.putStringArrayListExtra("key_file_thumb_path", arrayList38);
                    intent.putExtra("key_delete_origin_file", this.U1);
                    intent.putExtra("key_select_media_idex_list", iArr4);
                    intent.putExtra("isSelectAlbum", this.H1);
                    intent.putExtra("KSelectImgUseTime", java.lang.System.currentTimeMillis() - this.X);
                    o23.n nVar = o23.m.f342426a;
                    nVar.f342436j = arrayList25.size();
                    nVar.f342437k = arrayList37.size();
                    nVar.f342440n = this.H1 ? 1 : 0;
                    int i48 = 1;
                    nVar.f342441o = 1;
                    if (this.M != null) {
                        int i49 = 0;
                        while (i49 < i38) {
                            int i57 = iArr4[i49];
                            if (i57 == i48) {
                                i17 = 1;
                                break;
                            }
                            i17 = 2;
                            if (i57 == 2) {
                                break;
                            }
                            i49++;
                            i48 = 1;
                        }
                    }
                    i17 = 0;
                    r15.b bVar2 = this.M;
                    if (bVar2 != null) {
                        ok5.d.b(intent, "key_quote_extcommon", bVar2, new ok5.h());
                    }
                    intent.putExtra("key_quote_msg_target", i17);
                    if (this.C) {
                        if (arrayList37.isEmpty()) {
                            t23.p0.d(arrayList25, this.f138528m.f247131g);
                            intent.putStringArrayListExtra("CropImage_OutputPath_List", arrayList25);
                            intent.putParcelableArrayListExtra("key_select_multi_pic_item", arrayList41);
                            intent.putExtra("KSelectImgUseTime", java.lang.System.currentTimeMillis() - this.X);
                            this.X = 0L;
                            T7(-1, intent);
                            finish();
                            return true;
                        }
                        dx1.g.f244489a.j("SnsPublishProcess", "actionTrace_", 5, bx1.u.f36311f);
                        if (bVar.a(-1, arrayList25, arrayList37) == 4) {
                            n6Var.a(this, arrayList37, arrayList25, iArr4, null);
                            return true;
                        }
                        t23.p0.c();
                        jz5.l Ri = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ri();
                        com.tencent.mars.xlog.Log.i(str, "edit video path:%s thumb path:%s", Ri.f302833d, Ri.f302834e);
                        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider wi6 = ((ee0.b4) ((fe0.a4) i95.n0.c(fe0.a4.class))).wi(arrayList37.get(0), getIntent().getIntExtra("key_edit_video_max_time_length", 10) * 1000, (java.lang.String) Ri.f302833d, (java.lang.String) Ri.f302834e, 33, this.f138528m.K());
                        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
                        videoCaptureReportInfo.f155690d = 1;
                        wi6.I = videoCaptureReportInfo;
                        if (this instanceof com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI) {
                            wi6.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 65);
                        }
                        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam2 = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
                        java.util.HashMap hashMap2 = (java.util.HashMap) uICustomParam2.f64779h;
                        hashMap2.put("plugin_filter", java.lang.Boolean.TRUE);
                        hashMap2.put("plugin_poi", bool);
                        hashMap2.put("plugin_tip", bool);
                        hashMap2.put("plugin_menu", bool);
                        wi6.f155677o = uICustomParam2;
                        boolean booleanExtra = getIntent().getBooleanExtra("key_check_third_party_video", false);
                        wi6.T = booleanExtra;
                        com.tencent.mars.xlog.Log.i(str, "checkThirdPartyVideo:%b", java.lang.Boolean.valueOf(booleanExtra));
                        mVar.f(getContext(), 4379, com.tencent.mm.R.anim.f477876e0, -1, wi6, 2, 0);
                        return true;
                    }
                    if (this.E1 == 16) {
                        intent.putParcelableArrayListExtra("key_select_multi_pic_item", arrayList41);
                    }
                    this.X = 0L;
                    if (arrayList25.size() > 0 || arrayList41.size() > 0) {
                        intent.setClassName(this, "com.tencent.mm.ui.chatting.SendImgProxyUI");
                        intent.putStringArrayListExtra("CropImage_OutputPath_List", arrayList25);
                        intent.putParcelableArrayListExtra("key_select_multi_pic_item", arrayList41);
                        intent.putExtra("GalleryUI_FromUser", this.U);
                        intent.putExtra("GalleryUI_ToUser", this.V);
                        intent.putExtra("CropImage_limit_Img_Size", this.Z);
                        com.tencent.mars.xlog.Log.i(str, "QUERY_TYPE_IMAGE_AND_VIDEO switch to SendImgProxyUI, send img size: %d", java.lang.Integer.valueOf(arrayList25.size()));
                        startActivityForResult(intent, 4373);
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "QueryTypeImageAndVideo");
                        T7(-1, intent);
                        finish();
                    }
                }
                com.tencent.mars.xlog.Log.i(str, "onSendItemClick cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onMenuItemClick video");
            e33.b0 b0Var = this.f138528m;
            android.content.Context context3 = this.f138516f.getContext();
            b0Var.getClass();
            java.util.ArrayList<java.lang.String> arrayList42 = new java.util.ArrayList<>();
            java.util.Iterator it12 = b0Var.f247131g.iterator();
            while (it12.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem7 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it12.next();
                android.net.Uri c28 = f0Var.c(galleryItem$MediaItem7);
                java.lang.String b19 = f0Var.b(galleryItem$MediaItem7);
                java.lang.String str26 = galleryItem$MediaItem7.f138430e;
                if (galleryItem$MediaItem7.getType() == 1) {
                    str26 = dw3.c0.f244182a.d(context3, null, galleryItem$MediaItem7.f138430e, b19, c28);
                } else if (galleryItem$MediaItem7.getType() == 2) {
                    str26 = dw3.c0.f244182a.h(context3, null, galleryItem$MediaItem7.f138430e, b19, c28);
                }
                arrayList42.add(str26);
            }
            if (getIntent().getBooleanExtra("GalleryUI_SkipVideoSizeLimit", false)) {
                a17 = 0;
            } else {
                g33.a aVar = new g33.a(arrayList42.get(0));
                aVar.f268175b = this.Y;
                a17 = aVar.a();
            }
            if (a17 != 0) {
                if (a17 != 2) {
                    d8();
                    return true;
                }
                db5.e1.i(this, com.tencent.mm.R.string.f493445k75, com.tencent.mm.R.string.f492188fk0);
                com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "video is import error");
                return true;
            }
            intent3.setData(com.tencent.mm.sdk.platformtools.i1.b(getContext(), new com.tencent.mm.vfs.r6((java.lang.String) this.f138528m.K().get(0))));
            intent3.putStringArrayListExtra("key_select_video_list", arrayList42);
            intent3.putExtra(str18, !this.D);
            T7(-1, intent3);
            finish();
        }
        str = "MicroMsg.AlbumPreviewUI";
        com.tencent.mars.xlog.Log.i(str, "onSendItemClick cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
        return true;
    }

    public final void P7() {
        int i17 = this.E1;
        if (getIntent().hasExtra("gallery_report_tag")) {
            i17 = getIntent().getIntExtra("gallery_report_tag", 3);
        }
        boolean z17 = this.B1;
        j33.o oVar = j33.o.f297450a;
        if (z17) {
            e33.b0 b0Var = this.f138528m;
            android.net.Uri uri = t23.o2.f415216e;
            java.util.List list = t23.n2.f415209a.f415220d;
            java.util.ArrayList arrayList = b0Var.f247131g;
            arrayList.clear();
            arrayList.addAll(list);
            t23.p0.m().addAll(this.f138528m.f247131g);
            c8(this.f138528m.J());
            java.lang.String stringExtra = getIntent().getStringExtra("album_id_from_smart_gallery");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "album id is invalid.");
            } else {
                t23.y0 n17 = t23.p0.n();
                e33.b0 b0Var2 = this.f138528m;
                android.app.ProgressDialog progressDialog = this.f138530n;
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f138516f;
                e33.t1 t1Var = new e33.t1(null);
                t1Var.f247467a = this.Q1;
                t1Var.f247468b = this.T1;
                t1Var.f247469c = this.R1;
                t1Var.f247470d = this.F1;
                e33.v1 v1Var = new e33.v1(stringExtra, b0Var2, progressDialog, recyclerView, t1Var);
                java.util.concurrent.ExecutorService executorService = n17.f415305f;
                if (executorService != null) {
                    ((ku5.f) executorService).execute(v1Var);
                }
            }
            Z7();
        } else {
            ((lt0.i) kt0.g.a(kt0.g.f311913d)).a(1.0d);
            ((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).getClass();
            o23.n nVar = o23.m.f342426a;
            nVar.getClass();
            nVar.f342427a = oVar.a(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "start queryMediaInAlbums %s", this);
            t23.p0.k().b(this);
            if (this.O1) {
                e33.c0$$q c0__q = new e33.c0$$q();
                i33.l1 t76 = t7();
                if (t76 != null) {
                    c0__q.accept(t76);
                }
                if (t21.d3.s()) {
                    ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: e33.c0$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this;
                            if (albumPreviewUI.Y < 0) {
                                long h17 = j33.d0.h();
                                albumPreviewUI.Y = h17;
                                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "updateVideoSendMaxSizeAsync: %s", java.lang.Long.valueOf(h17));
                            }
                        }
                    });
                }
            } else {
                X7(this.A, t23.p0.k().f415298g);
            }
            getContentView().postDelayed(new e33.c1(this), isFragmentMode() ? 600 : 300);
            t23.z1 z1Var = t23.z1.f415313d;
            z1Var.a(new t23.s1());
            z1Var.a(new t23.c2());
        }
        i33.b1 b1Var = (i33.b1) pf5.z.f353948a.a(this).a(i33.b1.class);
        b1Var.getClass();
        long a17 = oVar.a(i17);
        com.tencent.mm.autogen.mmdata.rpt.GalleryTecReportStruct galleryTecReportStruct = b1Var.f288162g;
        galleryTecReportStruct.f58294e = a17;
        boolean z18 = this.B1;
        b1Var.f288161f = z18;
        galleryTecReportStruct.f58296g = z18 ? 1L : 0L;
        galleryTecReportStruct.f58314y = this.F1;
        galleryTecReportStruct.f58312w = this.O1 ? 1 : 0;
        int i18 = this.E1;
        if (i18 == 3 || i18 == 19 || i18 == 20 || i18 == 21 || i18 == 23 || i18 == 26) {
            com.tencent.mm.plugin.report.service.b1.f(3, 11);
            return;
        }
        if (i18 == 4 || i18 == 17 || i18 == 31 || i18 == 14 || i18 == 22) {
            com.tencent.mm.plugin.report.service.b1.f(12, 11);
            return;
        }
        if (i18 == 25 || i18 == 37 || i18 == 28 || i18 == 32 || i18 == 30) {
            com.tencent.mm.plugin.report.service.b1.f(5, 11);
        } else {
            com.tencent.mm.plugin.report.service.b1.f(22, 11);
        }
    }

    public final void Q7() {
        t23.y0 n17 = t23.p0.n();
        e33.n1 n1Var = new e33.n1(this);
        if (n17.f415302c == null && n17.f415300a != null) {
            n17.f415302c = new com.tencent.mm.sdk.platformtools.n3(n17.f415300a.getLooper());
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = n17.f415302c;
        if (n3Var != null) {
            n3Var.post(n1Var);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GalleryHandlerThread", "other handler is null.");
        }
    }

    public void R7() {
        java.util.ArrayList arrayList;
        e33.b0 b0Var = this.f138528m;
        if (b0Var == null || (arrayList = b0Var.f247131g) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        if (h7()) {
            ((ku5.t0) ku5.t0.f312615d).g(new e33.w0(this, arrayList2));
        }
    }

    public void S7(com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem) {
        if (galleryItem$AlbumItem == null) {
            return;
        }
        if (galleryItem$AlbumItem.f138421m) {
            this.J1 = 3;
        } else {
            this.J1 = 4;
        }
        if (G7(galleryItem$AlbumItem).booleanValue()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "want to reset folder, same folder, return");
            return;
        }
        t23.p0.m().addAll(this.f138528m.f247131g);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "reset folder[%s], path[%s]", galleryItem$AlbumItem.f138415d, galleryItem$AlbumItem.n());
        java.lang.String n17 = galleryItem$AlbumItem.n();
        this.f138553z = n17;
        this.A = galleryItem$AlbumItem.f138415d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "reset folder path failed");
            this.f138553z = this.A;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            e33.b0 b0Var = this.f138528m;
            e33.q qVar = this.f138515e2;
            if (qVar == null) {
                b0Var.getClass();
                com.tencent.mars.xlog.Log.w("MicroMsg.AlbumAdapter", "removeHeader error, header is null");
            } else {
                b0Var.f247139r.remove(qVar);
            }
        } else if (getIntent().getBooleanExtra("show_header_view", true)) {
            this.f138528m.y(this.f138515e2);
        }
        if (containUIC(i33.t0.class)) {
            i33.t0 t0Var = (i33.t0) pf5.z.f353948a.a(this).a(i33.t0.class);
            if (t0Var.a7().getVisibility() == 0) {
                t0Var.X6();
                j33.c0 c0Var = new j33.c0(t0Var.a7(), null, 0L, 0L, null, null, 62, null);
                t0Var.f288262x = c0Var;
                c0Var.run();
                t0Var.f288262x = null;
                com.tencent.mars.xlog.Log.i(t0Var.f288247f, "now hide scrollbar");
            }
        }
        java.lang.String str = galleryItem$AlbumItem.f138416e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            int i17 = this.F1;
            str = i17 == 3 ? getString(com.tencent.mm.R.string.fia) : i17 == 1 ? getString(com.tencent.mm.R.string.fi_) : getString(com.tencent.mm.R.string.fib);
        }
        updateActionBarOperationAreaTxt(str);
        c8(this.f138528m.J());
        Z7();
        f138508s2 = java.lang.System.currentTimeMillis();
        boolean z17 = galleryItem$AlbumItem instanceof com.tencent.mm.plugin.gallery.model.PrivateAlbumItem;
        if (z17) {
            t23.n1 n1Var = t23.p0.k().f415296e;
            if (n1Var != null) {
                ((t23.f) n1Var).f415144g = true;
            }
            this.f138511a2 = java.lang.System.currentTimeMillis();
            android.net.Uri uri = t23.o2.f415216e;
            t23.n2.f415209a.f415218b = true;
            java.lang.String str2 = ((com.tencent.mm.plugin.gallery.model.PrivateAlbumItem) galleryItem$AlbumItem).f138449p.f415148c;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "album id is invalid.");
            } else {
                t23.y0 n18 = t23.p0.n();
                e33.b0 b0Var2 = this.f138528m;
                android.app.ProgressDialog progressDialog = this.f138530n;
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f138516f;
                e33.t1 t1Var = new e33.t1(null);
                t1Var.f247467a = this.Q1;
                t1Var.f247468b = this.T1;
                t1Var.f247469c = this.R1;
                t1Var.f247470d = this.F1;
                n18.d(new e33.v1(str2, b0Var2, progressDialog, recyclerView, t1Var));
            }
        } else {
            e33.x1 x1Var = this.Z1;
            if (x1Var != null) {
                x1Var.f247539h = true;
            }
            android.net.Uri uri2 = t23.o2.f415216e;
            t23.o2 o2Var = t23.n2.f415209a;
            o2Var.f415219c = true;
            o2Var.f415218b = true;
            if (this.O1) {
                i33.l1 t76 = t7();
                if (t76 != null) {
                    ((i33.a0) t76).Y6(this.A, true, galleryItem$AlbumItem.f138418g);
                }
            } else {
                java.lang.String str3 = this.A;
                int i18 = this.F1;
                if (str3.equals(getString(com.tencent.mm.R.string.fib))) {
                    str3 = "";
                    i18 = 2;
                }
                X7(str3, i18);
            }
        }
        try {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18269, java.net.URLEncoder.encode(z17 ? "private" : "public", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), java.net.URLEncoder.encode(galleryItem$AlbumItem.f138416e, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T7(int r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.T7(int, android.content.Intent):void");
    }

    public void U7(java.lang.Boolean bool) {
        java.lang.String string;
        java.lang.String str;
        java.lang.String str2;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kcc);
        if (findViewById == null || this.f138516f == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "[showNoPermissionView] view found null, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "showNoPermissionView: from sys=%b", bool);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "showNoPermissionView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "showNoPermissionView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f138516f.setVisibility(8);
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.f482884qr);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.f482885qs);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        i33.e eVar = (i33.e) pf5.z.f353948a.a(this).a(i33.e.class);
        if (bool.booleanValue()) {
            textView.setText(android.os.Build.VERSION.SDK_INT < 33 ? com.tencent.mm.R.string.f489980hc : com.tencent.mm.R.string.cx7);
            textView2.setOnClickListener(new e33.b1(this, eVar));
            return;
        }
        java.lang.String str3 = "";
        if (android.os.Build.VERSION.SDK_INT < 33) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            java.lang.String c17 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.c();
            if (c17 != null && (str2 = (java.lang.String) e85.i.f250318d.get(c17)) != null) {
                str3 = str2;
            }
            string = getString(com.tencent.mm.R.string.f489978ha, str3);
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            java.lang.String c18 = com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.c();
            if (c18 != null && (str = (java.lang.String) e85.i.f250318d.get(c18)) != null) {
                str3 = str;
            }
            string = getString(com.tencent.mm.R.string.cx6, str3);
        }
        textView.setText(string);
        textView2.setOnClickListener(new e33.d1(this));
    }

    public boolean V7() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((sb0.f) jVar).getClass();
        if (zo.e.b(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "showSmartGalleryEntry without FULL_MEDIA_PERMISSION.");
            return false;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_smart_gallery_black_list, "", true);
        java.lang.String lowerCase = android.os.Build.MANUFACTURER.toLowerCase();
        java.lang.String lowerCase2 = wo.w0.m().toLowerCase();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "pennqin, manufacturer: %s, model: %s, smartGalleryBlackList: %s.", lowerCase, lowerCase2, Zi);
        return (Zi.contains(lowerCase) || Zi.contains(lowerCase2) || "album_business_bubble_media_by_jsapi_chooseimage".equals(this.f138548x0) || "album_business_bubble_media_by_jsapi_choosevideo".equals(this.f138548x0)) ? false : true;
    }

    public void X7(java.lang.String str, int i17) {
        this.f138511a2 = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "startQueryMediaInAlbum:ticket=%s, folderHash=%d, queryAlbumType=%d", java.lang.Long.valueOf(this.f138511a2), java.lang.Integer.valueOf(str == null ? -1 : str.hashCode()), java.lang.Integer.valueOf(i17));
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((i33.b1) pf5.z.f353948a.a(activity).a(i33.b1.class)).W6(java.lang.String.valueOf(this.f138511a2), str);
        t23.p0.k().e(str, i17, this.f138511a2);
    }

    public final void Z7() {
        android.app.ProgressDialog progressDialog = this.f138530n;
        if (progressDialog == null || progressDialog.isShowing()) {
            return;
        }
        this.f138530n.show();
        i33.b1 b1Var = (i33.b1) pf5.z.f353948a.a(this).a(i33.b1.class);
        if (b1Var.f288165m == 0) {
            b1Var.f288165m = java.lang.System.currentTimeMillis();
        }
    }

    public void a8(int i17) {
        java.lang.String i18;
        i33.g gVar = (i33.g) pf5.z.f353948a.a(this).a(i33.g.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int i19 = this.E1;
        int i27 = this.Q;
        java.lang.String str = this.f138548x0;
        boolean z17 = this.H1;
        e33.b0 b0Var = this.f138528m;
        java.util.ArrayList arrayList = b0Var == null ? null : b0Var.f247131g;
        gVar.getClass();
        if (context == null) {
            i18 = "";
        } else {
            i18 = j33.d0.i(context, i19, i17, i27, str, z17, arrayList, true, false);
            kotlin.jvm.internal.o.f(i18, "getSendOptionMenuText(...)");
        }
        gVar.Y0(i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c8(int r12) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.c8(int):void");
    }

    public final void d8() {
        if (t21.d3.s()) {
            long j17 = this.Y;
            if (j17 <= 0) {
                j17 = 1073741824;
            }
            db5.e1.W(this, getString(com.tencent.mm.R.string.fhq, j33.d0.e(j17)));
        } else {
            db5.e1.i(this, com.tencent.mm.R.string.fjz, com.tencent.mm.R.string.f492188fk0);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "video is over size");
    }

    public final void e8(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, int i17) {
        int i18;
        e40.x xVar = (e40.x) i95.n0.c(e40.x.class);
        java.lang.String n17 = com.tencent.mm.vfs.w6.n(galleryItem$MediaItem.f138430e);
        long k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
        java.lang.String str = this.V;
        int A7 = A7(galleryItem$MediaItem);
        ((e35.e) xVar).getClass();
        if (i17 != 201 && i17 != 202) {
            switch (i17) {
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                    i18 = 3;
                    break;
                default:
                    i18 = 0;
                    break;
            }
        } else {
            i18 = 2;
        }
        e35.h.f247593a.a(n17, k17, 3, 2, str, i18, A7);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AlbumPreviewUI", new java.lang.Exception(), "finish", new java.lang.Object[0]);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            o23.b.f342411a.a(this.L);
        }
        getIntent().putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        getIntent().putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        dx1.g.f244489a.j("SnsPublishProcess", "selectionPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.jdw;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return getIntent().getBooleanExtra("album_support_landscape_mode", false) ? 4 : 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cid;
    }

    public final boolean h7() {
        int i17;
        return this.H || (t21.d3.s() && (((i17 = this.E1) == 3 || i17 == 16) && this.D));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int i17;
        java.lang.Class cls;
        int i18;
        int i19;
        java.lang.String str;
        android.widget.TextView textView;
        int i27;
        android.view.View findViewById;
        int i28;
        java.lang.String str2;
        pf5.z zVar = pf5.z.f353948a;
        i33.g gVar = (i33.g) zVar.a(this).a(i33.g.class);
        android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.f482848po);
        gVar.getClass();
        viewStub.setLayoutResource(com.tencent.mm.R.layout.bdi);
        viewStub.inflate();
        ((i33.c0) zVar.a(this).a(i33.c0.class)).W6();
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            java.util.Iterator<java.lang.String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                extras.get(it.next());
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "initView, oops! no extras data!");
        }
        this.f138548x0 = getIntent().getStringExtra("album_business_tag");
        this.f138551y0 = getIntent().getIntExtra("album_video_max_duration", 10);
        this.f138526l1 = getIntent().getIntExtra("album_video_min_duration", 0);
        this.U = getIntent().getStringExtra("GalleryUI_FromUser");
        this.V = getIntent().getStringExtra("GalleryUI_ToUser");
        this.Q = getIntent().getIntExtra("max_select_count", 9);
        this.C = this.E1 == 4;
        this.f138553z = getIntent().getStringExtra("folder_path");
        this.A = getIntent().getStringExtra("folder_name");
        this.f138510J = getIntent().getBooleanExtra("is_from_emoji_ALBUM", false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f138553z)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "folder path invalid, assign folderName: %s.", this.A);
            this.f138553z = this.A;
        }
        this.D = getIntent().getBooleanExtra("key_send_raw_image", false) || getIntent().getBooleanExtra("send_raw_img", false);
        this.E = getIntent().getBooleanExtra("key_force_hide_edit_image_button", false);
        this.F = getIntent().getBooleanExtra("key_force_hide_edit_image_button_after_album_take_image", false);
        this.G = getIntent().getBooleanExtra("key_force_show_raw_image_button", false);
        this.I = getIntent().getBooleanExtra("key_is_raw_image_button_disable", false);
        this.H = getIntent().getBooleanExtra("key_force_show_raw_iamge_size", false);
        this.N = getIntent().getBooleanExtra("key_can_select_video_and_pic", false);
        this.f138542s = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.kmg);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.km9);
        this.f138543t = textView2;
        textView2.setTextSize(0, i65.a.f(this, com.tencent.mm.R.dimen.f479897ia));
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.km8);
        this.f138544u = textView3;
        textView3.setTextSize(0, i65.a.f(this, com.tencent.mm.R.dimen.f479672c9));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f486214km5);
        this.f138545v = weImageView;
        weImageView.setEnableColorFilter(false);
        this.Z = ((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).Bi(this.V);
        this.f138543t.setOnClickListener(new e33.h1(this));
        if (this.H) {
            this.f138545v.setVisibility(8);
        } else {
            this.f138545v.setVisibility(0);
        }
        if (this.E1 == 3 || this.G || this.H) {
            this.f138542s.setVisibility(0);
        } else {
            this.f138542s.setVisibility(8);
        }
        if (this.D) {
            b8(true);
        } else {
            b8(false);
        }
        if (this.I) {
            this.f138545v.setImageResource(com.tencent.mm.R.raw.radio_default_on);
        }
        this.f138545v.setEnabled(!this.I);
        this.f138543t.setEnabled(!this.I);
        this.f138545v.setOnClickListener(new e33.i1(this));
        this.f138516f = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.jdw);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.jdx);
        this.f138532o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482917rq);
        this.f138534p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482918rr);
        this.f138538q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482886qt);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.je8);
        this.f138518g = textView4;
        textView4.setEnabled(false);
        this.f138518g.setTextSize(0, i65.a.f(this, com.tencent.mm.R.dimen.f479897ia));
        this.W1 = findViewById(com.tencent.mm.R.id.v39);
        this.X1 = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.v38);
        ((kc5.s) ((wg3.i) i95.n0.c(wg3.i.class))).Di(this.W1, new yz5.a() { // from class: e33.c0$$n
            @Override // yz5.a
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this.V1);
            }
        }, this.V, 1);
        this.W1.setBackgroundColor(getColor(com.tencent.mm.R.color.f479163rn));
        android.view.View view = this.W1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initSendAsMediaGroupingViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initSendAsMediaGroupingViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.W1.setOnClickListener(new e33.n0(this));
        this.X1.setChecked(this.V1);
        this.f138547x = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.f482858q0);
        this.f138550y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482859q1);
        this.f138546w = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f482891qz);
        this.f138546w.setOnClickListener(new e33.j1(this));
        this.f138550y.setOnClickListener(new e33.k1(this));
        this.f138547x.setOnClickListener(new e33.l1(this));
        if (this.K || (i28 = this.E1) == 0 || i28 == 5 || i28 == 10 || i28 == 24 || i28 == 27) {
            i17 = 3;
            cls = i33.k1.class;
            i18 = com.tencent.mm.R.id.f482847pn;
            i19 = 8;
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f482847pn);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.tencent.mm.ui.b4.c(this)) {
                this.f138516f.post(new e33.d0(this));
            }
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById2.getLayoutParams();
            layoutParams.bottomMargin = 0;
            findViewById2.setLayoutParams(layoutParams);
            if (getBounceView() != null) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) getBounceView().getView().getLayoutParams();
                layoutParams2.bottomMargin = 0;
                getBounceView().getView().setLayoutParams(layoutParams2);
            }
            pf5.z zVar2 = pf5.z.f353948a;
            i33.c0 c0Var = (i33.c0) zVar2.a(this).a(i33.c0.class);
            c0Var.f288170h = 0;
            android.view.View view2 = c0Var.f288169g;
            if (view2 != null) {
                android.view.ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.bottomMargin = 0;
                view2.setLayoutParams(marginLayoutParams);
            }
            androidx.appcompat.app.AppCompatActivity context = getContext();
            str = com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME;
            kotlin.jvm.internal.o.g(context, str);
            i33.k1 k1Var = (i33.k1) zVar2.a(context).e(cls);
            if (k1Var != null) {
                k1Var.f288214n = 0;
            }
        } else {
            if (this.G1) {
                this.f138518g.setVisibility(8);
            } else {
                this.f138518g.setVisibility(0);
            }
            this.f138518g.setOnClickListener(new e33.e1(this));
            int i29 = this.F1;
            if ((i29 == 1 || i29 == 2 || i29 == 3) && this.Q >= 1) {
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.B);
                yz5.a aVar = this.f138513c2;
                if (K0) {
                    int i37 = this.E1;
                    int i38 = this.Q;
                    java.lang.String str3 = this.f138548x0;
                    boolean z17 = this.H1;
                    e33.b0 b0Var = this.f138528m;
                    java.util.ArrayList arrayList3 = b0Var == null ? null : b0Var.f247131g;
                    str2 = com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME;
                    cls = i33.k1.class;
                    i18 = com.tencent.mm.R.id.f482847pn;
                    i17 = 3;
                    i19 = 8;
                    java.lang.String i39 = j33.d0.i(this, i37, 0, i38, str3, z17, arrayList3, true, false);
                    kotlin.jvm.internal.o.f(i39, "getSendOptionMenuText(...)");
                    int i47 = this.E1;
                    if (i47 != 15) {
                        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.ORANGE;
                        if (i47 == 25) {
                            gVar.q6(i39, aVar, fbVar);
                        } else if (i47 == 28) {
                            gVar.q6(i39, aVar, com.tencent.mm.ui.fb.FINDER_LIVE);
                        } else if (i47 != 37) {
                            gVar.q6(i39, aVar, com.tencent.mm.ui.fb.DARK_GREEN_MODE);
                        } else {
                            gVar.q6(i39, aVar, fbVar);
                        }
                    } else {
                        gVar.q6(i39, aVar, com.tencent.mm.ui.fb.YELLOW);
                    }
                    str = str2;
                } else {
                    gVar.q6(this.B, aVar, com.tencent.mm.ui.fb.NORMAL);
                }
            }
            str2 = com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME;
            i17 = 3;
            cls = i33.k1.class;
            i18 = com.tencent.mm.R.id.f482847pn;
            i19 = 8;
            str = str2;
        }
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = (com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView) findViewById(com.tencent.mm.R.id.h9a);
        this.f138540r = imageFolderMgrView;
        imageFolderMgrView.setupEnableCheckMediaCount(java.lang.Boolean.valueOf(!this.O1));
        this.f138540r.setListener(new e33.e0(this));
        this.f138540r.setOnFolderStateChanged(new e33.f0(this));
        this.B = getIntent().getStringExtra("send_btn_string");
        java.lang.String stringExtra = gVar.getActivity().getIntent().getStringExtra("album_footer_info_str");
        if (stringExtra == null) {
            stringExtra = "";
        }
        boolean booleanExtra = gVar.getActivity().getIntent().getBooleanExtra("is_hide_album_footer", false);
        com.tencent.mars.xlog.Log.i(gVar.f288188f, "checkBottomLayoutByIntentData: " + gVar.f288189g);
        if (gVar.f288189g && (booleanExtra || !android.text.TextUtils.isEmpty(stringExtra))) {
            android.view.View findViewById4 = gVar.findViewById(com.tencent.mm.R.id.je8);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumConfirmButtonUIC", "checkBottomLayoutByIntentData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/gallery/ui/uic/AlbumConfirmButtonUIC", "checkBottomLayoutByIntentData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!android.text.TextUtils.isEmpty(stringExtra) && (findViewById = gVar.findViewById(com.tencent.mm.R.id.f482850pq)) != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/gallery/ui/uic/AlbumConfirmButtonUIC", "checkBottomLayoutByIntentData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/gallery/ui/uic/AlbumConfirmButtonUIC", "checkBottomLayoutByIntentData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup.LayoutParams layoutParams4 = findViewById.getLayoutParams();
                layoutParams4.width = -2;
                findViewById.setLayoutParams(layoutParams4);
                ((android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.f482849pp)).setText(stringExtra);
            }
        }
        gVar.k6(false);
        e33.o0 o0Var = new e33.o0(this, getContext(), 4, containUIC(i33.h.class) ? com.tencent.mm.ui.bh.a(this).f197136b / 2 : 0);
        o0Var.B = new e33.q0(this);
        this.f138516f.setLayoutManager(o0Var);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        android.content.res.Resources resources = context2.getResources();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.a1z);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.a1z);
        int color = b3.l.getColor(context2, com.tencent.mm.R.color.f479163rn);
        java.util.ArrayList arrayList7 = new java.util.ArrayList(java.util.Arrays.asList(2, java.lang.Integer.valueOf(i17)));
        arrayList6.clear();
        arrayList6.addAll(arrayList7);
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.g(context3, str);
        pf5.z zVar3 = pf5.z.f353948a;
        i33.k1 k1Var2 = (i33.k1) zVar3.a(context3).e(cls);
        int i48 = k1Var2 != null ? k1Var2.f288213m : 0;
        androidx.appcompat.app.AppCompatActivity context4 = getContext();
        kotlin.jvm.internal.o.g(context4, str);
        i33.k1 k1Var3 = (i33.k1) zVar3.a(context4).e(cls);
        this.f138516f.N(new e33.h2(dimensionPixelSize, dimensionPixelSize2, color, false, arrayList6, i48, k1Var3 != null ? k1Var3.f288214n : 0, null));
        this.f138516f.i(new e33.i0(this, o0Var));
        e33.b0 o76 = o7(this.N1, new e33.j0(this));
        this.f138528m = o76;
        o76.f247138q = this.V;
        o76.L = this.f138529m2;
        if (this.f138510J) {
            fullScreenNoTitleBar(true, 0L);
            androidx.appcompat.app.AppCompatActivity context5 = getContext();
            kotlin.jvm.internal.o.g(context5, str);
            i33.k1 k1Var4 = (i33.k1) zVar3.a(context5).e(cls);
            if (k1Var4 != null) {
                k1Var4.f288213m = 0;
            }
        }
        androidx.appcompat.app.AppCompatActivity context6 = getContext();
        kotlin.jvm.internal.o.g(context6, str);
        i33.k1 k1Var5 = (i33.k1) zVar3.a(context6).e(cls);
        if (k1Var5 != null) {
            e33.b0 b0Var2 = this.f138528m;
            int i49 = k1Var5.f288213m;
            for (int i57 = 0; i57 < i49; i57++) {
                if (b0Var2 != null) {
                    b0Var2.y(new e33.t(2));
                }
            }
            int i58 = k1Var5.f288214n;
            int i59 = 0;
            while (i59 < i58) {
                if (b0Var2 != null) {
                    i27 = i17;
                    e33.s sVar = new e33.s(i27);
                    java.util.LinkedList linkedList = b0Var2.f247140s;
                    linkedList.remove(sVar);
                    linkedList.add(sVar);
                } else {
                    i27 = i17;
                }
                i59++;
                i17 = i27;
            }
            if (k1Var5.f288213m > 0) {
                int X6 = k1Var5.X6();
                android.view.View findViewById5 = k1Var5.findViewById(com.tencent.mm.R.id.h9a);
                findViewById5.setPadding(findViewById5.getPaddingLeft(), X6, findViewById5.getPaddingRight(), findViewById5.getPaddingBottom());
                android.view.View findViewById6 = k1Var5.findViewById(com.tencent.mm.R.id.f482918rr);
                android.view.ViewGroup.LayoutParams layoutParams5 = findViewById6.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams6 = (android.widget.FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.setMargins(layoutParams6.leftMargin, X6, layoutParams6.rightMargin, layoutParams6.bottomMargin);
                findViewById6.setLayoutParams(layoutParams6);
                android.view.View findViewById7 = k1Var5.findViewById(com.tencent.mm.R.id.f482886qt);
                android.view.ViewGroup.LayoutParams layoutParams7 = findViewById7.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams8 = (android.widget.FrameLayout.LayoutParams) layoutParams7;
                layoutParams8.setMargins(layoutParams8.leftMargin, X6, layoutParams8.rightMargin, layoutParams8.bottomMargin);
                findViewById7.setLayoutParams(layoutParams8);
                k1Var5.findViewById(i18).setClickable(true);
                androidx.appcompat.app.AppCompatActivity activity = k1Var5.getActivity();
                kotlin.jvm.internal.o.g(activity, str);
                pf5.z zVar4 = pf5.z.f353948a;
                i33.e1 e1Var = (i33.e1) zVar4.a(activity).a(i33.e1.class);
                e1Var.getClass();
                com.tencent.mars.xlog.Log.i(e1Var.f288180f, "setTimeHeaderTextViewHeight: " + X6);
                java.lang.Object value = ((jz5.n) e1Var.f288183i).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((android.widget.TextView) value).setHeight(X6);
                androidx.appcompat.app.AppCompatActivity activity2 = k1Var5.getActivity();
                kotlin.jvm.internal.o.g(activity2, str);
                i33.t0 t0Var = (i33.t0) zVar4.a(activity2).a(i33.t0.class);
                android.view.ViewGroup.LayoutParams layoutParams9 = t0Var.a7().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams9, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams10 = (android.widget.FrameLayout.LayoutParams) layoutParams9;
                layoutParams10.topMargin = X6;
                t0Var.a7().setLayoutParams(layoutParams10);
            }
            if (k1Var5.f288214n > 0) {
                java.lang.String str4 = k1Var5.f288209f;
                com.tencent.mars.xlog.Log.i(str4, "cancelGalleryMarginBottom: ");
                androidx.recyclerview.widget.RecyclerView T6 = k1Var5.T6();
                android.view.ViewGroup.LayoutParams layoutParams11 = T6.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams11, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams12 = (android.widget.FrameLayout.LayoutParams) layoutParams11;
                layoutParams12.setMargins(layoutParams12.leftMargin, layoutParams12.topMargin, layoutParams12.rightMargin, 0);
                T6.setLayoutParams(layoutParams12);
                T6.setPadding(T6.getPaddingLeft(), 0, T6.getPaddingRight(), 0);
                com.tencent.mars.xlog.Log.i(str4, "cancelBounceViewMarginBottom: ");
                androidx.appcompat.app.AppCompatActivity activity3 = k1Var5.getActivity();
                com.tencent.mm.ui.MMActivity mMActivity = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
                if (mMActivity != null && mMActivity.getBounceView() != null) {
                    ul5.k bounceView = mMActivity.getBounceView();
                    kotlin.jvm.internal.o.d(bounceView);
                    android.view.ViewGroup.LayoutParams layoutParams13 = bounceView.getView().getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams13, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    android.widget.FrameLayout.LayoutParams layoutParams14 = (android.widget.FrameLayout.LayoutParams) layoutParams13;
                    layoutParams14.bottomMargin = 0;
                    ul5.k bounceView2 = mMActivity.getBounceView();
                    kotlin.jvm.internal.o.d(bounceView2);
                    bounceView2.getView().setLayoutParams(layoutParams14);
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f138548x0)) {
            java.lang.String str5 = this.f138548x0;
            e33.b0 b0Var3 = this.f138528m;
            b0Var3.f247135n = str5;
            b0Var3.f247136o = this.f138551y0;
            if (str5.equals("album_business_bubble_media_by_coordinate")) {
                this.f138528m.f247141t = false;
                t23.f fVar = (t23.f) t23.p0.k().f415296e;
                fVar.f415143f = true;
                fVar.f415141d = 1000;
                this.f138536p1 = getIntent().getStringExtra("album_business_bubble_media_by_coordinate_posname");
                double doubleExtra = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_distance", -1.0d);
                this.f138554z1 = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_longitude", 181.0d);
                this.f138552y1 = getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d);
                if (doubleExtra >= 0.0d && i11.b.b(this.f138554z1) && i11.b.a(this.f138552y1)) {
                    this.f138549x1 = new e33.k0(this, doubleExtra);
                    t23.x1 k17 = t23.p0.k();
                    t23.l1 l1Var = this.f138549x1;
                    if (l1Var != null) {
                        k17.f415295d.add(l1Var);
                    } else {
                        k17.getClass();
                    }
                }
            }
        }
        if (this.N) {
            this.f138528m.f247141t = true;
        }
        this.f138528m.f247142u = getIntent().getBooleanExtra("key_sns_publish_template", false);
        this.f138515e2 = new e33.n(0);
        if (getIntent().getBooleanExtra("show_header_view", true)) {
            this.f138528m.y(this.f138515e2);
        }
        if (((i33.c0) pf5.z.f353948a.a(this).a(i33.c0.class)).X6(this.F1)) {
            e33.v vVar = new e33.v(4);
            java.util.Iterator it6 = this.f138528m.f247139r.iterator();
            while (it6.hasNext()) {
                if (((e33.q) it6.next()).f247437a == 4) {
                    it6.remove();
                }
            }
            this.f138528m.y(vVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "initView: add selectSystemMediaHeader");
        }
        e33.b0 b0Var4 = this.f138528m;
        b0Var4.f247134m = this.F1;
        b0Var4.f247128d = this.Q;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "limit count = " + this.Q);
        this.f138516f.setAdapter(this.f138528m);
        if (this.B1) {
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
            setMMTitle(getIntent().getStringExtra("title_from_smart_gallery"));
        } else {
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
            initActionBarOperationArea();
            int i66 = this.F1;
            if (i66 == 3) {
                initActionBarOperationAreaTxt(getString(com.tencent.mm.R.string.fia));
            } else if (i66 == 1) {
                initActionBarOperationAreaTxt(getString(com.tencent.mm.R.string.fi_));
            } else {
                initActionBarOperationAreaTxt(getString(com.tencent.mm.R.string.fib));
            }
        }
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        setActionBarOperationAreaClickListener(new e33.x0(this));
        this.f138540r.setFolderAlbumDialogDismiss(new e33.y0(this));
        setBackBtn(new e33.l0(this), this.B1 ? com.tencent.mm.R.drawable.f480725b5 : com.tencent.mm.R.raw.actionbar_icon_close_black);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.m7g);
        if (viewGroup instanceof com.tencent.mm.ui.base.DrawedCallBackFrameLayout) {
            ((com.tencent.mm.ui.base.DrawedCallBackFrameLayout) viewGroup).setListener(new e33.m0(this));
        }
        r45.ib6 ib6Var = null;
        e33.x1 x1Var = new e33.x1(null);
        this.Z1 = x1Var;
        x1Var.f247535d = new java.lang.ref.WeakReference(this.f138528m);
        this.Z1.f247536e = new java.lang.ref.WeakReference(this.f138530n);
        this.Z1.f247537f = new java.lang.ref.WeakReference(this.f138540r);
        e33.x1 x1Var2 = this.Z1;
        x1Var2.f247538g = this.I1;
        x1Var2.f247540i = this.F1;
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482821ou);
        if (com.tencent.mm.ui.f.a()) {
            com.tencent.mm.ui.f.b(textView5, com.tencent.mm.R.dimen.f479575r);
        } else if (textView5 != null && i65.a.D(getContext())) {
            textView5.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        }
        if (this.C) {
            if (this.P1) {
                s23.n nVar = s23.n.f402309d;
                s23.n.f402323u = getIntent().getBooleanExtra("key_sns_publish_template", false);
                s23.n.f402326x = new java.lang.ref.WeakReference(this);
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("album_template_info");
                if (byteArrayExtra != null) {
                    ib6Var = new r45.ib6();
                    try {
                        ib6Var.parseFrom(byteArrayExtra);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                s23.n.f402313h = ib6Var;
                s23.n.f402309d.a(this.Y1);
                this.f138528m.f247144w = this.P1;
                androidx.appcompat.app.AppCompatActivity context7 = getContext();
                kotlin.jvm.internal.o.g(context7, str);
                i33.k1 k1Var6 = (i33.k1) pf5.z.f353948a.a(context7).a(cls);
                s23.j jVar = new s23.j();
                k1Var6.getClass();
                ((java.util.ArrayList) k1Var6.f288211h).add(jVar);
            } else {
                r23.j jVar2 = r23.j.f368827a;
                dx1.f fVar2 = dx1.g.f244489a;
                java.lang.String d17 = kotlin.jvm.internal.i0.a(com.tencent.mm.autogen.mmdata.rpt.SnsTemplateReportStruct.class).d();
                kotlin.jvm.internal.o.d(d17);
                fVar2.g("SnsTemplate", d17);
                r23.j.f368836j = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "[" + jVar2.hashCode() + " init ui]");
                jVar2.a(this);
            }
        }
        int i67 = this.E1;
        if ((i67 == 46 || i67 == 11) && (textView = this.f138518g) != null) {
            textView.setVisibility(i19);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean isActionbarCenterLayoutMode() {
        return false;
    }

    public final boolean j7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        int i17;
        int i18;
        float floatExtra = getIntent().getFloatExtra("album_min_ratio_limit", -1.0f);
        float floatExtra2 = getIntent().getFloatExtra("album_max_ratio_limit", -1.0f);
        if (floatExtra < 0.0f && floatExtra2 < 0.0f) {
            return true;
        }
        if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.tencent.mm.graphics.e.d(galleryItem$MediaItem.f138430e, options);
            i17 = options.outWidth;
            i18 = options.outHeight;
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (i17 == 0 || i18 == 0) {
            return false;
        }
        float f17 = i17 / i18;
        return (floatExtra < 0.0f || f17 >= floatExtra) && (floatExtra2 < 0.0f || f17 <= floatExtra2);
    }

    public boolean k7() {
        return true;
    }

    public final boolean l7(android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
        if (stringArrayListExtra != null && stringArrayListExtra.size() > 0 && this.f138531n2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.f138531n2);
            java.util.ArrayList arrayList2 = this.f138528m.f247131g;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            int indexOf = this.f138528m.f247130f.indexOf(this.f138531n2);
            if (indexOf != -1) {
                x.d dVar = new x.d(0);
                dVar.add(java.lang.Integer.valueOf(indexOf));
                this.f138528m.M(dVar);
                c8(this.f138528m.J());
                N7();
                return true;
            }
        }
        return false;
    }

    public boolean m7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        if (galleryItem$MediaItem == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "[checkSelectedVideo] item is null!");
            return false;
        }
        int i17 = this.E1;
        if (i17 != 3) {
            if (i17 != 49) {
                return true;
            }
            long longExtra = getIntent().getLongExtra("key_wedrop_select_size_limit", 0L);
            if (longExtra <= 0 || com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e) <= longExtra) {
                return true;
            }
            W7(getString(com.tencent.mm.R.string.fhp, j33.d0.e(longExtra)));
            return false;
        }
        if (!this.D) {
            return true;
        }
        long k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
        long z76 = z7(galleryItem$MediaItem);
        if (z76 >= k17) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "[checkRawImageItem] item:%s file size:%s", galleryItem$MediaItem, java.lang.Long.valueOf(k17));
        if (t21.d3.s()) {
            W7(getString(com.tencent.mm.R.string.fhp, j33.d0.e(z76)));
        } else {
            db5.e1.W(this, getString(com.tencent.mm.R.string.fjq));
        }
        com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct videoAlbumErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct();
        videoAlbumErrorReportStruct.p(this.V);
        videoAlbumErrorReportStruct.f61549e = 3L;
        videoAlbumErrorReportStruct.f61550f = k17;
        videoAlbumErrorReportStruct.k();
        return false;
    }

    public boolean n7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        if (galleryItem$MediaItem == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumPreviewUI", "[checkSelectedVideo] item is null!");
            return false;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(galleryItem$MediaItem.f138430e);
        if (!r6Var.m()) {
            W7(getString(com.tencent.mm.R.string.fjr));
            return false;
        }
        if (this.E1 == 3) {
            if (this.Y <= 0) {
                this.Y = j33.d0.h();
            }
            if (this.Y <= 0) {
                this.Y = 26214400L;
            }
            if (this.S1 && (r6Var.C() > this.Y || E7(galleryItem$MediaItem, this.E1).booleanValue())) {
                long z76 = z7(galleryItem$MediaItem);
                if (r6Var.C() <= z76) {
                    return true;
                }
                W7(getString(com.tencent.mm.R.string.fhr, j33.d0.e(z76)));
                return false;
            }
            int c17 = j33.e.f297434a.c(this.E1, galleryItem$MediaItem);
            if (c17 != 0) {
                if (c17 == 202) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "select video duration too long");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(106L, 50L, 1L, false);
                }
                if (r7()) {
                    j33.j.f297441a.a(this, c17, this.E1);
                }
                e8(galleryItem$MediaItem, c17);
                return false;
            }
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_enable_hdr_lut, 1) == 1 && this.E1 == 4 && !F7();
        if (getIntent().getBooleanExtra("key_filter_hdr_video", false) && !z17 && !j33.p.f297451a.b(galleryItem$MediaItem.f138430e)) {
            db5.e1.W(this, getString(com.tencent.mm.R.string.fjs));
            return false;
        }
        int i17 = this.E1;
        ip.a aVar = ip.a.f293544a;
        if (i17 == 3) {
            int A7 = A7(galleryItem$MediaItem);
            int a17 = aVar.a();
            if (A7 > a17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "select video duration too long");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(106L, 50L, 1L, false);
                if (t21.d3.s()) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    java.lang.String[] strArr = j33.d0.f297428a;
                    objArr[0] = a17 > 3600 ? java.lang.String.format("%d小时", java.lang.Integer.valueOf((a17 / 60) / 60)) : a17 > 60 ? java.lang.String.format("%d分钟", java.lang.Integer.valueOf(a17 / 60)) : a17 > 0 ? java.lang.String.format("%d秒", java.lang.Integer.valueOf(a17)) : "";
                    W7(getString(com.tencent.mm.R.string.fhr, objArr));
                    e8(galleryItem$MediaItem, 202);
                } else {
                    db5.e1.W(this, getString(com.tencent.mm.R.string.fjv));
                }
                com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct videoAlbumErrorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct();
                videoAlbumErrorReportStruct.f61549e = 2L;
                videoAlbumErrorReportStruct.p(this.V);
                videoAlbumErrorReportStruct.f61550f = A7;
                videoAlbumErrorReportStruct.k();
                return false;
            }
            long k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
            if (k17 > this.Y && t21.d3.s() && this.D) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "select video file length to large");
                W7(getString(com.tencent.mm.R.string.fhq, j33.d0.e(this.Y)));
                com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct videoAlbumErrorReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.VideoAlbumErrorReportStruct();
                videoAlbumErrorReportStruct2.f61549e = 1L;
                videoAlbumErrorReportStruct2.p(this.V);
                videoAlbumErrorReportStruct2.f61550f = k17;
                videoAlbumErrorReportStruct2.k();
                return false;
            }
        } else if (i17 == 4) {
            if (j33.d0.a(galleryItem$MediaItem.f138430e) > aVar.b() / 1000) {
                db5.e1.W(this, getString(com.tencent.mm.R.string.fjv));
                return false;
            }
        } else if (i17 == 14 || i17 == 22) {
            if (j33.d0.a(galleryItem$MediaItem.f138430e) > 300) {
                db5.e1.W(this, getString(com.tencent.mm.R.string.fjv));
                return false;
            }
        } else if (i17 == 49) {
            long longExtra = getIntent().getLongExtra("key_wedrop_select_size_limit", 0L);
            if (longExtra > 0 && com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e) > longExtra) {
                W7(getString(com.tencent.mm.R.string.fhq, j33.d0.e(longExtra)));
                return false;
            }
        }
        int intExtra = getIntent().getIntExtra("key_max_video_duration", 0);
        int intExtra2 = getIntent().getIntExtra("key_min_video_duration", 0);
        if (intExtra > 0 || intExtra2 > 0) {
            int a18 = j33.d0.a(galleryItem$MediaItem.f138430e);
            if (intExtra > 0 && a18 > intExtra) {
                db5.e1.W(this, getString(com.tencent.mm.R.string.fjv));
                return false;
            }
            if (intExtra2 > 0 && a18 < intExtra2) {
                db5.e1.W(this, getString(com.tencent.mm.R.string.m1o));
                return false;
            }
        }
        return true;
    }

    public e33.b0 o7(boolean z17, e33.i2 i2Var) {
        return new e33.b0(z17, getContext(), i2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:397:0x0919, code lost:
    
        if (r8 < r2) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0921, code lost:
    
        if (r8 > r4) goto L377;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0943  */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v97, types: [int, boolean] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r30, int r31, android.content.Intent r32) {
        /*
            Method dump skipped, instructions count: 2549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        J7();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionDenied(java.lang.String str) {
        if (d85.g0.CAMERA.f227192d == str) {
            this.P = false;
        } else if (d85.g0.STORAGE.f227192d == str) {
            U7(java.lang.Boolean.FALSE);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onBusinessPermissionGranted(java.lang.String str) {
        if (d85.g0.CAMERA.f227192d == str) {
            Y7();
        } else if (d85.g0.STORAGE.f227192d == str) {
            P7();
            C7();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onCreate, %s.", this);
        java.lang.String stringExtra = getIntent().getStringExtra("album_business_by_real_scene");
        if (stringExtra != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "business scene:%s", stringExtra);
            d85.f0 Ai = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ai(stringExtra);
            this.L1 = Ai;
            if (Ai != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "business scene:%s", Ai.f227176d);
                ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).oj(this.L1);
            }
        }
        setRequestedOrientation(1);
        if (bundle != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "savedInstanceState not null");
            this.E1 = bundle.getInt("constants_key_query_source");
            this.F1 = bundle.getInt("constants_key_query_type");
        } else {
            this.E1 = getIntent().getIntExtra("query_source_type", 3);
            this.F1 = getIntent().getIntExtra("query_media_type", 1);
        }
        t23.p0.k().f415297f = this.E1;
        t23.p0.k().g(this.F1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "query source: " + this.E1 + ", queryType: " + this.F1);
        if (this.E1 == 3) {
            overridePendingTransition(com.tencent.mm.R.anim.f477857df, 0);
        }
        this.X = java.lang.System.currentTimeMillis();
        f138508s2 = java.lang.System.currentTimeMillis();
        this.f138530n = com.tencent.mm.ui.widget.dialog.u3.c(this, getString(com.tencent.mm.R.string.f490604zq), false, 0, null);
        this.f138523i2 = e33.o1.CREATE;
        this.J1 = getIntent().getIntExtra("select_type_tag", 3);
        this.A1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true);
        this.M1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_template_video_edit_enable, true);
        this.N1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_gallery_image_edit_icon_hide, false);
        this.Q1 = getIntent().getBooleanExtra("Gallery_LivePhoto_Need_Query", false);
        this.T1 = getIntent().getBooleanExtra("Gallery_LivePhoto_Auto_Enable", true);
        this.R1 = getIntent().getBooleanExtra("Gallery_LivePhoto_Only", false);
        this.B1 = getIntent().getBooleanExtra("is_from_smart_gallery", false);
        this.G1 = getIntent().getBooleanExtra("key_force_preview_on_confirm", false);
        this.K = getIntent().getBooleanExtra("is_hide_album_preview_footer", false);
        this.L = getIntent().getStringExtra("album_query_session_id");
        java.lang.Object a17 = ok5.d.a(getIntent(), "key_quote_extcommon");
        if (a17 instanceof r15.b) {
            this.M = (r15.b) a17;
        } else {
            this.M = null;
        }
        this.S1 = this.E1 == 3 && ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi() && getIntent().getBooleanExtra("key_enable_send_as_file", true);
        this.C1 = getIntent().getBooleanExtra("album_is_from_text_status", false);
        this.D1 = getIntent().getStringExtra("edt_video_layout_from_text_status");
        s23.n nVar = s23.n.f402309d;
        this.P1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_mj_template_handle_refactor_update, true);
        m3.a aVar = new m3.a() { // from class: e33.c0$$o
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                i33.l1 l1Var = (i33.l1) obj;
                int i17 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
                final com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this;
                albumPreviewUI.getClass();
                yz5.a aVar2 = new yz5.a() { // from class: e33.c0$$e
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this.f138528m;
                    }
                };
                java.util.Comparator comparator = (java.util.Comparator) ((jz5.n) u23.e0.f424054n).getValue();
                java.lang.String str = (java.lang.String) ((jz5.n) u23.e0.f424055o).getValue();
                kotlin.jvm.internal.o.f(str, "access$getDEFAULT_ALL_MEDIA_FOLDER_NAME(...)");
                java.lang.String str2 = (java.lang.String) ((jz5.n) u23.e0.f424056p).getValue();
                kotlin.jvm.internal.o.f(str2, "access$getDEFAULT_ALL_IMAGE_FOLDER_NAME(...)");
                java.lang.String str3 = (java.lang.String) ((jz5.n) u23.e0.f424057q).getValue();
                kotlin.jvm.internal.o.f(str3, "access$getDEFAULT_ALL_VIDEO_FOLDER_NAME(...)");
                java.lang.String str4 = (java.lang.String) ((jz5.n) u23.e0.f424058r).getValue();
                kotlin.jvm.internal.o.f(str4, "access$getDEFAULT_FAVORITE_FOLDER_NAME(...)");
                u23.w wVar = (u23.w) ((jz5.n) u23.e0.f424059s).getValue();
                u23.c0 c0Var = new u23.c0();
                int i18 = albumPreviewUI.F1;
                boolean z17 = albumPreviewUI.Q1;
                boolean z18 = albumPreviewUI.T1;
                boolean z19 = albumPreviewUI.R1;
                i33.l1 t76 = albumPreviewUI.t7();
                u23.e0 e0Var = new u23.e0(i18, i18 != 3 ? -1 : 2, true, false, false, 10240L, comparator, str, str2, str3, str4, wVar, c0Var, t76 == null ? false : ((i33.a0) t76).getIntent().getBooleanExtra("is_only_show_media_with_location", false), z17, z18, z19, null);
                yz5.a aVar3 = new yz5.a() { // from class: e33.c0$$f
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this.f138540r;
                    }
                };
                yz5.p pVar = new yz5.p() { // from class: e33.c0$$g
                    @Override // yz5.p
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI2 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.this;
                        java.util.Collection collection = (java.util.Collection) obj2;
                        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
                        if (!albumPreviewUI2.K1) {
                            boolean B7 = albumPreviewUI2.B7();
                            albumPreviewUI2.K1 = B7;
                            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "doNotifyMediaItemsChangedJob: checkMediaStorage=%s", java.lang.Boolean.valueOf(B7));
                            if (albumPreviewUI2.K1) {
                                albumPreviewUI2.C7();
                            }
                        }
                        i33.c0 c0Var2 = (i33.c0) pf5.z.f353948a.a(albumPreviewUI2).a(i33.c0.class);
                        int i19 = albumPreviewUI2.F1;
                        e33.b0 b0Var = albumPreviewUI2.f138528m;
                        if (b0Var != null) {
                            c0Var2.getClass();
                            java.util.Iterator it = b0Var.f247139r.iterator();
                            while (it.hasNext()) {
                                if (((e33.q) it.next()).f247437a == 4) {
                                    it.remove();
                                }
                            }
                        }
                        if (c0Var2.X6(i19)) {
                            e33.v vVar = new e33.v(4);
                            if (b0Var != null) {
                                b0Var.y(vVar);
                            }
                            com.tencent.mars.xlog.Log.i(c0Var2.f288168f, "checkAdapterPermissionHeader add");
                        }
                        e33.s1 s1Var = new e33.s1(null);
                        s1Var.f247454d = new java.lang.ref.WeakReference(albumPreviewUI2.f138528m);
                        s1Var.f247455e = new java.lang.ref.WeakReference(albumPreviewUI2.f138530n);
                        s1Var.f247456f = new java.lang.ref.WeakReference(albumPreviewUI2.f138534p);
                        s1Var.f247457g = new java.lang.ref.WeakReference(albumPreviewUI2.f138516f);
                        s1Var.f247458h = new java.util.LinkedList(collection);
                        s1Var.f247459i = albumPreviewUI2.f138536p1;
                        s1Var.f247461n = booleanValue;
                        if (e33.o1.CREATE == albumPreviewUI2.f138523i2) {
                            albumPreviewUI2.f138523i2 = e33.o1.SKIP;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "doNotifyMediaItemsChangedJob %s %s", albumPreviewUI2.A, java.lang.Integer.valueOf(collection.size()));
                        s1Var.run();
                        return java.lang.Boolean.TRUE;
                    }
                };
                i33.a0 a0Var = (i33.a0) l1Var;
                a0Var.getClass();
                a0Var.f288146h = i18;
                com.tencent.mars.xlog.Log.i(a0Var.f288144f, "setup: queryType=" + a0Var.f288146h);
                a0Var.f288145g = aVar2;
                a0Var.f288152q = e0Var;
                a0Var.f288147i = aVar3;
                a0Var.f288148m = pVar;
            }
        };
        i33.l1 t76 = t7();
        if (t76 != null) {
            aVar.accept(t76);
        }
        initView();
        if (k7()) {
            q7();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onCreate checkMediaStorage[%b]", java.lang.Boolean.valueOf(this.K1));
        boolean V7 = V7();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "doAfterCheckMediaPermissionOnCreate, isFromSmartGallery: %s showSmartGallery: %s.", java.lang.Boolean.valueOf(this.B1), java.lang.Boolean.valueOf(V7));
        if (!this.B1) {
            if (V7) {
                addTextOptionMenu(1, null, this.f138512b2, null, com.tencent.mm.ui.fb.SMART_GALLERY_SEARCH_ENTRY);
                if (this.K1) {
                    Q7();
                }
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
        }
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = this.f138540r;
        if (imageFolderMgrView != null && !this.O1) {
            boolean z17 = this.K1;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageFolderMgrView", "attach, %s.", imageFolderMgrView);
            t23.p0.k().f415292a.remove(imageFolderMgrView);
            t23.p0.k().f415292a.add(imageFolderMgrView);
            t23.p0.k().f415293b.remove(imageFolderMgrView.f138567o);
            t23.p0.k().f415293b.add(imageFolderMgrView.f138567o);
            if (z17) {
                t23.p0.k().d();
            }
        }
        i33.b1 b1Var = (i33.b1) pf5.z.f353948a.a(this).a(i33.b1.class);
        androidx.recyclerview.widget.f2 adapter = b1Var.T6().getAdapter();
        e33.b0 b0Var = adapter instanceof e33.b0 ? (e33.b0) adapter : null;
        if (b0Var != null) {
            b0Var.C = new i33.a1(b1Var);
        }
        if (this.K1) {
            P7();
        } else {
            this.f138516f.setVisibility(8);
        }
        t23.p0.o();
        o23.n nVar2 = o23.m.f342426a;
        nVar2.f342442p = this.L;
        nVar2.f342443q = c01.id.c();
        dx1.g.f244489a.j("SnsPublishProcess", "actionTrace_", 7, bx1.u.f36311f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        u23.n nVar;
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onDestroy");
        super.onDestroy();
        int i18 = 0;
        if (this.C) {
            if (this.P1) {
                s23.n.f402309d.j(this.Y1, !this.B1);
            } else {
                r23.j jVar = r23.j.f368827a;
                boolean z17 = !this.B1;
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "unbind release maas: " + z17);
                r23.j.f368830d = null;
                if (!r23.j.f368836j) {
                    r23.c cVar = r23.j.f368828b;
                    if ((cVar != null && cVar.a()) != false) {
                        jVar.c();
                    }
                }
                r23.c cVar2 = r23.j.f368828b;
                if (cVar2 != null) {
                    cVar2.f368810d = null;
                }
                r23.j.f368828b = null;
                if (z17) {
                    ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
                    az0.i5.x(az0.i5.f15557a, false, false, 3, null);
                }
                r23.j.f368831e = null;
                r23.j.f368832f = null;
            }
        }
        if (this.C || this.E1 == 3) {
            t23.p0.c();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onDestroy, %s.", this);
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        bz0.j.f36750a.c(3);
        if (t23.p0.k() != null) {
            t23.p0.k().f(this);
            t23.x1 k17 = t23.p0.k();
            t23.l1 l1Var = this.f138549x1;
            if (l1Var != null) {
                k17.f415295d.remove(l1Var);
            } else {
                k17.getClass();
            }
        }
        if (this.S > 0 || this.T > 0) {
            j33.d0.o(11187, this.S + "," + this.T);
        }
        int i19 = 7;
        if (this.W > 0 || this.f138522i) {
            java.lang.String str = this.B;
            java.util.ArrayList arrayList = this.f138528m.f247131g;
            int[] iArr = new int[4];
            iArr[0] = arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                if (galleryItem$MediaItem != null) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem.f138438p) && galleryItem$MediaItem.f138438p.equalsIgnoreCase("image/gif")) {
                        iArr[2] = iArr[2] + 1;
                    } else if (galleryItem$MediaItem.getType() == 2) {
                        iArr[3] = iArr[3] + 1;
                    } else if (galleryItem$MediaItem.getType() == 1) {
                        iArr[1] = iArr[1] + 1;
                    }
                }
            }
            boolean z18 = this.D;
            boolean z19 = this.f138520h;
            int i27 = t23.p0.k().f415297f;
            int i28 = i27 != 3 ? i27 != 4 ? (i27 == 7 || i27 == 8 || i27 == 15) ? 3 : 0 : (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c__))) ? 2 : 6 : 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[handleSelectImagePreviewReport] source:%s", java.lang.Integer.valueOf(i27));
            j33.d0.o(14205, i28 + "," + i28 + "," + iArr[0] + "," + iArr[1] + "," + iArr[2] + "," + iArr[3] + "," + z18 + "," + z19 + "," + t23.p0.f415222n + "," + t23.p0.f415223o + "," + t23.p0.f415224p + "," + t23.p0.f415225q);
            t23.p0.f415222n = false;
            t23.p0.f415223o = false;
            t23.p0.f415224p = false;
            t23.p0.f415225q = false;
        }
        int J2 = this.f138528m.J();
        boolean z27 = this.D;
        java.lang.Object[] objArr = this.W > 0 || this.f138522i;
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] selectSize:%s isSendRaw:%s", java.lang.Integer.valueOf(J2), java.lang.Boolean.valueOf(z27));
        int i29 = t23.p0.k().f415297f == 3 ? 1 : t23.p0.k().f415297f == 4 ? 2 : 0;
        int size = t23.p0.i() != null ? t23.p0.i().size() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[reportPhotoEdit] fromScene:%s,selectSize:%s,editSize:%s", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(J2), java.lang.Integer.valueOf(size));
        if (size > 0) {
            j33.d0.o(13858, i29 + "," + J2 + "," + size + ",0");
        }
        java.lang.String[] strArr = j33.d0.f297428a;
        gm0.j1.i();
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] imageState:%s", java.lang.Boolean.valueOf(!gm0.j1.b().m() ? false : gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true)));
        java.util.Iterator it6 = t23.p0.j().f415235g.iterator();
        while (it6.hasNext()) {
            android.os.Bundle bundle = (android.os.Bundle) it6.next();
            java.lang.String string = bundle.getString("after_photo_edit");
            if (objArr == false) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[handlePhotoEditInfo] delete file:%s", string);
                com.tencent.mm.vfs.w6.h(string);
                q75.c.f(string, com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            int i37 = bundle.getInt("report_info_emotion_count");
            int i38 = bundle.getInt("report_info_text_count");
            int i39 = bundle.getInt("report_info_mosaic_count");
            int i47 = bundle.getInt("report_info_doodle_count");
            boolean z28 = bundle.getBoolean("report_info_iscrop");
            int i48 = bundle.getInt("report_info_undo_count");
            java.util.Iterator it7 = it6;
            boolean z29 = bundle.getBoolean("report_info_is_rotation");
            java.lang.Object[] objArr2 = new java.lang.Object[i19];
            objArr2[0] = java.lang.Integer.valueOf(i37);
            objArr2[1] = java.lang.Integer.valueOf(i38);
            objArr2[2] = java.lang.Integer.valueOf(i39);
            objArr2[3] = java.lang.Integer.valueOf(i47);
            objArr2[4] = java.lang.Integer.valueOf(z28 ? 1 : 0);
            objArr2[5] = java.lang.Integer.valueOf(i48);
            objArr2[6] = java.lang.Integer.valueOf(z29 ? 1 : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,isRotation:%s", objArr2);
            if (size > 0) {
                j33.d0.o(13857, i29 + "," + z27 + "," + i37 + "," + i38 + "," + i39 + "," + i47 + "," + (z28 ? 1 : 0) + "," + i48 + ",2" + (z29 ? 1 : 0));
            }
            i18 = 0;
            it6 = it7;
            i19 = 7;
        }
        int i49 = i18;
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPhotoEditorImpl", "cleanAllCache: ");
        com.tencent.mm.cache.ArtistCacheManager.a().b();
        t23.p0.i().clear();
        t23.p0.j().f415235g.clear();
        t23.p0.m().clear();
        if (this.B1) {
            android.net.Uri uri = t23.o2.f415216e;
            t23.n2.f415209a.f415218b = true;
        } else {
            int J3 = this.Q >= this.f138528m.J() ? this.Q : this.f138528m.J();
            o23.n nVar2 = o23.m.f342426a;
            android.content.Context context = this.f138516f.getContext();
            java.util.ArrayList arrayList2 = this.f138528m.f247131g;
            nVar2.getClass();
            int[] iArr2 = new int[J3];
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList2.iterator();
            int i57 = i49;
            while (it8.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it8.next();
                u23.f0 f0Var = u23.f0.f424074a;
                android.net.Uri c17 = f0Var.c(galleryItem$MediaItem2);
                java.lang.String b17 = f0Var.b(galleryItem$MediaItem2);
                if (galleryItem$MediaItem2.getType() == 1) {
                    if (!galleryItem$MediaItem2.f138438p.equals("edit") || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem2.f138432g)) {
                        arrayList3.add(dw3.c0.f244182a.d(context, null, galleryItem$MediaItem2.f138430e, b17, c17));
                    } else {
                        arrayList3.add(galleryItem$MediaItem2.f138432g);
                    }
                    i17 = i57 + 1;
                    iArr2[i57] = 1;
                } else if (galleryItem$MediaItem2.getType() == 2) {
                    arrayList4.add(dw3.c0.f244182a.h(context, null, galleryItem$MediaItem2.f138430e, b17, c17));
                    i17 = i57 + 1;
                    iArr2[i57] = 2;
                } else if (galleryItem$MediaItem2.getType() == 6) {
                    arrayList3.add(galleryItem$MediaItem2.f138430e);
                    i17 = i57 + 1;
                    iArr2[i57] = 1;
                }
                i57 = i17;
            }
            o23.n nVar3 = o23.m.f342426a;
            nVar3.f342436j = arrayList3.size();
            nVar3.f342437k = arrayList4.size();
            java.util.Iterator it9 = arrayList2.iterator();
            int i58 = i49;
            int i59 = i58;
            int i66 = i59;
            while (it9.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem3 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it9.next();
                if (galleryItem$MediaItem3 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) {
                    if (galleryItem$MediaItem3 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) {
                        int i67 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem3).A;
                        if (i67 == 1) {
                            i58++;
                        } else if (i67 == 2) {
                            i59++;
                        }
                    } else {
                        i66++;
                    }
                }
            }
            nVar3.f342446t = "" + i58 + "#" + i59 + "#" + i66;
            o23.n nVar4 = o23.m.f342426a;
            java.util.Set set = nVar4.A;
            java.util.Iterator it10 = arrayList3.iterator();
            int i68 = i49;
            while (it10.hasNext()) {
                if (((java.util.HashSet) set).contains((java.lang.String) it10.next())) {
                    i68++;
                }
            }
            java.util.Iterator it11 = arrayList4.iterator();
            int i69 = i49;
            while (it11.hasNext()) {
                if (((java.util.HashSet) set).contains((java.lang.String) it11.next())) {
                    i69++;
                }
            }
            nVar4.f342438l = i68;
            nVar4.f342439m = i69;
            o23.n nVar5 = o23.m.f342426a;
            nVar5.f342440n = this.H1 ? 1 : 0;
            nVar5.f342444r = this.D;
            nVar5.b();
            android.net.Uri uri2 = t23.o2.f415216e;
            t23.n2.f415209a.f415219c = true;
            t23.n1 n1Var = t23.p0.k().f415296e;
            if (n1Var != null) {
                ((t23.f) n1Var).f415144g = true;
            }
            i33.l1 t76 = t7();
            if (t76 != null && (nVar = ((i33.a0) t76).f288154s) != null) {
                nVar.a();
            }
        }
        if (t23.p0.b()) {
            lt0.i iVar = (lt0.i) kt0.g.a(kt0.g.f311913d);
            lt0.a aVar = iVar.f321174b;
            com.tencent.mars.xlog.Log.i("MicroMsg.UsageLruMap", "resetSize %s", java.lang.Integer.valueOf(aVar.f321163a));
            iVar.f321173a.s(aVar.f321163a);
            e33.a0.f247108h.clear();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            if (i17 != 82) {
                return super.onKeyDown(i17, keyEvent);
            }
            this.T++;
            com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = this.f138540r;
            if (imageFolderMgrView != null) {
                imageFolderMgrView.d();
            }
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onKeyDown");
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView2 = this.f138540r;
        if (imageFolderMgrView2 == null || !imageFolderMgrView2.f138565m) {
            T7(-2, null);
            onBackPressed();
            return true;
        }
        imageFolderMgrView2.d();
        playActionBarOperationAreaAnim();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView;
        boolean z17;
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "on onPause, %s.", this);
        qp1.h0.b();
        this.P = true;
        if (!isFinishing() && !isDestroyed() && (imageFolderMgrView = this.f138540r) != null && (z17 = imageFolderMgrView.f138565m)) {
            if (!z17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ImageFolderMgrView", "want to close, but it was closed");
            } else if (!imageFolderMgrView.f138566n) {
                imageFolderMgrView.f138560e.setVisibility(8);
                imageFolderMgrView.f138565m = false;
                e33.g3 g3Var = imageFolderMgrView.f138570r;
                if (g3Var != null) {
                    ((e33.f0) g3Var).a(false);
                }
            }
        }
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollEnable(), this.f138535p0);
        this.f138535p0 = 0;
        if (this.B1) {
            android.net.Uri uri = t23.o2.f415216e;
            t23.o2 o2Var = t23.n2.f415209a;
            java.util.ArrayList arrayList = this.f138528m.f247131g;
            o2Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryQueryUtil", "clearSelectedMediaPath");
            java.util.ArrayList arrayList2 = (java.util.ArrayList) o2Var.f415220d;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        pf5.z zVar = pf5.z.f353948a;
        i33.e eVar = (i33.e) zVar.a(this).a(i33.e.class);
        if (i17 == 16) {
            if (iArr[0] == 0) {
                Y7();
                return;
            } else {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.fic), false, new e33.u0(this, eVar), null);
                return;
            }
        }
        if (i17 != 145) {
            return;
        }
        if (iArr[0] == 0) {
            C7();
            Q7();
            t23.p0.k().d();
            if (((i33.c0) zVar.a(this).a(i33.c0.class)).Z6()) {
                S7(this.f138540r.c(0));
            }
            P7();
        } else if (((i33.c0) zVar.a(this).a(i33.c0.class)).Z6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onRequestPermissionsResult: still show part");
        } else {
            U7(java.lang.Boolean.TRUE);
        }
        ((i33.c0) zVar.a(this).a(i33.c0.class)).W6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onResume, %s.", this);
        qp1.h0.a(true, true, true);
        this.P = false;
        dx1.g.f244489a.j("SnsPublishProcess", "selectPagetimes", 1, bx1.u.f36310e);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onSaveInstanceState, querySource=%d, queryType=%d, %s.", java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(this.F1), this);
        bundle.putInt("constants_key_query_source", this.E1);
        bundle.putInt("constants_key_query_type", this.F1);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onStart, %s.", this);
        if (t23.p0.k().f415297f != this.E1) {
            t23.p0.k().f415297f = this.E1;
        }
        if (t23.p0.k().f415298g != this.F1) {
            t23.p0.k().g(this.F1);
        }
        if (!this.C || this.P1) {
            return;
        }
        r23.j.f368827a.a(this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "onStop, %s.", this);
        if (this.L1 != null) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(this.L1);
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "exit business scene:%s", this.L1.f227176d);
            this.L1 = null;
        }
        if (this.B1) {
            return;
        }
        t23.p0.h().c();
        t23.p0.h().b();
    }

    public final void p7(int i17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        if (!j7(galleryItem$MediaItem)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "not support ratio");
            java.lang.String string = galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem ? getResources().getString(com.tencent.mm.R.string.fjp) : null;
            if (string != null) {
                db5.e1.T(getContext(), string);
                return;
            }
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        if (galleryItem$MediaItem.getType() == 2) {
            intent.putExtra("is_video", true);
            intent.putExtra("video_full_path", galleryItem$MediaItem.f138430e);
        }
        if (this.E1 == 10) {
            intent.putExtra("CropImage_OutputPath", galleryItem$MediaItem.f138430e);
        }
        intent.setData(android.net.Uri.parse(android.net.Uri.encode(galleryItem$MediaItem.f138430e)));
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "getItem ok");
        T7(-1, intent);
        o23.m.f342426a.c(galleryItem$MediaItem.f138430e, this.J1, i17);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q7() {
        /*
            r11 = this;
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "liteAppUuid"
            boolean r0 = r0.hasExtra(r1)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            if (r0 != 0) goto L3a
            i33.l1 r0 = r11.t7()
            if (r0 != 0) goto L29
            r0 = r3
            goto L35
        L29:
            i33.a0 r0 = (i33.a0) r0
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "is_only_show_media_with_location"
            boolean r0 = r0.getBooleanExtra(r1, r3)
        L35:
            if (r0 == 0) goto L38
            goto L3a
        L38:
            r0 = r3
            goto L3b
        L3a:
            r0 = r2
        L3b:
            pf5.z r1 = pf5.z.f353948a
            pf5.v r1 = r1.a(r11)
            java.lang.Class<i33.c0> r4 = i33.c0.class
            androidx.lifecycle.c1 r1 = r1.a(r4)
            i33.c0 r1 = (i33.c0) r1
            if (r0 == 0) goto L52
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            goto L53
        L52:
            r0 = 0
        L53:
            boolean r4 = r1.Z6()
            if (r4 == 0) goto L5a
            goto Lc8
        L5a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r2.add(r4)
            if (r0 == 0) goto L69
            kz5.h0.w(r2, r0)
        L69:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "request permissions: "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r1.f288168f
            com.tencent.mars.xlog.Log.i(r4, r0)
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            androidx.appcompat.app.AppCompatActivity r6 = r1.getActivity()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            r7 = r2
            java.lang.String[] r7 = (java.lang.String[]) r7
            r8 = 145(0x91, float:2.03E-43)
            r2 = 2131772991(0x7f10463f, float:1.9177357E38)
            java.lang.String r9 = r1.getString(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 >= r3) goto La8
            r2 = 2131768788(0x7f1035d4, float:1.9168832E38)
            java.lang.String r1 = r1.getString(r2)
            goto Laf
        La8:
            r2 = 2131768789(0x7f1035d5, float:1.9168834E38)
            java.lang.String r1 = r1.getString(r2)
        Laf:
            r10 = r1
            r5 = r0
            sb0.f r5 = (sb0.f) r5
            boolean r2 = r5.Di(r6, r7, r8, r9, r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkMediaStorageOnCreate: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r4, r0)
        Lc8:
            r11.K1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.q7():void");
    }

    public final boolean r7() {
        e33.b0 b0Var = this.f138528m;
        if (b0Var == null || !b0Var.D) {
            return false;
        }
        long j17 = this.f138524j2;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - j17 <= 1000) {
            this.f138524j2 = java.lang.System.currentTimeMillis();
            return false;
        }
        this.f138524j2 = java.lang.System.currentTimeMillis();
        e33.b0 b0Var2 = this.f138528m;
        if (b0Var2 == null || !b0Var2.D) {
            return true;
        }
        com.tencent.mm.sdk.platformtools.u3.i(new e33.a(b0Var2), 200L);
        return true;
    }

    public final void s7(java.util.List list) {
        java.lang.System.currentTimeMillis();
        list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            if (!com.tencent.mm.vfs.w6.j(galleryItem$MediaItem.f138430e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "filter non exist media: %s.", galleryItem$MediaItem.f138430e);
                linkedList.add(galleryItem$MediaItem);
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            list.remove((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next());
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(i33.z0.class);
        hashSet.add(i33.k1.class);
        hashSet.add(i33.t0.class);
        hashSet.add(i33.y0.class);
        hashSet.add(i33.e1.class);
        hashSet.add(j33.a.class);
        hashSet.add(i33.g.class);
        hashSet.add(i33.b1.class);
        hashSet.add(i33.c0.class);
        hashSet.add(i33.e.class);
        hashSet.add(com.tencent.mm.plugin.gallery.ui.uic.AlbumEventUIC.class);
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumMediaStoreNewCollect());
        boolean z17 = h17 == 2 || h17 != 3;
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryQueryConfig", "enableUseMediaItemNewFetcher: local:" + h17 + ", result:" + z17);
        this.O1 = z17;
        if (z17) {
            pf5.a0.b(i33.a0.class, i33.l1.class);
            hashSet.add(i33.a0.class);
        }
    }

    public final i33.l1 t7() {
        return (i33.l1) pf5.z.f353948a.a(this).d(i33.l1.class);
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        if (t21.d3.s() && this.Y < 0) {
            this.Y = j33.d0.h();
        }
        if (j17 != this.f138511a2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "%s %s, not my query, ignore.", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f138511a2));
            com.tencent.mars.xlog.Log.w("MicroMsg.AlbumPreviewUI", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
            return;
        }
        this.f138528m.I();
        linkedList.size();
        java.lang.Thread.currentThread().getName();
        if (z17 || this.f138528m.I() > linkedList.size()) {
            s7(linkedList);
        } else {
            s7(linkedList.subList(this.f138528m.I(), linkedList.size()));
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Boolean.valueOf(this.f138528m == null);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[2] = com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "[onQueryMediaFinished] ticket=%s, adapter is null?:%s %s", objArr);
        androidx.appcompat.app.AppCompatActivity activity = getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        i33.b1 b1Var = (i33.b1) zVar.a(activity).a(i33.b1.class);
        java.lang.String ticket = java.lang.String.valueOf(j17);
        int size = linkedList.size();
        b1Var.getClass();
        kotlin.jvm.internal.o.g(ticket, "ticket");
        i33.v vVar = (i33.v) ((java.util.LinkedHashMap) b1Var.f288164i).get(ticket);
        if (vVar != null) {
            vVar.f288279d = java.lang.System.currentTimeMillis();
            vVar.f288280e = size;
        }
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity2 = getContext();
            kotlin.jvm.internal.o.g(activity2, "activity");
            com.tencent.mm.autogen.mmdata.rpt.GalleryTecReportStruct galleryTecReportStruct = ((i33.b1) zVar.a(activity2).a(i33.b1.class)).f288162g;
            if (galleryTecReportStruct.f58308s <= 0) {
                galleryTecReportStruct.f58308s = java.lang.System.currentTimeMillis();
            }
        }
        if (this.f138528m != null) {
            e33.s1 s1Var = new e33.s1(null);
            s1Var.f247454d = new java.lang.ref.WeakReference(this.f138528m);
            s1Var.f247455e = new java.lang.ref.WeakReference(this.f138530n);
            s1Var.f247456f = new java.lang.ref.WeakReference(this.f138534p);
            s1Var.f247457g = new java.lang.ref.WeakReference(this.f138516f);
            s1Var.f247458h = linkedList2;
            s1Var.f247459i = this.f138536p1;
            s1Var.f247461n = z17;
            if (e33.o1.CREATE == this.f138523i2) {
                this.f138523i2 = e33.o1.SKIP;
            }
            t23.p0.n().c(s1Var);
            e33.p1 p1Var = new e33.p1(null);
            p1Var.f247430d = linkedList2.size();
            if (linkedList2.size() >= 1) {
                p1Var.f247432f = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) linkedList2.get(0);
            } else {
                p1Var.f247432f = null;
            }
            p1Var.f247431e = new java.lang.ref.WeakReference(this.f138540r);
            t23.p0.n().c(p1Var);
        }
    }

    public android.widget.TextView u7() {
        return (android.widget.TextView) findViewById(com.tencent.mm.R.id.kaq);
    }

    public final jz5.l w7(java.util.List list) {
        long longValue;
        java.util.Iterator it = list.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            j33.s sVar = j33.s.f297456a;
            java.lang.String a17 = sVar.a(galleryItem$MediaItem);
            java.util.HashMap hashMap = this.f138525k2;
            if (hashMap.containsKey(a17)) {
                longValue = ((java.lang.Long) hashMap.get(a17)).longValue();
            } else {
                longValue = sVar.b(galleryItem$MediaItem);
                hashMap.put(a17, java.lang.Long.valueOf(longValue));
            }
            j17 += longValue;
        }
        java.lang.String format = j17 > 1073741824 ? java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((((float) j17) / 1024.0f) / 1024.0f) / 1024.0f)) : j17 > 1048576 ? java.lang.String.format("%dMB", java.lang.Integer.valueOf((int) ((((float) j17) / 1024.0f) / 1024.0f))) : j17 > 0 ? java.lang.String.format("%dKB", java.lang.Long.valueOf(j17 / 1024)) : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "calculate totalLength: " + j17 + " finalStr: " + format);
        return new jz5.l(format, java.lang.Long.valueOf(j17));
    }

    public void x7(java.util.List list, java.util.List list2, int[] iArr) {
        int i17;
        java.util.Iterator it = this.f138528m.f247131g.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            u23.f0 f0Var = u23.f0.f424074a;
            android.net.Uri c17 = f0Var.c(galleryItem$MediaItem);
            java.lang.String b17 = f0Var.b(galleryItem$MediaItem);
            if (galleryItem$MediaItem.getType() == 1) {
                if (!galleryItem$MediaItem.f138438p.equals("edit") || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem.f138432g)) {
                    if (list != null) {
                        list.add(dw3.c0.f244182a.d(this.f138516f.getContext(), null, galleryItem$MediaItem.f138430e, b17, c17));
                    }
                } else if (list != null) {
                    list.add(galleryItem$MediaItem.f138432g);
                }
                i17 = i18 + 1;
                iArr[i18] = 1;
            } else if (galleryItem$MediaItem.getType() == 2) {
                if (list2 != null) {
                    list2.add(dw3.c0.f244182a.h(this.f138516f.getContext(), null, galleryItem$MediaItem.f138430e, b17, c17));
                }
                i17 = i18 + 1;
                iArr[i18] = 2;
            }
            i18 = i17;
        }
    }

    public java.util.ArrayList y7() {
        e33.b0 b0Var = this.f138528m;
        return b0Var == null ? new java.util.ArrayList() : b0Var.f247131g;
    }

    public final long z7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        return galleryItem$MediaItem.getType() == 2 ? this.S1 ? ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai() : this.Y : this.S1 ? ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai() : this.Z;
    }
}
