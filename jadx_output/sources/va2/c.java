package va2;

/* loaded from: classes2.dex */
public final class c implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va2.f f434233a;

    public c(va2.f fVar) {
        this.f434233a = fVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        va2.f fVar = this.f434233a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(fVar.getActivity());
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(fVar.getActivity());
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(fVar.getActivity());
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(fVar.getActivity());
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        return kz5.c1.k(lVarArr);
    }
}
