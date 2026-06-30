package ea2;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f250584e;

    public u(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, r45.zi2 zi2Var) {
        this.f250583d = finderMusicTopicHeaderUIC;
        this.f250584e = zi2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        r45.hj2 hj2Var2;
        r45.zi2 zi2Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250583d;
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.p7(finderMusicTopicHeaderUIC, 103, kz5.b1.e(new jz5.l("play_state", java.lang.Integer.valueOf(finderMusicTopicHeaderUIC.k7() ? 1 : 0))), null, 0, 12, null);
        kotlin.jvm.internal.o.d(view);
        hc2.v0.d(view, "musician_play", "view_clk", false, finderMusicTopicHeaderUIC.a7(), null, 20, null);
        if (finderMusicTopicHeaderUIC.f101761i) {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "click song cover, switch on, playFeedVideoBgm");
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.V6(finderMusicTopicHeaderUIC);
        } else if (finderMusicTopicHeaderUIC.f7()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click song cover, switch off, playMusicWithTing, hasCopyright = ");
            sb6.append(finderMusicTopicHeaderUIC.f7());
            sb6.append(", mediaStreamingUrl = ");
            r45.r03 r03Var = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
            sb6.append((r03Var == null || (hj2Var2 = (r45.hj2) r03Var.getCustom(19)) == null || (zi2Var2 = (r45.zi2) hj2Var2.getCustom(3)) == null) ? null : zi2Var2.getString(5));
            com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", sb6.toString());
            com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "playMusicWithTing");
            r45.r03 r03Var2 = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
            if (r03Var2 != null && (hj2Var = (r45.hj2) r03Var2.getCustom(19)) != null && (zi2Var = (r45.zi2) hj2Var.getCustom(3)) != null) {
                boolean i76 = finderMusicTopicHeaderUIC.i7();
                com.tencent.mm.plugin.finder.storage.cd0 cd0Var = com.tencent.mm.plugin.finder.storage.cd0.f126580a;
                if (i76) {
                    cd0Var.a("", finderMusicTopicHeaderUIC.f7());
                } else {
                    if (finderMusicTopicHeaderUIC.k7()) {
                        finderMusicTopicHeaderUIC.m7();
                    }
                    finderMusicTopicHeaderUIC.s7(zi2Var);
                    android.app.Activity context = finderMusicTopicHeaderUIC.getContext();
                    boolean f76 = finderMusicTopicHeaderUIC.f7();
                    kotlin.jvm.internal.o.g(context, "context");
                    java.lang.String string = zi2Var.getString(0);
                    java.lang.String str = string == null ? "" : string;
                    r45.xs4 xs4Var = new r45.xs4();
                    xs4Var.set(4, zi2Var.getString(3));
                    xs4Var.set(5, zi2Var.getString(4));
                    xs4Var.set(10, java.lang.Integer.valueOf(zi2Var.getInteger(9)));
                    xs4Var.set(14, zi2Var.getString(2));
                    xs4Var.set(16, zi2Var.getString(1));
                    xs4Var.set(13, zi2Var.getString(1));
                    xs4Var.set(2, zi2Var.getString(1));
                    java.lang.String string2 = zi2Var.getString(0);
                    xs4Var.set(11, string2 != null ? string2 : "");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((com.tencent.mm.plugin.finder.profile.uic.d6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.d6.class)).f123613f = false;
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
                    cd0Var.g(context, zi2Var, str, 0, xs4Var, f76, bw5.ar0.TingScene_FinderMusicEvent);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "click song cover, switch off, playFeedVideoBgm");
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.V6(finderMusicTopicHeaderUIC);
        }
        if (this.f250584e != null) {
            fa2.a aVar = fa2.a.f260706a;
            android.app.Activity context2 = finderMusicTopicHeaderUIC.getContext();
            r45.r03 r03Var3 = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
            fa2.a.a(aVar, context2, "music_play", 1, 0, r03Var3 != null ? (r45.hj2) r03Var3.getCustom(19) : null, null, 40, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initMusic$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
