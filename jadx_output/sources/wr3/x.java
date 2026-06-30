package wr3;

/* loaded from: classes11.dex */
public final class x implements as3.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment f448912a;

    public x(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment bizProfileTabAudioFragment) {
        this.f448912a = bizProfileTabAudioFragment;
    }

    @Override // as3.s
    public void a() {
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioFragment bizProfileTabAudioFragment = this.f448912a;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = bizProfileTabAudioFragment.f154415h;
        if (m0Var != null) {
            m0Var.l(true);
        }
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileRecyclerView J0 = bizProfileTabAudioFragment.J0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabAudioFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
