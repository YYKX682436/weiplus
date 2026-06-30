package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class b1 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f180142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.c1 f180143b;

    public b1(com.tencent.mm.plugin.wallet_core.ui.c1 c1Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f180143b = c1Var;
        this.f180142a = bankcard;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        android.content.Context context = this.f180143b.f180164e;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f180142a;
        com.tencent.mm.wallet_core.ui.r1.V(context, bankcard.field_prompt_info_jump_url, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20216, 4, bankcard.field_prompt_info_jump_url);
    }
}
