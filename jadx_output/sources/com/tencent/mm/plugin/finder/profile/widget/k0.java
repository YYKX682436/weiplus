package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124591a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f124592b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f124593c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f124594d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.FinderDataLoader f124595e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f124596f;

    public k0(android.view.View header, androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f124591a = activity;
        this.f124592b = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.j0(header));
        this.f124593c = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.f0(this));
        this.f124594d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.e0(this));
        this.f124595e = new com.tencent.mm.plugin.finder.feed.model.FinderDataLoader(null, 1, null);
    }

    public final com.tencent.mm.plugin.finder.profile.view.FinderFollowMoreView a() {
        return (com.tencent.mm.plugin.finder.profile.view.FinderFollowMoreView) ((jz5.n) this.f124593c).getValue();
    }

    public final void b() {
        java.util.List list = this.f124596f;
        if (list == null || list.isEmpty()) {
            a().setVisibility(8);
            return;
        }
        jz5.g gVar = this.f124592b;
        android.widget.FrameLayout sendMsgBtn = ((vb2.f0) ((jz5.n) gVar).getValue()).W0;
        kotlin.jvm.internal.o.f(sendMsgBtn, "sendMsgBtn");
        android.widget.FrameLayout finderProfileFollowBtn = ((vb2.f0) ((jz5.n) gVar).getValue()).F;
        kotlin.jvm.internal.o.f(finderProfileFollowBtn, "finderProfileFollowBtn");
        android.widget.FrameLayout finderProfileEnterpriseBtn = ((vb2.f0) ((jz5.n) gVar).getValue()).f434599x;
        kotlin.jvm.internal.o.f(finderProfileEnterpriseBtn, "finderProfileEnterpriseBtn");
        if (sendMsgBtn.getVisibility() == 0 && finderProfileFollowBtn.getVisibility() == 0 && finderProfileEnterpriseBtn.getVisibility() == 0) {
            com.tencent.mm.plugin.finder.profile.view.FinderFollowMoreView a17 = a();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = a17.f124440f;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("arrowIv");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin = i65.a.h(a17.getContext(), com.tencent.mm.R.dimen.f479734dr);
        }
        a().setAlpha(0.0f);
        a().animate().alpha(1.0f).setDuration(200L).start();
        a().setVisibility(0);
    }
}
