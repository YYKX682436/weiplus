package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class ni implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f209425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.oi f209426e;

    public ni(com.tencent.mm.ui.oi oiVar, boolean z17) {
        this.f209426e = oiVar;
        this.f209425d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f209426e.f209478a.f197080q.f291824a = java.lang.Boolean.valueOf(this.f209425d);
        this.f209426e.f209478a.f197076m.edit().putBoolean("room_add_blacklist", this.f209425d).commit();
        ((com.tencent.mm.ui.base.preference.h0) this.f209426e.f209478a.f197070d).notifyDataSetChanged();
    }
}
