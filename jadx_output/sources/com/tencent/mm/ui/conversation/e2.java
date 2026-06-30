package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class e2 extends ym5.n0 {
    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.ui.conversation.f2 f2Var = com.tencent.mm.ui.conversation.f2.f207664a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvItemExposureHelper", "notifymessage item explosure,isExposed = " + z17);
        if (z17) {
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.cip);
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.storage.Conversation");
            com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) tag;
            int d17 = l4Var.d1();
            java.lang.String y07 = l4Var.y0();
            java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.cir);
            kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) tag2).intValue();
            if (kotlin.jvm.internal.o.b(l4Var.h1(), "notifymessage")) {
                ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.ui.conversation.d2(y07, intValue, d17));
            }
        }
    }
}
