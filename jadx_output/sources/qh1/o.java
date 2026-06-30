package qh1;

/* loaded from: classes9.dex */
public final class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean z17;
        boolean z18;
        com.tencent.mm.autogen.events.DyeingTemplateMsgReceiveEvent event = (com.tencent.mm.autogen.events.DyeingTemplateMsgReceiveEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        qh1.c cVar = qh1.c.f363419d;
        cVar.getClass();
        am.h4 h4Var = event.f54095g;
        java.lang.String Di = cVar.Di(h4Var.f6819a);
        boolean z19 = true;
        if (android.text.TextUtils.isEmpty(Di)) {
            z17 = false;
        } else {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.msgsubscription.voice.PlayVoiceData(java.lang.System.nanoTime(), Di, 0), p31.e.class, p31.a.f351448d);
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handSubscribeMsgVoiceBroadcast done");
        } else {
            i50.m Ai = cVar.Ai(h4Var.f6819a, h4Var.f6820b);
            if (Ai != null) {
                ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).Bi(Ai);
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handForceNotify done");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "handle game force notify");
                i50.m Bi = cVar.Bi(h4Var.f6821c, h4Var.f6820b);
                if (Bi != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "pre call force push service");
                    ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).Bi(Bi);
                } else {
                    z19 = false;
                }
                if (z19) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handGameForceNotify done");
                }
            }
        }
        return false;
    }
}
