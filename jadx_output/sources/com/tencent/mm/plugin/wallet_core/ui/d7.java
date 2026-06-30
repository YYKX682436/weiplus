package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class d7 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.ui.c7 f180239d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f180240e;

    public d7(java.lang.String str, com.tencent.mm.plugin.wallet_core.ui.c7 c7Var) {
        this(2, c7Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        setColor(android.graphics.Color.parseColor(str), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479514a61));
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.c7 c7Var = this.f180239d;
        if (c7Var != null) {
            c7Var.a(view);
            com.tencent.mm.wallet_core.ui.b0.e(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0
    public void setColorConfig(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        super.setColorConfig(i17);
        if (i17 == 7) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.f478524a5), context.getResources().getColor(com.tencent.mm.R.color.FG_3));
        } else if (i17 == 5) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.aaw), context.getResources().getColor(com.tencent.mm.R.color.f479514a61));
        } else if (i17 == 6) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.f478547ah), context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f180240e) {
            com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
        }
    }

    public d7(int i17, com.tencent.mm.plugin.wallet_core.ui.c7 c7Var) {
        super(i17, (r35.m3) null);
        this.f180240e = false;
        this.f180239d = c7Var;
    }

    public d7(int i17, com.tencent.mm.plugin.wallet_core.ui.c7 c7Var, boolean z17) {
        super(i17, (r35.m3) null);
        this.f180240e = false;
        this.f180239d = c7Var;
        this.f180240e = z17;
    }
}
