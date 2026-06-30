package qs3;

/* loaded from: classes15.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarViewController f366406d;

    public x0(com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController) {
        this.f366406d = radarViewController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.radar.ui.RadarWaveView waveView;
        com.tencent.mm.plugin.radar.ui.RadarWaveView waveView2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/radar/ui/RadarViewController$mOnQuitActionButtonListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController = this.f366406d;
        if (radarViewController.getRadarStatus() == ps3.r.f358120d || radarViewController.getRadarStatus() == ps3.r.f358121e) {
            android.content.Context context = radarViewController.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((android.app.Activity) context).finish();
        } else {
            qs3.p0 p0Var = radarViewController.f155045q;
            if (p0Var == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (r45.oi5 oi5Var : p0Var.f366375e) {
                if (oi5Var != null) {
                    linkedList.add(oi5Var);
                }
            }
            if (radarViewController.f(linkedList)) {
                waveView = radarViewController.getWaveView();
                waveView.a();
                waveView2 = radarViewController.getWaveView();
                waveView2.setVisibility(0);
                ps3.w wVar = radarViewController.f155043o;
                if (wVar == null) {
                    kotlin.jvm.internal.o.o("radarManager");
                    throw null;
                }
                wVar.f();
                radarViewController.s(ps3.r.f358121e);
            } else {
                radarViewController.s(ps3.r.f358120d);
            }
            qs3.p0 p0Var2 = radarViewController.f155045q;
            if (p0Var2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            p0Var2.a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/radar/ui/RadarViewController$mOnQuitActionButtonListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
