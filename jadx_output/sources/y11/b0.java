package y11;

@j95.b
/* loaded from: classes12.dex */
public final class b0 extends jm0.o implements qx.j0 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f458804m = jz5.h.b(new y11.x(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f458805n = jz5.h.b(new y11.w(this));

    /* renamed from: o, reason: collision with root package name */
    public boolean f458806o;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Zi(y11.b0 r8, kotlin.coroutines.Continuation r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof y11.z
            if (r0 == 0) goto L16
            r0 = r9
            y11.z r0 = (y11.z) r0
            int r1 = r0.f458849g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f458849g = r1
            goto L1b
        L16:
            y11.z r0 = new y11.z
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f458847e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f458849g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            r5 = 0
            java.lang.String r6 = "MicroMsg.SendMsgService"
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f458846d
            y11.b0 r8 = (y11.b0) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto La4
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = "startSendLooper() called"
            com.tencent.mars.xlog.Log.i(r6, r9)
            boolean r9 = r8.f458806o
            if (r9 == 0) goto L4f
            java.lang.String r8 = "startSendLooper but isSending"
            com.tencent.mars.xlog.Log.i(r6, r8)
            goto Lb2
        L4f:
            r8.f458806o = r4
            y11.s r9 = new y11.s
            r2 = 0
            r9.<init>(r5, r4, r2)
        L57:
            boolean r2 = r9 instanceof y11.s
            if (r2 == 0) goto La7
            y11.s r9 = (y11.s) r9
            int r9 = r9.f458821a
            r0.f458846d = r8
            r0.f458849g = r4
            r8.getClass()
            java.lang.String r2 = "_ppcmsg startSendMsg"
            com.tencent.mars.xlog.Log.i(r6, r2)
            java.lang.Class<vg3.x3> r2 = vg3.x3.class
            lm0.a r2 = gm0.j1.s(r2)
            vg3.x3 r2 = (vg3.x3) r2
            com.tencent.mm.plugin.messenger.foundation.h2 r2 = (com.tencent.mm.plugin.messenger.foundation.h2) r2
            com.tencent.mm.storage.g9 r2 = r2.cj()
            java.util.List r9 = r2.c6(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "startSendMsg with lastSendingList, size="
            r2.<init>(r7)
            int r7 = r9.size()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r6, r2)
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L9c
            y11.t r9 = y11.t.f458822a
            goto La0
        L9c:
            java.lang.Object r9 = r8.aj(r9, r0)
        La0:
            if (r9 != r1) goto La4
            r3 = r1
            goto Lb2
        La4:
            y11.u r9 = (y11.u) r9
            goto L57
        La7:
            boolean r2 = r9 instanceof y11.t
            if (r2 == 0) goto L57
            java.lang.String r9 = "SendLooper stop"
            com.tencent.mars.xlog.Log.i(r6, r9)
            r8.f458806o = r5
        Lb2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y11.b0.Zi(y11.b0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x036d -> B:11:0x0389). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aj(java.util.List r44, kotlin.coroutines.Continuation r45) {
        /*
            Method dump skipped, instructions count: 1875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y11.b0.aj(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void bj(com.tencent.mm.storage.f9 f9Var) {
        f9Var.r1(5);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
        jx3.f.INSTANCE.idkeyStat(111L, 30L, 1L, true);
    }

    public final void cj(java.util.List list) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            bj((com.tencent.mm.storage.f9) list.get(i17));
        }
    }

    public final void fj(java.util.List list) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) list.get(i17);
            com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
            sendMsgFailEvent.f54753g.f7461a = f9Var;
            sendMsgFailEvent.e();
            f9Var.getMsgId();
        }
    }
}
