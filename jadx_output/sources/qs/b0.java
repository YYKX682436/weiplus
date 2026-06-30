package qs;

/* loaded from: classes8.dex */
public class b0 extends com.tencent.mm.sdk.event.n {
    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.f20 f20Var;
        com.tencent.mm.autogen.events.WeChatFrontBackEvent weChatFrontBackEvent = (com.tencent.mm.autogen.events.WeChatFrontBackEvent) iEvent;
        z71.m wi6 = z71.m.wi();
        wi6.getClass();
        if (weChatFrontBackEvent != null && (f20Var = weChatFrontBackEvent.f54978g) != null) {
            wi6.f470534e = false;
            if (f20Var.f6630a == 7) {
                long j17 = wi6.f470533d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (java.lang.System.currentTimeMillis() - j17 <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                    wi6.f470534e = true;
                }
                wi6.f470533d = 0L;
            }
            if (f20Var.f6630a == 7) {
                long j18 = f20Var.f6631b;
                c81.b wi7 = c81.b.wi();
                wi7.requireAccountInitialized();
                com.tencent.mm.sdk.platformtools.o4 a17 = wi7.f39656d.a();
                long j19 = a17 == null ? 0L : a17.getLong("calendar_first_enter_app_time", 0L);
                int a18 = a81.a.a(j19);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (a18 != a81.a.a(java.lang.System.currentTimeMillis())) {
                    j19 = 0;
                }
                if (j19 <= 0) {
                    c81.b wi8 = c81.b.wi();
                    wi8.requireAccountInitialized();
                    wi8.f39656d.c("calendar_first_enter_app_time", j18);
                }
            }
        }
        return false;
    }
}
