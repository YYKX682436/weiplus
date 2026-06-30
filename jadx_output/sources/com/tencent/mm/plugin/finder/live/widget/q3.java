package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f119464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView f119465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f119466f;

    public q3(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView easySimpleLivingCardView, com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        this.f119464d = finderObject;
        this.f119465e = easySimpleLivingCardView;
        this.f119466f = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView easySimpleLivingCardView = this.f119465e;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f119464d;
        if (finderObject == null || !easySimpleLivingCardView.isShown()) {
            com.tencent.mars.xlog.Log.e("FinderLiveAfterNextLiveInfoWidget", "paly live when feed = " + finderObject + ", view isShown = " + easySimpleLivingCardView.isShown());
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAfterNextLiveInfoWidget", "play Live");
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f119466f;
        c50.m0 m0Var = b4Var.f117826g;
        if (m0Var == null) {
            c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
            android.content.Context context = b4Var.f117820a.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            m0Var = ((v40.q) q0Var).Ai((androidx.appcompat.app.AppCompatActivity) context);
            ((gp2.l0) m0Var).e(null);
        }
        b4Var.f117826g = m0Var;
        c50.m0 m0Var2 = b4Var.f117826g;
        if (m0Var2 != null) {
            ((gp2.l0) m0Var2).f(c50.a.f38585d, 10);
        }
        c50.m0 m0Var3 = b4Var.f117826g;
        if (m0Var3 != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f119464d;
            c50.m0.a(m0Var3, finderObject2, this.f119465e, new com.tencent.mm.plugin.finder.live.widget.o3(b4Var, finderObject2), new com.tencent.mm.plugin.finder.live.widget.p3(b4Var, finderObject2), null, false, 48, null);
        }
    }
}
