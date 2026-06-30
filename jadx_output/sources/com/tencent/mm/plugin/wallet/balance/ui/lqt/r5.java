package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class r5 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f178357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.s5 f178358b;

    public r5(com.tencent.mm.plugin.wallet.balance.ui.lqt.s5 s5Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f178358b = s5Var;
        this.f178357a = bankcard;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        androidx.appcompat.app.AppCompatActivity context = this.f178358b.f178368e.getContext();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f178357a;
        com.tencent.mm.wallet_core.ui.r1.V(context, bankcard.field_prompt_info_jump_url, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20216, 2, bankcard.field_prompt_info_jump_url);
    }
}
