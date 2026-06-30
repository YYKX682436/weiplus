package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class TrackPointAnimAvatar extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f144722d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f144723e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f144724f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144725g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f144726h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f144727i;

    public TrackPointAnimAvatar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144722d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f144722d, com.tencent.mm.R.layout.d2_, this);
        this.f144723e = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f483042v1);
        this.f144724f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f483041v0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -0.5f);
        this.f144726h = translateAnimation;
        translateAnimation.setDuration(500L);
        this.f144726h.setFillAfter(true);
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -0.5f, 1, 0.0f);
        this.f144727i = translateAnimation2;
        translateAnimation2.setDuration(500L);
        this.f144727i.setFillAfter(true);
        this.f144726h.setAnimationListener(new com.tencent.mm.plugin.location.ui.impl.o2(this));
        this.f144727i.setAnimationListener(new com.tencent.mm.plugin.location.ui.impl.p2(this));
    }

    public void setUser(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f144725g = str;
        if (this.f144724f != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.f144724f, this.f144725g);
        }
    }

    public TrackPointAnimAvatar(android.content.Context context) {
        super(context);
        this.f144722d = context;
        a();
    }
}
