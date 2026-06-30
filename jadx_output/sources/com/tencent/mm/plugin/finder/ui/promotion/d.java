package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes2.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject feed, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feed, "feed");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ai.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar = (com.tencent.mm.plugin.finder.viewmodel.component.ai) a17;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("promotion_feed_id", feed.getId());
        intent.putExtra("promotion_update_switch", z17);
        intent.putExtra("promotion_update_switch_value", z18);
        com.tencent.mm.protocal.protobuf.FinderContact contact = feed.getContact();
        intent.putExtra("promotion_author_finder_username", contact != null ? contact.getUsername() : null);
        gx2.q R6 = com.tencent.mm.plugin.finder.viewmodel.component.ai.R6(aiVar, lk5.q0.b("com.tencent.mm.plugin.finder.ui.promotion.FinderPromotionUserListUI", intent, false, 4, null), null, new com.tencent.mm.plugin.finder.ui.promotion.c(aiVar), 2, null);
        if (R6 != null) {
            R6.getHeaderComponent();
        }
        if (R6 != null) {
            R6.setContentReachTop(new com.tencent.mm.plugin.finder.ui.promotion.a(R6));
        }
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        aiVar.O6(com.tencent.mm.plugin.finder.viewmodel.component.ha.P6((com.tencent.mm.plugin.finder.viewmodel.component.ha) a18, 11, null, null, 4, null));
    }
}
