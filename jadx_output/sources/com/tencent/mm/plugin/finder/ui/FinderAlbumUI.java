package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderAlbumUI;", "Lcom/tencent/mm/plugin/gallery/ui/AlbumPreviewUI;", "Lut3/d;", "<init>", "()V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderAlbumUI extends com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI implements ut3.d {
    public static final /* synthetic */ int L2 = 0;
    public org.json.JSONObject A2;
    public boolean B2;
    public com.tencent.mm.plugin.finder.ui.sl C2;
    public final zy2.pa D2;
    public final m40.k0 E2;
    public final w40.e F2;
    public final pp0.h0 G2;
    public final uy0.h H2;
    public final e42.e0 I2;
    public final jz5.g J2;
    public final java.util.List K2;

    /* renamed from: u2, reason: collision with root package name */
    public java.lang.String f128504u2 = "";

    /* renamed from: v2, reason: collision with root package name */
    public boolean f128505v2;

    /* renamed from: w2, reason: collision with root package name */
    public long f128506w2;

    /* renamed from: x2, reason: collision with root package name */
    public boolean f128507x2;

    /* renamed from: y2, reason: collision with root package name */
    public boolean f128508y2;

    /* renamed from: z2, reason: collision with root package name */
    public long f128509z2;

    public FinderAlbumUI() {
        i95.m c17 = i95.n0.c(zy2.pa.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.D2 = (zy2.pa) c17;
        i95.m c18 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        this.E2 = (m40.k0) c18;
        i95.m c19 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        this.F2 = (w40.e) c19;
        i95.m c27 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        this.G2 = (pp0.h0) c27;
        i95.m c28 = i95.n0.c(uy0.h.class);
        kotlin.jvm.internal.o.f(c28, "getService(...)");
        this.H2 = (uy0.h) c28;
        i95.m c29 = i95.n0.c(e42.e0.class);
        kotlin.jvm.internal.o.f(c29, "getService(...)");
        this.I2 = (e42.e0) c29;
        this.J2 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.p0(this));
        this.K2 = kz5.c0.i(38, 39, 40, 47);
    }

    public static void m8(com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            i19 = 3;
        }
        finderAlbumUI.getClass();
        android.content.Intent intent = new android.content.Intent(finderAlbumUI, (java.lang.Class<?>) com.tencent.mm.plugin.finder.ui.FinderPreviewUI.class);
        intent.putStringArrayListExtra("preview_image_list", finderAlbumUI.f138528m.K());
        intent.putParcelableArrayListExtra("preview_media_item_list", finderAlbumUI.f138528m.f247131g);
        intent.putExtra("preview_all", true);
        intent.putExtra("preview_position", i17);
        finderAlbumUI.H7(i17, true);
        intent.putExtra("send_raw_img", finderAlbumUI.D);
        if (t23.p0.k().f415297f != 37) {
            intent.putExtra("key_force_hide_edit_image_button", true);
        }
        intent.putExtra("max_select_count", i18);
        intent.putExtra("GalleryUI_FromUser", finderAlbumUI.U);
        intent.putExtra("GalleryUI_ToUser", finderAlbumUI.V);
        intent.putExtra("album_business_tag", finderAlbumUI.f138548x0);
        int i28 = finderAlbumUI.f138551y0;
        int Ni = ((h62.d) finderAlbumUI.I2).Ni(e42.d0.clicfg_ultron_album_video_max_select_duration_android, 300);
        int j86 = finderAlbumUI.j8() - 1;
        if (Ni < j86) {
            Ni = j86;
        }
        intent.putExtra("album_video_max_duration", java.lang.Math.max(i28, Ni));
        intent.putExtra("album_video_min_duration", finderAlbumUI.f138526l1);
        intent.putExtra("media_type", i19);
        intent.putExtra("key_support_max_ratio", 3.0f);
        if (t23.p0.k().f415297f == 14) {
            intent.putExtra("key_edit_video_max_time_length", 300500);
        }
        finderAlbumUI.startActivityForResult(intent, 288);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void I7(java.util.List selectedMediaItems, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(selectedMediaItems, "selectedMediaItems");
        super.I7(this.f138528m.f247131g, galleryItem$MediaItem, i17, i18, z17);
        com.tencent.mm.plugin.finder.ui.sl slVar = this.C2;
        if (slVar != null) {
            slVar.d(this.f138528m.J());
        }
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void J7() {
        ((qs2.q) this.F2).getClass();
        com.tencent.mm.plugin.finder.report.p2.f125237a.C(3, null);
        xo4.b.a(xo4.b.f455768a, 100, 1, java.lang.System.currentTimeMillis() - this.f128509z2, 0, this.A2, null, null, 96, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K7() {
        /*
            r11 = this;
            java.lang.String r0 = "onHeaderClicked: "
            java.lang.String r1 = "Finder.AlbumUI"
            com.tencent.mars.xlog.Log.i(r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "KEY_FINDER_POST_ORIGIN_MUSIC_INFO"
            byte[] r0 = r0.getByteArrayExtra(r2)
            r45.zi2 r2 = new r45.zi2
            r2.<init>()
            r3 = 0
            if (r0 != 0) goto L1b
        L19:
            r8 = r3
            goto L2d
        L1b:
            r2.parseFrom(r0)     // Catch: java.lang.Exception -> L20
            r8 = r2
            goto L2d
        L20:
            r0 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r4, r2, r0)
            goto L19
        L2d:
            if (r8 != 0) goto L35
            java.lang.String r0 = "onHeaderClicked: get music info pb error"
            com.tencent.mars.xlog.Log.e(r1, r0)
            return
        L35:
            androidx.appcompat.app.AppCompatActivity r0 = r11.getContext()
            androidx.appcompat.app.AppCompatActivity r1 = r11.getContext()
            r2 = 2131762544(0x7f101d70, float:1.9156168E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = 1
            r4 = 2
            com.tencent.mm.ui.widget.dialog.u3 r10 = com.tencent.mm.ui.widget.dialog.u3.f(r0, r1, r2, r4, r3)
            w40.e r0 = r11.F2
            qs2.q r0 = (qs2.q) r0
            r0.getClass()
            com.tencent.mm.plugin.finder.assist.e9 r0 = com.tencent.mm.plugin.finder.assist.e9.f102132a
            java.lang.String r6 = r0.c(r8)
            java.lang.Class<qc0.i1> r0 = qc0.i1.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            qc0.i1 r0 = (qc0.i1) r0
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            int r2 = (int) r2
            r1.f155711e = r2
            r2 = 5
            java.lang.String r2 = r8.getString(r2)
            r1.f155712f = r2
            r1.f155715i = r6
            androidx.appcompat.app.AppCompatActivity r2 = r11.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            com.tencent.mm.plugin.finder.ui.r0 r3 = new com.tencent.mm.plugin.finder.ui.r0
            r5 = r3
            r7 = r11
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            pc0.k2 r0 = (pc0.k2) r0
            r0.wi(r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderAlbumUI.K7():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void M7(int i17, android.view.View itemView, int i18) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = this.f138528m.E(i17);
        if (E == null || com.tencent.mm.sdk.platformtools.t8.K0(E.f138430e)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(E == null);
            com.tencent.mars.xlog.Log.w("Finder.AlbumUI", "item is null %s, item original path is null", objArr);
            return;
        }
        int i19 = this.E1;
        if (i19 == 25 || i19 == 37 || i19 == 39) {
            if (i19 == 37 && this.f138528m.J() != 0 && (E instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem)) {
                db5.e1.T(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.fiq));
                return;
            }
            if (!(E instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem)) {
                java.util.ArrayList arrayList = this.f138528m.f247130f;
                kotlin.jvm.internal.o.f(arrayList, "getAllMediaItems(...)");
                t23.p0.p(arrayList);
                m8(this, arrayList.indexOf(E), this.Q, 0, 4, null);
                return;
            }
            e42.d0 d0Var = e42.d0.clicfg_ultron_album_video_max_select_duration_android;
            int Ni = ((h62.d) this.I2).Ni(d0Var, 300);
            int j86 = j8();
            if (Ni < j86) {
                Ni = j86;
            }
            int Ni2 = ((h62.d) this.I2).Ni(d0Var, 300);
            int j87 = j8() - 1;
            if (Ni2 < j87) {
                Ni2 = j87;
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) E;
            kotlin.jvm.internal.o.f(galleryItem$VideoMediaItem.f138430e, "getOriginalPath(...)");
            if (galleryItem$VideoMediaItem.f138446x < d11.s.fj().hj().f71196i * 1000) {
                db5.e1.F(getContext(), getResources().getString(com.tencent.mm.R.string.f492194fk5, java.lang.Integer.valueOf(d11.s.fj().hj().f71196i)), "", false);
                return;
            }
            if (galleryItem$VideoMediaItem.f138446x > Ni * 1000) {
                db5.e1.F(getContext(), getResources().getString(com.tencent.mm.R.string.fk6, java.lang.Integer.valueOf(Ni2)), "", false);
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "onMediaClick, video mime:" + galleryItem$VideoMediaItem.f138444v + ", audio mime:" + galleryItem$VideoMediaItem.f138445w + ", path:" + E.f138430e);
            java.lang.String str = galleryItem$VideoMediaItem.f138430e;
            kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.ui.o0(str));
            if ((j33.e.f297434a.c(25, galleryItem$VideoMediaItem) == 0) == true) {
                new java.util.ArrayList(1).add(E);
                java.util.ArrayList arrayList2 = this.f138528m.f247130f;
                kotlin.jvm.internal.o.f(arrayList2, "getAllMediaItems(...)");
                t23.p0.p(arrayList2);
                m8(this, arrayList2.indexOf(E), this.E1 != 37 ? this.Q : 1, 0, 4, null);
                return;
            }
            o8(galleryItem$VideoMediaItem.f138444v, galleryItem$VideoMediaItem.f138445w, E.f138430e);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
            u1Var.u(i65.a.r(getContext(), com.tencent.mm.R.string.f492187fj5));
            u1Var.n(i65.a.r(getContext(), com.tencent.mm.R.string.fil));
            u1Var.l(com.tencent.mm.plugin.finder.ui.s0.f129788a);
            u1Var.q(false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public boolean N7() {
        java.lang.String postId;
        java.lang.String clickId;
        xo4.b.a(xo4.b.f455768a, 100, 1, java.lang.System.currentTimeMillis() - this.f128509z2, 1, this.A2, null, null, 96, null);
        ((ez0.i) this.H2).getClass();
        bz0.j.f36750a.c(2);
        int i17 = this.E1;
        if (i17 == 25) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.f138528m.f247131g);
            if (arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.e("Finder.AlbumUI", "[onSendItemClick] list isEmpty");
                return false;
            }
            java.lang.Object obj = arrayList.get(0);
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = obj instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem ? (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) obj : null;
            int i18 = galleryItem$VideoMediaItem != null ? galleryItem$VideoMediaItem.f138446x : 0;
            if (arrayList.size() == 1) {
                long j17 = i18;
                c61.p7 p7Var = (c61.p7) this.E2;
                if (j17 >= (p7Var.mj() + 1) * 1000 && j17 < j8() * 1000 && !this.f128505v2) {
                    boolean aj6 = ((yy0.m0) this.G2).aj();
                    if (p7Var.wi() == 1 || aj6) {
                        com.tencent.mm.plugin.vlog.model.b0 b0Var = com.tencent.mm.plugin.vlog.model.b0.f175547a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markExitAlbum");
                        if (com.tencent.mm.plugin.vlog.model.b0.f175552f <= 0) {
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            com.tencent.mm.plugin.vlog.model.b0.f175552f = android.os.SystemClock.elapsedRealtime();
                        }
                        h8(arrayList);
                    } else {
                        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
                        java.lang.Object obj2 = arrayList.get(0);
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem");
                        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) obj2;
                        y1Var.j(com.tencent.mm.R.layout.b5m);
                        android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.czu);
                        if (textView != null) {
                            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                        }
                        android.view.View findViewById = y1Var.f212027f.findViewById(com.tencent.mm.R.id.cyz);
                        if (findViewById != null) {
                            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.ui.t0(y1Var));
                        }
                        android.view.View findViewById2 = y1Var.f212027f.findViewById(com.tencent.mm.R.id.ipx);
                        if (findViewById2 != null) {
                            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.u0(this, y1Var, galleryItem$VideoMediaItem2));
                        }
                        android.view.View findViewById3 = y1Var.f212027f.findViewById(com.tencent.mm.R.id.f486912mv3);
                        if (findViewById3 != null) {
                            findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.ui.v0(this, y1Var, arrayList));
                        }
                        y1Var.f212037s = new com.tencent.mm.plugin.finder.ui.w0(this);
                        y1Var.s();
                        ((qs2.q) this.F2).getClass();
                        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                        java.lang.String str = (finderFeedReportObject == null || (clickId = finderFeedReportObject.getClickId()) == null) ? "" : clickId;
                        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
                        n8(str, (finderFeedReportObject2 == null || (postId = finderFeedReportObject2.getPostId()) == null) ? "" : postId, 1, c01.id.c() / 1000, 0);
                    }
                    return true;
                }
            }
            com.tencent.mm.plugin.vlog.model.b0 b0Var2 = com.tencent.mm.plugin.vlog.model.b0.f175547a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markExitAlbum");
            if (com.tencent.mm.plugin.vlog.model.b0.f175552f <= 0) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mm.plugin.vlog.model.b0.f175552f = android.os.SystemClock.elapsedRealtime();
            }
            h8(arrayList);
            return true;
        }
        if (i17 == 32) {
            int intExtra = getIntent().getIntExtra("min_select_count", 0);
            if (this.f138528m.f247131g.size() < intExtra) {
                androidx.appcompat.app.AppCompatActivity context = getContext();
                android.content.res.Resources resources = getContext().getResources();
                db5.e1.T(context, resources != null ? resources.getQuantityString(com.tencent.mm.R.plurals.f489680q, intExtra, java.lang.Integer.valueOf(intExtra)) : null);
                return false;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f138528m.f247131g);
            if (arrayList2.isEmpty()) {
                com.tencent.mars.xlog.Log.e("Finder.AlbumUI", "[onSendItemClick] list isEmpty");
                return false;
            }
            if (this.E1 == 32) {
                ut3.f.f431176c.f431177a = this;
            }
            g8(arrayList2);
            return true;
        }
        if (i17 != 47) {
            if (i17 == 48) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                l8(arrayList3, new java.util.ArrayList());
                android.content.Intent intent = new android.content.Intent();
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add((java.lang.String) ((jz5.l) it.next()).f302833d);
                }
                intent.putStringArrayListExtra("key_select_image_list", new java.util.ArrayList<>(arrayList4));
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    arrayList5.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it6.next()).f302834e).longValue()));
                }
                intent.putExtra("SELECT_IMAGES_MODIFIED_TIME", kz5.n0.T0(arrayList5));
                setResult(-1, intent);
                finish();
                return true;
            }
            switch (i17) {
                case 37:
                    if (new java.util.ArrayList(this.f138528m.f247131g).isEmpty()) {
                        com.tencent.mars.xlog.Log.e("Finder.AlbumUI", "[onSendItemClick] list isEmpty");
                        return false;
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    l8(arrayList6, arrayList7);
                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(arrayList7, 10));
                    java.util.Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        arrayList8.add((java.lang.String) ((jz5.l) it7.next()).f302833d);
                    }
                    intent2.putStringArrayListExtra("key_select_video_list", new java.util.ArrayList<>(arrayList8));
                    java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(arrayList6, 10));
                    java.util.Iterator it8 = arrayList6.iterator();
                    while (it8.hasNext()) {
                        arrayList9.add((java.lang.String) ((jz5.l) it8.next()).f302833d);
                    }
                    intent2.putStringArrayListExtra("key_select_image_list", new java.util.ArrayList<>(arrayList9));
                    java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(arrayList6, 10));
                    java.util.Iterator it9 = arrayList6.iterator();
                    while (it9.hasNext()) {
                        arrayList10.add(java.lang.Long.valueOf(((java.lang.Number) ((jz5.l) it9.next()).f302834e).longValue()));
                    }
                    intent2.putExtra("SELECT_IMAGES_MODIFIED_TIME", kz5.n0.T0(arrayList10));
                    setResult(-1, intent2);
                    com.tencent.mm.plugin.vlog.model.b0 b0Var3 = com.tencent.mm.plugin.vlog.model.b0.f175547a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markExitAlbum");
                    if (com.tencent.mm.plugin.vlog.model.b0.f175552f <= 0) {
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mm.plugin.vlog.model.b0.f175552f = android.os.SystemClock.elapsedRealtime();
                    }
                    finish();
                    return false;
                case 38:
                case 39:
                case 41:
                    break;
                case 40:
                    java.util.ArrayList arrayList11 = new java.util.ArrayList(this.f138528m.f247131g);
                    if (arrayList11.isEmpty()) {
                        com.tencent.mars.xlog.Log.e("Finder.AlbumUI", "[onSendItemClick] list isEmpty");
                        return false;
                    }
                    com.tencent.mm.plugin.vlog.model.b0 b0Var4 = com.tencent.mm.plugin.vlog.model.b0.f175547a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoShell", "markExitAlbum");
                    if (com.tencent.mm.plugin.vlog.model.b0.f175552f <= 0) {
                        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mm.plugin.vlog.model.b0.f175552f = android.os.SystemClock.elapsedRealtime();
                    }
                    h8(arrayList11);
                    return true;
                default:
                    return false;
            }
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList12 = new java.util.ArrayList<>(this.f138528m.f247131g);
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putParcelableArrayListExtra("key_select_mix_media_list", arrayList12);
        setResult(-1, intent3);
        finish();
        return true;
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    public final boolean f8() {
        if (getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO") != null) {
            return ((h62.d) this.I2).nj(new com.tencent.mm.repairer.config.mjpublisher.RepairerConfigAlbumTemplateFollowMusicNewUI()) == 1;
        }
        return true;
    }

    public final void g8(java.util.ArrayList mediaList) {
        java.lang.Object obj;
        uy0.h hVar = this.H2;
        ((ez0.i) hVar).Ai(true);
        if (f8()) {
            com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "perform enter template preview ui");
            android.content.Intent intent = getIntent();
            intent.putExtra("key_maas_entrance", 200);
            ((ez0.i) hVar).getClass();
            kotlin.jvm.internal.o.g(mediaList, "mediaList");
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "enterFinderAlbumTemplatePreviewUI");
            com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI.f69756g.a(this, intent, 294, sy0.b.f413827e, mediaList, (com.tencent.mm.mj_template.api.MJTemplateSession) intent.getParcelableExtra("mj_template_session"));
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "perform enter music template preview ui");
        java.util.Iterator it = mediaList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj).getType() == 2) {
                    break;
                }
            }
        }
        boolean z17 = obj == null;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider i86 = i8(mediaList);
        int i17 = z17 ? 3 : 4;
        android.content.Intent intent2 = getIntent();
        ((c61.w8) this.D2).getClass();
        kotlin.jvm.internal.o.g(intent2, "intent");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, this, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
        intent2.putExtra("KEY_PARAMS_CONFIG", i86);
        intent2.putExtra("KEY_PARAMS_TO_WHERE", i17);
        intent2.putExtra("KEY_PARAMS_EXIT_ANIM", 0);
        intent2.putExtra("KEY_PARAMS_SELECTED_BIZ_INT", 0);
        intent2.putExtra("key_maas_entrance", 200);
        ((ez0.i) hVar).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "enterMultiTemplatePreviewUI");
        intent2.setClass(this, com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI.class);
        intent2.putExtra("request_params", new com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams(mediaList, false, false, false, null, 30, null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(294);
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(this, arrayList.toArray(), "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/app/Activity;ILjava/util/List;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void h8(java.util.ArrayList arrayList) {
        java.lang.String str;
        java.lang.Object obj;
        ((qs2.q) this.F2).getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject == null || (str = finderFeedReportObject.getFlowId()) == null) {
            str = "";
        }
        ((c61.w8) this.D2).getClass();
        ft2.b.f266519a.b(str, ft2.c.f266522c);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj).getType() == 2) {
                    break;
                }
            }
        }
        boolean z17 = obj == null;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                if (((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next()).getType() == 6) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider i86 = i8(arrayList);
        int i17 = z17 ? 3 : 4;
        ut3.f.f431176c.f431177a = this;
        c61.p7 p7Var = (c61.p7) this.E2;
        int Vi = p7Var.Vi();
        com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "doEnterMMRecordVLogUI: imageFeedAssetsMaxCount=" + Vi);
        boolean z18 = z17 && arrayList.size() <= Vi;
        yy0.m0 m0Var = (yy0.m0) this.G2;
        boolean aj6 = m0Var.aj();
        ut3.m mVar = ut3.m.f431182a;
        if (aj6 && !z18) {
            mVar.h(getContext(), 296, 0, 0, i86, i17, 0, this.B2, null, true, false);
            return;
        }
        boolean z19 = m0Var.Zi(false) && p7Var.hj(m40.j0.f323414m);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it7.next()).f138430e);
        }
        arrayList2.addAll(arrayList3);
        i86.G = arrayList2;
        if (!z19) {
            mVar.f(getContext(), 292, 0, 0, i86, i17, 0);
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        boolean z27 = this.B2;
        android.content.Intent a17 = mVar.a(context, "com.tencent.mm.mj_publisher.finder.image_composing.ImageComposingUI", i17);
        if (a17 == null) {
            return;
        }
        a17.putExtra("KEY_PARAMS_CONFIG", i86);
        a17.putExtra("KEY_FROM_SHOOT_COMPOSING", z27);
        a17.putExtra("KEY_VIDEO_SOURCE_FROM_ALBUM", true);
        a17.putExtra("KEY_SHOOT_COMPOSING_ONLY_PREVIEW", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCaptureJumper", "configProvider: %s", i86);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.audio.k0.CTRL_INDEX));
        arrayList4.add(a17);
        java.util.Collections.reverse(arrayList4);
        yj0.a.k(context, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/jumper/VideoCaptureJumper", "jumpToMJImageComposingForResult", "(Landroid/content/Context;IIILcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;IZLcom/tencent/mm/protocal/protobuf/FinderVideoTemplateInfo;ZZ)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        mVar.b(context, 0, 0);
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider i8(java.util.ArrayList arrayList) {
        arrayList.size();
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String stringExtra = getIntent().getStringExtra("key_finder_context_id");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_click_tab_context_id");
        bundle.putParcelableArrayList("media_list", arrayList);
        bundle.putString("FINDER_CONTEXT_ID", stringExtra);
        bundle.putString("FINDER_SESSION_ID", getIntent().getStringExtra("key_finder_session_id"));
        bundle.putString("key_click_tab_context_id", stringExtra2);
        bundle.putInt("key_from_comment_scene", 101);
        bundle.putString("post_id", this.f128504u2);
        bundle.putString("KEY_ORIGIN_MUSIC_ID", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID"));
        bundle.putString("KEY_ORIGIN_BGM_URL", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_BGM_URL"));
        bundle.putString("KEY_ORIGIN_MUSIC_PATH", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH"));
        bundle.putString("KEY_ORIGIN_MUSIC_NAME", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME"));
        bundle.putString("KEY_ORIGIN_MUSIC_COVER_URL", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_COVER_URL"));
        bundle.putInt("KEY_ORIGIN_MUSIC_PLAY_DURATION", getIntent().getIntExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PLAY_DURATION", 0));
        bundle.putString("KEY_ORIGIN_MUSIC_AUTHOR", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_AUTHOR"));
        bundle.putByteArray("KEY_ORIGIN_MUSIC_INFO", getIntent().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO"));
        bundle.putBoolean("KEY_BGM_IF_ORIGIN", getIntent().getBooleanExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", false));
        bundle.putBoolean("KEY_FULLSCREEN", true);
        bundle.putInt("KEY_MEDIA_SOURCE_FROM", 1);
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(this);
        i95.m c17 = i95.n0.c(c50.b1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context baseContext = getBaseContext();
        kotlin.jvm.internal.o.f(baseContext, "getBaseContext(...)");
        jz5.o Ai = ((c61.s9) ((c50.b1) c17)).Ai(baseContext, h17.x, h17.y);
        android.graphics.Point point = new android.graphics.Point(((java.lang.Number) Ai.f302842e).intValue(), ((java.lang.Number) Ai.f302843f).intValue());
        bundle.putInt("KEY_PREVIEW_WIDTH", point.x);
        bundle.putInt("KEY_PREVIEW_HEIGHT", point.y);
        m40.k0 k0Var = this.E2;
        bundle.putLong("video_max_duration", (((c61.p7) k0Var).wi() == 1 ? j8() : r8.mj()) * 1000);
        bundle.putLong("video_track_max_duration", (((c61.p7) k0Var).wi() == 1 ? j8() : r8.mj()) * 1000);
        c61.p7 p7Var = (c61.p7) k0Var;
        p7Var.getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        bundle.putInt("image_max_height", t70Var.l2());
        p7Var.getClass();
        bundle.putInt("image_max_width", t70Var.k2());
        bundle.putInt("image_compress_quality", p7Var.cj());
        qs2.q qVar = (qs2.q) this.F2;
        qVar.getClass();
        bundle.putString("output_dir", com.tencent.mm.plugin.finder.assist.e9.f102146o);
        uu2.b bVar = uu2.b.f431269a;
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_MediaAudioPanelV2UI_Int, 0);
        boolean fj6 = g17 != 1 ? g17 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_finder_media_editor_music_panel_v2, true) : false : true;
        com.tencent.mars.xlog.Log.i("Finder.FinderVideoEditorConfig", "enableUseMusicPanelV2: " + fj6);
        bundle.putBoolean("key_use_music_panel_v2", fj6);
        long longExtra = getIntent().getLongExtra("key_ref_feed_id", 0L);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_ref_feed_dup_flag");
        int intExtra = getIntent().getIntExtra("key_ref_comment_scene", 0);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        r45.qt2 wi6 = ((c61.w8) this.D2).wi(context);
        if (intExtra == 0) {
            intExtra = wi6 != null ? wi6.getInteger(5) : 101;
        }
        qVar.getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        int enterScene = finderFeedReportObject != null ? finderFeedReportObject.getEnterScene() : 0;
        bundle.putLong("key_ref_feed_id", longExtra);
        bundle.putString("key_ref_feed_dup_flag", stringExtra3);
        bundle.putInt("key_ref_comment_scene", intExtra);
        bundle.putInt("key_ref_enter_scene", enterScene);
        bundle.putString("KEY_FINDER_POST_MUSIC_FEEDID", getIntent().getStringExtra("KEY_FINDER_POST_MUSIC_FEEDID"));
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider a17 = bVar.a();
        a17.M = bundle;
        if (a17.I == null) {
            a17.I = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
        }
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = a17.I;
        if (videoCaptureReportInfo != null) {
            videoCaptureReportInfo.f155694h = longExtra;
            videoCaptureReportInfo.f155695i = stringExtra3;
            videoCaptureReportInfo.f155693g = 101;
            videoCaptureReportInfo.f155696m = enterScene;
            videoCaptureReportInfo.f155700q = intExtra;
            videoCaptureReportInfo.f155697n = stringExtra;
            videoCaptureReportInfo.f155698o = stringExtra2;
        }
        if (this.E1 == 40) {
            a17.M.putInt("KEY_POST_ENTERSCENE", getIntent().getIntExtra("KEY_POST_ENTERSCENE", 0));
        }
        return a17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (f8() != false) goto L31;
     */
    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderAlbumUI.initView():void");
    }

    public final int j8() {
        return ((java.lang.Number) ((jz5.n) this.J2).getValue()).intValue();
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        byte[] byteArray;
        byte[] byteArray2;
        byte[] byteArray3;
        byte[] byteArray4;
        byte[] byteArray5;
        java.util.ArrayList parcelableArrayList;
        byte[] byteArray6;
        byte[] byteArray7;
        com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo reportInfo = nu3.i.f340218a.l();
        w40.e eVar = this.F2;
        qs2.q qVar = (qs2.q) eVar;
        qVar.getClass();
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.f(reportInfo);
        if (captureDataManager$CaptureVideoNormalModel != null) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f128508y2) {
                intent.putExtras(getIntent());
            }
            if (context != null && kotlin.jvm.internal.o.b(context.getClass().getName(), "com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI")) {
                intent.putExtras(getIntent());
            }
            i95.m c17 = i95.n0.c(pp0.l0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            r45.df2 wi6 = ((yy0.m7) ((pp0.l0) c17)).wi();
            intent.putExtra("KEY_POST_MJ_PUBLISHER_INFO", wi6.toByteArray());
            qVar.getClass();
            p2Var.Y(wi6);
            i95.m c18 = i95.n0.c(pp0.k0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.a1(m7Var, null), 3, null);
            m7Var.cj("Completed");
            m7Var.bj("Completed");
            m7Var.mj();
            if (bundle != null && (byteArray7 = bundle.getByteArray("MEDIA_EXTRA_MUSIC")) != null) {
                intent.putExtra("MEDIA_EXTRA_MUSIC", byteArray7);
            }
            if (bundle != null && (byteArray6 = bundle.getByteArray("ORIGIN_MUSIC_INFO")) != null) {
                intent.putExtra("ORIGIN_MUSIC_INFO", byteArray6);
            }
            pm0.v.l(intent, bundle, "ORIGIN_MUSIC_ID");
            pm0.v.l(intent, bundle, "ORIGIN_MUSIC_PATH");
            pm0.v.l(intent, bundle, "ORIGIN_BGM_URL");
            pm0.v.e(intent, bundle, "MEDIA_IS_MUTE", false, 4, null);
            pm0.v.e(intent, bundle, "MUSIC_IS_MUTE", false, 4, null);
            pm0.v.h(intent, bundle, "SOUND_TRACK_TYPE", 0, 4, null);
            pm0.v.l(intent, bundle, "MUSIC_FEED_ID");
            if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("KEY_POST_HALF_RECT_LIST")) != null) {
                intent.putExtra("KEY_POST_HALF_RECT_LIST", parcelableArrayList);
            }
            pm0.v.i(intent, bundle, "key_ref_feed_id", 0L, 4, null);
            pm0.v.l(intent, bundle, "key_ref_feed_dup_flag");
            pm0.v.h(intent, bundle, "key_ref_enter_scene", 0, 4, null);
            pm0.v.l(intent, bundle, "KEY_POST_VIDEO_TITLE");
            pm0.v.e(intent, bundle, "KEY_POST_ASSETS_IS_REAL_SHOOT", false, 4, null);
            java.util.ArrayList arrayList = (java.util.ArrayList) captureDataManager$CaptureVideoNormalModel.a().b("KEY_IMAGE_QUALITY_INT_ARRAY", new java.util.ArrayList());
            java.util.List<java.lang.String> list = captureDataManager$CaptureVideoNormalModel.f155666m;
            if (list == null || list.size() <= 0) {
                if (bundle != null && (byteArray = bundle.getByteArray("video_composition")) != null) {
                    intent.putExtra("video_composition", byteArray);
                }
                intent.putExtra("postType", 4);
                intent.putExtra("postMediaList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155661e));
                boolean z17 = true;
                intent.putExtra("postTypeList", kz5.c0.d(4));
                intent.putExtra("postThumbList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155662f));
                if (arrayList != null && arrayList.size() == 1) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                java.lang.String string = bundle != null ? bundle.getString("KEY_POST_MIAOJIAN_TONGKUAN_META") : null;
                if (string != null && string.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    intent.putExtra("KEY_POST_MIAOJIAN_TONGKUAN_META", string);
                    if (intent.getIntExtra("KEY_POST_FROM_APP_SOURCE", 0) == 0) {
                        intent.putExtra("KEY_POST_FROM_APP_SOURCE", 4);
                    }
                }
            } else {
                intent.putExtra("postType", 2);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add((java.lang.String) it.next());
                }
                intent.putExtra("postMediaList", arrayList2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str : list) {
                    arrayList3.add(2);
                }
                intent.putExtra("postTypeList", arrayList3);
                intent.putExtra("postThumbList", kz5.c0.d(captureDataManager$CaptureVideoNormalModel.f155662f));
                if (arrayList != null && arrayList.size() == list.size()) {
                    intent.putExtra("key_post_media_quality_list", arrayList);
                }
                pm0.v.j(intent, bundle, "KEY_POST_HALF_IMAGE_LIST");
            }
            intent.putExtra("post_id", this.f128504u2);
            intent.putExtra("edit_id", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MULTI_MEDIA_EDIT_ID_STRING", ""));
            intent.putExtra("KEY_MUSIC_ID", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_ID_STRING", ""));
            intent.putExtra("KEY_MUSIC_LIKE_FINDER_FEED_ID", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", ""));
            java.lang.Object b17 = captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_TYPE_INT", 0);
            kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
            intent.putExtra("KEY_MUSIC_TYPE", ((java.lang.Number) b17).intValue());
            intent.putExtra("KEY_MUSIC_SESSION_BUFFER", (java.lang.String) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MUSIC_SESSION_BUFFER", ""));
            pm0.v.l(intent, bundle, "KEY_POST_ORIGIN_FILE_PATH");
            pm0.v.e(intent, bundle, "isLongVideoPost", false, 4, null);
            intent.putExtra("KEY_POST_VIDEO_TEMPLATE", bundle != null ? bundle.getByteArray("KEY_POST_VIDEO_TEMPLATE") : null);
            intent.putExtra("KEY_POST_VIDEO_COVER_START_TIME", bundle != null ? java.lang.Double.valueOf(bundle.getDouble("KEY_POST_VIDEO_COVER_START_TIME")) : null);
            if (bundle != null && (byteArray5 = bundle.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE")) != null) {
                intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE", byteArray5);
            }
            if (bundle != null && (byteArray4 = bundle.getByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_JSON")) != null) {
                intent.putExtra("KEY_POST_VIDEO_CLIP_BUNDLE_JSON", byteArray4);
            }
            if (bundle != null && (byteArray3 = bundle.getByteArray("KEY_POST_ASSET_INFO")) != null) {
                intent.putExtra("KEY_POST_ASSET_INFO", byteArray3);
            }
            if (bundle != null && (byteArray2 = bundle.getByteArray("KEY_CREATE_TEMPLATE_INFO")) != null) {
                intent.putExtra("KEY_CREATE_TEMPLATE_INFO", byteArray2);
            }
            eVar.getClass();
            android.content.Intent curIntent = getIntent();
            kotlin.jvm.internal.o.g(curIntent, "curIntent");
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).nl(intent, curIntent);
            int i17 = this.E1;
            qs2.v vVar = qs2.v.f366327a;
            if (i17 == 32 && (context instanceof android.app.Activity)) {
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(-1);
                activity.finish();
                activity.overridePendingTransition(0, 0);
                intent.removeExtra("KEY_FROM_SHOOT_COMPOSING");
                eVar.getClass();
                vVar.e(this, intent);
            } else if (this.B2 && (context instanceof android.app.Activity) && ((context instanceof com.tencent.mm.mj_publisher.finder.movie_composing.MovieComposingUI) || (context instanceof com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) || (this.C2 != null && kotlin.jvm.internal.o.b(context.getClass().getName(), "com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI")))) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("KEY_POST_INTENT", intent);
                android.app.Activity activity2 = (android.app.Activity) context;
                activity2.setResult(-1, intent2);
                activity2.finish();
                activity2.overridePendingTransition(0, 0);
            } else {
                intent.removeExtra("KEY_FROM_SHOOT_COMPOSING");
                eVar.getClass();
                vVar.e(this, intent);
            }
            ut3.f.f431176c.f431177a = null;
        }
    }

    public final java.lang.String k8() {
        int size = this.f138528m.f247131g.size();
        if (size <= 0) {
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f490502ww);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        return getContext().getResources().getString(com.tencent.mm.R.string.f490502ww) + '(' + size + '/' + this.Q + ')';
    }

    public final void l8(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = this.f138528m.f247131g;
        kotlin.jvm.internal.o.f(arrayList, "getSelectedMediaItems(...)");
        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(arrayList)).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            u23.f0 f0Var = u23.f0.f424074a;
            android.net.Uri c17 = f0Var.c(galleryItem$MediaItem);
            java.lang.String b17 = f0Var.b(galleryItem$MediaItem);
            if (galleryItem$MediaItem.getType() == 1) {
                if (kotlin.jvm.internal.o.b(galleryItem$MediaItem.f138438p, "edit")) {
                    java.lang.String str = galleryItem$MediaItem.f138432g;
                    if (!(str == null || str.length() == 0)) {
                        java.lang.String str2 = galleryItem$MediaItem.f138432g;
                        if (!(str2 == null || str2.length() == 0)) {
                            kotlin.jvm.internal.o.d(str2);
                            list.add(new jz5.l(str2, java.lang.Long.valueOf(galleryItem$MediaItem.f138435m)));
                        }
                    }
                }
                java.lang.String d17 = dw3.c0.f244182a.d(this.f138516f.getContext(), null, galleryItem$MediaItem.f138430e, b17, c17);
                if (!(d17 == null || d17.length() == 0)) {
                    list.add(new jz5.l(d17, java.lang.Long.valueOf(galleryItem$MediaItem.f138435m)));
                }
            } else if (galleryItem$MediaItem.getType() == 2) {
                java.lang.String h17 = dw3.c0.f244182a.h(this.f138516f.getContext(), null, galleryItem$MediaItem.f138430e, b17, c17);
                if (!(h17 == null || h17.length() == 0)) {
                    list2.add(new jz5.l(h17, java.lang.Long.valueOf(galleryItem$MediaItem.f138435m)));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem
            r1 = 0
            if (r0 == 0) goto L4a
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r2 = 1
            r0.inJustDecodeBounds = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem r9 = (com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) r9
            java.lang.String r9 = r9.f138430e
            com.tencent.mm.graphics.e.d(r9, r0)
            int r9 = r0.outWidth
            int r0 = r0.outHeight
            if (r9 == 0) goto L2f
            if (r0 != 0) goto L1d
            goto L2f
        L1d:
            float r9 = (float) r9
            float r0 = (float) r0
            float r9 = r9 / r0
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2f
            r0 = 1073741824(0x40000000, float:2.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L2f
            r9 = r2
            goto L30
        L2f:
            r9 = r1
        L30:
            if (r9 != 0) goto L49
            r9 = 2131768830(0x7f1035fe, float:1.9168917E38)
            java.lang.String r3 = r8.getString(r9)
            java.lang.String r4 = ""
            r9 = 2131756151(0x7f100477, float:1.9143201E38)
            java.lang.String r5 = r8.getString(r9)
            r6 = 0
            r7 = 0
            r2 = r8
            db5.e1.E(r2, r3, r4, r5, r6, r7)
            return r1
        L49:
            return r2
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderAlbumUI.m7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            r1 = 0
            if (r0 == 0) goto Ld4
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = "key_filter_hdr_video"
            boolean r0 = r0.getBooleanExtra(r2, r1)
            java.lang.String r2 = "getOriginalPath(...)"
            if (r0 == 0) goto L2e
            j33.p r0 = j33.p.f297451a
            r3 = r11
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r3 = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r3
            java.lang.String r3 = r3.f138430e
            kotlin.jvm.internal.o.f(r3, r2)
            boolean r0 = r0.b(r3)
            if (r0 != 0) goto L2e
            r11 = 2131768833(0x7f103601, float:1.9168924E38)
            java.lang.String r11 = r10.getString(r11)
            db5.e1.W(r10, r11)
            return r1
        L2e:
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r3 = "key_max_video_duration"
            int r0 = r0.getIntExtra(r3, r1)
            android.content.Intent r3 = r10.getIntent()
            java.lang.String r4 = "key_min_video_duration"
            int r3 = r3.getIntExtra(r4, r1)
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r11 = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r11
            java.lang.String r4 = r11.f138430e
            int r4 = j33.d0.a(r4)
            if (r4 <= r0) goto L57
            r11 = 2131768837(0x7f103605, float:1.9168932E38)
            java.lang.String r11 = r10.getString(r11)
            db5.e1.W(r10, r11)
            return r1
        L57:
            if (r4 >= r3) goto L64
            r11 = 2131768838(0x7f103606, float:1.9168934E38)
            java.lang.String r11 = r10.getString(r11)
            db5.e1.W(r10, r11)
            return r1
        L64:
            int r0 = r11.f138448z
            int r3 = r11.f138447y
            r4 = 1
            if (r0 == 0) goto L80
            if (r3 != 0) goto L6e
            goto L80
        L6e:
            float r0 = (float) r0
            float r3 = (float) r3
            float r0 = r0 / r3
            r3 = 1077936128(0x40400000, float:3.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L80
            r3 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L80
            r0 = r4
            goto L81
        L80:
            r0 = r1
        L81:
            r3 = 2131756151(0x7f100477, float:1.9143201E38)
            if (r0 != 0) goto L9a
            r11 = 2131768835(0x7f103603, float:1.9168928E38)
            java.lang.String r5 = r10.getString(r11)
            java.lang.String r6 = ""
            java.lang.String r7 = r10.getString(r3)
            r8 = 0
            r9 = 0
            r4 = r10
            db5.e1.E(r4, r5, r6, r7, r8, r9)
            return r1
        L9a:
            java.lang.String r0 = r11.f138430e
            kotlin.jvm.internal.o.f(r0, r2)
            ku5.u0 r2 = ku5.t0.f312615d
            com.tencent.mm.plugin.finder.ui.o0 r5 = new com.tencent.mm.plugin.finder.ui.o0
            r5.<init>(r0)
            ku5.t0 r2 = (ku5.t0) r2
            r2.g(r5)
            j33.e r0 = j33.e.f297434a
            r2 = 25
            int r0 = r0.c(r2, r11)
            if (r0 != 0) goto Lb6
            r1 = r4
        Lb6:
            if (r1 != 0) goto Ld4
            java.lang.String r0 = r11.f138444v
            java.lang.String r2 = r11.f138445w
            java.lang.String r11 = r11.f138430e
            r10.o8(r0, r2, r11)
            r11 = 2131768807(0x7f1035e7, float:1.916887E38)
            java.lang.String r5 = r10.getString(r11)
            java.lang.String r6 = ""
            java.lang.String r7 = r10.getString(r3)
            r8 = 0
            r9 = 0
            r4 = r10
            db5.e1.E(r4, r5, r6, r7, r8, r9)
        Ld4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderAlbumUI.n7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):boolean");
    }

    public final void n8(java.lang.String str, java.lang.String str2, int i17, long j17, int i18) {
        com.tencent.mm.autogen.mmdata.rpt.FinderPostSelectPageActionStruct finderPostSelectPageActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPostSelectPageActionStruct();
        finderPostSelectPageActionStruct.f57553d = finderPostSelectPageActionStruct.b("ClickId", str, true);
        finderPostSelectPageActionStruct.f57554e = finderPostSelectPageActionStruct.b("PostId", str2, true);
        finderPostSelectPageActionStruct.f57555f = i17;
        finderPostSelectPageActionStruct.f57556g = j17;
        finderPostSelectPageActionStruct.f57557h = i18;
        finderPostSelectPageActionStruct.k();
        java.lang.String n17 = finderPostSelectPageActionStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "report21149 ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
    }

    public final void o8(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[1] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[2] = str3;
        g0Var.d(19441, objArr);
        g0Var.C(1253L, 33L, 1L);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        e33.b0 b0Var;
        e33.b0 b0Var2;
        e33.b0 b0Var3;
        e33.b0 b0Var4;
        com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "onActivityResult requestCode:" + i17 + " resultCode:" + i18 + " isFromShootComposing:" + this.B2);
        if (i17 == 1001 && i18 == -1) {
            setResult(-1, intent);
            finish();
            return;
        }
        if (i18 == 25 || i18 == 37 || i18 == 39) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("preview_image_list") : null;
            if (stringArrayListExtra != null && (b0Var = this.f138528m) != null) {
                java.util.ArrayList l17 = t23.p0.l();
                if (l17 == null) {
                    l17 = this.f138528m.f247130f;
                }
                b0Var.O(stringArrayListExtra, l17);
                this.f138528m.notifyDataSetChanged();
                com.tencent.mm.plugin.finder.ui.sl slVar = this.C2;
                if (slVar != null) {
                    slVar.d(stringArrayListExtra.size());
                }
                c8(stringArrayListExtra.size());
            }
            N7();
            return;
        }
        if (i17 == 298) {
            if (i18 != 48) {
                finish();
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("preview_image_list") : null;
            if (stringArrayListExtra2 == null || (b0Var4 = this.f138528m) == null) {
                return;
            }
            java.util.ArrayList l18 = t23.p0.l();
            if (l18 == null) {
                l18 = this.f138528m.f247130f;
            }
            b0Var4.O(stringArrayListExtra2, l18);
            this.f138528m.notifyDataSetChanged();
            com.tencent.mm.plugin.finder.ui.sl slVar2 = this.C2;
            if (slVar2 != null) {
                slVar2.d(stringArrayListExtra2.size());
            }
            c8(stringArrayListExtra2.size());
            N7();
            return;
        }
        if (292 == i17 || 296 == i17 || 297 == i17) {
            if (!this.B2 || i18 != -1) {
                k3(this, intent != null ? (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO") : null, ut3.f.f431176c.f431178b);
                return;
            }
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        if (294 == i17 && i18 == -1) {
            ((ez0.i) this.H2).getClass();
            az0.i5.x(az0.i5.f15557a, false, false, 3, null);
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        if (4382 == i17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent != null ? intent.getStringArrayListExtra("CropImage_OutputPath_List") : null;
            java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent != null ? intent.getStringArrayListExtra("key_select_video_list") : null;
            if (stringArrayListExtra3 != null) {
                arrayList.addAll(stringArrayListExtra3);
            }
            if (stringArrayListExtra4 != null) {
                arrayList.addAll(stringArrayListExtra4);
            }
            if ((!arrayList.isEmpty()) && (b0Var3 = this.f138528m) != null) {
                android.net.Uri uri = t23.o2.f415216e;
                b0Var3.O(arrayList, t23.n2.f415209a.f415220d);
                this.f138528m.notifyDataSetChanged();
                c8(arrayList.size());
            }
            N7();
            return;
        }
        if (295 == i17 && i18 == -1) {
            setResult(-1);
            finish();
            return;
        }
        if (288 == i17) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra5 = intent != null ? intent.getStringArrayListExtra("preview_image_list") : null;
            if (stringArrayListExtra5 == null || (b0Var2 = this.f138528m) == null) {
                return;
            }
            java.util.ArrayList l19 = t23.p0.l();
            if (l19 == null) {
                l19 = this.f138528m.f247130f;
            }
            b0Var2.O(stringArrayListExtra5, l19);
            this.f138528m.notifyDataSetChanged();
            c8(stringArrayListExtra5.size());
        }
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        getContext().setResult(0);
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderAlbumUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (!this.K2.contains(java.lang.Integer.valueOf(this.E1))) {
            ut3.f.f431176c.f431177a = null;
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f128509z2 = java.lang.System.currentTimeMillis();
        xo4.b.a(xo4.b.f455768a, 100, 0, 0L, 0, this.A2, null, null, 108, null);
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        ((qs2.q) this.F2).getClass();
        set.add(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        set.add(com.tencent.mm.plugin.finder.ui.n0.class);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void updateOptionMenuText(int i17, java.lang.String str) {
        super.updateOptionMenuText(i17, k8());
    }
}
