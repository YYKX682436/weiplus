package ov;

@j95.b
/* loaded from: classes14.dex */
public class i0 extends i95.w implements pv.e0, pv.d0 {

    /* renamed from: d, reason: collision with root package name */
    public pv.f0 f349084d = null;

    public gp1.s Ai() {
        if (!((km0.c) gm0.j1.p().a()).a()) {
            return (com.tencent.mm.plugin.ball.service.r) com.tencent.mm.plugin.ball.service.r.f93212a.getValue();
        }
        jz5.g gVar = com.tencent.mm.plugin.ball.service.m.f93183c;
        return (com.tencent.mm.plugin.ball.service.m) com.tencent.mm.plugin.ball.service.m.f93183c.getValue();
    }

    public gp1.v Bi() {
        if (((km0.c) gm0.j1.p().a()).a()) {
            return com.tencent.mm.plugin.ball.service.s.H0();
        }
        synchronized (com.tencent.mm.plugin.ball.service.o4.class) {
            if (com.tencent.mm.plugin.ball.service.o4.f93192a == null) {
                synchronized (com.tencent.mm.plugin.ball.service.o4.class) {
                    com.tencent.mm.plugin.ball.service.o4.f93192a = new com.tencent.mm.plugin.ball.service.o4();
                }
            }
        }
        return com.tencent.mm.plugin.ball.service.o4.f93192a;
    }

    public boolean Di() {
        return Bi().Y();
    }

    public boolean wi() {
        return Bi().O();
    }
}
