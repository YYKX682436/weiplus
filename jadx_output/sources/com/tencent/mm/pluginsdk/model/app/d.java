package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class d extends dm.r {

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f188849y0 = dm.r.initAutoDBInfo(com.tencent.mm.pluginsdk.model.app.d.class);

    public d() {
        this.field_netTimes = 0L;
    }

    @Override // dm.r, l75.f0
    public l75.e0 getDBInfo() {
        return f188849y0;
    }

    public boolean t0() {
        long j17 = this.field_totalLen;
        return j17 > 0 && this.field_offset == j17;
    }
}
