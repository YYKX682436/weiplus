package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f181471a = jz5.h.b(com.tencent.mm.plugin.websearch.b0.f181458d);

    public final float a() {
        float q17 = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (q17 >= 1.4f) {
            return 1.15f;
        }
        if (q17 >= 1.125f || q17 >= 1.12f || q17 >= 1.1f) {
            return 1.1f;
        }
        float f17 = 1.0f;
        if (q17 < 1.0f) {
            f17 = 0.8f;
            if (q17 >= 0.8f) {
                return 0.9f;
            }
        }
        return f17;
    }
}
