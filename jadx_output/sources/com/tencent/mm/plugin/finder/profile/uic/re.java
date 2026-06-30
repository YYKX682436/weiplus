package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class re extends zx2.k {

    /* renamed from: k, reason: collision with root package name */
    public final int f124186k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124187l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, int i17) {
        super(finderProfileTabUIC.E7(i17));
        this.f124187l = finderProfileTabUIC;
        this.f124186k = i17;
    }

    @Override // zx2.k, zx2.i
    public int a() {
        return com.tencent.mm.R.layout.f489075b72;
    }

    @Override // zx2.i
    public int[] b() {
        return new int[]{0, 0};
    }

    @Override // zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124187l;
        int i17 = this.f124186k;
        if (i17 == 5) {
            if (viewGroup != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f477052j, "finder_profile_ting_music_tab");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f477052j, new com.tencent.mm.plugin.finder.profile.uic.le(viewGroup, finderProfileTabUIC));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f477052j, 40, 25496);
                return;
            }
            return;
        }
        if (i17 == 6) {
            if (viewGroup != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f477052j, "finder_profile_song_sheet_tab");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f477052j, new com.tencent.mm.plugin.finder.profile.uic.me(viewGroup, finderProfileTabUIC));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f477052j, 40, 25496);
                return;
            }
            return;
        }
        if (i17 == 1) {
            if (viewGroup != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f477052j, "profile_first_tab");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f477052j, new com.tencent.mm.plugin.finder.profile.uic.ne(viewGroup, finderProfileTabUIC));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f477052j, 40, 25496);
                return;
            }
            return;
        }
        if (i17 == 7) {
            if (viewGroup != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f477052j, "finder_profile_audio_tab");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f477052j, new com.tencent.mm.plugin.finder.profile.uic.oe(viewGroup, finderProfileTabUIC));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f477052j, 40, 25496);
                return;
            }
            return;
        }
        if (i17 == 10) {
            if (viewGroup != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f477052j, "template_tab");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f477052j, new com.tencent.mm.plugin.finder.profile.uic.pe(viewGroup, finderProfileTabUIC));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f477052j, 40, 25496);
                return;
            }
            return;
        }
        if (i17 != 15 || viewGroup == null) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f477052j, new com.tencent.mm.plugin.finder.profile.uic.qe(viewGroup, finderProfileTabUIC));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f477052j, "profile_paid_collection_tab");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f477052j, 40, 25496);
    }

    @Override // zx2.k, zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.d(z17, tabView);
        if (z17) {
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124187l;
            long longExtra = finderProfileTabUIC.getIntent().getLongExtra("finder_from_feed_id", 0L);
            java.util.Map l17 = kz5.c1.l(new jz5.l("profile_tabid", java.lang.Integer.valueOf(this.f124186k)), new jz5.l("author_finder_username", finderProfileTabUIC.F7()));
            if (longExtra != 0) {
                l17.put("source_feedid", pm0.v.u(longExtra));
            }
            com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
            com.tencent.mm.plugin.finder.report.d2.e(d2Var, finderProfileTabUIC.getContext(), "profile_tab", "view_clk", 0, l17, 8, null);
            com.tencent.mm.plugin.finder.report.d2.i(d2Var, finderProfileTabUIC.getContext(), "profile_tab", "view_clk", false, l17, 8, null);
        }
    }

    @Override // zx2.k
    public void f(android.view.ViewGroup tabView) {
        kotlin.jvm.internal.o.g(tabView, "tabView");
        super.f(tabView);
        int i17 = this.f124186k;
        if (i17 == 9) {
            android.content.Context context = tabView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a17, "tab_profile_emoji", 1, null, 0, null, 28, null);
            return;
        }
        if (i17 != 13) {
            return;
        }
        android.content.Context context2 = tabView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a18, "drafttab", 1, null, 0, null, 28, null);
    }

    @Override // zx2.k
    public void k(boolean z17) {
        android.widget.TextView textView = this.f477052j;
        if (textView != null) {
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124187l;
            int color = finderProfileTabUIC.f123460v ? textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9_Night_Mode) : textView.getContext().getResources().getColor(com.tencent.mm.R.color.a0c);
            int color2 = finderProfileTabUIC.f123460v ? textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode) : textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478873jj);
            if (z17) {
                textView.setTextColor(color);
            } else {
                textView.setTextColor(color2);
            }
        }
    }
}
