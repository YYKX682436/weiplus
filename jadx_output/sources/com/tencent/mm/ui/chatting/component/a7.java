package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class a7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f198607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198609f;

    public a7(com.tencent.mm.ui.chatting.component.f7 f7Var, int i17, java.lang.String str, int i18) {
        this.f198607d = i17;
        this.f198608e = str;
        this.f198609f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f198608e;
        int i17 = this.f198607d;
        int wi6 = i17 == 2 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 0;
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
        int d17 = p17 == null ? 0 : p17.d1();
        com.tencent.mm.booter.h3 h3Var = com.tencent.mm.booter.h3.f63379q;
        if (h3Var.f63390k == null) {
            h3Var.f63390k = c01.z1.r();
        }
        if (h3Var.f63390k.equals(str)) {
            return;
        }
        com.tencent.mm.booter.g3 g3Var = h3Var.f63384e;
        if (g3Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "enterChattingUI, not close:%s", g3Var.f63364a);
            h3Var.a(h3Var.f63384e.f63364a);
        }
        com.tencent.mm.storage.j3 j3Var = h3Var.f63380a;
        if (j3Var.c(6, 0) == 0) {
            j3Var.h(4, com.tencent.mm.sdk.platformtools.t8.i1());
        }
        h3Var.f63381b.alive();
        h3Var.f63382c.alive();
        h3Var.f63383d.alive();
        com.tencent.mm.booter.g3 g3Var2 = new com.tencent.mm.booter.g3(h3Var);
        h3Var.f63384e = g3Var2;
        g3Var2.f63372i = h3Var.f63385f;
        h3Var.f63385f = 0;
        g3Var2.f63364a = str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        h3Var.f63388i = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.booter.g3 g3Var3 = h3Var.f63384e;
        g3Var3.f63365b = i17;
        int i18 = this.f198609f;
        g3Var3.f63367d = i18;
        g3Var3.f63368e = d17;
        g3Var3.f63369f = wi6;
        g3Var3.f63370g = com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "enter chattingUI: chatUser:%s----type:%d, notifyOpen:%d, unreadCount:%d, membercount:%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(wi6));
    }
}
