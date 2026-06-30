package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i2 implements ut3.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f118616d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f118617e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f118618f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.viewmodel.e6 f118619g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f118620h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f118621i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f118622m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderMedia f118623n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f118624o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f118625p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.assist.x1 f118626q;

    public i2(android.app.Activity activity, android.widget.ImageView coverIv, android.view.View replaceCoverIv, com.tencent.mm.plugin.finder.live.viewmodel.e6 callback) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(coverIv, "coverIv");
        kotlin.jvm.internal.o.g(replaceCoverIv, "replaceCoverIv");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f118616d = activity;
        this.f118617e = coverIv;
        this.f118618f = replaceCoverIv;
        this.f118619g = callback;
        this.f118620h = kotlinx.coroutines.z0.b();
        this.f118621i = "";
        this.f118622m = "";
        this.f118624o = "";
        this.f118625p = "";
        replaceCoverIv.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.a2(this));
        this.f118626q = new com.tencent.mm.plugin.finder.assist.x1(activity, 100112);
    }

    public final void a(ml2.x3 x3Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", x3Var.f328233d);
        jSONObject.put("sence", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 7L, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "coverUrl"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "setCover liveCover:"
            java.lang.String r0 = r0.concat(r6)
            java.lang.String r1 = "Finder.FinderGameLivePostCoverWidget"
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.String r0 = ""
            if (r7 != 0) goto L15
            r7 = r0
        L15:
            r5.f118624o = r7
            if (r8 != 0) goto L1b
            r7 = r0
            goto L1c
        L1b:
            r7 = r8
        L1c:
            r5.f118625p = r7
            r7 = 0
            if (r8 == 0) goto L37
            int r1 = r8.length()
            if (r1 <= 0) goto L29
            r1 = 1
            goto L2a
        L29:
            r1 = 0
        L2a:
            if (r1 == 0) goto L2d
            goto L2e
        L2d:
            r8 = r7
        L2e:
            if (r8 == 0) goto L37
            km2.g r1 = km2.g.f309100a
            km2.e r8 = r1.d(r8)
            goto L38
        L37:
            r8 = r7
        L38:
            android.widget.ImageView r1 = r5.f118617e
            if (r8 == 0) goto L5c
            zl2.r4 r6 = zl2.r4.f473950a
            int r2 = r1.getWidth()
            r3 = 500(0x1f4, float:7.0E-43)
            int r2 = java.lang.Math.min(r2, r3)
            int r4 = r1.getHeight()
            int r3 = java.lang.Math.min(r4, r3)
            java.lang.String r8 = r8.f309090a
            r6.P(r1, r8, r2, r3)
            r5.f118621i = r8
            r5.f118622m = r0
            r5.f118623n = r7
            goto L8d
        L5c:
            r5.f118622m = r6
            r5.f118623n = r7
            mn2.g1 r6 = mn2.g1.f329975a
            vo0.d r8 = r6.e()
            mn2.q3 r0 = new mn2.q3
            java.lang.String r2 = r5.f118622m
            com.tencent.mm.plugin.finder.storage.y90 r3 = com.tencent.mm.plugin.finder.storage.y90.f128356f
            r0.<init>(r2, r3)
            wo0.c r8 = r8.a(r0)
            mn2.f1 r0 = mn2.f1.f329953d
            yo0.i r6 = r6.h(r0)
            r8.g(r6)
            boolean r6 = r8 instanceof wo0.b
            if (r6 == 0) goto L83
            r7 = r8
            wo0.b r7 = (wo0.b) r7
        L83:
            if (r7 == 0) goto L8d
            com.tencent.mm.plugin.finder.live.widget.h2 r6 = new com.tencent.mm.plugin.finder.live.widget.h2
            r6.<init>(r5)
            r7.i(r1, r6)
        L8d:
            com.tencent.mm.plugin.finder.live.viewmodel.e6 r6 = r5.f118619g
            r6.onChange()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.i2.b(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_data", bundle);
        kotlin.jvm.internal.o.e(captureDataManager$CaptureVideoNormalModel, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("KSEGMENTMEDIAINFO", captureDataManager$CaptureVideoNormalModel);
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, android.os.Bundle bundle) {
    }
}
