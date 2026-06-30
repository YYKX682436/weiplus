package mx0;

/* loaded from: classes5.dex */
public final class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f332019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.l1 f332020e;

    public h1(com.tencent.mm.ui.widget.dialog.k0 k0Var, mx0.l1 l1Var) {
        this.f332019d = k0Var;
        this.f332020e = l1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        this.f332019d.u();
        int itemId = menuItem.getItemId();
        mx0.l1 l1Var = this.f332020e;
        switch (itemId) {
            case 1000:
                l1Var.a();
                com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) l1Var.f332121e;
                shootComposingPluginLayout.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "reportJump2VideoEditPageForMaterialImportPreview");
                i95.m c17 = i95.n0.c(w40.e.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                w40.e.eh((w40.e) c17, "SCAssetGenerateToMC", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 0, 8, null);
                shootComposingPluginLayout.v0(true, new mx0.a6(shootComposingPluginLayout, null));
                return;
            case 1001:
                com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout2 = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) l1Var.f332121e;
                shootComposingPluginLayout2.getClass();
                ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
                yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.u5(m7Var, null), 3, null);
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Map Ai = m7Var.Ai();
                Ai.put("view_id", "sc_asset_generate_save_video");
                ((cy1.a) rVar).yj("sc_asset_generate_save_video", null, Ai, 6, false);
                shootComposingPluginLayout2.v0(false, new mx0.p8(shootComposingPluginLayout2, null));
                return;
            case 1002:
                l1Var.getClass();
                ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
                yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.t5(m7Var2, null), 3, null);
                dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Map Ai2 = m7Var2.Ai();
                Ai2.put("view_id", "sc_asset_generate_feedback");
                ((cy1.a) rVar2).yj("sc_asset_generate_feedback", null, Ai2, 6, false);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=autoreplyfeedback/index&wechat_feedback_source=5#/form/14296");
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                j45.l.n(l1Var.f332120d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 206);
                return;
            default:
                return;
        }
    }
}
