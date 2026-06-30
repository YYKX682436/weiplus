package ea2;

/* loaded from: classes2.dex */
public final class e0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250549a;

    public e0(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f250549a = finderMusicTopicHeaderUIC;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250549a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(finderMusicTopicHeaderUIC.getActivity());
        lVarArr[0] = new jz5.l("session_id", e17 != null ? e17.f135385q : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(finderMusicTopicHeaderUIC.getActivity());
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(finderMusicTopicHeaderUIC.getActivity());
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(finderMusicTopicHeaderUIC.getActivity());
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        return kz5.c1.k(lVarArr);
    }
}
