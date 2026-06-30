package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f134789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134790b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134791c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f134792d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134793e;

    /* renamed from: f, reason: collision with root package name */
    public int f134794f;

    /* renamed from: g, reason: collision with root package name */
    public final long f134795g;

    /* renamed from: h, reason: collision with root package name */
    public long f134796h;

    /* renamed from: i, reason: collision with root package name */
    public long f134797i;

    /* renamed from: j, reason: collision with root package name */
    public long f134798j;

    /* renamed from: k, reason: collision with root package name */
    public int f134799k;

    public j1(com.tencent.mm.protocal.protobuf.FinderObject feed, int i17, int i18, boolean z17, java.lang.String sessionId, int i19, long j17, long j18, long j19, long j27, int i27, kotlin.jvm.internal.i iVar) {
        long j28 = (i27 & 64) != 0 ? 0L : j17;
        long j29 = (i27 & 128) != 0 ? 0L : j18;
        long j37 = (i27 & 256) != 0 ? 0L : j19;
        long j38 = (i27 & 512) == 0 ? j27 : 0L;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f134789a = feed;
        this.f134790b = i17;
        this.f134791c = i18;
        this.f134792d = z17;
        this.f134793e = sessionId;
        this.f134794f = i19;
        this.f134795g = j28;
        this.f134796h = j29;
        this.f134797i = j37;
        this.f134798j = j38;
    }

    public final org.json.JSONObject a() {
        java.lang.String str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedId", pm0.v.u(this.f134789a.getId()));
        jSONObject.put("commentScene", java.lang.String.valueOf(this.f134790b));
        jSONObject.put("tabType", java.lang.String.valueOf(this.f134791c));
        jSONObject.put("fromPreload", java.lang.String.valueOf(this.f134792d));
        jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, java.lang.String.valueOf(this.f134793e));
        int i17 = this.f134794f;
        if (i17 == 0) {
            str = "None";
        } else if (i17 == 1) {
            str = "Dispatched";
        } else if (i17 == 2) {
            str = "Consumed";
        } else if (i17 == 3) {
            str = "Focused";
        } else if (i17 != 4) {
            str = "Unknown#" + i17;
        } else {
            str = "UnFocused";
        }
        jSONObject.put("status", str);
        jSONObject.put("dispatchTime", java.lang.String.valueOf(this.f134795g));
        jSONObject.put("consumeTime", java.lang.String.valueOf(this.f134796h));
        jSONObject.put("focusTime", java.lang.String.valueOf(this.f134797i));
        jSONObject.put("unFocusTime", java.lang.String.valueOf(this.f134798j));
        return jSONObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.j1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var = (com.tencent.mm.plugin.finder.viewmodel.component.j1) obj;
        return j1Var.f134789a.getId() == this.f134789a.getId() && j1Var.f134790b == this.f134790b && j1Var.f134791c == this.f134791c && kotlin.jvm.internal.o.b(j1Var.f134793e, this.f134793e) && j1Var.f134792d == this.f134792d;
    }

    public int hashCode() {
        return (((((((int) this.f134789a.getId()) * 31) + this.f134790b) * 31) + this.f134791c) * 31) + java.lang.Boolean.hashCode(this.f134792d);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FeedDispatchInfo](feedId=");
        sb6.append(pm0.v.u(this.f134789a.getId()));
        sb6.append(", commentScene=");
        sb6.append(this.f134790b);
        sb6.append(", tabType=");
        sb6.append(this.f134791c);
        sb6.append(", fromPreload=");
        sb6.append(this.f134792d);
        sb6.append(", sessionId=");
        sb6.append(this.f134793e);
        sb6.append(", status=");
        int i17 = this.f134794f;
        if (i17 == 0) {
            str = "None";
        } else if (i17 == 1) {
            str = "Dispatched";
        } else if (i17 == 2) {
            str = "Consumed";
        } else if (i17 == 3) {
            str = "Focused";
        } else if (i17 != 4) {
            str = "Unknown#" + i17;
        } else {
            str = "UnFocused";
        }
        sb6.append(str);
        sb6.append(", dispatchTime=");
        sb6.append(this.f134795g);
        sb6.append(", consumeTime=");
        sb6.append(this.f134796h);
        sb6.append(", focusTime=");
        sb6.append(this.f134797i);
        sb6.append(", unfocusTime=");
        sb6.append(this.f134798j);
        return sb6.toString();
    }
}
