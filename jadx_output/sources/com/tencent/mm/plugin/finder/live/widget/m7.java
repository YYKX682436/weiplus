package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class m7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.n7 f119050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(com.tencent.mm.plugin.finder.live.widget.n7 n7Var) {
        super(1);
        this.f119050d = n7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a it = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = it.f105327a;
        com.tencent.mm.plugin.finder.live.widget.n7 n7Var = this.f119050d;
        if (z17) {
            android.view.View view = n7Var.L;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$registerRedDots$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$registerRedDots$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = n7Var.L;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$registerRedDots$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEntranceSelectPanel$registerRedDots$1", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
