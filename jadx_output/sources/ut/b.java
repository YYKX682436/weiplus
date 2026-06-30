package ut;

/* loaded from: classes9.dex */
public final class b extends jm0.g implements qi3.a0, qi3.z, w65.o {

    /* renamed from: f, reason: collision with root package name */
    public static final ut.a f430592f = new ut.a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // qi3.a0
    public void L8(qi3.e0 event) {
        kotlin.jvm.internal.o.g(event, "event");
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = event.f363697g;
        java.lang.String a17 = msgIdTalker != null ? msgIdTalker.a() : null;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = event.f363697g;
        com.tencent.mm.storage.f9 k17 = e0Var.k(a17, msgIdTalker2 != null ? msgIdTalker2.f149480d : 0L);
        if (k17 != null && k17.n2()) {
            event.toString();
            int ordinal = event.f363691a.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                V6(k17, 8, true);
                return;
            }
            if (ordinal == 4) {
                V6(k17, 1, true);
                return;
            }
            if (ordinal != 7) {
                if (ordinal != 8) {
                    return;
                }
                V6(k17, 2, false);
                return;
            }
            int a18 = event.a();
            if (a18 == -510001) {
                V6(k17, 2, false);
            } else {
                if (a18 != 0) {
                    return;
                }
                V6(k17, 0, true);
            }
        }
    }

    @Override // w65.o
    public void P2(w65.p event) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(event, "event");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (event instanceof w65.l) {
            com.tencent.mm.plugin.msg.MsgIdTalker a17 = com.tencent.mm.plugin.msg.MsgIdTalker.f149478f.a(event.f443363b.Z0());
            com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(a17 != null ? a17.a() : null, a17 != null ? a17.f149480d : 0L);
            if (k17 != null && k17.n2()) {
                int ordinal = event.f443362a.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 4) {
                        int i17 = event.f443364c;
                        if (i17 != 0) {
                            switch (i17) {
                                case -600002:
                                case -600001:
                                    V6(k17, 4, true);
                                    break;
                            }
                        } else {
                            V6(k17, 0, true);
                        }
                    } else if (ordinal == 5 || ordinal == 6) {
                        V6(k17, 4, true);
                    }
                } else if (!((w65.l) event).f443361e) {
                    V6(k17, 3, true);
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileBubbleStatusFSC", "onChange event:" + event + ", exception:" + m524exceptionOrNullimpl);
            }
        }
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this);
        lm.r rVar = (lm.r) ((w65.n) i95.n0.c(w65.n.class));
        rVar.getClass();
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) rVar.f319329m).getValue(), null, new lm.f(rVar, this, null), 1, null);
    }

    @Override // jm0.g
    public void S6() {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this);
        lm.r rVar = (lm.r) ((w65.n) i95.n0.c(w65.n.class));
        rVar.getClass();
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) rVar.f319329m).getValue(), null, new lm.h(rVar, this, null), 1, null);
    }

    public final void T6(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.storage.i9 a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileBubbleStatusFSC", "markFileIfNeedClean msgId:" + f9Var.getMsgId() + ", svrId:" + f9Var.I0() + ", talker:" + f9Var.Q0() + ", isNeedClean:" + z17);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            a17 = tg3.p1.f419206a.a(f9Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (a17.f195035p == z17) {
            return;
        }
        a17.f195035p = z17;
        tg3.q1.a(a17, f9Var);
        m521constructorimpl = kotlin.Result.m521constructorimpl(a17);
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileBubbleStatusFSC", "markFileIfNeedClean failed, msgInfo:" + f9Var + ", isNeedClean:" + z17);
        }
    }

    public final void U6(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileBubbleStatusFSC", "notifyFileBubbleUpdate msgIdTalker:" + msgIdTalker);
        if (msgIdTalker != null) {
            com.tencent.mm.autogen.events.ChatMsgNotifyEvent chatMsgNotifyEvent = new com.tencent.mm.autogen.events.ChatMsgNotifyEvent();
            am.a2 a2Var = chatMsgNotifyEvent.f54036g;
            a2Var.f6117a = msgIdTalker.f149480d;
            a2Var.f6118b = msgIdTalker.a();
            chatMsgNotifyEvent.e();
        }
    }

    public final void V6(com.tencent.mm.storage.f9 msgInfo, int i17, boolean z17) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.storage.i9 a17;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            a17 = tg3.p1.f419206a.a(msgInfo);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (a17.f195034o != i17 || z17) {
            a17.f195034o = i17;
            tg3.q1.a(a17, msgInfo);
            U6(new com.tencent.mm.plugin.msg.MsgIdTalker(msgInfo.getMsgId(), msgInfo.Q0()));
            m521constructorimpl = kotlin.Result.m521constructorimpl(a17);
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileBubbleStatusFSC", "setFileBubbleStatus failed, msgInfo:" + msgInfo + ", fileBubbleStatus:" + i17 + ", exception:" + m524exceptionOrNullimpl);
            }
        }
    }
}
