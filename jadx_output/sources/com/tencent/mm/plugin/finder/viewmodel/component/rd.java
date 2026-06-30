package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class rd extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.yd f135792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135793b;

    public rd(com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar, in5.s0 s0Var) {
        this.f135792a = ydVar;
        this.f135793b = s0Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.util.List list;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo e76;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar = this.f135792a;
        ydVar.getClass();
        if (z17) {
            java.lang.Object obj = this.f135793b.f293125i;
            java.lang.Object obj2 = null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed == null || (list = (java.util.List) ydVar.f7().U6(baseFinderFeed.getItemId()).getValue()) == null || (e76 = ydVar.e7(baseFinderFeed, list)) == null) {
                return;
            }
            java.util.LinkedList<r45.wf6> style = e76.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator<T> it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.wf6 wf6Var = (r45.wf6) next;
                kotlin.jvm.internal.o.d(wf6Var);
                if (ydVar.h7(wf6Var)) {
                    obj2 = next;
                    break;
                }
            }
            r45.wf6 wf6Var2 = (r45.wf6) obj2;
            if (wf6Var2 == null || ((r45.d60) wf6Var2.getCustom(31)) == null) {
                return;
            }
            xc2.p0 p0Var = new xc2.p0(e76);
            p0Var.f453244f = baseFinderFeed;
            p0Var.f453257s = 23;
            p0Var.f453256r = 16;
            xc2.n.c(xc2.n.f453212a, ydVar.getContext(), view, p0Var, 0, "feed_jump_carousel", xc2.k.f453171d, null, null, 200, null);
        }
    }
}
