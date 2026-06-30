package com.tencent.mm.ui.chatting;

/* loaded from: classes14.dex */
public final class pc extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f202091d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f202092e;

    /* renamed from: f, reason: collision with root package name */
    public final int f202093f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f202094g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f202095h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.zg f202096i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f202097m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(android.content.Context context, java.lang.String filePath, java.lang.String fileExt, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        this.f202091d = filePath;
        this.f202092e = fileExt;
        this.f202093f = i17;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ci_, this);
        this.f202094g = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.mb_);
        this.f202095h = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.mbc);
        this.f202096i = new com.tencent.mm.ui.zg(context, this.f202091d, this.f202092e, i17, null, 16, null);
        a();
        b();
    }

    public final void a() {
        android.widget.RelativeLayout relativeLayout = this.f202095h;
        if (relativeLayout != null) {
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            sj3.n3 n3Var = sj3.o3.f408666e;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (n3Var.a(context) != 90) {
                android.content.Context context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                if (n3Var.a(context2) != 270) {
                    com.tencent.mm.ui.zg zgVar = this.f202096i;
                    if (zgVar != null) {
                        android.content.Context context3 = zgVar.f212621a;
                        zgVar.f212625e = android.view.LayoutInflater.from(context3).inflate(com.tencent.mm.R.layout.cib, relativeLayout);
                        zgVar.a(context3);
                        return;
                    }
                    return;
                }
            }
            com.tencent.mm.ui.zg zgVar2 = this.f202096i;
            if (zgVar2 != null) {
                android.content.Context context4 = zgVar2.f212621a;
                zgVar2.f212625e = android.view.LayoutInflater.from(context4).inflate(com.tencent.mm.R.layout.cic, relativeLayout);
                zgVar2.a(context4);
            }
        }
    }

    public final void b() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.widget.RelativeLayout relativeLayout = this.f202094g;
        if (relativeLayout == null || (layoutParams = relativeLayout.getLayoutParams()) == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        sj3.n3 n3Var = sj3.o3.f408666e;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (n3Var.a(context) != 90) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            if (n3Var.a(context2) != 270) {
                layoutParams2.bottomMargin = sj3.i1.f408573r;
                layoutParams2.setMarginEnd(0);
                return;
            }
        }
        layoutParams2.bottomMargin = 0;
        layoutParams2.setMarginEnd(sj3.i1.f408573r);
    }

    public final void c() {
        com.tencent.mm.ui.zg zgVar = this.f202096i;
        if (zgVar != null) {
            com.tencent.mm.ui.widget.dialog.f4 f4Var = zgVar.f212631k;
            if (f4Var != null) {
                f4Var.cancel();
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = zgVar.f212632l;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150183x1;
            if (j0Var != null) {
                j0Var.removeObserver(zgVar.f212633m);
            }
            androidx.lifecycle.j0 j0Var2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150183x1;
            if (j0Var2 != null) {
                android.content.Context context = zgVar.f212621a;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                j0Var2.removeObservers((com.tencent.mm.ui.MMActivity) context);
            }
        }
    }

    public final void d() {
        java.lang.String str = this.f202091d;
        java.lang.String str2 = this.f202092e;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (r6Var.m() && r6Var.A()) {
            com.tencent.xweb.q1 q1Var = com.tencent.xweb.q1.ReaderView;
            int i17 = this.f202093f;
            if (i17 != 3 && i17 == 4) {
                q1Var = com.tencent.xweb.q1.ListView;
            }
            com.tencent.xweb.q1 q1Var2 = q1Var;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("extra_param_disable_scale", "false");
            hashMap.put("extra_param_bg_color", java.lang.String.valueOf(android.graphics.Color.parseColor("#ededed")));
            hashMap.put("extra_param_disable_finish_activity", "true");
            hashMap.put("extra_param_set_max_scale", "3");
            hashMap.put("extra_param_disable_password", "true");
            hashMap.put("extra_param_download_text_color", "-16777216");
            hashMap.put("extra_param_can_download_when_plugin_error", "true");
            hashMap.put("extra_param_open_file_scene", "13");
            sj3.n3 n3Var = sj3.o3.f408666e;
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
            kotlin.jvm.internal.o.f(p17, "getFileMD5String(...)");
            n3Var.b(p17, null);
            java.lang.String valueOf = java.lang.String.valueOf(hashCode() + java.lang.System.currentTimeMillis());
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.widget.RelativeLayout relativeLayout = this.f202094g;
            kotlin.jvm.internal.o.e(relativeLayout, "null cannot be cast to non-null type android.view.ViewGroup");
            com.tencent.xweb.r1.d(str, str2, valueOf, true, hashMap, q1Var2, (android.app.Activity) context, relativeLayout, new com.tencent.mm.ui.chatting.nc(this), new com.tencent.mm.ui.chatting.oc(this));
        }
    }

    public final java.lang.String getFileExt() {
        return this.f202092e;
    }

    public final java.lang.String getFilePath() {
        return this.f202091d;
    }

    public final android.widget.RelativeLayout getPluginControlLayout() {
        return this.f202095h;
    }

    public final com.tencent.mm.ui.zg getProfilePluginUi() {
        return this.f202096i;
    }

    public final android.widget.RelativeLayout getReaderContentLayout() {
        return this.f202094g;
    }

    public final void setFileExt(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f202092e = str;
    }

    public final void setFilePath(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f202091d = str;
    }

    public final void setPluginControlLayout(android.widget.RelativeLayout relativeLayout) {
        this.f202095h = relativeLayout;
    }

    public final void setProfilePluginUi(com.tencent.mm.ui.zg zgVar) {
        this.f202096i = zgVar;
    }

    public final void setReaderContentLayout(android.widget.RelativeLayout relativeLayout) {
        this.f202094g = relativeLayout;
    }
}
