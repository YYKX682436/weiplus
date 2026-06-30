package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class r3 implements com.tencent.mm.plugin.multitalk.model.q3 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.model.g0 f150108a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f150109b;

    public r3() {
        java.lang.System.currentTimeMillis();
        this.f150109b = true;
    }

    public void a(boolean z17) {
        if (!z17 && this.f150108a == null) {
            this.f150108a = new com.tencent.mm.plugin.multitalk.model.g0(1920, 1080, 5, 3000, 0, "video/avc");
        }
        if (z17) {
            this.f150108a = null;
        }
    }
}
