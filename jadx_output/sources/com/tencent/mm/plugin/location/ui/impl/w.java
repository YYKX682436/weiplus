package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public abstract class w extends ab3.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f144909d;

    /* renamed from: e, reason: collision with root package name */
    public ab3.h f144910e;

    /* renamed from: f, reason: collision with root package name */
    public int f144911f = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f144912g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f144913h = 0.0f;

    public w(android.app.Activity activity) {
        this.f144909d = activity;
    }

    @Override // ab3.e
    public boolean b(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // ab3.e
    public void d() {
    }

    @Override // ab3.e
    public boolean g(int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    public android.view.View j(int i17) {
        return this.f144909d.findViewById(i17);
    }

    public android.content.Intent k() {
        return this.f144909d.getIntent();
    }

    public abstract void l(com.tencent.mapsdk.raster.model.LatLng latLng);

    public abstract void m();
}
