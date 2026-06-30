package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f148348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.mall.MallFunction f148349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.i f148350f;

    public d(com.tencent.mm.plugin.mall.ui.i iVar, int i17, com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction) {
        this.f148350f = iVar;
        this.f148348d = i17;
        this.f148349e = mallFunction;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/FunctionListAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mall.ui.h hVar = this.f148350f.f148393f;
        if (hVar != null) {
            com.tencent.mm.plugin.mall.ui.y yVar = (com.tencent.mm.plugin.mall.ui.y) hVar;
            yVar.getClass();
            int i17 = this.f148348d;
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = this.f148349e;
            if (mallFunction != null) {
                boolean z17 = false;
                boolean z18 = (bt4.c.a(mallFunction.f179819d) || com.tencent.mm.sdk.platformtools.t8.K0(mallFunction.f179829q)) ? false : true;
                com.tencent.mm.plugin.mall.ui.MallIndexBaseUI mallIndexBaseUI = yVar.f148514a;
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "onFunctionItemClick show disclaimer funcId=%s", mallFunction.f179819d);
                    java.lang.String string = mallIndexBaseUI.getString(com.tencent.mm.R.string.gsz);
                    java.lang.String string2 = mallIndexBaseUI.getString(com.tencent.mm.R.string.f490454vi);
                    com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = new com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle();
                    weAppOpenDeclarePromptBundle.f74986d = 2;
                    weAppOpenDeclarePromptBundle.f74988f = string;
                    weAppOpenDeclarePromptBundle.f74989g = mallFunction.f179829q;
                    weAppOpenDeclarePromptBundle.f74990h = string2;
                    weAppOpenDeclarePromptBundle.f74991i = false;
                    weAppOpenDeclarePromptBundle.f74987e = mallFunction.f179819d;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putParcelable("weapp_open_declare_prompt_key", weAppOpenDeclarePromptBundle);
                    if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_dialog_optimize_switch, 1) == 1)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "handleFunctionByAppBrand clicfg_appbrand_dialog_optimize_switch close");
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(mallFunction.f179824i)) {
                        if (((tg1.n) ((com.tencent.mm.plugin.appbrand.service.i6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i6.class))).wi(mallFunction.f179824i, bundle)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "handleFunctionByAppBrand, intercept by AppBrandNativeLink, nativeUrl = %s", mallFunction.f179824i);
                            bt4.f.b().f(mallFunction.f179819d);
                            bt4.g.b().d(mallFunction.f179819d);
                            if (mallFunction.f179827o != null) {
                                bt4.f.b().d(mallFunction);
                            }
                            if (i17 >= 0) {
                                com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = mallFunction.f179827o;
                                java.lang.String str = (mallNews == null || com.tencent.mm.sdk.platformtools.t8.K0(mallNews.f179834g)) ? "" : mallFunction.f179827o.f179834g;
                                java.util.ArrayList arrayList2 = mallIndexBaseUI.f148244i;
                                int size = arrayList2 == null ? 0 : arrayList2.size();
                                boolean d17 = com.tencent.mm.plugin.mall.ui.i.d(mallFunction);
                                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                java.lang.Object[] objArr = new java.lang.Object[10];
                                objArr[0] = mallFunction.f179819d;
                                objArr[1] = java.lang.Integer.valueOf(size);
                                objArr[2] = 0;
                                objArr[3] = java.lang.Integer.valueOf(i17);
                                objArr[4] = str;
                                objArr[5] = java.lang.Integer.valueOf(d17 ? 2 : 1);
                                objArr[6] = 1;
                                objArr[7] = 0;
                                objArr[8] = 0;
                                objArr[9] = 0;
                                g0Var.d(10881, objArr);
                            }
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        androidx.appcompat.app.AppCompatActivity context = mallIndexBaseUI.getContext();
                        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                        aVar.f211709a = string;
                        aVar.f211729s = mallFunction.f179829q;
                        aVar.f211732v = string2;
                        aVar.E = new com.tencent.mm.plugin.mall.ui.w(yVar, mallFunction, i17);
                        aVar.A = true;
                        aVar.G = new com.tencent.mm.plugin.mall.ui.x(yVar, mallFunction);
                        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                        j0Var.e(aVar);
                        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                        if (d0Var != null) {
                            d0Var.a(j0Var.f211837r);
                        }
                        j0Var.show();
                    }
                } else {
                    mallIndexBaseUI.Y6(mallFunction, i17);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14419, mallIndexBaseUI.f148243h, 4, java.lang.Integer.valueOf(mallFunction.f179828p));
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.MallIndexBaseUI", "onFunctionItemClick functionItem null; pos=%d", java.lang.Integer.valueOf(i17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
