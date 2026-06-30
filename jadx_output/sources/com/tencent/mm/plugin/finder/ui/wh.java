package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class wh implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI f129991d;

    public wh(com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI) {
        this.f129991d = finderSettingProtectUI;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI = this.f129991d;
        az2.f fVar = finderSettingProtectUI.f128750t;
        if (fVar != null) {
            fVar.b();
        }
        com.tencent.mars.xlog.Log.i("FinderSettingProtectUI", "modUserProtectCallback, ret " + ret.getInteger(1) + " switch " + req.getInteger(29));
        if (ret.getInteger(1) != 0) {
            androidx.appcompat.app.AppCompatActivity context = finderSettingProtectUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = finderSettingProtectUI.getContext().getString(com.tencent.mm.R.string.f9b);
            e4Var.c();
            return;
        }
        if (req.getInteger(29) == 1) {
            androidx.appcompat.app.AppCompatActivity context2 = finderSettingProtectUI.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = finderSettingProtectUI.getContext().getString(com.tencent.mm.R.string.ikb);
            e4Var2.b(com.tencent.mm.R.raw.toast_ok);
            e4Var2.c();
            com.tencent.mm.protobuf.g byteString = ret.getByteString(3);
            if (byteString != null) {
                r45.si2 si2Var = new r45.si2();
                si2Var.fromProtobuf(byteString.g());
                g92.b bVar = g92.b.f269769e;
                m92.c cVar = new m92.c(finderSettingProtectUI.f128751u);
                cVar.u0().set(52, (r45.h23) si2Var.getCustom(1));
                bVar.C(cVar, m92.j.f324997o);
                kk.l lVar = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
                androidx.appcompat.app.AppCompatActivity context3 = finderSettingProtectUI.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(xy2.c.e(context3));
                if (l2Var != null) {
                    l2Var.C = (r45.h23) si2Var.getCustom(1);
                }
            }
        } else if (req.getInteger(29) == 2) {
            androidx.appcompat.app.AppCompatActivity context4 = finderSettingProtectUI.getContext();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context4);
            e4Var3.f211776c = finderSettingProtectUI.getContext().getString(com.tencent.mm.R.string.f492981ij5);
            e4Var3.b(com.tencent.mm.R.raw.toast_ok);
            e4Var3.c();
            g92.b bVar2 = g92.b.f269769e;
            m92.c cVar2 = new m92.c(finderSettingProtectUI.f128751u);
            cVar2.u0().set(52, null);
            bVar2.C(cVar2, m92.j.f324997o);
            kk.l lVar2 = com.tencent.mm.plugin.finder.profile.uic.p2.f124101r;
            androidx.appcompat.app.AppCompatActivity context5 = finderSettingProtectUI.getContext();
            kotlin.jvm.internal.o.f(context5, "getContext(...)");
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar2.get(xy2.c.e(context5));
            if (l2Var2 != null) {
                l2Var2.C = null;
            }
        }
        finderSettingProtectUI.c7();
    }
}
