package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class u1 implements le0.r {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.service.u1 f126217a = new com.tencent.mm.plugin.finder.service.u1();

    @Override // le0.r
    public final void a(android.content.Context context, le0.t tVar) {
        if (context instanceof com.tencent.mm.plugin.finder.ui.FinderConversationParentUI) {
            ((com.tencent.mm.pluginsdk.ui.span.j1) tVar).f191244w = kz5.p1.d(68);
            return;
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            java.lang.String stringExtra = activity.getIntent().getStringExtra("key_chat_from");
            java.lang.String stringExtra2 = activity.getIntent().getStringExtra("Chat_User");
            if (kotlin.jvm.internal.o.b(stringExtra, com.tencent.mm.plugin.finder.ui.FinderConversationTempUI.class.getName()) || kotlin.jvm.internal.o.b(stringExtra, com.tencent.mm.plugin.finder.ui.FinderConversationXXUI.class.getName()) || kotlin.jvm.internal.o.b(stringExtra, com.tencent.mm.plugin.finder.feed.ui.FinderConvAliasUI.class.getName()) || kotlin.jvm.internal.o.b(stringExtra, com.tencent.mm.plugin.finder.ui.FinderConversationUI.class.getName()) || com.tencent.mm.storage.z3.V3(stringExtra2)) {
                ((com.tencent.mm.pluginsdk.ui.span.j1) tVar).f191244w = kz5.p1.d(68);
            }
        }
    }
}
