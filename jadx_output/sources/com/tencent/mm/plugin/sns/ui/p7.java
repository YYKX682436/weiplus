package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class p7 extends com.tencent.mm.plugin.sns.ui.n1 implements com.tencent.mm.plugin.sns.ui.t4 {
    public final java.lang.String A;
    public com.tencent.mm.modelscan.ScanCodeInfo B;
    public r45.vb1 C;
    public r45.h96 D;
    public java.util.Map E;
    public java.lang.String F;
    public java.lang.String G;
    public final com.tencent.mm.plugin.sns.ui.u4 H;
    public final ud4.d I;

    /* renamed from: J, reason: collision with root package name */
    public r45.ed4 f170163J;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.x7 f170164g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.v4 f170165h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f170166i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f170167j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f170168k;

    /* renamed from: l, reason: collision with root package name */
    public int f170169l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f170170m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f170171n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f170172o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f170173p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f170174q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f170175r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f170176s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage f170177t;

    /* renamed from: u, reason: collision with root package name */
    public int f170178u;

    /* renamed from: v, reason: collision with root package name */
    public m21.w f170179v;

    /* renamed from: w, reason: collision with root package name */
    public int f170180w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f170181x;

    /* renamed from: y, reason: collision with root package name */
    public final int f170182y;

    /* renamed from: z, reason: collision with root package name */
    public r45.ed4 f170183z;

    public p7(com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f170164g = new com.tencent.mm.plugin.sns.ui.x7(this);
        this.f170166i = false;
        this.f170167j = new java.util.HashMap();
        this.f170168k = new java.util.HashMap();
        this.f170169l = 0;
        this.f170174q = false;
        this.f170175r = false;
        this.f170176s = false;
        this.f170177t = null;
        this.f170179v = null;
        this.f170180w = 1;
        this.f170181x = "";
        this.f170182y = 9;
        this.A = je4.c.f299317a.a();
        this.G = "";
        this.H = new com.tencent.mm.plugin.sns.ui.q7(this);
        this.I = new com.tencent.mm.plugin.sns.ui.r7(this);
    }

    @Override // com.tencent.mm.plugin.sns.ui.t4
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
        if (obj instanceof qc0.m1) {
            qc0.m1 m1Var = (qc0.m1) obj;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(m1Var.f361411b);
            int i17 = m1Var.f361412c;
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "handleMediaOptResult: resultCode=%d, optCode=%d", valueOf, java.lang.Integer.valueOf(i17));
            if (m1Var.f361411b == -1 && i17 == 0) {
                qc0.l1 a17 = m1Var.a();
                com.tencent.mm.plugin.sns.model.g6 g6Var = com.tencent.mm.plugin.sns.model.g6.f164210a;
                java.lang.String str = a17.f361396b;
                android.os.Bundle bundle = m1Var.f361414e;
                g6Var.c(str, bundle, "key_edit_safe_strategy_emotion_info_list");
                if (a17.a()) {
                    java.lang.String str2 = a17.f361396b;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_sns_tmp_file, true)) {
                            dw3.c0.f244182a.w(str2);
                        }
                        o(java.util.Collections.singletonList(str2), 0, true);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                        return;
                    }
                } else {
                    r45.vh4 vh4Var = new r45.vh4();
                    vh4Var.f388235e = true;
                    vh4Var.f388234d = false;
                    java.lang.String str3 = a17.f361396b;
                    com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = new com.tencent.mm.plugin.mmsight.SightCaptureResult(true, str3, a17.f361397c, com.tencent.mm.vfs.w6.q(str3), by5.x.c(str3), (int) (a17.f361398d / 1000), vh4Var);
                    com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
                    mMActivity.getIntent().putExtra("key_extra_data", bundle);
                    ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).p7(sightCaptureResult);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    @Override // com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r22, int r23, l56.i r24, java.lang.String r25, java.util.List r26, r45.ed4 r27, java.util.LinkedList r28, int r29, boolean r30, java.util.List r31, com.tencent.mm.pointers.PInt r32, java.lang.String r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.p7.c(int, int, l56.i, java.lang.String, java.util.List, r45.ed4, java.util.LinkedList, int, boolean, java.util.List, com.tencent.mm.pointers.PInt, java.lang.String, int, int):boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    public boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.PicWidget");
        super.e();
        com.tencent.mm.plugin.sns.ui.v4 v4Var = this.f170165h;
        if (v4Var != null) {
            ((ud4.t) v4Var).c();
        }
        ((java.util.HashMap) this.f170167j).clear();
        ((java.util.HashMap) this.f170168k).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r8 = this;
            java.lang.String r0 = "enableNext"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.PicWidget"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 1
            r3 = 0
            com.tencent.mm.plugin.sns.ui.x7 r4 = r8.f170164g
            if (r4 == 0) goto L2b
            r4.getClass()
            java.lang.String r5 = "enable"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.util.ArrayList r7 = r4.f171492a
            if (r7 == 0) goto L23
            int r7 = r7.size()
            if (r7 <= 0) goto L23
            r7 = r2
            goto L24
        L23:
            r7 = r3
        L24:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            if (r7 == 0) goto L2b
            r5 = r2
            goto L2c
        L2b:
            r5 = r3
        L2c:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            if (r4 != 0) goto L33
            r4 = r2
            goto L34
        L33:
            r4 = r3
        L34:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6[r3] = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r6[r2] = r3
            java.lang.String r2 = "MicroMsg.PicWidget"
            java.lang.String r3 = "enableNext: mediaObj null:[%b], enable:%b"
            com.tencent.mars.xlog.Log.i(r2, r3, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.p7.f():boolean");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.PicWidget");
        bundle.putString("sns_kemdia_path_list", this.f170164g.toString());
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        for (java.util.Map.Entry entry : ((java.util.HashMap) this.f170167j).entrySet()) {
            arrayList.add(java.lang.String.format("%s\n%f\n%f", entry.getKey(), java.lang.Double.valueOf(((fp.n) entry.getValue()).f265213a), java.lang.Double.valueOf(((fp.n) entry.getValue()).f265214b)));
        }
        bundle.putStringArrayList("sns_media_latlong_list", arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h() {
        /*
            r7 = this;
            java.lang.String r0 = "beforeCommit"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.PicWidget"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.ui.MMActivity r2 = r7.f169957c
            boolean r3 = r2 instanceof com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI
            r4 = 1
            com.tencent.mm.plugin.sns.ui.x7 r5 = r7.f170164g
            if (r3 == 0) goto L1e
            java.util.ArrayList r3 = com.tencent.mm.plugin.sns.ui.x7.a(r5)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L1e:
            java.lang.String r3 = "checkMediaFile"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            if (r5 == 0) goto L49
            java.util.ArrayList r6 = com.tencent.mm.plugin.sns.ui.x7.a(r5)
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.L0(r6)
            if (r6 != 0) goto L49
            java.util.ArrayList r5 = com.tencent.mm.plugin.sns.ui.x7.a(r5)
            java.util.Iterator r5 = r5.iterator()
        L37:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = com.tencent.mm.vfs.w6.j(r6)
            if (r6 != 0) goto L37
        L49:
            r4 = 0
        L4a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            if (r4 != 0) goto L58
            r3 = 2131777216(0x7f1056c0, float:1.9185926E38)
            r5 = 2131756315(0x7f10051b, float:1.9143534E38)
            db5.e1.i(r2, r3, r5)
        L58:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.p7.h():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03e6  */
    @Override // com.tencent.mm.plugin.sns.ui.n1, com.tencent.mm.plugin.sns.ui.z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.p7.i(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return true;
    }

    public boolean o(java.util.List list, int i17, boolean z17) {
        r45.ea6 ea6Var;
        com.tencent.mm.vfs.z2 m17;
        com.tencent.mm.vfs.x1 m18;
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPreviewImage", "com.tencent.mm.plugin.sns.ui.PicWidget");
        boolean z18 = true;
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "no image selected");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewImage", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.x7 x7Var = this.f170164g;
        if (x7Var.c() >= 9) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewImage", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
        java.util.Iterator it = list.iterator();
        boolean z19 = z17;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (com.tencent.mm.vfs.w6.j(str)) {
                java.lang.String str2 = "pre_temp_sns_pic" + kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes());
                java.lang.String str3 = this.A;
                com.tencent.mm.plugin.sns.storage.m2.J0(str3, str, str2);
                dw3.c0.f244182a.k(str);
                java.lang.String str4 = str3 + str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "addPreviewImage oldPath:%s, newPath：%s", str, str4);
                boolean z27 = (com.tencent.mm.plugin.sns.ui.ws.a() && com.tencent.mm.plugin.sns.statistics.j0.f164861a.j(str)) ? z18 : z19;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                java.util.Iterator it6 = it;
                x7Var.b(str4, i17, z27, null, null, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
                ((ud4.t) this.f170165h).d(x7Var.c());
                com.tencent.mm.plugin.sns.ui.v4 v4Var = this.f170165h;
                java.util.ArrayList paths = x7Var.d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
                kotlin.jvm.internal.o.g(paths, "paths");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it7 = paths.iterator();
                while (it7.hasNext()) {
                    arrayList.add(new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem((java.lang.String) it7.next(), 0, 0, 0, null, 24, null));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
                ((ud4.t) v4Var).e(new java.util.ArrayList(arrayList), this.f170182y);
                com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
                mMActivity.getIntent().putExtra("sns_kemdia_path_list", x7Var.d());
                if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
                    ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).q7();
                }
                try {
                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                    java.lang.String str5 = a17.f213279f;
                    if (str5 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
                        if (!str5.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    ea6Var = new r45.ea6();
                    ea6Var.f373199h = z27 ? 1 : 2;
                    m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PicWidget", "get report info error " + e17.getMessage());
                }
                if (m17.a() && (m18 = m17.f213266a.m(m17.f213267b)) != null) {
                    j17 = m18.f213235e;
                    ea6Var.f373201m = j17 / 1000;
                    ea6Var.f373200i = com.tencent.mm.compatible.util.Exif.fromFile(str).getUxtimeDatatimeOriginal();
                    ((java.util.HashMap) this.f170168k).put(str4, ea6Var);
                    com.tencent.mm.plugin.sns.model.g6.f164210a.d(str, str4);
                    it = it6;
                    z19 = z27;
                    z18 = true;
                }
                j17 = 0;
                ea6Var.f373201m = j17 / 1000;
                ea6Var.f373200i = com.tencent.mm.compatible.util.Exif.fromFile(str).getUxtimeDatatimeOriginal();
                ((java.util.HashMap) this.f170168k).put(str4, ea6Var);
                com.tencent.mm.plugin.sns.model.g6.f164210a.d(str, str4);
                it = it6;
                z19 = z27;
                z18 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewImage", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.z4
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        android.graphics.Bitmap frameAtTime;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
        if (i17 != 13 || intent == null) {
            i19 = i17;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "onActivityResult from AlbumRecordContainer");
            i19 = intent.getIntExtra("intent_request_code", -1);
        }
        if (i19 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "onActivityResult 1 CONTEXT_CHOSE_IMAGE");
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return false;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 4);
            intent2.putExtra("CropImage_DirectlyIntoFilter", true);
            intent2.putExtra("CropImage_Filter", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.q(this.f169957c, intent, intent2, com.tencent.mm.plugin.sns.model.l4.Ni(), 4, new com.tencent.mm.plugin.sns.ui.t7(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        if (i19 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "onActivityResult 2 CONTEXT_MENU_TAKE_PICTURE");
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(mMActivity.getApplicationContext(), intent, com.tencent.mm.plugin.sns.model.l4.Ni());
            if (b17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 4);
            intent3.putExtra("CropImage_Filter", true);
            intent3.putExtra("CropImage_DirectlyIntoFilter", true);
            intent3.putExtra("CropImage_ImgPath", b17);
            java.lang.String g17 = kk.k.g((b17 + java.lang.System.currentTimeMillis()).getBytes());
            intent3.putExtra("CropImage_OutputPath", com.tencent.mm.plugin.sns.model.l4.Ni() + g17);
            r45.ea6 ea6Var = new r45.ea6();
            ea6Var.f373199h = 1;
            ea6Var.f373201m = java.lang.System.currentTimeMillis();
            ea6Var.f373200i = com.tencent.mm.sdk.platformtools.t8.E1(com.tencent.mm.compatible.util.Exif.fromFile(b17).dateTime);
            ((java.util.HashMap) this.f170168k).put(com.tencent.mm.plugin.sns.model.l4.Ni() + g17, ea6Var);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.p(mMActivity, intent3, 4);
            this.f170166i = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
        int i27 = this.f170182y;
        com.tencent.mm.plugin.sns.ui.x7 x7Var = this.f170164g;
        if (i19 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "onActivityResult 3 REQUEST_CODE_IMAGE_SEND_COMFIRM");
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
            if (stringExtra == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            if (!com.tencent.mm.vfs.w6.j(stringExtra)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            if (x7Var.c() >= 9) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            int intExtra = intent.getIntExtra("CropImage_filterId", 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pre_temp_sns_pic");
            sb6.append(kk.k.g((stringExtra + java.lang.System.currentTimeMillis()).getBytes()));
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "onactivity result " + com.tencent.mm.vfs.w6.k(stringExtra) + " " + stringExtra);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.lang.String str = this.A;
            sb8.append(str);
            sb8.append(sb7);
            com.tencent.mm.vfs.w6.c(stringExtra, sb8.toString());
            java.util.HashMap hashMap = (java.util.HashMap) this.f170167j;
            if (hashMap.containsKey(stringExtra)) {
                hashMap.put(str + sb7, (fp.n) hashMap.get(stringExtra));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            x7Var.b(str + sb7, intExtra, false, null, null, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            mMActivity.getIntent().putExtra("sns_kemdia_path_list", x7Var.d());
            ((ud4.t) this.f170165h).d(x7Var.c());
            com.tencent.mm.plugin.sns.ui.v4 v4Var = this.f170165h;
            java.util.ArrayList paths = x7Var.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            kotlin.jvm.internal.o.g(paths, "paths");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = paths.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem((java.lang.String) it.next(), 0, 0, 0, null, 24, null));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            ((ud4.t) v4Var).e(new java.util.ArrayList(arrayList), i27);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
        if (i19 == 7) {
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "onActivityResult: pic state edit");
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("sns_gallery_temp_paths");
            x7Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            java.util.HashMap hashMap2 = (java.util.HashMap) x7Var.f171493b;
            hashMap2.clear();
            if (stringArrayListExtra == null) {
                x7Var.f171492a = new java.util.ArrayList();
            } else {
                x7Var.f171492a = stringArrayListExtra;
                for (java.util.Iterator<java.lang.String> it6 = stringArrayListExtra.iterator(); it6.hasNext(); it6 = it6) {
                    hashMap2.put(it6.next(), java.lang.Boolean.FALSE);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMedias", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
            mMActivity.getIntent().putExtra("sns_kemdia_path_list", x7Var.d());
            com.tencent.mm.plugin.sns.ui.v4 v4Var2 = this.f170165h;
            java.util.ArrayList paths2 = x7Var.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            kotlin.jvm.internal.o.g(paths2, "paths");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it7 = paths2.iterator();
            while (it7.hasNext()) {
                arrayList2.add(new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem((java.lang.String) it7.next(), 0, 0, 0, null, 24, null));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            ((ud4.t) v4Var2).e(new java.util.ArrayList(arrayList2), i27);
            ((ud4.t) this.f170165h).d(x7Var.c());
            this.f170169l = intent.getIntExtra("sns_update_preview_image_count", 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
        if (i19 == 9) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "onActivityResult CONTEXT_MENU_IMAGE_FROM_MMGALLERY");
            if (intent.hasExtra("key_video_template_info")) {
                mMActivity.getIntent().putExtra("KSnsVideoTempalteInfo", intent.getByteArrayExtra("key_video_template_info"));
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("key_extra_data");
            if (bundleExtra != null && bundleExtra.getByteArray("key_bg_generate_pb") != null && bundleExtra.getByteArray("key_bg_generate_extra_config") != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "goto vlog mode");
                mMActivity.getIntent().getExtras().clear();
                mMActivity.getIntent().putExtra("Kis_take_photo", false);
                mMActivity.getIntent().putExtra("KSnsPostManu", true);
                mMActivity.getIntent().putExtra("Ksnsupload_type", 14);
                mMActivity.getIntent().putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).m7(null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
            if ((stringArrayListExtra2 == null || stringArrayListExtra2.size() <= 0) && com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("K_SEGMENTVIDEOPATH"))) {
                com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
                if (sightCaptureResult != null && !sightCaptureResult.f148807e && (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI)) {
                    ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).p7(sightCaptureResult);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    return true;
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                int intExtra2 = intent.getIntExtra("CropImage_filterId", 0);
                boolean booleanExtra = intent.getBooleanExtra("isTakePhoto", false);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_sns_tmp_file, true) && stringArrayListExtra3 != null) {
                    dw3.c0.f244182a.z(stringArrayListExtra3);
                }
                o(stringArrayListExtra3, intExtra2, booleanExtra);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            java.lang.String stringExtra2 = (stringArrayListExtra2 == null || stringArrayListExtra2.size() <= 0) ? intent.getStringExtra("K_SEGMENTVIDEOPATH") : stringArrayListExtra2.get(0);
            java.lang.String stringExtra3 = intent.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
            mMActivity.getIntent().putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
            mMActivity.getIntent().putExtra("Kis_from_sns_drafg_stg", false);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3) || !com.tencent.mm.vfs.w6.j(stringExtra3)) {
                java.lang.String str2 = com.tencent.mm.plugin.sns.model.l4.Ni() + com.tencent.mm.vfs.w6.p(stringExtra2);
                gp.d dVar = new gp.d();
                try {
                    try {
                        dVar.setDataSource(stringExtra2);
                        zj0.a aVar = new zj0.a();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        aVar.c(0L);
                        yj0.a.d(dVar, aVar.b(), "com/tencent/mm/plugin/sns/ui/PicWidget", "onActivityResult", "(IILandroid/content/Intent;)Z", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        zj0.c.f473285a.set(aVar);
                        long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                        zj0.c.a();
                        frameAtTime = dVar.getFrameAtTime(longValue);
                        yj0.a.e(dVar, frameAtTime, "com/tencent/mm/plugin/sns/ui/PicWidget", "onActivityResult", "(IILandroid/content/Intent;)Z", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.PicWidget", "savebitmap error %s", e17.getMessage());
                    }
                    if (frameAtTime == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.PicWidget", "get bitmap error");
                        try {
                            dVar.release();
                        } catch (java.lang.Exception unused) {
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "getBitmap1 %d %d", java.lang.Integer.valueOf(frameAtTime.getWidth()), java.lang.Integer.valueOf(frameAtTime.getHeight()));
                        com.tencent.mm.sdk.platformtools.x.D0(frameAtTime, 80, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "getBitmap2 %d %d", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight));
                        try {
                            dVar.release();
                        } catch (java.lang.Exception unused2) {
                        }
                        stringExtra3 = str2;
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        dVar.release();
                    } catch (java.lang.Exception unused3) {
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    throw th6;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "video path %s thumb path %s and %s %s ", stringExtra2, stringExtra3, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra2)), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra3)));
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(stringExtra2);
            if (mMActivity instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
                ca4.z0.C0(intent.getStringExtra("KSEGMENTMEDIAEDITID"));
                com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = (com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity;
                snsUploadUI.s7(stringExtra2, stringExtra3, p17, null, false, false);
                snsUploadUI.m7(null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return true;
        }
        if (i19 == 11) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "onActivityResult REQUEST_CODE_MMSIGHT_CAPTURE");
            com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult2 = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
            if (sightCaptureResult2 != null) {
                if (!sightCaptureResult2.f148807e) {
                    mMActivity.getIntent().putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                    ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) mMActivity).p7(sightCaptureResult2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    return true;
                }
                java.lang.String str3 = sightCaptureResult2.f148815p;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_sns_tmp_file, true)) {
                        dw3.c0.f244182a.w(str3);
                    }
                    o(java.util.Collections.singletonList(str3), 0, true);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    return true;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c A[EDGE_INSN: B:46:0x014c->B:47:0x014c BREAK  A[LOOP:0: B:19:0x0075->B:38:0x0143], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.tencent.mm.plugin.sns.model.y7 r26) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.p7.p(com.tencent.mm.plugin.sns.model.y7):void");
    }

    public void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.PicWidget");
        int c17 = this.f170164g.c();
        int i17 = this.f170182y;
        int i18 = i17 - c17;
        if (i18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PicWidget", "has select the max image count");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return;
        }
        com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(2, 0);
        java.lang.String k17 = ai3.d.k(t21.o2.Bi().Ai());
        java.lang.String m17 = ai3.d.m(k17);
        com.tencent.mm.plugin.sns.statistics.h hVar = com.tencent.mm.plugin.sns.statistics.h.f164856a;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightParams.f148819f;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = hVar.b(k17, m17, videoTransPara, videoTransPara.f71195h * 1000, 49);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ignore_remux_without_edit, false)) {
            b17.f155669d = 2;
        }
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
        videoCaptureReportInfo.f155690d = 7;
        b17.I = videoCaptureReportInfo;
        long c18 = c01.id.c();
        if (i18 < i17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 2, ca4.z0.l(), java.lang.Long.valueOf(c18));
            b17.f155682t = java.lang.Boolean.FALSE;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 2, ca4.z0.l(), java.lang.Long.valueOf(c18));
        }
        qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
        ((pc0.e2) c1Var).wi(this.f169957c, b17, new com.tencent.mm.plugin.sns.ui.u7(this));
        v(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    public final r45.h96 r(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMediaEcsInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        java.util.Map map = this.E;
        if (map != null) {
            r45.h96 h96Var = (r45.h96) ((java.util.HashMap) map).get(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediaEcsInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return h96Var;
        }
        r45.h96 h96Var2 = this.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediaEcsInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return h96Var2;
    }

    public android.view.View s(android.view.View view, android.view.View view2, com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, android.view.View view3, android.view.View view4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return null;
    }

    public void t(com.tencent.mm.plugin.sns.model.y7 y7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    public final void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.PicWidget");
        int c17 = this.f170164g.c();
        int i17 = this.f170182y;
        int i18 = i17 - c17;
        if (i18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PicWidget", "has select the max image count");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return;
        }
        java.lang.String e17 = com.tencent.mm.sdk.platformtools.x2.e();
        com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
        java.lang.String string = mMActivity.getSharedPreferences(e17, 0).getString("gallery", "1");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 2, 2, ca4.z0.l(), java.lang.Long.valueOf(c01.id.c()));
        if (string.equalsIgnoreCase("0")) {
            com.tencent.mm.pluginsdk.ui.tools.l7.c(mMActivity, 2, 1, 0, 1, false, null);
        } else if (i18 < i17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_can_select_video_and_pic", true);
            com.tencent.mm.pluginsdk.ui.tools.l7.c(this.f169957c, 9, i18, 4, 1, com.tencent.mm.plugin.sns.ui.ws.a(), intent);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_edit_video_max_time_length", d11.s.fj().nj().f71195h);
            intent2.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false)));
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            boolean h17 = ez0.o.f257835a.h();
            com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "enableSnsTemplate:%b", java.lang.Boolean.valueOf(h17));
            if (h17) {
                intent2.putExtra("key_sns_publish_template", true);
                i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i18);
            }
            intent2.putExtra("key_can_select_video_and_pic", false);
            com.tencent.mm.pluginsdk.ui.tools.l7.c(this.f169957c, 9, i18, 4, 3, com.tencent.mm.plugin.sns.ui.ws.a(), intent2);
        }
        v(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    public final void v(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
        com.tencent.mm.autogen.mmdata.rpt.SnsBeforePostImageInfoStruct snsBeforePostImageInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsBeforePostImageInfoStruct();
        snsBeforePostImageInfoStruct.f60464f = snsBeforePostImageInfoStruct.i();
        snsBeforePostImageInfoStruct.f60462d = i17;
        snsBeforePostImageInfoStruct.f60463e = snsBeforePostImageInfoStruct.b("SessionId", this.f170173p, true);
        snsBeforePostImageInfoStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.PicWidget");
    }

    public final boolean w(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
        if (bundle == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return false;
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("sns_media_latlong_list");
        if (stringArrayList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
            return false;
        }
        java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            java.lang.String[] split = it.next().split("\n");
            if (3 != split.length) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PicWidget", "invalid params");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
                return true;
            }
            try {
                ((java.util.HashMap) this.f170167j).put(split[0].trim(), new fp.n(com.tencent.mm.sdk.platformtools.t8.F(split[1], 0.0d), com.tencent.mm.sdk.platformtools.t8.F(split[2], 0.0d), 0.0d));
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PicWidget", e17.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.PicWidget");
        return true;
    }
}
