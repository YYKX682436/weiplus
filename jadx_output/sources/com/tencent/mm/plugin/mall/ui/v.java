package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class v implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexBaseUI f148503d;

    public v(com.tencent.mm.plugin.mall.ui.MallIndexBaseUI mallIndexBaseUI) {
        this.f148503d = mallIndexBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 3);
        com.tencent.mm.plugin.mall.ui.MallIndexBaseUI mallIndexBaseUI = this.f148503d;
        j45.l.u(mallIndexBaseUI, "com.tencent.mm.ui.LauncherUI", intent, null);
        mallIndexBaseUI.finish();
        if (!h45.y.c()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, h45.y.f278968a, "open_wcpay_specific_view:ok");
            h45.y.f278968a = null;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14419, mallIndexBaseUI.f148243h, 6);
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "set BackBtn");
        return true;
    }
}
