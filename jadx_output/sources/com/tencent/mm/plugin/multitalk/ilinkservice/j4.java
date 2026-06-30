package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class j4 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f149665a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f149666b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f149667c = -1;

    public boolean a() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f149665a)) {
            if ((android.os.SystemClock.elapsedRealtime() - (this.f149667c + 3600)) / 1000 < this.f149666b) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "ILinkSessionKey{sessionKey='" + this.f149665a + "', expireTicks=" + this.f149666b + ", initTicks=" + this.f149667c + '}';
    }
}
