package com.tencent.mm.plugin.gallery.ui;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.appdownload.j1.CTRL_INDEX)
@ul5.d(0)
/* loaded from: classes10.dex */
public class ImagePreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: k2, reason: collision with root package name */
    public static final /* synthetic */ int f138572k2 = 0;
    public int A;
    public boolean A1;
    public boolean B;
    public boolean B1;
    public com.tencent.mm.ui.widget.imageview.WeImageView D;
    public boolean E;
    public boolean E1;
    public android.widget.TextView F;
    public android.view.ViewGroup G;
    public android.view.ViewGroup H;
    public android.view.View K1;
    public android.widget.CheckBox L1;
    public android.widget.TextView Q;
    public i33.r1 Q1;
    public android.view.View R;
    public i33.p1 R1;
    public android.widget.TextView S;
    public i33.u1 S1;
    public android.widget.TextView T;
    public i33.x1 T1;
    public android.widget.TextView U;
    public android.view.View V;
    public android.widget.TextView W;
    public android.widget.ProgressBar X;
    public java.lang.String Y;
    public int Z;

    /* renamed from: b2, reason: collision with root package name */
    public java.lang.String f138575b2;

    /* renamed from: c2, reason: collision with root package name */
    public java.lang.String f138576c2;

    /* renamed from: d, reason: collision with root package name */
    public k33.i f138577d;

    /* renamed from: e, reason: collision with root package name */
    public e33.v2 f138579e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f138581f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f138583g;

    /* renamed from: g2, reason: collision with root package name */
    public java.lang.String f138584g2;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f138585h;

    /* renamed from: i2, reason: collision with root package name */
    public java.lang.String f138588i2;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f138591m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f138592n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f138593o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f138594p;

    /* renamed from: p0, reason: collision with root package name */
    public int f138595p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f138596p1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f138597q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f138598r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f138599s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f138600t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f138601u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f138602v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f138603w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f138604x;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f138606x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f138607y;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f138609y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f138610z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f138611z1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f138587i = new java.util.HashMap();
    public float C = 0.0f;
    public boolean I = true;

    /* renamed from: J, reason: collision with root package name */
    public boolean f138573J = true;
    public boolean K = true;
    public int L = 0;
    public boolean M = false;
    public long N = 0;
    public int P = 10;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f138605x0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public int f138608y0 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public final java.text.SimpleDateFormat f138590l1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
    public boolean C1 = false;
    public boolean D1 = false;
    public boolean F1 = false;
    public r15.b G1 = null;
    public boolean H1 = false;
    public boolean I1 = true;
    public boolean J1 = false;
    public int M1 = 0;
    public java.lang.String N1 = "";
    public boolean O1 = false;
    public int P1 = -1;
    public final boolean U1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_album_saveinstance_enable, false);
    public boolean V1 = false;
    public long W1 = 26214400;
    public boolean X1 = false;
    public final s23.o Y1 = new e33.y3(this);
    public boolean Z1 = false;

    /* renamed from: a2, reason: collision with root package name */
    public t23.n0 f138574a2 = null;

    /* renamed from: d2, reason: collision with root package name */
    public java.lang.String f138578d2 = "";

    /* renamed from: e2, reason: collision with root package name */
    public final java.util.HashMap f138580e2 = new java.util.HashMap();

    /* renamed from: f2, reason: collision with root package name */
    public int f138582f2 = 300000;

    /* renamed from: h2, reason: collision with root package name */
    public int f138586h2 = 1000;

    /* renamed from: j2, reason: collision with root package name */
    public wu5.c f138589j2 = null;

    public static void T6(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, boolean z17) {
        if (z17) {
            imagePreviewUI.fullScreenNoTitleBar(false);
            imagePreviewUI.w7(z17);
            imagePreviewUI.v7(true);
            imagePreviewUI.getBodyView().postDelayed(new e33.j4(imagePreviewUI), 256L);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                imagePreviewUI.getWindow().setNavigationBarContrastEnforced(false);
                return;
            }
            return;
        }
        imagePreviewUI.fullScreenNoTitleBar(true);
        imagePreviewUI.w7(z17);
        imagePreviewUI.v7(false);
        imagePreviewUI.getBodyView().postDelayed(new e33.k4(imagePreviewUI), 256L);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            imagePreviewUI.getWindow().setNavigationBarContrastEnforced(true);
        }
    }

    public final void A7(boolean z17, boolean z18, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        if (z18 && z17 && j33.d0.j(this.f138592n, true)) {
            this.W.setVisibility(8);
            this.f138607y.setVisibility(8);
            this.H.setVisibility(8);
            X6(true);
            G7(this.f138575b2, galleryItem$MediaItem, z17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0187 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B7(java.lang.String r16, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.B7(java.lang.String, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem, boolean):boolean");
    }

    public final void C7(java.lang.String str) {
        if (this.f138591m.size() < 9 || this.f138591m.contains(str) || l7() || this.f138609y1) {
            this.Q.setEnabled(true);
            this.Q.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        } else {
            this.Q.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f479550ab1));
            this.Q.setEnabled(false);
        }
    }

    public final void D7(boolean z17) {
        if (!this.K || this.f138579e == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("image_preview_photo_edit_red_dot", gm0.j1.b().h(), 1);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_photo_edit_red_dot_show_count, 0);
        int o17 = J2.o("photo_edit_red_dot_show_count", 0);
        if (z17) {
            o17++;
            J2.A("photo_edit_red_dot_show_count", o17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "redDotShowCount:%d hasShowCount:%d", java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(o17));
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a76 = a7();
        if (o17 >= Ni || !(a76 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem)) {
            android.view.View view = this.R;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updatePhotoEditRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updatePhotoEditRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.R;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updatePhotoEditRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updatePhotoEditRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0044, code lost:
    
        if (r1.getType() == 1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E7(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.E7(java.lang.String):void");
    }

    public final void F7(boolean z17) {
        if (z17) {
            this.f138602v.setImageResource(com.tencent.mm.R.raw.radio_checked);
            this.f138602v.setContentDescription(getResources().getString(com.tencent.mm.R.string.fhk));
        } else {
            this.f138602v.setImageResource(com.tencent.mm.R.raw.radio_off_white);
            this.f138602v.setContentDescription(getResources().getString(com.tencent.mm.R.string.fhm));
        }
    }

    public final void G7(java.lang.String str, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, boolean z17) {
        int i17 = t23.p0.k().f415298g;
        int i18 = t23.p0.k().f415297f;
        boolean z18 = i18 != 16 && (i17 == 2 || i17 == 3);
        if (galleryItem$MediaItem != null && galleryItem$MediaItem.getType() == 2 && i18 == 4 && !z17 && !z18) {
            this.D.setVisibility(8);
            this.F.setVisibility(8);
            return;
        }
        if (this.A != 1) {
            this.D.setVisibility(0);
            this.F.setVisibility(0);
        } else if (this.H1) {
            this.D.setVisibility(0);
            this.F.setVisibility(0);
        } else {
            this.D.setVisibility(8);
            this.F.setVisibility(8);
        }
        if (this.f138591m.contains(str)) {
            I7(true);
        } else {
            I7(false);
        }
    }

    public void H7(int i17) {
        if (i17 > 0) {
            this.A = i17;
            this.Q1.Y0(e7());
            if (!l7() || this.f138609y1) {
                return;
            }
            this.B = true;
            this.f138598r = true;
            this.Q.setVisibility(4);
            i7();
        }
    }

    public final void I7(boolean z17) {
        if (z17) {
            this.D.setImageResource(com.tencent.mm.R.raw.radio_checked);
            this.D.setContentDescription(getResources().getString(com.tencent.mm.R.string.fhj));
        } else {
            this.D.setImageResource(com.tencent.mm.R.raw.radio_off_white);
            this.D.setContentDescription(getResources().getString(com.tencent.mm.R.string.fhl));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J7() {
        /*
            r11 = this;
            java.lang.Class<wg3.j> r0 = wg3.j.class
            i95.m r0 = i95.n0.c(r0)
            wg3.j r0 = (wg3.j) r0
            kc5.x r0 = (kc5.x) r0
            boolean r0 = r0.Ri()
            r1 = 0
            if (r0 == 0) goto L62
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "GalleryUI_ToUser"
            java.lang.String r0 = r0.getStringExtra(r2)
            r2 = 1
            if (r0 == 0) goto L40
            int r3 = r0.length()
            r4 = r1
        L23:
            if (r4 >= r3) goto L37
            int r5 = r0.codePointAt(r4)
            boolean r6 = java.lang.Character.isWhitespace(r5)
            if (r6 != 0) goto L31
            r3 = r1
            goto L38
        L31:
            int r5 = java.lang.Character.charCount(r5)
            int r4 = r4 + r5
            goto L23
        L37:
            r3 = r2
        L38:
            if (r3 == 0) goto L3b
            goto L40
        L3b:
            boolean r0 = com.tencent.mm.storage.z3.i4(r0)
            goto L41
        L40:
            r0 = r1
        L41:
            if (r0 != 0) goto L44
            goto L62
        L44:
            wu5.c r0 = r11.f138589j2
            if (r0 == 0) goto L4b
            r0.cancel(r2)
        L4b:
            ku5.u0 r0 = ku5.t0.f312615d
            e33.n3$$f r1 = new e33.n3$$f
            r1.<init>()
            ku5.t0 r0 = (ku5.t0) r0
            r0.getClass()
            r2 = 0
            java.lang.String r4 = "availableCountJob"
            wu5.c r0 = r0.t(r1, r2, r4)
            r11.f138589j2 = r0
            return
        L62:
            android.view.View r0 = r11.K1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.add(r2)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r5 = "updateSendAsMediaGroupViews"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI"
            java.lang.String r4 = "updateSendAsMediaGroupViews"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            android.widget.CheckBox r0 = r11.L1
            r0.setChecked(r1)
            r11.J1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.J7():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x053d, code lost:
    
        if (r4 <= ip.c.a()) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r27) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.K7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem):void");
    }

    public final void U6(boolean z17) {
        if (this.f138592n == null || !t21.d3.s() || this.L != 3 || !this.f138597q) {
            X6(true);
            return;
        }
        java.util.Iterator it = this.f138592n.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            long k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
            if (galleryItem$MediaItem.getType() == 2) {
                long f76 = f7();
                if (k17 > f76) {
                    X6(false);
                    if (z17) {
                        x7(getString(com.tencent.mm.R.string.fhq, j33.d0.e(f76)));
                        return;
                    }
                    return;
                }
            }
            if (galleryItem$MediaItem.getType() == 1) {
                long c76 = c7();
                if (k17 > c76) {
                    X6(false);
                    if (z17) {
                        x7(getString(com.tencent.mm.R.string.fhp, j33.d0.e(c76)));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void V6(android.content.Intent intent, boolean z17, final boolean z18) {
        u23.f0 f0Var;
        final android.content.Intent intent2;
        final boolean z19;
        java.util.ArrayList arrayList;
        int i17;
        final boolean z27;
        java.lang.String str;
        long k17;
        java.lang.Boolean bool;
        boolean z28;
        java.util.ArrayList<java.lang.String> arrayList2;
        java.util.ArrayList<java.lang.String> arrayList3;
        java.util.ArrayList<java.lang.String> arrayList4;
        java.util.ArrayList<java.lang.String> arrayList5;
        p23.c cVar;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        intent.putExtra("CropImage_Compress_Img", z17 ? true : z18);
        java.util.ArrayList d76 = d7();
        if (z17 || this.A1) {
            t23.p0.d(d76, null);
        }
        java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList7 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList8 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList9 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList10 = new java.util.ArrayList<>();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList11 = new java.util.ArrayList<>();
        intent.putExtra("KSEGMENTMEDIAEDITID", this.f138578d2);
        if (d76 == null || d76.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "no img selected. keep current ui.");
            return;
        }
        java.util.Iterator it = d76.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            f0Var = u23.f0.f424074a;
            if (!hasNext) {
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem e17 = t23.p0.e(str2);
            if (e17 == null) {
                e17 = t23.p0.g(str2);
            }
            java.util.Iterator it6 = it;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = e17;
            if (galleryItem$MediaItem == null) {
                k17 = 0;
                str = str2;
            } else {
                str = str2;
                k17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem.f138430e);
            }
            if (galleryItem$MediaItem != null) {
                z28 = (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) && ((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem).f138425w;
                bool = bool2;
            } else {
                bool = bool2;
                z28 = false;
            }
            if (galleryItem$MediaItem == null || !(galleryItem$MediaItem.getType() == 6 || z28)) {
                java.util.ArrayList<java.lang.String> arrayList12 = arrayList7;
                java.util.ArrayList<java.lang.String> arrayList13 = arrayList8;
                if (galleryItem$MediaItem == null || galleryItem$MediaItem.getType() != 2) {
                    arrayList2 = arrayList12;
                    arrayList3 = arrayList13;
                    java.lang.String str3 = (galleryItem$MediaItem == null || galleryItem$MediaItem.getType() == 2 || !galleryItem$MediaItem.f138438p.equals("edit") || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem.f138432g)) ? str : galleryItem$MediaItem.f138432g;
                    if (galleryItem$MediaItem != null) {
                        str3 = dw3.c0.f244182a.d(getContext(), null, str3, f0Var.b(galleryItem$MediaItem), f0Var.c(galleryItem$MediaItem));
                    }
                    java.lang.String str4 = str3;
                    if (!this.V1 || k17 <= this.W1 || k17 > f7() || !this.X1) {
                        arrayList6.add(str4);
                        arrayList10.add(str4);
                        arrayList11.add(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, 0L, str4, "", ""));
                    } else {
                        arrayList3.add(galleryItem$MediaItem.f138430e);
                        java.lang.String str5 = galleryItem$MediaItem.f138429d;
                        if (str5 != null) {
                            arrayList9.add(str5);
                        } else {
                            arrayList9.add("");
                        }
                    }
                } else if (!this.V1 || k17 <= j33.d0.h() || k17 > f7() || !this.X1) {
                    arrayList3 = arrayList13;
                    java.lang.String h17 = dw3.c0.f244182a.h(getContext(), null, galleryItem$MediaItem.f138438p.equals("video_edit") ? galleryItem$MediaItem.f138430e : str, f0Var.b(galleryItem$MediaItem), f0Var.c(galleryItem$MediaItem));
                    arrayList2 = arrayList12;
                    arrayList2.add(h17);
                    arrayList10.add(h17);
                } else {
                    arrayList3 = arrayList13;
                    arrayList3.add(galleryItem$MediaItem.f138430e);
                    java.lang.String str6 = galleryItem$MediaItem.f138429d;
                    if (str6 != null) {
                        arrayList9.add(str6);
                    } else {
                        arrayList9.add("");
                    }
                    arrayList2 = arrayList12;
                }
                arrayList8 = arrayList3;
                arrayList7 = arrayList2;
                it = it6;
                bool2 = bool;
            } else {
                if (!this.V1 || k17 <= this.W1 || k17 > c7() || !this.X1) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem D7 = z28 ? com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.D7((com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) galleryItem$MediaItem) : (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem;
                    arrayList4 = arrayList7;
                    arrayList5 = arrayList8;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "select type is LivePhoto >> isValid: %d, state: %d, mediaId: %d", java.lang.Integer.valueOf(D7.H), java.lang.Integer.valueOf(D7.A), java.lang.Long.valueOf(D7.f138434i));
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    kotlin.jvm.internal.o.g(context, "context");
                    if (D7.H == 1 && D7.A == 1) {
                        cVar = new p23.c(true, "");
                    } else {
                        java.lang.String d17 = dw3.c0.f244182a.d(context, null, D7.f138433h, f0Var.b(D7), f0Var.c(D7));
                        cVar = new p23.c(false, d17 != null ? d17 : "");
                    }
                    if (cVar.f351428a) {
                        arrayList11.add(D7);
                    } else {
                        java.lang.String str7 = cVar.f351429b;
                        if (str7.isEmpty()) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewUI", "getFinalPath isEmpty");
                        } else {
                            arrayList6.add(str7);
                            arrayList10.add(str7);
                            com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem galleryItem$ImageMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem) com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, galleryItem$MediaItem.f138434i, cVar.f351429b, "", "");
                            galleryItem$ImageMediaItem.f138424v = 1;
                            arrayList11.add(galleryItem$ImageMediaItem);
                        }
                    }
                } else {
                    arrayList8.add(galleryItem$MediaItem.f138430e);
                    java.lang.String str8 = galleryItem$MediaItem.f138429d;
                    if (str8 != null) {
                        arrayList9.add(str8);
                    } else {
                        arrayList9.add("");
                    }
                    arrayList4 = arrayList7;
                    arrayList5 = arrayList8;
                }
                arrayList7 = arrayList4;
                it = it6;
                bool2 = bool;
                arrayList8 = arrayList5;
            }
        }
        java.lang.Boolean bool3 = bool2;
        java.util.ArrayList<java.lang.String> arrayList14 = arrayList7;
        java.util.ArrayList<java.lang.String> arrayList15 = arrayList8;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "dealWithSend, enableVLog:%s, forTimeline:%s,mixMediaList size:%d", java.lang.Boolean.valueOf(this.f138605x0), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(arrayList10.size()));
        java.util.ArrayList arrayList16 = new java.util.ArrayList();
        java.util.ArrayList arrayList17 = new java.util.ArrayList();
        int[] iArr = new int[this.A];
        java.util.ArrayList arrayList18 = this.f138592n;
        if (arrayList18 != null) {
            java.util.Iterator it7 = arrayList18.iterator();
            int i18 = 0;
            while (it7.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it7.next();
                android.net.Uri c17 = f0Var.c(galleryItem$MediaItem2);
                java.lang.String b17 = f0Var.b(galleryItem$MediaItem2);
                java.util.Iterator it8 = it7;
                java.util.ArrayList<? extends android.os.Parcelable> arrayList19 = arrayList11;
                if (galleryItem$MediaItem2.getType() == 1) {
                    if (!galleryItem$MediaItem2.f138438p.equals("edit") || com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$MediaItem2.f138432g)) {
                        arrayList16.add(dw3.c0.f244182a.d(getContext(), null, galleryItem$MediaItem2.f138430e, b17, c17));
                    } else {
                        arrayList16.add(galleryItem$MediaItem2.f138432g);
                    }
                    iArr[i18] = 1;
                    i18++;
                } else if (galleryItem$MediaItem2.getType() == 2) {
                    arrayList17.add(dw3.c0.f244182a.h(getContext(), null, galleryItem$MediaItem2.f138430e, b17, c17));
                    iArr[i18] = 2;
                    i18++;
                } else if (galleryItem$MediaItem2.getType() == 6) {
                    arrayList16.add(dw3.c0.f244182a.d(getContext(), null, galleryItem$MediaItem2.o(), b17, c17));
                    iArr[i18] = 1;
                    i18++;
                }
                it7 = it8;
                arrayList11 = arrayList19;
            }
        }
        java.util.ArrayList<? extends android.os.Parcelable> arrayList20 = arrayList11;
        if (this.f138605x0 && j33.d0.j(this.f138592n, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "try send vlog, videoList:%s, imageList:%s", java.lang.Integer.valueOf(arrayList17.size()), java.lang.Integer.valueOf(arrayList16.size()));
            if (jt3.h.f301628l.a(-1, arrayList16, arrayList17) == 4) {
                com.tencent.mm.plugin.gallery.ui.VLogPreloadUI.f138639d.a(this, arrayList17, arrayList16, iArr, null);
                return;
            }
        }
        java.util.ArrayList arrayList21 = new java.util.ArrayList();
        if (this.f138609y1) {
            java.util.ArrayList arrayList22 = this.f138592n;
            if (arrayList22 != null) {
                java.util.Iterator it9 = arrayList22.iterator();
                while (it9.hasNext()) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem3 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it9.next();
                    if (galleryItem$MediaItem3 != null) {
                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f17 = t23.p0.f(galleryItem$MediaItem3.f138430e);
                        if (f17 == null) {
                            arrayList21.add(galleryItem$MediaItem3);
                        } else {
                            arrayList21.add(f17);
                        }
                    }
                }
            }
        } else {
            arrayList21 = this.f138592n;
        }
        if (this.H1) {
            z19 = z17;
            if (z19) {
                intent2 = intent;
                z27 = z18;
                if (s23.n.f402309d.e(arrayList21, new yz5.a() { // from class: e33.n3$$o
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        int i19 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
                        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.this.V6(intent2, z19, z27);
                        return null;
                    }
                })) {
                    g7();
                    return;
                }
            } else {
                intent2 = intent;
                z27 = z18;
            }
            if (z19 && s23.n.f402309d.e(arrayList21, new yz5.a() { // from class: e33.n3$$p
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i19 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
                    com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.this.V6(intent2, z19, z27);
                    return null;
                }
            })) {
                g7();
                return;
            }
        } else {
            intent2 = intent;
            z19 = z17;
            r23.j jVar = r23.j.f368827a;
            if (z19 && jVar.b(arrayList21, new yz5.a() { // from class: e33.n3$$q
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i19 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
                    com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.this.V6(intent2, z19, z18);
                    return null;
                }
            })) {
                g7();
                return;
            } else if (z19 && jVar.b(arrayList21, new yz5.a() { // from class: e33.n3$$r
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i19 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
                    com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.this.V6(intent2, z19, z18);
                    return null;
                }
            })) {
                g7();
                return;
            }
        }
        boolean z29 = t23.p0.k().f415297f == 14;
        if ((z19 || z29) && arrayList6.size() == 0 && arrayList14.size() == 1) {
            int intExtra = (getIntent().getIntExtra("key_edit_video_max_time_length", 10) * 1000) + 500;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "maxDuration=%s", java.lang.Integer.valueOf(intExtra));
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem e18 = t23.p0.e(arrayList14.get(0));
            if (e18 == null || !(e18 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem)) {
                arrayList = arrayList17;
            } else {
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) e18;
                arrayList = arrayList17;
                if (galleryItem$VideoMediaItem.f138446x != -1) {
                    android.net.Uri c18 = f0Var.c(e18);
                    java.lang.String b18 = f0Var.b(e18);
                    java.util.ArrayList arrayList23 = new java.util.ArrayList();
                    arrayList23.add(dw3.c0.f244182a.h(getContext(), null, e18.f138430e, b18, c18));
                    t23.p0.d(arrayList23, null);
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("K_SEGMENTVIDEOPATH", e18.f138430e);
                    intent3.putExtra("KSEGMENTVIDEOTHUMBPATH", e18.f138433h);
                    if (!z19) {
                        setResult(-1, intent3);
                        finish();
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "goto edit video path:%s", galleryItem$VideoMediaItem.f138430e);
                    jz5.l Ri = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ri();
                    java.lang.Object obj = Ri.f302833d;
                    java.lang.Object obj2 = Ri.f302834e;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "edit video path:%s thumb path:%s", obj, obj2);
                    com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider wi6 = ((ee0.b4) ((fe0.a4) i95.n0.c(fe0.a4.class))).wi(galleryItem$VideoMediaItem.f138430e, intExtra, (java.lang.String) obj, (java.lang.String) obj2, 35, d7());
                    wi6.f155676n = d11.s.fj().nj();
                    if (this.E1) {
                        wi6.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 65);
                    }
                    com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
                    java.util.HashMap hashMap = (java.util.HashMap) uICustomParam.f64779h;
                    hashMap.put("plugin_filter", java.lang.Boolean.TRUE);
                    hashMap.put("plugin_poi", bool3);
                    hashMap.put("plugin_tip", bool3);
                    hashMap.put("plugin_menu", bool3);
                    wi6.f155677o = uICustomParam;
                    if (galleryItem$VideoMediaItem.f138446x >= (this.P * 1000) + 500) {
                        this.C1 = true;
                        ut3.m.f431182a.f(getContext(), 4370, com.tencent.mm.R.anim.f477876e0, -1, wi6, 2, 0);
                        return;
                    }
                    boolean contains = ((java.util.ArrayList) t23.p0.j().f415240l).contains(galleryItem$VideoMediaItem.f138430e);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "haveDoEdit = " + contains);
                    if (contains) {
                        setResult(-1, intent3);
                        finish();
                        return;
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.N1)) {
                        bundle.putString("key_edit_video_bgm_listen_id", this.N1);
                        bundle.putBoolean("key_edit_video_bgm_is_major_owned", this.O1);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "listenId = " + this.N1);
                    ((wp4.b0) ((yc0.g) i95.n0.c(yc0.g.class))).wi(this, 4370, wi6, bundle);
                    this.D1 = true;
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewUI", "dealWithSend VideoMediaItem not found.");
        } else {
            arrayList = arrayList17;
        }
        if (this.G1 != null) {
            java.util.Iterator<java.lang.String> it10 = arrayList10.iterator();
            while (it10.hasNext()) {
                java.lang.String next = it10.next();
                if (arrayList6.contains(next)) {
                    i17 = 1;
                    break;
                } else if (arrayList14.contains(next)) {
                    i17 = 2;
                    break;
                }
            }
        }
        i17 = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "dealWithSend  quoteTarget:%d", java.lang.Integer.valueOf(i17));
        r15.b bVar = this.G1;
        if (bVar != null) {
            ok5.d.b(intent2, "key_quote_extcommon", bVar, new ok5.h());
        }
        intent2.putExtra("key_quote_msg_target", i17);
        int Y6 = Y6();
        if (this.J1 && Y6 >= 3) {
            byte[] bytes = (java.util.UUID.randomUUID().toString() + c01.id.c()).getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
            intent2.putExtra("key_select_media_group_id", g17);
            intent2.putExtra("key_select_media_group_count", Y6);
        }
        intent2.putStringArrayListExtra("CropImage_OutputPath_List", arrayList6);
        intent2.putStringArrayListExtra("key_select_video_list", arrayList14);
        intent2.putStringArrayListExtra("key_select_mix_media_list", arrayList10);
        intent2.putStringArrayListExtra("key_file_thumb_path", arrayList9);
        intent2.putStringArrayListExtra("key_select_file_list", arrayList15);
        intent2.putExtra("key_delete_origin_file", this.X1);
        intent2.putParcelableArrayListExtra("key_select_multi_pic_item", arrayList20);
        boolean booleanExtra = getIntent().getBooleanExtra("isTakePhoto", false);
        o23.n nVar = o23.m.f342426a;
        nVar.f342440n = 0;
        nVar.f342436j = arrayList16.size();
        nVar.f342437k = arrayList.size();
        nVar.f342441o = 1;
        t23.p0.j().f415236h.size();
        j33.d0.o(11610, (this.K ? 3 : 2) + "," + t23.p0.j().f415236h.size());
        t23.p0.j().f415236h.clear();
        intent2.getBooleanExtra("isPreviewPhoto", false);
        intent2.putExtra("isTakePhoto", booleanExtra);
        java.lang.String stringExtra = getIntent().getStringExtra("GalleryUI_ToUser");
        if (arrayList16.size() + arrayList.size() > 1) {
            intent2.putExtra("key_select_revoke_batch_id", dh3.c.f232489a.f(stringExtra, dh3.d.f232497f));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("GalleryUI_FromUser")) || "medianote".equals(stringExtra)) {
            setResult(-1, intent2);
            finish();
            return;
        }
        if (android.os.SystemClock.elapsedRealtime() - this.N < 1000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImagePreviewUI", "sendimg btn event frequence limit");
            return;
        }
        this.N = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "switch to SendImgProxyUI");
        intent2.setClassName(this, "com.tencent.mm.ui.chatting.SendImgProxyUI");
        intent2.putExtra("GalleryUI_FromUser", getIntent().getStringExtra("GalleryUI_FromUser"));
        intent2.putExtra("GalleryUI_ToUser", getIntent().getStringExtra("GalleryUI_ToUser"));
        intent2.putExtra("isSelectAlbum", getIntent().getBooleanExtra("isSelectAlbum", false));
        intent2.putExtra("CropImage_limit_Img_Size", this.W1);
        startActivityForResult(intent2, 4369);
    }

    public final void W6() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f138610z;
        if (b4Var != null && !b4Var.e()) {
            this.f138610z.d();
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new e33.i4(this), false);
        this.f138610z = b4Var2;
        b4Var2.c(350L, 350L);
    }

    public void X6(boolean z17) {
        i33.r1 r1Var = this.Q1;
        if (r1Var != null) {
            r1Var.k6(z17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r5 <= ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Y6() {
        /*
            r11 = this;
            java.util.ArrayList r0 = r11.f138592n
            if (r0 != 0) goto Le
            java.lang.String r0 = "MicroMsg.ImagePreviewUI"
            java.lang.String r1 = "getAvailableMediaGroupItemCount, mediaList is null, use cache"
            com.tencent.mars.xlog.Log.w(r0, r1)
            int r0 = r11.M1
            return r0
        Le:
            r1 = 0
            r2 = r1
            r3 = r2
        L11:
            int r4 = r0.size()
            if (r2 >= r4) goto L8a
            java.lang.Object r4 = r0.get(r2)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) r4
            java.lang.String r5 = r4.f138430e
            long r5 = com.tencent.mm.vfs.w6.k(r5)
            boolean r7 = r11.V1
            if (r7 == 0) goto L43
            long r7 = j33.d0.h()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 1
            if (r7 <= 0) goto L45
            java.lang.Class<e40.v> r7 = e40.v.class
            i95.m r7 = i95.n0.c(r7)
            e40.v r7 = (e40.v) r7
            d40.n r7 = (d40.n) r7
            long r9 = r7.Ai()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 > 0) goto L43
            goto L73
        L43:
            r8 = r1
            goto L73
        L45:
            t23.x1 r5 = t23.p0.k()
            int r5 = r5.f415297f
            int r6 = r4.getType()
            r7 = 2
            if (r6 == r7) goto L55
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L6f
        L55:
            r6 = r4
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r6 = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r6
            int r6 = r6.f138446x
            j33.e r7 = j33.e.f297434a
            int r5 = r7.a(r5)
            r7 = 3600000(0x36ee80, float:5.044674E-39)
            int r5 = java.lang.Math.max(r5, r7)
            if (r6 <= r5) goto L6a
            goto L6b
        L6a:
            r8 = r1
        L6b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
        L6f:
            boolean r8 = r5.booleanValue()
        L73:
            if (r8 == 0) goto L76
            goto L87
        L76:
            java.lang.String r4 = r4.f138438p
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r5 = "gif"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L85
            goto L87
        L85:
            int r3 = r3 + 1
        L87:
            int r2 = r2 + 1
            goto L11
        L8a:
            r11.M1 = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.Y6():int");
    }

    public final int Z6() {
        return t23.p0.k().f415297f == 15 ? com.tencent.mm.R.raw.checkbox_selected_game : t23.p0.k().f415297f == 28 ? com.tencent.mm.R.raw.checkbox_selected_finder_live : com.tencent.mm.R.raw.checkbox_selected_small;
    }

    public com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a7() {
        java.lang.String i17 = this.f138579e.i(this.f138593o.intValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "getCurrentMediaItem >> postion: %d path: %s", this.f138593o, i17);
        if (android.text.TextUtils.isEmpty(i17)) {
            return null;
        }
        return t23.p0.e(i17);
    }

    public final jz5.l b7(java.util.List list, java.util.List list2) {
        long j17;
        long longValue;
        java.lang.String str = "";
        java.util.ArrayList arrayList = this.f138585h;
        if (arrayList == null || arrayList.isEmpty()) {
            return new jz5.l("", 0L);
        }
        synchronized (this.f138587i) {
            if (((java.util.HashMap) this.f138587i).isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                    ((java.util.HashMap) this.f138587i).put(java.lang.Long.valueOf(galleryItem$MediaItem.f138434i), galleryItem$MediaItem);
                }
            }
            java.util.Iterator it6 = list2.iterator();
            j17 = 0;
            while (it6.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) ((java.util.HashMap) this.f138587i).get(java.lang.Long.valueOf(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next()).f138434i));
                if (galleryItem$MediaItem2 != null) {
                    j33.s sVar = j33.s.f297456a;
                    java.lang.String a17 = sVar.a(galleryItem$MediaItem2);
                    if (this.f138580e2.containsKey(a17)) {
                        longValue = ((java.lang.Long) this.f138580e2.get(a17)).longValue();
                    } else {
                        longValue = sVar.b(galleryItem$MediaItem2);
                        this.f138580e2.put(a17, java.lang.Long.valueOf(longValue));
                    }
                    j17 += longValue;
                }
            }
        }
        if (j17 > 1073741824) {
            str = java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((((float) j17) / 1024.0f) / 1024.0f) / 1024.0f));
        } else if (j17 > 1048576) {
            str = java.lang.String.format("%dMB", java.lang.Integer.valueOf((int) ((((float) j17) / 1024.0f) / 1024.0f)));
        } else if (j17 > 0) {
            str = java.lang.String.format("%dKB", java.lang.Long.valueOf(j17 / 1024));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "calculate totalLength: " + j17 + " finalStr: " + str);
        return new jz5.l(str, java.lang.Long.valueOf(j17));
    }

    public final long c7() {
        return this.V1 ? ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai() : this.W1;
    }

    public final java.util.ArrayList d7() {
        if (this.f138594p) {
            return this.f138591m;
        }
        if (this.f138591m == null) {
            return new java.util.ArrayList(1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f138591m.size());
        java.util.Iterator it = this.f138583g.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (this.f138591m.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        if (zo.e.e(this)) {
            setContentView(view);
            return;
        }
        if (!com.tencent.mm.ui.b4.c(this)) {
            com.tencent.mm.ui.bk.l0(com.tencent.mm.ui.bk.b(getWindow(), null), getBodyView());
            ((android.view.ViewGroup) getBodyView().getParent()).removeView(getBodyView());
            ((android.view.ViewGroup) getWindow().getDecorView()).addView(getBodyView(), 0);
            return;
        }
        getController().G0(getColor(com.tencent.mm.R.color.f479163rn));
        android.view.View bodyView = getBodyView();
        ((android.view.ViewGroup) bodyView.getParent()).removeView(bodyView);
        ((android.view.ViewGroup) getWindow().getDecorView()).addView(bodyView, 0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483436au4);
        kotlin.jvm.internal.o.g(findViewById, "<this>");
        com.tencent.mm.ui.a4.e(findViewById, true, false, 2, null);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
    }

    public java.lang.String e7() {
        return this.Q1.T6(this, t23.p0.k().f415297f, this.f138591m.size(), this.A, this.Y, false, this.f138592n);
    }

    public final long f7() {
        return this.V1 ? ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai() : j33.d0.h();
    }

    public final void g7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_Compress_Img", this.K ? true : !this.f138597q);
        intent.putStringArrayListExtra("preview_image_list", d7());
        intent.putExtra("show_photo_edit_tip", this.Z1);
        intent.putExtra("key_send_as_media_group", this.J1);
        setResult(0, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bkf;
    }

    public final void h7() {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "edit image path:%s mPosition:%s", this.f138579e.i(this.f138593o.intValue()), this.f138593o);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17 = this.f138579e.k(this.f138593o.intValue());
        if (k17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "[gotoPhotoEditUI] raw:%s orignal:%s", k17.f138431f, k17.f138430e);
            java.lang.String str = k17.f138431f;
            this.f138575b2 = str;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || this.f138594p) {
                this.f138575b2 = k17.getType() == 6 ? k17.o() : k17.f138430e;
                this.f138576c2 = "";
            } else {
                this.f138576c2 = k17.getType() == 6 ? k17.o() : k17.f138430e;
            }
            i33.u1 u1Var = this.S1;
            e33.n3$$c n3__c = new e33.n3$$c(this);
            u1Var.getClass();
            if (k17.getType() == 6) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) k17;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewLivePhotoEditUIC", "checkGoToEditPhoto is live state: " + galleryItem$LivePhotoMediaItem.A + " isValid: " + galleryItem$LivePhotoMediaItem.H);
                if (galleryItem$LivePhotoMediaItem.H == 1 && ((i17 = galleryItem$LivePhotoMediaItem.A) == 1 || i17 == 0)) {
                    android.app.Activity context = u1Var.getContext();
                    i33.t1 t1Var = new i33.t1(u1Var, galleryItem$LivePhotoMediaItem, n3__c);
                    kotlin.jvm.internal.o.g(context, "context");
                    db5.e1.C(context, i65.a.r(context, com.tencent.mm.R.string.mef), "", i65.a.r(context, com.tencent.mm.R.string.mee), i65.a.r(context, com.tencent.mm.R.string.f490347sg), false, t1Var, p23.b.f351427d);
                } else {
                    u1Var.f288274d = true;
                    u1Var.f288275e = galleryItem$LivePhotoMediaItem;
                    j7(true);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewLivePhotoEditUIC", "checkGoToEditPhoto >> no live photo id: " + k17.f138434i);
                u1Var.f288274d = false;
                u1Var.f288275e = null;
                j7(false);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "[gotoPhotoEditUI] item == null mPosition:%s", this.f138593o);
            this.f138575b2 = this.f138579e.i(this.f138593o.intValue());
            long intValue = this.f138593o.intValue();
            java.lang.String str2 = this.f138575b2;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, intValue, str2, str2, "edit");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(b17);
            t23.p0.p(arrayList);
            j7(false);
        }
        D7(true);
    }

    public final void i7() {
        if (this.B) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "hideVideoEditUI");
            this.S.setVisibility(8);
            this.W.setVisibility(8);
            this.T.setVisibility(8);
            this.f138607y.setVisibility(4);
            this.G.setVisibility(0);
            this.f138602v.setVisibility(4);
            this.f138603w.setVisibility(4);
            this.f138604x.setVisibility(4);
            return;
        }
        if (l7() && this.f138609y1) {
            l7();
            this.S.setVisibility(8);
            this.W.setVisibility(8);
            this.T.setVisibility(8);
            this.f138607y.setVisibility(0);
            this.G.setVisibility(0);
            this.f138602v.setVisibility(4);
            this.f138603w.setVisibility(4);
            this.f138604x.setVisibility(4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        ?? r112;
        int i17;
        boolean z17;
        java.lang.String str2;
        int i18;
        java.util.ArrayList arrayList;
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        this.S = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ghx);
        this.T = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ghz);
        this.U = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485385hi5);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hi6);
        this.V = findViewById;
        findViewById.postDelayed(new e33.s4(this), 100L);
        this.W = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ghy);
        this.X = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.oyv);
        this.A = getIntent().getIntExtra("max_select_count", 9);
        this.P = getIntent().getIntExtra("key_edit_video_max_time_length", 10);
        android.content.Intent intent = getIntent();
        this.f138583g = intent.getStringArrayListExtra("preview_image_list");
        this.f138592n = intent.getParcelableArrayListExtra("preview_media_item_list");
        this.F1 = intent.getBooleanExtra("key_from_c2c_recently_quickly_send", false);
        this.I1 = getIntent().getBooleanExtra("Gallery_LivePhoto_Auto_Enable", true);
        this.J1 = getIntent().getBooleanExtra("key_send_as_media_group", false);
        o23.m.f342426a.f342445s = this.F1;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("preview_image_media_id_list");
        if (this.f138592n == null && stringArrayListExtra != null && this.F1) {
            java.util.ArrayList mediaPaths = this.f138583g;
            boolean z18 = this.I1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Long.valueOf(java.lang.Long.parseLong(it.next())));
            }
            kotlin.jvm.internal.o.g(mediaPaths, "mediaPaths");
            new u23.e();
            java.util.HashMap Bi = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Bi(arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (arrayList2.size() != mediaPaths.size()) {
                throw new java.lang.RuntimeException("getImageMediaItem mediaIds.size != mediaPaths.size");
            }
            int size = arrayList2.size();
            for (int i19 = 0; i19 < size; i19++) {
                long longValue = ((java.lang.Number) arrayList2.get(i19)).longValue();
                java.lang.String str3 = (java.lang.String) mediaPaths.get(i19);
                if (Bi.containsKey(java.lang.Long.valueOf(longValue))) {
                    java.lang.Object obj = Bi.get(java.lang.Long.valueOf(longValue));
                    kotlin.jvm.internal.o.d(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.a(6, longValue);
                        a17.f138430e = ((hs.x) ((qk.s7) i95.n0.c(qk.s7.class))).wi(qk.k9.f364207d, java.lang.String.valueOf(longValue));
                        a17.f138433h = str3;
                        if (a17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) {
                            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) a17;
                            galleryItem$LivePhotoMediaItem.I = z18 ? 1 : 0;
                            galleryItem$LivePhotoMediaItem.f138424v = 1;
                        }
                        arrayList3.add(i19, a17);
                    }
                }
                arrayList3.add(i19, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(1, longValue, str3, str3, ""));
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
            this.f138592n = arrayList4;
            t23.p0.p(arrayList4);
            this.f138583g = new java.util.ArrayList();
            java.util.Iterator it6 = this.f138592n.iterator();
            while (it6.hasNext()) {
                this.f138583g.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next()).f138430e);
            }
        }
        this.f138608y0 = intent.getIntExtra("media_type", this.f138608y0);
        this.f138591m = new java.util.ArrayList();
        this.C = intent.getFloatExtra("key_support_max_ratio", 0.0f);
        java.util.ArrayList arrayList5 = this.f138583g;
        if (arrayList5 != null) {
            this.f138591m.addAll(arrayList5);
        }
        this.f138585h = t23.p0.l();
        boolean booleanExtra = intent.getBooleanExtra("preview_all", false);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(booleanExtra);
        objArr[1] = java.lang.Boolean.valueOf(this.f138585h == null);
        objArr[2] = java.lang.Integer.valueOf(this.A);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "preview all[%B] mediaitems is null[%B], selectLimit=[%d]", objArr);
        if (!booleanExtra || this.f138585h == null) {
            this.f138593o = 0;
        } else {
            this.f138594p = true;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intent.getIntExtra("preview_position", 0));
            this.f138593o = valueOf;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "start position=%d", valueOf);
            if (this.f138593o.intValue() < 0) {
                this.f138593o = 0;
            }
        }
        t23.p0.j().f415236h.put(java.lang.Integer.valueOf(this.f138593o.intValue()), java.lang.Boolean.TRUE);
        if (!this.f138594p && ((arrayList = this.f138591m) == null || arrayList.size() == 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewUI", "not preview all items and image paths is null or empty");
            finish();
            return;
        }
        this.f138601u = findViewById(com.tencent.mm.R.id.kms);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f486214km5);
        this.f138602v = weImageView;
        weImageView.setEnableColorFilter(false);
        this.f138603w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.km9);
        this.f138604x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.km8);
        this.f138607y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyu);
        this.f138597q = intent.getBooleanExtra("send_raw_img", false);
        this.f138598r = intent.getBooleanExtra("key_force_hide_edit_image_button", false);
        this.f138599s = intent.getBooleanExtra("key_force_show_raw_image_button", false);
        this.f138600t = intent.getBooleanExtra("key_is_raw_image_button_disable", false);
        this.L = intent.getIntExtra("query_source_type", 0);
        this.B = intent.getBooleanExtra("key_force_hide_edit_video_button", false);
        this.M = intent.getBooleanExtra("skip_preview_to_edit", false);
        this.E1 = intent.getBooleanExtra("key_from_sns_post_album_multi_tab", false);
        java.lang.Object a18 = ok5.d.a(getIntent(), "key_quote_extcommon");
        if (a18 instanceof r15.b) {
            this.G1 = (r15.b) a18;
        } else {
            this.G1 = null;
        }
        boolean n17 = j33.d0.n();
        this.f138605x0 = n17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "initView, enableVLog:%s", java.lang.Boolean.valueOf(n17));
        if (this.f138597q) {
            F7(true);
            if (t21.d3.s() && (((i18 = this.L) == 3 || i18 == 16) && this.f138597q)) {
                s7();
            } else {
                this.f138604x.setVisibility(8);
            }
        } else {
            F7(false);
            this.f138604x.setVisibility(8);
        }
        if (this.f138600t) {
            this.f138602v.setImageResource(com.tencent.mm.R.raw.radio_default_on);
        }
        this.f138602v.setEnabled(!this.f138600t);
        this.f138603w.setEnabled(!this.f138600t);
        java.util.ArrayList arrayList6 = this.f138591m;
        if (arrayList6 == null || arrayList6.size() != 1) {
            str = "GalleryUI_ToUser";
            r112 = 1;
            i17 = 8;
        } else {
            java.lang.String str4 = (java.lang.String) this.f138591m.get(0);
            java.util.ArrayList arrayList7 = this.f138592n;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (arrayList7 == null || arrayList7.isEmpty()) ? null : (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138592n.get(0);
            if (galleryItem$MediaItem != null) {
                j33.d0.k(android.text.TextUtils.equals(galleryItem$MediaItem.f138430e, str4) ? galleryItem$MediaItem.f138434i : 0L, str4, getIntent().getStringExtra("GalleryUI_ToUser"), this.K || !this.f138597q, 0, true, galleryItem$MediaItem);
            } else {
                j33.d0.k(0L, str4, getIntent().getStringExtra("GalleryUI_ToUser"), this.K || !this.f138597q, 0, true, null);
            }
            str = "GalleryUI_ToUser";
            i17 = 8;
            r112 = 1;
            j33.d0.p(this, 0L, str4, getIntent().getStringExtra("GalleryUI_ToUser"), this.K || !this.f138597q, 0, true);
        }
        this.f138603w.setText(getContext().getString(com.tencent.mm.R.string.f492182fj0));
        this.f138602v.setOnClickListener(new e33.t4(this));
        this.f138607y.setOnClickListener(new e33.u4(this));
        this.W.setOnClickListener(new e33.v4(this));
        this.f138603w.setOnClickListener(new e33.w4(this));
        setBackBtn(new e33.x4(this));
        this.Y = intent.getStringExtra("album_business_tag");
        this.Z = intent.getIntExtra("album_video_max_duration", 10);
        this.f138595p0 = intent.getIntExtra("album_video_min_duration", 0);
        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.DARK_GREEN_MODE;
        int i27 = t23.p0.k().f415297f;
        if (i27 == 15) {
            fbVar = com.tencent.mm.ui.fb.YELLOW;
        } else if (i27 == 25) {
            fbVar = com.tencent.mm.ui.fb.ORANGE;
        } else if (i27 == 28) {
            fbVar = com.tencent.mm.ui.fb.FINDER_LIVE;
        }
        this.Q1.q6(e7(), new e33.y4(this), fbVar);
        if (26 == t23.p0.k().f415297f) {
            this.Q1.Y2().setVisibility(i17);
        }
        i33.p1 p1Var = this.R1;
        androidx.appcompat.app.AppCompatActivity activity = p1Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.eb E = ((com.tencent.mm.ui.MMActivity) activity).getController().E(r112);
        androidx.appcompat.app.AppCompatActivity activity2 = p1Var.getActivity();
        if (E.f208384j == null) {
            E.f208384j = android.view.View.inflate(activity2, com.tencent.mm.R.layout.f487907b9, null);
        }
        android.view.View findViewById2 = E.f208384j.findViewById(com.tencent.mm.R.id.mih);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        this.D = weImageView2;
        weImageView2.setEnableColorFilter(false);
        this.D.setOnClickListener(new e33.o3(this));
        i33.p1 p1Var2 = this.R1;
        androidx.appcompat.app.AppCompatActivity activity3 = p1Var2.getActivity();
        kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.eb E2 = ((com.tencent.mm.ui.MMActivity) activity3).getController().E(r112);
        androidx.appcompat.app.AppCompatActivity activity4 = p1Var2.getActivity();
        if (E2.f208384j == null) {
            E2.f208384j = android.view.View.inflate(activity4, com.tencent.mm.R.layout.f487907b9, null);
        }
        android.view.View findViewById3 = E2.f208384j.findViewById(com.tencent.mm.R.id.mk_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.F = textView;
        textView.setOnClickListener(new e33.p3(this));
        if (this.A == r112 && !this.H1) {
            this.D.setVisibility(i17);
            this.F.setVisibility(i17);
        }
        this.G = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.cng);
        this.H = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.ghw);
        android.view.ViewGroup viewGroup = this.G;
        if (viewGroup != null) {
            viewGroup.setVisibility(i17);
            this.G.setOnClickListener(new e33.q3(this));
        }
        android.view.ViewGroup viewGroup2 = this.H;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(i17);
            this.H.setOnClickListener(new e33.r3(this));
        }
        this.R = findViewById(com.tencent.mm.R.id.uq7);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486310kv4);
        this.Q = textView2;
        textView2.setOnClickListener(new e33.s3(this));
        D7(false);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.h_7);
        this.f138581f = recyclerView;
        recyclerView.getItemAnimator().f12170e = 66L;
        this.f138581f.N(new e33.t3(this));
        com.tencent.mm.plugin.gallery.ui.SpeedyLinearLayoutManager speedyLinearLayoutManager = new com.tencent.mm.plugin.gallery.ui.SpeedyLinearLayoutManager(this);
        speedyLinearLayoutManager.Q(0);
        this.f138581f.setLayoutManager(speedyLinearLayoutManager);
        e33.h5 h5Var = new e33.h5(this, this.f138591m, getResources().getDisplayMetrics().widthPixels / 7, this.f138594p, this.L, this.f138611z1);
        h5Var.f247264o = this.f138597q;
        h5Var.notifyDataSetChanged();
        this.f138581f.setAdapter(h5Var);
        this.f138581f.post(new e33.u3(this));
        if (this.f138591m.size() <= 0 || 26 == t23.p0.k().f415297f) {
            this.f138581f.setVisibility(i17);
        } else {
            this.f138581f.setVisibility(0);
        }
        this.f138581f.setItemAnimator(new androidx.recyclerview.widget.z());
        h5Var.f247274y.d(this.f138581f);
        h5Var.f247261i = new e33.v3(this);
        k33.i iVar = new k33.i((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cn9));
        this.f138577d = iVar;
        if (iVar.a()) {
            com.tencent.mm.ui.base.MMViewPager mMViewPager = iVar.f303870b;
            z17 = false;
            if (mMViewPager != null) {
                mMViewPager.setVerticalFadingEdgeEnabled(false);
            }
        } else {
            z17 = false;
            com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager imagePreviewViewPager = iVar.f303871c;
            if (imagePreviewViewPager != null) {
                imagePreviewViewPager.setVerticalFadingEdgeEnabled(false);
            }
        }
        k33.i iVar2 = this.f138577d;
        if (iVar2.a()) {
            com.tencent.mm.ui.base.MMViewPager mMViewPager2 = iVar2.f303870b;
            if (mMViewPager2 != null) {
                mMViewPager2.setHorizontalFadingEdgeEnabled(z17);
            }
        } else {
            com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager imagePreviewViewPager2 = iVar2.f303871c;
            if (imagePreviewViewPager2 != null) {
                imagePreviewViewPager2.setHorizontalFadingEdgeEnabled(z17);
            }
        }
        e33.e4 e4Var = new e33.e4(this);
        k33.i iVar3 = this.f138577d;
        iVar3.getClass();
        if (iVar3.a()) {
            com.tencent.mm.ui.base.MMViewPager mMViewPager3 = iVar3.f303870b;
            if (mMViewPager3 != null) {
                mMViewPager3.setOnPageChangeListener(e4Var);
            }
        } else {
            com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager imagePreviewViewPager3 = iVar3.f303871c;
            if (imagePreviewViewPager3 != null) {
                imagePreviewViewPager3.setOnPageChangeListener(e4Var);
            }
        }
        k33.i iVar4 = this.f138577d;
        e33.f4 f4Var = new e33.f4(this);
        if (iVar4.a()) {
            com.tencent.mm.ui.base.MMViewPager mMViewPager4 = iVar4.f303870b;
            if (mMViewPager4 != null) {
                mMViewPager4.setSingleClickOverListener(new k33.g(f4Var));
            }
        } else {
            com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager imagePreviewViewPager4 = iVar4.f303871c;
            if (imagePreviewViewPager4 != null) {
                imagePreviewViewPager4.setImagePreviewPageItemGestureListener(f4Var);
            }
        }
        e33.v2 v2Var = new e33.v2(this, r7());
        this.f138579e = v2Var;
        v2Var.f247513x = getIntent().getStringExtra(str);
        e33.v2 v2Var2 = this.f138579e;
        int intValue = this.f138593o.intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "setCurrentShowPosition >> position: %d currentPosition: %d", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(v2Var2.f247511v));
        v2Var2.f247511v = intValue;
        e33.v2 v2Var3 = this.f138579e;
        v2Var3.getClass();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_imagepreview_recycle_wximageview, r112);
        v2Var3.f247510u = fj6;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "checkShouldRecycleWxImageView: %b", java.lang.Boolean.valueOf(fj6));
        e33.v2 v2Var4 = this.f138579e;
        v2Var4.f247508s = new e33.n3$$a(this);
        v2Var4.f247509t = new e33.n3$$j(this);
        e33.h5 h5Var2 = (e33.h5) this.f138581f.getAdapter();
        e33.v2 v2Var5 = this.f138579e;
        h5Var2.f247256d = v2Var5;
        if (this.f138594p) {
            java.util.ArrayList arrayList8 = this.f138585h;
            java.util.ArrayList arrayList9 = v2Var5.f247502m;
            arrayList9.clear();
            arrayList9.addAll(arrayList8);
            v2Var5.h();
            v2Var5.notifyDataSetChanged();
            this.f138579e.f247503n = r112;
            if (this.f138593o.intValue() >= this.f138585h.size()) {
                this.f138593o = 0;
            }
            if (this.f138585h.size() > 0) {
                str2 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138585h.get(this.f138593o.intValue())).f138430e;
            }
            str2 = "";
        } else {
            java.util.ArrayList arrayList10 = this.f138583g;
            java.util.ArrayList arrayList11 = v2Var5.f247501i;
            arrayList11.clear();
            arrayList11.addAll(arrayList10);
            v2Var5.h();
            v2Var5.notifyDataSetChanged();
            this.f138579e.f247503n = false;
            if (this.f138583g.size() > 0) {
                str2 = (java.lang.String) this.f138583g.get(this.f138593o.intValue());
            }
            str2 = "";
        }
        k33.i iVar5 = this.f138577d;
        e33.v2 v2Var6 = this.f138579e;
        if (iVar5.a()) {
            com.tencent.mm.ui.base.MMViewPager mMViewPager5 = iVar5.f303870b;
            if (mMViewPager5 != null) {
                mMViewPager5.setAdapter(v2Var6);
            }
        } else {
            com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager imagePreviewViewPager5 = iVar5.f303871c;
            if (imagePreviewViewPager5 != null) {
                imagePreviewViewPager5.setAdapter(v2Var6);
            }
        }
        this.f138577d.b(this.f138593o.intValue(), false);
        if (this.f138579e.getCount() == r112 && this.F1) {
            e4Var.onPageSelected(0);
        } else if (this.f138593o.intValue() == 0) {
            this.f138579e.m(this.f138593o.intValue());
        }
        e33.v2 v2Var7 = this.f138579e;
        this.f138593o.intValue();
        v2Var7.getClass();
        int indexOf = d7().indexOf(this.f138579e.i(this.f138593o.intValue()));
        e33.h5 h5Var3 = (e33.h5) this.f138581f.getAdapter();
        int intValue2 = this.f138593o.intValue();
        h5Var3.f247268s = indexOf;
        h5Var3.f247267r = intValue2;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem e17 = t23.p0.e(str2);
        y7(str2, e17);
        K7(e17);
        u7(e17);
        i33.x1 x1Var = this.T1;
        androidx.appcompat.app.AppCompatActivity activity5 = x1Var.getActivity();
        kotlin.jvm.internal.o.e(activity5, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
        k33.i iVar6 = ((com.tencent.mm.plugin.gallery.ui.ImagePreviewUI) activity5).f138577d;
        android.view.View view = iVar6.a() ? iVar6.f303870b : iVar6.f303871c;
        kotlin.jvm.internal.o.f(view, "getPreviewGalleryView(...)");
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = x1Var.f288288d;
        touchMediaPreviewLayout.c(view, r112);
        touchMediaPreviewLayout.setScaleListener(new i33.v1(x1Var));
        touchMediaPreviewLayout.setDoubleTapListener(new i33.w1(x1Var));
        setMMTitle((this.f138593o.intValue() + r112) + "/" + this.f138579e.getCount());
        if (kz5.z.F(e33.y1.f247550a, t23.p0.k().f415297f)) {
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.kms);
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList12.add(4);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(findViewById4, arrayList12.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ghz);
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(4);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(findViewById5, arrayList13.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f486310kv4);
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(4);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(findViewById6, arrayList14.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.ghx);
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(4);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(findViewById7, arrayList15.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.oyu);
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(4);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(findViewById8, arrayList16.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.ghy);
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            arrayList17.add(4);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(findViewById9, arrayList17.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
            yj0.a.f(findViewById9, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        U6(false);
        if (this.K) {
            this.Q1.k6(this.f138591m.size() != 0 ? r112 : false);
        }
        if (this.M) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "skipPreviewToEdit, invoke gotoPhotoEditUI");
            h7();
        }
        this.K1 = findViewById(com.tencent.mm.R.id.v39);
        this.L1 = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.v38);
        ((kc5.s) ((wg3.i) i95.n0.c(wg3.i.class))).Di(this.K1, new yz5.a() { // from class: e33.n3$$n
            @Override // yz5.a
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.this.J1);
            }
        }, getIntent().getStringExtra(str), 2);
        this.K1.setOnClickListener(new e33.w3(this));
        this.L1.setChecked(this.J1);
        J7();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isCallSuperOnSaveInstanceState() {
        return com.tencent.mm.ui.bk.Q() && this.U1;
    }

    public final void j7(boolean z17) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(com.tencent.mm.sdk.platformtools.t8.K0(this.f138576c2) ? this.f138575b2 : this.f138576c2, "");
        int r76 = r7();
        b17.F = r76;
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
        fu3.e eVar = fu3.e.f266880a;
        if (r76 == 2) {
            b17.f155688z = false;
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUploadImageSideLimit", "com.tencent.mm.feature.sns.SnsFeatureService");
            int s17 = pc4.d.f353410a.s();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUploadImageSideLimit", "com.tencent.mm.feature.sns.SnsFeatureService");
            b17.f155671f = s17;
            videoCaptureReportInfo.f155690d = 1;
            if (l7() && this.f138609y1) {
                videoCaptureReportInfo.f155690d = 10;
            }
            eVar.b(b17);
            b17.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 33);
            b17.M.putBoolean("is_from_sns_comment", getIntent().getBooleanExtra("is_from_sns_comment", false));
        } else if (r76 == 1) {
            videoCaptureReportInfo.f155690d = 3;
            b17.f155688z = false;
            eVar.b(b17);
        } else if (r76 == 11) {
            b17.f155688z = false;
            eVar.b(b17);
        }
        b17.I = videoCaptureReportInfo;
        if (this.E1) {
            b17.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 65);
        }
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        b17.f155677o = uICustomParam;
        if (!this.B1) {
            dx1.g.f244489a.j("SnsPublishProcess", "actionTrace_", 5, bx1.u.f36311f);
            this.B1 = true;
        }
        ut3.m.f431182a.f(getContext(), 4372, com.tencent.mm.R.anim.f477876e0, -1, b17, 1, 1);
    }

    public boolean k7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, float f17) {
        float f18 = this.C;
        return f17 <= f18 && f17 >= 1.0f / f18;
    }

    public final boolean l7() {
        if (this.H1) {
            return s23.n.f402323u && s23.n.f402309d.d();
        }
        r23.c cVar = r23.j.f368828b;
        if (cVar != null && cVar.f368812f) {
            return cVar != null && cVar.a();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7(int r18, int r19, java.lang.String r20, int r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.m7(int, int, java.lang.String, int):void");
    }

    public void n7(int i17, java.lang.String str, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
    }

    public void o7(android.view.View view) {
        int i17;
        java.lang.String i18 = this.f138579e.i(this.f138593o.intValue());
        if (com.tencent.mm.sdk.platformtools.t8.K0(i18) || !view.isEnabled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImagePreviewUI", "get path error, position %d", this.f138593o);
            return;
        }
        t7(i18);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17 = this.f138579e.k(this.f138593o.intValue());
        if (k17 != null) {
            K7(k17);
        }
        this.f138603w.setText(getContext().getString(com.tencent.mm.R.string.f492182fj0));
        this.Q1.Y0(e7());
        o23.m.f342426a.c(i18, getIntent().getIntExtra("select_type_tag", 3), this.f138593o.intValue());
        if (t21.d3.s() && (((i17 = this.L) == 3 || i17 == 16) && this.f138597q)) {
            s7();
        } else {
            this.f138604x.setVisibility(8);
        }
        U6(false);
        if (this.K) {
            this.Q1.k6(this.f138591m.size() != 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0294  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r32, int r33, android.content.Intent r34) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.K = t23.p0.k().f415297f == 4;
        s23.n nVar = s23.n.f402309d;
        this.H1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_mj_template_handle_refactor_update, true) && this.K;
        super.onCreate(bundle);
        if (bundle != null) {
            if (bundle.containsKey("save_item_list_key")) {
                java.lang.String string = bundle.getString("save_item_list_key");
                java.util.ArrayList arrayList = (java.util.ArrayList) t23.p0.j().f415237i.get(string);
                if (arrayList != null && !arrayList.isEmpty()) {
                    t23.p0.p(arrayList);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "onRestoreInstanceState item count:%s", java.lang.Integer.valueOf(arrayList.size()));
                }
                t23.p0.j().f415237i.remove(string);
            }
            if (bundle.containsKey("save_video_path")) {
                java.lang.String string2 = bundle.getString("save_video_path");
                this.f138596p1 = string2;
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "onRestoreInstanceState videoPath:%s", string2);
            }
        }
        fullScreenNoTitleBar(true);
        com.tencent.mm.ui.bk.u0(this);
        pf5.z zVar = pf5.z.f353948a;
        this.Q1 = (i33.r1) zVar.a(this).a(i33.r1.class);
        this.R1 = (i33.p1) zVar.a(this).a(i33.p1.class);
        this.S1 = (i33.u1) zVar.a(this).a(i33.u1.class);
        this.T1 = (i33.x1) zVar.a(this).a(i33.x1.class);
        i33.p1 p1Var = this.R1;
        androidx.appcompat.app.AppCompatActivity activity = p1Var.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.addTextOptionMenu(1, null, null, null, com.tencent.mm.ui.fb.SELECT);
            com.tencent.mars.xlog.Log.i(p1Var.f288235d, "shouldShowConfirmBtnOnBottomBar checkSelectOptionMenu: ");
        }
        new com.tencent.mm.sdk.platformtools.n3().post(new e33.n4(this, elapsedRealtime));
        android.os.SystemClock.elapsedRealtime();
        r23.j jVar = r23.j.f368827a;
        this.f138609y1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_template_video_edit_enable, true);
        this.f138611z1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_gallery_image_edit_icon_hide, false);
        this.A1 = t23.p0.k().f415297f == 3;
        this.V1 = (t23.p0.k().f415297f == 3 || t23.p0.k().f415297f == 26) && ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi();
        this.W1 = ((o23.i) ((e60.b1) i95.n0.c(e60.b1.class))).Bi(getIntent().getStringExtra("GalleryUI_ToUser"));
        initView();
        dx1.g.f244489a.j("SnsPublishProcess", "actionTrace_", 6, bx1.u.f36311f);
        boolean z19 = this.H1;
        if (z19) {
            z17 = s23.n.f402323u;
        } else {
            r23.c cVar = r23.j.f368828b;
            z17 = cVar != null && cVar.f368812f;
        }
        if (z17) {
            if (z19 && this.K) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.o17);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                nVar.a(this.Y1);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "[" + jVar.hashCode() + " bindPreviewUI:" + java.lang.Integer.valueOf(hashCode()) + ']');
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
                r23.j.f368831e = weakReference;
                r23.j.f368829c = new r23.n(weakReference);
            }
        }
        t23.p0.o();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "onDestroy, %s.", this);
        dx1.g.f244489a.j("SnsPublishProcess", "mediaEditPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
        if (t23.p0.k().f415297f == 3 && getIntent().getBooleanExtra("preview_image", false) && getIntent().getIntExtra("max_select_count", 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "clear photo edit cache!");
            t23.p0.i().clear();
        }
        e33.v2 v2Var = this.f138579e;
        if (v2Var != null) {
            v2Var.r();
            v2Var.h();
            e33.l3 l3Var = v2Var.B;
            l3Var.f247327j = null;
            l3Var.f247319b.clear();
            l3Var.f247322e.clear();
            l3Var.f247321d.clear();
            l3Var.f247320c.clear();
            ((lt0.f) l3Var.f247324g).c(new e33.j3(l3Var));
            v2Var.f247515z.clear();
            v2Var.f247504o.clear();
        }
        t23.p0.p(null);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPhotoEditorImpl", "cleanAllCache: ");
        com.tencent.mm.cache.ArtistCacheManager.a().b();
        if (this.f138574a2 != null) {
            t23.p0.h().h(this.f138574a2);
        }
        if (this.H1) {
            s23.n.f402309d.j(this.Y1, false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandle", "unbindPreviewUI");
            r23.j.f368831e = null;
            r23.j.f368829c = null;
        }
        if (this.F1) {
            o23.m.f342426a.b();
        }
        t23.p0.b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        g7();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f138610z;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f138579e.r();
        e33.v2 v2Var = this.f138579e;
        v2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "onPause");
        y51.c j17 = v2Var.j(v2Var.f247511v);
        if (j17 != null) {
            ((y51.b) j17).b();
        }
        super.onPause();
        if (this.P1 == -1) {
            int i17 = t23.p0.k().f415297f;
            this.P1 = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "save query source:%d", java.lang.Integer.valueOf(i17));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        dx1.g.f244489a.j("SnsPublishProcess", "mediaPreviewPagetimes", 1, bx1.u.f36310e);
        if (this.K && this.P1 == 4 && t23.p0.k().f415297f != 4) {
            t23.p0.k().f415297f = 4;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "try fix query source");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (this.U1) {
            if (t23.p0.l() != null) {
                java.lang.String str = hashCode() + "";
                t23.p0.j().f415237i.put(str, new java.util.ArrayList(t23.p0.l()));
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCore", "saveCachePreviewItems size:%d", java.lang.Integer.valueOf(t23.p0.j().f415237i.size()));
                bundle.putString("save_item_list_key", str);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "onSaveInstanceState item list count:%d", java.lang.Integer.valueOf(t23.p0.l().size()));
            }
            if (!android.text.TextUtils.isEmpty(this.f138596p1)) {
                bundle.putString("save_video_path", this.f138596p1);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "onSaveInstanceState videoPath:%s", this.f138596p1);
            }
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p7() {
        /*
            r13 = this;
            int r0 = r13.L
            r1 = 45
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L59
            java.util.ArrayList r0 = r13.f138592n
            if (r0 == 0) goto L55
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L55
            java.util.ArrayList r0 = r13.f138585h
            if (r0 == 0) goto L55
            java.lang.Class<tk.o> r0 = tk.o.class
            i95.m r0 = i95.n0.c(r0)
            tk.o r0 = (tk.o) r0
            ox.g r0 = (ox.g) r0
            com.tencent.wechat.mm.biz.w4 r1 = r0.oj()
            if (r1 == 0) goto L2f
            com.tencent.wechat.mm.biz.w4 r0 = r0.oj()
            boolean r0 = r0.f218757d
            if (r0 == 0) goto L2f
            r2 = r3
        L2f:
            if (r2 == 0) goto L55
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            boolean r0 = com.tencent.mars.comm.NetStatusUtil.isWifi(r0)
            if (r0 == 0) goto L3a
            goto L55
        L3a:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r1 = r13.f138592n
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList r2 = r13.f138585h
            r1.<init>(r2)
            ku5.u0 r2 = ku5.t0.f312615d
            e33.n3$$m r4 = new e33.n3$$m
            r4.<init>()
            ku5.t0 r2 = (ku5.t0) r2
            r2.g(r4)
            goto L58
        L55:
            r13.q7()
        L58:
            return r3
        L59:
            r1 = 3
            if (r0 != r1) goto Ldf
            long r0 = ip.c.k()
            java.util.ArrayList r4 = r13.d7()
            ip.a r5 = ip.a.f293544a
            int r5 = r5.a()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r4.iterator()
        L78:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc9
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            long r10 = com.tencent.mm.vfs.w6.k(r7)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r12 = t23.p0.e(r7)
            if (r12 != 0) goto L92
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r12 = t23.p0.g(r7)
        L92:
            if (r12 != 0) goto L95
            goto L78
        L95:
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 <= 0) goto L9b
            r7 = r3
            goto L9c
        L9b:
            r7 = r2
        L9c:
            if (r7 != 0) goto Lb9
            boolean r10 = r12 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r10 == 0) goto Lb9
            if (r10 == 0) goto Laf
            r10 = r12
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r10 = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r10
            int r10 = r10.f138446x
            long r10 = (long) r10
            int r10 = com.tencent.mm.sdk.platformtools.t8.V1(r10)
            goto Lb5
        Laf:
            java.lang.String r10 = r12.f138430e
            int r10 = j33.d0.a(r10)
        Lb5:
            if (r10 <= r5) goto Lb9
            r10 = r3
            goto Lba
        Lb9:
            r10 = r2
        Lba:
            if (r7 == 0) goto Lc3
            r8.add(r12)
            r9.add(r12)
            goto L78
        Lc3:
            if (r10 == 0) goto L78
            r8.add(r12)
            goto L78
        Lc9:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto Ldf
            j33.d r6 = j33.d.f297427a
            androidx.appcompat.app.AppCompatActivity r7 = r13.getContext()
            int r10 = r4.size()
            r11 = 4383(0x111f, float:6.142E-42)
            r6.a(r7, r8, r9, r10, r11)
            return r3
        Ldf:
            r13.q7()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.p7():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q7() {
        /*
            r8 = this;
            int r0 = r8.L
            r1 = 6
            r2 = 3
            java.lang.String r3 = "select_type_tag"
            r4 = 1
            if (r0 != r1) goto L35
            r8.setResult(r4)
            e33.v2 r0 = r8.f138579e
            java.lang.Integer r1 = r8.f138593o
            int r1 = r1.intValue()
            java.lang.String r0 = r0.i(r1)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 != 0) goto L32
            o23.n r1 = o23.m.f342426a
            android.content.Intent r5 = r8.getIntent()
            int r5 = r5.getIntExtra(r3, r2)
            java.lang.Integer r6 = r8.f138593o
            int r6 = r6.intValue()
            r1.c(r0, r5, r6)
        L32:
            r8.finish()
        L35:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r5 = "isPreviewPhoto"
            r6 = 0
            boolean r1 = r1.getBooleanExtra(r5, r6)
            r0.putExtra(r5, r1)
            java.util.ArrayList r1 = r8.d7()
            if (r1 == 0) goto La4
            int r1 = r1.size()
            if (r1 != 0) goto La4
            e33.v2 r1 = r8.f138579e
            java.lang.Integer r5 = r8.f138593o
            int r5 = r5.intValue()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r1.k(r5)
            boolean r5 = r8.K
            if (r5 == 0) goto L9c
            e33.v2 r5 = r8.f138579e
            if (r5 == 0) goto L9c
            if (r1 == 0) goto L9c
            int r5 = r1.getType()
            r7 = 2
            if (r5 != r7) goto L9c
            java.lang.String r1 = r1.f138430e
            r8.t7(r1)
            e33.v2 r1 = r8.f138579e
            java.lang.Integer r5 = r8.f138593o
            int r5 = r5.intValue()
            java.lang.String r1 = r1.i(r5)
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r5 != 0) goto La4
            o23.n r5 = o23.m.f342426a
            android.content.Intent r7 = r8.getIntent()
            int r2 = r7.getIntExtra(r3, r2)
            java.lang.Integer r3 = r8.f138593o
            int r3 = r3.intValue()
            r5.c(r1, r2, r3)
            goto La4
        L9c:
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r8.D
            r1.performClick()
            r1 = 300(0x12c, float:4.2E-43)
            goto La5
        La4:
            r1 = r6
        La5:
            t23.x1 r2 = t23.p0.k()
            int r2 = r2.f415297f
            int[] r3 = e33.y1.f247551b
            boolean r3 = kz5.z.F(r3, r2)
            java.lang.String r5 = "preview_image_list"
            if (r3 != 0) goto Lb9
            r3 = 48
            if (r2 != r3) goto Lc6
        Lb9:
            java.util.ArrayList r3 = r8.d7()
            r0.putStringArrayListExtra(r5, r3)
            r8.setResult(r2, r0)
            r8.finish()
        Lc6:
            t23.x1 r2 = t23.p0.k()
            int r2 = r2.f415297f
            r3 = 34
            if (r2 != r3) goto Ldd
            java.util.ArrayList r2 = r8.d7()
            r0.putStringArrayListExtra(r5, r2)
            r8.setResult(r3, r0)
            r8.finish()
        Ldd:
            boolean r2 = r8.f138597q
            r2 = r2 ^ r4
            boolean r3 = r8.K
            if (r1 != 0) goto Le8
            r8.V6(r0, r3, r2)
            return r4
        Le8:
            t23.y0 r5 = t23.p0.n()
            e33.x3 r7 = new e33.x3
            r7.<init>(r8, r0, r3, r2)
            r5.getClass()
            if (r1 >= 0) goto Lf7
            goto Lf8
        Lf7:
            r6 = r1
        Lf8:
            com.tencent.mm.sdk.platformtools.n3 r0 = r5.a()
            long r1 = (long) r6
            r0.postDelayed(r7, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.q7():boolean");
    }

    public int r7() {
        int i17 = t23.p0.k().f415297f;
        if (i17 == 3) {
            return 1;
        }
        if (i17 == 4) {
            return 2;
        }
        if (i17 != 48) {
            return i17;
        }
        return 11;
    }

    public void s7() {
        if (this.f138592n == null || this.f138585h == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f138592n);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f138585h);
        if (t21.d3.s()) {
            int i17 = this.L;
            if ((i17 == 3 || i17 == 16) && this.f138597q) {
                ((ku5.t0) ku5.t0.f312615d).g(new e33.h4(this, arrayList2, arrayList));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(i33.r1.class);
        hashSet.add(i33.p1.class);
        hashSet.add(i33.y1.class);
        hashSet.add(com.tencent.mm.plugin.gallery.ui.uic.ImagePreviewEventUIC.class);
        hashSet.add(i33.u1.class);
        hashSet.add(i33.x1.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t7(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.t7(java.lang.String):void");
    }

    public final void u7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        java.lang.String str;
        if (galleryItem$MediaItem == null) {
            return;
        }
        java.lang.String format = this.f138590l1.format(new java.util.Date(galleryItem$MediaItem.f138435m));
        if (2 == galleryItem$MediaItem.getType()) {
            str = i65.a.r(this, com.tencent.mm.R.string.fjt) + format;
        } else if (6 == galleryItem$MediaItem.getType()) {
            str = i65.a.r(this, com.tencent.mm.R.string.fjo) + format;
        } else {
            str = i65.a.r(this, com.tencent.mm.R.string.o4z) + format;
        }
        k33.i iVar = this.f138577d;
        if (iVar.a()) {
            com.tencent.mm.ui.base.MMViewPager mMViewPager = iVar.f303870b;
            if (mMViewPager == null) {
                return;
            }
            mMViewPager.setContentDescription(str);
            return;
        }
        com.tencent.mm.plugin.gallery.view.ImagePreviewViewPager imagePreviewViewPager = iVar.f303871c;
        if (imagePreviewViewPager == null) {
            return;
        }
        imagePreviewViewPager.setContentDescription(str);
    }

    public void v7(boolean z17) {
        android.view.View findViewById;
        boolean z18;
        android.view.animation.Animation loadAnimation;
        if (this.I) {
            findViewById = findViewById(com.tencent.mm.R.id.f483436au4);
        } else {
            findViewById = findViewById(com.tencent.mm.R.id.f483436au4);
            if (t23.p0.k().f415297f == 15) {
                return;
            }
        }
        if (findViewById == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = this.I ? "normal" : "edit_tips";
            objArr[1] = java.lang.Boolean.valueOf(z17);
            com.tencent.mars.xlog.Log.w("MicroMsg.ImagePreviewUI", "set footer[%s] visibility[%B], but footerbar null", objArr);
            return;
        }
        if (z17 && findViewById.getVisibility() == 0) {
            return;
        }
        int i17 = 8;
        if (z17 || findViewById.getVisibility() != 8) {
            if (!this.B || this.I) {
                z18 = z17;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "setFooterVisibility hideVideoEditButton");
                z18 = false;
            }
            if (z18) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setFooterVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setFooterVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477783bc));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setFooterVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setFooterVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477784bd));
            }
            if (z18 && this.f138581f.getVisibility() == 8 && this.f138591m.size() > 0 && 26 != t23.p0.k().f415297f) {
                this.f138581f.setVisibility(0);
                this.f138581f.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477783bc));
            } else if (!z18 && this.f138581f.getVisibility() == 0) {
                this.f138581f.setVisibility(8);
                this.f138581f.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477784bd));
            }
            if (!((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ri()) {
                android.view.View view = this.K1;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updateSendAsMediaGroupViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updateSendAsMediaGroupViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.L1.setChecked(false);
                this.J1 = false;
                return;
            }
            int Y6 = Y6();
            if (z18 && Y6 >= 3) {
                i17 = 0;
            }
            if (this.K1.getVisibility() == i17) {
                return;
            }
            if (z18) {
                android.view.View view2 = this.K1;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updateSendAsMediaGroupViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updateSendAsMediaGroupViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477783bc);
            } else {
                android.view.View view3 = this.K1;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updateSendAsMediaGroupViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "updateSendAsMediaGroupViewsVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477784bd);
            }
            this.K1.startAnimation(loadAnimation);
        }
    }

    public final void w7(boolean z17) {
        if (t23.p0.k().f415297f == 4) {
            return;
        }
        e33.v2 v2Var = this.f138579e;
        if (v2Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "[setTopTipVisibility] adapter == null");
            return;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17 = v2Var.k(this.f138593o.intValue());
        if (z17 && k17 != null) {
            this.V.postDelayed(new e33.l4(this, k17), 400L);
            return;
        }
        android.view.View view = this.V;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setTopTipVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI", "setTopTipVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void x7(java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.u(str);
        u1Var.n(getString(com.tencent.mm.R.string.fil));
        u1Var.l(new e33.n3$$l());
        u1Var.q(false);
    }

    public final void y7(java.lang.String str, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        boolean z17;
        if (galleryItem$MediaItem == null || galleryItem$MediaItem.getType() != 2 || (t23.p0.k().f415297f != 4 && t23.p0.k().f415297f != 14 && t23.p0.k().f415297f != 13 && t23.p0.k().f415297f != 37)) {
            this.I = true;
            this.G.setVisibility(0);
            this.H.setVisibility(8);
            this.X.setVisibility(8);
            G7(str, galleryItem$MediaItem, false);
            E7(str);
            X6(true);
            this.f138607y.setVisibility(8);
            if (galleryItem$MediaItem != null && galleryItem$MediaItem.getType() == 2 && this.A1) {
                t23.r2 r2Var = new t23.r2(str, this.f138593o.intValue(), (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem, new e33.p4(this));
                this.X.setTag(r2Var);
                ((ku5.t0) ku5.t0.f312615d).g(r2Var);
            }
            if (galleryItem$MediaItem == null || (!(galleryItem$MediaItem.getType() == 1 || galleryItem$MediaItem.getType() == 6) || galleryItem$MediaItem.f138438p.equalsIgnoreCase("image/gif"))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "QuerySource:%s isPreViewImage:%s  path:%s", java.lang.Integer.valueOf(t23.p0.k().f415297f), java.lang.Boolean.valueOf(getIntent().getBooleanExtra("preview_image", false)), str);
                if (galleryItem$MediaItem != null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    this.Q.setVisibility(4);
                } else {
                    this.Q.setVisibility(0);
                }
            } else {
                this.Q.setVisibility(0);
            }
            if (t23.p0.k().f415297f == 15 || t23.p0.k().f415297f == 28) {
                this.Q.setVisibility(4);
            }
            if (this.f138598r) {
                this.Q.setVisibility(4);
            }
            if (!gm0.j1.a()) {
                this.Q.setVisibility(4);
            }
            C7(str);
            return;
        }
        if (galleryItem$MediaItem.getType() != 1 || galleryItem$MediaItem.f138438p.equalsIgnoreCase("image/gif")) {
            this.Q.setVisibility(4);
        } else {
            this.Q.setVisibility(0);
        }
        if (kz5.z.F(e33.y1.f247550a, t23.p0.k().f415297f)) {
            this.Q.setVisibility(4);
        }
        C7(str);
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem;
        X6(false);
        this.I = false;
        this.G.setVisibility(8);
        this.H.setVisibility(0);
        this.W.setVisibility(8);
        if (com.tencent.mm.vfs.w6.k(str) > 1073741824) {
            this.S.setText(getString(com.tencent.mm.R.string.fj9));
            this.T.setText(getString(com.tencent.mm.R.string.fj8));
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(galleryItem$VideoMediaItem.f138444v)) {
            A7(this.f138605x0, B7(str, galleryItem$VideoMediaItem, this.f138605x0), galleryItem$VideoMediaItem);
            i7();
            return;
        }
        X6(false);
        this.I = true;
        this.G.setVisibility(0);
        this.H.setVisibility(8);
        this.f138607y.setVisibility(8);
        G7(str, galleryItem$MediaItem, false);
        E7(str);
        t23.r2 r2Var2 = new t23.r2(str, this.f138593o.intValue(), galleryItem$VideoMediaItem, new e33.m4(this, galleryItem$VideoMediaItem));
        if (r2Var2.equals(this.X.getTag())) {
            return;
        }
        this.X.setTag(r2Var2);
        ((ku5.t0) ku5.t0.f312615d).g(r2Var2);
        if (t23.p0.k().f415297f == 15) {
            this.Q.setVisibility(4);
        }
        if (this.f138598r) {
            this.Q.setVisibility(4);
        }
        if (gm0.j1.a()) {
            return;
        }
        this.Q.setVisibility(4);
    }

    public final boolean z7(com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, boolean z17) {
        if (galleryItem$VideoMediaItem != null) {
            if (j33.e.f297434a.c(t23.p0.k().f415297f, galleryItem$VideoMediaItem) == 0) {
                return false;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = galleryItem$VideoMediaItem == null ? null : galleryItem$VideoMediaItem.f138444v;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "check video format failed, dst format [video/avc], video format [%s]", objArr);
        this.S.setText(getString(com.tencent.mm.R.string.f492186fj4));
        this.T.setText(getString(com.tencent.mm.R.string.f492187fj5));
        return true;
    }
}
