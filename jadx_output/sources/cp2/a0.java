package cp2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f220770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ym5.s3 s3Var, cp2.v0 v0Var) {
        super(0);
        this.f220770d = s3Var;
        this.f220771e = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.AbstractCollection dataList;
        ym5.s3 s3Var = this.f220770d;
        if (s3Var == null) {
            s3Var = new ym5.s3(0);
            s3Var.f463518c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.era);
        }
        cp2.v0 v0Var = this.f220771e;
        com.tencent.mm.view.recyclerview.WxRecyclerView g17 = ((cp2.q1) v0Var.z()).g();
        androidx.recyclerview.widget.f2 adapter = g17 != null ? g17.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        boolean z17 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.x() : 0) <= 0;
        boolean z18 = s3Var.f463516a != 2 && s3Var.f463517b == -2;
        com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "[checkEmptyHeader] isEmpty=" + z17 + " reason=" + s3Var + " refreshAndNoPermission:" + z18);
        so2.s sVar = v0Var.D;
        if (z17 || z18) {
            if (z18) {
                com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader nearbyLiveFeedLoader = v0Var.f220943w;
                if (nearbyLiveFeedLoader != null && (dataList = nearbyLiveFeedLoader.getDataList()) != null) {
                    dataList.clear();
                }
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
            }
            mn5.a commonConfig = ((cp2.q1) v0Var.z()).j().getCommonConfig();
            if (commonConfig != null) {
                commonConfig.f330194d = false;
            }
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.era);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            sVar.getClass();
            sVar.f410582d = string;
            sVar.f410583e = s3Var.f463517b;
            sVar.f410584f = 1001;
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.era);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            sVar.f410582d = string2;
            r45.dd2 dd2Var = v0Var.f220934n;
            if (dd2Var != null) {
                java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.h6v, dd2Var.getString(1));
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                sVar.getClass();
                sVar.f410582d = string3;
                sVar.f410586h = 1000;
                java.lang.Object obj = s3Var.f463519d;
                if (obj instanceof r45.wc1) {
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderJumpLiveTab");
                    r45.dd2 dd2Var2 = (r45.dd2) ((r45.wc1) obj).getCustom(1);
                    if (dd2Var2 != null) {
                        if (dd2Var.getInteger(0) == dd2Var2.getInteger(0)) {
                            sVar.f410586h = 1000;
                            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.h6v, dd2Var.getString(1));
                            kotlin.jvm.internal.o.f(string4, "getString(...)");
                            sVar.f410582d = string4;
                        } else {
                            sVar.f410586h = 2000;
                            sVar.f410582d = java.lang.String.valueOf(dd2Var.getString(1));
                            sVar.f410587i = new cp2.z(v0Var, dd2Var2);
                        }
                    }
                }
            }
            if ((wxRecyclerAdapter == null || wxRecyclerAdapter.W(sVar)) ? false : true) {
                wxRecyclerAdapter.Q(sVar, false);
            } else if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.c0(sVar.hashCode());
            }
        } else if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.i0(sVar.hashCode(), false);
        }
        ((cp2.q1) v0Var.z()).j().setNestedScrollingEnabled((s3Var.f463517b == -1 && z17) ? false : true);
        return jz5.f0.f302826a;
    }
}
