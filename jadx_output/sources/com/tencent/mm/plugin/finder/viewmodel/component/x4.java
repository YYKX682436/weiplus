package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class x4 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.b f136392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.o f136393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp.a f136394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f136396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f136397i;

    public x4(bb2.b bVar, bb2.o oVar, wp.a aVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, bb2.w1 w1Var) {
        this.f136392d = bVar;
        this.f136393e = oVar;
        this.f136394f = aVar;
        this.f136395g = s0Var;
        this.f136396h = finderBulletUIC;
        this.f136397i = w1Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        bb2.b bVar = this.f136392d;
        this.f136393e.f18926a.getInteger(6);
        bVar.f18804d.setBackground(null);
        this.f136394f.f448353x = true;
        android.view.KeyEvent.Callback callback = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) this.f136395g.p(com.tencent.mm.R.id.ghd);
        if (callback == null) {
            callback = this.f136395g.p(com.tencent.mm.R.id.frt);
        }
        if (callback != null) {
            ((cw2.ca) callback).t("exitBulletInput");
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f136396h;
        com.tencent.mm.plugin.finder.viewmodel.component.u4 u4Var = com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.A;
        finderBulletUIC.g7(false);
        this.f136392d.g(this.f136393e);
        vp.x d17 = this.f136397i.d();
        d17.f438852d.N1(this.f136394f, this.f136392d);
    }
}
