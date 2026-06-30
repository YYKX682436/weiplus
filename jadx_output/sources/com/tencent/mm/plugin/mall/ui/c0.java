package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class c0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 f148345d;

    public c0(com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 mallIndexBaseUIv2) {
        this.f148345d = mallIndexBaseUIv2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 mallIndexBaseUIv2 = this.f148345d;
        if (mallIndexBaseUIv2.getIntent().getBooleanExtra("key_not_goto_launcher_ui_when_back", false)) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "onBack, do not goto launcher ui, expected by Intent");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 3);
            j45.l.u(mallIndexBaseUIv2, "com.tencent.mm.ui.LauncherUI", intent, null);
        }
        mallIndexBaseUIv2.finish();
        if (!h45.y.c()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "open_wcpay_specific_view:ok");
            h45.y.f278968a = null;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14419, mallIndexBaseUIv2.f148259i, 6);
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "set BackBtn");
        return true;
    }
}
