package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class q1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg f161459d;

    public q1(com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg previewHdHeadImg) {
        this.f161459d = previewHdHeadImg;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg context = this.f161459d;
        com.tencent.mm.plugin.setting.ui.setting.tq tqVar = (com.tencent.mm.plugin.setting.ui.setting.tq) context.component(com.tencent.mm.plugin.setting.ui.setting.tq.class);
        int i18 = com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.f160156f;
        context.getClass();
        com.tencent.mm.plugin.setting.ui.setting.kq kqVar = com.tencent.mm.plugin.setting.ui.setting.kq.f161249e;
        if (itemId == 1) {
            kqVar = com.tencent.mm.plugin.setting.ui.setting.kq.f161251g;
        } else if (itemId == 2) {
            kqVar = com.tencent.mm.plugin.setting.ui.setting.kq.f161254m;
        } else if (itemId == 3) {
            kqVar = com.tencent.mm.plugin.setting.ui.setting.kq.f161253i;
        } else if (itemId == 4) {
            kqVar = com.tencent.mm.plugin.setting.ui.setting.kq.f161252h;
        } else if (itemId == 5) {
            kqVar = com.tencent.mm.plugin.setting.ui.setting.kq.f161250f;
        }
        tqVar.P6(new com.tencent.mm.plugin.setting.ui.setting.mq(kqVar));
        if (itemId == 1) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(context);
        } else if (itemId == 2) {
            v14.p pVar = (v14.p) context.component(v14.p.class);
            java.lang.String username = context.f160157d;
            pVar.getClass();
            kotlin.jvm.internal.o.g(username, "username");
            kotlinx.coroutines.l.d(pVar.getLifecycleScope(), null, null, new v14.i(pVar, username, null), 3, null);
        } else if (itemId == 3) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context.getContext(), com.tencent.mm.plugin.setting.ui.setting.PreviewLastHdHeadImg.class);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent.putExtra("CropImage_OutputPath", com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent.putExtra("last_avatar_path", com.tencent.mm.modelavatar.d1.Ai().i(c01.z1.r() + ".last", true, false));
            context.startActivityForResult(intent, 4);
        } else if (itemId == 4) {
            com.tencent.mm.plugin.setting.ui.setting.tq tqVar2 = (com.tencent.mm.plugin.setting.ui.setting.tq) context.component(com.tencent.mm.plugin.setting.ui.setting.tq.class);
            tqVar2.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            xj.m mVar = tqVar2.f161587d;
            if (mVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.YuanBaoAvatarUIC", "handleAdClick: adInfo is null, skip");
            } else {
                ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).bj(context, "wxid_wi_1d142z0zdj03", 0, "", new com.tencent.mm.plugin.setting.ui.setting.sq(mVar, context));
            }
        } else if (itemId == 5) {
            context.getClass();
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(context, "android.permission.CAMERA", 16, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.PreviewHdHeadImg", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), context);
            if (a17) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                java.lang.String K = lp0.b.K();
                java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
                ((ub0.r) oVar).getClass();
                if (!com.tencent.mm.pluginsdk.ui.tools.l7.l(context, K, str, 3)) {
                    dp.a.makeText(context, context.getString(com.tencent.mm.R.string.igw), 1).show();
                }
            }
        }
        ((com.tencent.mm.plugin.setting.ui.setting.tq) context.component(com.tencent.mm.plugin.setting.ui.setting.tq.class)).Q6();
    }
}
