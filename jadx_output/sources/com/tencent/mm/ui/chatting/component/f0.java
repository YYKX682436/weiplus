package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.component.f0 f199000d = new com.tencent.mm.ui.chatting.component.f0();

    public f0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        int i17 = x51.t1.f452086a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).wi(2147483647L);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "handleReadAndExpire batchSetReaded cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        long a17 = (long) x20.a.f451484a.a();
        com.tencent.mm.storage.f9 c17 = ow.n.f349259a.c();
        if (c17 == null || (str = java.lang.Long.valueOf(c17.getMsgId()).toString()) == null) {
            str = "";
        }
        if (str.length() > 0) {
            ow.x xVar = ow.x.f349273a;
            ((ku5.t0) ku5.t0.f312615d).A("BrandEcsNotifyTimerMgr");
            ((ku5.t0) ku5.t0.f312615d).h(new ow.w(a17, str), "BrandEcsNotifyTimerMgr");
            xVar.a(a17, str);
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsComponent", "handleReadAndExpire setExpire keepTime:" + a17 + ", latestNotifyMsgId:" + str);
        }
        return jz5.f0.f302826a;
    }
}
