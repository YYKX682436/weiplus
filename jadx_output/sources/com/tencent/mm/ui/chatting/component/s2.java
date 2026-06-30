package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.o.class)
/* loaded from: classes9.dex */
public class s2 extends com.tencent.mm.ui.chatting.component.a implements sb5.o {

    /* renamed from: e, reason: collision with root package name */
    public long f199896e;

    /* renamed from: f, reason: collision with root package name */
    public long f199897f;

    /* renamed from: g, reason: collision with root package name */
    public int f199898g;

    /* renamed from: h, reason: collision with root package name */
    public int f199899h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f199900i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f199901m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199902n = new com.tencent.mm.ui.chatting.component.ChattingAppBrandNotifyComponent$1(this, com.tencent.mm.app.a0.f53288d);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (n0()) {
            long elapsedRealtime = this.f199897f + ((android.os.SystemClock.elapsedRealtime() - this.f199896e) / 1000);
            this.f199897f = elapsedRealtime;
            java.util.HashSet hashSet = (java.util.HashSet) this.f199901m;
            int size = hashSet.size();
            java.lang.String str = tt0.a.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5("appbrand_notify_message").j()).f421775a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            m0(8, elapsedRealtime, size, str.replaceAll("[_a-zA-Z0-9]", "*"), this.f199898g, 0, android.os.SystemClock.elapsedRealtime(), 0, null, null, null);
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(this.f199899h + java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            android.database.Cursor b17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().b1("appbrand_notify_message", 0, this.f199898g);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAppBrandNotifyReportComponent", "[buildShowReportParams] cursor is null!");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                boolean z18 = false;
                int i17 = 0;
                while (b17.moveToNext()) {
                    try {
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.convertFrom(b17);
                        tt0.a a18 = tt0.a.a(f9Var.j());
                        if (f9Var.A0() != 2) {
                            i17++;
                            sb6.append(java.lang.String.format(java.util.Locale.US, "[%s:%s:%d];", a18.f421779e, a18.f421777c, java.lang.Integer.valueOf(i17)));
                            if (sb6.length() > 5000) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAppBrandNotifyReportComponent", "cut off exposed message");
                                sb6.setLength(sb6.length() - 1);
                                o0(a17, sb6.toString());
                                sb6.delete(0, sb6.length());
                                z18 = true;
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        b17.close();
                        throw th6;
                    }
                }
                b17.close();
                if (sb6.length() > 0) {
                    sb6.setLength(sb6.length() - 1);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString().trim())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAppBrandNotifyReportComponent", "empty msg show report content, skip report");
                } else {
                    if (!z18) {
                        a17 = null;
                    }
                    o0(a17, sb6.toString());
                }
            }
            hashSet.clear();
            this.f199900i = null;
            com.tencent.mm.plugin.appbrand.service.i5 i5Var = (com.tencent.mm.plugin.appbrand.service.i5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i5.class);
            if (i5Var != null) {
                com.tencent.mm.plugin.appbrand.app.d0 d0Var = (com.tencent.mm.plugin.appbrand.app.d0) i5Var;
                d0Var.f75047d = null;
                d0Var.f75048e = null;
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        if (n0()) {
            this.f199899h = gm0.j1.b().h();
            this.f199896e = android.os.SystemClock.elapsedRealtime();
            java.lang.System.currentTimeMillis();
            this.f199897f = 0L;
            this.f199898g = 0;
            ((java.util.HashSet) this.f199901m).clear();
        }
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (n0()) {
            this.f199898g = java.lang.Math.max(this.f199898g, i19 - i17);
        }
    }

    public final void m0(int i17, long j17, int i18, java.lang.String str, int i19, int i27, long j18, int i28, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19724, 1, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), 0, java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str2, str3, str4, null, 0, null, null, 0, null, null, this.f199900i);
    }

    public final boolean n0() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f198580d.x())) {
            return false;
        }
        return com.tencent.mm.storage.z3.B3(this.f198580d.x());
    }

    public final void o0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19724, 2, 0, 0, 0, 0, null, 0, 0, 0, null, null, null, null, 0, null, null, 0, str2, str, this.f199900i);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (n0()) {
            this.f199896e = android.os.SystemClock.elapsedRealtime();
            this.f199902n.alive();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (n0()) {
            this.f199897f += (android.os.SystemClock.elapsedRealtime() - this.f199896e) / 1000;
            this.f199902n.dead();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        int i17;
        int i18;
        com.tencent.mm.storage.f9 item;
        if (n0()) {
            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7("appbrand_notify_message") >= 2 && (item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).getItem(0)) != null && item.A0() == 2) {
                ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).I0(1);
            }
            com.tencent.mm.plugin.appbrand.service.i5 i5Var = (com.tencent.mm.plugin.appbrand.service.i5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i5.class);
            if (i5Var != null) {
                com.tencent.mm.plugin.appbrand.app.d0 d0Var = (com.tencent.mm.plugin.appbrand.app.d0) i5Var;
                this.f199900i = d0Var.f75047d;
                com.tencent.mm.plugin.appbrand.service.h5 h5Var = d0Var.f75048e;
                int i19 = h5Var.f88683b;
                i18 = h5Var.f88682a;
                i17 = i19;
            } else {
                i17 = 0;
                i18 = 0;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            m0(1, 0L, 0, null, 0, i17, android.os.SystemClock.elapsedRealtime(), i18, null, null, null);
        }
    }
}
