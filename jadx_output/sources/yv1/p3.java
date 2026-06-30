package yv1;

/* loaded from: classes12.dex */
public final class p3 extends com.tencent.mm.sdk.event.n {
    public p3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.DeleteMsgEvent event = (com.tencent.mm.autogen.events.DeleteMsgEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.y3 y3Var = event.f54086g;
        long j17 = y3Var.f8425a;
        java.lang.String str = y3Var.f8427c;
        if (j17 > 0) {
            if (str == null) {
                str = "talker-ignore";
            }
            mt1.b0.f331191a.r(j17, str);
        } else if (str != null) {
            yv1.a0.a(new yv1.n3(str));
        } else {
            yv1.a0.a(yv1.o3.f466131d);
        }
        yv1.f1 f1Var = yv1.g1.f466040p;
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.b0.f331202l = java.lang.System.currentTimeMillis();
        return true;
    }
}
