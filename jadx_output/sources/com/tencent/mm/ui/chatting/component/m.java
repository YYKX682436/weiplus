package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f199454a;

    /* renamed from: b, reason: collision with root package name */
    public final long f199455b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199456c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f199457d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f199458e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f199459f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f199460g;

    /* renamed from: h, reason: collision with root package name */
    public final int f199461h;

    /* renamed from: i, reason: collision with root package name */
    public long f199462i;

    /* renamed from: j, reason: collision with root package name */
    public long f199463j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f199464k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f199465l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f199466m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f199467n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f199468o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f199469p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f199470q;

    public m(long j17, long j18, int i17, java.lang.String wxaMsgSenderUsername, java.lang.String appId, java.lang.String username, java.lang.String enterPath, int i18) {
        kotlin.jvm.internal.o.g(wxaMsgSenderUsername, "wxaMsgSenderUsername");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        this.f199454a = j17;
        this.f199455b = j18;
        this.f199456c = i17;
        this.f199457d = wxaMsgSenderUsername;
        this.f199458e = appId;
        this.f199459f = username;
        this.f199460g = enterPath;
        this.f199461h = i18;
        this.f199463j = -1L;
        this.f199470q = "";
    }

    public final long a() {
        if (0 < this.f199463j) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f199462i += currentTimeMillis - this.f199463j;
            this.f199463j = currentTimeMillis;
        }
        return this.f199462i;
    }

    public final void b(java.lang.Long l17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markEndExpose, msgId: " + this.f199454a);
        if (!this.f199466m) {
            if (0 < this.f199463j) {
                this.f199462i += (l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis()) - this.f199463j;
                this.f199463j = -1L;
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markEndExpose, already revoked or has not exposed");
    }

    public final void c(java.lang.Long l17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markStartExpose, msgId: " + this.f199454a);
        if (!this.f199466m) {
            if (!(0 < this.f199463j)) {
                this.f199463j = l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxaReportComponent", "markStartExpose, already revoked or exposed");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.component.m)) {
            return false;
        }
        com.tencent.mm.ui.chatting.component.m mVar = (com.tencent.mm.ui.chatting.component.m) obj;
        return this.f199454a == mVar.f199454a && this.f199455b == mVar.f199455b && this.f199456c == mVar.f199456c && kotlin.jvm.internal.o.b(this.f199457d, mVar.f199457d) && kotlin.jvm.internal.o.b(this.f199458e, mVar.f199458e) && kotlin.jvm.internal.o.b(this.f199459f, mVar.f199459f) && kotlin.jvm.internal.o.b(this.f199460g, mVar.f199460g) && this.f199461h == mVar.f199461h;
    }

    public int hashCode() {
        return (((((((((((((java.lang.Long.hashCode(this.f199454a) * 31) + java.lang.Long.hashCode(this.f199455b)) * 31) + java.lang.Integer.hashCode(this.f199456c)) * 31) + this.f199457d.hashCode()) * 31) + this.f199458e.hashCode()) * 31) + this.f199459f.hashCode()) * 31) + this.f199460g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f199461h);
    }

    public java.lang.String toString() {
        return "AppMsgWxaStatInfo(msgId=" + this.f199454a + ", wxaMsgId=" + this.f199455b + ", wxaMsgType=" + this.f199456c + ", wxaMsgSenderUsername='" + this.f199457d + "', appId='" + this.f199458e + "', username='" + this.f199459f + "', enterPath='" + this.f199460g + "', scene=" + this.f199461h + ", exposeTimePeriod=" + a() + ')';
    }
}
