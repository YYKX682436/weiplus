package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class a0 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.ui.z f214106d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f214107e;

    /* renamed from: f, reason: collision with root package name */
    public long f214108f;

    public a0(com.tencent.mm.wallet_core.ui.z zVar, boolean z17) {
        super(7, (r35.m3) null);
        this.f214106d = zVar;
        this.f214107e = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.z zVar = this.f214106d;
        if (zVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean z17 = currentTimeMillis - this.f214108f < 1000;
            this.f214108f = currentTimeMillis;
            if (z17) {
                yj0.a.h(this, "com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                zVar.onClick(view);
                com.tencent.mm.wallet_core.ui.b0.e(view);
            }
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0
    public void setColorConfig(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        super.setColorConfig(i17);
        if (i17 == 7) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.f478524a5), context.getResources().getColor(com.tencent.mm.R.color.FG_3));
        } else if (i17 == 6) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.f478547ah), context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f214107e) {
            com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
        }
    }

    public a0(int i17, com.tencent.mm.wallet_core.ui.z zVar) {
        super(i17, (r35.m3) null);
        this.f214107e = true;
        this.f214106d = zVar;
    }

    public a0(int i17, int i18, com.tencent.mm.wallet_core.ui.z zVar) {
        super(i17, i18);
        this.f214107e = true;
        this.f214106d = zVar;
    }
}
