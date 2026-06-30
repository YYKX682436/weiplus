package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class a5 implements mr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f173716a;

    public a5(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        this.f173716a = textStatusCardFeedsActivity;
    }

    @Override // mr.a
    public void onPageSelected(int i17) {
        bi4.n0 n0Var;
        in5.s0 s0Var;
        in5.s0 s0Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onPageSelected pos:" + i17);
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.f173716a;
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC textStatusCardFeedUIC = (com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) textStatusCardFeedsActivity.component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class);
        com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
        com.tencent.mm.view.recyclerview.WxRecyclerView Y6 = textStatusCardFeedsActivity.Y6();
        textStatusCardFeedUIC.getClass();
        androidx.recyclerview.widget.k3 q07 = Y6.q0(i17, false);
        in5.s0 s0Var3 = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        if (s0Var3 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onPageListSelected: failed, pos=" + i17 + ", childCount=" + Y6.getChildCount());
        } else {
            java.lang.ref.WeakReference weakReference = textStatusCardFeedUIC.f173774e;
            boolean z17 = ((weakReference == null || (s0Var2 = (in5.s0) weakReference.get()) == null) ? null : s0Var2.f293124h) instanceof com.tencent.mm.plugin.textstatus.ui.w1;
            textStatusCardFeedUIC.f173774e = new java.lang.ref.WeakReference(s0Var3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageListSelected: ");
            sb6.append(i17);
            sb6.append(", fromPagerScroll=");
            sb6.append(z17);
            sb6.append(", pagerIdentify=");
            java.lang.ref.WeakReference weakReference2 = textStatusCardFeedUIC.f173774e;
            java.lang.Object obj = (weakReference2 == null || (s0Var = (in5.s0) weakReference2.get()) == null) ? null : s0Var.f293124h;
            com.tencent.mm.plugin.textstatus.ui.w1 w1Var = obj instanceof com.tencent.mm.plugin.textstatus.ui.w1 ? (com.tencent.mm.plugin.textstatus.ui.w1) obj : null;
            sb6.append(w1Var != null ? w1Var.getIdentify() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", sb6.toString());
            if (z17) {
                in5.s0 Q6 = textStatusCardFeedUIC.Q6();
                java.lang.Object obj2 = Q6 != null ? Q6.f293124h : null;
                n0Var = obj2 instanceof bi4.n0 ? (bi4.n0) obj2 : null;
                if (n0Var != null) {
                    n0Var.d();
                }
                textStatusCardFeedUIC.W6(true);
            } else {
                in5.s0 Q62 = textStatusCardFeedUIC.Q6();
                java.lang.Object obj3 = Q62 != null ? Q62.f293124h : null;
                n0Var = obj3 instanceof bi4.n0 ? (bi4.n0) obj3 : null;
                if (n0Var != null) {
                    n0Var.a();
                }
            }
        }
        kotlin.jvm.internal.o.b(textStatusCardFeedsActivity.f173482d, "SCENE_HISTORY_FEED");
    }
}
