package vw3;

/* loaded from: classes5.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI f441114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo f441115e;

    public t2(com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI, com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo) {
        this.f441114d = repairerMagicBootsUI;
        this.f441115e = wxaMagicPkgInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI = this.f441114d;
        vw3.q2 q2Var = repairerMagicBootsUI.e;
        if (q2Var == null) {
            kotlin.jvm.internal.o.o("listAdapter");
            throw null;
        }
        ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).getClass();
        q2Var.f441080d = fe3.j.b().e();
        vw3.q2 q2Var2 = repairerMagicBootsUI.e;
        if (q2Var2 == null) {
            kotlin.jvm.internal.o.o("listAdapter");
            throw null;
        }
        q2Var2.notifyDataSetChanged();
        androidx.appcompat.app.AppCompatActivity context = repairerMagicBootsUI.getContext();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check succ pkg:");
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo = this.f441115e;
        sb6.append(wxaMagicPkgInfo.f147858d);
        sb6.append(",version:");
        sb6.append(wxaMagicPkgInfo.f147866o);
        dp.a.makeText(context, sb6.toString(), 1).show();
    }
}
