package lo2;

/* loaded from: classes8.dex */
public final class f0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI f320121d;

    public f0(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI) {
        this.f320121d = finderMemberSearchUI;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI = this.f320121d;
        finderMemberSearchUI.hideVKB();
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMemberSearchUI", "onItemClick position:" + i17);
        } else {
            java.lang.Object obj = finderMemberSearchUI.A.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_member_saerch_feed_id", ((jo2.e) obj).f300884d.f378676i);
            finderMemberSearchUI.setResult(-1, intent);
            finderMemberSearchUI.finish();
        }
    }
}
