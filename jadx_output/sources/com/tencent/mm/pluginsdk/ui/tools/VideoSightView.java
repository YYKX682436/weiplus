package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class VideoSightView extends com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView implements com.tencent.mm.pluginsdk.ui.tools.f4 {
    public boolean R;
    public java.lang.String S;
    public int T;
    public boolean U;
    public boolean V;

    public VideoSightView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.T = 0;
        this.U = true;
        this.V = false;
        t();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void a(double d17, boolean z17) {
        b(d17);
    }

    public void b(double d17) {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        if (sVar != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.e eVar = new com.tencent.mm.plugin.sight.decode.model.e(sVar, d17);
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(eVar, 0L);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean c(android.content.Context context, boolean z17) {
        if (this.S == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoSightView", "start::use path is null!");
            return false;
        }
        java.lang.String str = wo.v1.f447833m.D;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals("other") && com.tencent.mm.plugin.sight.decode.model.s.b(this.S)) {
            super.d(this.S, false, 0);
            q(!this.V);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", this.S, java.lang.Boolean.valueOf(this.R));
        if (this.R && !z17) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.tencent.mm.sdk.platformtools.i1.f(context, intent, new com.tencent.mm.vfs.r6(this.S), "video/*", false);
        try {
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, context.getString(com.tencent.mm.R.string.f490597zj));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/VideoSightView", "start", "(Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/tools/VideoSightView", "start", "(Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
            db5.e1.T(context, context.getResources().getString(com.tencent.mm.R.string.k7_));
        }
        this.R = true;
        return false;
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView, com.tencent.mm.plugin.sight.decode.model.a
    public void d(java.lang.String str, boolean z17, int i17) {
        this.S = str;
        super.d(str, z17, i17);
    }

    public int getCurrentPosition() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView, com.tencent.mm.pluginsdk.ui.tools.f4
    public int getDuration() {
        return super.getDuration();
    }

    public double getLastProgresstime() {
        if (getController() == null) {
            return 0.0d;
        }
        com.tencent.mm.plugin.sight.decode.model.s controller = getController();
        double d17 = controller.B;
        return d17 != -1.0d ? d17 : controller.A;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public long getLastSurfaceUpdateTime() {
        return 0L;
    }

    public boolean isPlaying() {
        return this.M.h();
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.U) {
            setDrawableWidth(getResources().getDisplayMetrics().widthPixels);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void onDetach() {
        this.M.f().dead();
    }

    @Override // com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        if (!this.N || (i28 = i19 - i17) <= 0) {
            return;
        }
        setDrawableWidth(i28);
    }

    @Override // com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public void pause() {
        super.d(this.S, true, 0);
    }

    public void setEnableConfigChanged(boolean z17) {
        this.U = z17;
    }

    public void setForceScaleFullScreen(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setLoop(boolean z17) {
        setLoopImp(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setMute(boolean z17) {
        this.V = z17;
        q(!z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnInfoCallback(com.tencent.mm.pluginsdk.ui.tools.b4 b4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSeekCompleteCallback(com.tencent.mm.pluginsdk.ui.tools.c4 c4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSurfaceCallback(com.tencent.mm.pluginsdk.ui.tools.d4 d4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOneTimeVideoTextureUpdateCallback(com.tencent.mm.pluginsdk.ui.tools.e4 e4Var) {
    }

    public void setPlayProgressCallback(boolean z17) {
        if (z17) {
            setOnDecodeDurationListener(new com.tencent.mm.pluginsdk.ui.tools.x7(this));
        } else {
            setOnDecodeDurationListener(null);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setThumb(android.graphics.Bitmap bitmap) {
        s(bitmap);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoCallback(com.tencent.mm.pluginsdk.ui.tools.a4 a4Var) {
        this.L = a4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoPath(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(this.L == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", objArr);
        this.T = 0;
        this.S = str;
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.L;
        if (a4Var != null) {
            a4Var.onPrepared();
        }
    }

    public boolean start() {
        return c(getContext(), false);
    }

    public void t() {
        java.lang.String str = wo.v1.f447833m.D;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals("other")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoSightView", "init::use other player");
        } else {
            q(true);
        }
        setOnCompletionListener(new com.tencent.mm.pluginsdk.ui.tools.w7(this));
    }

    public VideoSightView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = 0;
        this.U = true;
        this.V = false;
        t();
    }

    public VideoSightView(android.content.Context context) {
        super(context, null, 0);
        this.T = 0;
        this.U = true;
        this.V = false;
        t();
    }
}
