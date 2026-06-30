package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f129803a;

    /* renamed from: b, reason: collision with root package name */
    public az2.f f129804b;

    /* renamed from: c, reason: collision with root package name */
    public final so2.w5 f129805c;

    public sd(com.tencent.mm.ui.MMActivity context, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        this.f129803a = context;
        this.f129805c = new so2.w5(username);
    }

    public static final boolean a(com.tencent.mm.plugin.finder.ui.sd sdVar, boolean z17) {
        sdVar.getClass();
        boolean l17 = gm0.j1.u().l();
        com.tencent.mm.ui.MMActivity mMActivity = sdVar.f129803a;
        if (!l17) {
            db5.t7.k(mMActivity, null);
            return false;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(mMActivity, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("Finder.SelectCoverHelper", "checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), mMActivity);
        if (!a17) {
            return false;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.ui.pd pdVar = new com.tencent.mm.plugin.finder.ui.pd(sdVar);
            java.lang.String a18 = t21.c3.a(en1.a.a());
            kotlin.jvm.internal.o.f(a18, "genFileName(...)");
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            bm5.f0 f0Var = bm5.f0.f22571s;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String rj6 = ((k90.b) u0Var).rj(null, f0Var, a18, true);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a18, true);
            ((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
            w94.a aVar = w94.a.f444075a;
            com.tencent.mm.modelcontrol.VideoTransPara a19 = aVar.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
            ((ee0.h4) ((fe0.d4) i95.n0.c(fe0.d4.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
            com.tencent.mm.modelcontrol.VideoTransPara a27 = aVar.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverVideoParam", "com.tencent.mm.feature.sns.SnsCoverConfigService");
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g(rj6, tj6, a19, a27.f71195h * 1000, 11);
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.HashMap hashMap = (java.util.HashMap) uICustomParam.f64779h;
            hashMap.put("plugin_filter", bool);
            hashMap.put("plugin_poi", bool);
            hashMap.put("plugin_tip", bool);
            hashMap.put("plugin_menu", bool);
            g17.f155677o = uICustomParam;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            g17.f155684v = bool2;
            g17.f155682t = bool2;
            g17.K = false;
            g17.L = false;
            g17.N = true;
            g17.f155680r = bool;
            g17.f155679q = 4;
            g17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.DirectSendPhotoPluginLayout");
            g17.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout");
            ut3.f.f431176c.f431177a = pdVar;
            ut3.m.f431182a.c(sdVar.f129803a, 2000, com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1, g17);
        } else {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String a28 = g83.a.a();
            java.lang.String str = "finderProfileCover." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
            ((ub0.r) oVar).getClass();
            if (!com.tencent.mm.pluginsdk.ui.tools.l7.l(mMActivity, a28, str, 2003)) {
                dp.a.makeText(mMActivity, sdVar.b(com.tencent.mm.R.string.igw), 1).show();
            }
        }
        return true;
    }

    public final java.lang.String b(int i17) {
        java.lang.String string = this.f129803a.getResources().getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void c(java.lang.String filePath) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(filePath) || !com.tencent.mm.vfs.w6.j(filePath)) {
            com.tencent.mars.xlog.Log.w("Finder.SelectCoverHelper", "no img select");
            return;
        }
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        java.lang.String resultFileName = "finder_profile_cover_" + java.lang.System.currentTimeMillis() + ".tmp";
        i0Var.getClass();
        com.tencent.mm.ui.MMActivity context = this.f129803a;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(resultFileName, "resultFileName");
        ((w40.e) i95.n0.c(w40.e.class)).getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI.class);
        intent.putExtra("key_crop_style", 2);
        intent.putExtra("key_crop_source", 3);
        intent.putExtra("key_source_img_path", filePath);
        intent.putExtra("key_result_file_name", resultFileName);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(2002);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/PublishRouterApi", "enterCropProfileBgUI", "(Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void d() {
        az2.f fVar = this.f129804b;
        if (fVar != null) {
            fVar.b();
        }
        az2.c cVar = az2.f.f16125d;
        com.tencent.mm.ui.MMActivity mMActivity = this.f129803a;
        az2.f a17 = az2.c.a(cVar, mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490604zq), 300L, null, 8, null);
        this.f129804b = a17;
        a17.a();
    }
}
