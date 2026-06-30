package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nz implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f119224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rz f119225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f119227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f119228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119229i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119230m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f119231n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f119232o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119233p;

    public nz(r45.fr1 fr1Var, com.tencent.mm.plugin.finder.live.widget.rz rzVar, java.lang.String str, boolean z17, android.widget.CheckBox checkBox, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.finder.live.plugin.l lVar, boolean z18, android.content.Context context) {
        this.f119224d = fr1Var;
        this.f119225e = rzVar;
        this.f119226f = str;
        this.f119227g = z17;
        this.f119228h = checkBox;
        this.f119229i = str2;
        this.f119230m = str3;
        this.f119231n = lVar;
        this.f119232o = z18;
        this.f119233p = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.md6 md6Var;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        r45.fr1 fr1Var = this.f119224d;
        ml2.r0.Uj(r0Var, 13, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
        com.tencent.mm.plugin.finder.live.widget.rz rzVar = this.f119225e;
        if (rzVar != null) {
            rzVar.a(true);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = this.f119226f;
        if (this.f119227g) {
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GAME_TEAM_START_LIVE_CHECKED_BOOLEAN_SYNC;
            android.widget.CheckBox checkBox = this.f119228h;
            c18.x(u3Var, java.lang.Boolean.valueOf(checkBox.isChecked()));
            if (checkBox.isChecked()) {
                java.lang.String string = (fr1Var == null || (md6Var = (r45.md6) fr1Var.getCustom(16)) == null) ? null : md6Var.getString(1);
                if (string == null) {
                    string = "";
                }
                h0Var.f310123d = string;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "jumpGame " + this.f119229i + ", " + this.f119230m + ", launchParams:" + ((java.lang.String) h0Var.f310123d));
        pm0.v.K(null, new com.tencent.mm.plugin.finder.live.widget.mz(this.f119230m, h0Var, this.f119231n, this.f119232o, this.f119233p, this.f119229i));
    }
}
