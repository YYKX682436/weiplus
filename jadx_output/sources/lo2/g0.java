package lo2;

/* loaded from: classes8.dex */
public final class g0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI f320125a;

    public g0(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI) {
        this.f320125a = finderMemberSearchUI;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI = this.f320125a;
        java.lang.String str = finderMemberSearchUI.D;
        java.lang.String str2 = finderMemberSearchUI.E;
        finderMemberSearchUI.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberSearchUI", "requestLoadMore CgiGetFinderSearchMemberZone " + str + ' ' + str2);
        if (!(str2.length() == 0)) {
            if (!(str.length() == 0)) {
                kotlinx.coroutines.l.d(finderMemberSearchUI.getLifecycleAsyncScope(), null, null, new lo2.l0(finderMemberSearchUI, str, str2, null), 3, null);
            }
        }
        return true;
    }
}
