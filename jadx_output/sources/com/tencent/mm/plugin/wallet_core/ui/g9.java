package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class g9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f180292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.k9 f180293e;

    public g9(com.tencent.mm.plugin.wallet_core.ui.k9 k9Var, int i17) {
        this.f180293e = k9Var;
        this.f180292d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f180293e.f180383e.W6();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15443, 2, 1, java.lang.Integer.valueOf(this.f180292d));
    }
}
