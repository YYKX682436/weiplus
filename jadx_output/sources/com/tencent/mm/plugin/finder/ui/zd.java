package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class zd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f130092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f130093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f130094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f130095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f130096h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f130097i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f130098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Canvas f130099n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f130100o;

    public zd(boolean z17, com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, r45.mb4 mb4Var, int i17, int i18, java.util.LinkedList linkedList, int i19, android.graphics.Canvas canvas, android.graphics.Bitmap bitmap) {
        this.f130092d = z17;
        this.f130093e = finderSelectCoverUI;
        this.f130094f = mb4Var;
        this.f130095g = i17;
        this.f130096h = i18;
        this.f130097i = linkedList;
        this.f130098m = i19;
        this.f130099n = canvas;
        this.f130100o = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk4.b player;
        if (this.f130092d) {
            i95.m c17 = i95.n0.c(bg0.v.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            bg0.v vVar = (bg0.v) c17;
            int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f130093e;
            cw2.aa i76 = finderSelectCoverUI.i7();
            kk4.h hVar = null;
            cw2.w4 w4Var = i76 instanceof cw2.w4 ? (cw2.w4) i76 : null;
            if (w4Var != null && (player = w4Var.f224084a.getPlayer()) != null) {
                hVar = ((kk4.v) player).f308580e;
            }
            r45.mb4 mb4Var = this.f130094f;
            int i18 = this.f130095g;
            int i19 = this.f130096h;
            finderSelectCoverUI.U = ((b92.u2) vVar).Zi(mb4Var, i18, i19, hVar);
            rm5.k kVar = finderSelectCoverUI.U;
            if (kVar != null) {
                kVar.setSize(i18, i19);
            }
        }
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI2 = this.f130093e;
        rm5.k kVar2 = finderSelectCoverUI2.U;
        if (kVar2 != null) {
            java.util.LinkedList linkedList = this.f130097i;
            kVar2.a(linkedList, new com.tencent.mm.plugin.finder.ui.yd(this.f130098m, finderSelectCoverUI2, linkedList, this.f130094f, this.f130099n, this.f130100o));
        }
    }
}
