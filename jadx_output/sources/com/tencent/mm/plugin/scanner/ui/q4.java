package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class q4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.r4 f159617d;

    public q4(com.tencent.mm.plugin.scanner.ui.r4 r4Var) {
        this.f159617d = r4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.scanner.ui.r4 r4Var = this.f159617d;
        android.content.Context context = r4Var.f159623d;
        r4Var.f159626g = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), r4Var.f159623d.getString(com.tencent.mm.R.string.f490604zq), false, true, new com.tencent.mm.plugin.scanner.ui.p4(this));
        return false;
    }
}
