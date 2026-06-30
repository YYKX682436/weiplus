package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.music.ui.LyricView f151252d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hf2 f151253e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.music.player.base.k f151254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151254f = new com.tencent.mm.plugin.mv.ui.uic.j6(this);
    }

    public final void O6() {
        com.tencent.mm.plugin.music.ui.LyricView lyricView;
        this.f151252d = (com.tencent.mm.plugin.music.ui.LyricView) getActivity().findViewById(com.tencent.mm.R.id.j7q);
        int b17 = i65.a.b(getActivity(), 22);
        int a17 = i65.a.a(getActivity(), 4.0f);
        int a18 = i65.a.a(getActivity(), 4.0f);
        com.tencent.mm.plugin.music.ui.LyricView lyricView2 = this.f151252d;
        if (lyricView2 != null) {
            android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
            lyricView2.f150687n = true;
            lyricView2.f150686m = align;
            lyricView2.f150684h.setTextAlign(align);
            lyricView2.f150684h.setFakeBoldText(false);
            lyricView2.f150685i.setTextAlign(align);
            lyricView2.f150684h.setFakeBoldText(false);
            lyricView2.f150688o = a17;
            lyricView2.f150689p = b17;
            lyricView2.f150690q = a18;
            int i17 = a17 + b17 + a18;
            lyricView2.f150694u = i17;
            lyricView2.f150695v = i17;
            float f17 = b17;
            lyricView2.f150684h.setTextSize(f17);
            lyricView2.f150685i.setTextSize(f17);
        }
        com.tencent.mm.plugin.music.ui.LyricView lyricView3 = this.f151252d;
        if (lyricView3 != null) {
            lyricView3.setMode(1);
        }
        com.tencent.mm.plugin.music.ui.LyricView lyricView4 = this.f151252d;
        android.view.ViewGroup.LayoutParams layoutParams = lyricView4 != null ? lyricView4.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (getActivity().getResources().getDisplayMetrics().heightPixels * 0.37f);
        r45.hf2 hf2Var = this.f151253e;
        if (hf2Var != null) {
            java.lang.String string = hf2Var.getString(6);
            r45.hf2 hf2Var2 = (string == null || string.length() == 0) ^ true ? hf2Var : null;
            if (hf2Var2 != null) {
                ll3.h1 f18 = ll3.h1.f(hf2Var2.getString(6), getActivity().getString(com.tencent.mm.R.string.h4r), "", ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).Ai(hf2Var2.getString(4), hf2Var2.getString(2)), hf2Var2.getString(1), false, false);
                if (f18.e() > 1) {
                    com.tencent.mm.plugin.music.ui.LyricView lyricView5 = this.f151252d;
                    if (lyricView5 != null) {
                        lyricView5.setLyricObj(f18);
                    }
                    if (((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).Ai(hf2Var2.getString(4), hf2Var2.getString(2)) || (lyricView = this.f151252d) == null) {
                        return;
                    }
                    lyricView.setCurrentTime(1L);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        kl3.t.g().f(this.f151254f);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        kl3.t g17 = kl3.t.g();
        com.tencent.mm.plugin.music.player.base.k kVar = this.f151254f;
        rl3.b bVar = (rl3.b) g17.a();
        if (kVar == null) {
            bVar.getClass();
            return;
        }
        java.util.LinkedList linkedList = bVar.f397235j;
        if (linkedList.contains(kVar)) {
            return;
        }
        linkedList.add(kVar);
    }
}
