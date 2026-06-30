package cw1;

/* loaded from: classes11.dex */
public final class i5 extends androidx.fragment.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.vas.VASCommonFragment[] f223001d;

    public i5(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingTabsUI cleanChattingTabsUI, androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        com.tencent.mm.ui.vas.VASCommonFragment[] vASCommonFragmentArr = {lk5.q0.a(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI.class, new android.content.Intent().putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2), false, false, false, null, 60, null), lk5.q0.a(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.class, new android.content.Intent().putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2), false, false, false, null, 60, null)};
        this.f223001d = vASCommonFragmentArr;
        for (com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment : vASCommonFragmentArr) {
            vASCommonFragment.q0(new cw1.h5(vASCommonFragment, cleanChattingTabsUI));
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return 2;
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        return this.f223001d[i17];
    }
}
