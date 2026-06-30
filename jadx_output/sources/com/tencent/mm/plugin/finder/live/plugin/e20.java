package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e20 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f112362p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f112363q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112362p = rootView;
        this.f112363q = statusMonitor;
        K0(8);
        rootView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.a20(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (((mm2.e1) P0(mm2.e1.class)).b7()) {
            super.K0(8);
        } else {
            super.K0(i17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.b20.f111964a[status.ordinal()] == 1) {
            com.tencent.mars.xlog.Log.i("FinderLiveOldSongBannerPlugin", "[OldSongBanner] statusChange: START_LIVE received");
            boolean M = zl2.r4.f473950a.M();
            com.tencent.mars.xlog.Log.i("FinderLiveOldSongBannerPlugin", "[OldSongBanner] initPlugin: enableSingSong=" + M);
            if (M) {
                ((mm2.m6) P0(mm2.m6.class)).f329245m.observe(this, new com.tencent.mm.plugin.finder.live.plugin.c20(this));
                ((mm2.m6) P0(mm2.m6.class)).f329243h.observe(this, new com.tencent.mm.plugin.finder.live.plugin.d20(this));
                t1(null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1(java.lang.String str) {
        android.view.ViewGroup viewGroup = this.f112362p;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.mxt);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) viewGroup.findViewById(com.tencent.mm.R.id.f486940my3);
        if (mMPAGView != null) {
            mMPAGView.setVisibility(8);
        }
        weImageView.setImageResource(com.tencent.mm.R.raw.icon_agenda_filled);
        com.tencent.mm.plugin.finder.live.view.FinderMarqueeTextView finderMarqueeTextView = (com.tencent.mm.plugin.finder.live.view.FinderMarqueeTextView) viewGroup.findViewById(com.tencent.mm.R.id.f486942my4);
        finderMarqueeTextView.setMaxWidth((int) (finderMarqueeTextView.getTextSize() * 6));
        if (str == null || str.length() == 0) {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            finderMarqueeTextView.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e8j));
            finderMarqueeTextView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        } else {
            weImageView.setIconColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.Brand_100));
            finderMarqueeTextView.setText(str);
            finderMarqueeTextView.setTextColor(viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.Brand_100));
        }
        weImageView.setVisibility(0);
        finderMarqueeTextView.setSelected(true);
    }
}
