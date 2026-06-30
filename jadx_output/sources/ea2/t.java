package ea2;

/* loaded from: classes2.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f250582e;

    public t(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        this.f250581d = finderMusicTopicHeaderUIC;
        this.f250582e = constraintLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.hj2 hj2Var;
        r45.hj2 hj2Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250581d;
        androidx.appcompat.app.AppCompatActivity context = finderMusicTopicHeaderUIC.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = null;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null || (str = nyVar.f135382p) == null) {
            str = "";
        }
        java.lang.String str2 = str + '_' + java.lang.System.currentTimeMillis();
        r45.r03 r03Var = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
        if (r03Var != null && (hj2Var2 = (r45.hj2) r03Var.getCustom(19)) != null) {
            finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) hj2Var2.getCustom(16);
        }
        if (finderJumpInfo != null) {
            androidx.constraintlayout.widget.ConstraintLayout clListenCompleteSong = finderMusicTopicHeaderUIC.d7().f434714c;
            kotlin.jvm.internal.o.f(clListenCompleteSong, "clListenCompleteSong");
            hc2.v0.d(clListenCompleteSong, "listen_whole_song_qq", "view_clk", false, finderMusicTopicHeaderUIC.b7(str2), null, 20, null);
        } else {
            androidx.constraintlayout.widget.ConstraintLayout clListenCompleteSong2 = finderMusicTopicHeaderUIC.d7().f434714c;
            kotlin.jvm.internal.o.f(clListenCompleteSong2, "clListenCompleteSong");
            hc2.v0.d(clListenCompleteSong2, "listen_whole_song", "view_clk", false, finderMusicTopicHeaderUIC.a7(), null, 20, null);
        }
        r45.r03 r03Var2 = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
        if (r03Var2 != null && (hj2Var = (r45.hj2) r03Var2.getCustom(19)) != null) {
            if (finderMusicTopicHeaderUIC.k7()) {
                finderMusicTopicHeaderUIC.m7();
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) hj2Var.getCustom(16);
            if (finderJumpInfo2 != null) {
                com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "click listen complete song, switch on, go listen_whole_music_jump_info");
                r45.k74 lite_app_info = finderJumpInfo2.getLite_app_info();
                if (lite_app_info != null) {
                    lite_app_info.set(2, xc2.r0.a(lite_app_info.getString(2), kz5.c1.k(new jz5.l("from_scene", 1), new jz5.l("jumper_click_sessionid", str2))));
                }
                xc2.y2.i(xc2.y2.f453343a, finderMusicTopicHeaderUIC.getActivity(), new xc2.p0(finderJumpInfo2), 0, null, 12, null);
            } else {
                r45.zi2 zi2Var = (r45.zi2) hj2Var.getCustom(3);
                if (zi2Var != null) {
                    com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "click listen complete song, switch on, goToTingPage");
                    finderMusicTopicHeaderUIC.s7(zi2Var);
                    com.tencent.mm.plugin.finder.storage.cd0 cd0Var = com.tencent.mm.plugin.finder.storage.cd0.f126580a;
                    android.content.Context context2 = this.f250582e.getContext();
                    kotlin.jvm.internal.o.f(context2, "getContext(...)");
                    java.lang.String string = zi2Var.getString(0);
                    java.lang.String str3 = string != null ? string : "";
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderMusicEvent;
                    bw5.lp0 c17 = cd0Var.c(zi2Var, str3);
                    qk.f9.b(((rk4.z8) cd0Var.e()).aj(), context2, true, c17, new il4.e(null, 0, 1604, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554419, null), null, null, ar0Var, null, 176, null);
                    ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(c17, ar0Var);
                    com.tencent.mm.plugin.finder.report.k0.f125092a.a(context2, "Ting");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
