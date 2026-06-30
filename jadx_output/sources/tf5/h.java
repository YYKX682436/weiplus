package tf5;

/* loaded from: classes11.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f418989d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f418990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.BaseAddressUIFragment f418991f;

    public h(com.tencent.mm.ui.contact.address.BaseAddressUIFragment baseAddressUIFragment, android.view.View view) {
        this.f418991f = baseAddressUIFragment;
        this.f418990e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.address.BaseAddressUIFragment baseAddressUIFragment = this.f418991f;
        if (baseAddressUIFragment.getView() == null) {
            return;
        }
        int a17 = com.tencent.mm.ui.bl.a(baseAddressUIFragment.getContext());
        int i17 = com.tencent.mm.ui.bl.i(baseAddressUIFragment.getContext(), -1);
        if (i17 <= 0) {
            if (this.f418989d < 2) {
                com.tencent.mars.xlog.Log.i(baseAddressUIFragment.s0(), "[trySetParentViewPadding] try getStatusHeight again!");
                baseAddressUIFragment.getView().post(this);
            } else {
                com.tencent.mars.xlog.Log.e(baseAddressUIFragment.s0(), "[trySetParentViewPadding] try getStatusHeight finally!");
            }
            this.f418989d++;
        } else {
            int i18 = com.tencent.mm.ui.contact.address.BaseAddressUIFragment.f206600n;
            int t07 = baseAddressUIFragment.t0();
            if (t07 != baseAddressUIFragment.getView().getPaddingTop()) {
                com.tencent.mars.xlog.Log.i(baseAddressUIFragment.s0(), "[trySetParentViewPadding] now:%s old:%s", java.lang.Integer.valueOf(t07), java.lang.Integer.valueOf(baseAddressUIFragment.getView().getPaddingTop()));
                if (com.tencent.mm.ui.a4.f197117a.h(baseAddressUIFragment.thisActivity())) {
                    baseAddressUIFragment.getView().setPadding(0, t07, 0, 0);
                } else {
                    baseAddressUIFragment.getView().setPadding(0, t07, 0, this.f418990e.getHeight());
                }
            } else {
                com.tencent.mars.xlog.Log.i(baseAddressUIFragment.s0(), "[trySetParentViewPadding] has try more once! it's right! actionBarHeight:%s actionBarHeight:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
            }
        }
        com.tencent.mars.xlog.Log.i(baseAddressUIFragment.s0(), "[trySetParentViewPadding] tryCount:%s actionBarHeight:%s actionBarHeight:%s", java.lang.Integer.valueOf(this.f418989d), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
    }
}
