package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f144964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f144965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.PickPoi f144966f;

    public z(com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi, android.view.View view, android.content.Context context) {
        this.f144966f = pickPoi;
        this.f144964d = view;
        this.f144965e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f144964d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = ((int) ((this.f144966f.f144704f.getHeight() / 2.0d) + 0.5d)) + com.tencent.mm.ui.zk.a(this.f144965e, 20);
        view.setLayoutParams(layoutParams);
    }
}
