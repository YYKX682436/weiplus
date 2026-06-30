package com.tencent.mm.ui.conversation;

/* loaded from: classes10.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public long f208100a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f208101b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f208102c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f208103d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f208104e = 0;

    public java.lang.String toString() {
        try {
            return java.lang.String.format("total=%d, hit=%d [%.2f%%], reset,fill=%d, %d [%.2f%%], compare=%d [%.2f%%]", java.lang.Long.valueOf(this.f208100a), java.lang.Long.valueOf(this.f208101b), java.lang.Float.valueOf((((float) this.f208101b) * 100.0f) / ((float) this.f208100a)), java.lang.Long.valueOf(this.f208102c), java.lang.Long.valueOf(this.f208103d), java.lang.Float.valueOf((((float) this.f208102c) * 100.0f) / ((float) this.f208103d)), java.lang.Long.valueOf(this.f208104e), java.lang.Float.valueOf((((float) this.f208104e) * 100.0f) / ((float) this.f208100a)));
        } catch (java.lang.Throwable unused) {
            return "total=" + this.f208100a + "hit=" + this.f208101b + "clearWindow=" + this.f208102c + "fillWindow=" + this.f208103d + "compare=" + this.f208104e;
        }
    }
}
