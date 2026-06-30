package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class h7 implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f200985d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f200986e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200987f;

    public h7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200987f = imageGalleryUI;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200987f;
        if (i17 == 2) {
            imageGalleryUI.P3 = true;
            imageGalleryUI.R3 = true;
        }
        if (i17 == 0) {
            this.f200986e = false;
            boolean z17 = imageGalleryUI.P3;
            imageGalleryUI.P3 = false;
            com.tencent.mm.ui.chatting.gallery.q3 q3Var = imageGalleryUI.f200605e3;
            if (q3Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "clearAlpha: ");
                q3Var.f201294c = -1;
                q3Var.f201295d = 0.0f;
                android.util.SparseArray sparseArray = q3Var.f201292a;
                int size = sparseArray.size();
                for (int i18 = 0; i18 < size; i18++) {
                    sparseArray.keyAt(i18);
                    ((com.tencent.mm.ui.chatting.gallery.g4) sparseArray.valueAt(i18)).f200946a.f265404a.setAlpha(1.0f);
                }
            }
        }
        if (i17 == 1) {
            imageGalleryUI.R3 = true;
        }
        if (imageGalleryUI.X1 != null && (k1Var = imageGalleryUI.f200611g) != null && k1Var.w() != null && imageGalleryUI.f200611g.w().isVideo() && i17 == 1) {
            imageGalleryUI.X1.setEnable(true);
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = imageGalleryUI.f200611g;
        if (k1Var2 != null) {
            com.tencent.mm.ui.chatting.gallery.t2 t2Var = k1Var2.f201097o;
            if (t2Var != null) {
                t2Var.f201392q = i17;
                com.tencent.mm.ui.chatting.gallery.k3 k3Var = t2Var.f201386h;
                if (k3Var != null) {
                    k3Var.onPageScrollStateChanged(i17);
                }
            }
            com.tencent.mm.ui.chatting.gallery.j1 j1Var = k1Var2.f201098p;
            if (j1Var != null) {
                j1Var.f201045h = i17;
            }
            k1Var2.f201106x.f437242d.onPageScrollStateChanged(i17);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        com.tencent.mm.ui.chatting.gallery.q3 q3Var;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200987f;
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = imageGalleryUI.X1;
        if (touchMediaPreviewLayout != null && touchMediaPreviewLayout.getCurrentScale() > 1.0f && (k1Var = imageGalleryUI.f200611g) != null && k1Var.w() != null && imageGalleryUI.f200611g.w().isVideo()) {
            if (i18 > 20) {
                imageGalleryUI.X1.setEnable(false);
            } else {
                imageGalleryUI.X1.setEnable(true);
            }
        }
        if (!this.f200986e && i18 > 0) {
            this.f200986e = true;
        }
        try {
            com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = imageGalleryUI.f200611g;
            if (k1Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "adapter is null return");
                return;
            }
            if (k1Var2.f201097o == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "adapter.mImageHandler is null return");
                return;
            }
            k1Var2.f201106x.f437242d.onPageScrolled(i17, f17, i18);
            com.tencent.mm.ui.chatting.gallery.k1 k1Var3 = imageGalleryUI.f200611g;
            if (k1Var3 != null && imageGalleryUI.R3) {
                float f18 = imageGalleryUI.S3;
                if (f18 > 0.0f) {
                    if (f17 > f18) {
                        i17++;
                        this.f200985d = true;
                    } else {
                        this.f200985d = false;
                    }
                    if (k1Var3.f201097o.G(k1Var3.y(i17)) == 0) {
                        com.tencent.mm.ui.chatting.gallery.k1 k1Var4 = imageGalleryUI.f200611g;
                        if (!k1Var4.U(i17)) {
                            k1Var4.f201097o.m(i17);
                        }
                    }
                    imageGalleryUI.R3 = false;
                }
            }
            if (!imageGalleryUI.R3 && (q3Var = imageGalleryUI.f200605e3) != null) {
                q3Var.e(f17, this.f200985d);
            }
            imageGalleryUI.S3 = f17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "load neighbor image failed, t = " + th6.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13, types: [g90.s] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8, types: [int] */
    /* JADX WARN: Type inference failed for: r20v9 */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        long j17;
        int i18;
        com.tencent.mm.storage.f9 w17;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200987f;
        if (imageGalleryUI.f200611g == null) {
            return;
        }
        imageGalleryUI.M8();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = this.f200987f;
        com.tencent.mm.ui.chatting.gallery.q3 q3Var = imageGalleryUI2.f200605e3;
        if (q3Var != null) {
            q3Var.f201293b = i17;
            imageGalleryUI2.b7(i17);
            com.tencent.mm.ui.chatting.gallery.j1 j1Var = this.f200987f.f200611g.f201098p;
            if (j1Var != null && (j1Var instanceof com.tencent.mm.ui.chatting.gallery.ja)) {
                ((com.tencent.mm.ui.chatting.gallery.ja) j1Var).P(null);
            }
        }
        this.f200987f.S1 = false;
        if (com.tencent.mm.ui.chatting.gallery.ja.H()) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI3 = this.f200987f;
            imageGalleryUI3.f200636m4.removeCallbacks(imageGalleryUI3.f200617h3);
            com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = this.f200987f.f200611g;
            if (k1Var2 != null && k1Var2.w() != null && this.f200987f.f200611g.w().isVideo()) {
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI4 = this.f200987f;
                imageGalleryUI4.f200636m4.postDelayed(imageGalleryUI4.f200617h3, 2000L);
                if (this.f200987f.f200611g.v() != null && this.f200987f.f200611g.v().f201438p != null) {
                    ((pk4.d) this.f200987f.f200611g.v().f201438p).setVideoSpeedRatio(1.0f);
                }
            }
        }
        if (this.f200987f.E7()) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI5 = this.f200987f;
            if (imageGalleryUI5.X1 != null && (k1Var = imageGalleryUI5.f200611g) != null && k1Var.w() != null) {
                if (this.f200987f.f200611g.w().isVideo()) {
                    com.tencent.mm.ui.chatting.gallery.l lVar = com.tencent.mm.ui.chatting.gallery.l.f201163a;
                    com.tencent.mm.ui.chatting.gallery.l.f201166d = java.lang.Long.valueOf(this.f200987f.f200611g.w().getMsgId());
                    com.tencent.mm.ui.chatting.gallery.p pVar = com.tencent.mm.ui.chatting.gallery.p.f201254a;
                    this.f200987f.f200611g.w().getClass();
                    this.f200987f.X1.setEnable(true);
                    if (this.f200987f.X1.getLongPressListener() == null) {
                        this.f200987f.X1.setLongPressListener(new com.tencent.mm.ui.chatting.gallery.i7(this));
                    }
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI6 = this.f200987f;
                    imageGalleryUI6.f200645p = false;
                    imageGalleryUI6.f200637n.setLongClickOverListener(null);
                } else if (this.f200987f.f200611g.w().J2()) {
                    com.tencent.mm.ui.chatting.gallery.l.f201166d = null;
                    com.tencent.mm.ui.chatting.gallery.p pVar2 = com.tencent.mm.ui.chatting.gallery.p.f201254a;
                    this.f200987f.X1.setEnable(false);
                    this.f200987f.X1.setLongPressListener(null);
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI7 = this.f200987f;
                    if (!imageGalleryUI7.f200645p) {
                        imageGalleryUI7.f200645p = true;
                        imageGalleryUI7.f200637n.setLongClickOverListener(new com.tencent.mm.ui.chatting.gallery.j7(this));
                    }
                }
            }
        }
        this.f200987f.Q.setVisibility(8);
        android.view.View view = this.f200987f.S;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$63", "onPageSelected", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$63", "onPageSelected", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.chatting.gallery.j1 j1Var2 = this.f200987f.f200611g.f201098p;
        if (j1Var2 != null && (w17 = j1Var2.f200886d.w()) != null) {
            fk4.k a17 = com.tencent.mm.ui.chatting.gallery.l.f201163a.a(w17.getMsgId());
            if (a17 != null && !a17.f263618f) {
                a17.f263624l = j1Var2;
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI8 = j1Var2.f200886d.f201092g;
                int l17 = t21.d3.l(w17.z0());
                imageGalleryUI8.getClass();
                t23.p0.n().c(new com.tencent.mm.ui.chatting.gallery.b8(imageGalleryUI8, l17));
            }
        }
        this.f200987f.R8(i17);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI9 = this.f200987f;
        if (!imageGalleryUI9.Q3) {
            yd5.q.f461145a.b(imageGalleryUI9.f200607f ? 2 : 1);
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI10 = this.f200987f;
        if (!imageGalleryUI10.Q3) {
            ((ic5.b) imageGalleryUI10.component(ic5.b.class)).f290431g = 2;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var3 = imageGalleryUI10.f200611g;
        if (k1Var3 != null) {
            com.tencent.mm.storage.f9 w18 = k1Var3.w();
            ic5.b bVar = (ic5.b) imageGalleryUI10.component(ic5.b.class);
            bVar.getClass();
            if (w18 != null) {
                java.lang.String b17 = ic5.f.f290437c.b(w18);
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) bVar.f290433i;
                java.lang.Object obj = linkedHashMap.get(b17);
                if (obj == null) {
                    obj = new java.util.LinkedHashMap();
                    linkedHashMap.put(b17, obj);
                }
                java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) obj;
                if (!linkedHashMap2.containsKey(java.lang.Long.valueOf(w18.getMsgId()))) {
                    linkedHashMap2.put(java.lang.Long.valueOf(w18.getMsgId()), w18);
                }
            }
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI11 = this.f200987f;
        if (imageGalleryUI11.O3 != i17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = imageGalleryUI11.f200651q2;
            if (k0Var != null && k0Var.i()) {
                this.f200987f.f200651q2.u();
            }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI12 = this.f200987f;
            imageGalleryUI12.getClass();
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
            imageGalleryUI12.X.setVisibility(8);
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI13 = this.f200987f;
            if (!imageGalleryUI13.Q3) {
                imageGalleryUI13.O8();
                this.f200987f.B8();
                this.f200987f.f200591a3.c(2, com.tencent.mm.ui.chatting.gallery.t2.v(this.f200987f.f200611g.w()));
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI14 = this.f200987f;
                int i19 = imageGalleryUI14.H;
                if (i19 != 0 && (!imageGalleryUI14.f200674x2.f(i19) || !imageGalleryUI14.f200674x2.a(imageGalleryUI14.H))) {
                    int i27 = imageGalleryUI14.f200679y2 + 1;
                    imageGalleryUI14.f200679y2 = i27;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkQuickButtonWhenPageChanged not valid %d, currentButtonType: %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(imageGalleryUI14.H));
                    if (imageGalleryUI14.f200679y2 >= 2) {
                        imageGalleryUI14.m8(0, false);
                        imageGalleryUI14.f200679y2 = 0;
                    }
                }
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI15 = this.f200987f;
                com.tencent.mm.storage.f9 y17 = imageGalleryUI15.f200611g.y(imageGalleryUI15.O3);
                if (y17 != null && (y17.isVideo() || y17.J2())) {
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI16 = this.f200987f;
                    ?? r202 = imageGalleryUI16.A2 ? 3 : (imageGalleryUI16.f200611g.w() == null || y17.getMsgId() == this.f200987f.f200611g.w().getMsgId()) ? imageGalleryUI16.B2 : 2;
                    h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI17 = this.f200987f;
                    ((g90.s) vVar).ij(imageGalleryUI17, y17, 1, 4, r202, imageGalleryUI17.d7(y17));
                }
            }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI18 = this.f200987f;
            oc5.m mVar = imageGalleryUI18.f200674x2;
            mVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanButtonStatusManager", "resetSet");
            mVar.f344467c.remove(1);
            mVar.f344467c.remove(2);
            mVar.f344467c.remove(6);
            java.util.Iterator it = mVar.f344465a.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                mVar.b(intValue);
                oc5.e eVar = (oc5.e) mVar.f344466b.get(java.lang.Integer.valueOf(intValue));
                if (eVar != null) {
                    ((oc5.f) eVar).f344409b = true;
                }
            }
            oc5.l0 l0Var = imageGalleryUI18.f200663u2;
            l0Var.f344451a.clear();
            l0Var.f344452b = null;
            l0Var.f344453c = null;
            oc5.g0 g0Var = imageGalleryUI18.f200669w2;
            if (g0Var != null) {
                g0Var.f344425i = null;
                g0Var.f344426j = 0L;
                g0Var.f344427k = false;
                g0Var.f344428l = false;
                g0Var.f344429m = 0L;
                g0Var.f344430n = null;
                g0Var.f344431o = false;
            }
            imageGalleryUI18.K2 = false;
            imageGalleryUI18.L2 = 0;
            com.tencent.mm.ui.chatting.gallery.n8 n8Var = imageGalleryUI18.E3;
            n8Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "reset#ScanState");
            n8Var.f201220a = 0;
            imageGalleryUI18.F = null;
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI19 = this.f200987f;
            if (imageGalleryUI19.M2 == 1) {
                imageGalleryUI19.y7(false);
            }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI20 = this.f200987f;
            imageGalleryUI20.M2 = 0;
            imageGalleryUI20.J2 = 0;
        }
        if (this.f200987f.f200611g.e(i17) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "onPageSelected the view is null, position = %s ", java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI21 = this.f200987f;
        imageGalleryUI21.f200611g.w();
        imageGalleryUI21.f200637n.setGalleryScaleListener(new com.tencent.mm.ui.chatting.gallery.x5(imageGalleryUI21, imageGalleryUI21.c8()));
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI22 = this.f200987f;
        imageGalleryUI22.C9(imageGalleryUI22.O3);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI23 = this.f200987f;
        imageGalleryUI23.f200676y.d(imageGalleryUI23, imageGalleryUI23.O3, i17);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI24 = this.f200987f;
        imageGalleryUI24.O3 = i17;
        imageGalleryUI24.S3 = 0.0f;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var4 = imageGalleryUI24.f200611g;
        if (k1Var4 != null) {
            k1Var4.f201098p.z();
            k1Var4.f201099q.s();
            com.tencent.mm.storage.f9 msg = this.f200987f.f200611g.y(i17);
            if (msg != null) {
                this.f200987f.D = msg.getMsgId();
                this.f200987f.E = msg.Q0();
                this.f200987f.Q1 = msg.I0();
                ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(msg.Q0(), 1);
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI25 = this.f200987f;
                com.tencent.mm.ui.chatting.gallery.k1 k1Var5 = imageGalleryUI25.f200611g;
                imageGalleryUI25.f200633m = com.tencent.mm.ui.chatting.gallery.k1.B(msg);
                com.tencent.mm.ui.report.KV17560Reporter.c(this.f200987f).f209616h = com.tencent.mm.sdk.platformtools.t8.r0(this.f200987f.Q1);
            }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI26 = this.f200987f;
            if (imageGalleryUI26.A2) {
                vh5.a.f437198d = 3;
            } else if (imageGalleryUI26.B2) {
                vh5.a.f437198d = 1;
            }
            if (com.tencent.mm.ui.chatting.gallery.k1.L(msg) || com.tencent.mm.ui.chatting.gallery.k1.G(msg) || com.tencent.mm.ui.chatting.gallery.k1.K(msg)) {
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI27 = this.f200987f;
                android.view.View K7 = imageGalleryUI27.K7(imageGalleryUI27.f200611g, imageGalleryUI27.f200637n);
                if (K7 != null && (K7 instanceof db5.f0)) {
                    if (K7 instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
                        ((com.tencent.mm.ui.base.MultiTouchImageView) K7).i();
                    } else if (K7 instanceof com.tencent.mm.ui.base.WxImageView) {
                        ((com.tencent.mm.ui.base.WxImageView) K7).i();
                    }
                }
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI28 = this.f200987f;
                android.view.View a76 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.a7(imageGalleryUI28, imageGalleryUI28.f200611g, imageGalleryUI28.f200637n);
                if (a76 instanceof com.tencent.mm.ui.base.WxImageView) {
                    ((com.tencent.mm.ui.base.WxImageView) a76).setDrawFullSampleSizeBitmap(false);
                }
                bx1.t tVar = (bx1.t) i95.n0.c(bx1.t.class);
                boolean z17 = com.tencent.mm.ui.chatting.gallery.d2.f200849o != i17;
                ((fq3.w) tVar).getClass();
                if (!gm0.j1.a() || msg == null) {
                    j17 = 0;
                } else {
                    j17 = 0;
                    if (msg.getMsgId() > 0 && msg.A0() == 0) {
                        ((fq3.n) i95.n0.c(fq3.n.class)).aj();
                        ((ku5.t0) ku5.t0.f312615d).g(new oq3.a(msg, z17));
                    }
                }
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI29 = this.f200987f;
                java.lang.String H7 = imageGalleryUI29.H7();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "checkImageItemSourceUrl url: %s", H7);
                if (com.tencent.mm.sdk.platformtools.t8.K0(H7) || m11.p0.a(H7)) {
                    i18 = 6;
                    imageGalleryUI29.f200674x2.g(6, 2);
                } else {
                    i18 = 6;
                    imageGalleryUI29.f200674x2.g(6, 1);
                }
                imageGalleryUI29.l7(i18, false);
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI30 = this.f200987f;
                if (!imageGalleryUI30.f200675x3) {
                    h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI31 = this.f200987f;
                    ((g90.s) vVar2).cj(imageGalleryUI31, msg, 1, 2, imageGalleryUI31.c7(msg));
                } else if (imageGalleryUI30.A2) {
                    h90.v vVar3 = (h90.v) i95.n0.c(h90.v.class);
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI32 = this.f200987f;
                    ((g90.s) vVar3).cj(imageGalleryUI32, msg, 1, 3, imageGalleryUI32.c7(msg));
                } else if (imageGalleryUI30.B2) {
                    h90.v vVar4 = (h90.v) i95.n0.c(h90.v.class);
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI33 = this.f200987f;
                    ((g90.s) vVar4).cj(imageGalleryUI33, msg, 1, 1, imageGalleryUI33.c7(msg));
                }
                com.tencent.mm.ui.report.KV17560Reporter.c(this.f200987f).f209617i = com.tencent.mm.ui.report.h0.Image;
            } else {
                if (com.tencent.mm.ui.chatting.gallery.k1.N(msg)) {
                    this.f200987f.P1 = java.lang.System.currentTimeMillis();
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI34 = this.f200987f;
                    if (!imageGalleryUI34.f200675x3) {
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f200987f.T1, "report_scene", 2);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this.f200987f.R1, "report_scene", 2);
                        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.f200987f.L1;
                        if (redesignVideoPlayerSeekBar instanceof com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk((com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) redesignVideoPlayerSeekBar, "report_scene", 2);
                        }
                        yd5.p.f461128r = 2;
                        h90.v vVar5 = (h90.v) i95.n0.c(h90.v.class);
                        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI35 = this.f200987f;
                        ((g90.s) vVar5).cj(imageGalleryUI35, msg, 1, 2, imageGalleryUI35.c7(msg));
                    } else if (imageGalleryUI34.A2) {
                        h90.v vVar6 = (h90.v) i95.n0.c(h90.v.class);
                        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI36 = this.f200987f;
                        ((g90.s) vVar6).cj(imageGalleryUI36, msg, 1, 3, imageGalleryUI36.c7(msg));
                    } else if (imageGalleryUI34.B2) {
                        h90.v vVar7 = (h90.v) i95.n0.c(h90.v.class);
                        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI37 = this.f200987f;
                        ((g90.s) vVar7).cj(imageGalleryUI37, msg, 1, 1, imageGalleryUI37.c7(msg));
                    }
                    ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).getClass();
                    if (msg != null && msg.getMsgId() > 0 && msg.A0() == 0) {
                        ((fq3.n) i95.n0.c(fq3.n.class)).aj();
                        ((fq3.n) i95.n0.c(fq3.n.class)).aj();
                        java.lang.String str = msg.I0() + "_3";
                        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar.requireAccountInitialized();
                        nVar.A.Z6(str);
                        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar2.requireAccountInitialized();
                        nVar2.B.d(msg.getMsgId(), 3, msg.I0());
                        com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: video msg open, msgId:" + msg.getMsgId());
                    }
                    boolean z18 = com.tencent.mm.ui.chatting.gallery.d2.f200849o != i17;
                    kotlin.jvm.internal.o.g(msg, "msg");
                    if (msg.A0() != 1) {
                        ((ku5.t0) ku5.t0.f312615d).g(new f65.t(msg, z18));
                    }
                    com.tencent.mm.ui.report.KV17560Reporter.c(this.f200987f).f209617i = com.tencent.mm.ui.report.h0.Video;
                }
                j17 = 0;
            }
            if (msg != null) {
                this.f200987f.Q8(msg.getMsgId());
            }
            com.tencent.mm.ui.chatting.gallery.k1 k1Var6 = this.f200987f.f200611g;
            if (k1Var6 != null) {
                m11.b0 x17 = k1Var6.x(msg, false);
                if (this.f200987f.f200611g.H(msg, x17)) {
                    ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                    int i28 = m11.c0.d(x17).f322636d;
                    long j18 = i28 != 0 ? ((r2.f322635c * 100) / i28) - 1 : j17;
                    java.lang.System.currentTimeMillis();
                    com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI38 = this.f200987f;
                    imageGalleryUI38.n8();
                    imageGalleryUI38.o9(false);
                    imageGalleryUI38.d9((int) j18);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "[arthurdan.ImageGallery] Notice!!! adapter is null");
            }
            if (msg == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "update footer fail, msg is null, position = " + i17);
            } else {
                com.tencent.mm.ui.report.KV17560Reporter.c(this.f200987f).b(com.tencent.mm.ui.report.i0.Preview);
                this.f200987f.y9(i17, msg, !r4.Q3);
                this.f200987f.Q3 = false;
            }
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var7 = this.f200987f.f200611g;
        if (k1Var7 != null) {
            k1Var7.onPageSelected(i17);
            if (com.tencent.mm.ui.chatting.gallery.k1.K(this.f200987f.f200611g.w())) {
                this.f200987f.f200637n.setEnableGalleryScale(false);
            } else {
                this.f200987f.f200637n.setEnableGalleryScale(true);
            }
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI39 = this.f200987f;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var8 = imageGalleryUI39.f200611g;
        if (k1Var8 != null) {
            java.lang.Boolean A = k1Var8.A(k1Var8.y(imageGalleryUI39.O3));
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI40 = this.f200987f;
            imageGalleryUI40.h7(imageGalleryUI40.f200611g.y(imageGalleryUI40.O3), A != null ? A.booleanValue() : false);
            this.f200987f.r7();
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var9 = this.f200987f.f200611g;
        if (k1Var9 == null || k1Var9.w() == null) {
            return;
        }
        if (this.f200987f.f200611g.w().Y2() || this.f200987f.f200611g.w().isVideo() || this.f200987f.f200611g.w().M2()) {
            final java.lang.String J7 = this.f200987f.J7();
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.gallery.h7$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str2 = J7;
                    com.tencent.mm.ui.chatting.gallery.h7 h7Var = com.tencent.mm.ui.chatting.gallery.h7.this;
                    h7Var.getClass();
                    try {
                        com.tencent.mm.modelcontrol.VideoTransPara a18 = com.tencent.mm.modelvideoh265toh264.j.a(str2);
                        ((java.util.concurrent.ConcurrentHashMap) h7Var.f200987f.U3).put(str2, java.lang.Float.valueOf(a18.f71191d / a18.f71192e));
                    } catch (java.lang.RuntimeException unused) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "try decode videoRealRatio failed, skip");
                    }
                }
            });
        }
    }
}
