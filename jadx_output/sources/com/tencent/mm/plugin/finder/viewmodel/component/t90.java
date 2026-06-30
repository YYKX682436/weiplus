package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t90 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f136001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f136002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f136003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f136004g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(android.view.ViewGroup viewGroup, int i17, com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, yz5.l lVar) {
        super(1);
        this.f136001d = viewGroup;
        this.f136002e = i17;
        this.f136003f = finderVideoRecycler;
        this.f136004g = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da videoView = (cw2.da) obj;
        kotlin.jvm.internal.o.g(videoView, "videoView");
        android.view.ViewGroup viewGroup = this.f136001d;
        videoView.setTag(java.lang.Integer.valueOf(viewGroup.hashCode()));
        android.view.View videoView2 = videoView.getVideoView();
        int i17 = this.f136002e;
        if (i17 <= 0) {
            i17 = 0;
        }
        viewGroup.addView(videoView2, i17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        videoView.setTag(com.tencent.mm.R.id.g4z, java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
        this.f136003f.f133678n.put(java.lang.Integer.valueOf(viewGroup.hashCode()), null);
        this.f136004g.invoke(videoView);
        return jz5.f0.f302826a;
    }
}
