package qs3;

/* loaded from: classes15.dex */
public final class h extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366349a;

    public h(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView) {
        this.f366349a = radarMemberView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        java.lang.String str;
        com.tencent.mm.plugin.radar.ui.RadarWaveView waveView;
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        int i18 = com.tencent.mm.plugin.radar.ui.RadarMemberView.B;
        com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView = this.f366349a;
        if (i17 == 0) {
            radarMemberView.f(radarMemberView.getMember(), radarMemberView.getState());
            return;
        }
        if (i17 == 1) {
            radarMemberView.setVisibility(4);
            radarMemberView.e();
            android.view.View view = radarMemberView.f154972d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            qs3.e eVar = radarMemberView.f154987v;
            if (eVar != null) {
                r45.oi5 member = radarMemberView.getMember();
                ps3.e state = radarMemberView.getState();
                qs3.w0 w0Var = (qs3.w0) eVar;
                if (member != null) {
                    str = member.f382283d;
                    if (str == null && (str = member.f382287h) == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController = w0Var.f366404a;
                qs3.p0 p0Var = radarViewController.f155045q;
                if (p0Var == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                android.view.View view2 = (android.view.View) p0Var.f366380j.get(str);
                if (view2 != null) {
                    java.lang.Object tag = view2.getTag();
                    kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarViewController.RadarSearchAdapter.ViewHolder");
                    qs3.o0 o0Var = (qs3.o0) tag;
                    if (state != ps3.e.f358076d) {
                        o0Var.f366370c.c();
                    }
                }
                waveView = radarViewController.getWaveView();
                waveView.a();
            }
        }
    }
}
