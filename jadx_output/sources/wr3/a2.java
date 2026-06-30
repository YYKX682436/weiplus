package wr3;

/* loaded from: classes11.dex */
public final class a2 implements as3.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment f448758a;

    public a2(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment) {
        this.f448758a = bizProfileTabVideoFragment;
    }

    @Override // as3.s
    public void a() {
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment = this.f448758a;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = bizProfileTabVideoFragment.f154415h;
        if (m0Var != null) {
            m0Var.l(true);
        }
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView q07 = bizProfileTabVideoFragment.q0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(q07, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        q07.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(q07, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
