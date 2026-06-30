package xc2;

/* loaded from: classes2.dex */
public abstract class j implements xc2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public in5.s0 f453161a;

    /* renamed from: b, reason: collision with root package name */
    public xc2.p0 f453162b;

    /* renamed from: c, reason: collision with root package name */
    public int f453163c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f453164d = jz5.h.b(new xc2.i(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f453165e = jz5.h.b(xc2.g.f453137d);

    /* renamed from: f, reason: collision with root package name */
    public boolean f453166f;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (kotlin.jvm.internal.o.b(r4, r6.f453234a.getJump_id()) == false) goto L31;
     */
    @Override // xc2.z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(xc2.p0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "infoEx"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "onDataUpdate"
            java.lang.String r1 = "BaseJumperEventHandler"
            com.tencent.mars.xlog.Log.i(r1, r0)
            xc2.p0 r0 = r5.f453162b
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L18
            boolean r4 = r0.f453262x
            if (r4 != r2) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r3
        L19:
            if (r4 == 0) goto L4f
            r4 = 0
            if (r0 == 0) goto L27
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f453234a
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.getJump_id()
            goto L28
        L27:
            r0 = r4
        L28:
            if (r0 == 0) goto L33
            int r0 = r0.length()
            if (r0 != 0) goto L31
            goto L33
        L31:
            r0 = r3
            goto L34
        L33:
            r0 = r2
        L34:
            if (r0 != 0) goto L4f
            xc2.p0 r0 = r5.f453162b
            if (r0 == 0) goto L42
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f453234a
            if (r0 == 0) goto L42
            java.lang.String r4 = r0.getJump_id()
        L42:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r6.f453234a
            java.lang.String r0 = r0.getJump_id()
            boolean r0 = kotlin.jvm.internal.o.b(r4, r0)
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r2 = r3
        L50:
            r5.f453162b = r6
            if (r2 == 0) goto L62
            boolean r6 = r5.u()
            if (r6 == 0) goto L62
            r5.l()
            java.lang.String r6 = "onDataUpdate， doPreload again"
            com.tencent.mars.xlog.Log.i(r1, r6)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.j.a(xc2.p0):void");
    }

    @Override // xc2.z2
    public void b(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // xc2.z2
    public void c(java.lang.String activityName, xc2.p0 infoEx, android.view.View jumpView) {
        kotlin.jvm.internal.o.g(activityName, "activityName");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
    }

    @Override // xc2.z2
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
    }

    @Override // xc2.z2
    public void e(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
    }

    @Override // xc2.z2
    public void f(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        if (infoEx.f453234a.getIs_native_ad_component()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
            if (baseFinderFeed == null) {
                com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "onJumpViewFocus: feedId is null, update native ad extra Info failed");
                return;
            }
            long itemId = baseFinderFeed.getItemId();
            sc2.q8 q8Var = infoEx.f453233J;
            boolean z17 = (q8Var == null || q8Var.f406177a) ? false : true;
            android.content.Context context = holder.f293121e;
            if (z17) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
                if (a8Var != null) {
                    r45.i16 m17 = m(jumpView, infoEx);
                    sc2.x6 x6Var = (sc2.x6) a8Var.f406220s.c(java.lang.Long.valueOf(itemId), sc2.p7.f406151d);
                    if (x6Var != null) {
                        x6Var.f406368b = m17;
                    }
                }
            }
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var2 = (sc2.a8) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
            if (a8Var2 != null) {
                a8Var2.l7(itemId, android.os.SystemClock.uptimeMillis());
            }
        }
    }

    @Override // xc2.z2
    public void g(android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        if (infoEx.f453234a.getIs_native_ad_component()) {
            in5.s0 s0Var = this.f453161a;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
            java.lang.Long l17 = null;
            java.lang.Long valueOf = baseFinderFeed != null ? java.lang.Long.valueOf(baseFinderFeed.getItemId()) : null;
            if (s0Var != null && valueOf != null) {
                long longValue = valueOf.longValue();
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
                if (a8Var != null) {
                    a8Var.l7(longValue, 0L);
                }
                l17 = java.lang.Long.valueOf(longValue);
            }
            if (l17 == null) {
                com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "onPause: feedId or holder is null, update native ad extra Info failed");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r6 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    @Override // xc2.z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r17, in5.s0 r18, android.view.View r19, xc2.p0 r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.j.h(boolean, in5.s0, android.view.View, xc2.p0):void");
    }

    @Override // xc2.z2
    public void i(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        if (infoEx.f453234a.getIs_native_ad_component()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
            if (baseFinderFeed == null) {
                com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "onJumpViewUnFocus: feedId is null, update native ad extra Info failed");
                return;
            }
            long itemId = baseFinderFeed.getItemId();
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
            if (a8Var != null) {
                a8Var.l7(itemId, 0L);
            }
        }
    }

    @Override // xc2.z2
    public void j(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(event, "event");
    }

    public void k() {
    }

    public void l() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        r45.k74 lite_app_info;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3;
        xc2.p0 p0Var = this.f453162b;
        boolean z17 = true;
        if ((p0Var == null || (finderJumpInfo3 = p0Var.f453234a) == null || finderJumpInfo3.getJumpinfo_type() != 6) ? false : true) {
            xc2.p0 p0Var2 = this.f453162b;
            java.lang.String string = (p0Var2 == null || (finderJumpInfo2 = p0Var2.f453234a) == null || (lite_app_info = finderJumpInfo2.getLite_app_info()) == null) ? null : lite_app_info.getString(0);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            xc2.p0 p0Var3 = this.f453162b;
            r45.k74 lite_app_info2 = (p0Var3 == null || (finderJumpInfo = p0Var3.f453234a) == null) ? null : finderJumpInfo.getLite_app_info();
            if (lite_app_info2 != null) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                in5.s0 s0Var = this.f453161a;
                ((c61.p2) ybVar).Qj(s0Var != null ? s0Var.f293121e : null, lite_app_info2);
            }
        }
    }

    public final r45.i16 m(android.view.View view, xc2.p0 p0Var) {
        r45.i16 i16Var = new r45.i16();
        i16Var.set(0, java.lang.Integer.valueOf(view.getMeasuredWidth()));
        int i17 = 1;
        i16Var.set(1, java.lang.Integer.valueOf(view.getMeasuredHeight()));
        r45.f5 f5Var = new r45.f5();
        int i18 = com.tencent.mm.view.TouchableLayout.f213511d;
        f5Var.set(0, java.lang.Integer.valueOf(com.tencent.mm.view.TouchableLayout.f213511d));
        f5Var.set(1, java.lang.Integer.valueOf(com.tencent.mm.view.TouchableLayout.f213512e));
        f5Var.set(2, java.lang.Integer.valueOf(f5Var.getInteger(0)));
        f5Var.set(3, java.lang.Integer.valueOf(f5Var.getInteger(1)));
        f5Var.set(4, 1);
        f5Var.set(5, 1);
        f5Var.set(6, 0);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
        f5Var.set(7, java.lang.Long.valueOf(a8Var != null ? a8Var.f405766y : 0L));
        com.tencent.mm.plugin.finder.assist.e8 e8Var = com.tencent.mm.plugin.finder.assist.e8.f102131a;
        f5Var.set(8, java.lang.Integer.valueOf(e8Var.c(null)));
        f5Var.set(9, java.lang.Integer.valueOf(e8Var.a()));
        i16Var.set(2, f5Var);
        r45.om0 om0Var = new r45.om0();
        om0Var.set(0, ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9());
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        om0Var.set(1, "");
        om0Var.set(3, ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).wi());
        i16Var.set(3, om0Var);
        r45.qy qyVar = new r45.qy();
        java.lang.String str = p0Var.f453247i;
        if (kotlin.jvm.internal.o.b(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str)) {
            i17 = 2;
        } else if (kotlin.jvm.internal.o.b("TWO_FLOW", str)) {
            i17 = 4;
        } else if (kotlin.jvm.internal.o.b("single_comment", str)) {
            i17 = 5;
        }
        qyVar.set(0, java.lang.Integer.valueOf(i17));
        i16Var.set(4, qyVar);
        return i16Var;
    }

    public org.json.JSONObject n(xc2.p0 infoEx) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        cw2.da videoView;
        java.lang.String report_info;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = infoEx.f453234a;
        kotlin.jvm.internal.o.g(info, "info");
        int i17 = 0;
        int i18 = 1;
        if (!(info.getBusiness_type() == 8 || info.getRed_packet_type() > 0) || (report_info = info.getReport_info()) == null) {
            if (info.getBusiness_type() == 124) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    in5.s0 s0Var = this.f453161a;
                    if (s0Var != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null && (videoView = finderVideoLayout.getVideoView()) != null) {
                        i17 = (int) ((((float) videoView.getCurrentPlayMs()) * 100) / ((float) videoView.getVideoDurationMs()));
                    }
                    jSONObject.put("playpercent", i17);
                    return jSONObject;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "getCustomKv: e=" + th6);
                }
            }
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(report_info)) {
            return null;
        }
        byte[] decode = android.util.Base64.decode(report_info, 0);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(new java.lang.String(decode, r26.c.f368865a));
            int optInt = jSONObject2.optInt("bubble_statu");
            int optInt2 = jSONObject2.optInt("bubble_connection_type");
            java.lang.String optString = jSONObject2.optString("coverid");
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("bubble_statu", optInt);
            jSONObject3.put("bubble_connection_type", optInt2);
            jSONObject3.put("coverid", optString);
            if (this.f453163c != 5) {
                i18 = 2;
            }
            jSONObject3.put("bubble_type", i18);
            return jSONObject3;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public java.lang.String o() {
        return "feed_jumpicon";
    }

    public int p() {
        return 0;
    }

    public void q(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        r45.i16 i16Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        boolean is_native_ad_component = infoEx.f453234a.getIs_native_ad_component();
        xc2.n nVar = xc2.n.f453212a;
        android.content.Context context = holder.f293121e;
        if (is_native_ad_component) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
            if (baseFinderFeed != null) {
                long itemId = baseFinderFeed.getItemId();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
                i16Var = a8Var != null ? a8Var.V6(itemId) : null;
            } else {
                i16Var = null;
            }
            if (i16Var == null) {
                com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "get AdExtraInfoByFeedId null onClick");
            }
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.n.b(nVar, context, jumpView, infoEx, p(), o(), null, n(infoEx), i16Var, 32, null);
        } else {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.n.b(nVar, context, jumpView, infoEx, p(), o(), null, n(infoEx), null, 160, null);
        }
        infoEx.f453241d0 = null;
    }

    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo info = infoEx.f453234a;
        kotlin.jvm.internal.o.g(info, "info");
        boolean z17 = info.getBusiness_type() == 8 || info.getRed_packet_type() > 0;
        android.content.Context context = holder.f293121e;
        if (z17) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            java.lang.Integer valueOf = nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null;
            infoEx.f453253o = "commentScene=" + valueOf + "&isFromComment=" + (kotlin.jvm.internal.o.b(infoEx.f453247i, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT) ? 1 : 0) + "&finderJumpId=" + info.getJump_id();
            java.lang.String jump_id = info.getJump_id();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
            if (jump_id != null && baseFinderFeed != null) {
                sd2.a.f406679a.put(jump_id, baseFinderFeed);
            }
        }
        java.lang.Object obj = holder.f293125i;
        if (obj instanceof so2.y0) {
            so2.y0 y0Var = (so2.y0) obj;
            if (y0Var.f410703d.a1()) {
                int i17 = infoEx.f453257s == 32 ? 154 : 138;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.report.u.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ((com.tencent.mm.plugin.finder.report.u) a17).Q6(holder, y0Var, false, i17);
                return;
            }
            if (y0Var.f410703d.i1()) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.report.x.class);
                kotlin.jvm.internal.o.f(a18, "get(...)");
                ((com.tencent.mm.plugin.finder.report.x) a18).P6(pm0.v.u(y0Var.f410703d.field_feedId), 3);
            }
        }
    }

    public final void s() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        if (!u()) {
            com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "not preload, shouldPreload()=" + u());
            return;
        }
        boolean t17 = t();
        jz5.g gVar = this.f453164d;
        jz5.g gVar2 = this.f453165e;
        int i17 = 0;
        if (t17) {
            ((android.os.Handler) ((jz5.n) gVar2).getValue()).post((java.lang.Runnable) ((jz5.n) gVar).getValue());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post preloadRunnable by play progress, delayPreloadTime=");
            xc2.p0 p0Var = this.f453162b;
            if (p0Var != null && (finderJumpInfo2 = p0Var.f453234a) != null) {
                i17 = finderJumpInfo2.getDelay_preload_time();
            }
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", sb6.toString());
            return;
        }
        xc2.p0 p0Var2 = this.f453162b;
        if (p0Var2 != null && (finderJumpInfo = p0Var2.f453234a) != null) {
            i17 = finderJumpInfo.getDelay_preload_time();
        }
        long j17 = i17 * 1000;
        ((android.os.Handler) ((jz5.n) gVar2).getValue()).postDelayed((java.lang.Runnable) ((jz5.n) gVar).getValue(), j17);
        com.tencent.mars.xlog.Log.i("BaseJumperEventHandler", "post preloadRunnable by expose time delayPreloadTime=" + j17 + "ms");
    }

    public final boolean t() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127656d8).getValue()).r()).booleanValue();
    }

    public boolean u() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        xc2.p0 p0Var = this.f453162b;
        if (p0Var == null || (finderJumpInfo = p0Var.f453234a) == null) {
            return false;
        }
        return finderJumpInfo.getNeed_preload();
    }
}
