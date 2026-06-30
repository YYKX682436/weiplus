package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f119856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f119857e;

    public t00(r45.fr1 fr1Var, com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f119856d = fr1Var;
        this.f119857e = m10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
        r45.fr1 fr1Var = this.f119856d;
        if (!android.text.TextUtils.isEmpty(fr1Var != null ? fr1Var.getString(6) : null)) {
            bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", fr1Var != null ? fr1Var.getString(6) : null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[input-auto-wording]  text = ");
            sb6.append(fr1Var != null ? fr1Var.getString(6) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", sb6.toString());
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_NEED_NOTIFY_SEND_MSG_RESULT", true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f119857e;
        m10Var.f119022x = currentTimeMillis;
        bundle.putLong("PARAM_FINDER_LIVE_SEND_MSG_SESSION_ID", m10Var.f119022x);
        m10Var.f119000b.statusChange(qo0.b.W, bundle);
    }
}
