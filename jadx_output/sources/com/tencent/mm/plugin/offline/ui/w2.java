package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class w2 implements com.tencent.mm.plugin.wallet_core.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f152751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.x2 f152752b;

    public w2(com.tencent.mm.plugin.offline.ui.x2 x2Var, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f152752b = x2Var;
        this.f152751a = bankcard;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.c7
    public void a(android.view.View view) {
        androidx.appcompat.app.AppCompatActivity context = this.f152752b.f152761e.getContext();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f152751a;
        com.tencent.mm.wallet_core.ui.r1.V(context, bankcard.field_prompt_info_jump_url, true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20216, 3, bankcard.field_prompt_info_jump_url);
    }
}
