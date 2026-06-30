package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar;", "Lcom/tencent/mm/plugin/sns/ui/SnsBaseImgBottomBar;", "Landroid/view/View$OnClickListener;", "clickCallback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "setDetailBtnClickCallback", "", "visible", "setDetailBtnVisible", "setVideoSeekBarVisible", "disallow", "setDisallowParentIntercept", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsAlbumImgBottomBar extends com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f166794n = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsLivePlayButton f166795e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f166796f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewStub f166797g;

    /* renamed from: h, reason: collision with root package name */
    public xd4.e f166798h;

    /* renamed from: i, reason: collision with root package name */
    public int f166799i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f166800m;

    public SnsAlbumImgBottomBar(android.content.Context context) {
        super(context);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eor, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.skj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = (com.tencent.mm.plugin.sns.ui.SnsLivePlayButton) findViewById;
        this.f166795e = snsLivePlayButton;
        snsLivePlayButton.post(new com.tencent.mm.plugin.sns.ui.de(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(snsLivePlayButton);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.skh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f166796f = findViewById2;
        this.f166797g = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.skl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483494sm5);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.tencent.mm.ui.dl.i(textView.getPaint());
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar
    public void b(r45.jj4 mediaObj, long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        r45.jj4 jj4Var = mediaObj.X;
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = this.f166795e;
        if (jj4Var != null) {
            snsLivePlayButton.setVisibility(0);
        } else {
            snsLivePlayButton.setVisibility(8);
        }
        android.view.View view = this.f166796f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar", "setComponentVisible", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar", "setComponentVisible", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setVisibility((snsLivePlayButton.getVisibility() == 0 || this.f166796f.getVisibility() == 0) ? 0 : 8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        if (!this.f166800m) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                this.f166799i = layoutParams2.bottomMargin;
                this.f166800m = true;
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
            return;
        }
        boolean z17 = getContext().getResources().getConfiguration().orientation == 2;
        boolean f17 = com.tencent.mm.ui.bl.f(getContext());
        if (z17) {
            int c17 = f17 ? com.tencent.mm.ui.bl.c(getContext()) : 0;
            int h17 = com.tencent.mm.ui.bl.h(getContext());
            int l17 = com.tencent.mm.ui.bl.l(getContext());
            if (l17 == 1) {
                layoutParams4.rightMargin = c17;
                layoutParams4.leftMargin = h17;
            } else if (l17 != 3) {
                layoutParams4.leftMargin = 0;
                layoutParams4.rightMargin = 0;
            } else {
                layoutParams4.leftMargin = c17;
                layoutParams4.rightMargin = h17;
            }
            layoutParams4.bottomMargin = this.f166799i;
        } else {
            layoutParams4.leftMargin = 0;
            layoutParams4.rightMargin = 0;
            if (f17) {
                layoutParams4.bottomMargin = this.f166799i + com.tencent.mm.ui.bl.c(getContext());
            } else {
                layoutParams4.bottomMargin = this.f166799i;
            }
        }
        setLayoutParams(layoutParams4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMarginForNavigationBar", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar
    public void setDetailBtnClickCallback(android.view.View.OnClickListener clickCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDetailBtnClickCallback", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        kotlin.jvm.internal.o.g(clickCallback, "clickCallback");
        android.view.View view = this.f166796f;
        if (view.getVisibility() == 0) {
            view.setOnClickListener(clickCallback);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDetailBtnClickCallback", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    public final void setDetailBtnVisible(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDetailBtnVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        android.view.View view = this.f166796f;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar", "setDetailBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar", "setDetailBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDetailBtnVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    public final void setDisallowParentIntercept(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDisallowParentIntercept", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        xd4.e eVar = this.f166798h;
        if (eVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDisallowParentIntercept", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = ((xd4.z) eVar).f453721b;
            if (expandableHeroSeekBarView != null) {
                expandableHeroSeekBarView.setShouldDisallowParentIntercept(z17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDisallowParentIntercept", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDisallowParentIntercept", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar
    public void setLivePhotoTagClickCallback(android.view.View.OnClickListener clickCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLivePhotoTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        kotlin.jvm.internal.o.g(clickCallback, "clickCallback");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = this.f166795e;
        if (snsLivePlayButton.getVisibility() == 0) {
            snsLivePlayButton.setOnClickListener(new com.tencent.mm.plugin.sns.ui.ee(this, clickCallback));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLivePhotoTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    public final void setVideoSeekBarVisible(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoSeekBarVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        xd4.e eVar = this.f166798h;
        if (eVar != null) {
            ((xd4.z) eVar).c(z17 ? 0 : 8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoSeekBarVisible", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
    }

    public SnsAlbumImgBottomBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eor, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.skj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = (com.tencent.mm.plugin.sns.ui.SnsLivePlayButton) findViewById;
        this.f166795e = snsLivePlayButton;
        snsLivePlayButton.post(new com.tencent.mm.plugin.sns.ui.de(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(snsLivePlayButton);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.skh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f166796f = findViewById2;
        this.f166797g = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.skl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483494sm5);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.tencent.mm.ui.dl.i(textView.getPaint());
    }

    public SnsAlbumImgBottomBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eor, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.skj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = (com.tencent.mm.plugin.sns.ui.SnsLivePlayButton) findViewById;
        this.f166795e = snsLivePlayButton;
        snsLivePlayButton.post(new com.tencent.mm.plugin.sns.ui.de(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(snsLivePlayButton);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.skh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f166796f = findViewById2;
        this.f166797g = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.skl);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483494sm5);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.tencent.mm.ui.dl.i(textView.getPaint());
    }
}
