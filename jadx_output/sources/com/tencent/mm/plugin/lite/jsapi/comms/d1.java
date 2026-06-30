package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.e1 f143547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f143548e;

    public d1(com.tencent.mm.plugin.lite.jsapi.comms.e1 e1Var, int i17) {
        this.f143547d = e1Var;
        this.f143548e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean wi6 = ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(24, 384);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).wi(a17, 24, false, 384);
        a17.putExtra("ftsneedkeyboard", !wi6);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsInitToSearch", true);
        a17.putExtra("ftsNeedShowCamera", false);
        j45.l.y(this.f143547d.c(), a17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13054, java.lang.Integer.valueOf(this.f143548e), 0, "");
    }
}
