package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes3.dex */
public class c0 extends com.tencent.mm.ui.base.preference.Preference {
    public final /* synthetic */ r45.rl6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.wallet_core.ui.x xVar, android.content.Context context, r45.rl6 rl6Var) {
        super(context);
        this.L = rl6Var;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27779, 1, ((r45.hl6) this.L.f384987d.get(0)).f376273f, 0, 0);
        if (this.f197772f != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.b0(this));
        }
    }
}
