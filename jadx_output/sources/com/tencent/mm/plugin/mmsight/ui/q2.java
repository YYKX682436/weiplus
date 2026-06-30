package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f149406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149407e;

    public q2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI, long j17) {
        this.f149407e = sightCaptureUI;
        this.f149406d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "connect cost %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f149406d));
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149407e;
        di3.w.e(sightCaptureUI.V.f148819f, di3.v.MMSightCameraConfig);
        sightCaptureUI.setSelfNavigationBarColor(-637534208);
        sightCaptureUI.setSelfNavigationBarVisible(8);
        if (sightCaptureUI.V == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "sightParams error!");
            return;
        }
        int c17 = wo.i.c();
        sightCaptureUI.f149252y0 = c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "initOnCreate, numCamera: %s", java.lang.Integer.valueOf(c17));
        sightCaptureUI.f149249x0 = new fp.e(sightCaptureUI);
        com.tencent.mm.plugin.mmsight.SightParams sightParams = sightCaptureUI.V;
        sightCaptureUI.f149230f = sightParams.f148824n;
        int i17 = sightParams.f148818e;
        sightCaptureUI.f149229e = i17;
        sightCaptureUI.L = i17 == 2;
        ei3.y.f253189b.f253190a = sightParams;
        int i18 = sightParams.f148817d;
        sightCaptureUI.f149228d = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, captureMode: %s, showHint: %s, defaultCamera: %s, scene: %s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(sightCaptureUI.f149230f), java.lang.Integer.valueOf(sightCaptureUI.f149229e), java.lang.Integer.valueOf(sightCaptureUI.V.f148825o));
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightCaptureUI.V.f148819f;
        sightCaptureUI.f149232h = videoTransPara;
        if (videoTransPara == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, cannot get videoParams");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "SightCaptureUI onCreate, videoParams: %s", videoTransPara);
        sightCaptureUI.getWindow().addFlags(2097280);
        if (fp.h.c(19)) {
            sightCaptureUI.getWindow().setFlags(201327616, 201327616);
            ai3.d.f5107a = true;
            com.tencent.mm.ui.r0.a(sightCaptureUI, false);
        } else {
            sightCaptureUI.getWindow().setFlags(1024, 1024);
            ai3.d.f5107a = false;
        }
        sightCaptureUI.getWindow().addFlags(67108864);
        di3.d dVar = new di3.d(sightCaptureUI, 2);
        sightCaptureUI.X = dVar;
        dVar.f232689g = sightCaptureUI;
        dVar.enable();
        sightCaptureUI.f149245u = (android.view.ViewGroup) sightCaptureUI.findViewById(com.tencent.mm.R.id.chs);
        sightCaptureUI.f149246v = (android.view.ViewGroup) sightCaptureUI.findViewById(com.tencent.mm.R.id.cij);
        sightCaptureUI.f149254z = (com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView) sightCaptureUI.findViewById(com.tencent.mm.R.id.gfh);
        sightCaptureUI.f149236n = (com.tencent.mm.plugin.video.ObservableTextureView) sightCaptureUI.findViewById(com.tencent.mm.R.id.l4r);
        sightCaptureUI.f149237o = (com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton) sightCaptureUI.findViewById(com.tencent.mm.R.id.los);
        sightCaptureUI.f149242r = sightCaptureUI.findViewById(com.tencent.mm.R.id.mwp);
        sightCaptureUI.f149243s = sightCaptureUI.findViewById(com.tencent.mm.R.id.mwn);
        sightCaptureUI.f149238p = (android.widget.ImageView) sightCaptureUI.findViewById(com.tencent.mm.R.id.mwg);
        sightCaptureUI.f149241q = (android.widget.ImageView) sightCaptureUI.findViewById(com.tencent.mm.R.id.mwh);
        sightCaptureUI.f149244t = sightCaptureUI.findViewById(com.tencent.mm.R.id.bz7);
        sightCaptureUI.A = (android.view.ViewGroup) sightCaptureUI.findViewById(com.tencent.mm.R.id.f487559p02);
        android.widget.TextView textView = (android.widget.TextView) sightCaptureUI.findViewById(com.tencent.mm.R.id.b6r);
        sightCaptureUI.E = textView;
        int i19 = sightCaptureUI.f149228d;
        if (i19 == 2) {
            textView.setText(com.tencent.mm.R.string.f492544gw5);
        } else if (i19 == 1) {
            textView.setText(com.tencent.mm.R.string.gw6);
        } else if (i19 == 0) {
            textView.setText(com.tencent.mm.R.string.f492543gw4);
        }
        sightCaptureUI.H = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) sightCaptureUI.findViewById(com.tencent.mm.R.id.l27);
        android.widget.ImageView imageView = (android.widget.ImageView) sightCaptureUI.findViewById(com.tencent.mm.R.id.ntp);
        sightCaptureUI.f149247w = imageView;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageView.getLayoutParams();
        int i27 = layoutParams.topMargin;
        if (com.tencent.mm.ui.bk.u(sightCaptureUI.getContext(), false)) {
            i27 += com.tencent.mm.ui.bk.p(sightCaptureUI.getContext());
        }
        layoutParams.setMargins(layoutParams.leftMargin, i27, layoutParams.rightMargin, layoutParams.bottomMargin);
        sightCaptureUI.f149247w.setLayoutParams(layoutParams);
        android.widget.ImageView imageView2 = (android.widget.ImageView) sightCaptureUI.findViewById(com.tencent.mm.R.id.d6l);
        sightCaptureUI.f149248x = imageView2;
        imageView2.setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.i3(sightCaptureUI));
        if (!sightCaptureUI.V.f148828r) {
            sightCaptureUI.f149248x.setVisibility(8);
        }
        sightCaptureUI.B = (android.widget.ImageView) sightCaptureUI.findViewById(com.tencent.mm.R.id.nxo);
        sightCaptureUI.C = (com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView) sightCaptureUI.findViewById(com.tencent.mm.R.id.d4k);
        sightCaptureUI.F = (com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView) sightCaptureUI.findViewById(com.tencent.mm.R.id.j98);
        sightCaptureUI.G = sightCaptureUI.findViewById(com.tencent.mm.R.id.f486576lq0);
        sightCaptureUI.f149227J = (com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView) sightCaptureUI.findViewById(com.tencent.mm.R.id.ofi);
        if (com.tencent.mm.ui.bk.u(sightCaptureUI.getContext(), false)) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) sightCaptureUI.f149227J.getLayoutParams();
            layoutParams2.height = com.tencent.mm.ui.bk.p(sightCaptureUI.getContext()) + sightCaptureUI.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480569a62);
            sightCaptureUI.f149227J.setLayoutParams(layoutParams2);
        }
        sightCaptureUI.D = new hi3.b(sightCaptureUI.C);
        if (sightCaptureUI.f149230f) {
            sightCaptureUI.E.setVisibility(0);
        } else {
            sightCaptureUI.E.setVisibility(8);
        }
        int b17 = i65.a.b(sightCaptureUI.getContext(), 120);
        sightCaptureUI.f149254z.b(b17, b17);
        if (fp.h.c(19)) {
            int max = java.lang.Math.max(com.tencent.mm.ui.bl.c(sightCaptureUI), com.tencent.mm.ui.bl.g(sightCaptureUI));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) sightCaptureUI.f149237o.getLayoutParams();
            marginLayoutParams.bottomMargin += max;
            sightCaptureUI.f149237o.setLayoutParams(marginLayoutParams);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) sightCaptureUI.f149244t.getLayoutParams();
            marginLayoutParams2.bottomMargin += max;
            sightCaptureUI.f149244t.setLayoutParams(marginLayoutParams2);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) sightCaptureUI.f149238p.getLayoutParams();
            marginLayoutParams3.bottomMargin += max;
            sightCaptureUI.f149238p.setLayoutParams(marginLayoutParams3);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) sightCaptureUI.f149248x.getLayoutParams();
            marginLayoutParams4.bottomMargin += max;
            sightCaptureUI.f149248x.setLayoutParams(marginLayoutParams4);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = (android.view.ViewGroup.MarginLayoutParams) sightCaptureUI.f149242r.getLayoutParams();
            marginLayoutParams5.bottomMargin += max;
            sightCaptureUI.f149242r.setLayoutParams(marginLayoutParams5);
        }
        int i28 = sightCaptureUI.f149228d;
        if (i28 == 1 || i28 == 0) {
            sightCaptureUI.f149237o.setLongPressCallback(new com.tencent.mm.plugin.mmsight.ui.j3(sightCaptureUI));
            sightCaptureUI.f149237o.setErrorPressCallback(new com.tencent.mm.plugin.mmsight.ui.k3(sightCaptureUI));
            sightCaptureUI.f149237o.setLongPressScrollCallback(new com.tencent.mm.plugin.mmsight.ui.l3(sightCaptureUI));
        }
        int i29 = sightCaptureUI.f149228d;
        if (i29 == 0 || i29 == 2) {
            sightCaptureUI.f149237o.setSimpleTapCallback(new com.tencent.mm.plugin.mmsight.ui.m3(sightCaptureUI));
        }
        if (sightCaptureUI.f149252y0 > 1) {
            sightCaptureUI.f149247w.setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.n3(sightCaptureUI));
        } else {
            sightCaptureUI.f149247w.setVisibility(8);
        }
        sightCaptureUI.f149241q.setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.f2(sightCaptureUI));
        sightCaptureUI.f149238p.setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.g2(sightCaptureUI));
        sightCaptureUI.f149244t.setOnClickListener(new com.tencent.mm.plugin.mmsight.ui.h2(sightCaptureUI));
        sightCaptureUI.F.setTouchCallback(new com.tencent.mm.plugin.mmsight.ui.i2(sightCaptureUI));
        sightCaptureUI.i7(0);
        sightCaptureUI.c7();
        sightCaptureUI.D1 = java.lang.Boolean.TRUE;
    }
}
