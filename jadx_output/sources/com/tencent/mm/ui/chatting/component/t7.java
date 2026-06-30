package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class t7 implements com.tencent.mm.ui.chatting.component.ig {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f199969a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public long f199970b = 0;

    public java.util.List a(java.lang.String str) {
        synchronized (this.f199969a) {
            this.f199970b = 0L;
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        int d17 = p17 != null ? p17.d1() : 0;
        if (d17 < 1) {
            return null;
        }
        java.util.List y57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y5(str, d17);
        if (y57 != null && !y57.isEmpty()) {
            synchronized (this.f199969a) {
                if (!y57.isEmpty()) {
                    this.f199970b = ((com.tencent.mm.storage.f9) y57.get(y57.size() - 1)).getCreateTime();
                    y57.size();
                }
            }
        }
        return y57;
    }
}
