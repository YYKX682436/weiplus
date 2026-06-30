package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154698d;

    public y0(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        this.f154698d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154698d;
        m0Var.k(4, null);
        if (m0Var.f154456h.getIntent().getIntExtra("Kdel_from", -1) == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(m0Var.f154456h, intent, false);
        }
        ((c01.k7) c01.n8.a()).e(m0Var.f154459n.d1());
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = m0Var.f154464s;
        if (s4Var.j().getVisibility() == 0) {
            s4Var.j().setVisibility(8);
            com.tencent.mars.xlog.Log.i("ContactWidgetTabBizHeaderView", "unFocus, followMoreView dismiss");
        }
        m0Var.f154464s.z();
    }
}
