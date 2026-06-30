package wr3;

/* loaded from: classes11.dex */
public final class v0 implements as3.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment f448901a;

    public v0(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment) {
        this.f448901a = bizProfileTabMsgFragment;
    }

    @Override // as3.s
    public void a() {
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment = this.f448901a;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = bizProfileTabMsgFragment.f154415h;
        if (m0Var != null) {
            m0Var.l(true);
        }
        com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView r07 = bizProfileTabMsgFragment.r0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(r07, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        r07.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(r07, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
