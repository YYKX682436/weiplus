package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class sz implements com.tencent.mm.plugin.finder.live.widget.rz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.q63 f119852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f119853b;

    public sz(r45.q63 q63Var, com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f119852a = q63Var;
        this.f119853b = m10Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.rz
    public void a(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f119853b;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jump game ");
            r45.q63 q63Var = this.f119852a;
            sb6.append(q63Var.getString(1));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
            m10Var.L = q63Var.getString(1);
        }
        m10Var.f118998J = false;
        m10Var.t();
    }
}
