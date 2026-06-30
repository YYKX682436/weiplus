package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class kd extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ld f134957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134958b;

    public kd(com.tencent.mm.plugin.finder.viewmodel.component.ld ldVar, in5.s0 s0Var) {
        this.f134957a = ldVar;
        this.f134958b = s0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        xc2.p0 e76;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.viewmodel.component.ld ldVar = this.f134957a;
        ldVar.getClass();
        in5.s0 holder = this.f134958b;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (z17) {
            java.lang.Object obj = holder.f293125i;
            java.lang.Object obj2 = null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed == null || (e76 = ldVar.e7(baseFinderFeed)) == null) {
                return;
            }
            java.util.LinkedList<r45.wf6> style = e76.f453234a.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator<T> it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.wf6 wf6Var = (r45.wf6) next;
                kotlin.jvm.internal.o.d(wf6Var);
                if (ldVar.f7(wf6Var)) {
                    obj2 = next;
                    break;
                }
            }
            r45.wf6 wf6Var2 = (r45.wf6) obj2;
            if (wf6Var2 == null || ((r45.d60) wf6Var2.getCustom(31)) == null) {
                return;
            }
            xc2.n.c(xc2.n.f453212a, ldVar.getContext(), view, e76, 0, "feed_jump_carousel", xc2.k.f453171d, null, null, 200, null);
        }
    }
}
