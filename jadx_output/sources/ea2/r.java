package ea2;

/* loaded from: classes2.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250579d;

    public r(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f250579d = finderMusicTopicHeaderUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View contentView;
        r45.hj2 hj2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initFav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250579d;
        finderMusicTopicHeaderUIC.f101760h = !finderMusicTopicHeaderUIC.f101760h;
        finderMusicTopicHeaderUIC.u7();
        r45.r03 r03Var = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
        if (r03Var != null && (hj2Var = (r45.hj2) r03Var.getCustom(19)) != null) {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicHeaderUIC", "handleClickFav: isLikeSong=" + finderMusicTopicHeaderUIC.f101760h + ", listen_song_id=" + pm0.v.u(hj2Var.getLong(11)) + ", hasCopyRight=" + finderMusicTopicHeaderUIC.f7());
            android.app.Activity context = finderMusicTopicHeaderUIC.getContext();
            bw5.g80 g80Var = new bw5.g80();
            g80Var.f27723d = pm0.v.u(hj2Var.getLong(11));
            boolean[] zArr = g80Var.f27740x;
            zArr[2] = true;
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            g80Var.f27733q = 1604;
            zArr[12] = true;
            g80Var.f27725f = !finderMusicTopicHeaderUIC.f101760h;
            zArr[3] = true;
            g80Var.f27727h = 2;
            zArr[6] = true;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) finderMusicTopicHeaderUIC.c7().f302834e;
            g80Var.f27729m = baseFinderFeed != null ? pm0.v.u(baseFinderFeed.getItemId()) : "";
            zArr[8] = true;
            g80Var.f27732p = 3;
            zArr[11] = true;
            g80Var.f27726g = false;
            zArr[5] = true;
            ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Di(new qk.aa(context, g80Var, false, null, null, 28, null), null);
        }
        if (finderMusicTopicHeaderUIC.f101760h) {
            boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.M5).getValue()).r()).intValue() == 1;
            if (finderMusicTopicHeaderUIC.f101770u == null) {
                finderMusicTopicHeaderUIC.f101770u = new com.tencent.mm.plugin.finder.view.rf(finderMusicTopicHeaderUIC.getActivity(), new ea2.h0(finderMusicTopicHeaderUIC, z17));
            }
            com.tencent.mm.plugin.finder.view.rf rfVar = finderMusicTopicHeaderUIC.f101770u;
            if (rfVar != null) {
                if (z17) {
                    android.widget.TextView textView = (android.widget.TextView) rfVar.getContentView().findViewById(com.tencent.mm.R.id.fth);
                    if (textView != null) {
                        textView.setText(com.tencent.mm.R.string.f491946mr0);
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) rfVar.getContentView().findViewById(com.tencent.mm.R.id.ftg);
                    if (textView2 != null) {
                        textView2.setText(com.tencent.mm.R.string.ms_);
                    }
                    android.widget.TextView textView3 = (android.widget.TextView) rfVar.getContentView().findViewById(com.tencent.mm.R.id.ftg);
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                } else if (finderMusicTopicHeaderUIC.f7()) {
                    android.widget.TextView textView4 = (android.widget.TextView) rfVar.getContentView().findViewById(com.tencent.mm.R.id.fth);
                    if (textView4 != null) {
                        textView4.setText(com.tencent.mm.R.string.eqc);
                    }
                    android.widget.TextView textView5 = (android.widget.TextView) rfVar.getContentView().findViewById(com.tencent.mm.R.id.ftg);
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                } else {
                    android.widget.TextView textView6 = (android.widget.TextView) rfVar.getContentView().findViewById(com.tencent.mm.R.id.fth);
                    if (textView6 != null) {
                        textView6.setText(com.tencent.mm.R.string.lev);
                    }
                    android.widget.TextView textView7 = (android.widget.TextView) rfVar.getContentView().findViewById(com.tencent.mm.R.id.ftg);
                    if (textView7 != null) {
                        textView7.setVisibility(8);
                    }
                }
                rfVar.dismiss();
                rfVar.f132957f = -finderMusicTopicHeaderUIC.getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl);
                android.widget.LinearLayout musicTopicHeaderFav = finderMusicTopicHeaderUIC.d7().f434718g;
                kotlin.jvm.internal.o.f(musicTopicHeaderFav, "musicTopicHeaderFav");
                if (!rfVar.f132956e) {
                    rfVar.getContentView().measure(0, 0);
                    rfVar.f132956e = true;
                }
                int height = musicTopicHeaderFav.getHeight();
                int width = musicTopicHeaderFav.getWidth();
                int[] iArr = new int[2];
                musicTopicHeaderFav.getLocationInWindow(iArr);
                int i17 = iArr[1] + height;
                int measuredWidth = ((iArr[0] + width) - rfVar.getContentView().getMeasuredWidth()) - rfVar.f132957f;
                rfVar.setAnimationStyle(com.tencent.mm.R.style.f494610rl);
                rfVar.showAtLocation(musicTopicHeaderFav, 0, measuredWidth, i17);
                long j17 = rfVar.f132955d;
                if (j17 > 0 && (contentView = rfVar.getContentView()) != null) {
                    contentView.postDelayed(new com.tencent.mm.plugin.finder.view.qf(rfVar.f132958g), j17);
                }
            }
        } else {
            java.lang.String string = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.M5).getValue()).r()).intValue() == 1 ? finderMusicTopicHeaderUIC.getActivity().getResources().getString(com.tencent.mm.R.string.mgf) : finderMusicTopicHeaderUIC.getActivity().getResources().getString(com.tencent.mm.R.string.f491291cn5);
            kotlin.jvm.internal.o.d(string);
            com.tencent.mm.ui.widget.snackbar.j.c(string, null, finderMusicTopicHeaderUIC.getActivity(), null, null);
        }
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.p7(this.f250579d, 106, null, null, 0, 12, null);
        kotlin.jvm.internal.o.d(view);
        hc2.v0.d(view, "music_topic_page_like", "view_clk", false, finderMusicTopicHeaderUIC.a7(), null, 20, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initFav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
