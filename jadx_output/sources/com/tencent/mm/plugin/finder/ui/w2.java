package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderConversationFragment f129972d;

    public w2(com.tencent.mm.plugin.finder.ui.FinderConversationFragment finderConversationFragment) {
        this.f129972d = finderConversationFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderConversationFragment fragment = this.f129972d;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment).a(pf5.e.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pf5.e.launch$default((pf5.e) a17, null, null, new com.tencent.mm.plugin.finder.ui.v2(fragment, null), 3, null);
        com.tencent.mm.plugin.finder.report.g6 g6Var = fragment.E;
        boolean z17 = false;
        if (g6Var != null && g6Var.a()) {
            z17 = true;
        }
        if (z17) {
            fragment.M0();
        }
    }
}
