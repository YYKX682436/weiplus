package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class q9 implements oo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.u9 f209547a;

    public q9(com.tencent.mm.ui.u9 u9Var) {
        this.f209547a = u9Var;
    }

    public void a(java.lang.String str) {
        com.tencent.mm.ui.u9 u9Var = this.f209547a;
        java.lang.String str2 = u9Var.f211074a;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveTalkRoomTipsBarController", "liveTipsBarStorage notify, hostRoomId:%s", u9Var.f211074a);
        u9Var.f211075b = ((oo0.e) ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).wi()).D0(u9Var.f211074a);
        java.util.HashSet hashSet = com.tencent.mm.ui.u9.f211073d;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.r9((com.tencent.mm.ui.s9) it.next(), str));
            }
        }
    }
}
