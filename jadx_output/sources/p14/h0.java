package p14;

/* loaded from: classes11.dex */
public class h0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI f351225d;

    public h0(com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI shareToQQUI) {
        this.f351225d = shareToQQUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.modelsimple.e1 e1Var;
        com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI shareToQQUI = this.f351225d;
        shareToQQUI.f160119h = true;
        int i17 = shareToQQUI.f160117f;
        if (i17 == 2 || i17 == 1) {
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String obj = shareToQQUI.f160116e.getText().toString();
            int i18 = shareToQQUI.f160117f;
            boolean z17 = i18 == 1;
            boolean z18 = i18 == 2;
            ((ce0.e) jVar).getClass();
            e1Var = new com.tencent.mm.modelsimple.e1(obj, z17, false, z18, true);
        } else {
            if (i17 != 4) {
                db5.e1.i(shareToQQUI.getContext(), com.tencent.mm.R.string.j3t, com.tencent.mm.R.string.f490573yv);
                return true;
            }
            long r17 = com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().l(65831, null));
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
            if (str == null) {
                str = "";
            }
            if (java.lang.System.currentTimeMillis() - r17 > 86400000 && str.length() > 0) {
                shareToQQUI.f160118g = new com.tencent.mm.ui.mmfb.sdk.l();
                shareToQQUI.f160118g.g(str);
                new v61.q0(shareToQQUI.f160118g, new p14.f0(this)).c();
            }
            de0.j jVar2 = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String obj2 = shareToQQUI.f160116e.getText().toString();
            ((ce0.e) jVar2).getClass();
            e1Var = new com.tencent.mm.modelsimple.e1(obj2);
        }
        gm0.j1.d().g(e1Var);
        shareToQQUI.f160115d = db5.e1.Q(shareToQQUI.getContext(), shareToQQUI.getString(com.tencent.mm.R.string.f490573yv), shareToQQUI.getString(com.tencent.mm.R.string.f490552yb), true, true, new p14.g0(this, e1Var));
        return true;
    }
}
