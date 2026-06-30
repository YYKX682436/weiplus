package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public abstract class ic {
    public static void a(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, msgId:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        long o17 = c01.w9.o(f9Var.Q0());
        if (o17 == f9Var.getCreateTime()) {
            o17++;
        }
        f9Var.e1(o17);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(f9Var.getMsgId(), f9Var.Q0());
        if (J0 == null || J0.field_msgInfoId != f9Var.getMsgId()) {
            com.tencent.mm.pluginsdk.model.app.u5.Ni().b(f9Var.Q0(), f9Var.getMsgId());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(true);
        sb6.append(", stack = ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        J0.field_status = 101;
        J0.field_offset = 0L;
        J0.field_lastModifyTime = java.lang.System.currentTimeMillis() / 1000;
        com.tencent.mm.pluginsdk.model.app.u5.wi().update(J0, new java.lang.String[0]);
        com.tencent.mm.pluginsdk.model.app.u5.Ni().d();
    }

    public static void b(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendCardMsg, msgId:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        g(f9Var);
    }

    public static void c(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendEmoji, msgId:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        com.tencent.mm.autogen.events.UploadEmojiMsgEvent uploadEmojiMsgEvent = new com.tencent.mm.autogen.events.UploadEmojiMsgEvent();
        uploadEmojiMsgEvent.f54930g.f6991a = f9Var;
        uploadEmojiMsgEvent.e();
    }

    public static void d(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendLocation, msgId:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        try {
            y80.p0 p0Var = (y80.p0) ((z80.h0) i95.n0.c(z80.h0.class));
            p0Var.getClass();
            if (!(j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigNewSendLocation()) != 0)) {
                g(f9Var);
                return;
            }
            p0Var.aj(f9Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "new resend location dispatched, msgId=" + f9Var.getMsgId());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ResendMsgLogic", e17, "new resend location failed", new java.lang.Object[0]);
        }
    }

    public static void e(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.autogen.events.SendImageMsgEvent sendImageMsgEvent = new com.tencent.mm.autogen.events.SendImageMsgEvent();
        long o17 = c01.w9.o(f9Var.Q0());
        com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendMsgImage, msgId:%d, time[%d - > %d]", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.getCreateTime()), java.lang.Long.valueOf(o17));
        if (o17 == f9Var.getCreateTime()) {
            o17++;
        }
        f9Var.e1(o17);
        j15.d dVar = new j15.d();
        dVar.fromXml(f9Var.j());
        r15.b l17 = dVar.l();
        if (l17 != null) {
            l17.o(null);
        }
        dVar.x(l17);
        f9Var.d1(dVar.toXml());
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        sendImageMsgEvent.f54751g.f7272a = f9Var;
        sendImageMsgEvent.e();
    }

    public static void f(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResendMsgLogic", "resendVoiceMsg, msgId:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        if (com.tencent.mm.storage.z3.I4(f9Var.Q0())) {
            com.tencent.mm.autogen.events.ResendVoiceRemindMsgEvent resendVoiceRemindMsgEvent = new com.tencent.mm.autogen.events.ResendVoiceRemindMsgEvent();
            resendVoiceRemindMsgEvent.f54708g.f8399a = f9Var;
            resendVoiceRemindMsgEvent.e();
        } else {
            com.tencent.mm.autogen.events.ResendVoiceMsgEvent resendVoiceMsgEvent = new com.tencent.mm.autogen.events.ResendVoiceMsgEvent();
            resendVoiceMsgEvent.f54707g.f8318a = f9Var;
            resendVoiceMsgEvent.e();
        }
    }

    public static void g(com.tencent.mm.storage.f9 f9Var) {
        long msgId = f9Var.getMsgId();
        if (msgId == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ResendMsgLogic", "sendMsgInternal failed msgId " + msgId);
            return;
        }
        if (f9Var.Q0().equals("medianote") && (c01.z1.p() & 16384) == 0) {
            return;
        }
        if (w11.t1.a(f9Var.Q0())) {
            w11.p1 p1Var = w11.p1.f442102d;
            w11.r1 r1Var = new w11.r1();
            r1Var.f442137l = p1Var;
            r1Var.f442132g = msgId;
            r1Var.e(f9Var.j());
            r1Var.g(f9Var.Q0());
            java.lang.String Q0 = f9Var.Q0();
            r1Var.f442126a = Q0 != null ? Q0 : "";
            r1Var.b();
            return;
        }
        w11.p1 p1Var2 = w11.p1.f442102d;
        w11.r1 r1Var2 = new w11.r1();
        r1Var2.f442137l = p1Var2;
        r1Var2.f442132g = msgId;
        r1Var2.e(f9Var.j());
        r1Var2.g(f9Var.Q0());
        java.lang.String Q02 = f9Var.Q0();
        r1Var2.f442126a = Q02 != null ? Q02 : "";
        r1Var2.f442130e = f9Var.getType();
        r1Var2.f442131f = 0;
        r1Var2.f442134i = 2;
        if (r1Var2.a().a()) {
            long o17 = c01.w9.o(f9Var.Q0());
            if (o17 == f9Var.getCreateTime()) {
                o17++;
            }
            f9Var.e1(o17);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ResendMsgLogic", "sendMsgInternal, doScene return false, directly mark msg to failed");
        f9Var.r1(5);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
        sendMsgFailEvent.f54753g.f7461a = f9Var;
        sendMsgFailEvent.e();
    }
}
