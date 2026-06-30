package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qn extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f135723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135723d = "FinderLiveFeedReportLiftUIC";
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mars.xlog.Log.i(this.f135723d, "[FinderLiveFeedReportLiftUIC] onStop");
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(getActivity());
        r45.qt2 V6 = Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null;
        ((b92.d1) zbVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        dk2.u6.f234171a.e(context, null, V6, true);
    }
}
