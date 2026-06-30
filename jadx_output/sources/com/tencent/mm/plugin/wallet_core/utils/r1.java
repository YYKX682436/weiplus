package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class r1 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.x1 f180972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f180973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f180974c;

    public r1(com.tencent.mm.plugin.wallet_core.utils.x1 x1Var, r45.yt5 yt5Var, android.content.Context context) {
        this.f180972a = x1Var;
        this.f180973b = yt5Var;
        this.f180974c = context;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        android.content.Context context = this.f180974c;
        r45.yt5 yt5Var = this.f180973b;
        com.tencent.mm.plugin.wallet_core.utils.x1 x1Var = this.f180972a;
        if (x1Var == null || x1Var.b(yt5Var, view)) {
            com.tencent.mm.plugin.wallet_core.utils.z1.c(context, yt5Var, null);
        } else {
            com.tencent.mm.plugin.wallet_core.utils.z1.c(context, yt5Var, null);
            x1Var.a(yt5Var, view);
        }
    }
}
